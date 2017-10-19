/*
Author: guojunguang
Date: 2017-07-28 17:26:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '资源ID',
  `name` varchar(100) DEFAULT NULL COMMENT '资源名称',
  `url` varchar(100) DEFAULT NULL COMMENT '资源url',
  `suffix` varchar(10) DEFAULT NULL COMMENT '文件后缀',
  `type` tinyint(2) DEFAULT NULL COMMENT '资源类型',
  `chowhoundid` int(16) DEFAULT NULL COMMENT '创建人，吃货ID',
  `createtime` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `flag` tinyint(2) DEFAULT '0' COMMENT '是否有效数据 0是 1否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源表，用于存储图片等静态资源文件信息';
