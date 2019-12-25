package com.zzzhc.data.engine.dataprovider.jyhs.dao;

import com.zzzhc.data.engine.dataprovider.jyhs.entitybeet.HKCashFlowStatementCN;
import org.apache.ibatis.jdbc.SQL;

public class HKCashFlowStatementCNSqlProvider {

    /**
     *
     * @mbg.generated 2019-02-26
     */
    public String insertSelective(HKCashFlowStatementCN record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hk_cashflowstatementcn");
        
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
        
        if (record.getFiscalyear() != null) {
            sql.VALUES("FiscalYear", "#{fiscalyear,jdbcType=TIMESTAMP}");
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
        
        if (record.getGdsaserecash() != null) {
            sql.VALUES("GdSaSeReCash", "#{gdsaserecash,jdbcType=DECIMAL}");
        }
        
        if (record.getTaxlerefund() != null) {
            sql.VALUES("TaxLeRefund", "#{taxlerefund,jdbcType=DECIMAL}");
        }
        
        if (record.getNetdepince() != null) {
            sql.VALUES("NetDepInce", "#{netdepince,jdbcType=DECIMAL}");
        }
        
        if (record.getNetborfromcb() != null) {
            sql.VALUES("NetBorFromCB", "#{netborfromcb,jdbcType=DECIMAL}");
        }
        
        if (record.getNetborfromfinco() != null) {
            sql.VALUES("NetBorFromFinCo", "#{netborfromfinco,jdbcType=DECIMAL}");
        }
        
        if (record.getDrbaloanscanc() != null) {
            sql.VALUES("DrBaLoansCanc", "#{drbaloanscanc,jdbcType=DECIMAL}");
        }
        
        if (record.getIntandcomcashin() != null) {
            sql.VALUES("IntAndComCashIn", "#{intandcomcashin,jdbcType=DECIMAL}");
        }
        
        if (record.getNdealtradassets() != null) {
            sql.VALUES("NDealTradAssets", "#{ndealtradassets,jdbcType=DECIMAL}");
        }
        
        if (record.getNetbuyback() != null) {
            sql.VALUES("NetBuyBack", "#{netbuyback,jdbcType=DECIMAL}");
        }
        
        if (record.getNetoriinscash() != null) {
            sql.VALUES("NetOriInsCash", "#{netoriinscash,jdbcType=DECIMAL}");
        }
        
        if (record.getNetreincash() != null) {
            sql.VALUES("NetReinCash", "#{netreincash,jdbcType=DECIMAL}");
        }
        
        if (record.getNetinsdepinv() != null) {
            sql.VALUES("NetInsDepInv", "#{netinsdepinv,jdbcType=DECIMAL}");
        }
        
        if (record.getOthcashinrelope() != null) {
            sql.VALUES("OthCashInRelOpe", "#{othcashinrelope,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsocif() != null) {
            sql.VALUES("SpeItemsOCIF", "#{speitemsocif,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsocif() != null) {
            sql.VALUES("AdjItemsOCIF", "#{adjitemsocif,jdbcType=DECIMAL}");
        }
        
        if (record.getSuopcashinflow() != null) {
            sql.VALUES("SuOpCashInflow", "#{suopcashinflow,jdbcType=DECIMAL}");
        }
        
        if (record.getGdsercashpaid() != null) {
            sql.VALUES("GdSerCashPaid", "#{gdsercashpaid,jdbcType=DECIMAL}");
        }
        
        if (record.getStabehalfpaid() != null) {
            sql.VALUES("StaBehalfPaid", "#{stabehalfpaid,jdbcType=DECIMAL}");
        }
        
        if (record.getAlltaxespaid() != null) {
            sql.VALUES("AllTaxesPaid", "#{alltaxespaid,jdbcType=DECIMAL}");
        }
        
        if (record.getNetladvinc() != null) {
            sql.VALUES("NetLAdvInc", "#{netladvinc,jdbcType=DECIMAL}");
        }
        
        if (record.getNetdepincbandib() != null) {
            sql.VALUES("NetDepInCBAndIB", "#{netdepincbandib,jdbcType=DECIMAL}");
        }
        
        if (record.getNetlendcap() != null) {
            sql.VALUES("NetLendCap", "#{netlendcap,jdbcType=DECIMAL}");
        }
        
        if (record.getComcashpaid() != null) {
            sql.VALUES("ComCashPaid", "#{comcashpaid,jdbcType=DECIMAL}");
        }
        
        if (record.getOricomppaid() != null) {
            sql.VALUES("OriCompPaid", "#{oricomppaid,jdbcType=DECIMAL}");
        }
        
        if (record.getNetcashforrein() != null) {
            sql.VALUES("NetCashForRein", "#{netcashforrein,jdbcType=DECIMAL}");
        }
        
        if (record.getPoldivcashpaid() != null) {
            sql.VALUES("PolDivCashPaid", "#{poldivcashpaid,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheropcashpaid() != null) {
            sql.VALUES("OtherOpCashPaid", "#{otheropcashpaid,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsocof() != null) {
            sql.VALUES("SpeItemsOCOF", "#{speitemsocof,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsocof() != null) {
            sql.VALUES("AdjItemsOCOF", "#{adjitemsocof,jdbcType=DECIMAL}");
        }
        
        if (record.getSubopcoutflow() != null) {
            sql.VALUES("SubOpCOutflow", "#{subopcoutflow,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsnocf() != null) {
            sql.VALUES("AdjItemsNOCF", "#{adjitemsnocf,jdbcType=DECIMAL}");
        }
        
        if (record.getNetopecflow() != null) {
            sql.VALUES("NetOpeCFlow", "#{netopecflow,jdbcType=DECIMAL}");
        }
        
        if (record.getInvwithdcash() != null) {
            sql.VALUES("InvWithdCash", "#{invwithdcash,jdbcType=DECIMAL}");
        }
        
        if (record.getInvproceeds() != null) {
            sql.VALUES("Invproceeds", "#{invproceeds,jdbcType=DECIMAL}");
        }
        
        if (record.getFixinotadiscash() != null) {
            sql.VALUES("FixInOtADisCash", "#{fixinotadiscash,jdbcType=DECIMAL}");
        }
        
        if (record.getNcashdealscomp() != null) {
            sql.VALUES("NCashDealSComp", "#{ncashdealscomp,jdbcType=DECIMAL}");
        }
        
        if (record.getOthcafrominvact() != null) {
            sql.VALUES("OthCaFromInvAct", "#{othcafrominvact,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsicif() != null) {
            sql.VALUES("SpeItemsICIF", "#{speitemsicif,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsicif() != null) {
            sql.VALUES("AdjItemsICIF", "#{adjitemsicif,jdbcType=DECIMAL}");
        }
        
        if (record.getSubinvcainflow() != null) {
            sql.VALUES("SubInvCaInflow", "#{subinvcainflow,jdbcType=DECIMAL}");
        }
        
        if (record.getFixinoasaccash() != null) {
            sql.VALUES("FixInOAsAcCash", "#{fixinoasaccash,jdbcType=DECIMAL}");
        }
        
        if (record.getInvcashpaid() != null) {
            sql.VALUES("InvCashPaid", "#{invcashpaid,jdbcType=DECIMAL}");
        }
        
        if (record.getNcashfromscomp() != null) {
            sql.VALUES("NCashFromSComp", "#{ncashfromscomp,jdbcType=DECIMAL}");
        }
        
        if (record.getImloannetinc() != null) {
            sql.VALUES("ImLoanNetInc", "#{imloannetinc,jdbcType=DECIMAL}");
        }
        
        if (record.getOthcashtoinvact() != null) {
            sql.VALUES("OthCashToInvAct", "#{othcashtoinvact,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsicof() != null) {
            sql.VALUES("SpeItemsICOF", "#{speitemsicof,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsicof() != null) {
            sql.VALUES("AdjItemsICOF", "#{adjitemsicof,jdbcType=DECIMAL}");
        }
        
        if (record.getSubinvcashoflow() != null) {
            sql.VALUES("SubInvCashOflow", "#{subinvcashoflow,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsnicf() != null) {
            sql.VALUES("AdjItemsNICF", "#{adjitemsnicf,jdbcType=DECIMAL}");
        }
        
        if (record.getNetinvcashflow() != null) {
            sql.VALUES("NetInvCashFlow", "#{netinvcashflow,jdbcType=DECIMAL}");
        }
        
        if (record.getCashfrominv() != null) {
            sql.VALUES("CashFromInv", "#{cashfrominv,jdbcType=DECIMAL}");
        }
        
        if (record.getCfminosinvsub() != null) {
            sql.VALUES("CFMinoSInvSub", "#{cfminosinvsub,jdbcType=DECIMAL}");
        }
        
        if (record.getCfbondsissue() != null) {
            sql.VALUES("CFBondsIssue", "#{cfbondsissue,jdbcType=DECIMAL}");
        }
        
        if (record.getCfborrowing() != null) {
            sql.VALUES("CFBorrowing", "#{cfborrowing,jdbcType=DECIMAL}");
        }
        
        if (record.getOthfinactcash() != null) {
            sql.VALUES("OthFinActCash", "#{othfinactcash,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsfcif() != null) {
            sql.VALUES("SpeItemsFCIF", "#{speitemsfcif,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsfcif() != null) {
            sql.VALUES("AdjItemsFCIF", "#{adjitemsfcif,jdbcType=DECIMAL}");
        }
        
        if (record.getSubfincashinfl() != null) {
            sql.VALUES("SubFinCashInfl", "#{subfincashinfl,jdbcType=DECIMAL}");
        }
        
        if (record.getBorrepayment() != null) {
            sql.VALUES("BorRepayment", "#{borrepayment,jdbcType=DECIMAL}");
        }
        
        if (record.getDivintpayment() != null) {
            sql.VALUES("DivIntPayment", "#{divintpayment,jdbcType=DECIMAL}");
        }
        
        if (record.getProfromsubtmis() != null) {
            sql.VALUES("ProFromSubTMiS", "#{profromsubtmis,jdbcType=DECIMAL}");
        }
        
        if (record.getOthfinactp() != null) {
            sql.VALUES("OthFinActP", "#{othfinactp,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsfcof() != null) {
            sql.VALUES("SpeItemsFCOF", "#{speitemsfcof,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsfcof() != null) {
            sql.VALUES("AdjItemsFCOF", "#{adjitemsfcof,jdbcType=DECIMAL}");
        }
        
        if (record.getSubfincoflow() != null) {
            sql.VALUES("SubFinCOflow", "#{subfincoflow,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsnfcf() != null) {
            sql.VALUES("AdjItemsNFCF", "#{adjitemsnfcf,jdbcType=DECIMAL}");
        }
        
        if (record.getNetfincashflow() != null) {
            sql.VALUES("NetFinCashFlow", "#{netfincashflow,jdbcType=DECIMAL}");
        }
        
        if (record.getExratechgeffect() != null) {
            sql.VALUES("ExRateChgEffect", "#{exratechgeffect,jdbcType=DECIMAL}");
        }
        
        if (record.getOthitemseffce() != null) {
            sql.VALUES("OthItemsEffCE", "#{othitemseffce,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsce() != null) {
            sql.VALUES("AdjItemsCE", "#{adjitemsce,jdbcType=DECIMAL}");
        }
        
        if (record.getCequinc() != null) {
            sql.VALUES("CEquInc", "#{cequinc,jdbcType=DECIMAL}");
        }
        
        if (record.getBeginperiodcash() != null) {
            sql.VALUES("BeginPeriodCash", "#{beginperiodcash,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemscei() != null) {
            sql.VALUES("AdjItemsCEI", "#{adjitemscei,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheritemeffcei() != null) {
            sql.VALUES("OtherItemEffCEI", "#{otheritemeffcei,jdbcType=DECIMAL}");
        }
        
        if (record.getEndpercequ() != null) {
            sql.VALUES("EndPerCEqu", "#{endpercequ,jdbcType=DECIMAL}");
        }
        
        if (record.getNetprofit() != null) {
            sql.VALUES("NetProfit", "#{netprofit,jdbcType=DECIMAL}");
        }
        
        if (record.getMinoprofit() != null) {
            sql.VALUES("MinoProfit", "#{minoprofit,jdbcType=DECIMAL}");
        }
        
        if (record.getAdeprereserves() != null) {
            sql.VALUES("ADepreReserves", "#{adeprereserves,jdbcType=DECIMAL}");
        }
        
        if (record.getFassetdep() != null) {
            sql.VALUES("FAssetDep", "#{fassetdep,jdbcType=DECIMAL}");
        }
        
        if (record.getIntaamort() != null) {
            sql.VALUES("IntAAmort", "#{intaamort,jdbcType=DECIMAL}");
        }
        
        if (record.getDefexpamort() != null) {
            sql.VALUES("DefExpAmort", "#{defexpamort,jdbcType=DECIMAL}");
        }
        
        if (record.getDefexpdecd() != null) {
            sql.VALUES("DefExpDecd", "#{defexpdecd,jdbcType=DECIMAL}");
        }
        
        if (record.getAccexpenseadded() != null) {
            sql.VALUES("AccExpenseAdded", "#{accexpenseadded,jdbcType=DECIMAL}");
        }
        
        if (record.getFixinothadloss() != null) {
            sql.VALUES("FixInOthADLoss", "#{fixinothadloss,jdbcType=DECIMAL}");
        }
        
        if (record.getFixedassetsloss() != null) {
            sql.VALUES("FixedAssetSLoss", "#{fixedassetsloss,jdbcType=DECIMAL}");
        }
        
        if (record.getLfromfvaluechg() != null) {
            sql.VALUES("LFromFValueChg", "#{lfromfvaluechg,jdbcType=DECIMAL}");
        }
        
        if (record.getFinexpense() != null) {
            sql.VALUES("FinExpense", "#{finexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getInvestloss() != null) {
            sql.VALUES("InvestLoss", "#{investloss,jdbcType=DECIMAL}");
        }
        
        if (record.getDeftaxassetdec() != null) {
            sql.VALUES("DefTaxAssetDec", "#{deftaxassetdec,jdbcType=DECIMAL}");
        }
        
        if (record.getDeftaxliainc() != null) {
            sql.VALUES("DefTaxLiaInc", "#{deftaxliainc,jdbcType=DECIMAL}");
        }
        
        if (record.getInvdec() != null) {
            sql.VALUES("InvDec", "#{invdec,jdbcType=DECIMAL}");
        }
        
        if (record.getOperecdec() != null) {
            sql.VALUES("OpeRecDec", "#{operecdec,jdbcType=DECIMAL}");
        }
        
        if (record.getOpepayableinc() != null) {
            sql.VALUES("OpePayableInc", "#{opepayableinc,jdbcType=DECIMAL}");
        }
        
        if (record.getOthers() != null) {
            sql.VALUES("Others", "#{others,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsnocf1() != null) {
            sql.VALUES("SpeItemsNOCF1", "#{speitemsnocf1,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsnocf1() != null) {
            sql.VALUES("AdjItemsNOCF1", "#{adjitemsnocf1,jdbcType=DECIMAL}");
        }
        
        if (record.getNetopecfnotes() != null) {
            sql.VALUES("NetOpeCFNotes", "#{netopecfnotes,jdbcType=DECIMAL}");
        }
        
        if (record.getConadjnocf() != null) {
            sql.VALUES("ConAdjNOCF", "#{conadjnocf,jdbcType=DECIMAL}");
        }
        
        if (record.getDebttocap() != null) {
            sql.VALUES("DebtToCap", "#{debttocap,jdbcType=DECIMAL}");
        }
        
        if (record.getCbsexpwithin1y() != null) {
            sql.VALUES("CBsExpWithin1Y", "#{cbsexpwithin1y,jdbcType=DECIMAL}");
        }
        
        if (record.getFixedafinleases() != null) {
            sql.VALUES("FixedAFinLeases", "#{fixedafinleases,jdbcType=DECIMAL}");
        }
        
        if (record.getCashatendofyear() != null) {
            sql.VALUES("CashAtEndOfYear", "#{cashatendofyear,jdbcType=DECIMAL}");
        }
        
        if (record.getCashatbofyear() != null) {
            sql.VALUES("CashAtBOfYear", "#{cashatbofyear,jdbcType=DECIMAL}");
        }
        
        if (record.getCequateofyear() != null) {
            sql.VALUES("CEquAtEOfYear", "#{cequateofyear,jdbcType=DECIMAL}");
        }
        
        if (record.getCequatbeginning() != null) {
            sql.VALUES("CEquAtBeginning", "#{cequatbeginning,jdbcType=DECIMAL}");
        }
        
        if (record.getConadjnc() != null) {
            sql.VALUES("ConAdjNC", "#{conadjnc,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsc() != null) {
            sql.VALUES("SpeItemsC", "#{speitemsc,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsc() != null) {
            sql.VALUES("AdjItemsC", "#{adjitemsc,jdbcType=DECIMAL}");
        }
        
        if (record.getNetincrincequ() != null) {
            sql.VALUES("NetIncrInCEqu", "#{netincrincequ,jdbcType=DECIMAL}");
        }
        
        if (record.getUpdatetime() != null) {
            sql.VALUES("UpdateTime", "#{updatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getJsid() != null) {
            sql.VALUES("JSID", "#{jsid,jdbcType=BIGINT}");
        }
        
        if (record.getInfosourcecode() != null) {
            sql.VALUES("InfoSourceCode", "#{infosourcecode,jdbcType=INTEGER}");
        }
        
        if (record.getAccountingstandards() != null) {
            sql.VALUES("AccountingStandards", "#{accountingstandards,jdbcType=INTEGER}");
        }
        
        if (record.getBegindate() != null) {
            sql.VALUES("BeginDate", "#{begindate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmark() != null) {
            sql.VALUES("Gmark", "#{gmark,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }
}