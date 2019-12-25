import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
 
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
 
/**
 * mybatis generator 自定义comment生成器.
 * 
 * @author yihui
 *
 */
public class MyCommentGenerator extends DefaultCommentGenerator {// implements
																	// CommentGenerator
																	// {
	/**
     * properties配置文件
     */
	private Properties properties;
    /**
     * properties配置文件
     */
	private Properties systemPro;
	 /**
     * 父类时间
     */
	private boolean suppressDate;
    /**
     * 父类所有注释
     */
	private boolean suppressAllComments;
	 /**
     * 当前时间
     */
	private String currentDateStr;
 
	public MyCommentGenerator() {
		super();
		properties = new Properties();
		systemPro = System.getProperties();
		suppressDate = false;
		suppressAllComments = false;
		currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
	}
	 /**
     * 给Java文件加注释，这个注释是在文件的顶部，也就是package上面。
     */
	public void addJavaFileComment(CompilationUnit compilationUnit) {
		// add no file level comments by default
		return;
	}
 
    /**
     * Mybatis的Mapper.xml文件里面的注释
     */
	public void addComment(XmlElement xmlElement) {
		return;
	}
    /**
     * 为调用此方法作为根元素的第一个子节点添加注释。
     */
	public void addRootComment(XmlElement rootElement) {
		// add no document level comments by default
		return;
	}
 
	public void addConfigurationProperties(Properties properties) {
		this.properties.putAll(properties);
 
		suppressDate = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
 
		suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
	}
 
	/**
    *
    *@Title addJavadocTag
    *@Description: 此方法为其添加了自定义javadoc标签。
    *@Author fendo
    *@Date 2019年1月8日 下午3:49:05
    *@param javaElement
    *@param markAsDoNotDelete
    *@throws
    */
	protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
		javaElement.addJavaDocLine(" *");
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(MergeConstants.NEW_ELEMENT_TAG);
		if (markAsDoNotDelete) {
			sb.append(" do_not_delete_during_merge");
		}
		String s = getDateString();
		if (s != null) {
			sb.append(' ');
			sb.append(s);
		}
		javaElement.addJavaDocLine(sb.toString());
	}
 
	/**
	 * This method returns a formated date string to include in the Javadoc tag
	 * and XML comments. You may return null if you do not want the date in
	 * these documentation elements.
	 * 
	 * @return a string representing the current timestamp, or null
	 */
	protected String getDateString() {
		String result = null;
		if (!suppressDate) {
			result = currentDateStr;
		}
		return result;
	}
 
    /**
     * Java类的类注释
     */
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		innerClass.addJavaDocLine("/**");
		sb.append(" * ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append(" ");
		sb.append(getDateString());
		innerClass.addJavaDocLine(sb.toString());
		innerClass.addJavaDocLine(" */");
	}
    /**
     * 为枚举添加注释
     */
	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
 
		StringBuilder sb = new StringBuilder();
 
		innerEnum.addJavaDocLine("/**");
		// addJavadocTag(innerEnum, false);
		sb.append(" * ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		innerEnum.addJavaDocLine(sb.toString());
		innerEnum.addJavaDocLine(" */");
	}
    /**
     * 为字段添加注释
     */
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
 
		StringBuilder sb = new StringBuilder();
 
		field.addJavaDocLine("/**");
		sb.append(" * ");
		sb.append(introspectedColumn.getRemarks());
		field.addJavaDocLine(sb.toString());
 
		// addJavadocTag(field, false);
 
		field.addJavaDocLine(" */");
 
		// field.addAnnotation("@Size(min = 0, max = " +
		// introspectedColumn.getLength() + " , message =
		// \"长度必须在{min}和{max}之间\")");
		// field.addAnnotation("@NotNull"); if
		// (introspectedColumn.isStringColumn()) {
		// topLevelClass.addImportedType("javax.validation.constraints.Size");
		// field.addAnnotation("@Size(min = 0, max = " +
		// introspectedColumn.getLength() + " , message =
		// \"长度必须在{min}和{max}之间\")"); }
		List<IntrospectedColumn> primaryKeyColumns = introspectedTable.getPrimaryKeyColumns();
		for (IntrospectedColumn col : primaryKeyColumns) {
			if (col.getActualColumnName().equals(introspectedColumn.getActualColumnName())) {
				field.addAnnotation("@Id");
			}
		}
		field.addAnnotation("@Column(name = \"" + introspectedColumn.getActualColumnName() + "\")");
	}
    /**
     * Java属性注释
     */
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
 
		StringBuilder sb = new StringBuilder();
 
		field.addJavaDocLine("/**");
		sb.append(" * ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		field.addJavaDocLine(sb.toString());
		field.addJavaDocLine(" */");
	}
    /**
     * 普通方法的注释，这里主要是XXXMapper.java里面的接口方法的注释
     */
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		 method.addJavaDocLine("/**");
		 addJavadocTag(method, false);
		 method.addJavaDocLine(" */");
	}
	 /**
     * 给getter方法加注释
     */
	public void addGetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
 
		method.addJavaDocLine("/**");
 
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString());
 
		sb.setLength(0);
		sb.append(" * @return ");
		sb.append(introspectedColumn.getActualColumnName());
		sb.append(" ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString());
 
		// addJavadocTag(method, false);
 
		method.addJavaDocLine(" */");
	}
    /**
     * 给setter方法加注释
     */
	public void addSetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
 
		method.addJavaDocLine("/**");
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString());
 
		Parameter parm = method.getParameters().get(0);
		sb.setLength(0);
		sb.append(" * @param ");
		sb.append(parm.getName());
		sb.append(" ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString());
 
		// addJavadocTag(method, false);
 
		method.addJavaDocLine(" */");
	}
    /**
     * 为类添加注释
     */
	@Deprecated
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
 
	}
    /**
     * 为模型类添加注释
     */
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		topLevelClass.addImportedType("javax.persistence.Column");
		topLevelClass.addImportedType("javax.persistence.Id");
		topLevelClass.addImportedType("javax.persistence.Entity");
		//topLevelClass.addImportedType("org.apache.ibatis.type.Alias");
 
		if (suppressAllComments) {
			return;
		}
 
		StringBuilder sb = new StringBuilder();
 
		topLevelClass.addJavaDocLine("/**");
		sb.append(" * ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		topLevelClass.addJavaDocLine(sb.toString());
 
		sb.setLength(0);
		sb.append(" * @author ");
		sb.append(systemPro.getProperty("user.name"));
		sb.append(" ");
		sb.append(currentDateStr);
 
		// addJavadocTag(innerClass, markAsDoNotDelete);
 
		topLevelClass.addJavaDocLine(" */");
		topLevelClass.addAnnotation("@Entity(name = \"" + introspectedTable.getFullyQualifiedTable() + "\")");
/*		topLevelClass.addAnnotation("@Alias(\""
				+ toLowerCaseFirstOne(introspectedTable.getTableConfiguration().getDomainObjectName()) + "\")");*/
	}
 
	// 首字母转小写
	public static String toLowerCaseFirstOne(String s) {
		if (Character.isLowerCase(s.charAt(0)))
			return s;
		else
			return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
	}
 
	public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable,
			Set<FullyQualifiedJavaType> imports) {
		System.out.println(method.getName());
 
	}
 
	public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
		System.out.println(method.getName());
 
	}
 
	public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable,
			Set<FullyQualifiedJavaType> imports) {
		System.out.println(field.getName());
 
	}
 
	public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
		System.out.println(field.getName());
		field.addAnnotation("@Column(name = \"" + field.getName() + "\")");
	}
 
	public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable,
			Set<FullyQualifiedJavaType> imports) {
		System.out.println(innerClass);
	}
}
