package com.zzzhc.data.engine.dataprovider.jyhs.dao;

import com.zzzhc.data.engine.dataprovider.jyhs.entitybeet.HKCashFlowStatementCN;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface HKCashFlowStatementCNMapper {
    /**
     *
     * @mbg.generated 2019-02-26
     */
    @Insert({
        "insert into hk_cashflowstatementcn (ID, CompanyCode, ",
        "InfoPublDate, InfoSource, ",
        "EndDate, PeriodMark, ",
        "FiscalYear, CompanyNature, ",
        "Mark, CurrencyUnit, ",
        "GdSaSeReCash, TaxLeRefund, ",
        "NetDepInce, NetBorFromCB, ",
        "NetBorFromFinCo, DrBaLoansCanc, ",
        "IntAndComCashIn, NDealTradAssets, ",
        "NetBuyBack, NetOriInsCash, ",
        "NetReinCash, NetInsDepInv, ",
        "OthCashInRelOpe, SpeItemsOCIF, ",
        "AdjItemsOCIF, SuOpCashInflow, ",
        "GdSerCashPaid, StaBehalfPaid, ",
        "AllTaxesPaid, NetLAdvInc, ",
        "NetDepInCBAndIB, NetLendCap, ",
        "ComCashPaid, OriCompPaid, ",
        "NetCashForRein, PolDivCashPaid, ",
        "OtherOpCashPaid, SpeItemsOCOF, ",
        "AdjItemsOCOF, SubOpCOutflow, ",
        "AdjItemsNOCF, NetOpeCFlow, ",
        "InvWithdCash, Invproceeds, ",
        "FixInOtADisCash, NCashDealSComp, ",
        "OthCaFromInvAct, SpeItemsICIF, ",
        "AdjItemsICIF, SubInvCaInflow, ",
        "FixInOAsAcCash, InvCashPaid, ",
        "NCashFromSComp, ImLoanNetInc, ",
        "OthCashToInvAct, SpeItemsICOF, ",
        "AdjItemsICOF, SubInvCashOflow, ",
        "AdjItemsNICF, NetInvCashFlow, ",
        "CashFromInv, CFMinoSInvSub, ",
        "CFBondsIssue, CFBorrowing, ",
        "OthFinActCash, SpeItemsFCIF, ",
        "AdjItemsFCIF, SubFinCashInfl, ",
        "BorRepayment, DivIntPayment, ",
        "ProFromSubTMiS, OthFinActP, ",
        "SpeItemsFCOF, AdjItemsFCOF, ",
        "SubFinCOflow, AdjItemsNFCF, ",
        "NetFinCashFlow, ExRateChgEffect, ",
        "OthItemsEffCE, AdjItemsCE, ",
        "CEquInc, BeginPeriodCash, ",
        "AdjItemsCEI, OtherItemEffCEI, ",
        "EndPerCEqu, NetProfit, ",
        "MinoProfit, ADepreReserves, ",
        "FAssetDep, IntAAmort, ",
        "DefExpAmort, DefExpDecd, ",
        "AccExpenseAdded, FixInOthADLoss, ",
        "FixedAssetSLoss, LFromFValueChg, ",
        "FinExpense, InvestLoss, ",
        "DefTaxAssetDec, DefTaxLiaInc, ",
        "InvDec, OpeRecDec, ",
        "OpePayableInc, Others, ",
        "SpeItemsNOCF1, AdjItemsNOCF1, ",
        "NetOpeCFNotes, ConAdjNOCF, ",
        "DebtToCap, CBsExpWithin1Y, ",
        "FixedAFinLeases, CashAtEndOfYear, ",
        "CashAtBOfYear, CEquAtEOfYear, ",
        "CEquAtBeginning, ConAdjNC, ",
        "SpeItemsC, AdjItemsC, ",
        "NetIncrInCEqu, UpdateTime, ",
        "JSID, InfoSourceCode, ",
        "AccountingStandards, BeginDate, ",
        "Gmark)",
        "values (#{id,jdbcType=BIGINT}, #{companycode,jdbcType=INTEGER}, ",
        "#{infopubldate,jdbcType=TIMESTAMP}, #{infosource,jdbcType=VARCHAR}, ",
        "#{enddate,jdbcType=TIMESTAMP}, #{periodmark,jdbcType=INTEGER}, ",
        "#{fiscalyear,jdbcType=TIMESTAMP}, #{companynature,jdbcType=INTEGER}, ",
        "#{mark,jdbcType=INTEGER}, #{currencyunit,jdbcType=INTEGER}, ",
        "#{gdsaserecash,jdbcType=DECIMAL}, #{taxlerefund,jdbcType=DECIMAL}, ",
        "#{netdepince,jdbcType=DECIMAL}, #{netborfromcb,jdbcType=DECIMAL}, ",
        "#{netborfromfinco,jdbcType=DECIMAL}, #{drbaloanscanc,jdbcType=DECIMAL}, ",
        "#{intandcomcashin,jdbcType=DECIMAL}, #{ndealtradassets,jdbcType=DECIMAL}, ",
        "#{netbuyback,jdbcType=DECIMAL}, #{netoriinscash,jdbcType=DECIMAL}, ",
        "#{netreincash,jdbcType=DECIMAL}, #{netinsdepinv,jdbcType=DECIMAL}, ",
        "#{othcashinrelope,jdbcType=DECIMAL}, #{speitemsocif,jdbcType=DECIMAL}, ",
        "#{adjitemsocif,jdbcType=DECIMAL}, #{suopcashinflow,jdbcType=DECIMAL}, ",
        "#{gdsercashpaid,jdbcType=DECIMAL}, #{stabehalfpaid,jdbcType=DECIMAL}, ",
        "#{alltaxespaid,jdbcType=DECIMAL}, #{netladvinc,jdbcType=DECIMAL}, ",
        "#{netdepincbandib,jdbcType=DECIMAL}, #{netlendcap,jdbcType=DECIMAL}, ",
        "#{comcashpaid,jdbcType=DECIMAL}, #{oricomppaid,jdbcType=DECIMAL}, ",
        "#{netcashforrein,jdbcType=DECIMAL}, #{poldivcashpaid,jdbcType=DECIMAL}, ",
        "#{otheropcashpaid,jdbcType=DECIMAL}, #{speitemsocof,jdbcType=DECIMAL}, ",
        "#{adjitemsocof,jdbcType=DECIMAL}, #{subopcoutflow,jdbcType=DECIMAL}, ",
        "#{adjitemsnocf,jdbcType=DECIMAL}, #{netopecflow,jdbcType=DECIMAL}, ",
        "#{invwithdcash,jdbcType=DECIMAL}, #{invproceeds,jdbcType=DECIMAL}, ",
        "#{fixinotadiscash,jdbcType=DECIMAL}, #{ncashdealscomp,jdbcType=DECIMAL}, ",
        "#{othcafrominvact,jdbcType=DECIMAL}, #{speitemsicif,jdbcType=DECIMAL}, ",
        "#{adjitemsicif,jdbcType=DECIMAL}, #{subinvcainflow,jdbcType=DECIMAL}, ",
        "#{fixinoasaccash,jdbcType=DECIMAL}, #{invcashpaid,jdbcType=DECIMAL}, ",
        "#{ncashfromscomp,jdbcType=DECIMAL}, #{imloannetinc,jdbcType=DECIMAL}, ",
        "#{othcashtoinvact,jdbcType=DECIMAL}, #{speitemsicof,jdbcType=DECIMAL}, ",
        "#{adjitemsicof,jdbcType=DECIMAL}, #{subinvcashoflow,jdbcType=DECIMAL}, ",
        "#{adjitemsnicf,jdbcType=DECIMAL}, #{netinvcashflow,jdbcType=DECIMAL}, ",
        "#{cashfrominv,jdbcType=DECIMAL}, #{cfminosinvsub,jdbcType=DECIMAL}, ",
        "#{cfbondsissue,jdbcType=DECIMAL}, #{cfborrowing,jdbcType=DECIMAL}, ",
        "#{othfinactcash,jdbcType=DECIMAL}, #{speitemsfcif,jdbcType=DECIMAL}, ",
        "#{adjitemsfcif,jdbcType=DECIMAL}, #{subfincashinfl,jdbcType=DECIMAL}, ",
        "#{borrepayment,jdbcType=DECIMAL}, #{divintpayment,jdbcType=DECIMAL}, ",
        "#{profromsubtmis,jdbcType=DECIMAL}, #{othfinactp,jdbcType=DECIMAL}, ",
        "#{speitemsfcof,jdbcType=DECIMAL}, #{adjitemsfcof,jdbcType=DECIMAL}, ",
        "#{subfincoflow,jdbcType=DECIMAL}, #{adjitemsnfcf,jdbcType=DECIMAL}, ",
        "#{netfincashflow,jdbcType=DECIMAL}, #{exratechgeffect,jdbcType=DECIMAL}, ",
        "#{othitemseffce,jdbcType=DECIMAL}, #{adjitemsce,jdbcType=DECIMAL}, ",
        "#{cequinc,jdbcType=DECIMAL}, #{beginperiodcash,jdbcType=DECIMAL}, ",
        "#{adjitemscei,jdbcType=DECIMAL}, #{otheritemeffcei,jdbcType=DECIMAL}, ",
        "#{endpercequ,jdbcType=DECIMAL}, #{netprofit,jdbcType=DECIMAL}, ",
        "#{minoprofit,jdbcType=DECIMAL}, #{adeprereserves,jdbcType=DECIMAL}, ",
        "#{fassetdep,jdbcType=DECIMAL}, #{intaamort,jdbcType=DECIMAL}, ",
        "#{defexpamort,jdbcType=DECIMAL}, #{defexpdecd,jdbcType=DECIMAL}, ",
        "#{accexpenseadded,jdbcType=DECIMAL}, #{fixinothadloss,jdbcType=DECIMAL}, ",
        "#{fixedassetsloss,jdbcType=DECIMAL}, #{lfromfvaluechg,jdbcType=DECIMAL}, ",
        "#{finexpense,jdbcType=DECIMAL}, #{investloss,jdbcType=DECIMAL}, ",
        "#{deftaxassetdec,jdbcType=DECIMAL}, #{deftaxliainc,jdbcType=DECIMAL}, ",
        "#{invdec,jdbcType=DECIMAL}, #{operecdec,jdbcType=DECIMAL}, ",
        "#{opepayableinc,jdbcType=DECIMAL}, #{others,jdbcType=DECIMAL}, ",
        "#{speitemsnocf1,jdbcType=DECIMAL}, #{adjitemsnocf1,jdbcType=DECIMAL}, ",
        "#{netopecfnotes,jdbcType=DECIMAL}, #{conadjnocf,jdbcType=DECIMAL}, ",
        "#{debttocap,jdbcType=DECIMAL}, #{cbsexpwithin1y,jdbcType=DECIMAL}, ",
        "#{fixedafinleases,jdbcType=DECIMAL}, #{cashatendofyear,jdbcType=DECIMAL}, ",
        "#{cashatbofyear,jdbcType=DECIMAL}, #{cequateofyear,jdbcType=DECIMAL}, ",
        "#{cequatbeginning,jdbcType=DECIMAL}, #{conadjnc,jdbcType=DECIMAL}, ",
        "#{speitemsc,jdbcType=DECIMAL}, #{adjitemsc,jdbcType=DECIMAL}, ",
        "#{netincrincequ,jdbcType=DECIMAL}, #{updatetime,jdbcType=TIMESTAMP}, ",
        "#{jsid,jdbcType=BIGINT}, #{infosourcecode,jdbcType=INTEGER}, ",
        "#{accountingstandards,jdbcType=INTEGER}, #{begindate,jdbcType=TIMESTAMP}, ",
        "#{gmark,jdbcType=INTEGER})"
    })
    int insert(HKCashFlowStatementCN record);

    /**
     *
     * @mbg.generated 2019-02-26
     */
    @InsertProvider(type=HKCashFlowStatementCNSqlProvider.class, method="insertSelective")
    int insertSelective(HKCashFlowStatementCN record);
}