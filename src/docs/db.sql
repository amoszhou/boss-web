CREATE database db_web;

CREATE TABLE `db_web`.`<table_name>` (
	`id` int(11) NOT NULL,
	`username` varchar(20) DEFAULT NULL,
	`create_time` datetime DEFAULT NULL,
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=DYNAMIC CHECKSUM=0 DELAY_KEY_WRITE=0;