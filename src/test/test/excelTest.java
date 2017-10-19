package test;

import com.spring.mvc.util.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author guojunguang
 * @date 2017/7/28
 * @decription
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml","classpath*:spring-mybatis.xml"})
public class excelTest{
    @Test
    public void getSqlFlChange(){
        List<List<Object>> list = ExcelUtil.xlsToString("E:\\1.xls");
        StringBuilder usql = new StringBuilder();
        StringBuilder codesb = new StringBuilder("(");
        for (int i = 0 ;i<list.size() ;i++){
            List rowlist = list.get(i);
//            usql.append("update settlemanagerate set rate = '0' where riskcode in ();");
            usql.append("update mall_products set rate = '"+rowlist.get(2)+"' where `code` = '"+rowlist.get(0)+"';\r\n");
            codesb.append("'"+rowlist.get(0)+"',");
        }
        System.out.print(usql.toString());
        codesb.append(")");
        System.out.print(codesb.toString());
    }
    @Test
    public void getSql2zn(){
        List<List<Object>> list = ExcelUtil.xlsToString("E:\\1.xls");
        StringBuilder usql = new StringBuilder();
        StringBuilder codesb = new StringBuilder("(");
        usql.append("update settlemanagerate set rate = '0' where riskcode in (");
        for (int i = 0 ;i<list.size() ;i++){
            List rowlist = list.get(i);

            usql.append(",'"+rowlist.get(0)+"'");
        }
        usql.append(");");
        System.out.print(usql.toString());
        codesb.append(")");
//        System.out.print(codesb.toString());
    }
    @Test
    public void getSqlFlChange3(){
        String codes = "'9060101011','9270101013','PACX10042','PACX10039','PACX10038','PACX10037','PACX10036','PAJK10003','YGCX10004','PACX10040','PACX10041','PACX10044','PACX10049','PACX10050','PACX10048','PACX10046','PACX10045','PACX10043'";
        String codes1 = "'9010101008', '9010101009', 'PACX10007', '9270101012', 'PACX10005', 'PACX10011', 'YGRS10003', 'PACX10013', 'PACX10014', 'PACX10015', 'PACX10016', 'PAJK10002', 'PACX10018', 'PACX10017',";
        List<List<Object>> list = ExcelUtil.xlsToString("E:\\3.xls");
        StringBuilder usql = new StringBuilder();
        StringBuilder codesb = new StringBuilder("(");
        for (int i = 0 ;i<list.size() ;i++){
            List rowlist = list.get(i);
            usql.append("UPDATE `mall_products` SET `rate` = '' where  `code` = '"+rowlist.get(1)+"' AND `name` like '%"+rowlist.get(0)+"%';\r\n");

        }
        System.out.print(usql.toString());
        codesb.append(")");
//        System.out.print(codesb.toString());
    }
    @Test
    public void test1() {
        String a = "update mall_products set rate = '18.12' where `code` = '9270101010';\n" +
                "update mall_products set rate = '18.12' where `code` = '9270101009';\n" +
                "update mall_products set rate = '48.12' where `code` = '9060101005';\n" +
                "update mall_products set rate = '38.12' where `code` = '9060101006';\n" +
                "update mall_products set rate = '38.12' where `code` = '9060101007';\n" +
                "update mall_products set rate = '38.12' where `code` = '9060101008';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10009';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10007';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10008';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10006';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10012';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10010';\n" +
                "update mall_products set rate = '28.12' where `code` = '9270101011';\n" +
                "update mall_products set rate = '18.12' where `code` = '9270101012';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10005';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10011';\n" +
                "update mall_products set rate = '18.12' where `code` = 'YGRS10003';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10013';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10014';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10015';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10016';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PAJK10002';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10018';\n" +
                "update mall_products set rate = '18.12' where `code` = 'PACX10017';\n" +
                "update mall_products set rate = '18.12' where `code` = '9270101013';\n" +
                "update mall_products set rate = '58.12' where `code` = '9060101011';";
    }
}
