drop table if exists `test`;
create table `test`(
    `id` bigint not null  comment'id',
    `name` varchar(50) comment '名称',
    `password` varchar (50) comment'密码',
    primary key (`id`)
)engine =innodb default charset =utf8mb4 comment ='测试';


insert into `test`(id, name, password) values (7,'测试7','password');



#电子书表
drop table if exists `ebook`;
create table `ebook`(
    `id`bigint not null comment 'id',
    `name`varchar(50) comment '名称',
    `category1_id`bigint comment '分类1',
    `category2_id`bigint comment '分类2',
    `description` varchar(200) comment '描述',
    `cover` varchar(200) comment '封面',
    `doc_count` int comment '文档数',
    `view_count` int comment '阅读数',
    `vote_count` int comment '点赞数',
    primary key (`id`)
)engine =innodb default charset =utf8mb4 comment '电子书';
insert into `ebook`(id,name,description)values (1,'武动乾坤','杀敌，热血兄弟情谊');
insert into `ebook` (id,name,description)values (2,'三国演义','浪淘尽千古风流人物');
insert  into `ebook`(id,name,description)values (3,'云间有个小卖部','俩小');
insert into `ebook`(id,name,description)values (4,'老人与海','海明威')