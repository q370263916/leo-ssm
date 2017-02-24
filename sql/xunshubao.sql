/*
Navicat MySQL Data Transfer

Source Server         : xunshubao
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : xunshubao

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-05-05 16:36:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for days_user
-- ----------------------------
DROP TABLE IF EXISTS `days_user`;
CREATE TABLE `days_user` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `device_type` int(11) DEFAULT NULL,
  `device_num` varchar(255) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `last_time` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
