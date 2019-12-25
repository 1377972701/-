package com.zzzhc.data.engine.dataprovider.jyhs.dao;

import com.zzzhc.data.engine.dataprovider.jyhs.entitybeet.HKIncomeStatementCN;
import org.apache.ibatis.jdbc.SQL;

public class HKIncomeStatementCNSqlProvider {

    /**
     *
     * @mbg.generated 2019-02-26
     */
    public String insertSelective(HKIncomeStatementCN record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hk_incomestatementcn");
        
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
        
        if (record.getTotoperev() != null) {
            sql.VALUES("TotOpeRev", "#{totoperev,jdbcType=DECIMAL}");
        }
        
        if (record.getOperev() != null) {
            sql.VALUES("OpeRev", "#{operev,jdbcType=DECIMAL}");
        }
        
        if (record.getNetintinc() != null) {
            sql.VALUES("NetIntInc", "#{netintinc,jdbcType=DECIMAL}");
        }
        
        if (record.getIntinc() != null) {
            sql.VALUES("IntInc", "#{intinc,jdbcType=DECIMAL}");
        }
        
        if (record.getIntexpense() != null) {
            sql.VALUES("IntExpense", "#{intexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getNetcominc() != null) {
            sql.VALUES("NetComInc", "#{netcominc,jdbcType=DECIMAL}");
        }
        
        if (record.getComincome() != null) {
            sql.VALUES("ComIncome", "#{comincome,jdbcType=DECIMAL}");
        }
        
        if (record.getComexpense() != null) {
            sql.VALUES("ComExpense", "#{comexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getNetprosecuinc() != null) {
            sql.VALUES("NetProSecuInc", "#{netprosecuinc,jdbcType=DECIMAL}");
        }
        
        if (record.getNetsubsecuinc() != null) {
            sql.VALUES("NetSubSecuInc", "#{netsubsecuinc,jdbcType=DECIMAL}");
        }
        
        if (record.getNettrustinc() != null) {
            sql.VALUES("NetTrustInc", "#{nettrustinc,jdbcType=DECIMAL}");
        }
        
        if (record.getPremiearned() != null) {
            sql.VALUES("PremiEarned", "#{premiearned,jdbcType=DECIMAL}");
        }
        
        if (record.getPremiincome() != null) {
            sql.VALUES("PremiIncome", "#{premiincome,jdbcType=DECIMAL}");
        }
        
        if (record.getReinincome() != null) {
            sql.VALUES("ReinIncome", "#{reinincome,jdbcType=DECIMAL}");
        }
        
        if (record.getReinsurance() != null) {
            sql.VALUES("Reinsurance", "#{reinsurance,jdbcType=DECIMAL}");
        }
        
        if (record.getUneapremres() != null) {
            sql.VALUES("UneaPremRes", "#{uneapremres,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheroperev() != null) {
            sql.VALUES("OtherOpeRev", "#{otheroperev,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsor() != null) {
            sql.VALUES("SpeItemsOR", "#{speitemsor,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsor() != null) {
            sql.VALUES("AdjItemsOR", "#{adjitemsor,jdbcType=DECIMAL}");
        }
        
        if (record.getTotopecost() != null) {
            sql.VALUES("TotOpeCost", "#{totopecost,jdbcType=DECIMAL}");
        }
        
        if (record.getOpecost() != null) {
            sql.VALUES("OpeCost", "#{opecost,jdbcType=DECIMAL}");
        }
        
        if (record.getRefprem() != null) {
            sql.VALUES("RefPrem", "#{refprem,jdbcType=DECIMAL}");
        }
        
        if (record.getCompexpense() != null) {
            sql.VALUES("CompExpense", "#{compexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getAmorexpense() != null) {
            sql.VALUES("AmorExpense", "#{amorexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getPremreserve() != null) {
            sql.VALUES("PremReserve", "#{premreserve,jdbcType=DECIMAL}");
        }
        
        if (record.getAmorpremres() != null) {
            sql.VALUES("AmorPremRes", "#{amorpremres,jdbcType=DECIMAL}");
        }
        
        if (record.getPoldivpayout() != null) {
            sql.VALUES("PolDivPayout", "#{poldivpayout,jdbcType=DECIMAL}");
        }
        
        if (record.getReincost() != null) {
            sql.VALUES("ReinCost", "#{reincost,jdbcType=DECIMAL}");
        }
        
        if (record.getOpeandadmexp() != null) {
            sql.VALUES("OpeAndAdmExp", "#{opeandadmexp,jdbcType=DECIMAL}");
        }
        
        if (record.getAmorreincost() != null) {
            sql.VALUES("AmorReinCost", "#{amorreincost,jdbcType=DECIMAL}");
        }
        
        if (record.getInscomexpense() != null) {
            sql.VALUES("InsComExpense", "#{inscomexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheropecost() != null) {
            sql.VALUES("OtherOpeCost", "#{otheropecost,jdbcType=DECIMAL}");
        }
        
        if (record.getOpeacost() != null) {
            sql.VALUES("OpeaCost", "#{opeacost,jdbcType=DECIMAL}");
        }
        
        if (record.getOpetaxsurcha() != null) {
            sql.VALUES("OpeTaxSurcha", "#{opetaxsurcha,jdbcType=DECIMAL}");
        }
        
        if (record.getOpeexpense() != null) {
            sql.VALUES("OpeExpense", "#{opeexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getAdmexpense() != null) {
            sql.VALUES("AdmExpense", "#{admexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getFinexpense() != null) {
            sql.VALUES("FinExpense", "#{finexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getAssetimploss() != null) {
            sql.VALUES("AssetImpLoss", "#{assetimploss,jdbcType=DECIMAL}");
        }
        
        if (record.getSpeitemsop() != null) {
            sql.VALUES("SpeItemsOP", "#{speitemsop,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsop() != null) {
            sql.VALUES("AdjItemsOP", "#{adjitemsop,jdbcType=DECIMAL}");
        }
        
        if (record.getFairvalchainc() != null) {
            sql.VALUES("FairValChaInc", "#{fairvalchainc,jdbcType=DECIMAL}");
        }
        
        if (record.getInvinc() != null) {
            sql.VALUES("InvInc", "#{invinc,jdbcType=DECIMAL}");
        }
        
        if (record.getInvincasso() != null) {
            sql.VALUES("InvIncAsso", "#{invincasso,jdbcType=DECIMAL}");
        }
        
        if (record.getExcincome() != null) {
            sql.VALUES("ExcIncome", "#{excincome,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheritemseffop() != null) {
            sql.VALUES("OtherItemsEffOP", "#{otheritemseffop,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemseffop() != null) {
            sql.VALUES("AdjItemsEffOP", "#{adjitemseffop,jdbcType=DECIMAL}");
        }
        
        if (record.getOpeprofit() != null) {
            sql.VALUES("OpeProfit", "#{opeprofit,jdbcType=DECIMAL}");
        }
        
        if (record.getNonopeincome() != null) {
            sql.VALUES("NonopeIncome", "#{nonopeincome,jdbcType=DECIMAL}");
        }
        
        if (record.getNoncurasdearn() != null) {
            sql.VALUES("NonCurAsDEarn", "#{noncurasdearn,jdbcType=DECIMAL}");
        }
        
        if (record.getNonopeexpense() != null) {
            sql.VALUES("NonopeExpense", "#{nonopeexpense,jdbcType=DECIMAL}");
        }
        
        if (record.getNoncurassdloss() != null) {
            sql.VALUES("NonCurAssDLoss", "#{noncurassdloss,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheritemsefftp() != null) {
            sql.VALUES("OtherItemsEffTP", "#{otheritemsefftp,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemsefftp() != null) {
            sql.VALUES("AdjItemsEffTP", "#{adjitemsefftp,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalprofit() != null) {
            sql.VALUES("TotalProfit", "#{totalprofit,jdbcType=DECIMAL}");
        }
        
        if (record.getInctaxcost() != null) {
            sql.VALUES("IncTaxCost", "#{inctaxcost,jdbcType=DECIMAL}");
        }
        
        if (record.getUncerinvlosses() != null) {
            sql.VALUES("UncerInvLosses", "#{uncerinvlosses,jdbcType=DECIMAL}");
        }
        
        if (record.getOtheritemseffnp() != null) {
            sql.VALUES("OtherItemsEffNP", "#{otheritemseffnp,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemseffnp() != null) {
            sql.VALUES("AdjItemsEffNP", "#{adjitemseffnp,jdbcType=DECIMAL}");
        }
        
        if (record.getNetprofit() != null) {
            sql.VALUES("NetProfit", "#{netprofit,jdbcType=DECIMAL}");
        }
        
        if (record.getNppcompowners() != null) {
            sql.VALUES("NPPCompOwners", "#{nppcompowners,jdbcType=DECIMAL}");
        }
        
        if (record.getMinoprofit() != null) {
            sql.VALUES("MinoProfit", "#{minoprofit,jdbcType=DECIMAL}");
        }
        
        if (record.getOthitemseffnpp() != null) {
            sql.VALUES("OthItemsEffNPP", "#{othitemseffnpp,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemseffnpp() != null) {
            sql.VALUES("AdjItemsEffNPP", "#{adjitemseffnpp,jdbcType=DECIMAL}");
        }
        
        if (record.getOciaftertax() != null) {
            sql.VALUES("OCIAfterTax", "#{ociaftertax,jdbcType=DECIMAL}");
        }
        
        if (record.getOciatpcomownr() != null) {
            sql.VALUES("OCIATPComOWNR", "#{ociatpcomownr,jdbcType=DECIMAL}");
        }
        
        if (record.getOcinotinis() != null) {
            sql.VALUES("OCINotInIS", "#{ocinotinis,jdbcType=DECIMAL}");
        }
        
        if (record.getOciremearsure() != null) {
            sql.VALUES("OCIReMearsure", "#{ociremearsure,jdbcType=DECIMAL}");
        }
        
        if (record.getOciequitnotinis() != null) {
            sql.VALUES("OCIEquitNotInIS", "#{ociequitnotinis,jdbcType=DECIMAL}");
        }
        
        if (record.getOciinis() != null) {
            sql.VALUES("OCIInIS", "#{ociinis,jdbcType=DECIMAL}");
        }
        
        if (record.getOciequityinis() != null) {
            sql.VALUES("OCIEquityInIS", "#{ociequityinis,jdbcType=DECIMAL}");
        }
        
        if (record.getOcifairvalue() != null) {
            sql.VALUES("OCIFairValue", "#{ocifairvalue,jdbcType=DECIMAL}");
        }
        
        if (record.getOcitomaturityfa() != null) {
            sql.VALUES("OCIToMaturityFA", "#{ocitomaturityfa,jdbcType=DECIMAL}");
        }
        
        if (record.getOcicfloss() != null) {
            sql.VALUES("OCICFLoss", "#{ocicfloss,jdbcType=DECIMAL}");
        }
        
        if (record.getOcifgncurfsa() != null) {
            sql.VALUES("OCIFGNCurFSA", "#{ocifgncurfsa,jdbcType=DECIMAL}");
        }
        
        if (record.getOciothers() != null) {
            sql.VALUES("OCIOthers", "#{ociothers,jdbcType=DECIMAL}");
        }
        
        if (record.getOciatminorowner() != null) {
            sql.VALUES("OCIATMinorOwner", "#{ociatminorowner,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemseffci() != null) {
            sql.VALUES("AdjItemsEffCI", "#{adjitemseffci,jdbcType=DECIMAL}");
        }
        
        if (record.getTotcompoincome() != null) {
            sql.VALUES("TotCompoIncome", "#{totcompoincome,jdbcType=DECIMAL}");
        }
        
        if (record.getCipcompowners() != null) {
            sql.VALUES("CIPCompOwners", "#{cipcompowners,jdbcType=DECIMAL}");
        }
        
        if (record.getCiminoowners() != null) {
            sql.VALUES("CIMinoOwners", "#{ciminoowners,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjitemseffpci() != null) {
            sql.VALUES("AdjItemsEffPCI", "#{adjitemseffpci,jdbcType=DECIMAL}");
        }
        
        if (record.getBasiceps() != null) {
            sql.VALUES("BasicEPS", "#{basiceps,jdbcType=DECIMAL}");
        }
        
        if (record.getDilutedeps() != null) {
            sql.VALUES("DilutedEPS", "#{dilutedeps,jdbcType=DECIMAL}");
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