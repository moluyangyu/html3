/*
Navicat PGSQL Data Transfer

Source Server         : Gauss
Source Server Version : 90204
Source Host           : 192.168.60.200:5432
Source Database       : mydb_test
Source Schema         : my_gauss

Target Server Type    : PGSQL
Target Server Version : 90204
File Encoding         : 65001

Date: 2023-07-23 08:51:40
*/


-- ----------------------------
-- Table structure for Poor
-- ----------------------------
DROP TABLE IF EXISTS "my_gauss"."Poor";
CREATE TABLE "my_gauss"."Poor" (
"id" int4 NOT NULL,
"name" varchar(32) COLLATE "default",
"FamilySituation" varchar(32) COLLATE "default",
"PovertyLevel" varchar(32) COLLATE "default",
"FilingTime" timestamp,
"number" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of Poor
-- ----------------------------
INSERT INTO "my_gauss"."Poor" VALUES ('0', '计数用栏位', '无', '无', '2023-07-22 13:42:31', '30');
INSERT INTO "my_gauss"."Poor" VALUES ('1', '张三', '单身', '低', '2023-07-23 10:00:00', '3');
INSERT INTO "my_gauss"."Poor" VALUES ('2', '李四', '已婚', '中等', '2023-07-22 15:30:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('3', '王五', '离异', '高', '2023-07-21 08:45:00', '1');
INSERT INTO "my_gauss"."Poor" VALUES ('4', '赵六', '已婚', '低', '2023-07-20 11:20:00', '4');
INSERT INTO "my_gauss"."Poor" VALUES ('5', '钱七', '单身', '中等', '2023-07-19 14:10:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('6', '孙八', '已婚', '高', '2023-07-18 09:30:00', '5');
INSERT INTO "my_gauss"."Poor" VALUES ('7', '周九', '单身', '低', '2023-07-17 12:15:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('8', '吴十', '已婚', '中等', '2023-07-16 10:45:00', '3');
INSERT INTO "my_gauss"."Poor" VALUES ('9', '郑十一', '离异', '低', '2023-07-15 13:00:00', '1');
INSERT INTO "my_gauss"."Poor" VALUES ('10', '王十二', '单身', '高', '2023-07-14 16:20:00', '4');
INSERT INTO "my_gauss"."Poor" VALUES ('11', '李十三', '已婚', '低', '2023-07-13 11:50:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('12', '张十四', '单身', '中等', '2023-07-12 09:00:00', '3');
INSERT INTO "my_gauss"."Poor" VALUES ('13', '赵十五', '已婚', '高', '2023-07-11 14:30:00', '5');
INSERT INTO "my_gauss"."Poor" VALUES ('14', '钱十六', '单身', '低', '2023-07-10 10:10:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('15', '孙十七', '离异', '中等', '2023-07-09 12:45:00', '3');
INSERT INTO "my_gauss"."Poor" VALUES ('16', '周十八', '已婚', '高', '2023-07-08 08:20:00', '4');
INSERT INTO "my_gauss"."Poor" VALUES ('17', '吴十九', '单身', '低', '2023-07-07 13:50:00', '1');
INSERT INTO "my_gauss"."Poor" VALUES ('18', '郑二十', '已婚', '中等', '2023-07-06 11:30:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('19', '王二十一', '单身', '高', '2023-07-05 15:15:00', '5');
INSERT INTO "my_gauss"."Poor" VALUES ('20', '李二十二', '已婚', '低', '2023-07-04 10:25:00', '1');
INSERT INTO "my_gauss"."Poor" VALUES ('21', '张二十三', '单身', '中等', '2023-07-03 12:35:00', '3');
INSERT INTO "my_gauss"."Poor" VALUES ('22', '赵二十四', '离异', '高', '2023-07-02 14:40:00', '4');
INSERT INTO "my_gauss"."Poor" VALUES ('23', '钱二十五', '已婚', '低', '2023-07-01 09:55:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('24', '孙二十六', '单身', '中等', '2023-06-30 16:05:00', '3');
INSERT INTO "my_gauss"."Poor" VALUES ('25', '周二十七', '已婚', '高', '2023-06-29 08:50:00', '5');
INSERT INTO "my_gauss"."Poor" VALUES ('26', '吴二十八', '单身', '低', '2023-06-28 11:25:00', '1');
INSERT INTO "my_gauss"."Poor" VALUES ('27', '郑二十九', '离异', '中等', '2023-06-27 13:15:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('28', '王三十', '已婚', '高', '2023-06-26 10:40:00', '4');
INSERT INTO "my_gauss"."Poor" VALUES ('29', '李三十一', '单身', '低', '2023-06-25 12:30:00', '2');
INSERT INTO "my_gauss"."Poor" VALUES ('30', '张三十二', '已婚', '中等', '2023-06-24 14:20:00', '3');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table Poor
-- ----------------------------
ALTER TABLE "my_gauss"."Poor" ADD PRIMARY KEY ("id");
