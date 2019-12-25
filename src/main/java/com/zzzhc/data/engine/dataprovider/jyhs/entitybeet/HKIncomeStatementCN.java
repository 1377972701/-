package com.zzzhc.data.engine.dataprovider.jyhs.entitybeet;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * hk_incomestatementcn
 */
@Entity(name = "hk_incomestatementcn")
public class HKIncomeStatementCN {
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
     * 信息发布日期
     */
    @Column(name = "InfoPublDate")
    private Date infopubldate;

    /**
     * 信息来源
     */
    @Column(name = "InfoSource")
    private String infosource;

    /**
     * 日期
     */
    @Column(name = "EndDate")
    private Date enddate;

    /**
     * 日期标志
     */
    @Column(name = "PeriodMark")
    private Integer periodmark;

    /**
     * 财政年度
     */
    @Column(name = "FiscalYear")
    private Date fiscalyear;

    /**
     * 企业性质
     */
    @Column(name = "CompanyNature")
    private Integer companynature;

    /**
     * 备注说明
     */
    @Column(name = "Mark")
    private Integer mark;

    /**
     * 货币单位
     */
    @Column(name = "CurrencyUnit")
    private Integer currencyunit;

    /**
     * 一、营业总收入
     */
    @Column(name = "TotOpeRev")
    private BigDecimal totoperev;

    /**
     * 营业收入
     */
    @Column(name = "OpeRev")
    private BigDecimal operev;

    /**
     * 利息净收入
     */
    @Column(name = "NetIntInc")
    private BigDecimal netintinc;

    /**
     * 其中:利息收入
     */
    @Column(name = "IntInc")
    private BigDecimal intinc;

    /**
     * 其中:利息支出
     */
    @Column(name = "IntExpense")
    private BigDecimal intexpense;

    /**
     * 手续费及佣金净收入
     */
    @Column(name = "NetComInc")
    private BigDecimal netcominc;

    /**
     * 其中:手续费及佣金收入(元)
     */
    @Column(name = "ComIncome")
    private BigDecimal comincome;

    /**
     * 其中:手续费及佣金支出(元)
     */
    @Column(name = "ComExpense")
    private BigDecimal comexpense;

    /**
     * 其中:代理买卖证券业务净收入
     */
    @Column(name = "NetProSecuInc")
    private BigDecimal netprosecuinc;

    /**
     * 其中:证券承销业务净收入
     */
    @Column(name = "NetSubSecuInc")
    private BigDecimal netsubsecuinc;

    /**
     * 其中:受托客户资产管理业务净收入
     */
    @Column(name = "NetTrustInc")
    private BigDecimal nettrustinc;

    /**
     * 已赚保费
     */
    @Column(name = "PremiEarned")
    private BigDecimal premiearned;

    /**
     * 保险业务收入
     */
    @Column(name = "PremiIncome")
    private BigDecimal premiincome;

    /**
     * 其中:分保费收入
     */
    @Column(name = "ReinIncome")
    private BigDecimal reinincome;

    /**
     * 减:分出保费(元)
     */
    @Column(name = "Reinsurance")
    private BigDecimal reinsurance;

    /**
     * 减:提取未到期责任准备金
     */
    @Column(name = "UneaPremRes")
    private BigDecimal uneapremres;

    /**
     * 其他业务收入
     */
    @Column(name = "OtherOpeRev")
    private BigDecimal otheroperev;

    /**
     * 营业收入特殊项目
     */
    @Column(name = "SpeItemsOR")
    private BigDecimal speitemsor;

    /**
     * 营业收入调整项目
     */
    @Column(name = "AdjItemsOR")
    private BigDecimal adjitemsor;

    /**
     * 二、营业总成本
     */
    @Column(name = "TotOpeCost")
    private BigDecimal totopecost;

    /**
     * 营业支出
     */
    @Column(name = "OpeCost")
    private BigDecimal opecost;

    /**
     * 退保金
     */
    @Column(name = "RefPrem")
    private BigDecimal refprem;

    /**
     * 赔付支出
     */
    @Column(name = "CompExpense")
    private BigDecimal compexpense;

    /**
     * 减:摊回赔付支出
     */
    @Column(name = "AmorExpense")
    private BigDecimal amorexpense;

    /**
     * 提取保险责任准备金
     */
    @Column(name = "PremReserve")
    private BigDecimal premreserve;

    /**
     * 减:摊回保险责任准备金
     */
    @Column(name = "AmorPremRes")
    private BigDecimal amorpremres;

    /**
     * 保单红利支出
     */
    @Column(name = "PolDivPayout")
    private BigDecimal poldivpayout;

    /**
     * 分保费用
     */
    @Column(name = "ReinCost")
    private BigDecimal reincost;

    /**
     * 业务及管理费
     */
    @Column(name = "OpeAndAdmExp")
    private BigDecimal opeandadmexp;

    /**
     * 减:摊回分保费用
     */
    @Column(name = "AmorReinCost")
    private BigDecimal amorreincost;

    /**
     * 保险手续费及佣金支出
     */
    @Column(name = "InsComExpense")
    private BigDecimal inscomexpense;

    /**
     * 其他业务成本
     */
    @Column(name = "OtherOpeCost")
    private BigDecimal otheropecost;

    /**
     * 减:营业成本
     */
    @Column(name = "OpeaCost")
    private BigDecimal opeacost;

    /**
     * 营业税费/营业税金及附加
     */
    @Column(name = "OpeTaxSurcha")
    private BigDecimal opetaxsurcha;

    /**
     * 销售费用
     */
    @Column(name = "OpeExpense")
    private BigDecimal opeexpense;

    /**
     * 管理费用
     */
    @Column(name = "AdmExpense")
    private BigDecimal admexpense;

    /**
     * 财务费用
     */
    @Column(name = "FinExpense")
    private BigDecimal finexpense;

    /**
     * 资产减值损失
     */
    @Column(name = "AssetImpLoss")
    private BigDecimal assetimploss;

    /**
     * 营业支出特殊项目
     */
    @Column(name = "SpeItemsOP")
    private BigDecimal speitemsop;

    /**
     * 营业支出调整项目
     */
    @Column(name = "AdjItemsOP")
    private BigDecimal adjitemsop;

    /**
     * 加:公允价值变动净收益
     */
    @Column(name = "FairValChaInc")
    private BigDecimal fairvalchainc;

    /**
     * 加:投资净收益
     */
    @Column(name = "InvInc")
    private BigDecimal invinc;

    /**
     * 其中:对联营合营企业的投资收益
     */
    @Column(name = "InvIncAsso")
    private BigDecimal invincasso;

    /**
     * 汇兑收益
     */
    @Column(name = "ExcIncome")
    private BigDecimal excincome;

    /**
     * 加:影响营业利润的其他科目
     */
    @Column(name = "OtherItemsEffOP")
    private BigDecimal otheritemseffop;

    /**
     * 加:影响营业利润的调整项目
     */
    @Column(name = "AdjItemsEffOP")
    private BigDecimal adjitemseffop;

    /**
     * 三、营业利润
     */
    @Column(name = "OpeProfit")
    private BigDecimal opeprofit;

    /**
     * 加:营业外收入
     */
    @Column(name = "NonopeIncome")
    private BigDecimal nonopeincome;

    /**
     * 其中:非流动资产处置净利得
     */
    @Column(name = "NonCurAsDEarn")
    private BigDecimal noncurasdearn;

    /**
     * 减:营业外支出
     */
    @Column(name = "NonopeExpense")
    private BigDecimal nonopeexpense;

    /**
     * 其中:非流动资产处置净损失
     */
    @Column(name = "NonCurAssDLoss")
    private BigDecimal noncurassdloss;

    /**
     * 加:影响利润总额的其他科目
     */
    @Column(name = "OtherItemsEffTP")
    private BigDecimal otheritemsefftp;

    /**
     * 加:影响利润总额的调整项目
     */
    @Column(name = "AdjItemsEffTP")
    private BigDecimal adjitemsefftp;

    /**
     * 利润总额(元)
     */
    @Column(name = "TotalProfit")
    private BigDecimal totalprofit;

    /**
     * 减:所得税
     */
    @Column(name = "IncTaxCost")
    private BigDecimal inctaxcost;

    /**
     * 加:未确认的投资损失
     */
    @Column(name = "UncerInvLosses")
    private BigDecimal uncerinvlosses;

    /**
     * 加:影响净利润的其他科目
     */
    @Column(name = "OtherItemsEffNP")
    private BigDecimal otheritemseffnp;

    /**
     * 加:影响净利润的调整项目
     */
    @Column(name = "AdjItemsEffNP")
    private BigDecimal adjitemseffnp;

    /**
     * 四、净利润(元)
     */
    @Column(name = "NetProfit")
    private BigDecimal netprofit;

    /**
     * 归属于母公司所有者的净利润
     */
    @Column(name = "NPPCompOwners")
    private BigDecimal nppcompowners;

    /**
     * 少数股东损益
     */
    @Column(name = "MinoProfit")
    private BigDecimal minoprofit;

    /**
     * 加:影响母公司净利润的特殊项目
     */
    @Column(name = "OthItemsEffNPP")
    private BigDecimal othitemseffnpp;

    /**
     * 加:影响母公司净利润的调整项目
     */
    @Column(name = "AdjItemsEffNPP")
    private BigDecimal adjitemseffnpp;

    /**
     * 五、其他综合收益的税后净额(元)
     */
    @Column(name = "OCIAfterTax")
    private BigDecimal ociaftertax;

    /**
     * 归属于母公司所有者的其他综合收益的税后净额
     */
    @Column(name = "OCIATPComOWNR")
    private BigDecimal ociatpcomownr;

    /**
     * (一)以后不能重分类进损益表的其他综合收益(元)
     */
    @Column(name = "OCINotInIS")
    private BigDecimal ocinotinis;

    /**
     * 1.1重新计量设定收益计划净负债或净资产的变动(元)
     */
    @Column(name = "OCIReMearsure")
    private BigDecimal ociremearsure;

    /**
     * 1.2权益法下在被投资单位不能重分类进损益表的其他综合收益中享有的份额(元)
     */
    @Column(name = "OCIEquitNotInIS")
    private BigDecimal ociequitnotinis;

    /**
     * (二)以后将重分类进损益表的其他综合收益(元)
     */
    @Column(name = "OCIInIS")
    private BigDecimal ociinis;

    /**
     * 2.1权益法下在被投资单位以后将重分类进损益表的其他综合收益中享有的份额(元)
     */
    @Column(name = "OCIEquityInIS")
    private BigDecimal ociequityinis;

    /**
     * 2.2可供出售金融资产公允价值变动损益(元)
     */
    @Column(name = "OCIFairValue")
    private BigDecimal ocifairvalue;

    /**
     * 2.3持有至到期投资重分类为可供出售金融资产损益(元)
     */
    @Column(name = "OCIToMaturityFA")
    private BigDecimal ocitomaturityfa;

    /**
     * 2.4现金流量套期损益的有效部分(元)
     */
    @Column(name = "OCICFLoss")
    private BigDecimal ocicfloss;

    /**
     * 2.5外币财务报表折算差额(元)
     */
    @Column(name = "OCIFGNCurFSA")
    private BigDecimal ocifgncurfsa;

    /**
     * 2.6其他(以后能重分类进损益表的其他综合收益)(元)
     */
    @Column(name = "OCIOthers")
    private BigDecimal ociothers;

    /**
     * 归属于少数股东的其他综合收益的税后净额(元)
     */
    @Column(name = "OCIATMinorOwner")
    private BigDecimal ociatminorowner;

    /**
     * 加:影响综合收益总额的调整项目
     */
    @Column(name = "AdjItemsEffCI")
    private BigDecimal adjitemseffci;

    /**
     * 七、综合收益总额
     */
    @Column(name = "TotCompoIncome")
    private BigDecimal totcompoincome;

    /**
     * 归属于母公司所有者的综合收益总额
     */
    @Column(name = "CIPCompOwners")
    private BigDecimal cipcompowners;

    /**
     * 归属于少数股东的综合收益总额
     */
    @Column(name = "CIMinoOwners")
    private BigDecimal ciminoowners;

    /**
     * 加:影响母公司综合收益总额的调整项目
     */
    @Column(name = "AdjItemsEffPCI")
    private BigDecimal adjitemseffpci;

    /**
     * 基本每股收益(元/股)
     */
    @Column(name = "BasicEPS")
    private BigDecimal basiceps;

    /**
     * 稀释每股收益(元/股)
     */
    @Column(name = "DilutedEPS")
    private BigDecimal dilutedeps;

    /**
     * 更新时间
     */
    @Column(name = "UpdateTime")
    private Date updatetime;

    /**
     * JSID
     */
    @Column(name = "JSID")
    private Long jsid;

    /**
     * 信息来源代码
     */
    @Column(name = "InfoSourceCode")
    private Integer infosourcecode;

    /**
     * 开始日期
     */
    @Column(name = "BeginDate")
    private Date begindate;

    /**
     * 会计准则
     */
    @Column(name = "AccountingStandards")
    private Integer accountingstandards;

    /**
     * 聚源转换标识
     */
    @Column(name = "Gmark")
    private Integer gmark;

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
     * 信息发布日期
     * @return InfoPublDate 信息发布日期
     */
    public Date getInfopubldate() {
        return infopubldate;
    }

    /**
     * 信息发布日期
     * @param infopubldate 信息发布日期
     */
    public void setInfopubldate(Date infopubldate) {
        this.infopubldate = infopubldate;
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
     * 日期标志
     * @return PeriodMark 日期标志
     */
    public Integer getPeriodmark() {
        return periodmark;
    }

    /**
     * 日期标志
     * @param periodmark 日期标志
     */
    public void setPeriodmark(Integer periodmark) {
        this.periodmark = periodmark;
    }

    /**
     * 财政年度
     * @return FiscalYear 财政年度
     */
    public Date getFiscalyear() {
        return fiscalyear;
    }

    /**
     * 财政年度
     * @param fiscalyear 财政年度
     */
    public void setFiscalyear(Date fiscalyear) {
        this.fiscalyear = fiscalyear;
    }

    /**
     * 企业性质
     * @return CompanyNature 企业性质
     */
    public Integer getCompanynature() {
        return companynature;
    }

    /**
     * 企业性质
     * @param companynature 企业性质
     */
    public void setCompanynature(Integer companynature) {
        this.companynature = companynature;
    }

    /**
     * 备注说明
     * @return Mark 备注说明
     */
    public Integer getMark() {
        return mark;
    }

    /**
     * 备注说明
     * @param mark 备注说明
     */
    public void setMark(Integer mark) {
        this.mark = mark;
    }

    /**
     * 货币单位
     * @return CurrencyUnit 货币单位
     */
    public Integer getCurrencyunit() {
        return currencyunit;
    }

    /**
     * 货币单位
     * @param currencyunit 货币单位
     */
    public void setCurrencyunit(Integer currencyunit) {
        this.currencyunit = currencyunit;
    }

    /**
     * 一、营业总收入
     * @return TotOpeRev 一、营业总收入
     */
    public BigDecimal getTotoperev() {
        return totoperev;
    }

    /**
     * 一、营业总收入
     * @param totoperev 一、营业总收入
     */
    public void setTotoperev(BigDecimal totoperev) {
        this.totoperev = totoperev;
    }

    /**
     * 营业收入
     * @return OpeRev 营业收入
     */
    public BigDecimal getOperev() {
        return operev;
    }

    /**
     * 营业收入
     * @param operev 营业收入
     */
    public void setOperev(BigDecimal operev) {
        this.operev = operev;
    }

    /**
     * 利息净收入
     * @return NetIntInc 利息净收入
     */
    public BigDecimal getNetintinc() {
        return netintinc;
    }

    /**
     * 利息净收入
     * @param netintinc 利息净收入
     */
    public void setNetintinc(BigDecimal netintinc) {
        this.netintinc = netintinc;
    }

    /**
     * 其中:利息收入
     * @return IntInc 其中:利息收入
     */
    public BigDecimal getIntinc() {
        return intinc;
    }

    /**
     * 其中:利息收入
     * @param intinc 其中:利息收入
     */
    public void setIntinc(BigDecimal intinc) {
        this.intinc = intinc;
    }

    /**
     * 其中:利息支出
     * @return IntExpense 其中:利息支出
     */
    public BigDecimal getIntexpense() {
        return intexpense;
    }

    /**
     * 其中:利息支出
     * @param intexpense 其中:利息支出
     */
    public void setIntexpense(BigDecimal intexpense) {
        this.intexpense = intexpense;
    }

    /**
     * 手续费及佣金净收入
     * @return NetComInc 手续费及佣金净收入
     */
    public BigDecimal getNetcominc() {
        return netcominc;
    }

    /**
     * 手续费及佣金净收入
     * @param netcominc 手续费及佣金净收入
     */
    public void setNetcominc(BigDecimal netcominc) {
        this.netcominc = netcominc;
    }

    /**
     * 其中:手续费及佣金收入(元)
     * @return ComIncome 其中:手续费及佣金收入(元)
     */
    public BigDecimal getComincome() {
        return comincome;
    }

    /**
     * 其中:手续费及佣金收入(元)
     * @param comincome 其中:手续费及佣金收入(元)
     */
    public void setComincome(BigDecimal comincome) {
        this.comincome = comincome;
    }

    /**
     * 其中:手续费及佣金支出(元)
     * @return ComExpense 其中:手续费及佣金支出(元)
     */
    public BigDecimal getComexpense() {
        return comexpense;
    }

    /**
     * 其中:手续费及佣金支出(元)
     * @param comexpense 其中:手续费及佣金支出(元)
     */
    public void setComexpense(BigDecimal comexpense) {
        this.comexpense = comexpense;
    }

    /**
     * 其中:代理买卖证券业务净收入
     * @return NetProSecuInc 其中:代理买卖证券业务净收入
     */
    public BigDecimal getNetprosecuinc() {
        return netprosecuinc;
    }

    /**
     * 其中:代理买卖证券业务净收入
     * @param netprosecuinc 其中:代理买卖证券业务净收入
     */
    public void setNetprosecuinc(BigDecimal netprosecuinc) {
        this.netprosecuinc = netprosecuinc;
    }

    /**
     * 其中:证券承销业务净收入
     * @return NetSubSecuInc 其中:证券承销业务净收入
     */
    public BigDecimal getNetsubsecuinc() {
        return netsubsecuinc;
    }

    /**
     * 其中:证券承销业务净收入
     * @param netsubsecuinc 其中:证券承销业务净收入
     */
    public void setNetsubsecuinc(BigDecimal netsubsecuinc) {
        this.netsubsecuinc = netsubsecuinc;
    }

    /**
     * 其中:受托客户资产管理业务净收入
     * @return NetTrustInc 其中:受托客户资产管理业务净收入
     */
    public BigDecimal getNettrustinc() {
        return nettrustinc;
    }

    /**
     * 其中:受托客户资产管理业务净收入
     * @param nettrustinc 其中:受托客户资产管理业务净收入
     */
    public void setNettrustinc(BigDecimal nettrustinc) {
        this.nettrustinc = nettrustinc;
    }

    /**
     * 已赚保费
     * @return PremiEarned 已赚保费
     */
    public BigDecimal getPremiearned() {
        return premiearned;
    }

    /**
     * 已赚保费
     * @param premiearned 已赚保费
     */
    public void setPremiearned(BigDecimal premiearned) {
        this.premiearned = premiearned;
    }

    /**
     * 保险业务收入
     * @return PremiIncome 保险业务收入
     */
    public BigDecimal getPremiincome() {
        return premiincome;
    }

    /**
     * 保险业务收入
     * @param premiincome 保险业务收入
     */
    public void setPremiincome(BigDecimal premiincome) {
        this.premiincome = premiincome;
    }

    /**
     * 其中:分保费收入
     * @return ReinIncome 其中:分保费收入
     */
    public BigDecimal getReinincome() {
        return reinincome;
    }

    /**
     * 其中:分保费收入
     * @param reinincome 其中:分保费收入
     */
    public void setReinincome(BigDecimal reinincome) {
        this.reinincome = reinincome;
    }

    /**
     * 减:分出保费(元)
     * @return Reinsurance 减:分出保费(元)
     */
    public BigDecimal getReinsurance() {
        return reinsurance;
    }

    /**
     * 减:分出保费(元)
     * @param reinsurance 减:分出保费(元)
     */
    public void setReinsurance(BigDecimal reinsurance) {
        this.reinsurance = reinsurance;
    }

    /**
     * 减:提取未到期责任准备金
     * @return UneaPremRes 减:提取未到期责任准备金
     */
    public BigDecimal getUneapremres() {
        return uneapremres;
    }

    /**
     * 减:提取未到期责任准备金
     * @param uneapremres 减:提取未到期责任准备金
     */
    public void setUneapremres(BigDecimal uneapremres) {
        this.uneapremres = uneapremres;
    }

    /**
     * 其他业务收入
     * @return OtherOpeRev 其他业务收入
     */
    public BigDecimal getOtheroperev() {
        return otheroperev;
    }

    /**
     * 其他业务收入
     * @param otheroperev 其他业务收入
     */
    public void setOtheroperev(BigDecimal otheroperev) {
        this.otheroperev = otheroperev;
    }

    /**
     * 营业收入特殊项目
     * @return SpeItemsOR 营业收入特殊项目
     */
    public BigDecimal getSpeitemsor() {
        return speitemsor;
    }

    /**
     * 营业收入特殊项目
     * @param speitemsor 营业收入特殊项目
     */
    public void setSpeitemsor(BigDecimal speitemsor) {
        this.speitemsor = speitemsor;
    }

    /**
     * 营业收入调整项目
     * @return AdjItemsOR 营业收入调整项目
     */
    public BigDecimal getAdjitemsor() {
        return adjitemsor;
    }

    /**
     * 营业收入调整项目
     * @param adjitemsor 营业收入调整项目
     */
    public void setAdjitemsor(BigDecimal adjitemsor) {
        this.adjitemsor = adjitemsor;
    }

    /**
     * 二、营业总成本
     * @return TotOpeCost 二、营业总成本
     */
    public BigDecimal getTotopecost() {
        return totopecost;
    }

    /**
     * 二、营业总成本
     * @param totopecost 二、营业总成本
     */
    public void setTotopecost(BigDecimal totopecost) {
        this.totopecost = totopecost;
    }

    /**
     * 营业支出
     * @return OpeCost 营业支出
     */
    public BigDecimal getOpecost() {
        return opecost;
    }

    /**
     * 营业支出
     * @param opecost 营业支出
     */
    public void setOpecost(BigDecimal opecost) {
        this.opecost = opecost;
    }

    /**
     * 退保金
     * @return RefPrem 退保金
     */
    public BigDecimal getRefprem() {
        return refprem;
    }

    /**
     * 退保金
     * @param refprem 退保金
     */
    public void setRefprem(BigDecimal refprem) {
        this.refprem = refprem;
    }

    /**
     * 赔付支出
     * @return CompExpense 赔付支出
     */
    public BigDecimal getCompexpense() {
        return compexpense;
    }

    /**
     * 赔付支出
     * @param compexpense 赔付支出
     */
    public void setCompexpense(BigDecimal compexpense) {
        this.compexpense = compexpense;
    }

    /**
     * 减:摊回赔付支出
     * @return AmorExpense 减:摊回赔付支出
     */
    public BigDecimal getAmorexpense() {
        return amorexpense;
    }

    /**
     * 减:摊回赔付支出
     * @param amorexpense 减:摊回赔付支出
     */
    public void setAmorexpense(BigDecimal amorexpense) {
        this.amorexpense = amorexpense;
    }

    /**
     * 提取保险责任准备金
     * @return PremReserve 提取保险责任准备金
     */
    public BigDecimal getPremreserve() {
        return premreserve;
    }

    /**
     * 提取保险责任准备金
     * @param premreserve 提取保险责任准备金
     */
    public void setPremreserve(BigDecimal premreserve) {
        this.premreserve = premreserve;
    }

    /**
     * 减:摊回保险责任准备金
     * @return AmorPremRes 减:摊回保险责任准备金
     */
    public BigDecimal getAmorpremres() {
        return amorpremres;
    }

    /**
     * 减:摊回保险责任准备金
     * @param amorpremres 减:摊回保险责任准备金
     */
    public void setAmorpremres(BigDecimal amorpremres) {
        this.amorpremres = amorpremres;
    }

    /**
     * 保单红利支出
     * @return PolDivPayout 保单红利支出
     */
    public BigDecimal getPoldivpayout() {
        return poldivpayout;
    }

    /**
     * 保单红利支出
     * @param poldivpayout 保单红利支出
     */
    public void setPoldivpayout(BigDecimal poldivpayout) {
        this.poldivpayout = poldivpayout;
    }

    /**
     * 分保费用
     * @return ReinCost 分保费用
     */
    public BigDecimal getReincost() {
        return reincost;
    }

    /**
     * 分保费用
     * @param reincost 分保费用
     */
    public void setReincost(BigDecimal reincost) {
        this.reincost = reincost;
    }

    /**
     * 业务及管理费
     * @return OpeAndAdmExp 业务及管理费
     */
    public BigDecimal getOpeandadmexp() {
        return opeandadmexp;
    }

    /**
     * 业务及管理费
     * @param opeandadmexp 业务及管理费
     */
    public void setOpeandadmexp(BigDecimal opeandadmexp) {
        this.opeandadmexp = opeandadmexp;
    }

    /**
     * 减:摊回分保费用
     * @return AmorReinCost 减:摊回分保费用
     */
    public BigDecimal getAmorreincost() {
        return amorreincost;
    }

    /**
     * 减:摊回分保费用
     * @param amorreincost 减:摊回分保费用
     */
    public void setAmorreincost(BigDecimal amorreincost) {
        this.amorreincost = amorreincost;
    }

    /**
     * 保险手续费及佣金支出
     * @return InsComExpense 保险手续费及佣金支出
     */
    public BigDecimal getInscomexpense() {
        return inscomexpense;
    }

    /**
     * 保险手续费及佣金支出
     * @param inscomexpense 保险手续费及佣金支出
     */
    public void setInscomexpense(BigDecimal inscomexpense) {
        this.inscomexpense = inscomexpense;
    }

    /**
     * 其他业务成本
     * @return OtherOpeCost 其他业务成本
     */
    public BigDecimal getOtheropecost() {
        return otheropecost;
    }

    /**
     * 其他业务成本
     * @param otheropecost 其他业务成本
     */
    public void setOtheropecost(BigDecimal otheropecost) {
        this.otheropecost = otheropecost;
    }

    /**
     * 减:营业成本
     * @return OpeaCost 减:营业成本
     */
    public BigDecimal getOpeacost() {
        return opeacost;
    }

    /**
     * 减:营业成本
     * @param opeacost 减:营业成本
     */
    public void setOpeacost(BigDecimal opeacost) {
        this.opeacost = opeacost;
    }

    /**
     * 营业税费/营业税金及附加
     * @return OpeTaxSurcha 营业税费/营业税金及附加
     */
    public BigDecimal getOpetaxsurcha() {
        return opetaxsurcha;
    }

    /**
     * 营业税费/营业税金及附加
     * @param opetaxsurcha 营业税费/营业税金及附加
     */
    public void setOpetaxsurcha(BigDecimal opetaxsurcha) {
        this.opetaxsurcha = opetaxsurcha;
    }

    /**
     * 销售费用
     * @return OpeExpense 销售费用
     */
    public BigDecimal getOpeexpense() {
        return opeexpense;
    }

    /**
     * 销售费用
     * @param opeexpense 销售费用
     */
    public void setOpeexpense(BigDecimal opeexpense) {
        this.opeexpense = opeexpense;
    }

    /**
     * 管理费用
     * @return AdmExpense 管理费用
     */
    public BigDecimal getAdmexpense() {
        return admexpense;
    }

    /**
     * 管理费用
     * @param admexpense 管理费用
     */
    public void setAdmexpense(BigDecimal admexpense) {
        this.admexpense = admexpense;
    }

    /**
     * 财务费用
     * @return FinExpense 财务费用
     */
    public BigDecimal getFinexpense() {
        return finexpense;
    }

    /**
     * 财务费用
     * @param finexpense 财务费用
     */
    public void setFinexpense(BigDecimal finexpense) {
        this.finexpense = finexpense;
    }

    /**
     * 资产减值损失
     * @return AssetImpLoss 资产减值损失
     */
    public BigDecimal getAssetimploss() {
        return assetimploss;
    }

    /**
     * 资产减值损失
     * @param assetimploss 资产减值损失
     */
    public void setAssetimploss(BigDecimal assetimploss) {
        this.assetimploss = assetimploss;
    }

    /**
     * 营业支出特殊项目
     * @return SpeItemsOP 营业支出特殊项目
     */
    public BigDecimal getSpeitemsop() {
        return speitemsop;
    }

    /**
     * 营业支出特殊项目
     * @param speitemsop 营业支出特殊项目
     */
    public void setSpeitemsop(BigDecimal speitemsop) {
        this.speitemsop = speitemsop;
    }

    /**
     * 营业支出调整项目
     * @return AdjItemsOP 营业支出调整项目
     */
    public BigDecimal getAdjitemsop() {
        return adjitemsop;
    }

    /**
     * 营业支出调整项目
     * @param adjitemsop 营业支出调整项目
     */
    public void setAdjitemsop(BigDecimal adjitemsop) {
        this.adjitemsop = adjitemsop;
    }

    /**
     * 加:公允价值变动净收益
     * @return FairValChaInc 加:公允价值变动净收益
     */
    public BigDecimal getFairvalchainc() {
        return fairvalchainc;
    }

    /**
     * 加:公允价值变动净收益
     * @param fairvalchainc 加:公允价值变动净收益
     */
    public void setFairvalchainc(BigDecimal fairvalchainc) {
        this.fairvalchainc = fairvalchainc;
    }

    /**
     * 加:投资净收益
     * @return InvInc 加:投资净收益
     */
    public BigDecimal getInvinc() {
        return invinc;
    }

    /**
     * 加:投资净收益
     * @param invinc 加:投资净收益
     */
    public void setInvinc(BigDecimal invinc) {
        this.invinc = invinc;
    }

    /**
     * 其中:对联营合营企业的投资收益
     * @return InvIncAsso 其中:对联营合营企业的投资收益
     */
    public BigDecimal getInvincasso() {
        return invincasso;
    }

    /**
     * 其中:对联营合营企业的投资收益
     * @param invincasso 其中:对联营合营企业的投资收益
     */
    public void setInvincasso(BigDecimal invincasso) {
        this.invincasso = invincasso;
    }

    /**
     * 汇兑收益
     * @return ExcIncome 汇兑收益
     */
    public BigDecimal getExcincome() {
        return excincome;
    }

    /**
     * 汇兑收益
     * @param excincome 汇兑收益
     */
    public void setExcincome(BigDecimal excincome) {
        this.excincome = excincome;
    }

    /**
     * 加:影响营业利润的其他科目
     * @return OtherItemsEffOP 加:影响营业利润的其他科目
     */
    public BigDecimal getOtheritemseffop() {
        return otheritemseffop;
    }

    /**
     * 加:影响营业利润的其他科目
     * @param otheritemseffop 加:影响营业利润的其他科目
     */
    public void setOtheritemseffop(BigDecimal otheritemseffop) {
        this.otheritemseffop = otheritemseffop;
    }

    /**
     * 加:影响营业利润的调整项目
     * @return AdjItemsEffOP 加:影响营业利润的调整项目
     */
    public BigDecimal getAdjitemseffop() {
        return adjitemseffop;
    }

    /**
     * 加:影响营业利润的调整项目
     * @param adjitemseffop 加:影响营业利润的调整项目
     */
    public void setAdjitemseffop(BigDecimal adjitemseffop) {
        this.adjitemseffop = adjitemseffop;
    }

    /**
     * 三、营业利润
     * @return OpeProfit 三、营业利润
     */
    public BigDecimal getOpeprofit() {
        return opeprofit;
    }

    /**
     * 三、营业利润
     * @param opeprofit 三、营业利润
     */
    public void setOpeprofit(BigDecimal opeprofit) {
        this.opeprofit = opeprofit;
    }

    /**
     * 加:营业外收入
     * @return NonopeIncome 加:营业外收入
     */
    public BigDecimal getNonopeincome() {
        return nonopeincome;
    }

    /**
     * 加:营业外收入
     * @param nonopeincome 加:营业外收入
     */
    public void setNonopeincome(BigDecimal nonopeincome) {
        this.nonopeincome = nonopeincome;
    }

    /**
     * 其中:非流动资产处置净利得
     * @return NonCurAsDEarn 其中:非流动资产处置净利得
     */
    public BigDecimal getNoncurasdearn() {
        return noncurasdearn;
    }

    /**
     * 其中:非流动资产处置净利得
     * @param noncurasdearn 其中:非流动资产处置净利得
     */
    public void setNoncurasdearn(BigDecimal noncurasdearn) {
        this.noncurasdearn = noncurasdearn;
    }

    /**
     * 减:营业外支出
     * @return NonopeExpense 减:营业外支出
     */
    public BigDecimal getNonopeexpense() {
        return nonopeexpense;
    }

    /**
     * 减:营业外支出
     * @param nonopeexpense 减:营业外支出
     */
    public void setNonopeexpense(BigDecimal nonopeexpense) {
        this.nonopeexpense = nonopeexpense;
    }

    /**
     * 其中:非流动资产处置净损失
     * @return NonCurAssDLoss 其中:非流动资产处置净损失
     */
    public BigDecimal getNoncurassdloss() {
        return noncurassdloss;
    }

    /**
     * 其中:非流动资产处置净损失
     * @param noncurassdloss 其中:非流动资产处置净损失
     */
    public void setNoncurassdloss(BigDecimal noncurassdloss) {
        this.noncurassdloss = noncurassdloss;
    }

    /**
     * 加:影响利润总额的其他科目
     * @return OtherItemsEffTP 加:影响利润总额的其他科目
     */
    public BigDecimal getOtheritemsefftp() {
        return otheritemsefftp;
    }

    /**
     * 加:影响利润总额的其他科目
     * @param otheritemsefftp 加:影响利润总额的其他科目
     */
    public void setOtheritemsefftp(BigDecimal otheritemsefftp) {
        this.otheritemsefftp = otheritemsefftp;
    }

    /**
     * 加:影响利润总额的调整项目
     * @return AdjItemsEffTP 加:影响利润总额的调整项目
     */
    public BigDecimal getAdjitemsefftp() {
        return adjitemsefftp;
    }

    /**
     * 加:影响利润总额的调整项目
     * @param adjitemsefftp 加:影响利润总额的调整项目
     */
    public void setAdjitemsefftp(BigDecimal adjitemsefftp) {
        this.adjitemsefftp = adjitemsefftp;
    }

    /**
     * 利润总额(元)
     * @return TotalProfit 利润总额(元)
     */
    public BigDecimal getTotalprofit() {
        return totalprofit;
    }

    /**
     * 利润总额(元)
     * @param totalprofit 利润总额(元)
     */
    public void setTotalprofit(BigDecimal totalprofit) {
        this.totalprofit = totalprofit;
    }

    /**
     * 减:所得税
     * @return IncTaxCost 减:所得税
     */
    public BigDecimal getInctaxcost() {
        return inctaxcost;
    }

    /**
     * 减:所得税
     * @param inctaxcost 减:所得税
     */
    public void setInctaxcost(BigDecimal inctaxcost) {
        this.inctaxcost = inctaxcost;
    }

    /**
     * 加:未确认的投资损失
     * @return UncerInvLosses 加:未确认的投资损失
     */
    public BigDecimal getUncerinvlosses() {
        return uncerinvlosses;
    }

    /**
     * 加:未确认的投资损失
     * @param uncerinvlosses 加:未确认的投资损失
     */
    public void setUncerinvlosses(BigDecimal uncerinvlosses) {
        this.uncerinvlosses = uncerinvlosses;
    }

    /**
     * 加:影响净利润的其他科目
     * @return OtherItemsEffNP 加:影响净利润的其他科目
     */
    public BigDecimal getOtheritemseffnp() {
        return otheritemseffnp;
    }

    /**
     * 加:影响净利润的其他科目
     * @param otheritemseffnp 加:影响净利润的其他科目
     */
    public void setOtheritemseffnp(BigDecimal otheritemseffnp) {
        this.otheritemseffnp = otheritemseffnp;
    }

    /**
     * 加:影响净利润的调整项目
     * @return AdjItemsEffNP 加:影响净利润的调整项目
     */
    public BigDecimal getAdjitemseffnp() {
        return adjitemseffnp;
    }

    /**
     * 加:影响净利润的调整项目
     * @param adjitemseffnp 加:影响净利润的调整项目
     */
    public void setAdjitemseffnp(BigDecimal adjitemseffnp) {
        this.adjitemseffnp = adjitemseffnp;
    }

    /**
     * 四、净利润(元)
     * @return NetProfit 四、净利润(元)
     */
    public BigDecimal getNetprofit() {
        return netprofit;
    }

    /**
     * 四、净利润(元)
     * @param netprofit 四、净利润(元)
     */
    public void setNetprofit(BigDecimal netprofit) {
        this.netprofit = netprofit;
    }

    /**
     * 归属于母公司所有者的净利润
     * @return NPPCompOwners 归属于母公司所有者的净利润
     */
    public BigDecimal getNppcompowners() {
        return nppcompowners;
    }

    /**
     * 归属于母公司所有者的净利润
     * @param nppcompowners 归属于母公司所有者的净利润
     */
    public void setNppcompowners(BigDecimal nppcompowners) {
        this.nppcompowners = nppcompowners;
    }

    /**
     * 少数股东损益
     * @return MinoProfit 少数股东损益
     */
    public BigDecimal getMinoprofit() {
        return minoprofit;
    }

    /**
     * 少数股东损益
     * @param minoprofit 少数股东损益
     */
    public void setMinoprofit(BigDecimal minoprofit) {
        this.minoprofit = minoprofit;
    }

    /**
     * 加:影响母公司净利润的特殊项目
     * @return OthItemsEffNPP 加:影响母公司净利润的特殊项目
     */
    public BigDecimal getOthitemseffnpp() {
        return othitemseffnpp;
    }

    /**
     * 加:影响母公司净利润的特殊项目
     * @param othitemseffnpp 加:影响母公司净利润的特殊项目
     */
    public void setOthitemseffnpp(BigDecimal othitemseffnpp) {
        this.othitemseffnpp = othitemseffnpp;
    }

    /**
     * 加:影响母公司净利润的调整项目
     * @return AdjItemsEffNPP 加:影响母公司净利润的调整项目
     */
    public BigDecimal getAdjitemseffnpp() {
        return adjitemseffnpp;
    }

    /**
     * 加:影响母公司净利润的调整项目
     * @param adjitemseffnpp 加:影响母公司净利润的调整项目
     */
    public void setAdjitemseffnpp(BigDecimal adjitemseffnpp) {
        this.adjitemseffnpp = adjitemseffnpp;
    }

    /**
     * 五、其他综合收益的税后净额(元)
     * @return OCIAfterTax 五、其他综合收益的税后净额(元)
     */
    public BigDecimal getOciaftertax() {
        return ociaftertax;
    }

    /**
     * 五、其他综合收益的税后净额(元)
     * @param ociaftertax 五、其他综合收益的税后净额(元)
     */
    public void setOciaftertax(BigDecimal ociaftertax) {
        this.ociaftertax = ociaftertax;
    }

    /**
     * 归属于母公司所有者的其他综合收益的税后净额
     * @return OCIATPComOWNR 归属于母公司所有者的其他综合收益的税后净额
     */
    public BigDecimal getOciatpcomownr() {
        return ociatpcomownr;
    }

    /**
     * 归属于母公司所有者的其他综合收益的税后净额
     * @param ociatpcomownr 归属于母公司所有者的其他综合收益的税后净额
     */
    public void setOciatpcomownr(BigDecimal ociatpcomownr) {
        this.ociatpcomownr = ociatpcomownr;
    }

    /**
     * (一)以后不能重分类进损益表的其他综合收益(元)
     * @return OCINotInIS (一)以后不能重分类进损益表的其他综合收益(元)
     */
    public BigDecimal getOcinotinis() {
        return ocinotinis;
    }

    /**
     * (一)以后不能重分类进损益表的其他综合收益(元)
     * @param ocinotinis (一)以后不能重分类进损益表的其他综合收益(元)
     */
    public void setOcinotinis(BigDecimal ocinotinis) {
        this.ocinotinis = ocinotinis;
    }

    /**
     * 1.1重新计量设定收益计划净负债或净资产的变动(元)
     * @return OCIReMearsure 1.1重新计量设定收益计划净负债或净资产的变动(元)
     */
    public BigDecimal getOciremearsure() {
        return ociremearsure;
    }

    /**
     * 1.1重新计量设定收益计划净负债或净资产的变动(元)
     * @param ociremearsure 1.1重新计量设定收益计划净负债或净资产的变动(元)
     */
    public void setOciremearsure(BigDecimal ociremearsure) {
        this.ociremearsure = ociremearsure;
    }

    /**
     * 1.2权益法下在被投资单位不能重分类进损益表的其他综合收益中享有的份额(元)
     * @return OCIEquitNotInIS 1.2权益法下在被投资单位不能重分类进损益表的其他综合收益中享有的份额(元)
     */
    public BigDecimal getOciequitnotinis() {
        return ociequitnotinis;
    }

    /**
     * 1.2权益法下在被投资单位不能重分类进损益表的其他综合收益中享有的份额(元)
     * @param ociequitnotinis 1.2权益法下在被投资单位不能重分类进损益表的其他综合收益中享有的份额(元)
     */
    public void setOciequitnotinis(BigDecimal ociequitnotinis) {
        this.ociequitnotinis = ociequitnotinis;
    }

    /**
     * (二)以后将重分类进损益表的其他综合收益(元)
     * @return OCIInIS (二)以后将重分类进损益表的其他综合收益(元)
     */
    public BigDecimal getOciinis() {
        return ociinis;
    }

    /**
     * (二)以后将重分类进损益表的其他综合收益(元)
     * @param ociinis (二)以后将重分类进损益表的其他综合收益(元)
     */
    public void setOciinis(BigDecimal ociinis) {
        this.ociinis = ociinis;
    }

    /**
     * 2.1权益法下在被投资单位以后将重分类进损益表的其他综合收益中享有的份额(元)
     * @return OCIEquityInIS 2.1权益法下在被投资单位以后将重分类进损益表的其他综合收益中享有的份额(元)
     */
    public BigDecimal getOciequityinis() {
        return ociequityinis;
    }

    /**
     * 2.1权益法下在被投资单位以后将重分类进损益表的其他综合收益中享有的份额(元)
     * @param ociequityinis 2.1权益法下在被投资单位以后将重分类进损益表的其他综合收益中享有的份额(元)
     */
    public void setOciequityinis(BigDecimal ociequityinis) {
        this.ociequityinis = ociequityinis;
    }

    /**
     * 2.2可供出售金融资产公允价值变动损益(元)
     * @return OCIFairValue 2.2可供出售金融资产公允价值变动损益(元)
     */
    public BigDecimal getOcifairvalue() {
        return ocifairvalue;
    }

    /**
     * 2.2可供出售金融资产公允价值变动损益(元)
     * @param ocifairvalue 2.2可供出售金融资产公允价值变动损益(元)
     */
    public void setOcifairvalue(BigDecimal ocifairvalue) {
        this.ocifairvalue = ocifairvalue;
    }

    /**
     * 2.3持有至到期投资重分类为可供出售金融资产损益(元)
     * @return OCIToMaturityFA 2.3持有至到期投资重分类为可供出售金融资产损益(元)
     */
    public BigDecimal getOcitomaturityfa() {
        return ocitomaturityfa;
    }

    /**
     * 2.3持有至到期投资重分类为可供出售金融资产损益(元)
     * @param ocitomaturityfa 2.3持有至到期投资重分类为可供出售金融资产损益(元)
     */
    public void setOcitomaturityfa(BigDecimal ocitomaturityfa) {
        this.ocitomaturityfa = ocitomaturityfa;
    }

    /**
     * 2.4现金流量套期损益的有效部分(元)
     * @return OCICFLoss 2.4现金流量套期损益的有效部分(元)
     */
    public BigDecimal getOcicfloss() {
        return ocicfloss;
    }

    /**
     * 2.4现金流量套期损益的有效部分(元)
     * @param ocicfloss 2.4现金流量套期损益的有效部分(元)
     */
    public void setOcicfloss(BigDecimal ocicfloss) {
        this.ocicfloss = ocicfloss;
    }

    /**
     * 2.5外币财务报表折算差额(元)
     * @return OCIFGNCurFSA 2.5外币财务报表折算差额(元)
     */
    public BigDecimal getOcifgncurfsa() {
        return ocifgncurfsa;
    }

    /**
     * 2.5外币财务报表折算差额(元)
     * @param ocifgncurfsa 2.5外币财务报表折算差额(元)
     */
    public void setOcifgncurfsa(BigDecimal ocifgncurfsa) {
        this.ocifgncurfsa = ocifgncurfsa;
    }

    /**
     * 2.6其他(以后能重分类进损益表的其他综合收益)(元)
     * @return OCIOthers 2.6其他(以后能重分类进损益表的其他综合收益)(元)
     */
    public BigDecimal getOciothers() {
        return ociothers;
    }

    /**
     * 2.6其他(以后能重分类进损益表的其他综合收益)(元)
     * @param ociothers 2.6其他(以后能重分类进损益表的其他综合收益)(元)
     */
    public void setOciothers(BigDecimal ociothers) {
        this.ociothers = ociothers;
    }

    /**
     * 归属于少数股东的其他综合收益的税后净额(元)
     * @return OCIATMinorOwner 归属于少数股东的其他综合收益的税后净额(元)
     */
    public BigDecimal getOciatminorowner() {
        return ociatminorowner;
    }

    /**
     * 归属于少数股东的其他综合收益的税后净额(元)
     * @param ociatminorowner 归属于少数股东的其他综合收益的税后净额(元)
     */
    public void setOciatminorowner(BigDecimal ociatminorowner) {
        this.ociatminorowner = ociatminorowner;
    }

    /**
     * 加:影响综合收益总额的调整项目
     * @return AdjItemsEffCI 加:影响综合收益总额的调整项目
     */
    public BigDecimal getAdjitemseffci() {
        return adjitemseffci;
    }

    /**
     * 加:影响综合收益总额的调整项目
     * @param adjitemseffci 加:影响综合收益总额的调整项目
     */
    public void setAdjitemseffci(BigDecimal adjitemseffci) {
        this.adjitemseffci = adjitemseffci;
    }

    /**
     * 七、综合收益总额
     * @return TotCompoIncome 七、综合收益总额
     */
    public BigDecimal getTotcompoincome() {
        return totcompoincome;
    }

    /**
     * 七、综合收益总额
     * @param totcompoincome 七、综合收益总额
     */
    public void setTotcompoincome(BigDecimal totcompoincome) {
        this.totcompoincome = totcompoincome;
    }

    /**
     * 归属于母公司所有者的综合收益总额
     * @return CIPCompOwners 归属于母公司所有者的综合收益总额
     */
    public BigDecimal getCipcompowners() {
        return cipcompowners;
    }

    /**
     * 归属于母公司所有者的综合收益总额
     * @param cipcompowners 归属于母公司所有者的综合收益总额
     */
    public void setCipcompowners(BigDecimal cipcompowners) {
        this.cipcompowners = cipcompowners;
    }

    /**
     * 归属于少数股东的综合收益总额
     * @return CIMinoOwners 归属于少数股东的综合收益总额
     */
    public BigDecimal getCiminoowners() {
        return ciminoowners;
    }

    /**
     * 归属于少数股东的综合收益总额
     * @param ciminoowners 归属于少数股东的综合收益总额
     */
    public void setCiminoowners(BigDecimal ciminoowners) {
        this.ciminoowners = ciminoowners;
    }

    /**
     * 加:影响母公司综合收益总额的调整项目
     * @return AdjItemsEffPCI 加:影响母公司综合收益总额的调整项目
     */
    public BigDecimal getAdjitemseffpci() {
        return adjitemseffpci;
    }

    /**
     * 加:影响母公司综合收益总额的调整项目
     * @param adjitemseffpci 加:影响母公司综合收益总额的调整项目
     */
    public void setAdjitemseffpci(BigDecimal adjitemseffpci) {
        this.adjitemseffpci = adjitemseffpci;
    }

    /**
     * 基本每股收益(元/股)
     * @return BasicEPS 基本每股收益(元/股)
     */
    public BigDecimal getBasiceps() {
        return basiceps;
    }

    /**
     * 基本每股收益(元/股)
     * @param basiceps 基本每股收益(元/股)
     */
    public void setBasiceps(BigDecimal basiceps) {
        this.basiceps = basiceps;
    }

    /**
     * 稀释每股收益(元/股)
     * @return DilutedEPS 稀释每股收益(元/股)
     */
    public BigDecimal getDilutedeps() {
        return dilutedeps;
    }

    /**
     * 稀释每股收益(元/股)
     * @param dilutedeps 稀释每股收益(元/股)
     */
    public void setDilutedeps(BigDecimal dilutedeps) {
        this.dilutedeps = dilutedeps;
    }

    /**
     * 更新时间
     * @return UpdateTime 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 更新时间
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
     * 信息来源代码
     * @return InfoSourceCode 信息来源代码
     */
    public Integer getInfosourcecode() {
        return infosourcecode;
    }

    /**
     * 信息来源代码
     * @param infosourcecode 信息来源代码
     */
    public void setInfosourcecode(Integer infosourcecode) {
        this.infosourcecode = infosourcecode;
    }

    /**
     * 开始日期
     * @return BeginDate 开始日期
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
     * 开始日期
     * @param begindate 开始日期
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    /**
     * 会计准则
     * @return AccountingStandards 会计准则
     */
    public Integer getAccountingstandards() {
        return accountingstandards;
    }

    /**
     * 会计准则
     * @param accountingstandards 会计准则
     */
    public void setAccountingstandards(Integer accountingstandards) {
        this.accountingstandards = accountingstandards;
    }

    /**
     * 聚源转换标识
     * @return Gmark 聚源转换标识
     */
    public Integer getGmark() {
        return gmark;
    }

    /**
     * 聚源转换标识
     * @param gmark 聚源转换标识
     */
    public void setGmark(Integer gmark) {
        this.gmark = gmark;
    }
}