#初始化 Movie 表
insert into Movie values(1,'蜘蛛侠',20,'科幻，动作','美国','乔沃茨','2019-6-28','2019-7-20',120);
insert into Movie values(2,'钢铁侠',30,'科幻，冒险，动作','美国','乔恩·费儒','2008-5-2','2008-5-20',110);
insert into Movie values(3,'千与千寻',35,'动漫，亲情，冒险','日本','宫崎骏','2019-6-21','2019-7-10',100);
insert into Movie values(4,'复仇者联盟',30,'科幻，动作','美国','乔斯·韦登','2012-5-4','2012-5-31',120);
insert into Movie values(5,'菊花侠大战桃花怪',30,'搞笑，奇幻','中国','韦政','2008-5-4','2008-5-31',80);
#初始化 Audience 表
insert into Audience VALUES (1,'Bear','gf981026','18341935543','Manger');
insert into Audience VALUES (2,'Dean','Sansui91200.','17866553819','Manger');
insert into Audience VALUES (3,'邵国举','shao123.','17585298606','User');
#初始化 MovieHall 表
insert into MovieHall VALUES (1,'激光巨幕',20,10,40);
insert into MovieHall VALUES (2,'杜比',20,10,15);
insert INTO MovieHall VALUES (3,'3D 杜比',20,10,30);
insert into MovieHall VALUES (6,'VIP',10,5,100);
insert into MovieHall VALUES (5,'激光',20,10,3);
INSERT into MovieHall VALUES (4,'IMAX 激光巨幕',30,15,40);
INSERT into MovieHall VALUES (7,'激光',20,10,3);
INSERT INTO MovieHall VALUES (8,'VIP',10,5,100);
insert into MovieHall VALUES (9,'巨幕 杜比',20,10,40);
INSERT into MovieHall VALUES (10,'激光',20,10,3);
#给邵国举安排电影
insert into show VALUES (6,5,'2019-7-5 12:35:00');
INSERT into show VALUES (8,3,'2019-7-5 16:35:00');
INSERT into show VALUES (9,1,'2019-7-8 19:40:00');
INSERT into show VALUES (2,4,'2012-5-10 13:00:00');
INSERT INTO show VALUES (1,1,'2019-7-6 13:00:00');
INSERT INTO SHOW VALUES (3,2,'2008-5-2 00:00:00');
INSERT INTO SHOW VALUES (4,3,'2019-7-7 20:00:00');
INSERT INTO SHOW VALUES (3,1,'2019-7-8 10:00:00');
#邵国举买票
INSERT INTO Arrange VALUES (3,6,5,'4','5','2019-7-5 12:35:00');
INSERT INTO arrange VAlues (3,8,3,'4','6','2019-7-5 16:35:00');
insert into Arrange VALUES (3,9,1,'5','10','2019-7-8 19:40:00');
