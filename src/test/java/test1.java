import com.sy.proxyDemo.CGlibProxy;
import com.sy.proxyDemo.UserDao;
import org.junit.Test;

/**
 * @author sy
 * @data 21:28
 */
public class test1 {


    @Test
    public void test(){
        UserDao userDao = new UserDao();
        UserDao proxy = (UserDao) new CGlibProxy(userDao).getProxy();
        proxy.insert();
        proxy.detele();
        proxy.update();
    }

}
