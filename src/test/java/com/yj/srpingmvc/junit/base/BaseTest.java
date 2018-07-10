package com.yj.srpingmvc.junit.base;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)//ʹ��SpringJUnit4ClassRunner���в���
@ContextConfiguration(locations={"classpath:config/applicationContext.xml"})//���������ļ�

/**------------
 ����������´��룬���м̳и���Ĳ����඼����ѭ�����ã�Ҳ���Բ��ӣ��ڲ�����ķ�����
����ǳ��ؼ���������������ע�����ã�������ƾͻ���ȫʧЧ��  
@Transactional  
�������������������ļ��е������������transactionManager = "transactionManager"����
ͬʱָ���Զ��ع���defaultRollback = true�������������������ݲŲ�����Ⱦ���ݿ⣡  
------------**/

@Transactional(transactionManager = "transactionManager")
@Rollback(false)
public class BaseTest {
	

}
