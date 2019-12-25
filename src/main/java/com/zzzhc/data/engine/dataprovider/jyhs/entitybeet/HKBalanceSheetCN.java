package com.zzzhc.data.engine.dataprovider.jyhs.entitybeet;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * hk_balancesheetcn
 */
@Entity(name = "hk_balancesheetcn")
public class HKBalanceSheetCN {
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
     * 货币资金/现金及存放中央银行款项(元)
     */
    @Column(name = "CashEquivalents")
    private BigDecimal cashequivalents;

    /**
     * 其中:客户资金存款(元)
     */
    @Column(name = "ClientDeposit")
    private BigDecimal clientdeposit;

    /**
     * 交易性金融资产(元)
     */
    @Column(name = "TradingAssets")
    private BigDecimal tradingassets;

    /**
     * 应收票据(元)
     */
    @Column(name = "BillReceivable")
    private BigDecimal billreceivable;

    /**
     * 应收股利(元)
     */
    @Column(name = "DivReceivable")
    private BigDecimal divreceivable;

    /**
     * 应收利息(元)
     */
    @Column(name = "IntReceivable")
    private BigDecimal intreceivable;

    /**
     * 应收账款
     */
    @Column(name = "AccReceivable")
    private BigDecimal accreceivable;

    /**
     * 其他应收款(元)
     */
    @Column(name = "OtherReceivable")
    private BigDecimal otherreceivable;

    /**
     * 预付款项(元)
     */
    @Column(name = "AdvancePayment")
    private BigDecimal advancepayment;

    /**
     * 存货(元)
     */
    @Column(name = "Inventories")
    private BigDecimal inventories;

    /**
     * 其中:消耗性生物资产
     */
    @Column(name = "BearerBiolAssets")
    private BigDecimal bearerbiolassets;

    /**
     * 待摊费用
     */
    @Column(name = "DefExpense")
    private BigDecimal defexpense;

    /**
     * 划分为持有待售的资产(元)
     */
    @Column(name = "HoldAndFSAssets")
    private BigDecimal holdandfsassets;

    /**
     * 一年内到期的非流动资产
     */
    @Column(name = "NonCurAssetIn1Y")
    private BigDecimal noncurassetin1y;

    /**
     * 其他流动资产
     */
    @Column(name = "OtherCurAssets")
    private BigDecimal othercurassets;

    /**
     * 流动资产特殊项目
     */
    @Column(name = "CAExcepItems")
    private BigDecimal caexcepitems;

    /**
     * 流动资产调整项目
     */
    @Column(name = "CAAdjItems")
    private BigDecimal caadjitems;

    /**
     * 流动资产合计
     */
    @Column(name = "TotalCurAssets")
    private BigDecimal totalcurassets;

    /**
     * 可供出售金融资产
     */
    @Column(name = "HForSaleAssets")
    private BigDecimal hforsaleassets;

    /**
     * 持有至到期投资
     */
    @Column(name = "HoldToMatInv")
    private BigDecimal holdtomatinv;

    /**
     * 投资性房地产
     */
    @Column(name = "InvProperty")
    private BigDecimal invproperty;

    /**
     * 长期股权投资
     */
    @Column(name = "LtermEquInvest")
    private BigDecimal ltermequinvest;

    /**
     * 长期应收款
     */
    @Column(name = "LtermReceAcc")
    private BigDecimal ltermreceacc;

    /**
     * 固定资产(元)
     */
    @Column(name = "FixedAssets")
    private BigDecimal fixedassets;

    /**
     * 工程物资
     */
    @Column(name = "ConsMaterials")
    private BigDecimal consmaterials;

    /**
     * 在建工程
     */
    @Column(name = "ConsInProcess")
    private BigDecimal consinprocess;

    /**
     * 固定资产清理
     */
    @Column(name = "FixedAssetsLiq")
    private BigDecimal fixedassetsliq;

    /**
     * 生产性生物资产
     */
    @Column(name = "BiolAssets")
    private BigDecimal biolassets;

    /**
     * 油气资产(元)
     */
    @Column(name = "OilGasAssets")
    private BigDecimal oilgasassets;

    /**
     * 无形资产
     */
    @Column(name = "IntAssets")
    private BigDecimal intassets;

    /**
     * 其中:交易席位费(元)
     */
    @Column(name = "SeatCosts")
    private BigDecimal seatcosts;

    /**
     * 开发支出
     */
    @Column(name = "DeveExpenditure")
    private BigDecimal deveexpenditure;

    /**
     * 商誉(元)
     */
    @Column(name = "GoodWill")
    private BigDecimal goodwill;

    /**
     * 长期待摊费用
     */
    @Column(name = "LongDefExpense")
    private BigDecimal longdefexpense;

    /**
     * 递延所得税资产
     */
    @Column(name = "DefTaxAssets")
    private BigDecimal deftaxassets;

    /**
     * 其他非流动资产
     */
    @Column(name = "OtherNonCurAssets")
    private BigDecimal othernoncurassets;

    /**
     * 非流动资产特殊项目
     */
    @Column(name = "NCAExcepItems")
    private BigDecimal ncaexcepitems;

    /**
     * 非流动资产调整项目
     */
    @Column(name = "NCAAdjItems")
    private BigDecimal ncaadjitems;

    /**
     * 非流动资产合计
     */
    @Column(name = "TotNonCurAssets")
    private BigDecimal totnoncurassets;

    /**
     * 投资-贷款及应收账款(应收账款类投资)
     */
    @Column(name = "LoanAndAccRece")
    private BigDecimal loanandaccrece;

    /**
     * 结算备付金
     */
    @Column(name = "SettlProvi")
    private BigDecimal settlprovi;

    /**
     * 其中:客户备付金(元)
     */
    @Column(name = "ClientProvi")
    private BigDecimal clientprovi;

    /**
     * 存放同业款项
     */
    @Column(name = "DepInInterbank")
    private BigDecimal depininterbank;

    /**
     * 贵金属(元)
     */
    @Column(name = "Rmetal")
    private BigDecimal rmetal;

    /**
     * 拆出资金(元)
     */
    @Column(name = "LendCapital")
    private BigDecimal lendcapital;

    /**
     * 衍生金融资产
     */
    @Column(name = "DerAssets")
    private BigDecimal derassets;

    /**
     * 买入返售金融资产
     */
    @Column(name = "BSbackAssets")
    private BigDecimal bsbackassets;

    /**
     * 发放贷款和垫款(元)
     */
    @Column(name = "LoanAndAdvance")
    private BigDecimal loanandadvance;

    /**
     * 应收保费
     */
    @Column(name = "InsReceivables")
    private BigDecimal insreceivables;

    /**
     * 应收代位追偿款
     */
    @Column(name = "ReceSubFee")
    private BigDecimal recesubfee;

    /**
     * 应收分保账款
     */
    @Column(name = "ReinRece")
    private BigDecimal reinrece;

    /**
     * 应收分保未到期责任准备金
     */
    @Column(name = "ReceUnearnedR")
    private BigDecimal receunearnedr;

    /**
     * 应收分保未决赔款准备金
     */
    @Column(name = "ReceClaimsR")
    private BigDecimal receclaimsr;

    /**
     * 应收分保寿险责任准备金
     */
    @Column(name = "ReceLifeR")
    private BigDecimal recelifer;

    /**
     * 应收分保长期健康险责任准备金
     */
    @Column(name = "ReceLTHealthR")
    private BigDecimal recelthealthr;

    /**
     * 保户质押贷款
     */
    @Column(name = "InsImpawnLoan")
    private BigDecimal insimpawnloan;

    /**
     * 定期存款(元)
     */
    @Column(name = "FixedDeposit")
    private BigDecimal fixeddeposit;

    /**
     * 存出保证金
     */
    @Column(name = "RefDeposit")
    private BigDecimal refdeposit;

    /**
     * 存出资本保证金
     */
    @Column(name = "RefCapDeposit")
    private BigDecimal refcapdeposit;

    /**
     * 独立账户资产
     */
    @Column(name = "IndepAccAssets")
    private BigDecimal indepaccassets;

    /**
     * 其他资产(元)
     */
    @Column(name = "OtherAssets")
    private BigDecimal otherassets;

    /**
     * 资产特殊项目
     */
    @Column(name = "AExcepItems")
    private BigDecimal aexcepitems;

    /**
     * 资产调整项目
     */
    @Column(name = "AAdjItems")
    private BigDecimal aadjitems;

    /**
     * 资产总计(元)
     */
    @Column(name = "TotalAssets")
    private BigDecimal totalassets;

    /**
     * 短期借款(元)
     */
    @Column(name = "ShortTermLoan")
    private BigDecimal shorttermloan;

    /**
     * 其中:质押借款(元)
     */
    @Column(name = "ImpawnedLoan")
    private BigDecimal impawnedloan;

    /**
     * 应付短期债券
     */
    @Column(name = "STBPayable")
    private BigDecimal stbpayable;

    /**
     * 交易性金融负债
     */
    @Column(name = "TradingLia")
    private BigDecimal tradinglia;

    /**
     * 应付票据(元)
     */
    @Column(name = "NotesPayable")
    private BigDecimal notespayable;

    /**
     * 应付账款
     */
    @Column(name = "AccPayable")
    private BigDecimal accpayable;

    /**
     * 预收账款
     */
    @Column(name = "AdvanceRece")
    private BigDecimal advancerece;

    /**
     * 应付职工薪酬
     */
    @Column(name = "SalaPayable")
    private BigDecimal salapayable;

    /**
     * 应付股利
     */
    @Column(name = "DiviPayable")
    private BigDecimal divipayable;

    /**
     * 应交税费(元)
     */
    @Column(name = "TaxsPayable")
    private BigDecimal taxspayable;

    /**
     * 应付利息
     */
    @Column(name = "IntePayable")
    private BigDecimal intepayable;

    /**
     * 其他应付款(元)
     */
    @Column(name = "OtherPayable")
    private BigDecimal otherpayable;

    /**
     * 预提费用
     */
    @Column(name = "AccrExpense")
    private BigDecimal accrexpense;

    /**
     * 递延收益
     */
    @Column(name = "DefProceeds")
    private BigDecimal defproceeds;

    /**
     * 划分为持有待售的负债(元)
     */
    @Column(name = "HoldAndFSLi")
    private BigDecimal holdandfsli;

    /**
     * 一年内到期的非流动负债
     */
    @Column(name = "NonCurLiaIn1Y")
    private BigDecimal noncurliain1y;

    /**
     * 其他流动负债
     */
    @Column(name = "OtherCurLia")
    private BigDecimal othercurlia;

    /**
     * 流动负债特殊项目
     */
    @Column(name = "CLExcepItems")
    private BigDecimal clexcepitems;

    /**
     * 流动负债调整项目
     */
    @Column(name = "CLAdjItems")
    private BigDecimal cladjitems;

    /**
     * 流动负债合计
     */
    @Column(name = "TotalCurLia")
    private BigDecimal totalcurlia;

    /**
     * 长期借款(元)
     */
    @Column(name = "LongtermLoan")
    private BigDecimal longtermloan;

    /**
     * 应付债券(元)
     */
    @Column(name = "BondsPayable")
    private BigDecimal bondspayable;

    /**
     * 其中:优先股(应付债券)(元)
     */
    @Column(name = "LPreferStock")
    private BigDecimal lpreferstock;

    /**
     * 其中:永续债(应付债券)
     */
    @Column(name = "LPerpDebt")
    private BigDecimal lperpdebt;

    /**
     * 长期应付款
     */
    @Column(name = "LTAccPayable")
    private BigDecimal ltaccpayable;

    /**
     * 长期应付职工薪酬
     */
    @Column(name = "LongSalaPay")
    private BigDecimal longsalapay;

    /**
     * 专项应付款
     */
    @Column(name = "SpecAccPayable")
    private BigDecimal specaccpayable;

    /**
     * 预计负债
     */
    @Column(name = "EstimateLia")
    private BigDecimal estimatelia;

    /**
     * 递延所得税负债
     */
    @Column(name = "DefTaxLia")
    private BigDecimal deftaxlia;

    /**
     * 递延收益
     */
    @Column(name = "DefIncome")
    private BigDecimal defincome;

    /**
     * 其他非流动负债
     */
    @Column(name = "OtherNonCurLia")
    private BigDecimal othernoncurlia;

    /**
     * 非流动负债特殊项目
     */
    @Column(name = "NCLExcepItems")
    private BigDecimal nclexcepitems;

    /**
     * 非流动负债调整项目
     */
    @Column(name = "NCLAdjItems")
    private BigDecimal ncladjitems;

    /**
     * 非流动负债合计
     */
    @Column(name = "TotalNonCurLia")
    private BigDecimal totalnoncurlia;

    /**
     * 向中央银行借款
     */
    @Column(name = "BorFromCB")
    private BigDecimal borfromcb;

    /**
     * 同业及其他金融机构存放款项
     */
    @Column(name = "DepOfInterbank")
    private BigDecimal depofinterbank;

    /**
     * 拆入资金
     */
    @Column(name = "BorCapital")
    private BigDecimal borcapital;

    /**
     * 衍生金融负债
     */
    @Column(name = "DeriLia")
    private BigDecimal derilia;

    /**
     * 卖出回购金融资产款
     */
    @Column(name = "SBbackSecuPros")
    private BigDecimal sbbacksecupros;

    /**
     * 吸收存款(元)
     */
    @Column(name = "Deposit")
    private BigDecimal deposit;

    /**
     * 代理买卖证券款
     */
    @Column(name = "ProSecuPros")
    private BigDecimal prosecupros;

    /**
     * 代理承销证券款
     */
    @Column(name = "SubIssSecuPros")
    private BigDecimal subisssecupros;

    /**
     * 存入保证金
     */
    @Column(name = "DepReceived")
    private BigDecimal depreceived;

    /**
     * 预收保费
     */
    @Column(name = "AdvInsurance")
    private BigDecimal advinsurance;

    /**
     * 应付手续费及佣金
     */
    @Column(name = "CommiPayable")
    private BigDecimal commipayable;

    /**
     * 应付分保账款
     */
    @Column(name = "ReinPayables")
    private BigDecimal reinpayables;

    /**
     * 应付赔付款
     */
    @Column(name = "CompPayable")
    private BigDecimal comppayable;

    /**
     * 应付保单红利
     */
    @Column(name = "PolDivPayable")
    private BigDecimal poldivpayable;

    /**
     * 保户储金及投资款
     */
    @Column(name = "InsDepInvest")
    private BigDecimal insdepinvest;

    /**
     * 未到期责任准备金
     */
    @Column(name = "UnePreReserve")
    private BigDecimal uneprereserve;

    /**
     * 未决赔款准备金
     */
    @Column(name = "OutingClaRes")
    private BigDecimal outingclares;

    /**
     * 寿险责任准备金
     */
    @Column(name = "LifeInsReserve")
    private BigDecimal lifeinsreserve;

    /**
     * 长期健康险责任准备金
     */
    @Column(name = "LTHealInsLR")
    private BigDecimal lthealinslr;

    /**
     * 独立账户负债
     */
    @Column(name = "IndLiab")
    private BigDecimal indliab;

    /**
     * 其他负债
     */
    @Column(name = "OtherLiab")
    private BigDecimal otherliab;

    /**
     * 负债特殊项目
     */
    @Column(name = "LExcepItems")
    private BigDecimal lexcepitems;

    /**
     * 负债调整项目
     */
    @Column(name = "LAdjuItems")
    private BigDecimal ladjuitems;

    /**
     * 负债合计
     */
    @Column(name = "TotalLiab")
    private BigDecimal totalliab;

    /**
     * 实收资本(或股本)(元)
     */
    @Column(name = "PaidInCapital")
    private BigDecimal paidincapital;

    /**
     * 其他权益工具
     */
    @Column(name = "OtherEqu")
    private BigDecimal otherequ;

    /**
     * 其中:优先股(其他权益工具)(元)
     */
    @Column(name = "EPreferStock")
    private BigDecimal epreferstock;

    /**
     * 其中:永续债(其他权益工具)
     */
    @Column(name = "EPerpDebt")
    private BigDecimal eperpdebt;

    /**
     * 资本公积
     */
    @Column(name = "CapResFund")
    private BigDecimal capresfund;

    /**
     * 减:库存股
     */
    @Column(name = "TreaStock")
    private BigDecimal treastock;

    /**
     * 盈余公积
     */
    @Column(name = "SplusResFund")
    private BigDecimal splusresfund;

    /**
     * 未分配利润
     */
    @Column(name = "RetaProfit")
    private BigDecimal retaprofit;

    /**
     * 其他综合收益(元)
     */
    @Column(name = "OtherCompIncome")
    private BigDecimal othercompincome;

    /**
     * 一般风险准备
     */
    @Column(name = "OrdRiskResFund")
    private BigDecimal ordriskresfund;

    /**
     * 外币报表折算差额
     */
    @Column(name = "ForCurRepCDiff")
    private BigDecimal forcurrepcdiff;

    /**
     * 未确认投资损失
     */
    @Column(name = "UncInvLoss")
    private BigDecimal uncinvloss;

    /**
     * 其他储备(公允价值变动储备)
     */
    @Column(name = "OtherRes")
    private BigDecimal otherres;

    /**
     * 专项储备
     */
    @Column(name = "SpecReserves")
    private BigDecimal specreserves;

    /**
     * 归属母公司所有者权益特殊项目
     */
    @Column(name = "SEExcepItems")
    private BigDecimal seexcepitems;

    /**
     * 归属母公司所有者权益调整项目
     */
    @Column(name = "SEAdjItems")
    private BigDecimal seadjitems;

    /**
     * 归属于母公司所有者权益合计(元)
     */
    @Column(name = "SEWithoutMI")
    private BigDecimal sewithoutmi;

    /**
     * 少数股东权益
     */
    @Column(name = "MinInterests")
    private BigDecimal mininterests;

    /**
     * 所有者权益调整项目
     */
    @Column(name = "OtherItemsEffSE")
    private BigDecimal otheritemseffse;

    /**
     * 所有者权益(或股东权益)合计
     */
    @Column(name = "TotalShEquity")
    private BigDecimal totalshequity;

    /**
     * 负债和权益特殊项目
     */
    @Column(name = "LEExcepItems")
    private BigDecimal leexcepitems;

    /**
     * 负债和权益调整项目
     */
    @Column(name = "LEAdjItems")
    private BigDecimal leadjitems;

    /**
     * 负债和所有者(或股东权益)总计
     */
    @Column(name = "TotalLiaAndEqu")
    private BigDecimal totalliaandequ;

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
     * 财政年度
     */
    @Column(name = "FiscalYear")
    private Date fiscalyear;

    /**
     * 发布时间
     */
    @Column(name = "InsertTime")
    private Date inserttime;

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
     * 货币资金/现金及存放中央银行款项(元)
     * @return CashEquivalents 货币资金/现金及存放中央银行款项(元)
     */
    public BigDecimal getCashequivalents() {
        return cashequivalents;
    }

    /**
     * 货币资金/现金及存放中央银行款项(元)
     * @param cashequivalents 货币资金/现金及存放中央银行款项(元)
     */
    public void setCashequivalents(BigDecimal cashequivalents) {
        this.cashequivalents = cashequivalents;
    }

    /**
     * 其中:客户资金存款(元)
     * @return ClientDeposit 其中:客户资金存款(元)
     */
    public BigDecimal getClientdeposit() {
        return clientdeposit;
    }

    /**
     * 其中:客户资金存款(元)
     * @param clientdeposit 其中:客户资金存款(元)
     */
    public void setClientdeposit(BigDecimal clientdeposit) {
        this.clientdeposit = clientdeposit;
    }

    /**
     * 交易性金融资产(元)
     * @return TradingAssets 交易性金融资产(元)
     */
    public BigDecimal getTradingassets() {
        return tradingassets;
    }

    /**
     * 交易性金融资产(元)
     * @param tradingassets 交易性金融资产(元)
     */
    public void setTradingassets(BigDecimal tradingassets) {
        this.tradingassets = tradingassets;
    }

    /**
     * 应收票据(元)
     * @return BillReceivable 应收票据(元)
     */
    public BigDecimal getBillreceivable() {
        return billreceivable;
    }

    /**
     * 应收票据(元)
     * @param billreceivable 应收票据(元)
     */
    public void setBillreceivable(BigDecimal billreceivable) {
        this.billreceivable = billreceivable;
    }

    /**
     * 应收股利(元)
     * @return DivReceivable 应收股利(元)
     */
    public BigDecimal getDivreceivable() {
        return divreceivable;
    }

    /**
     * 应收股利(元)
     * @param divreceivable 应收股利(元)
     */
    public void setDivreceivable(BigDecimal divreceivable) {
        this.divreceivable = divreceivable;
    }

    /**
     * 应收利息(元)
     * @return IntReceivable 应收利息(元)
     */
    public BigDecimal getIntreceivable() {
        return intreceivable;
    }

    /**
     * 应收利息(元)
     * @param intreceivable 应收利息(元)
     */
    public void setIntreceivable(BigDecimal intreceivable) {
        this.intreceivable = intreceivable;
    }

    /**
     * 应收账款
     * @return AccReceivable 应收账款
     */
    public BigDecimal getAccreceivable() {
        return accreceivable;
    }

    /**
     * 应收账款
     * @param accreceivable 应收账款
     */
    public void setAccreceivable(BigDecimal accreceivable) {
        this.accreceivable = accreceivable;
    }

    /**
     * 其他应收款(元)
     * @return OtherReceivable 其他应收款(元)
     */
    public BigDecimal getOtherreceivable() {
        return otherreceivable;
    }

    /**
     * 其他应收款(元)
     * @param otherreceivable 其他应收款(元)
     */
    public void setOtherreceivable(BigDecimal otherreceivable) {
        this.otherreceivable = otherreceivable;
    }

    /**
     * 预付款项(元)
     * @return AdvancePayment 预付款项(元)
     */
    public BigDecimal getAdvancepayment() {
        return advancepayment;
    }

    /**
     * 预付款项(元)
     * @param advancepayment 预付款项(元)
     */
    public void setAdvancepayment(BigDecimal advancepayment) {
        this.advancepayment = advancepayment;
    }

    /**
     * 存货(元)
     * @return Inventories 存货(元)
     */
    public BigDecimal getInventories() {
        return inventories;
    }

    /**
     * 存货(元)
     * @param inventories 存货(元)
     */
    public void setInventories(BigDecimal inventories) {
        this.inventories = inventories;
    }

    /**
     * 其中:消耗性生物资产
     * @return BearerBiolAssets 其中:消耗性生物资产
     */
    public BigDecimal getBearerbiolassets() {
        return bearerbiolassets;
    }

    /**
     * 其中:消耗性生物资产
     * @param bearerbiolassets 其中:消耗性生物资产
     */
    public void setBearerbiolassets(BigDecimal bearerbiolassets) {
        this.bearerbiolassets = bearerbiolassets;
    }

    /**
     * 待摊费用
     * @return DefExpense 待摊费用
     */
    public BigDecimal getDefexpense() {
        return defexpense;
    }

    /**
     * 待摊费用
     * @param defexpense 待摊费用
     */
    public void setDefexpense(BigDecimal defexpense) {
        this.defexpense = defexpense;
    }

    /**
     * 划分为持有待售的资产(元)
     * @return HoldAndFSAssets 划分为持有待售的资产(元)
     */
    public BigDecimal getHoldandfsassets() {
        return holdandfsassets;
    }

    /**
     * 划分为持有待售的资产(元)
     * @param holdandfsassets 划分为持有待售的资产(元)
     */
    public void setHoldandfsassets(BigDecimal holdandfsassets) {
        this.holdandfsassets = holdandfsassets;
    }

    /**
     * 一年内到期的非流动资产
     * @return NonCurAssetIn1Y 一年内到期的非流动资产
     */
    public BigDecimal getNoncurassetin1y() {
        return noncurassetin1y;
    }

    /**
     * 一年内到期的非流动资产
     * @param noncurassetin1y 一年内到期的非流动资产
     */
    public void setNoncurassetin1y(BigDecimal noncurassetin1y) {
        this.noncurassetin1y = noncurassetin1y;
    }

    /**
     * 其他流动资产
     * @return OtherCurAssets 其他流动资产
     */
    public BigDecimal getOthercurassets() {
        return othercurassets;
    }

    /**
     * 其他流动资产
     * @param othercurassets 其他流动资产
     */
    public void setOthercurassets(BigDecimal othercurassets) {
        this.othercurassets = othercurassets;
    }

    /**
     * 流动资产特殊项目
     * @return CAExcepItems 流动资产特殊项目
     */
    public BigDecimal getCaexcepitems() {
        return caexcepitems;
    }

    /**
     * 流动资产特殊项目
     * @param caexcepitems 流动资产特殊项目
     */
    public void setCaexcepitems(BigDecimal caexcepitems) {
        this.caexcepitems = caexcepitems;
    }

    /**
     * 流动资产调整项目
     * @return CAAdjItems 流动资产调整项目
     */
    public BigDecimal getCaadjitems() {
        return caadjitems;
    }

    /**
     * 流动资产调整项目
     * @param caadjitems 流动资产调整项目
     */
    public void setCaadjitems(BigDecimal caadjitems) {
        this.caadjitems = caadjitems;
    }

    /**
     * 流动资产合计
     * @return TotalCurAssets 流动资产合计
     */
    public BigDecimal getTotalcurassets() {
        return totalcurassets;
    }

    /**
     * 流动资产合计
     * @param totalcurassets 流动资产合计
     */
    public void setTotalcurassets(BigDecimal totalcurassets) {
        this.totalcurassets = totalcurassets;
    }

    /**
     * 可供出售金融资产
     * @return HForSaleAssets 可供出售金融资产
     */
    public BigDecimal getHforsaleassets() {
        return hforsaleassets;
    }

    /**
     * 可供出售金融资产
     * @param hforsaleassets 可供出售金融资产
     */
    public void setHforsaleassets(BigDecimal hforsaleassets) {
        this.hforsaleassets = hforsaleassets;
    }

    /**
     * 持有至到期投资
     * @return HoldToMatInv 持有至到期投资
     */
    public BigDecimal getHoldtomatinv() {
        return holdtomatinv;
    }

    /**
     * 持有至到期投资
     * @param holdtomatinv 持有至到期投资
     */
    public void setHoldtomatinv(BigDecimal holdtomatinv) {
        this.holdtomatinv = holdtomatinv;
    }

    /**
     * 投资性房地产
     * @return InvProperty 投资性房地产
     */
    public BigDecimal getInvproperty() {
        return invproperty;
    }

    /**
     * 投资性房地产
     * @param invproperty 投资性房地产
     */
    public void setInvproperty(BigDecimal invproperty) {
        this.invproperty = invproperty;
    }

    /**
     * 长期股权投资
     * @return LtermEquInvest 长期股权投资
     */
    public BigDecimal getLtermequinvest() {
        return ltermequinvest;
    }

    /**
     * 长期股权投资
     * @param ltermequinvest 长期股权投资
     */
    public void setLtermequinvest(BigDecimal ltermequinvest) {
        this.ltermequinvest = ltermequinvest;
    }

    /**
     * 长期应收款
     * @return LtermReceAcc 长期应收款
     */
    public BigDecimal getLtermreceacc() {
        return ltermreceacc;
    }

    /**
     * 长期应收款
     * @param ltermreceacc 长期应收款
     */
    public void setLtermreceacc(BigDecimal ltermreceacc) {
        this.ltermreceacc = ltermreceacc;
    }

    /**
     * 固定资产(元)
     * @return FixedAssets 固定资产(元)
     */
    public BigDecimal getFixedassets() {
        return fixedassets;
    }

    /**
     * 固定资产(元)
     * @param fixedassets 固定资产(元)
     */
    public void setFixedassets(BigDecimal fixedassets) {
        this.fixedassets = fixedassets;
    }

    /**
     * 工程物资
     * @return ConsMaterials 工程物资
     */
    public BigDecimal getConsmaterials() {
        return consmaterials;
    }

    /**
     * 工程物资
     * @param consmaterials 工程物资
     */
    public void setConsmaterials(BigDecimal consmaterials) {
        this.consmaterials = consmaterials;
    }

    /**
     * 在建工程
     * @return ConsInProcess 在建工程
     */
    public BigDecimal getConsinprocess() {
        return consinprocess;
    }

    /**
     * 在建工程
     * @param consinprocess 在建工程
     */
    public void setConsinprocess(BigDecimal consinprocess) {
        this.consinprocess = consinprocess;
    }

    /**
     * 固定资产清理
     * @return FixedAssetsLiq 固定资产清理
     */
    public BigDecimal getFixedassetsliq() {
        return fixedassetsliq;
    }

    /**
     * 固定资产清理
     * @param fixedassetsliq 固定资产清理
     */
    public void setFixedassetsliq(BigDecimal fixedassetsliq) {
        this.fixedassetsliq = fixedassetsliq;
    }

    /**
     * 生产性生物资产
     * @return BiolAssets 生产性生物资产
     */
    public BigDecimal getBiolassets() {
        return biolassets;
    }

    /**
     * 生产性生物资产
     * @param biolassets 生产性生物资产
     */
    public void setBiolassets(BigDecimal biolassets) {
        this.biolassets = biolassets;
    }

    /**
     * 油气资产(元)
     * @return OilGasAssets 油气资产(元)
     */
    public BigDecimal getOilgasassets() {
        return oilgasassets;
    }

    /**
     * 油气资产(元)
     * @param oilgasassets 油气资产(元)
     */
    public void setOilgasassets(BigDecimal oilgasassets) {
        this.oilgasassets = oilgasassets;
    }

    /**
     * 无形资产
     * @return IntAssets 无形资产
     */
    public BigDecimal getIntassets() {
        return intassets;
    }

    /**
     * 无形资产
     * @param intassets 无形资产
     */
    public void setIntassets(BigDecimal intassets) {
        this.intassets = intassets;
    }

    /**
     * 其中:交易席位费(元)
     * @return SeatCosts 其中:交易席位费(元)
     */
    public BigDecimal getSeatcosts() {
        return seatcosts;
    }

    /**
     * 其中:交易席位费(元)
     * @param seatcosts 其中:交易席位费(元)
     */
    public void setSeatcosts(BigDecimal seatcosts) {
        this.seatcosts = seatcosts;
    }

    /**
     * 开发支出
     * @return DeveExpenditure 开发支出
     */
    public BigDecimal getDeveexpenditure() {
        return deveexpenditure;
    }

    /**
     * 开发支出
     * @param deveexpenditure 开发支出
     */
    public void setDeveexpenditure(BigDecimal deveexpenditure) {
        this.deveexpenditure = deveexpenditure;
    }

    /**
     * 商誉(元)
     * @return GoodWill 商誉(元)
     */
    public BigDecimal getGoodwill() {
        return goodwill;
    }

    /**
     * 商誉(元)
     * @param goodwill 商誉(元)
     */
    public void setGoodwill(BigDecimal goodwill) {
        this.goodwill = goodwill;
    }

    /**
     * 长期待摊费用
     * @return LongDefExpense 长期待摊费用
     */
    public BigDecimal getLongdefexpense() {
        return longdefexpense;
    }

    /**
     * 长期待摊费用
     * @param longdefexpense 长期待摊费用
     */
    public void setLongdefexpense(BigDecimal longdefexpense) {
        this.longdefexpense = longdefexpense;
    }

    /**
     * 递延所得税资产
     * @return DefTaxAssets 递延所得税资产
     */
    public BigDecimal getDeftaxassets() {
        return deftaxassets;
    }

    /**
     * 递延所得税资产
     * @param deftaxassets 递延所得税资产
     */
    public void setDeftaxassets(BigDecimal deftaxassets) {
        this.deftaxassets = deftaxassets;
    }

    /**
     * 其他非流动资产
     * @return OtherNonCurAssets 其他非流动资产
     */
    public BigDecimal getOthernoncurassets() {
        return othernoncurassets;
    }

    /**
     * 其他非流动资产
     * @param othernoncurassets 其他非流动资产
     */
    public void setOthernoncurassets(BigDecimal othernoncurassets) {
        this.othernoncurassets = othernoncurassets;
    }

    /**
     * 非流动资产特殊项目
     * @return NCAExcepItems 非流动资产特殊项目
     */
    public BigDecimal getNcaexcepitems() {
        return ncaexcepitems;
    }

    /**
     * 非流动资产特殊项目
     * @param ncaexcepitems 非流动资产特殊项目
     */
    public void setNcaexcepitems(BigDecimal ncaexcepitems) {
        this.ncaexcepitems = ncaexcepitems;
    }

    /**
     * 非流动资产调整项目
     * @return NCAAdjItems 非流动资产调整项目
     */
    public BigDecimal getNcaadjitems() {
        return ncaadjitems;
    }

    /**
     * 非流动资产调整项目
     * @param ncaadjitems 非流动资产调整项目
     */
    public void setNcaadjitems(BigDecimal ncaadjitems) {
        this.ncaadjitems = ncaadjitems;
    }

    /**
     * 非流动资产合计
     * @return TotNonCurAssets 非流动资产合计
     */
    public BigDecimal getTotnoncurassets() {
        return totnoncurassets;
    }

    /**
     * 非流动资产合计
     * @param totnoncurassets 非流动资产合计
     */
    public void setTotnoncurassets(BigDecimal totnoncurassets) {
        this.totnoncurassets = totnoncurassets;
    }

    /**
     * 投资-贷款及应收账款(应收账款类投资)
     * @return LoanAndAccRece 投资-贷款及应收账款(应收账款类投资)
     */
    public BigDecimal getLoanandaccrece() {
        return loanandaccrece;
    }

    /**
     * 投资-贷款及应收账款(应收账款类投资)
     * @param loanandaccrece 投资-贷款及应收账款(应收账款类投资)
     */
    public void setLoanandaccrece(BigDecimal loanandaccrece) {
        this.loanandaccrece = loanandaccrece;
    }

    /**
     * 结算备付金
     * @return SettlProvi 结算备付金
     */
    public BigDecimal getSettlprovi() {
        return settlprovi;
    }

    /**
     * 结算备付金
     * @param settlprovi 结算备付金
     */
    public void setSettlprovi(BigDecimal settlprovi) {
        this.settlprovi = settlprovi;
    }

    /**
     * 其中:客户备付金(元)
     * @return ClientProvi 其中:客户备付金(元)
     */
    public BigDecimal getClientprovi() {
        return clientprovi;
    }

    /**
     * 其中:客户备付金(元)
     * @param clientprovi 其中:客户备付金(元)
     */
    public void setClientprovi(BigDecimal clientprovi) {
        this.clientprovi = clientprovi;
    }

    /**
     * 存放同业款项
     * @return DepInInterbank 存放同业款项
     */
    public BigDecimal getDepininterbank() {
        return depininterbank;
    }

    /**
     * 存放同业款项
     * @param depininterbank 存放同业款项
     */
    public void setDepininterbank(BigDecimal depininterbank) {
        this.depininterbank = depininterbank;
    }

    /**
     * 贵金属(元)
     * @return Rmetal 贵金属(元)
     */
    public BigDecimal getRmetal() {
        return rmetal;
    }

    /**
     * 贵金属(元)
     * @param rmetal 贵金属(元)
     */
    public void setRmetal(BigDecimal rmetal) {
        this.rmetal = rmetal;
    }

    /**
     * 拆出资金(元)
     * @return LendCapital 拆出资金(元)
     */
    public BigDecimal getLendcapital() {
        return lendcapital;
    }

    /**
     * 拆出资金(元)
     * @param lendcapital 拆出资金(元)
     */
    public void setLendcapital(BigDecimal lendcapital) {
        this.lendcapital = lendcapital;
    }

    /**
     * 衍生金融资产
     * @return DerAssets 衍生金融资产
     */
    public BigDecimal getDerassets() {
        return derassets;
    }

    /**
     * 衍生金融资产
     * @param derassets 衍生金融资产
     */
    public void setDerassets(BigDecimal derassets) {
        this.derassets = derassets;
    }

    /**
     * 买入返售金融资产
     * @return BSbackAssets 买入返售金融资产
     */
    public BigDecimal getBsbackassets() {
        return bsbackassets;
    }

    /**
     * 买入返售金融资产
     * @param bsbackassets 买入返售金融资产
     */
    public void setBsbackassets(BigDecimal bsbackassets) {
        this.bsbackassets = bsbackassets;
    }

    /**
     * 发放贷款和垫款(元)
     * @return LoanAndAdvance 发放贷款和垫款(元)
     */
    public BigDecimal getLoanandadvance() {
        return loanandadvance;
    }

    /**
     * 发放贷款和垫款(元)
     * @param loanandadvance 发放贷款和垫款(元)
     */
    public void setLoanandadvance(BigDecimal loanandadvance) {
        this.loanandadvance = loanandadvance;
    }

    /**
     * 应收保费
     * @return InsReceivables 应收保费
     */
    public BigDecimal getInsreceivables() {
        return insreceivables;
    }

    /**
     * 应收保费
     * @param insreceivables 应收保费
     */
    public void setInsreceivables(BigDecimal insreceivables) {
        this.insreceivables = insreceivables;
    }

    /**
     * 应收代位追偿款
     * @return ReceSubFee 应收代位追偿款
     */
    public BigDecimal getRecesubfee() {
        return recesubfee;
    }

    /**
     * 应收代位追偿款
     * @param recesubfee 应收代位追偿款
     */
    public void setRecesubfee(BigDecimal recesubfee) {
        this.recesubfee = recesubfee;
    }

    /**
     * 应收分保账款
     * @return ReinRece 应收分保账款
     */
    public BigDecimal getReinrece() {
        return reinrece;
    }

    /**
     * 应收分保账款
     * @param reinrece 应收分保账款
     */
    public void setReinrece(BigDecimal reinrece) {
        this.reinrece = reinrece;
    }

    /**
     * 应收分保未到期责任准备金
     * @return ReceUnearnedR 应收分保未到期责任准备金
     */
    public BigDecimal getReceunearnedr() {
        return receunearnedr;
    }

    /**
     * 应收分保未到期责任准备金
     * @param receunearnedr 应收分保未到期责任准备金
     */
    public void setReceunearnedr(BigDecimal receunearnedr) {
        this.receunearnedr = receunearnedr;
    }

    /**
     * 应收分保未决赔款准备金
     * @return ReceClaimsR 应收分保未决赔款准备金
     */
    public BigDecimal getRececlaimsr() {
        return receclaimsr;
    }

    /**
     * 应收分保未决赔款准备金
     * @param receclaimsr 应收分保未决赔款准备金
     */
    public void setRececlaimsr(BigDecimal receclaimsr) {
        this.receclaimsr = receclaimsr;
    }

    /**
     * 应收分保寿险责任准备金
     * @return ReceLifeR 应收分保寿险责任准备金
     */
    public BigDecimal getRecelifer() {
        return recelifer;
    }

    /**
     * 应收分保寿险责任准备金
     * @param recelifer 应收分保寿险责任准备金
     */
    public void setRecelifer(BigDecimal recelifer) {
        this.recelifer = recelifer;
    }

    /**
     * 应收分保长期健康险责任准备金
     * @return ReceLTHealthR 应收分保长期健康险责任准备金
     */
    public BigDecimal getRecelthealthr() {
        return recelthealthr;
    }

    /**
     * 应收分保长期健康险责任准备金
     * @param recelthealthr 应收分保长期健康险责任准备金
     */
    public void setRecelthealthr(BigDecimal recelthealthr) {
        this.recelthealthr = recelthealthr;
    }

    /**
     * 保户质押贷款
     * @return InsImpawnLoan 保户质押贷款
     */
    public BigDecimal getInsimpawnloan() {
        return insimpawnloan;
    }

    /**
     * 保户质押贷款
     * @param insimpawnloan 保户质押贷款
     */
    public void setInsimpawnloan(BigDecimal insimpawnloan) {
        this.insimpawnloan = insimpawnloan;
    }

    /**
     * 定期存款(元)
     * @return FixedDeposit 定期存款(元)
     */
    public BigDecimal getFixeddeposit() {
        return fixeddeposit;
    }

    /**
     * 定期存款(元)
     * @param fixeddeposit 定期存款(元)
     */
    public void setFixeddeposit(BigDecimal fixeddeposit) {
        this.fixeddeposit = fixeddeposit;
    }

    /**
     * 存出保证金
     * @return RefDeposit 存出保证金
     */
    public BigDecimal getRefdeposit() {
        return refdeposit;
    }

    /**
     * 存出保证金
     * @param refdeposit 存出保证金
     */
    public void setRefdeposit(BigDecimal refdeposit) {
        this.refdeposit = refdeposit;
    }

    /**
     * 存出资本保证金
     * @return RefCapDeposit 存出资本保证金
     */
    public BigDecimal getRefcapdeposit() {
        return refcapdeposit;
    }

    /**
     * 存出资本保证金
     * @param refcapdeposit 存出资本保证金
     */
    public void setRefcapdeposit(BigDecimal refcapdeposit) {
        this.refcapdeposit = refcapdeposit;
    }

    /**
     * 独立账户资产
     * @return IndepAccAssets 独立账户资产
     */
    public BigDecimal getIndepaccassets() {
        return indepaccassets;
    }

    /**
     * 独立账户资产
     * @param indepaccassets 独立账户资产
     */
    public void setIndepaccassets(BigDecimal indepaccassets) {
        this.indepaccassets = indepaccassets;
    }

    /**
     * 其他资产(元)
     * @return OtherAssets 其他资产(元)
     */
    public BigDecimal getOtherassets() {
        return otherassets;
    }

    /**
     * 其他资产(元)
     * @param otherassets 其他资产(元)
     */
    public void setOtherassets(BigDecimal otherassets) {
        this.otherassets = otherassets;
    }

    /**
     * 资产特殊项目
     * @return AExcepItems 资产特殊项目
     */
    public BigDecimal getAexcepitems() {
        return aexcepitems;
    }

    /**
     * 资产特殊项目
     * @param aexcepitems 资产特殊项目
     */
    public void setAexcepitems(BigDecimal aexcepitems) {
        this.aexcepitems = aexcepitems;
    }

    /**
     * 资产调整项目
     * @return AAdjItems 资产调整项目
     */
    public BigDecimal getAadjitems() {
        return aadjitems;
    }

    /**
     * 资产调整项目
     * @param aadjitems 资产调整项目
     */
    public void setAadjitems(BigDecimal aadjitems) {
        this.aadjitems = aadjitems;
    }

    /**
     * 资产总计(元)
     * @return TotalAssets 资产总计(元)
     */
    public BigDecimal getTotalassets() {
        return totalassets;
    }

    /**
     * 资产总计(元)
     * @param totalassets 资产总计(元)
     */
    public void setTotalassets(BigDecimal totalassets) {
        this.totalassets = totalassets;
    }

    /**
     * 短期借款(元)
     * @return ShortTermLoan 短期借款(元)
     */
    public BigDecimal getShorttermloan() {
        return shorttermloan;
    }

    /**
     * 短期借款(元)
     * @param shorttermloan 短期借款(元)
     */
    public void setShorttermloan(BigDecimal shorttermloan) {
        this.shorttermloan = shorttermloan;
    }

    /**
     * 其中:质押借款(元)
     * @return ImpawnedLoan 其中:质押借款(元)
     */
    public BigDecimal getImpawnedloan() {
        return impawnedloan;
    }

    /**
     * 其中:质押借款(元)
     * @param impawnedloan 其中:质押借款(元)
     */
    public void setImpawnedloan(BigDecimal impawnedloan) {
        this.impawnedloan = impawnedloan;
    }

    /**
     * 应付短期债券
     * @return STBPayable 应付短期债券
     */
    public BigDecimal getStbpayable() {
        return stbpayable;
    }

    /**
     * 应付短期债券
     * @param stbpayable 应付短期债券
     */
    public void setStbpayable(BigDecimal stbpayable) {
        this.stbpayable = stbpayable;
    }

    /**
     * 交易性金融负债
     * @return TradingLia 交易性金融负债
     */
    public BigDecimal getTradinglia() {
        return tradinglia;
    }

    /**
     * 交易性金融负债
     * @param tradinglia 交易性金融负债
     */
    public void setTradinglia(BigDecimal tradinglia) {
        this.tradinglia = tradinglia;
    }

    /**
     * 应付票据(元)
     * @return NotesPayable 应付票据(元)
     */
    public BigDecimal getNotespayable() {
        return notespayable;
    }

    /**
     * 应付票据(元)
     * @param notespayable 应付票据(元)
     */
    public void setNotespayable(BigDecimal notespayable) {
        this.notespayable = notespayable;
    }

    /**
     * 应付账款
     * @return AccPayable 应付账款
     */
    public BigDecimal getAccpayable() {
        return accpayable;
    }

    /**
     * 应付账款
     * @param accpayable 应付账款
     */
    public void setAccpayable(BigDecimal accpayable) {
        this.accpayable = accpayable;
    }

    /**
     * 预收账款
     * @return AdvanceRece 预收账款
     */
    public BigDecimal getAdvancerece() {
        return advancerece;
    }

    /**
     * 预收账款
     * @param advancerece 预收账款
     */
    public void setAdvancerece(BigDecimal advancerece) {
        this.advancerece = advancerece;
    }

    /**
     * 应付职工薪酬
     * @return SalaPayable 应付职工薪酬
     */
    public BigDecimal getSalapayable() {
        return salapayable;
    }

    /**
     * 应付职工薪酬
     * @param salapayable 应付职工薪酬
     */
    public void setSalapayable(BigDecimal salapayable) {
        this.salapayable = salapayable;
    }

    /**
     * 应付股利
     * @return DiviPayable 应付股利
     */
    public BigDecimal getDivipayable() {
        return divipayable;
    }

    /**
     * 应付股利
     * @param divipayable 应付股利
     */
    public void setDivipayable(BigDecimal divipayable) {
        this.divipayable = divipayable;
    }

    /**
     * 应交税费(元)
     * @return TaxsPayable 应交税费(元)
     */
    public BigDecimal getTaxspayable() {
        return taxspayable;
    }

    /**
     * 应交税费(元)
     * @param taxspayable 应交税费(元)
     */
    public void setTaxspayable(BigDecimal taxspayable) {
        this.taxspayable = taxspayable;
    }

    /**
     * 应付利息
     * @return IntePayable 应付利息
     */
    public BigDecimal getIntepayable() {
        return intepayable;
    }

    /**
     * 应付利息
     * @param intepayable 应付利息
     */
    public void setIntepayable(BigDecimal intepayable) {
        this.intepayable = intepayable;
    }

    /**
     * 其他应付款(元)
     * @return OtherPayable 其他应付款(元)
     */
    public BigDecimal getOtherpayable() {
        return otherpayable;
    }

    /**
     * 其他应付款(元)
     * @param otherpayable 其他应付款(元)
     */
    public void setOtherpayable(BigDecimal otherpayable) {
        this.otherpayable = otherpayable;
    }

    /**
     * 预提费用
     * @return AccrExpense 预提费用
     */
    public BigDecimal getAccrexpense() {
        return accrexpense;
    }

    /**
     * 预提费用
     * @param accrexpense 预提费用
     */
    public void setAccrexpense(BigDecimal accrexpense) {
        this.accrexpense = accrexpense;
    }

    /**
     * 递延收益
     * @return DefProceeds 递延收益
     */
    public BigDecimal getDefproceeds() {
        return defproceeds;
    }

    /**
     * 递延收益
     * @param defproceeds 递延收益
     */
    public void setDefproceeds(BigDecimal defproceeds) {
        this.defproceeds = defproceeds;
    }

    /**
     * 划分为持有待售的负债(元)
     * @return HoldAndFSLi 划分为持有待售的负债(元)
     */
    public BigDecimal getHoldandfsli() {
        return holdandfsli;
    }

    /**
     * 划分为持有待售的负债(元)
     * @param holdandfsli 划分为持有待售的负债(元)
     */
    public void setHoldandfsli(BigDecimal holdandfsli) {
        this.holdandfsli = holdandfsli;
    }

    /**
     * 一年内到期的非流动负债
     * @return NonCurLiaIn1Y 一年内到期的非流动负债
     */
    public BigDecimal getNoncurliain1y() {
        return noncurliain1y;
    }

    /**
     * 一年内到期的非流动负债
     * @param noncurliain1y 一年内到期的非流动负债
     */
    public void setNoncurliain1y(BigDecimal noncurliain1y) {
        this.noncurliain1y = noncurliain1y;
    }

    /**
     * 其他流动负债
     * @return OtherCurLia 其他流动负债
     */
    public BigDecimal getOthercurlia() {
        return othercurlia;
    }

    /**
     * 其他流动负债
     * @param othercurlia 其他流动负债
     */
    public void setOthercurlia(BigDecimal othercurlia) {
        this.othercurlia = othercurlia;
    }

    /**
     * 流动负债特殊项目
     * @return CLExcepItems 流动负债特殊项目
     */
    public BigDecimal getClexcepitems() {
        return clexcepitems;
    }

    /**
     * 流动负债特殊项目
     * @param clexcepitems 流动负债特殊项目
     */
    public void setClexcepitems(BigDecimal clexcepitems) {
        this.clexcepitems = clexcepitems;
    }

    /**
     * 流动负债调整项目
     * @return CLAdjItems 流动负债调整项目
     */
    public BigDecimal getCladjitems() {
        return cladjitems;
    }

    /**
     * 流动负债调整项目
     * @param cladjitems 流动负债调整项目
     */
    public void setCladjitems(BigDecimal cladjitems) {
        this.cladjitems = cladjitems;
    }

    /**
     * 流动负债合计
     * @return TotalCurLia 流动负债合计
     */
    public BigDecimal getTotalcurlia() {
        return totalcurlia;
    }

    /**
     * 流动负债合计
     * @param totalcurlia 流动负债合计
     */
    public void setTotalcurlia(BigDecimal totalcurlia) {
        this.totalcurlia = totalcurlia;
    }

    /**
     * 长期借款(元)
     * @return LongtermLoan 长期借款(元)
     */
    public BigDecimal getLongtermloan() {
        return longtermloan;
    }

    /**
     * 长期借款(元)
     * @param longtermloan 长期借款(元)
     */
    public void setLongtermloan(BigDecimal longtermloan) {
        this.longtermloan = longtermloan;
    }

    /**
     * 应付债券(元)
     * @return BondsPayable 应付债券(元)
     */
    public BigDecimal getBondspayable() {
        return bondspayable;
    }

    /**
     * 应付债券(元)
     * @param bondspayable 应付债券(元)
     */
    public void setBondspayable(BigDecimal bondspayable) {
        this.bondspayable = bondspayable;
    }

    /**
     * 其中:优先股(应付债券)(元)
     * @return LPreferStock 其中:优先股(应付债券)(元)
     */
    public BigDecimal getLpreferstock() {
        return lpreferstock;
    }

    /**
     * 其中:优先股(应付债券)(元)
     * @param lpreferstock 其中:优先股(应付债券)(元)
     */
    public void setLpreferstock(BigDecimal lpreferstock) {
        this.lpreferstock = lpreferstock;
    }

    /**
     * 其中:永续债(应付债券)
     * @return LPerpDebt 其中:永续债(应付债券)
     */
    public BigDecimal getLperpdebt() {
        return lperpdebt;
    }

    /**
     * 其中:永续债(应付债券)
     * @param lperpdebt 其中:永续债(应付债券)
     */
    public void setLperpdebt(BigDecimal lperpdebt) {
        this.lperpdebt = lperpdebt;
    }

    /**
     * 长期应付款
     * @return LTAccPayable 长期应付款
     */
    public BigDecimal getLtaccpayable() {
        return ltaccpayable;
    }

    /**
     * 长期应付款
     * @param ltaccpayable 长期应付款
     */
    public void setLtaccpayable(BigDecimal ltaccpayable) {
        this.ltaccpayable = ltaccpayable;
    }

    /**
     * 长期应付职工薪酬
     * @return LongSalaPay 长期应付职工薪酬
     */
    public BigDecimal getLongsalapay() {
        return longsalapay;
    }

    /**
     * 长期应付职工薪酬
     * @param longsalapay 长期应付职工薪酬
     */
    public void setLongsalapay(BigDecimal longsalapay) {
        this.longsalapay = longsalapay;
    }

    /**
     * 专项应付款
     * @return SpecAccPayable 专项应付款
     */
    public BigDecimal getSpecaccpayable() {
        return specaccpayable;
    }

    /**
     * 专项应付款
     * @param specaccpayable 专项应付款
     */
    public void setSpecaccpayable(BigDecimal specaccpayable) {
        this.specaccpayable = specaccpayable;
    }

    /**
     * 预计负债
     * @return EstimateLia 预计负债
     */
    public BigDecimal getEstimatelia() {
        return estimatelia;
    }

    /**
     * 预计负债
     * @param estimatelia 预计负债
     */
    public void setEstimatelia(BigDecimal estimatelia) {
        this.estimatelia = estimatelia;
    }

    /**
     * 递延所得税负债
     * @return DefTaxLia 递延所得税负债
     */
    public BigDecimal getDeftaxlia() {
        return deftaxlia;
    }

    /**
     * 递延所得税负债
     * @param deftaxlia 递延所得税负债
     */
    public void setDeftaxlia(BigDecimal deftaxlia) {
        this.deftaxlia = deftaxlia;
    }

    /**
     * 递延收益
     * @return DefIncome 递延收益
     */
    public BigDecimal getDefincome() {
        return defincome;
    }

    /**
     * 递延收益
     * @param defincome 递延收益
     */
    public void setDefincome(BigDecimal defincome) {
        this.defincome = defincome;
    }

    /**
     * 其他非流动负债
     * @return OtherNonCurLia 其他非流动负债
     */
    public BigDecimal getOthernoncurlia() {
        return othernoncurlia;
    }

    /**
     * 其他非流动负债
     * @param othernoncurlia 其他非流动负债
     */
    public void setOthernoncurlia(BigDecimal othernoncurlia) {
        this.othernoncurlia = othernoncurlia;
    }

    /**
     * 非流动负债特殊项目
     * @return NCLExcepItems 非流动负债特殊项目
     */
    public BigDecimal getNclexcepitems() {
        return nclexcepitems;
    }

    /**
     * 非流动负债特殊项目
     * @param nclexcepitems 非流动负债特殊项目
     */
    public void setNclexcepitems(BigDecimal nclexcepitems) {
        this.nclexcepitems = nclexcepitems;
    }

    /**
     * 非流动负债调整项目
     * @return NCLAdjItems 非流动负债调整项目
     */
    public BigDecimal getNcladjitems() {
        return ncladjitems;
    }

    /**
     * 非流动负债调整项目
     * @param ncladjitems 非流动负债调整项目
     */
    public void setNcladjitems(BigDecimal ncladjitems) {
        this.ncladjitems = ncladjitems;
    }

    /**
     * 非流动负债合计
     * @return TotalNonCurLia 非流动负债合计
     */
    public BigDecimal getTotalnoncurlia() {
        return totalnoncurlia;
    }

    /**
     * 非流动负债合计
     * @param totalnoncurlia 非流动负债合计
     */
    public void setTotalnoncurlia(BigDecimal totalnoncurlia) {
        this.totalnoncurlia = totalnoncurlia;
    }

    /**
     * 向中央银行借款
     * @return BorFromCB 向中央银行借款
     */
    public BigDecimal getBorfromcb() {
        return borfromcb;
    }

    /**
     * 向中央银行借款
     * @param borfromcb 向中央银行借款
     */
    public void setBorfromcb(BigDecimal borfromcb) {
        this.borfromcb = borfromcb;
    }

    /**
     * 同业及其他金融机构存放款项
     * @return DepOfInterbank 同业及其他金融机构存放款项
     */
    public BigDecimal getDepofinterbank() {
        return depofinterbank;
    }

    /**
     * 同业及其他金融机构存放款项
     * @param depofinterbank 同业及其他金融机构存放款项
     */
    public void setDepofinterbank(BigDecimal depofinterbank) {
        this.depofinterbank = depofinterbank;
    }

    /**
     * 拆入资金
     * @return BorCapital 拆入资金
     */
    public BigDecimal getBorcapital() {
        return borcapital;
    }

    /**
     * 拆入资金
     * @param borcapital 拆入资金
     */
    public void setBorcapital(BigDecimal borcapital) {
        this.borcapital = borcapital;
    }

    /**
     * 衍生金融负债
     * @return DeriLia 衍生金融负债
     */
    public BigDecimal getDerilia() {
        return derilia;
    }

    /**
     * 衍生金融负债
     * @param derilia 衍生金融负债
     */
    public void setDerilia(BigDecimal derilia) {
        this.derilia = derilia;
    }

    /**
     * 卖出回购金融资产款
     * @return SBbackSecuPros 卖出回购金融资产款
     */
    public BigDecimal getSbbacksecupros() {
        return sbbacksecupros;
    }

    /**
     * 卖出回购金融资产款
     * @param sbbacksecupros 卖出回购金融资产款
     */
    public void setSbbacksecupros(BigDecimal sbbacksecupros) {
        this.sbbacksecupros = sbbacksecupros;
    }

    /**
     * 吸收存款(元)
     * @return Deposit 吸收存款(元)
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * 吸收存款(元)
     * @param deposit 吸收存款(元)
     */
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    /**
     * 代理买卖证券款
     * @return ProSecuPros 代理买卖证券款
     */
    public BigDecimal getProsecupros() {
        return prosecupros;
    }

    /**
     * 代理买卖证券款
     * @param prosecupros 代理买卖证券款
     */
    public void setProsecupros(BigDecimal prosecupros) {
        this.prosecupros = prosecupros;
    }

    /**
     * 代理承销证券款
     * @return SubIssSecuPros 代理承销证券款
     */
    public BigDecimal getSubisssecupros() {
        return subisssecupros;
    }

    /**
     * 代理承销证券款
     * @param subisssecupros 代理承销证券款
     */
    public void setSubisssecupros(BigDecimal subisssecupros) {
        this.subisssecupros = subisssecupros;
    }

    /**
     * 存入保证金
     * @return DepReceived 存入保证金
     */
    public BigDecimal getDepreceived() {
        return depreceived;
    }

    /**
     * 存入保证金
     * @param depreceived 存入保证金
     */
    public void setDepreceived(BigDecimal depreceived) {
        this.depreceived = depreceived;
    }

    /**
     * 预收保费
     * @return AdvInsurance 预收保费
     */
    public BigDecimal getAdvinsurance() {
        return advinsurance;
    }

    /**
     * 预收保费
     * @param advinsurance 预收保费
     */
    public void setAdvinsurance(BigDecimal advinsurance) {
        this.advinsurance = advinsurance;
    }

    /**
     * 应付手续费及佣金
     * @return CommiPayable 应付手续费及佣金
     */
    public BigDecimal getCommipayable() {
        return commipayable;
    }

    /**
     * 应付手续费及佣金
     * @param commipayable 应付手续费及佣金
     */
    public void setCommipayable(BigDecimal commipayable) {
        this.commipayable = commipayable;
    }

    /**
     * 应付分保账款
     * @return ReinPayables 应付分保账款
     */
    public BigDecimal getReinpayables() {
        return reinpayables;
    }

    /**
     * 应付分保账款
     * @param reinpayables 应付分保账款
     */
    public void setReinpayables(BigDecimal reinpayables) {
        this.reinpayables = reinpayables;
    }

    /**
     * 应付赔付款
     * @return CompPayable 应付赔付款
     */
    public BigDecimal getComppayable() {
        return comppayable;
    }

    /**
     * 应付赔付款
     * @param comppayable 应付赔付款
     */
    public void setComppayable(BigDecimal comppayable) {
        this.comppayable = comppayable;
    }

    /**
     * 应付保单红利
     * @return PolDivPayable 应付保单红利
     */
    public BigDecimal getPoldivpayable() {
        return poldivpayable;
    }

    /**
     * 应付保单红利
     * @param poldivpayable 应付保单红利
     */
    public void setPoldivpayable(BigDecimal poldivpayable) {
        this.poldivpayable = poldivpayable;
    }

    /**
     * 保户储金及投资款
     * @return InsDepInvest 保户储金及投资款
     */
    public BigDecimal getInsdepinvest() {
        return insdepinvest;
    }

    /**
     * 保户储金及投资款
     * @param insdepinvest 保户储金及投资款
     */
    public void setInsdepinvest(BigDecimal insdepinvest) {
        this.insdepinvest = insdepinvest;
    }

    /**
     * 未到期责任准备金
     * @return UnePreReserve 未到期责任准备金
     */
    public BigDecimal getUneprereserve() {
        return uneprereserve;
    }

    /**
     * 未到期责任准备金
     * @param uneprereserve 未到期责任准备金
     */
    public void setUneprereserve(BigDecimal uneprereserve) {
        this.uneprereserve = uneprereserve;
    }

    /**
     * 未决赔款准备金
     * @return OutingClaRes 未决赔款准备金
     */
    public BigDecimal getOutingclares() {
        return outingclares;
    }

    /**
     * 未决赔款准备金
     * @param outingclares 未决赔款准备金
     */
    public void setOutingclares(BigDecimal outingclares) {
        this.outingclares = outingclares;
    }

    /**
     * 寿险责任准备金
     * @return LifeInsReserve 寿险责任准备金
     */
    public BigDecimal getLifeinsreserve() {
        return lifeinsreserve;
    }

    /**
     * 寿险责任准备金
     * @param lifeinsreserve 寿险责任准备金
     */
    public void setLifeinsreserve(BigDecimal lifeinsreserve) {
        this.lifeinsreserve = lifeinsreserve;
    }

    /**
     * 长期健康险责任准备金
     * @return LTHealInsLR 长期健康险责任准备金
     */
    public BigDecimal getLthealinslr() {
        return lthealinslr;
    }

    /**
     * 长期健康险责任准备金
     * @param lthealinslr 长期健康险责任准备金
     */
    public void setLthealinslr(BigDecimal lthealinslr) {
        this.lthealinslr = lthealinslr;
    }

    /**
     * 独立账户负债
     * @return IndLiab 独立账户负债
     */
    public BigDecimal getIndliab() {
        return indliab;
    }

    /**
     * 独立账户负债
     * @param indliab 独立账户负债
     */
    public void setIndliab(BigDecimal indliab) {
        this.indliab = indliab;
    }

    /**
     * 其他负债
     * @return OtherLiab 其他负债
     */
    public BigDecimal getOtherliab() {
        return otherliab;
    }

    /**
     * 其他负债
     * @param otherliab 其他负债
     */
    public void setOtherliab(BigDecimal otherliab) {
        this.otherliab = otherliab;
    }

    /**
     * 负债特殊项目
     * @return LExcepItems 负债特殊项目
     */
    public BigDecimal getLexcepitems() {
        return lexcepitems;
    }

    /**
     * 负债特殊项目
     * @param lexcepitems 负债特殊项目
     */
    public void setLexcepitems(BigDecimal lexcepitems) {
        this.lexcepitems = lexcepitems;
    }

    /**
     * 负债调整项目
     * @return LAdjuItems 负债调整项目
     */
    public BigDecimal getLadjuitems() {
        return ladjuitems;
    }

    /**
     * 负债调整项目
     * @param ladjuitems 负债调整项目
     */
    public void setLadjuitems(BigDecimal ladjuitems) {
        this.ladjuitems = ladjuitems;
    }

    /**
     * 负债合计
     * @return TotalLiab 负债合计
     */
    public BigDecimal getTotalliab() {
        return totalliab;
    }

    /**
     * 负债合计
     * @param totalliab 负债合计
     */
    public void setTotalliab(BigDecimal totalliab) {
        this.totalliab = totalliab;
    }

    /**
     * 实收资本(或股本)(元)
     * @return PaidInCapital 实收资本(或股本)(元)
     */
    public BigDecimal getPaidincapital() {
        return paidincapital;
    }

    /**
     * 实收资本(或股本)(元)
     * @param paidincapital 实收资本(或股本)(元)
     */
    public void setPaidincapital(BigDecimal paidincapital) {
        this.paidincapital = paidincapital;
    }

    /**
     * 其他权益工具
     * @return OtherEqu 其他权益工具
     */
    public BigDecimal getOtherequ() {
        return otherequ;
    }

    /**
     * 其他权益工具
     * @param otherequ 其他权益工具
     */
    public void setOtherequ(BigDecimal otherequ) {
        this.otherequ = otherequ;
    }

    /**
     * 其中:优先股(其他权益工具)(元)
     * @return EPreferStock 其中:优先股(其他权益工具)(元)
     */
    public BigDecimal getEpreferstock() {
        return epreferstock;
    }

    /**
     * 其中:优先股(其他权益工具)(元)
     * @param epreferstock 其中:优先股(其他权益工具)(元)
     */
    public void setEpreferstock(BigDecimal epreferstock) {
        this.epreferstock = epreferstock;
    }

    /**
     * 其中:永续债(其他权益工具)
     * @return EPerpDebt 其中:永续债(其他权益工具)
     */
    public BigDecimal getEperpdebt() {
        return eperpdebt;
    }

    /**
     * 其中:永续债(其他权益工具)
     * @param eperpdebt 其中:永续债(其他权益工具)
     */
    public void setEperpdebt(BigDecimal eperpdebt) {
        this.eperpdebt = eperpdebt;
    }

    /**
     * 资本公积
     * @return CapResFund 资本公积
     */
    public BigDecimal getCapresfund() {
        return capresfund;
    }

    /**
     * 资本公积
     * @param capresfund 资本公积
     */
    public void setCapresfund(BigDecimal capresfund) {
        this.capresfund = capresfund;
    }

    /**
     * 减:库存股
     * @return TreaStock 减:库存股
     */
    public BigDecimal getTreastock() {
        return treastock;
    }

    /**
     * 减:库存股
     * @param treastock 减:库存股
     */
    public void setTreastock(BigDecimal treastock) {
        this.treastock = treastock;
    }

    /**
     * 盈余公积
     * @return SplusResFund 盈余公积
     */
    public BigDecimal getSplusresfund() {
        return splusresfund;
    }

    /**
     * 盈余公积
     * @param splusresfund 盈余公积
     */
    public void setSplusresfund(BigDecimal splusresfund) {
        this.splusresfund = splusresfund;
    }

    /**
     * 未分配利润
     * @return RetaProfit 未分配利润
     */
    public BigDecimal getRetaprofit() {
        return retaprofit;
    }

    /**
     * 未分配利润
     * @param retaprofit 未分配利润
     */
    public void setRetaprofit(BigDecimal retaprofit) {
        this.retaprofit = retaprofit;
    }

    /**
     * 其他综合收益(元)
     * @return OtherCompIncome 其他综合收益(元)
     */
    public BigDecimal getOthercompincome() {
        return othercompincome;
    }

    /**
     * 其他综合收益(元)
     * @param othercompincome 其他综合收益(元)
     */
    public void setOthercompincome(BigDecimal othercompincome) {
        this.othercompincome = othercompincome;
    }

    /**
     * 一般风险准备
     * @return OrdRiskResFund 一般风险准备
     */
    public BigDecimal getOrdriskresfund() {
        return ordriskresfund;
    }

    /**
     * 一般风险准备
     * @param ordriskresfund 一般风险准备
     */
    public void setOrdriskresfund(BigDecimal ordriskresfund) {
        this.ordriskresfund = ordriskresfund;
    }

    /**
     * 外币报表折算差额
     * @return ForCurRepCDiff 外币报表折算差额
     */
    public BigDecimal getForcurrepcdiff() {
        return forcurrepcdiff;
    }

    /**
     * 外币报表折算差额
     * @param forcurrepcdiff 外币报表折算差额
     */
    public void setForcurrepcdiff(BigDecimal forcurrepcdiff) {
        this.forcurrepcdiff = forcurrepcdiff;
    }

    /**
     * 未确认投资损失
     * @return UncInvLoss 未确认投资损失
     */
    public BigDecimal getUncinvloss() {
        return uncinvloss;
    }

    /**
     * 未确认投资损失
     * @param uncinvloss 未确认投资损失
     */
    public void setUncinvloss(BigDecimal uncinvloss) {
        this.uncinvloss = uncinvloss;
    }

    /**
     * 其他储备(公允价值变动储备)
     * @return OtherRes 其他储备(公允价值变动储备)
     */
    public BigDecimal getOtherres() {
        return otherres;
    }

    /**
     * 其他储备(公允价值变动储备)
     * @param otherres 其他储备(公允价值变动储备)
     */
    public void setOtherres(BigDecimal otherres) {
        this.otherres = otherres;
    }

    /**
     * 专项储备
     * @return SpecReserves 专项储备
     */
    public BigDecimal getSpecreserves() {
        return specreserves;
    }

    /**
     * 专项储备
     * @param specreserves 专项储备
     */
    public void setSpecreserves(BigDecimal specreserves) {
        this.specreserves = specreserves;
    }

    /**
     * 归属母公司所有者权益特殊项目
     * @return SEExcepItems 归属母公司所有者权益特殊项目
     */
    public BigDecimal getSeexcepitems() {
        return seexcepitems;
    }

    /**
     * 归属母公司所有者权益特殊项目
     * @param seexcepitems 归属母公司所有者权益特殊项目
     */
    public void setSeexcepitems(BigDecimal seexcepitems) {
        this.seexcepitems = seexcepitems;
    }

    /**
     * 归属母公司所有者权益调整项目
     * @return SEAdjItems 归属母公司所有者权益调整项目
     */
    public BigDecimal getSeadjitems() {
        return seadjitems;
    }

    /**
     * 归属母公司所有者权益调整项目
     * @param seadjitems 归属母公司所有者权益调整项目
     */
    public void setSeadjitems(BigDecimal seadjitems) {
        this.seadjitems = seadjitems;
    }

    /**
     * 归属于母公司所有者权益合计(元)
     * @return SEWithoutMI 归属于母公司所有者权益合计(元)
     */
    public BigDecimal getSewithoutmi() {
        return sewithoutmi;
    }

    /**
     * 归属于母公司所有者权益合计(元)
     * @param sewithoutmi 归属于母公司所有者权益合计(元)
     */
    public void setSewithoutmi(BigDecimal sewithoutmi) {
        this.sewithoutmi = sewithoutmi;
    }

    /**
     * 少数股东权益
     * @return MinInterests 少数股东权益
     */
    public BigDecimal getMininterests() {
        return mininterests;
    }

    /**
     * 少数股东权益
     * @param mininterests 少数股东权益
     */
    public void setMininterests(BigDecimal mininterests) {
        this.mininterests = mininterests;
    }

    /**
     * 所有者权益调整项目
     * @return OtherItemsEffSE 所有者权益调整项目
     */
    public BigDecimal getOtheritemseffse() {
        return otheritemseffse;
    }

    /**
     * 所有者权益调整项目
     * @param otheritemseffse 所有者权益调整项目
     */
    public void setOtheritemseffse(BigDecimal otheritemseffse) {
        this.otheritemseffse = otheritemseffse;
    }

    /**
     * 所有者权益(或股东权益)合计
     * @return TotalShEquity 所有者权益(或股东权益)合计
     */
    public BigDecimal getTotalshequity() {
        return totalshequity;
    }

    /**
     * 所有者权益(或股东权益)合计
     * @param totalshequity 所有者权益(或股东权益)合计
     */
    public void setTotalshequity(BigDecimal totalshequity) {
        this.totalshequity = totalshequity;
    }

    /**
     * 负债和权益特殊项目
     * @return LEExcepItems 负债和权益特殊项目
     */
    public BigDecimal getLeexcepitems() {
        return leexcepitems;
    }

    /**
     * 负债和权益特殊项目
     * @param leexcepitems 负债和权益特殊项目
     */
    public void setLeexcepitems(BigDecimal leexcepitems) {
        this.leexcepitems = leexcepitems;
    }

    /**
     * 负债和权益调整项目
     * @return LEAdjItems 负债和权益调整项目
     */
    public BigDecimal getLeadjitems() {
        return leadjitems;
    }

    /**
     * 负债和权益调整项目
     * @param leadjitems 负债和权益调整项目
     */
    public void setLeadjitems(BigDecimal leadjitems) {
        this.leadjitems = leadjitems;
    }

    /**
     * 负债和所有者(或股东权益)总计
     * @return TotalLiaAndEqu 负债和所有者(或股东权益)总计
     */
    public BigDecimal getTotalliaandequ() {
        return totalliaandequ;
    }

    /**
     * 负债和所有者(或股东权益)总计
     * @param totalliaandequ 负债和所有者(或股东权益)总计
     */
    public void setTotalliaandequ(BigDecimal totalliaandequ) {
        this.totalliaandequ = totalliaandequ;
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
     * 发布时间
     * @return InsertTime 发布时间
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * 发布时间
     * @param inserttime 发布时间
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
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