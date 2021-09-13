##索引的数据结构
##多叉排序树，不同的索引引擎索引的数据结构不同
###B树：叶子节点和非叶子节点都存放数据，由于每次IO从磁盘中读取的页大小固定（4K或其整数倍），由于中间节点存放数据的缘故，树的深度会增加，可能会导致查询需要经过多次IO，效率不高；
###B+树：所有的数据data都存放在叶子节点上，中间节点只存放索引key，不存放data,并且叶子节点都是有序的，而且还有一个指针指向；因而特别适合范围查找；
###create table student (
    id int,
    student varchar2(20),
    age int,
    sex varchar2(20)
)
###alter table student add constraint pk_student primary key (id)
###create index idx_student_name on student(name)
##索引分类
###1、主键索引；不可以为null,主键索引也是一种唯一索引，innodb引擎自动生成。主键索引对应B+树中非叶子节点存放的是Key,叶子节点存放的是key和对应的data；
###2、唯一索引；要求索引列唯一,可以为null
###3、普通索引；普通列上建立的索引，对应的B+树中叶子节点存放的是索引key和主键，然后通过主键去主键索引再次查询；
###4、全文索引；
###5、组合索引；多列上建立索引，如：create index idx_student_name_age on student(name,age)
##什么是回表和覆盖索引？
###回表：针对普通索引上的B+查询，拿到主键；然后通过主键去主键索引B+树去查询data的过程；
###覆盖索引：如：select id from student where name ='zhangsan';通过普通索引key为name去B+树查询，能够拿到需要的主键id,不需要再去主键索引去查找data。
##最左匹配原则
###如：create index idx_student_name_age on student(name,age)
####1、select * from student where name ='zhangsan' and age=10;
####2、select * from student where name ='zhangsan';
####3、select * from student where age=10;
####4、select * from student where age=10 and name ='zhangsan';
####1、2、4会走索引，查询条件中最左条件name需要存在，针对4，mysql优化引擎会自动优化条件顺序；
##索引的优化
###1、频繁更新的列不适合建立索引，因为建立索引更新数据操作B+树的复杂度较高；
###2、不是索引越多越好，因为索引也是一个文件，需要存放在磁盘中，需要消耗IO；
###3、模糊查找时，最左前缀不能有%
####select * from student where name like '%zhangsan%';不走索引
####select * from student where name like 'zhangsan%';走索引
###4、范围查找时；范围条件后面不会走索引；
####select * from student where name > 'zhangsan' and age = 18;name走索引，age不走索引
####select * from student where name = 'zhangsan' and age > 18;name、age都走索引
###5、不能够在索引列上做有关操作，如计算，（自动或强制）类型转换，使用函数，这都会导致该列的索引失效
####select * from student where age = '18';age是int类型、强制转换不走索引
####select * from student where age+1 = 19;索引列上进行函数操作，不走索引
###6、><、!=  会导致索引失效产生全表扫描。
####select * from student where age !=18;不走索引
###7、列上使用is null、is not null 也无法使用索引。
####select * from student where age is not null;不走索引
###8、or连接索引会失效(除非连接的列都有单独的索引)
####select * from student where age =18 or name ='zhangsan';不走索引