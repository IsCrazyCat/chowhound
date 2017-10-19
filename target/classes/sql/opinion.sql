/*
Author: guojunguang
Date: 2017-07-28 17:26:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for opinion
-- ----------------------------
DROP TABLE IF EXISTS `opinion`;
CREATE TABLE `opinion` (
  `id` int(16) NOT NULL,
  `resource` varchar(100) DEFAULT NULL COMMENT '资源ID，多个以 ； 分割',
  `description` varchar(500) DEFAULT NULL COMMENT '评价描述',
  `type` tinyint(2) DEFAULT NULL COMMENT '评价类型（推荐，吐槽等）',
  `opinionobj` tinyint(2) DEFAULT NULL COMMENT '评价对象的类型（评价的什么）',
  `opinionobjid` int(16) DEFAULT NULL COMMENT '评价的对象ID',
  `chowhoundid` int(16) NOT NULL COMMENT '评价人ID',
  `createtime` varchar(20) NOT NULL COMMENT '评价时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评价表，用于记录吃货对于吃食以及各店面的评价';
