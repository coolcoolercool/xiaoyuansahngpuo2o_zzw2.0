# xiaoyuansahngpuo2o_zzw2.0
校园商铺1.0版本,加入缓存机制,使用框架SSM快速构建出1.0版本.同时在Mysql上采用了主从数据库来实现同步实现读写分离,前端页面主要采用了SUI Moblie技术,为了提高网站性能,使用了redis作为缓存,其中对数据配置文件的用户名和密码进行加密配置,最后完成了服务器购买以及部署并将项目部署到了阿里云服务器上.

## 模块
---
### 通用的模块
* 通用DAO层开发    
* redis访问层开发   
* 单位测试模块开发    

### 数据备份模块
* 搭建MySQL主从服务器环境
* 对数据库配置文件的用户名和密码进行加密处理

### 前端模块的技术
* 借助阿里巴巴的第三方组件SUI来搭建前端需要的页面

### 前端模块的开发
* 用户注册
* 用户登陆
* 网站首页的一级商铺类型以及其子类型的搭建
* 店铺详情和修改页
* 商品详情和修改页
* 注册会员的个人信息页
* 商品和店铺的搜索功能

### 商家模块
* 商户入驻申请
* 商户登陆/注销登陆
* 商铺管理
* 添加商品折扣信息
* 积分管理

### 超级管理员模块
* 头条管理
* 店铺管理类
* 商品管理
* 顾客信息管理


### 所用技术类型
* 前端: 前端UI库 SUI Moblie/ jQuery 
* 后端: 主体框架SSM/图片开源工具 Thumbnailator
* 验证码组件Kaptcha
* 平台: javaWeb
* 数据库: MySQL
* 缓存: redis
* 部署: 阿里云服务器Centos7.2

### 环境参数
* JDK: 1.8
* MySQl: 5.7.21
* IDE: idea
* Maven: 3.3.9
* Runtime Server: apache-tomcat-8.5.34
* Deploy Env: 阿里云服务器 Centos7.2


