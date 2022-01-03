# 科研项目收集管理系统

## 项目基础信息

#### 项目已经完成的配置
* 项目文件目录完成
* 基础所需依赖已添加
    * fastjson
    * mybatis
    * mybatis-plus
    * lombok
* 已配置跨域访问
* mysql 配置完成
* mybatis-plus 分页插件配置完成
* 返回数据格式配置完成
* 时间格式配置完成

#### 项目 Git 地址 [ResearchProjectCollectionSpringBoot](https://github.com/RexJoush/ResearchProjectCollectionSpringBoot)

#### mysql 连接信息
|host|username|password|port|database|
|:--|:--|:--|:--|:-- |
|www.rexjoush.com|research_project|Research_Project_123456|3306|research_project|

## 项目开发须知

#### 遵守规则

* 开发遵循[阿里巴巴Java开发手册(嵩山版)](https://github.com/alibaba/p3c/blob/master/Java%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C%EF%BC%88%E5%B5%A9%E5%B1%B1%E7%89%88%EF%BC%89.pdf)
* 尤其是命名规则必须遵守
* 前端后端命名同样遵守开发手册

## Git

* 每天开发结束后须提交新版本至暂存区，建议每天晚上合并一次远程分支
* 提交格式为 时间 完成的内容简写
    ```shell
    git commit -m "2021.01.03 Rex Joush 完成后端分页开发"
    ```
* git 为后期衡量工作量的参考信息，请大家务必遵守
* 如 git 出现冲突，请联系冲突人员协商后进行解决冲突