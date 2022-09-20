-- 商品表
CREATE TABLE `products` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `no` varchar(45) NOT NULL COMMENT '商品编号',
  `name` varchar(45) NOT NULL COMMENT '商品名称',
  `picture_url` varchar(64) NULL COMMENT '图片',
  `normal_price` int(10) NOT NULL DEFAULT 1  COMMENT '正常价格',
  `mark` int(10) NOT NULL DEFAULT 0 COMMENT  '商品标识',
  `state` tinyint(1) DEFAULT 0 NOT NULL COMMENT '账户状态（0:正常 1:锁定）',
  `version` int(10) DEFAULT 0 NOT NULL COMMENT '版本号',
  `deleted_at` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `created_at` timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
  `updated_at` timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_no` (`no`),
  KEY `idx_created_at` (`created_at`)
 ) ENGINE=InnoDB COMMENT = '商品表';

 -- 秒杀活动表
 CREATE TABLE `activity` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `no` varchar(45) NOT NULL COMMENT '活动编号',
  `name` varchar(45) NOT NULL COMMENT '活动名称',
  `goods_no` varchar(45) NOT NULL COMMENT '活动商品编号',
  `stock` int(10) unsigned NOT NULL  DEFAULT 0 COMMENT '活动库存',
  `start_time` timestamp NULL DEFAULT NULL COMMENT '活动开始时间',
  `end_time` timestamp NULL DEFAULT NULL COMMENT '活动结束时间',
  `state` tinyint(1) DEFAULT 0 NOT NULL COMMENT '账户状态（0:正常 1:结束）',
  `version` int(10) DEFAULT 0 NOT NULL COMMENT '版本号',
  `deleted_at` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `created_at` timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
  `updated_at` timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_no` (`no`),
  KEY `idx_goods_no` (`goods_no`),
  KEY `idx_created_at` (`created_at`)
 ) ENGINE=InnoDB COMMENT = '秒杀活动表';

-- 秒杀订单表
 CREATE TABLE `orders` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `no` varchar(45) NOT NULL COMMENT '订单编号',
  `user_no` bigint(20) unsigned NOT NULL COMMENT '用户编号',
  `goods_no` varchar(45) NOT NULL COMMENT '活动商品编号',
  `state` tinyint(1) DEFAULT 0 NOT NULL COMMENT '状态（0:正常 1:关闭）',
  `version` int(10) DEFAULT 0 NOT NULL COMMENT '版本号',
  `deleted_at` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `created_at` timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
  `updated_at` timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_no` (`no`),
  KEY `idx_created_at` (`created_at`)
 ) ENGINE=InnoDB COMMENT = '秒杀订单表';


