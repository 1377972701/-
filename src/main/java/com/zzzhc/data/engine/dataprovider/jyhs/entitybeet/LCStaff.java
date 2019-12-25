package com.zzzhc.data.engine.dataprovider.jyhs.entitybeet;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * lc_staff
 */
@Entity(name = "lc_staff")
public class LCStaff {
    /**
     * ID
     */
    @Column(name = "ID")
    private Long id;

    /**
     * 公司代码
     */
    @Column(name = "CompanyCode")
    private Integer companycode;

    /**
     * 日期
     */
    @Column(name = "EndDate")
    private Date enddate;

    /**
     * 信息来源
     */
    @Column(name = "InfoSource")
    private String infosource;

    /**
     * 合并标志
     */
    @Column(name = "MergeMark")
    private String mergemark;

    /**
     * 分类方式
     */
    @Column(name = "ClassfiedMethod")
    private Integer classfiedmethod;

    /**
     * 类别名称
     */
    @Column(name = "TypeName")
    private String typename;

    /**
     * 最低年龄
     */
    @Column(name = "YoungestAge")
    private Short youngestage;

    /**
     * 最高年龄
     */
    @Column(name = "OldestAge")
    private Short oldestage;

    /**
     * 员工数量
     */
    @Column(name = "EmployeeSum")
    private Integer employeesum;

    /**
     * 占总数比例
     */
    @Column(name = "RatioInSum")
    private BigDecimal ratioinsum;

    /**
     * 备注说明
     */
    @Column(name = "Statement")
    private String statement;

    /**
     * 修改日期
     */
    @Column(name = "XGRQ")
    private Date xgrq;

    /**
     * JSID
     */
    @Column(name = "JSID")
    private Long jsid;

    /**
     * 分类代码
     */
    @Column(name = "TypeCode")
    private Integer typecode;

    /**
     * ID
     * @return ID ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 公司代码
     * @return CompanyCode 公司代码
     */
    public Integer getCompanycode() {
        return companycode;
    }

    /**
     * 公司代码
     * @param companycode 公司代码
     */
    public void setCompanycode(Integer companycode) {
        this.companycode = companycode;
    }

    /**
     * 日期
     * @return EndDate 日期
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 日期
     * @param enddate 日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * 信息来源
     * @return InfoSource 信息来源
     */
    public String getInfosource() {
        return infosource;
    }

    /**
     * 信息来源
     * @param infosource 信息来源
     */
    public void setInfosource(String infosource) {
        this.infosource = infosource == null ? null : infosource.trim();
    }

    /**
     * 合并标志
     * @return MergeMark 合并标志
     */
    public String getMergemark() {
        return mergemark;
    }

    /**
     * 合并标志
     * @param mergemark 合并标志
     */
    public void setMergemark(String mergemark) {
        this.mergemark = mergemark == null ? null : mergemark.trim();
    }

    /**
     * 分类方式
     * @return ClassfiedMethod 分类方式
     */
    public Integer getClassfiedmethod() {
        return classfiedmethod;
    }

    /**
     * 分类方式
     * @param classfiedmethod 分类方式
     */
    public void setClassfiedmethod(Integer classfiedmethod) {
        this.classfiedmethod = classfiedmethod;
    }

    /**
     * 类别名称
     * @return TypeName 类别名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 类别名称
     * @param typename 类别名称
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * 最低年龄
     * @return YoungestAge 最低年龄
     */
    public Short getYoungestage() {
        return youngestage;
    }

    /**
     * 最低年龄
     * @param youngestage 最低年龄
     */
    public void setYoungestage(Short youngestage) {
        this.youngestage = youngestage;
    }

    /**
     * 最高年龄
     * @return OldestAge 最高年龄
     */
    public Short getOldestage() {
        return oldestage;
    }

    /**
     * 最高年龄
     * @param oldestage 最高年龄
     */
    public void setOldestage(Short oldestage) {
        this.oldestage = oldestage;
    }

    /**
     * 员工数量
     * @return EmployeeSum 员工数量
     */
    public Integer getEmployeesum() {
        return employeesum;
    }

    /**
     * 员工数量
     * @param employeesum 员工数量
     */
    public void setEmployeesum(Integer employeesum) {
        this.employeesum = employeesum;
    }

    /**
     * 占总数比例
     * @return RatioInSum 占总数比例
     */
    public BigDecimal getRatioinsum() {
        return ratioinsum;
    }

    /**
     * 占总数比例
     * @param ratioinsum 占总数比例
     */
    public void setRatioinsum(BigDecimal ratioinsum) {
        this.ratioinsum = ratioinsum;
    }

    /**
     * 备注说明
     * @return Statement 备注说明
     */
    public String getStatement() {
        return statement;
    }

    /**
     * 备注说明
     * @param statement 备注说明
     */
    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    /**
     * 修改日期
     * @return XGRQ 修改日期
     */
    public Date getXgrq() {
        return xgrq;
    }

    /**
     * 修改日期
     * @param xgrq 修改日期
     */
    public void setXgrq(Date xgrq) {
        this.xgrq = xgrq;
    }

    /**
     * JSID
     * @return JSID JSID
     */
    public Long getJsid() {
        return jsid;
    }

    /**
     * JSID
     * @param jsid JSID
     */
    public void setJsid(Long jsid) {
        this.jsid = jsid;
    }

    /**
     * 分类代码
     * @return TypeCode 分类代码
     */
    public Integer getTypecode() {
        return typecode;
    }

    /**
     * 分类代码
     * @param typecode 分类代码
     */
    public void setTypecode(Integer typecode) {
        this.typecode = typecode;
    }
}