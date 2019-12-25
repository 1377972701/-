package com.zzzhc.data.engine.dataprovider.jyhs.dao;

import com.zzzhc.data.engine.dataprovider.jyhs.entitybeet.LCStaff;
import org.apache.ibatis.jdbc.SQL;

public class LCStaffSqlProvider {

    /**
     *
     * @mbg.generated 2019-02-26
     */
    public String insertSelective(LCStaff record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lc_staff");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCompanycode() != null) {
            sql.VALUES("CompanyCode", "#{companycode,jdbcType=INTEGER}");
        }
        
        if (record.getEnddate() != null) {
            sql.VALUES("EndDate", "#{enddate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInfosource() != null) {
            sql.VALUES("InfoSource", "#{infosource,jdbcType=VARCHAR}");
        }
        
        if (record.getMergemark() != null) {
            sql.VALUES("MergeMark", "#{mergemark,jdbcType=VARCHAR}");
        }
        
        if (record.getClassfiedmethod() != null) {
            sql.VALUES("ClassfiedMethod", "#{classfiedmethod,jdbcType=INTEGER}");
        }
        
        if (record.getTypename() != null) {
            sql.VALUES("TypeName", "#{typename,jdbcType=VARCHAR}");
        }
        
        if (record.getYoungestage() != null) {
            sql.VALUES("YoungestAge", "#{youngestage,jdbcType=SMALLINT}");
        }
        
        if (record.getOldestage() != null) {
            sql.VALUES("OldestAge", "#{oldestage,jdbcType=SMALLINT}");
        }
        
        if (record.getEmployeesum() != null) {
            sql.VALUES("EmployeeSum", "#{employeesum,jdbcType=INTEGER}");
        }
        
        if (record.getRatioinsum() != null) {
            sql.VALUES("RatioInSum", "#{ratioinsum,jdbcType=DECIMAL}");
        }
        
        if (record.getStatement() != null) {
            sql.VALUES("Statement", "#{statement,jdbcType=VARCHAR}");
        }
        
        if (record.getXgrq() != null) {
            sql.VALUES("XGRQ", "#{xgrq,jdbcType=TIMESTAMP}");
        }
        
        if (record.getJsid() != null) {
            sql.VALUES("JSID", "#{jsid,jdbcType=BIGINT}");
        }
        
        if (record.getTypecode() != null) {
            sql.VALUES("TypeCode", "#{typecode,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }
}