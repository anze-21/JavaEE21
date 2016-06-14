package test;

import dao.UserDao;
import org.junit.Test;

public class MyTestCase {
    UserDao userDao=new UserDao();
    @Test
    public void testCount(){
        //断言

    Assert.assertEquals(new Long(11),userDao.count());



    }
}
