package com.zzzhc.data.engine.dataprovider.jyhs.dao;

import com.zzzhc.data.engine.dataprovider.jyhs.entitybeet.HKBalanceSheetCN;
import org.apache.ibatis.jdbc.SQL;

public class HKBalanceSheetCNSqlProvider {

    /**
     *
     * @mbg.generated 2019-02-26
     */
    public String insertSelective(HKBalanceSheetCN record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hk_balancesheetcn");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCompanycode() != null) {
            sql.VALUES("CompanyCode", "#{companycode,jdbcType=INTEGER}");
        }
        
        if (record.getInfopubldate() != null) {
            sql.VALUES("InfoPublDate", "#{infopubldate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInfosource() != null) {
            sql.VALUES("InfoSource", "#{infosource,jdbcType=VARCHAR}");
        }
        
        if (record.getEnddate() != null) {
            sql.VALUES("EndDate", "#{enddate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPeriodmark() != null) {
            sql.VALUES("PeriodMark", "#{periodmark,jdbcType=INTEGER}");
        }
        
        if (record.getCompanynature() != null) {
            sql.VALUES("CompanyNature", "#{companynature,jdbcType=INTEGER}");
        }
        
        if (record.getMark() != null) {
            sql.VALUES("Mark", "#{mark,jdbcType=INTEGER}");
        }
        
        if (record.getCurrencyunit() != null) {
            sql.VALUES("CurrencyUnit", "#{currencyunit,jdbcType=INTEGER}");
        }
        
        if (record.getCashequivalents() != null) {
            sql.VALUES("CashEquivalents", "#{cashequivalents,jdbcType=DECIMAL}");
        }
        
        if (record.getClientdeposit() != null) {
            sql.VALUES("ClientDeposit", "#{clientdeposit,jdbcType=DECIMAL}");
        }
        
        if (record.getTradingassets() != null) {
            sql.VALUES("TradingAssets", "#{tradingassets,jdbcType=DECIMAL}");
        }
        
        if (record.getBillreceivable() != null) {
            sql.VALUES("BillReceivable", "#{billreceivable,jdbcType=DECIMAL}");
        }
        
        if (record.getDivreceivable() != null) {
            sql.VALUES("DivReceivable", "#{divreceivable,jdbcType=DECIMAL}");
        }
        
        if (record.getIntreceivable() != null) {
            sql.VALUES("IntReceivable", "#{intreceivable,jdbcType=DECIMAL}");
        }
        
        if (record.getAccreceivable() != null) {
            sql.VALUES("AccReceivable", "#{accreceivable,jdbcType=DECIMAL}");
        }
        
        if (record.getOtherreceivable() != null) {
            sql.VALUES("OtherReceivable", "#{otherreceivable,jdbcType=DECIMAL}");
        }
        
        if (record.getAdvancepayment() != null) {
            sql.VALUES("AdvancePayment", "#{advancepayment,jdbcType=DECIMAL}");
        }
        
        if (record.getInventories() != null) {
            sql.VALUES("Inventories", "#{inventories,jdbcType=DECIMAL}");
        }
        
        if (record.getBearerbiolassets() != null) {
            sql.VALUES("BearerBiolAssets", "#{bearerbiolassets,jdbcType=DECIMAL}");
        }
        
        if (record.getDefexpense() != null) {
            sql.VALUES("DefExpense", "#{defexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getHoldandfsassets() != null) {
            sql.VALUES("HoldAndFSAssets", "#{holdandfsassets,jdbcType=DECIMAL}");
        }
        
        if (record.getNoncurassetin1y() != null) {
            sql.VALUES("NonCurAssetIn1Y", "#{noncurassetin1y,jdbcType=DECIMAL}");
        }
        
        if (record.getOthercurassets() != null) {
            sql.VALUES("OtherCurAssets", "#{othercurassets,jdbcType=DECIMAL}");
        }
        
        if (record.getCaexcepitems() != null) {
            sql.VALUES("CAExcepItems", "#{caexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getCaadjitems() != null) {
            sql.VALUES("CAAdjItems", "#{caadjitems,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalcurassets() != null) {
            sql.VALUES("TotalCurAssets", "#{totalcurassets,jdbcType=DECIMAL}");
        }
        
        if (record.getHforsaleassets() != null) {
            sql.VALUES("HForSaleAssets", "#{hforsaleassets,jdbcType=DECIMAL}");
        }
        
        if (record.getHoldtomatinv() != null) {
            sql.VALUES("HoldToMatInv", "#{holdtomatinv,jdbcType=DECIMAL}");
        }
        
        if (record.getInvproperty() != null) {
            sql.VALUES("InvProperty", "#{invproperty,jdbcType=DECIMAL}");
        }
        
        if (record.getLtermequinvest() != null) {
            sql.VALUES("LtermEquInvest", "#{ltermequinvest,jdbcType=DECIMAL}");
        }
        
        if (record.getLtermreceacc() != null) {
            sql.VALUES("LtermReceAcc", "#{ltermreceacc,jdbcType=DECIMAL}");
        }
        
        if (record.getFixedassets() != null) {
            sql.VALUES("FixedAssets", "#{fixedassets,jdbcType=DECIMAL}");
        }
        
        if (record.getConsmaterials() != null) {
            sql.VALUES("ConsMaterials", "#{consmaterials,jdbcType=DECIMAL}");
        }
        
        if (record.getConsinprocess() != null) {
            sql.VALUES("ConsInProcess", "#{consinprocess,jdbcType=DECIMAL}");
        }
        
        if (record.getFixedassetsliq() != null) {
            sql.VALUES("FixedAssetsLiq", "#{fixedassetsliq,jdbcType=DECIMAL}");
        }
        
        if (record.getBiolassets() != null) {
            sql.VALUES("BiolAssets", "#{biolassets,jdbcType=DECIMAL}");
        }
        
        if (record.getOilgasassets() != null) {
            sql.VALUES("OilGasAssets", "#{oilgasassets,jdbcType=DECIMAL}");
        }
        
        if (record.getIntassets() != null) {
            sql.VALUES("IntAssets", "#{intassets,jdbcType=DECIMAL}");
        }
        
        if (record.getSeatcosts() != null) {
            sql.VALUES("SeatCosts", "#{seatcosts,jdbcType=DECIMAL}");
        }
        
        if (record.getDeveexpenditure() != null) {
            sql.VALUES("DeveExpenditure", "#{deveexpenditure,jdbcType=DECIMAL}");
        }
        
        if (record.getGoodwill() != null) {
            sql.VALUES("GoodWill", "#{goodwill,jdbcType=DECIMAL}");
        }
        
        if (record.getLongdefexpense() != null) {
            sql.VALUES("LongDefExpense", "#{longdefexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getDeftaxassets() != null) {
            sql.VALUES("DefTaxAssets", "#{deftaxassets,jdbcType=DECIMAL}");
        }
        
        if (record.getOthernoncurassets() != null) {
            sql.VALUES("OtherNonCurAssets", "#{othernoncurassets,jdbcType=DECIMAL}");
        }
        
        if (record.getNcaexcepitems() != null) {
            sql.VALUES("NCAExcepItems", "#{ncaexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getNcaadjitems() != null) {
            sql.VALUES("NCAAdjItems", "#{ncaadjitems,jdbcType=DECIMAL}");
        }
        
        if (record.getTotnoncurassets() != null) {
            sql.VALUES("TotNonCurAssets", "#{totnoncurassets,jdbcType=DECIMAL}");
        }
        
        if (record.getLoanandaccrece() != null) {
            sql.VALUES("LoanAndAccRece", "#{loanandaccrece,jdbcType=DECIMAL}");
        }
        
        if (record.getSettlprovi() != null) {
            sql.VALUES("SettlProvi", "#{settlprovi,jdbcType=DECIMAL}");
        }
        
        if (record.getClientprovi() != null) {
            sql.VALUES("ClientProvi", "#{clientprovi,jdbcType=DECIMAL}");
        }
        
        if (record.getDepininterbank() != null) {
            sql.VALUES("DepInInterbank", "#{depininterbank,jdbcType=DECIMAL}");
        }
        
        if (record.getRmetal() != null) {
            sql.VALUES("Rmetal", "#{rmetal,jdbcType=DECIMAL}");
        }
        
        if (record.getLendcapital() != null) {
            sql.VALUES("LendCapital", "#{lendcapital,jdbcType=DECIMAL}");
        }
        
        if (record.getDerassets() != null) {
            sql.VALUES("DerAssets", "#{derassets,jdbcType=DECIMAL}");
        }
        
        if (record.getBsbackassets() != null) {
            sql.VALUES("BSbackAssets", "#{bsbackassets,jdbcType=DECIMAL}");
        }
        
        if (record.getLoanandadvance() != null) {
            sql.VALUES("LoanAndAdvance", "#{loanandadvance,jdbcType=DECIMAL}");
        }
        
        if (record.getInsreceivables() != null) {
            sql.VALUES("InsReceivables", "#{insreceivables,jdbcType=DECIMAL}");
        }
        
        if (record.getRecesubfee() != null) {
            sql.VALUES("ReceSubFee", "#{recesubfee,jdbcType=DECIMAL}");
        }
        
        if (record.getReinrece() != null) {
            sql.VALUES("ReinRece", "#{reinrece,jdbcType=DECIMAL}");
        }
        
        if (record.getReceunearnedr() != null) {
            sql.VALUES("ReceUnearnedR", "#{receunearnedr,jdbcType=DECIMAL}");
        }
        
        if (record.getRececlaimsr() != null) {
            sql.VALUES("ReceClaimsR", "#{receclaimsr,jdbcType=DECIMAL}");
        }
        
        if (record.getRecelifer() != null) {
            sql.VALUES("ReceLifeR", "#{recelifer,jdbcType=DECIMAL}");
        }
        
        if (record.getRecelthealthr() != null) {
            sql.VALUES("ReceLTHealthR", "#{recelthealthr,jdbcType=DECIMAL}");
        }
        
        if (record.getInsimpawnloan() != null) {
            sql.VALUES("InsImpawnLoan", "#{insimpawnloan,jdbcType=DECIMAL}");
        }
        
        if (record.getFixeddeposit() != null) {
            sql.VALUES("FixedDeposit", "#{fixeddeposit,jdbcType=DECIMAL}");
        }
        
        if (record.getRefdeposit() != null) {
            sql.VALUES("RefDeposit", "#{refdeposit,jdbcType=DECIMAL}");
        }
        
        if (record.getRefcapdeposit() != null) {
            sql.VALUES("RefCapDeposit", "#{refcapdeposit,jdbcType=DECIMAL}");
        }
        
        if (record.getIndepaccassets() != null) {
            sql.VALUES("IndepAccAssets", "#{indepaccassets,jdbcType=DECIMAL}");
        }
        
        if (record.getOtherassets() != null) {
            sql.VALUES("OtherAssets", "#{otherassets,jdbcType=DECIMAL}");
        }
        
        if (record.getAexcepitems() != null) {
            sql.VALUES("AExcepItems", "#{aexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getAadjitems() != null) {
            sql.VALUES("AAdjItems", "#{aadjitems,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalassets() != null) {
            sql.VALUES("TotalAssets", "#{totalassets,jdbcType=DECIMAL}");
        }
        
        if (record.getShorttermloan() != null) {
            sql.VALUES("ShortTermLoan", "#{shorttermloan,jdbcType=DECIMAL}");
        }
        
        if (record.getImpawnedloan() != null) {
            sql.VALUES("ImpawnedLoan", "#{impawnedloan,jdbcType=DECIMAL}");
        }
        
        if (record.getStbpayable() != null) {
            sql.VALUES("STBPayable", "#{stbpayable,jdbcType=DECIMAL}");
        }
        
        if (record.getTradinglia() != null) {
            sql.VALUES("TradingLia", "#{tradinglia,jdbcType=DECIMAL}");
        }
        
        if (record.getNotespayable() != null) {
            sql.VALUES("NotesPayable", "#{notespayable,jdbcType=DECIMAL}");
        }
        
        if (record.getAccpayable() != null) {
            sql.VALUES("AccPayable", "#{accpayable,jdbcType=DECIMAL}");
        }
        
        if (record.getAdvancerece() != null) {
            sql.VALUES("AdvanceRece", "#{advancerece,jdbcType=DECIMAL}");
        }
        
        if (record.getSalapayable() != null) {
            sql.VALUES("SalaPayable", "#{salapayable,jdbcType=DECIMAL}");
        }
        
        if (record.getDivipayable() != null) {
            sql.VALUES("DiviPayable", "#{divipayable,jdbcType=DECIMAL}");
        }
        
        if (record.getTaxspayable() != null) {
            sql.VALUES("TaxsPayable", "#{taxspayable,jdbcType=DECIMAL}");
        }
        
        if (record.getIntepayable() != null) {
            sql.VALUES("IntePayable", "#{intepayable,jdbcType=DECIMAL}");
        }
        
        if (record.getOtherpayable() != null) {
            sql.VALUES("OtherPayable", "#{otherpayable,jdbcType=DECIMAL}");
        }
        
        if (record.getAccrexpense() != null) {
            sql.VALUES("AccrExpense", "#{accrexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getDefproceeds() != null) {
            sql.VALUES("DefProceeds", "#{defproceeds,jdbcType=DECIMAL}");
        }
        
        if (record.getHoldandfsli() != null) {
            sql.VALUES("HoldAndFSLi", "#{holdandfsli,jdbcType=DECIMAL}");
        }
        
        if (record.getNoncurliain1y() != null) {
            sql.VALUES("NonCurLiaIn1Y", "#{noncurliain1y,jdbcType=DECIMAL}");
        }
        
        if (record.getOthercurlia() != null) {
            sql.VALUES("OtherCurLia", "#{othercurlia,jdbcType=DECIMAL}");
        }
        
        if (record.getClexcepitems() != null) {
            sql.VALUES("CLExcepItems", "#{clexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getCladjitems() != null) {
            sql.VALUES("CLAdjItems", "#{cladjitems,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalcurlia() != null) {
            sql.VALUES("TotalCurLia", "#{totalcurlia,jdbcType=DECIMAL}");
        }
        
        if (record.getLongtermloan() != null) {
            sql.VALUES("LongtermLoan", "#{longtermloan,jdbcType=DECIMAL}");
        }
        
        if (record.getBondspayable() != null) {
            sql.VALUES("BondsPayable", "#{bondspayable,jdbcType=DECIMAL}");
        }
        
        if (record.getLpreferstock() != null) {
            sql.VALUES("LPreferStock", "#{lpreferstock,jdbcType=DECIMAL}");
        }
        
        if (record.getLperpdebt() != null) {
            sql.VALUES("LPerpDebt", "#{lperpdebt,jdbcType=DECIMAL}");
        }
        
        if (record.getLtaccpayable() != null) {
            sql.VALUES("LTAccPayable", "#{ltaccpayable,jdbcType=DECIMAL}");
        }
        
        if (record.getLongsalapay() != null) {
            sql.VALUES("LongSalaPay", "#{longsalapay,jdbcType=DECIMAL}");
        }
        
        if (record.getSpecaccpayable() != null) {
            sql.VALUES("SpecAccPayable", "#{specaccpayable,jdbcType=DECIMAL}");
        }
        
        if (record.getEstimatelia() != null) {
            sql.VALUES("EstimateLia", "#{estimatelia,jdbcType=DECIMAL}");
        }
        
        if (record.getDeftaxlia() != null) {
            sql.VALUES("DefTaxLia", "#{deftaxlia,jdbcType=DECIMAL}");
        }
        
        if (record.getDefincome() != null) {
            sql.VALUES("DefIncome", "#{defincome,jdbcType=DECIMAL}");
        }
        
        if (record.getOthernoncurlia() != null) {
            sql.VALUES("OtherNonCurLia", "#{othernoncurlia,jdbcType=DECIMAL}");
        }
        
        if (record.getNclexcepitems() != null) {
            sql.VALUES("NCLExcepItems", "#{nclexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getNcladjitems() != null) {
            sql.VALUES("NCLAdjItems", "#{ncladjitems,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalnoncurlia() != null) {
            sql.VALUES("TotalNonCurLia", "#{totalnoncurlia,jdbcType=DECIMAL}");
        }
        
        if (record.getBorfromcb() != null) {
            sql.VALUES("BorFromCB", "#{borfromcb,jdbcType=DECIMAL}");
        }
        
        if (record.getDepofinterbank() != null) {
            sql.VALUES("DepOfInterbank", "#{depofinterbank,jdbcType=DECIMAL}");
        }
        
        if (record.getBorcapital() != null) {
            sql.VALUES("BorCapital", "#{borcapital,jdbcType=DECIMAL}");
        }
        
        if (record.getDerilia() != null) {
            sql.VALUES("DeriLia", "#{derilia,jdbcType=DECIMAL}");
        }
        
        if (record.getSbbacksecupros() != null) {
            sql.VALUES("SBbackSecuPros", "#{sbbacksecupros,jdbcType=DECIMAL}");
        }
        
        if (record.getDeposit() != null) {
            sql.VALUES("Deposit", "#{deposit,jdbcType=DECIMAL}");
        }
        
        if (record.getProsecupros() != null) {
            sql.VALUES("ProSecuPros", "#{prosecupros,jdbcType=DECIMAL}");
        }
        
        if (record.getSubisssecupros() != null) {
            sql.VALUES("SubIssSecuPros", "#{subisssecupros,jdbcType=DECIMAL}");
        }
        
        if (record.getDepreceived() != null) {
            sql.VALUES("DepReceived", "#{depreceived,jdbcType=DECIMAL}");
        }
        
        if (record.getAdvinsurance() != null) {
            sql.VALUES("AdvInsurance", "#{advinsurance,jdbcType=DECIMAL}");
        }
        
        if (record.getCommipayable() != null) {
            sql.VALUES("CommiPayable", "#{commipayable,jdbcType=DECIMAL}");
        }
        
        if (record.getReinpayables() != null) {
            sql.VALUES("ReinPayables", "#{reinpayables,jdbcType=DECIMAL}");
        }
        
        if (record.getComppayable() != null) {
            sql.VALUES("CompPayable", "#{comppayable,jdbcType=DECIMAL}");
        }
        
        if (record.getPoldivpayable() != null) {
            sql.VALUES("PolDivPayable", "#{poldivpayable,jdbcType=DECIMAL}");
        }
        
        if (record.getInsdepinvest() != null) {
            sql.VALUES("InsDepInvest", "#{insdepinvest,jdbcType=DECIMAL}");
        }
        
        if (record.getUneprereserve() != null) {
            sql.VALUES("UnePreReserve", "#{uneprereserve,jdbcType=DECIMAL}");
        }
        
        if (record.getOutingclares() != null) {
            sql.VALUES("OutingClaRes", "#{outingclares,jdbcType=DECIMAL}");
        }
        
        if (record.getLifeinsreserve() != null) {
            sql.VALUES("LifeInsReserve", "#{lifeinsreserve,jdbcType=DECIMAL}");
        }
        
        if (record.getLthealinslr() != null) {
            sql.VALUES("LTHealInsLR", "#{lthealinslr,jdbcType=DECIMAL}");
        }
        
        if (record.getIndliab() != null) {
            sql.VALUES("IndLiab", "#{indliab,jdbcType=DECIMAL}");
        }
        
        if (record.getOtherliab() != null) {
            sql.VALUES("OtherLiab", "#{otherliab,jdbcType=DECIMAL}");
        }
        
        if (record.getLexcepitems() != null) {
            sql.VALUES("LExcepItems", "#{lexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getLadjuitems() != null) {
            sql.VALUES("LAdjuItems", "#{ladjuitems,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalliab() != null) {
            sql.VALUES("TotalLiab", "#{totalliab,jdbcType=DECIMAL}");
        }
        
        if (record.getPaidincapital() != null) {
            sql.VALUES("PaidInCapital", "#{paidincapital,jdbcType=DECIMAL}");
        }
        
        if (record.getOtherequ() != null) {
            sql.VALUES("OtherEqu", "#{otherequ,jdbcType=DECIMAL}");
        }
        
        if (record.getEpreferstock() != null) {
            sql.VALUES("EPreferStock", "#{epreferstock,jdbcType=DECIMAL}");
        }
        
        if (record.getEperpdebt() != null) {
            sql.VALUES("EPerpDebt", "#{eperpdebt,jdbcType=DECIMAL}");
        }
        
        if (record.getCapresfund() != null) {
            sql.VALUES("CapResFund", "#{capresfund,jdbcType=DECIMAL}");
        }
        
        if (record.getTreastock() != null) {
            sql.VALUES("TreaStock", "#{treastock,jdbcType=DECIMAL}");
        }
        
        if (record.getSplusresfund() != null) {
            sql.VALUES("SplusResFund", "#{splusresfund,jdbcType=DECIMAL}");
        }
        
        if (record.getRetaprofit() != null) {
            sql.VALUES("RetaProfit", "#{retaprofit,jdbcType=DECIMAL}");
        }
        
        if (record.getOthercompincome() != null) {
            sql.VALUES("OtherCompIncome", "#{othercompincome,jdbcType=DECIMAL}");
        }
        
        if (record.getOrdriskresfund() != null) {
            sql.VALUES("OrdRiskResFund", "#{ordriskresfund,jdbcType=DECIMAL}");
        }
        
        if (record.getForcurrepcdiff() != null) {
            sql.VALUES("ForCurRepCDiff", "#{forcurrepcdiff,jdbcType=DECIMAL}");
        }
        
        if (record.getUncinvloss() != null) {
            sql.VALUES("UncInvLoss", "#{uncinvloss,jdbcType=DECIMAL}");
        }
        
        if (record.getOtherres() != null) {
            sql.VALUES("OtherRes", "#{otherres,jdbcType=DECIMAL}");
        }
        
        if (record.getSpecreserves() != null) {
            sql.VALUES("SpecReserves", "#{specreserves,jdbcType=DECIMAL}");
        }
        
        if (record.getSeexcepitems() != null) {
            sql.VALUES("SEExcepItems", "#{seexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getSeadjitems() != null) {
            sql.VALUES("SEAdjItems", "#{seadjitems,jdbcType=DECIMAL}");
        }
        
        if (record.getSewithoutmi() != null) {
            sql.VALUES("SEWithoutMI", "#{sewithoutmi,jdbcType=DECIMAL}");
        }
        
        if (record.getMininterests() != null) {
            sql.VALUES("MinInterests", "#{mininterests,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheritemseffse() != null) {
            sql.VALUES("OtherItemsEffSE", "#{otheritemseffse,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalshequity() != null) {
            sql.VALUES("TotalShEquity", "#{totalshequity,jdbcType=DECIMAL}");
        }
        
        if (record.getLeexcepitems() != null) {
            sql.VALUES("LEExcepItems", "#{leexcepitems,jdbcType=DECIMAL}");
        }
        
        if (record.getLeadjitems() != null) {
            sql.VALUES("LEAdjItems", "#{leadjitems,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalliaandequ() != null) {
            sql.VALUES("TotalLiaAndEqu", "#{totalliaandequ,jdbcType=DECIMAL}");
        }
        
        if (record.getUpdatetime() != null) {
            sql.VALUES("UpdateTime", "#{updatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getJsid() != null) {
            sql.VALUES("JSID", "#{jsid,jdbcType=BIGINT}");
        }
        
        if (record.getFiscalyear() != null) {
            sql.VALUES("FiscalYear", "#{fiscalyear,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInserttime() != null) {
            sql.VALUES("InsertTime", "#{inserttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInfosourcecode() != null) {
            sql.VALUES("InfoSourceCode", "#{infosourcecode,jdbcType=INTEGER}");
        }
        
        if (record.getBegindate() != null) {
            sql.VALUES("BeginDate", "#{begindate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountingstandards() != null) {
            sql.VALUES("AccountingStandards", "#{accountingstandards,jdbcType=INTEGER}");
        }
        
        if (record.getGmark() != null) {
            sql.VALUES("Gmark", "#{gmark,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }
}