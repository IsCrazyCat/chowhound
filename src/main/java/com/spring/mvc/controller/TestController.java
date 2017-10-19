package com.spring.mvc.controller;

import com.spring.mvc.model.Test;
import com.spring.mvc.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author guojunguang
 * @date 2017/7/19
 * @decription
 */
@Controller
public class TestController {
    private static final Logger log = Logger.getLogger(TestController.class);

    @Resource
    private TestService testService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
//        try{
//            List<Test> userList = testService.getAllTest();
//            model.addAttribute("userList",userList);
//        }catch (Exception e ){
//            e.printStackTrace();
//        }
        return "redirect:http://www.baidu.com";
    }

    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    public static void main(String[] args){
        test1();
        String sql = "UPDATE `steward-prod`.`mall_products` SET `id`='161', `name`='乐童卡（幼儿版）', `code`='9010101008', `company`='阳光人寿', `types`='千金宝贝', `feature_desc`='专为2-6周岁的儿童量身定制', `rate`='15', `price`='300.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='2506', `popularity_order`='3840', `img_url`='/images/mall/rmt/letong_01.png', `url`='http://www.baokeyun.com/web/mobile/html/rmt/pingan_c.html#/prod_sinosig_01?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`=NULL, `is_url`='1', `android_url`=NULL, `ios_url`=NULL, `new_system_product_code`=NULL, `start_time`=NULL, `end_time`=NULL, `order_id`='25', `rate_postfix`='', `tags`=NULL, `isonline`='0', `isprmary`='1', `company_code`='02', `order_type`='02', `big_img_url`=NULL, `keyword_desc`=NULL, `promotion_desc`=NULL, `sales_volume`='0', `details_img_url`=NULL, `is_share`='0', `fullname`='乐童卡（幼儿版）', `add_time`='2017-07-27 18:26:03', `update_time`='0000-00-00 00:00:00' WHERE (`id`='161');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='162', `name`='乐童卡（青少年版）', `code`='9010101009', `company`='阳光人寿', `types`='千金宝贝', `feature_desc`='重疾+住院医疗', `rate`='15', `price`='300.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='1857', `popularity_order`='3668', `img_url`='/images/mall/rmt/letong_02.png', `url`='http://www.baokeyun.com/web/mobile/html/rmt/pingan_c.html#/prod_sinosig_02?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`=NULL, `is_url`='1', `android_url`=NULL, `ios_url`=NULL, `new_system_product_code`=NULL, `start_time`=NULL, `end_time`=NULL, `order_id`='24', `rate_postfix`='', `tags`=',儿童,', `isonline`='0', `isprmary`='1', `company_code`='02', `order_type`='02', `big_img_url`=NULL, `keyword_desc`=NULL, `promotion_desc`=NULL, `sales_volume`='0', `details_img_url`=NULL, `is_share`='0', `fullname`='乐童卡（青少年版）', `add_time`='2017-07-27 18:26:03', `update_time`='0000-00-00 00:00:00' WHERE (`id`='162');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11221', `name`='平安少儿综合保险', `code`='PACX10007', `company`='平安财险', `types`='千金宝贝', `feature_desc`='孩子的成长需要他来护航', `rate`='12', `price`='180.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='1077', `popularity_order`='3479', `img_url`='/images/mall/rmt/pinganc/9070101062.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10007', `start_time`=NULL, `end_time`=NULL, `order_id`='26', `rate_postfix`='', `tags`=',儿童,', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='平安少儿综合保险', `add_time`='2017-07-31 22:06:40', `update_time`='2017-07-20 18:06:42' WHERE (`id`='11221');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11227', `name`='安享无忧个人意外保障', `code`='9270101012', `company`='安联财险', `types`='出行意外', `feature_desc`='全年综合意外险，50万意外+40万紧急救援+30万第三者责任，全方位保障，让意外一次杜绝！', `rate`='15', `price`='450.00', `price_postfix`='元起', `period`=NULL, `popularity_base`=NULL, `popularity_real`='31', `popularity_order`=NULL, `img_url`='/images/template/image/9270101012_title.jpg', `url`='https://www.baokeyun.com/gateway/product/toProductInfoPage', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`=NULL, `is_url`=NULL, `android_url`=NULL, `ios_url`=NULL, `new_system_product_code`=NULL, `start_time`=NULL, `end_time`=NULL, `order_id`='301', `rate_postfix`='', `tags`=NULL, `isonline`='1', `isprmary`='1', `company_code`='178', `order_type`='01', `big_img_url`='/statics/product/templates/template/images/9270101012_title.jpg', `keyword_desc`='承保年龄：18-65周岁|保险期间：1年|限购份数：1份|承保职业：1-2类', `promotion_desc`=NULL, `sales_volume`='0', `details_img_url`='/statics/product/templates/template/images/9270101012_detail.jpg', `is_share`='1', `fullname`='安享无忧 - 安联个人意外保障计划', `add_time`='2017-07-31 18:09:05', `update_time`='2017-07-27 17:50:22' WHERE (`id`='11227');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11228', `name`='平安女神保', `code`='PACX10005', `company`='平安财险', `types`='女性关爱', `feature_desc`='给女神的天使级呵护', `rate`='12', `price`='90.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='1170', `popularity_order`='3515', `img_url`='/images/mall/rmt/pinganc/9070101077.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10005', `start_time`=NULL, `end_time`=NULL, `order_id`='31', `rate_postfix`='', `tags`=',女性,', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='平安女神保', `add_time`='2017-07-28 10:15:13', `update_time`='2017-07-27 18:19:08' WHERE (`id`='11228');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11229', `name`='“要爱我”平安母婴保障计划', `code`='PACX10011', `company`='平安财险', `types`='千金宝贝', `feature_desc`='十月怀胎守护神', `rate`='12', `price`='294.50', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='971', `popularity_order`='3437', `img_url`='/images/mall/rmt/pinganc/9070101103.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10011', `start_time`=NULL, `end_time`=NULL, `order_id`='27', `rate_postfix`='', `tags`='', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='“要爱我”平安母婴保障计划', `add_time`='2017-08-01 09:34:38', `update_time`='2017-07-27 18:22:26' WHERE (`id`='11229');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11230', `name`='阳光乐童卡综合保障计划', `code`='YGRS10003', `company`='阳光人寿', `types`='千金宝贝', `feature_desc`='重疾+住院医疗', `rate`='15', `price`='300.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='1866', `popularity_order`='3668', `img_url`='/images/mall/rmt/letong_02.png', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='YGRS10003', `start_time`=NULL, `end_time`=NULL, `order_id`='24', `rate_postfix`='', `tags`=',儿童,', `isonline`='1', `isprmary`='1', `company_code`='02', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='阳光乐童卡综合保障计划', `add_time`='2017-07-31 21:35:40', `update_time`='2017-07-27 18:25:45' WHERE (`id`='11230');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11231', `name`='平安短期旅游宝（7天）', `code`='PACX10013', `company`='平安财险', `types`='出行意外', `feature_desc`='激情游玩有我陪伴', `rate`='12', `price`='10.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='794', `popularity_order`='3356', `img_url`='/images/mall/rmt/pinganc/9070101076.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10013', `start_time`=NULL, `end_time`=NULL, `order_id`='19', `rate_postfix`='', `tags`='', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='平安短期旅游宝（7天）', `add_time`='2017-08-01 08:46:45', `update_time`='2017-07-27 18:27:46' WHERE (`id`='11231');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11232', `name`='马拉松综合保险计划', `code`='PACX10014', `company`='平安财险', `types`='出行意外', `feature_desc`='助你通往冠军之路！', `rate`='12', `price`='3.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='622', `popularity_order`='3365', `img_url`='/images/mall/rmt/pinganc/9070101087.png', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10014', `start_time`=NULL, `end_time`=NULL, `order_id`='190', `rate_postfix`='', `tags`='', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='马拉松综合保险计划', `add_time`='2017-07-27 18:43:49', `update_time`='2017-07-27 18:31:47' WHERE (`id`='11232');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11233', `name`='平安丢不了儿童保障计划', `code`='PACX10015', `company`='平安财险', `types`='千金宝贝', `feature_desc`='孩子的出行需要它来护航', `rate`='12', `price`='499.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='735', `popularity_order`='3461', `img_url`='/images/mall/rmt/9070101095.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10015', `start_time`=NULL, `end_time`=NULL, `order_id`='174', `rate_postfix`='', `tags`=',儿童,', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='平安丢不了儿童保障计划', `add_time`='2017-07-27 23:14:19', `update_time`='2017-07-27 18:34:06' WHERE (`id`='11233');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11234', `name`='平安健身宝保险', `code`='PACX10016', `company`='平安财险', `types`='出行意外', `feature_desc`='让运动变的更简单', `rate`='12', `price`='30.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='700', `popularity_order`='3447', `img_url`='/images/mall/rmt/9070101093.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10016', `start_time`=NULL, `end_time`=NULL, `order_id`='172', `rate_postfix`='', `tags`='', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='平安健身宝保险', `add_time`='2017-07-30 10:34:00', `update_time`='2017-07-27 18:36:18' WHERE (`id`='11234');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11235', `name`='平安抗癌卫士医疗保险', `code`='PAJK10002', `company`='平安健康', `types`='医疗保障', `feature_desc`='免体检，不限社保用药，国内首款赔了还能买，买了继续赔的抗癌卫士', `rate`='10', `price`='198.60', `price_postfix`='元起', `period`='', `popularity_base`=NULL, `popularity_real`='334', `popularity_order`=NULL, `img_url`='/images/template/image/9260101002_title.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`=NULL, `android_url`='', `ios_url`='', `new_system_product_code`='PAJK10002', `start_time`=NULL, `end_time`=NULL, `order_id`='25', `rate_postfix`='', `tags`='', `isonline`='1', `isprmary`='1', `company_code`='43', `order_type`='01', `big_img_url`='/statics/product/templates/template/images/9260101002_title.jpg', `keyword_desc`='承保年龄：28天至55周岁，可续保至85周岁|保险期间：1年|限购份数：1份', `promotion_desc`='', `sales_volume`='0', `details_img_url`='/statics/product/templates/template/images/9260101002_detail.jpg', `is_share`='1', `fullname`='平安抗癌卫士医疗保险', `add_time`='2017-07-31 15:55:27', `update_time`='2017-07-27 18:39:05' WHERE (`id`='11235');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11236', `name`='平安金色夕阳保障', `code`='PACX10018', `company`='平安财险', `types`='感恩父母', `feature_desc`='专属老年险，送上一份孝心', `rate`='12', `price`='298.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='1130', `popularity_order`='3648', `img_url`='/images/mall/rmt/9070101100.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='PACX10018', `start_time`=NULL, `end_time`=NULL, `order_id`='16', `rate_postfix`='', `tags`='', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='平安金色夕阳保障A计划', `add_time`='2017-08-01 09:34:57', `update_time`='2017-07-27 18:42:29' WHERE (`id`='11236');\n" +
                "UPDATE `steward-prod`.`mall_products` SET `id`='11237', `name`='平安交通重伤金钟罩保险', `code`='PACX10017', `company`='平安财险', `types`='出行意外', `feature_desc`='您出行的防弹衣', `rate`='12', `price`='100.00', `price_postfix`='元', `period`='', `popularity_base`='1567', `popularity_real`='741', `popularity_order`='3373', `img_url`='/images/mall/rmt/pinganc/9070101082.jpg', `url`='https://item.baokeyun.com/?', `is_tuiguang`=NULL, `is_renqi`=NULL, `is_jijie`=NULL, `img_url_jijie`='PACX10017', `is_url`='1', `android_url`='', `ios_url`='', `new_system_product_code`='', `start_time`=NULL, `end_time`=NULL, `order_id`='28', `rate_postfix`='', `tags`='', `isonline`='1', `isprmary`='1', `company_code`='182', `order_type`='02', `big_img_url`='', `keyword_desc`='', `promotion_desc`='', `sales_volume`='0', `details_img_url`='', `is_share`='1', `fullname`='平安交通重伤金钟罩保险', `add_time`='2017-07-27 23:07:46', `update_time`='2017-07-27 18:44:31' WHERE (`id`='11237')";
        StringBuilder result = new StringBuilder();
        StringBuilder result1 = new StringBuilder();
        String[] strs = sql.split(";");
        for (int i = 0;i<strs.length;i++) {
            String str = strs[i];
            result.append("UPDATE `mall_products` SET `rate` = '");
            result.append(str.substring(str.indexOf("`rate`=")+8,str.indexOf("`price`=")-3));
            result.append("' where  `code` = ");
            result.append(str.substring(str.indexOf("`code`=")+7,str.indexOf(", `company`=")));
            result.append(";\r\n");
            result1.append(str.substring(str.indexOf("`code`=")+7,str.indexOf("`company`=")));
//            result.append(str.substring(0,str.indexOf("id")-1).replace("`steward-prod`.",""));
//            result.append(str.substring(str.indexOf("id")+4,str.indexOf("VALUES")+8));
//            String str3 = str.substring(str.indexOf(",",str.indexOf("VALUES")+8)+1,str.indexOf(", '0.00'"));
//            str3 = str3.substring(0,str3.lastIndexOf(","))+", '0.00' , ";
//            result.append(str3);
//            result.append(str.substring(str.indexOf("'0.00'"),str.lastIndexOf("'0.00'")+7));
//            result.append(" NULL , '2017-08-29' , '9999-12-31' , NOW() , NOW() , 'bk_ljl' , 'bk_ljl');");

        }
        System.out.println(result.toString());
        System.out.println(result1.toString());

    }
    public static void test1(){
    }
}
