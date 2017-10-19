/*
Author: guojunguang
Date: 2017-07-28 17:26:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chowhound
-- ----------------------------
DROP TABLE IF EXISTS `chowhound`;
CREATE TABLE `chowhound` (
  `id` int(100) NOT NULL AUTO_INCREMENT COMMENT '主键ID（吃货编码）',
  `name` varchar(100) NOT NULL COMMENT '吃货用户名',
  `password` varchar(100) NOT NULL COMMENT '吃货密码',
  `nickname` varchar(100) DEFAULT NULL COMMENT '吃货昵称',
  `tel` varchar(20) DEFAULT NULL COMMENT '吃货电话',
  `email` varchar(50) DEFAULT NULL COMMENT '吃货邮箱',
  `heard_img` varchar(100) DEFAULT NULL COMMENT '吃货头像',
  `description` varchar(200) DEFAULT NULL COMMENT '吃货自我描述',
  `hometown` varchar(200) DEFAULT NULL COMMENT '吃货籍贯',
  `address` varchar(200) DEFAULT NULL COMMENT '吃货现住地',
  `level` int(2) DEFAULT '0' COMMENT '吃货级别',
  `is_send` tinyint(1) DEFAULT '1' COMMENT '是否能够寄送吃食 0是 1否',
  `createtime` varchar(20) DEFAULT NULL COMMENT '加入时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃货表，记录吃货的信息';
