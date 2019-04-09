/*
 Navicat Premium Data Transfer

 Source Server         : mysql-local
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : feman_cartoon

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 09/04/2019 16:01:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for feman_label
-- ----------------------------
DROP TABLE IF EXISTS `feman_label`;
CREATE TABLE `feman_label`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `C_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标签中文名',
  `E_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标签英文名',
  `LOCAL_KEY` varchar(150) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '标签本地关键字',
  `DL_KEY` varchar(150) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '嘀哩嘀哩中对应的关键字，可以为空',
  `BL_KEY` varchar(150) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'bilibili中对应的关键字，可以为空',
  `ANTHOR_KEY` varchar(150) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '其他网站的关键字，可以为空',
  `PARENT_ID` int(11) NOT NULL DEFAULT 0 COMMENT '标签的父节点',
  `DEMO` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '简单说明',
  `IS_SHOW` int(11) NULL DEFAULT NULL COMMENT '是否显示：0，不现实；1，显示',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of feman_label
-- ----------------------------
INSERT INTO `feman_label` VALUES (1, '全部', 'all', 'quanbu', NULL, NULL, NULL, 0, '', 1);
INSERT INTO `feman_label` VALUES (2, '状态', 'cCondition', 'zhuangtai', NULL, NULL, NULL, 0, NULL, 1);
INSERT INTO `feman_label` VALUES (3, '季度', 'cQuarter', 'jidu', NULL, NULL, NULL, 0, NULL, 1);
INSERT INTO `feman_label` VALUES (4, '年份', 'cYear', 'nianfen', NULL, NULL, NULL, 0, NULL, 1);
INSERT INTO `feman_label` VALUES (5, '风格', 'cStyle', 'fengge', NULL, NULL, NULL, 0, NULL, 1);
INSERT INTO `feman_label` VALUES (6, '正常', 'normal', 'zhengchang', NULL, NULL, NULL, 2, NULL, 1);
INSERT INTO `feman_label` VALUES (7, '特别', 'special', 'tebie', NULL, NULL, NULL, 2, NULL, 1);
INSERT INTO `feman_label` VALUES (8, '一月', 'January', '01', '201901,201801,201701', NULL, NULL, 3, NULL, 1);
INSERT INTO `feman_label` VALUES (9, '四月', 'April', '04', '201904,201804,201704', NULL, NULL, 3, NULL, 1);
INSERT INTO `feman_label` VALUES (10, '七月', 'July', '07', '201907,201807,201707', NULL, NULL, 3, NULL, 1);
INSERT INTO `feman_label` VALUES (11, '十月', 'October', '10', '201910,201810,2019710', NULL, NULL, 3, NULL, 1);
INSERT INTO `feman_label` VALUES (12, '2019', '2019', '2019', '2019', NULL, NULL, 4, NULL, 1);
INSERT INTO `feman_label` VALUES (13, '2018', '2018', '2018', '2018', NULL, NULL, 4, NULL, 1);
INSERT INTO `feman_label` VALUES (14, '2017', '2017', '2017', '2017', NULL, NULL, 4, NULL, 1);
INSERT INTO `feman_label` VALUES (15, '漫改', '', 'mangai', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (16, '原创', NULL, 'yuanchuang', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (17, '热血', NULL, 'rexue', 'rexue', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (18, '战斗', NULL, 'zhandou', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (19, '搞笑', NULL, 'gaoxiao ', 'gaoxiao', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (20, '日常', NULL, 'richang', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (21, '萌系', NULL, 'mengxi', 'luoli', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (22, '治愈', NULL, 'zhiyu', 'zhiyuxi', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (23, '校园', NULL, 'xiaoyuan', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (24, '泡面', NULL, 'paomian', 'paomianfan', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (25, '恋爱', NULL, 'lianai', 'lianai', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (26, '后宫', NULL, 'hougong', 'hougong', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (27, '少女', NULL, 'shaonv', 'meishaonv', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (28, '魔法', NULL, 'mofa', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (29, '机战', NULL, 'jizhan', 'jizhan', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (30, '运动', NULL, 'yundong', 'yundong', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (31, '催泪', NULL, 'cuilei', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (32, '美食', NULL, 'meishi', NULL, NULL, NULL, 5, NULL, 0);
INSERT INTO `feman_label` VALUES (33, '装逼', NULL, 'zhuangbi', 'zhuangbi', NULL, NULL, 5, NULL, 1);
INSERT INTO `feman_label` VALUES (34, '完结', 'end', 'wanjie', NULL, NULL, NULL, 6, NULL, 1);
INSERT INTO `feman_label` VALUES (35, '连载', 'publish', 'lianzai', NULL, NULL, NULL, 6, NULL, 1);
INSERT INTO `feman_label` VALUES (36, '里番', 'InTime', 'lifan', NULL, NULL, NULL, 7, NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
