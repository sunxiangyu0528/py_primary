package com.test.day03;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

import java.io.File;
import java.util.List;

public class LoginTest01 {
    public static void main(String[] args) {
        ImportParams importParams = new ImportParams();
        importParams.setStartSheetIndex(0);
        File excelFile = new File("src/test/resources/api_testcases_futureloan_v1.xls");
        List<CaseInfo> list = ExcelImportUtil.importExcel(excelFile, CaseInfo.class, importParams);
        for(CaseInfo caseInfo :list){
            System.out.println(caseInfo);
        }

    }
}
