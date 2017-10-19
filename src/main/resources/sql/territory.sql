/*
Author: guojunguang
Date: 2017-07-28 17:26:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for territory
-- ----------------------------
DROP TABLE IF EXISTS `territory`;
CREATE TABLE `territory` (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '推荐地点ID',
  `name` varchar(100) DEFAULT NULL COMMENT '店面名称',
  `address` varchar(100) DEFAULT NULL COMMENT '店面地址',
  `tel` varchar(20) DEFAULT NULL COMMENT '店面电话',
  `lovecount` int(10) DEFAULT NULL COMMENT '推荐数',
  `fst_chowhound` int(16) DEFAULT NULL COMMENT '首次推荐人ID',
  `createtime` varchar(20) NOT NULL COMMENT '首次推荐时间（创建时间）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='店铺，即某种美食做的好吃的地方信息';
