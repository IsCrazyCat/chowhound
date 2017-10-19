/*
Author: guojunguang
Date: 2017-07-28 17:26:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for foods
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `id` int(16) NOT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT '吃食名称',
  `nickname` varchar(50) DEFAULT NULL,
  `type` varchar(2) DEFAULT NULL COMMENT '吃食类别',
  `county` varchar(10) DEFAULT NULL COMMENT '所属城市',
  `is_send` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否可以寄送 0是 1否',
  `fst_chowhound` int(16) DEFAULT NULL COMMENT '首次推荐人',
  `lovecount` int(10) DEFAULT '0' COMMENT '推荐数',
  `createtime` varchar(20) NOT NULL COMMENT '推荐时间，即首次推荐时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='美食表，记录各种美食信息';
