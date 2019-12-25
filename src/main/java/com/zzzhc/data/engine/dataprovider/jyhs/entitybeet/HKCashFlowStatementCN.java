package com.zzzhc.data.engine.dataprovider.jyhs.entitybeet;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * hk_cashflowstatementcn
 */
@Entity(name = "hk_cashflowstatementcn")
public class HKCashFlowStatementCN {
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
     * 销售商品、提供劳务收到的现金
     */
    @Column(name = "GdSaSeReCash")
    private BigDecimal gdsaserecash;

    /**
     * 收到的税费返还
     */
    @Column(name = "TaxLeRefund")
    private BigDecimal taxlerefund;

    /**
     * 客户存款和同业存放款项净增加额
     */
    @Column(name = "NetDepInce")
    private BigDecimal netdepince;

    /**
     * 向中央银行借款净增加额
     */
    @Column(name = "NetBorFromCB")
    private BigDecimal netborfromcb;

    /**
     * 向其他金融机构拆入资金净增加额
     */
    @Column(name = "NetBorFromFinCo")
    private BigDecimal netborfromfinco;

    /**
     * 收回已核销贷款
     */
    @Column(name = "DrBaLoansCanc")
    private BigDecimal drbaloanscanc;

    /**
     * 收取利息、手续费及佣金的现金
     */
    @Column(name = "IntAndComCashIn")
    private BigDecimal intandcomcashin;

    /**
     * 处置交易性金融资产净增加额
     */
    @Column(name = "NDealTradAssets")
    private BigDecimal ndealtradassets;

    /**
     * 回购业务资金净增加额(元)
     */
    @Column(name = "NetBuyBack")
    private BigDecimal netbuyback;

    /**
     * 收到原保险合同保费取得的现金
     */
    @Column(name = "NetOriInsCash")
    private BigDecimal netoriinscash;

    /**
     * 收到再保业务现金净额
     */
    @Column(name = "NetReinCash")
    private BigDecimal netreincash;

    /**
     * 保户储金及投资款净增加额
     */
    @Column(name = "NetInsDepInv")
    private BigDecimal netinsdepinv;

    /**
     * 收到其他与经营活动有关的现金
     */
    @Column(name = "OthCashInRelOpe")
    private BigDecimal othcashinrelope;

    /**
     * 经营活动现金流入特殊项目
     */
    @Column(name = "SpeItemsOCIF")
    private BigDecimal speitemsocif;

    /**
     * 经营活动现金流入调整项目
     */
    @Column(name = "AdjItemsOCIF")
    private BigDecimal adjitemsocif;

    /**
     * 经营活动现金流入小计
     */
    @Column(name = "SuOpCashInflow")
    private BigDecimal suopcashinflow;

    /**
     * 购买商品、接受劳务支付的现金
     */
    @Column(name = "GdSerCashPaid")
    private BigDecimal gdsercashpaid;

    /**
     * 支付给职工以及为职工支付的现金
     */
    @Column(name = "StaBehalfPaid")
    private BigDecimal stabehalfpaid;

    /**
     * 支付的各项税费(元)
     */
    @Column(name = "AllTaxesPaid")
    private BigDecimal alltaxespaid;

    /**
     * 客户贷款及垫款净增加额
     */
    @Column(name = "NetLAdvInc")
    private BigDecimal netladvinc;

    /**
     * 存放中央银行和同业款项净增加额
     */
    @Column(name = "NetDepInCBAndIB")
    private BigDecimal netdepincbandib;

    /**
     * 拆出资金净增加额
     */
    @Column(name = "NetLendCap")
    private BigDecimal netlendcap;

    /**
     * 支付利息、手续费及佣金的现金
     */
    @Column(name = "ComCashPaid")
    private BigDecimal comcashpaid;

    /**
     * 支付原保险合同赔付款项的现金
     */
    @Column(name = "OriCompPaid")
    private BigDecimal oricomppaid;

    /**
     * 支付再保业务现金净额
     */
    @Column(name = "NetCashForRein")
    private BigDecimal netcashforrein;

    /**
     * 支付保单红利的现金
     */
    @Column(name = "PolDivCashPaid")
    private BigDecimal poldivcashpaid;

    /**
     * 支付其他与经营活动有关的现金
     */
    @Column(name = "OtherOpCashPaid")
    private BigDecimal otheropcashpaid;

    /**
     * 经营活动现金流出特殊项目
     */
    @Column(name = "SpeItemsOCOF")
    private BigDecimal speitemsocof;

    /**
     * 经营活动现金流出调整项目
     */
    @Column(name = "AdjItemsOCOF")
    private BigDecimal adjitemsocof;

    /**
     * 经营活动现金流出小计
     */
    @Column(name = "SubOpCOutflow")
    private BigDecimal subopcoutflow;

    /**
     * 经营活动现金流量净额调整项目
     */
    @Column(name = "AdjItemsNOCF")
    private BigDecimal adjitemsnocf;

    /**
     * 经营活动产生的现金流量净额
     */
    @Column(name = "NetOpeCFlow")
    private BigDecimal netopecflow;

    /**
     * 收回投资收到的现金
     */
    @Column(name = "InvWithdCash")
    private BigDecimal invwithdcash;

    /**
     * 取得投资收益收到的现金
     */
    @Column(name = "Invproceeds")
    private BigDecimal invproceeds;

    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    @Column(name = "FixInOtADisCash")
    private BigDecimal fixinotadiscash;

    /**
     * 处置子公司及其他营业单位收到的现金净额
     */
    @Column(name = "NCashDealSComp")
    private BigDecimal ncashdealscomp;

    /**
     * 收到其他与投资活动有关的现金
     */
    @Column(name = "OthCaFromInvAct")
    private BigDecimal othcafrominvact;

    /**
     * 投资活动现金流入特殊项目
     */
    @Column(name = "SpeItemsICIF")
    private BigDecimal speitemsicif;

    /**
     * 投资活动现金流入调整项目
     */
    @Column(name = "AdjItemsICIF")
    private BigDecimal adjitemsicif;

    /**
     * 投资活动现金流入小计
     */
    @Column(name = "SubInvCaInflow")
    private BigDecimal subinvcainflow;

    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     */
    @Column(name = "FixInOAsAcCash")
    private BigDecimal fixinoasaccash;

    /**
     * 投资支付的现金
     */
    @Column(name = "InvCashPaid")
    private BigDecimal invcashpaid;

    /**
     * 取得子公司及其他营业单位支付的现金净额
     */
    @Column(name = "NCashFromSComp")
    private BigDecimal ncashfromscomp;

    /**
     * 质押贷款净增加额
     */
    @Column(name = "ImLoanNetInc")
    private BigDecimal imloannetinc;

    /**
     * 支付其他与投资活动有关的现金
     */
    @Column(name = "OthCashToInvAct")
    private BigDecimal othcashtoinvact;

    /**
     * 投资活动现金流出特殊项目
     */
    @Column(name = "SpeItemsICOF")
    private BigDecimal speitemsicof;

    /**
     * 投资活动现金流出调整项目
     */
    @Column(name = "AdjItemsICOF")
    private BigDecimal adjitemsicof;

    /**
     * 投资活动现金流出小计
     */
    @Column(name = "SubInvCashOflow")
    private BigDecimal subinvcashoflow;

    /**
     * 投资活动现金流量净额调整项目
     */
    @Column(name = "AdjItemsNICF")
    private BigDecimal adjitemsnicf;

    /**
     * 投资活动产生的现金流量净额
     */
    @Column(name = "NetInvCashFlow")
    private BigDecimal netinvcashflow;

    /**
     * 吸收投资收到的现金
     */
    @Column(name = "CashFromInv")
    private BigDecimal cashfrominv;

    /**
     * 其中:子公司吸收少数股东投资收到的现金
     */
    @Column(name = "CFMinoSInvSub")
    private BigDecimal cfminosinvsub;

    /**
     * 发行债券收到的现金
     */
    @Column(name = "CFBondsIssue")
    private BigDecimal cfbondsissue;

    /**
     * 取得借款收到的现金
     */
    @Column(name = "CFBorrowing")
    private BigDecimal cfborrowing;

    /**
     * 收到其他与筹资活动有关的现金
     */
    @Column(name = "OthFinActCash")
    private BigDecimal othfinactcash;

    /**
     * 筹资活动现金流入特殊项目
     */
    @Column(name = "SpeItemsFCIF")
    private BigDecimal speitemsfcif;

    /**
     * 筹资活动现金流入调整项目
     */
    @Column(name = "AdjItemsFCIF")
    private BigDecimal adjitemsfcif;

    /**
     * 筹资活动现金流入小计
     */
    @Column(name = "SubFinCashInfl")
    private BigDecimal subfincashinfl;

    /**
     * 偿还债务支付的现金
     */
    @Column(name = "BorRepayment")
    private BigDecimal borrepayment;

    /**
     * 分配股利、利润或偿付利息支付的现金
     */
    @Column(name = "DivIntPayment")
    private BigDecimal divintpayment;

    /**
     * 其中:子公司支付给少数股东的股利、利润或偿付的利息
     */
    @Column(name = "ProFromSubTMiS")
    private BigDecimal profromsubtmis;

    /**
     * 支付其他与筹资活动有关的现金
     */
    @Column(name = "OthFinActP")
    private BigDecimal othfinactp;

    /**
     * 筹资活动现金流出特殊项目
     */
    @Column(name = "SpeItemsFCOF")
    private BigDecimal speitemsfcof;

    /**
     * 筹资活动现金流出调整项目
     */
    @Column(name = "AdjItemsFCOF")
    private BigDecimal adjitemsfcof;

    /**
     * 筹资活动现金流出小计
     */
    @Column(name = "SubFinCOflow")
    private BigDecimal subfincoflow;

    /**
     * 筹资活动流量现金净额调整项目
     */
    @Column(name = "AdjItemsNFCF")
    private BigDecimal adjitemsnfcf;

    /**
     * 筹资活动产生的现金流量净额
     */
    @Column(name = "NetFinCashFlow")
    private BigDecimal netfincashflow;

    /**
     * 汇率变动对现金的影响
     */
    @Column(name = "ExRateChgEffect")
    private BigDecimal exratechgeffect;

    /**
     * 影响现金及现金等价物的其他科目
     */
    @Column(name = "OthItemsEffCE")
    private BigDecimal othitemseffce;

    /**
     * 影响现金及现金等价物的调整项目
     */
    @Column(name = "AdjItemsCE")
    private BigDecimal adjitemsce;

    /**
     * 现金及现金等价物净增加额
     */
    @Column(name = "CEquInc")
    private BigDecimal cequinc;

    /**
     * 期初现金及现金等价物余额(元)
     */
    @Column(name = "BeginPeriodCash")
    private BigDecimal beginperiodcash;

    /**
     * ##现金及现金等价物净增加额的调整项目(元)
     */
    @Column(name = "AdjItemsCEI")
    private BigDecimal adjitemscei;

    /**
     * ##现金及现金等价物净增加额的特殊项目(元)
     */
    @Column(name = "OtherItemEffCEI")
    private BigDecimal otheritemeffcei;

    /**
     * 期末现金及现金等价物余额
     */
    @Column(name = "EndPerCEqu")
    private BigDecimal endpercequ;

    /**
     * 四、净利润(元)
     */
    @Column(name = "NetProfit")
    private BigDecimal netprofit;

    /**
     * 少数股东损益
     */
    @Column(name = "MinoProfit")
    private BigDecimal minoprofit;

    /**
     * 加:资产减值准备
     */
    @Column(name = "ADepreReserves")
    private BigDecimal adeprereserves;

    /**
     * 固定资产折旧、油气资产折耗、生产性生物资产折旧
     */
    @Column(name = "FAssetDep")
    private BigDecimal fassetdep;

    /**
     * 无形资产摊销
     */
    @Column(name = "IntAAmort")
    private BigDecimal intaamort;

    /**
     * 长期待摊费用摊销
     */
    @Column(name = "DefExpAmort")
    private BigDecimal defexpamort;

    /**
     * 待摊费用减少(减:增加)
     */
    @Column(name = "DefExpDecd")
    private BigDecimal defexpdecd;

    /**
     * 预提费用增加(减:减少)
     */
    @Column(name = "AccExpenseAdded")
    private BigDecimal accexpenseadded;

    /**
     * 处置固定资产、无形资产和其他长期资产的损失
     */
    @Column(name = "FixInOthADLoss")
    private BigDecimal fixinothadloss;

    /**
     * 固定资产报废损失
     */
    @Column(name = "FixedAssetSLoss")
    private BigDecimal fixedassetsloss;

    /**
     * 公允价值变动损失
     */
    @Column(name = "LFromFValueChg")
    private BigDecimal lfromfvaluechg;

    /**
     * 财务费用
     */
    @Column(name = "FinExpense")
    private BigDecimal finexpense;

    /**
     * 投资损失(元)
     */
    @Column(name = "InvestLoss")
    private BigDecimal investloss;

    /**
     * 递延所得税资产减少
     */
    @Column(name = "DefTaxAssetDec")
    private BigDecimal deftaxassetdec;

    /**
     * 递延所得税负债增加
     */
    @Column(name = "DefTaxLiaInc")
    private BigDecimal deftaxliainc;

    /**
     * 存货的减少
     */
    @Column(name = "InvDec")
    private BigDecimal invdec;

    /**
     * 经营性应收项目的减少
     */
    @Column(name = "OpeRecDec")
    private BigDecimal operecdec;

    /**
     * 经营性应付项目的增加
     */
    @Column(name = "OpePayableInc")
    private BigDecimal opepayableinc;

    /**
     * 其他(元)
     */
    @Column(name = "Others")
    private BigDecimal others;

    /**
     * (附注)经营活动现金流量净额特殊项目
     */
    @Column(name = "SpeItemsNOCF1")
    private BigDecimal speitemsnocf1;

    /**
     * (附注)经营活动现金流量净额调整项目
     */
    @Column(name = "AdjItemsNOCF1")
    private BigDecimal adjitemsnocf1;

    /**
     * (附注)经营活动产生的现金流量净额
     */
    @Column(name = "NetOpeCFNotes")
    private BigDecimal netopecfnotes;

    /**
     * 加:经营流量净额前后对比调整项目
     */
    @Column(name = "ConAdjNOCF")
    private BigDecimal conadjnocf;

    /**
     * 债务转为资本
     */
    @Column(name = "DebtToCap")
    private BigDecimal debttocap;

    /**
     * 一年内到期的可转换公司债券
     */
    @Column(name = "CBsExpWithin1Y")
    private BigDecimal cbsexpwithin1y;

    /**
     * 融资租入固定资产
     */
    @Column(name = "FixedAFinLeases")
    private BigDecimal fixedafinleases;

    /**
     * 现金的期末余额(元)
     */
    @Column(name = "CashAtEndOfYear")
    private BigDecimal cashatendofyear;

    /**
     * 减:现金的期初余额
     */
    @Column(name = "CashAtBOfYear")
    private BigDecimal cashatbofyear;

    /**
     * 加:现金等价物的期末余额
     */
    @Column(name = "CEquAtEOfYear")
    private BigDecimal cequateofyear;

    /**
     * 减:现金等价物的期初余额
     */
    @Column(name = "CEquAtBeginning")
    private BigDecimal cequatbeginning;

    /**
     * 加:现金净额前后对比调整项目
     */
    @Column(name = "ConAdjNC")
    private BigDecimal conadjnc;

    /**
     * (附注)现金特殊项目
     */
    @Column(name = "SpeItemsC")
    private BigDecimal speitemsc;

    /**
     * (附注)现金调整项目
     */
    @Column(name = "AdjItemsC")
    private BigDecimal adjitemsc;

    /**
     * (附注)现金及现金等价物净增加额
     */
    @Column(name = "NetIncrInCEqu")
    private BigDecimal netincrincequ;

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
     * 会计准则
     */
    @Column(name = "AccountingStandards")
    private Integer accountingstandards;

    /**
     * 开始日期
     */
    @Column(name = "BeginDate")
    private Date begindate;

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
     * 销售商品、提供劳务收到的现金
     * @return GdSaSeReCash 销售商品、提供劳务收到的现金
     */
    public BigDecimal getGdsaserecash() {
        return gdsaserecash;
    }

    /**
     * 销售商品、提供劳务收到的现金
     * @param gdsaserecash 销售商品、提供劳务收到的现金
     */
    public void setGdsaserecash(BigDecimal gdsaserecash) {
        this.gdsaserecash = gdsaserecash;
    }

    /**
     * 收到的税费返还
     * @return TaxLeRefund 收到的税费返还
     */
    public BigDecimal getTaxlerefund() {
        return taxlerefund;
    }

    /**
     * 收到的税费返还
     * @param taxlerefund 收到的税费返还
     */
    public void setTaxlerefund(BigDecimal taxlerefund) {
        this.taxlerefund = taxlerefund;
    }

    /**
     * 客户存款和同业存放款项净增加额
     * @return NetDepInce 客户存款和同业存放款项净增加额
     */
    public BigDecimal getNetdepince() {
        return netdepince;
    }

    /**
     * 客户存款和同业存放款项净增加额
     * @param netdepince 客户存款和同业存放款项净增加额
     */
    public void setNetdepince(BigDecimal netdepince) {
        this.netdepince = netdepince;
    }

    /**
     * 向中央银行借款净增加额
     * @return NetBorFromCB 向中央银行借款净增加额
     */
    public BigDecimal getNetborfromcb() {
        return netborfromcb;
    }

    /**
     * 向中央银行借款净增加额
     * @param netborfromcb 向中央银行借款净增加额
     */
    public void setNetborfromcb(BigDecimal netborfromcb) {
        this.netborfromcb = netborfromcb;
    }

    /**
     * 向其他金融机构拆入资金净增加额
     * @return NetBorFromFinCo 向其他金融机构拆入资金净增加额
     */
    public BigDecimal getNetborfromfinco() {
        return netborfromfinco;
    }

    /**
     * 向其他金融机构拆入资金净增加额
     * @param netborfromfinco 向其他金融机构拆入资金净增加额
     */
    public void setNetborfromfinco(BigDecimal netborfromfinco) {
        this.netborfromfinco = netborfromfinco;
    }

    /**
     * 收回已核销贷款
     * @return DrBaLoansCanc 收回已核销贷款
     */
    public BigDecimal getDrbaloanscanc() {
        return drbaloanscanc;
    }

    /**
     * 收回已核销贷款
     * @param drbaloanscanc 收回已核销贷款
     */
    public void setDrbaloanscanc(BigDecimal drbaloanscanc) {
        this.drbaloanscanc = drbaloanscanc;
    }

    /**
     * 收取利息、手续费及佣金的现金
     * @return IntAndComCashIn 收取利息、手续费及佣金的现金
     */
    public BigDecimal getIntandcomcashin() {
        return intandcomcashin;
    }

    /**
     * 收取利息、手续费及佣金的现金
     * @param intandcomcashin 收取利息、手续费及佣金的现金
     */
    public void setIntandcomcashin(BigDecimal intandcomcashin) {
        this.intandcomcashin = intandcomcashin;
    }

    /**
     * 处置交易性金融资产净增加额
     * @return NDealTradAssets 处置交易性金融资产净增加额
     */
    public BigDecimal getNdealtradassets() {
        return ndealtradassets;
    }

    /**
     * 处置交易性金融资产净增加额
     * @param ndealtradassets 处置交易性金融资产净增加额
     */
    public void setNdealtradassets(BigDecimal ndealtradassets) {
        this.ndealtradassets = ndealtradassets;
    }

    /**
     * 回购业务资金净增加额(元)
     * @return NetBuyBack 回购业务资金净增加额(元)
     */
    public BigDecimal getNetbuyback() {
        return netbuyback;
    }

    /**
     * 回购业务资金净增加额(元)
     * @param netbuyback 回购业务资金净增加额(元)
     */
    public void setNetbuyback(BigDecimal netbuyback) {
        this.netbuyback = netbuyback;
    }

    /**
     * 收到原保险合同保费取得的现金
     * @return NetOriInsCash 收到原保险合同保费取得的现金
     */
    public BigDecimal getNetoriinscash() {
        return netoriinscash;
    }

    /**
     * 收到原保险合同保费取得的现金
     * @param netoriinscash 收到原保险合同保费取得的现金
     */
    public void setNetoriinscash(BigDecimal netoriinscash) {
        this.netoriinscash = netoriinscash;
    }

    /**
     * 收到再保业务现金净额
     * @return NetReinCash 收到再保业务现金净额
     */
    public BigDecimal getNetreincash() {
        return netreincash;
    }

    /**
     * 收到再保业务现金净额
     * @param netreincash 收到再保业务现金净额
     */
    public void setNetreincash(BigDecimal netreincash) {
        this.netreincash = netreincash;
    }

    /**
     * 保户储金及投资款净增加额
     * @return NetInsDepInv 保户储金及投资款净增加额
     */
    public BigDecimal getNetinsdepinv() {
        return netinsdepinv;
    }

    /**
     * 保户储金及投资款净增加额
     * @param netinsdepinv 保户储金及投资款净增加额
     */
    public void setNetinsdepinv(BigDecimal netinsdepinv) {
        this.netinsdepinv = netinsdepinv;
    }

    /**
     * 收到其他与经营活动有关的现金
     * @return OthCashInRelOpe 收到其他与经营活动有关的现金
     */
    public BigDecimal getOthcashinrelope() {
        return othcashinrelope;
    }

    /**
     * 收到其他与经营活动有关的现金
     * @param othcashinrelope 收到其他与经营活动有关的现金
     */
    public void setOthcashinrelope(BigDecimal othcashinrelope) {
        this.othcashinrelope = othcashinrelope;
    }

    /**
     * 经营活动现金流入特殊项目
     * @return SpeItemsOCIF 经营活动现金流入特殊项目
     */
    public BigDecimal getSpeitemsocif() {
        return speitemsocif;
    }

    /**
     * 经营活动现金流入特殊项目
     * @param speitemsocif 经营活动现金流入特殊项目
     */
    public void setSpeitemsocif(BigDecimal speitemsocif) {
        this.speitemsocif = speitemsocif;
    }

    /**
     * 经营活动现金流入调整项目
     * @return AdjItemsOCIF 经营活动现金流入调整项目
     */
    public BigDecimal getAdjitemsocif() {
        return adjitemsocif;
    }

    /**
     * 经营活动现金流入调整项目
     * @param adjitemsocif 经营活动现金流入调整项目
     */
    public void setAdjitemsocif(BigDecimal adjitemsocif) {
        this.adjitemsocif = adjitemsocif;
    }

    /**
     * 经营活动现金流入小计
     * @return SuOpCashInflow 经营活动现金流入小计
     */
    public BigDecimal getSuopcashinflow() {
        return suopcashinflow;
    }

    /**
     * 经营活动现金流入小计
     * @param suopcashinflow 经营活动现金流入小计
     */
    public void setSuopcashinflow(BigDecimal suopcashinflow) {
        this.suopcashinflow = suopcashinflow;
    }

    /**
     * 购买商品、接受劳务支付的现金
     * @return GdSerCashPaid 购买商品、接受劳务支付的现金
     */
    public BigDecimal getGdsercashpaid() {
        return gdsercashpaid;
    }

    /**
     * 购买商品、接受劳务支付的现金
     * @param gdsercashpaid 购买商品、接受劳务支付的现金
     */
    public void setGdsercashpaid(BigDecimal gdsercashpaid) {
        this.gdsercashpaid = gdsercashpaid;
    }

    /**
     * 支付给职工以及为职工支付的现金
     * @return StaBehalfPaid 支付给职工以及为职工支付的现金
     */
    public BigDecimal getStabehalfpaid() {
        return stabehalfpaid;
    }

    /**
     * 支付给职工以及为职工支付的现金
     * @param stabehalfpaid 支付给职工以及为职工支付的现金
     */
    public void setStabehalfpaid(BigDecimal stabehalfpaid) {
        this.stabehalfpaid = stabehalfpaid;
    }

    /**
     * 支付的各项税费(元)
     * @return AllTaxesPaid 支付的各项税费(元)
     */
    public BigDecimal getAlltaxespaid() {
        return alltaxespaid;
    }

    /**
     * 支付的各项税费(元)
     * @param alltaxespaid 支付的各项税费(元)
     */
    public void setAlltaxespaid(BigDecimal alltaxespaid) {
        this.alltaxespaid = alltaxespaid;
    }

    /**
     * 客户贷款及垫款净增加额
     * @return NetLAdvInc 客户贷款及垫款净增加额
     */
    public BigDecimal getNetladvinc() {
        return netladvinc;
    }

    /**
     * 客户贷款及垫款净增加额
     * @param netladvinc 客户贷款及垫款净增加额
     */
    public void setNetladvinc(BigDecimal netladvinc) {
        this.netladvinc = netladvinc;
    }

    /**
     * 存放中央银行和同业款项净增加额
     * @return NetDepInCBAndIB 存放中央银行和同业款项净增加额
     */
    public BigDecimal getNetdepincbandib() {
        return netdepincbandib;
    }

    /**
     * 存放中央银行和同业款项净增加额
     * @param netdepincbandib 存放中央银行和同业款项净增加额
     */
    public void setNetdepincbandib(BigDecimal netdepincbandib) {
        this.netdepincbandib = netdepincbandib;
    }

    /**
     * 拆出资金净增加额
     * @return NetLendCap 拆出资金净增加额
     */
    public BigDecimal getNetlendcap() {
        return netlendcap;
    }

    /**
     * 拆出资金净增加额
     * @param netlendcap 拆出资金净增加额
     */
    public void setNetlendcap(BigDecimal netlendcap) {
        this.netlendcap = netlendcap;
    }

    /**
     * 支付利息、手续费及佣金的现金
     * @return ComCashPaid 支付利息、手续费及佣金的现金
     */
    public BigDecimal getComcashpaid() {
        return comcashpaid;
    }

    /**
     * 支付利息、手续费及佣金的现金
     * @param comcashpaid 支付利息、手续费及佣金的现金
     */
    public void setComcashpaid(BigDecimal comcashpaid) {
        this.comcashpaid = comcashpaid;
    }

    /**
     * 支付原保险合同赔付款项的现金
     * @return OriCompPaid 支付原保险合同赔付款项的现金
     */
    public BigDecimal getOricomppaid() {
        return oricomppaid;
    }

    /**
     * 支付原保险合同赔付款项的现金
     * @param oricomppaid 支付原保险合同赔付款项的现金
     */
    public void setOricomppaid(BigDecimal oricomppaid) {
        this.oricomppaid = oricomppaid;
    }

    /**
     * 支付再保业务现金净额
     * @return NetCashForRein 支付再保业务现金净额
     */
    public BigDecimal getNetcashforrein() {
        return netcashforrein;
    }

    /**
     * 支付再保业务现金净额
     * @param netcashforrein 支付再保业务现金净额
     */
    public void setNetcashforrein(BigDecimal netcashforrein) {
        this.netcashforrein = netcashforrein;
    }

    /**
     * 支付保单红利的现金
     * @return PolDivCashPaid 支付保单红利的现金
     */
    public BigDecimal getPoldivcashpaid() {
        return poldivcashpaid;
    }

    /**
     * 支付保单红利的现金
     * @param poldivcashpaid 支付保单红利的现金
     */
    public void setPoldivcashpaid(BigDecimal poldivcashpaid) {
        this.poldivcashpaid = poldivcashpaid;
    }

    /**
     * 支付其他与经营活动有关的现金
     * @return OtherOpCashPaid 支付其他与经营活动有关的现金
     */
    public BigDecimal getOtheropcashpaid() {
        return otheropcashpaid;
    }

    /**
     * 支付其他与经营活动有关的现金
     * @param otheropcashpaid 支付其他与经营活动有关的现金
     */
    public void setOtheropcashpaid(BigDecimal otheropcashpaid) {
        this.otheropcashpaid = otheropcashpaid;
    }

    /**
     * 经营活动现金流出特殊项目
     * @return SpeItemsOCOF 经营活动现金流出特殊项目
     */
    public BigDecimal getSpeitemsocof() {
        return speitemsocof;
    }

    /**
     * 经营活动现金流出特殊项目
     * @param speitemsocof 经营活动现金流出特殊项目
     */
    public void setSpeitemsocof(BigDecimal speitemsocof) {
        this.speitemsocof = speitemsocof;
    }

    /**
     * 经营活动现金流出调整项目
     * @return AdjItemsOCOF 经营活动现金流出调整项目
     */
    public BigDecimal getAdjitemsocof() {
        return adjitemsocof;
    }

    /**
     * 经营活动现金流出调整项目
     * @param adjitemsocof 经营活动现金流出调整项目
     */
    public void setAdjitemsocof(BigDecimal adjitemsocof) {
        this.adjitemsocof = adjitemsocof;
    }

    /**
     * 经营活动现金流出小计
     * @return SubOpCOutflow 经营活动现金流出小计
     */
    public BigDecimal getSubopcoutflow() {
        return subopcoutflow;
    }

    /**
     * 经营活动现金流出小计
     * @param subopcoutflow 经营活动现金流出小计
     */
    public void setSubopcoutflow(BigDecimal subopcoutflow) {
        this.subopcoutflow = subopcoutflow;
    }

    /**
     * 经营活动现金流量净额调整项目
     * @return AdjItemsNOCF 经营活动现金流量净额调整项目
     */
    public BigDecimal getAdjitemsnocf() {
        return adjitemsnocf;
    }

    /**
     * 经营活动现金流量净额调整项目
     * @param adjitemsnocf 经营活动现金流量净额调整项目
     */
    public void setAdjitemsnocf(BigDecimal adjitemsnocf) {
        this.adjitemsnocf = adjitemsnocf;
    }

    /**
     * 经营活动产生的现金流量净额
     * @return NetOpeCFlow 经营活动产生的现金流量净额
     */
    public BigDecimal getNetopecflow() {
        return netopecflow;
    }

    /**
     * 经营活动产生的现金流量净额
     * @param netopecflow 经营活动产生的现金流量净额
     */
    public void setNetopecflow(BigDecimal netopecflow) {
        this.netopecflow = netopecflow;
    }

    /**
     * 收回投资收到的现金
     * @return InvWithdCash 收回投资收到的现金
     */
    public BigDecimal getInvwithdcash() {
        return invwithdcash;
    }

    /**
     * 收回投资收到的现金
     * @param invwithdcash 收回投资收到的现金
     */
    public void setInvwithdcash(BigDecimal invwithdcash) {
        this.invwithdcash = invwithdcash;
    }

    /**
     * 取得投资收益收到的现金
     * @return Invproceeds 取得投资收益收到的现金
     */
    public BigDecimal getInvproceeds() {
        return invproceeds;
    }

    /**
     * 取得投资收益收到的现金
     * @param invproceeds 取得投资收益收到的现金
     */
    public void setInvproceeds(BigDecimal invproceeds) {
        this.invproceeds = invproceeds;
    }

    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     * @return FixInOtADisCash 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    public BigDecimal getFixinotadiscash() {
        return fixinotadiscash;
    }

    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     * @param fixinotadiscash 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    public void setFixinotadiscash(BigDecimal fixinotadiscash) {
        this.fixinotadiscash = fixinotadiscash;
    }

    /**
     * 处置子公司及其他营业单位收到的现金净额
     * @return NCashDealSComp 处置子公司及其他营业单位收到的现金净额
     */
    public BigDecimal getNcashdealscomp() {
        return ncashdealscomp;
    }

    /**
     * 处置子公司及其他营业单位收到的现金净额
     * @param ncashdealscomp 处置子公司及其他营业单位收到的现金净额
     */
    public void setNcashdealscomp(BigDecimal ncashdealscomp) {
        this.ncashdealscomp = ncashdealscomp;
    }

    /**
     * 收到其他与投资活动有关的现金
     * @return OthCaFromInvAct 收到其他与投资活动有关的现金
     */
    public BigDecimal getOthcafrominvact() {
        return othcafrominvact;
    }

    /**
     * 收到其他与投资活动有关的现金
     * @param othcafrominvact 收到其他与投资活动有关的现金
     */
    public void setOthcafrominvact(BigDecimal othcafrominvact) {
        this.othcafrominvact = othcafrominvact;
    }

    /**
     * 投资活动现金流入特殊项目
     * @return SpeItemsICIF 投资活动现金流入特殊项目
     */
    public BigDecimal getSpeitemsicif() {
        return speitemsicif;
    }

    /**
     * 投资活动现金流入特殊项目
     * @param speitemsicif 投资活动现金流入特殊项目
     */
    public void setSpeitemsicif(BigDecimal speitemsicif) {
        this.speitemsicif = speitemsicif;
    }

    /**
     * 投资活动现金流入调整项目
     * @return AdjItemsICIF 投资活动现金流入调整项目
     */
    public BigDecimal getAdjitemsicif() {
        return adjitemsicif;
    }

    /**
     * 投资活动现金流入调整项目
     * @param adjitemsicif 投资活动现金流入调整项目
     */
    public void setAdjitemsicif(BigDecimal adjitemsicif) {
        this.adjitemsicif = adjitemsicif;
    }

    /**
     * 投资活动现金流入小计
     * @return SubInvCaInflow 投资活动现金流入小计
     */
    public BigDecimal getSubinvcainflow() {
        return subinvcainflow;
    }

    /**
     * 投资活动现金流入小计
     * @param subinvcainflow 投资活动现金流入小计
     */
    public void setSubinvcainflow(BigDecimal subinvcainflow) {
        this.subinvcainflow = subinvcainflow;
    }

    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     * @return FixInOAsAcCash 购建固定资产、无形资产和其他长期资产支付的现金
     */
    public BigDecimal getFixinoasaccash() {
        return fixinoasaccash;
    }

    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     * @param fixinoasaccash 购建固定资产、无形资产和其他长期资产支付的现金
     */
    public void setFixinoasaccash(BigDecimal fixinoasaccash) {
        this.fixinoasaccash = fixinoasaccash;
    }

    /**
     * 投资支付的现金
     * @return InvCashPaid 投资支付的现金
     */
    public BigDecimal getInvcashpaid() {
        return invcashpaid;
    }

    /**
     * 投资支付的现金
     * @param invcashpaid 投资支付的现金
     */
    public void setInvcashpaid(BigDecimal invcashpaid) {
        this.invcashpaid = invcashpaid;
    }

    /**
     * 取得子公司及其他营业单位支付的现金净额
     * @return NCashFromSComp 取得子公司及其他营业单位支付的现金净额
     */
    public BigDecimal getNcashfromscomp() {
        return ncashfromscomp;
    }

    /**
     * 取得子公司及其他营业单位支付的现金净额
     * @param ncashfromscomp 取得子公司及其他营业单位支付的现金净额
     */
    public void setNcashfromscomp(BigDecimal ncashfromscomp) {
        this.ncashfromscomp = ncashfromscomp;
    }

    /**
     * 质押贷款净增加额
     * @return ImLoanNetInc 质押贷款净增加额
     */
    public BigDecimal getImloannetinc() {
        return imloannetinc;
    }

    /**
     * 质押贷款净增加额
     * @param imloannetinc 质押贷款净增加额
     */
    public void setImloannetinc(BigDecimal imloannetinc) {
        this.imloannetinc = imloannetinc;
    }

    /**
     * 支付其他与投资活动有关的现金
     * @return OthCashToInvAct 支付其他与投资活动有关的现金
     */
    public BigDecimal getOthcashtoinvact() {
        return othcashtoinvact;
    }

    /**
     * 支付其他与投资活动有关的现金
     * @param othcashtoinvact 支付其他与投资活动有关的现金
     */
    public void setOthcashtoinvact(BigDecimal othcashtoinvact) {
        this.othcashtoinvact = othcashtoinvact;
    }

    /**
     * 投资活动现金流出特殊项目
     * @return SpeItemsICOF 投资活动现金流出特殊项目
     */
    public BigDecimal getSpeitemsicof() {
        return speitemsicof;
    }

    /**
     * 投资活动现金流出特殊项目
     * @param speitemsicof 投资活动现金流出特殊项目
     */
    public void setSpeitemsicof(BigDecimal speitemsicof) {
        this.speitemsicof = speitemsicof;
    }

    /**
     * 投资活动现金流出调整项目
     * @return AdjItemsICOF 投资活动现金流出调整项目
     */
    public BigDecimal getAdjitemsicof() {
        return adjitemsicof;
    }

    /**
     * 投资活动现金流出调整项目
     * @param adjitemsicof 投资活动现金流出调整项目
     */
    public void setAdjitemsicof(BigDecimal adjitemsicof) {
        this.adjitemsicof = adjitemsicof;
    }

    /**
     * 投资活动现金流出小计
     * @return SubInvCashOflow 投资活动现金流出小计
     */
    public BigDecimal getSubinvcashoflow() {
        return subinvcashoflow;
    }

    /**
     * 投资活动现金流出小计
     * @param subinvcashoflow 投资活动现金流出小计
     */
    public void setSubinvcashoflow(BigDecimal subinvcashoflow) {
        this.subinvcashoflow = subinvcashoflow;
    }

    /**
     * 投资活动现金流量净额调整项目
     * @return AdjItemsNICF 投资活动现金流量净额调整项目
     */
    public BigDecimal getAdjitemsnicf() {
        return adjitemsnicf;
    }

    /**
     * 投资活动现金流量净额调整项目
     * @param adjitemsnicf 投资活动现金流量净额调整项目
     */
    public void setAdjitemsnicf(BigDecimal adjitemsnicf) {
        this.adjitemsnicf = adjitemsnicf;
    }

    /**
     * 投资活动产生的现金流量净额
     * @return NetInvCashFlow 投资活动产生的现金流量净额
     */
    public BigDecimal getNetinvcashflow() {
        return netinvcashflow;
    }

    /**
     * 投资活动产生的现金流量净额
     * @param netinvcashflow 投资活动产生的现金流量净额
     */
    public void setNetinvcashflow(BigDecimal netinvcashflow) {
        this.netinvcashflow = netinvcashflow;
    }

    /**
     * 吸收投资收到的现金
     * @return CashFromInv 吸收投资收到的现金
     */
    public BigDecimal getCashfrominv() {
        return cashfrominv;
    }

    /**
     * 吸收投资收到的现金
     * @param cashfrominv 吸收投资收到的现金
     */
    public void setCashfrominv(BigDecimal cashfrominv) {
        this.cashfrominv = cashfrominv;
    }

    /**
     * 其中:子公司吸收少数股东投资收到的现金
     * @return CFMinoSInvSub 其中:子公司吸收少数股东投资收到的现金
     */
    public BigDecimal getCfminosinvsub() {
        return cfminosinvsub;
    }

    /**
     * 其中:子公司吸收少数股东投资收到的现金
     * @param cfminosinvsub 其中:子公司吸收少数股东投资收到的现金
     */
    public void setCfminosinvsub(BigDecimal cfminosinvsub) {
        this.cfminosinvsub = cfminosinvsub;
    }

    /**
     * 发行债券收到的现金
     * @return CFBondsIssue 发行债券收到的现金
     */
    public BigDecimal getCfbondsissue() {
        return cfbondsissue;
    }

    /**
     * 发行债券收到的现金
     * @param cfbondsissue 发行债券收到的现金
     */
    public void setCfbondsissue(BigDecimal cfbondsissue) {
        this.cfbondsissue = cfbondsissue;
    }

    /**
     * 取得借款收到的现金
     * @return CFBorrowing 取得借款收到的现金
     */
    public BigDecimal getCfborrowing() {
        return cfborrowing;
    }

    /**
     * 取得借款收到的现金
     * @param cfborrowing 取得借款收到的现金
     */
    public void setCfborrowing(BigDecimal cfborrowing) {
        this.cfborrowing = cfborrowing;
    }

    /**
     * 收到其他与筹资活动有关的现金
     * @return OthFinActCash 收到其他与筹资活动有关的现金
     */
    public BigDecimal getOthfinactcash() {
        return othfinactcash;
    }

    /**
     * 收到其他与筹资活动有关的现金
     * @param othfinactcash 收到其他与筹资活动有关的现金
     */
    public void setOthfinactcash(BigDecimal othfinactcash) {
        this.othfinactcash = othfinactcash;
    }

    /**
     * 筹资活动现金流入特殊项目
     * @return SpeItemsFCIF 筹资活动现金流入特殊项目
     */
    public BigDecimal getSpeitemsfcif() {
        return speitemsfcif;
    }

    /**
     * 筹资活动现金流入特殊项目
     * @param speitemsfcif 筹资活动现金流入特殊项目
     */
    public void setSpeitemsfcif(BigDecimal speitemsfcif) {
        this.speitemsfcif = speitemsfcif;
    }

    /**
     * 筹资活动现金流入调整项目
     * @return AdjItemsFCIF 筹资活动现金流入调整项目
     */
    public BigDecimal getAdjitemsfcif() {
        return adjitemsfcif;
    }

    /**
     * 筹资活动现金流入调整项目
     * @param adjitemsfcif 筹资活动现金流入调整项目
     */
    public void setAdjitemsfcif(BigDecimal adjitemsfcif) {
        this.adjitemsfcif = adjitemsfcif;
    }

    /**
     * 筹资活动现金流入小计
     * @return SubFinCashInfl 筹资活动现金流入小计
     */
    public BigDecimal getSubfincashinfl() {
        return subfincashinfl;
    }

    /**
     * 筹资活动现金流入小计
     * @param subfincashinfl 筹资活动现金流入小计
     */
    public void setSubfincashinfl(BigDecimal subfincashinfl) {
        this.subfincashinfl = subfincashinfl;
    }

    /**
     * 偿还债务支付的现金
     * @return BorRepayment 偿还债务支付的现金
     */
    public BigDecimal getBorrepayment() {
        return borrepayment;
    }

    /**
     * 偿还债务支付的现金
     * @param borrepayment 偿还债务支付的现金
     */
    public void setBorrepayment(BigDecimal borrepayment) {
        this.borrepayment = borrepayment;
    }

    /**
     * 分配股利、利润或偿付利息支付的现金
     * @return DivIntPayment 分配股利、利润或偿付利息支付的现金
     */
    public BigDecimal getDivintpayment() {
        return divintpayment;
    }

    /**
     * 分配股利、利润或偿付利息支付的现金
     * @param divintpayment 分配股利、利润或偿付利息支付的现金
     */
    public void setDivintpayment(BigDecimal divintpayment) {
        this.divintpayment = divintpayment;
    }

    /**
     * 其中:子公司支付给少数股东的股利、利润或偿付的利息
     * @return ProFromSubTMiS 其中:子公司支付给少数股东的股利、利润或偿付的利息
     */
    public BigDecimal getProfromsubtmis() {
        return profromsubtmis;
    }

    /**
     * 其中:子公司支付给少数股东的股利、利润或偿付的利息
     * @param profromsubtmis 其中:子公司支付给少数股东的股利、利润或偿付的利息
     */
    public void setProfromsubtmis(BigDecimal profromsubtmis) {
        this.profromsubtmis = profromsubtmis;
    }

    /**
     * 支付其他与筹资活动有关的现金
     * @return OthFinActP 支付其他与筹资活动有关的现金
     */
    public BigDecimal getOthfinactp() {
        return othfinactp;
    }

    /**
     * 支付其他与筹资活动有关的现金
     * @param othfinactp 支付其他与筹资活动有关的现金
     */
    public void setOthfinactp(BigDecimal othfinactp) {
        this.othfinactp = othfinactp;
    }

    /**
     * 筹资活动现金流出特殊项目
     * @return SpeItemsFCOF 筹资活动现金流出特殊项目
     */
    public BigDecimal getSpeitemsfcof() {
        return speitemsfcof;
    }

    /**
     * 筹资活动现金流出特殊项目
     * @param speitemsfcof 筹资活动现金流出特殊项目
     */
    public void setSpeitemsfcof(BigDecimal speitemsfcof) {
        this.speitemsfcof = speitemsfcof;
    }

    /**
     * 筹资活动现金流出调整项目
     * @return AdjItemsFCOF 筹资活动现金流出调整项目
     */
    public BigDecimal getAdjitemsfcof() {
        return adjitemsfcof;
    }

    /**
     * 筹资活动现金流出调整项目
     * @param adjitemsfcof 筹资活动现金流出调整项目
     */
    public void setAdjitemsfcof(BigDecimal adjitemsfcof) {
        this.adjitemsfcof = adjitemsfcof;
    }

    /**
     * 筹资活动现金流出小计
     * @return SubFinCOflow 筹资活动现金流出小计
     */
    public BigDecimal getSubfincoflow() {
        return subfincoflow;
    }

    /**
     * 筹资活动现金流出小计
     * @param subfincoflow 筹资活动现金流出小计
     */
    public void setSubfincoflow(BigDecimal subfincoflow) {
        this.subfincoflow = subfincoflow;
    }

    /**
     * 筹资活动流量现金净额调整项目
     * @return AdjItemsNFCF 筹资活动流量现金净额调整项目
     */
    public BigDecimal getAdjitemsnfcf() {
        return adjitemsnfcf;
    }

    /**
     * 筹资活动流量现金净额调整项目
     * @param adjitemsnfcf 筹资活动流量现金净额调整项目
     */
    public void setAdjitemsnfcf(BigDecimal adjitemsnfcf) {
        this.adjitemsnfcf = adjitemsnfcf;
    }

    /**
     * 筹资活动产生的现金流量净额
     * @return NetFinCashFlow 筹资活动产生的现金流量净额
     */
    public BigDecimal getNetfincashflow() {
        return netfincashflow;
    }

    /**
     * 筹资活动产生的现金流量净额
     * @param netfincashflow 筹资活动产生的现金流量净额
     */
    public void setNetfincashflow(BigDecimal netfincashflow) {
        this.netfincashflow = netfincashflow;
    }

    /**
     * 汇率变动对现金的影响
     * @return ExRateChgEffect 汇率变动对现金的影响
     */
    public BigDecimal getExratechgeffect() {
        return exratechgeffect;
    }

    /**
     * 汇率变动对现金的影响
     * @param exratechgeffect 汇率变动对现金的影响
     */
    public void setExratechgeffect(BigDecimal exratechgeffect) {
        this.exratechgeffect = exratechgeffect;
    }

    /**
     * 影响现金及现金等价物的其他科目
     * @return OthItemsEffCE 影响现金及现金等价物的其他科目
     */
    public BigDecimal getOthitemseffce() {
        return othitemseffce;
    }

    /**
     * 影响现金及现金等价物的其他科目
     * @param othitemseffce 影响现金及现金等价物的其他科目
     */
    public void setOthitemseffce(BigDecimal othitemseffce) {
        this.othitemseffce = othitemseffce;
    }

    /**
     * 影响现金及现金等价物的调整项目
     * @return AdjItemsCE 影响现金及现金等价物的调整项目
     */
    public BigDecimal getAdjitemsce() {
        return adjitemsce;
    }

    /**
     * 影响现金及现金等价物的调整项目
     * @param adjitemsce 影响现金及现金等价物的调整项目
     */
    public void setAdjitemsce(BigDecimal adjitemsce) {
        this.adjitemsce = adjitemsce;
    }

    /**
     * 现金及现金等价物净增加额
     * @return CEquInc 现金及现金等价物净增加额
     */
    public BigDecimal getCequinc() {
        return cequinc;
    }

    /**
     * 现金及现金等价物净增加额
     * @param cequinc 现金及现金等价物净增加额
     */
    public void setCequinc(BigDecimal cequinc) {
        this.cequinc = cequinc;
    }

    /**
     * 期初现金及现金等价物余额(元)
     * @return BeginPeriodCash 期初现金及现金等价物余额(元)
     */
    public BigDecimal getBeginperiodcash() {
        return beginperiodcash;
    }

    /**
     * 期初现金及现金等价物余额(元)
     * @param beginperiodcash 期初现金及现金等价物余额(元)
     */
    public void setBeginperiodcash(BigDecimal beginperiodcash) {
        this.beginperiodcash = beginperiodcash;
    }

    /**
     * ##现金及现金等价物净增加额的调整项目(元)
     * @return AdjItemsCEI ##现金及现金等价物净增加额的调整项目(元)
     */
    public BigDecimal getAdjitemscei() {
        return adjitemscei;
    }

    /**
     * ##现金及现金等价物净增加额的调整项目(元)
     * @param adjitemscei ##现金及现金等价物净增加额的调整项目(元)
     */
    public void setAdjitemscei(BigDecimal adjitemscei) {
        this.adjitemscei = adjitemscei;
    }

    /**
     * ##现金及现金等价物净增加额的特殊项目(元)
     * @return OtherItemEffCEI ##现金及现金等价物净增加额的特殊项目(元)
     */
    public BigDecimal getOtheritemeffcei() {
        return otheritemeffcei;
    }

    /**
     * ##现金及现金等价物净增加额的特殊项目(元)
     * @param otheritemeffcei ##现金及现金等价物净增加额的特殊项目(元)
     */
    public void setOtheritemeffcei(BigDecimal otheritemeffcei) {
        this.otheritemeffcei = otheritemeffcei;
    }

    /**
     * 期末现金及现金等价物余额
     * @return EndPerCEqu 期末现金及现金等价物余额
     */
    public BigDecimal getEndpercequ() {
        return endpercequ;
    }

    /**
     * 期末现金及现金等价物余额
     * @param endpercequ 期末现金及现金等价物余额
     */
    public void setEndpercequ(BigDecimal endpercequ) {
        this.endpercequ = endpercequ;
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
     * 加:资产减值准备
     * @return ADepreReserves 加:资产减值准备
     */
    public BigDecimal getAdeprereserves() {
        return adeprereserves;
    }

    /**
     * 加:资产减值准备
     * @param adeprereserves 加:资产减值准备
     */
    public void setAdeprereserves(BigDecimal adeprereserves) {
        this.adeprereserves = adeprereserves;
    }

    /**
     * 固定资产折旧、油气资产折耗、生产性生物资产折旧
     * @return FAssetDep 固定资产折旧、油气资产折耗、生产性生物资产折旧
     */
    public BigDecimal getFassetdep() {
        return fassetdep;
    }

    /**
     * 固定资产折旧、油气资产折耗、生产性生物资产折旧
     * @param fassetdep 固定资产折旧、油气资产折耗、生产性生物资产折旧
     */
    public void setFassetdep(BigDecimal fassetdep) {
        this.fassetdep = fassetdep;
    }

    /**
     * 无形资产摊销
     * @return IntAAmort 无形资产摊销
     */
    public BigDecimal getIntaamort() {
        return intaamort;
    }

    /**
     * 无形资产摊销
     * @param intaamort 无形资产摊销
     */
    public void setIntaamort(BigDecimal intaamort) {
        this.intaamort = intaamort;
    }

    /**
     * 长期待摊费用摊销
     * @return DefExpAmort 长期待摊费用摊销
     */
    public BigDecimal getDefexpamort() {
        return defexpamort;
    }

    /**
     * 长期待摊费用摊销
     * @param defexpamort 长期待摊费用摊销
     */
    public void setDefexpamort(BigDecimal defexpamort) {
        this.defexpamort = defexpamort;
    }

    /**
     * 待摊费用减少(减:增加)
     * @return DefExpDecd 待摊费用减少(减:增加)
     */
    public BigDecimal getDefexpdecd() {
        return defexpdecd;
    }

    /**
     * 待摊费用减少(减:增加)
     * @param defexpdecd 待摊费用减少(减:增加)
     */
    public void setDefexpdecd(BigDecimal defexpdecd) {
        this.defexpdecd = defexpdecd;
    }

    /**
     * 预提费用增加(减:减少)
     * @return AccExpenseAdded 预提费用增加(减:减少)
     */
    public BigDecimal getAccexpenseadded() {
        return accexpenseadded;
    }

    /**
     * 预提费用增加(减:减少)
     * @param accexpenseadded 预提费用增加(减:减少)
     */
    public void setAccexpenseadded(BigDecimal accexpenseadded) {
        this.accexpenseadded = accexpenseadded;
    }

    /**
     * 处置固定资产、无形资产和其他长期资产的损失
     * @return FixInOthADLoss 处置固定资产、无形资产和其他长期资产的损失
     */
    public BigDecimal getFixinothadloss() {
        return fixinothadloss;
    }

    /**
     * 处置固定资产、无形资产和其他长期资产的损失
     * @param fixinothadloss 处置固定资产、无形资产和其他长期资产的损失
     */
    public void setFixinothadloss(BigDecimal fixinothadloss) {
        this.fixinothadloss = fixinothadloss;
    }

    /**
     * 固定资产报废损失
     * @return FixedAssetSLoss 固定资产报废损失
     */
    public BigDecimal getFixedassetsloss() {
        return fixedassetsloss;
    }

    /**
     * 固定资产报废损失
     * @param fixedassetsloss 固定资产报废损失
     */
    public void setFixedassetsloss(BigDecimal fixedassetsloss) {
        this.fixedassetsloss = fixedassetsloss;
    }

    /**
     * 公允价值变动损失
     * @return LFromFValueChg 公允价值变动损失
     */
    public BigDecimal getLfromfvaluechg() {
        return lfromfvaluechg;
    }

    /**
     * 公允价值变动损失
     * @param lfromfvaluechg 公允价值变动损失
     */
    public void setLfromfvaluechg(BigDecimal lfromfvaluechg) {
        this.lfromfvaluechg = lfromfvaluechg;
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
     * 投资损失(元)
     * @return InvestLoss 投资损失(元)
     */
    public BigDecimal getInvestloss() {
        return investloss;
    }

    /**
     * 投资损失(元)
     * @param investloss 投资损失(元)
     */
    public void setInvestloss(BigDecimal investloss) {
        this.investloss = investloss;
    }

    /**
     * 递延所得税资产减少
     * @return DefTaxAssetDec 递延所得税资产减少
     */
    public BigDecimal getDeftaxassetdec() {
        return deftaxassetdec;
    }

    /**
     * 递延所得税资产减少
     * @param deftaxassetdec 递延所得税资产减少
     */
    public void setDeftaxassetdec(BigDecimal deftaxassetdec) {
        this.deftaxassetdec = deftaxassetdec;
    }

    /**
     * 递延所得税负债增加
     * @return DefTaxLiaInc 递延所得税负债增加
     */
    public BigDecimal getDeftaxliainc() {
        return deftaxliainc;
    }

    /**
     * 递延所得税负债增加
     * @param deftaxliainc 递延所得税负债增加
     */
    public void setDeftaxliainc(BigDecimal deftaxliainc) {
        this.deftaxliainc = deftaxliainc;
    }

    /**
     * 存货的减少
     * @return InvDec 存货的减少
     */
    public BigDecimal getInvdec() {
        return invdec;
    }

    /**
     * 存货的减少
     * @param invdec 存货的减少
     */
    public void setInvdec(BigDecimal invdec) {
        this.invdec = invdec;
    }

    /**
     * 经营性应收项目的减少
     * @return OpeRecDec 经营性应收项目的减少
     */
    public BigDecimal getOperecdec() {
        return operecdec;
    }

    /**
     * 经营性应收项目的减少
     * @param operecdec 经营性应收项目的减少
     */
    public void setOperecdec(BigDecimal operecdec) {
        this.operecdec = operecdec;
    }

    /**
     * 经营性应付项目的增加
     * @return OpePayableInc 经营性应付项目的增加
     */
    public BigDecimal getOpepayableinc() {
        return opepayableinc;
    }

    /**
     * 经营性应付项目的增加
     * @param opepayableinc 经营性应付项目的增加
     */
    public void setOpepayableinc(BigDecimal opepayableinc) {
        this.opepayableinc = opepayableinc;
    }

    /**
     * 其他(元)
     * @return Others 其他(元)
     */
    public BigDecimal getOthers() {
        return others;
    }

    /**
     * 其他(元)
     * @param others 其他(元)
     */
    public void setOthers(BigDecimal others) {
        this.others = others;
    }

    /**
     * (附注)经营活动现金流量净额特殊项目
     * @return SpeItemsNOCF1 (附注)经营活动现金流量净额特殊项目
     */
    public BigDecimal getSpeitemsnocf1() {
        return speitemsnocf1;
    }

    /**
     * (附注)经营活动现金流量净额特殊项目
     * @param speitemsnocf1 (附注)经营活动现金流量净额特殊项目
     */
    public void setSpeitemsnocf1(BigDecimal speitemsnocf1) {
        this.speitemsnocf1 = speitemsnocf1;
    }

    /**
     * (附注)经营活动现金流量净额调整项目
     * @return AdjItemsNOCF1 (附注)经营活动现金流量净额调整项目
     */
    public BigDecimal getAdjitemsnocf1() {
        return adjitemsnocf1;
    }

    /**
     * (附注)经营活动现金流量净额调整项目
     * @param adjitemsnocf1 (附注)经营活动现金流量净额调整项目
     */
    public void setAdjitemsnocf1(BigDecimal adjitemsnocf1) {
        this.adjitemsnocf1 = adjitemsnocf1;
    }

    /**
     * (附注)经营活动产生的现金流量净额
     * @return NetOpeCFNotes (附注)经营活动产生的现金流量净额
     */
    public BigDecimal getNetopecfnotes() {
        return netopecfnotes;
    }

    /**
     * (附注)经营活动产生的现金流量净额
     * @param netopecfnotes (附注)经营活动产生的现金流量净额
     */
    public void setNetopecfnotes(BigDecimal netopecfnotes) {
        this.netopecfnotes = netopecfnotes;
    }

    /**
     * 加:经营流量净额前后对比调整项目
     * @return ConAdjNOCF 加:经营流量净额前后对比调整项目
     */
    public BigDecimal getConadjnocf() {
        return conadjnocf;
    }

    /**
     * 加:经营流量净额前后对比调整项目
     * @param conadjnocf 加:经营流量净额前后对比调整项目
     */
    public void setConadjnocf(BigDecimal conadjnocf) {
        this.conadjnocf = conadjnocf;
    }

    /**
     * 债务转为资本
     * @return DebtToCap 债务转为资本
     */
    public BigDecimal getDebttocap() {
        return debttocap;
    }

    /**
     * 债务转为资本
     * @param debttocap 债务转为资本
     */
    public void setDebttocap(BigDecimal debttocap) {
        this.debttocap = debttocap;
    }

    /**
     * 一年内到期的可转换公司债券
     * @return CBsExpWithin1Y 一年内到期的可转换公司债券
     */
    public BigDecimal getCbsexpwithin1y() {
        return cbsexpwithin1y;
    }

    /**
     * 一年内到期的可转换公司债券
     * @param cbsexpwithin1y 一年内到期的可转换公司债券
     */
    public void setCbsexpwithin1y(BigDecimal cbsexpwithin1y) {
        this.cbsexpwithin1y = cbsexpwithin1y;
    }

    /**
     * 融资租入固定资产
     * @return FixedAFinLeases 融资租入固定资产
     */
    public BigDecimal getFixedafinleases() {
        return fixedafinleases;
    }

    /**
     * 融资租入固定资产
     * @param fixedafinleases 融资租入固定资产
     */
    public void setFixedafinleases(BigDecimal fixedafinleases) {
        this.fixedafinleases = fixedafinleases;
    }

    /**
     * 现金的期末余额(元)
     * @return CashAtEndOfYear 现金的期末余额(元)
     */
    public BigDecimal getCashatendofyear() {
        return cashatendofyear;
    }

    /**
     * 现金的期末余额(元)
     * @param cashatendofyear 现金的期末余额(元)
     */
    public void setCashatendofyear(BigDecimal cashatendofyear) {
        this.cashatendofyear = cashatendofyear;
    }

    /**
     * 减:现金的期初余额
     * @return CashAtBOfYear 减:现金的期初余额
     */
    public BigDecimal getCashatbofyear() {
        return cashatbofyear;
    }

    /**
     * 减:现金的期初余额
     * @param cashatbofyear 减:现金的期初余额
     */
    public void setCashatbofyear(BigDecimal cashatbofyear) {
        this.cashatbofyear = cashatbofyear;
    }

    /**
     * 加:现金等价物的期末余额
     * @return CEquAtEOfYear 加:现金等价物的期末余额
     */
    public BigDecimal getCequateofyear() {
        return cequateofyear;
    }

    /**
     * 加:现金等价物的期末余额
     * @param cequateofyear 加:现金等价物的期末余额
     */
    public void setCequateofyear(BigDecimal cequateofyear) {
        this.cequateofyear = cequateofyear;
    }

    /**
     * 减:现金等价物的期初余额
     * @return CEquAtBeginning 减:现金等价物的期初余额
     */
    public BigDecimal getCequatbeginning() {
        return cequatbeginning;
    }

    /**
     * 减:现金等价物的期初余额
     * @param cequatbeginning 减:现金等价物的期初余额
     */
    public void setCequatbeginning(BigDecimal cequatbeginning) {
        this.cequatbeginning = cequatbeginning;
    }

    /**
     * 加:现金净额前后对比调整项目
     * @return ConAdjNC 加:现金净额前后对比调整项目
     */
    public BigDecimal getConadjnc() {
        return conadjnc;
    }

    /**
     * 加:现金净额前后对比调整项目
     * @param conadjnc 加:现金净额前后对比调整项目
     */
    public void setConadjnc(BigDecimal conadjnc) {
        this.conadjnc = conadjnc;
    }

    /**
     * (附注)现金特殊项目
     * @return SpeItemsC (附注)现金特殊项目
     */
    public BigDecimal getSpeitemsc() {
        return speitemsc;
    }

    /**
     * (附注)现金特殊项目
     * @param speitemsc (附注)现金特殊项目
     */
    public void setSpeitemsc(BigDecimal speitemsc) {
        this.speitemsc = speitemsc;
    }

    /**
     * (附注)现金调整项目
     * @return AdjItemsC (附注)现金调整项目
     */
    public BigDecimal getAdjitemsc() {
        return adjitemsc;
    }

    /**
     * (附注)现金调整项目
     * @param adjitemsc (附注)现金调整项目
     */
    public void setAdjitemsc(BigDecimal adjitemsc) {
        this.adjitemsc = adjitemsc;
    }

    /**
     * (附注)现金及现金等价物净增加额
     * @return NetIncrInCEqu (附注)现金及现金等价物净增加额
     */
    public BigDecimal getNetincrincequ() {
        return netincrincequ;
    }

    /**
     * (附注)现金及现金等价物净增加额
     * @param netincrincequ (附注)现金及现金等价物净增加额
     */
    public void setNetincrincequ(BigDecimal netincrincequ) {
        this.netincrincequ = netincrincequ;
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