package codec_test;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.omg.CORBA.portable.InputStream;

import java.io.FileInputStream;

public class Md5Test {
    @Test
    public void testMd5(){
        //4297f44b13955235245b2497399d7a93
        String password="123123";
        password= DigestUtils.md5Hex(password);
        System.out.println(password);
    }
    @Test
    public void testFile() throws Exception{
        //fec18d61e7b247d7c665078d765091f5
        //fec18d61e7b247d7c665078d765091f5
        FileInputStream inputStream=new FileInputStream("D:/table2.html");
        String md5=DigestUtils.md5Hex(inputStream);
        System.out.println(md5);



    }
}
