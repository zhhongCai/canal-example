# canal-example

文档信息：https://github.com/alibaba/canal/wiki

1. mysql 配置文件/etc/mysql/mysql.conf.d/mysqld.cnf 修改：
server-id               = 1
log-bin=mysql-bin
binlog-format=ROW

2. 重启mysql: /etc/init.d/mysql restart

3. 安装启动canal (docker方式)：https://github.com/alibaba/canal/wiki/Docker-QuickStart

 docker pull canal/canal-server:v1.1.1
 
 # 构建一个destination name为test的队列
 sh run.sh -e canal.auto.scan=false \
 		  -e canal.destinations=test \
 		  -e canal.instance.master.address=127.0.0.1:3306  \
 		  -e canal.instance.dbUsername=canal  \
 		  -e canal.instance.dbPassword=canal  \
 		  -e canal.instance.connectionCharset=UTF-8 \
 		  -e canal.instance.tsdb.enable=true \
 		  -e canal.instance.gtidon=false 

4. 参考example里的例子,编写canal client短程序