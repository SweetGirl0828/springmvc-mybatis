package com.yj.srpingmvc.junit.base;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)//使用SpringJUnit4ClassRunner进行测试
@ContextConfiguration(locations={"classpath:config/applicationContext.xml"})//加载配置文件

/**------------
 如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上
这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！  
@Transactional  
这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），
同时指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！  
------------**/

@Transactional(transactionManager = "transactionManager")
@Rollback(false)
public class BaseTest {
	

}
