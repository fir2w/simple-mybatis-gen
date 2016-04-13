# mybits代码生成工具

[simple-mybatis-gen](http://112.124.0.156:9258/klwork/simple-mybatis-gen.git)

此项目是一个mybitis的生成工具
可以减少dao代码的编写,让分层更加合理

## 相关步骤
1. src-gen是自定义的源代码路径,在idea下,右键pom,mavne执行第二项"gen..." 或者命令行下执行mvn generate-sources
1. 在配置文件middlegen.properties中设置数据源和生成的表
1. 运行CodeGenMainApp的main函数
1. 生成的代码默认放在src-gen/main下.
1. copy目录src-gen/main下代码和配置到其他项目即可.

## 配置文件说明

gen_type=0 表示生成的代码的包含单元测试(第一次代码生成使用),1.用来表示单元测试代码不进行生成
queryObjectFields 表示你的查询对象DO里面包含的字段

## 其他说明


默认生成的单元测试会进行回滚,如果想数据库看的见,请继承BaseSimpleTests