# JavaWebExample
> 整合SpringMVC+Mybatis进行java web开发的demo

1.创建数据库和数据表

```
CREATE TABLE 'gaosheng'.'test' (
  'id' int(11) NOT NULL AUTO_INCREMENT,
  'account' VARCHAR(100) NOT NULL COMMENT '账号',
  'password' VARCHAR(100) NOT NULL COMMENT '密码',
  PRIMARY KEY ('id')
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
```

2.application_db.xml修改数据库连接信息

3.运行，浏览器输入http://127.0.0.1:8888/
