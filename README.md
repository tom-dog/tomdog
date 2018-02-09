# tomdog project
这是一个使用tomcat架构实现的服务网格容器

* [服务wiki地址](https://github.com/tom-dog/tomdog/wiki/tomdog-home)

## 容器使用说明
服务需要使用此容器，需要将 [application.xml](https://github.com/tom-dog/tomdog/blob/tomdog-0.1/tomdog-core/src/main/resources/application.xml)
文件放置在工程的classpath目录下，并按需进行配置

## 容器部署文件目录结构
```sh
tomdog/ --
	 |
	 --- bin/   启动脚本
	 |
	 --- conf/  配置文件
	 |
	 --- lib/   启动类库
	 |
	 --- apps/  应用目录
	 |
	 --- logs/  系统日志
```
