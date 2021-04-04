package com.ljs.activiti.springActivitiTest;

import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * activiti与spring整合测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:activiti-spring.xml")
public class SpringActivitiTest {

    @Autowired
    private RepositoryService repositoryService;

    @Test
    public void run(){
        System.out.println("部署的流程定义是"+repositoryService);
    }

}
