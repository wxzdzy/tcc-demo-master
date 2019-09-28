# tcc-demo

以下是建库建表语句 mysql

```sql
CREATE DATABASE `out` DEFAULT CHARACTER SET utf8;
USE `out`;

CREATE TABLE `zhanghuout` (
  `user_id` int(6) NOT NULL,
  `user_name` varchar(16) NOT NULL,
  `monery` double(10,2) NOT NULL,
  `monery_frozen` double(10,2) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert  into `zhanghuout`(`user_id`,`user_name`,`monery`,`monery_frozen`) values (1,'小白',100.00,0.00);



CREATE DATABASE `in` DEFAULT CHARACTER SET utf8;

USE `in`;

DROP TABLE IF EXISTS `zhanghuin`;

CREATE TABLE `zhanghuin` (
  `id` int(6) NOT NULL,
  `user_name` varchar(16) NOT NULL,
  `monery` double(10,2) NOT NULL,
  `monery_frozen` double(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert  into `zhanghuin`(`id`,`user_name`,`monery`,`monery_frozen`) values (1,'小黑',0.00,0.00);

```
