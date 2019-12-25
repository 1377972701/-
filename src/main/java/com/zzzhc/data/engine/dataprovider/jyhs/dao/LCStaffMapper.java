package com.zzzhc.data.engine.dataprovider.jyhs.dao;

import com.zzzhc.data.engine.dataprovider.jyhs.entitybeet.LCStaff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface LCStaffMapper {
    /**
     *
     * @mbg.generated 2019-02-26
     */
    @Insert({
        "insert into lc_staff (ID, CompanyCode, ",
        "EndDate, InfoSource, ",
        "MergeMark, ClassfiedMethod, ",
        "TypeName, YoungestAge, ",
        "OldestAge, EmployeeSum, ",
        "RatioInSum, Statement, ",
        "XGRQ, JSID, TypeCode)",
        "values (#{id,jdbcType=BIGINT}, #{companycode,jdbcType=INTEGER}, ",
        "#{enddate,jdbcType=TIMESTAMP}, #{infosource,jdbcType=VARCHAR}, ",
        "#{mergemark,jdbcType=VARCHAR}, #{classfiedmethod,jdbcType=INTEGER}, ",
        "#{typename,jdbcType=VARCHAR}, #{youngestage,jdbcType=SMALLINT}, ",
        "#{oldestage,jdbcType=SMALLINT}, #{employeesum,jdbcType=INTEGER}, ",
        "#{ratioinsum,jdbcType=DECIMAL}, #{statement,jdbcType=VARCHAR}, ",
        "#{xgrq,jdbcType=TIMESTAMP}, #{jsid,jdbcType=BIGINT}, #{typecode,jdbcType=INTEGER})"
    })
    int insert(LCStaff record);

    /**
     *
     * @mbg.generated 2019-02-26
     */
    @InsertProvider(type=LCStaffSqlProvider.class, method="insertSelective")
    int insertSelective(LCStaff record);
}