# Hadoop

## HDFS
- 连接hdfs服务器，并对fs进行文件操作
- 类似于 命令行cli: hadoop fs -mkdir /input

## MapReduce
- WordCountDemo
	- 统计单词个数
	1. 写mapper(map)
	2. 写producer(produce)
	3. 写driver(配置信息)
	4. 打jar包
	5. 集群运行：hadoop jar xxx.jar xxx.xxx.WordCountDriver(全路径) /input /output
- SerializableDemo
	- 序列化与反序列化操作
	- 自定义一个类（bean）继承Writable实现序列化与反序列化
	- 其余操作与WordCountDemo雷同