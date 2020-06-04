import com.sy.demo1.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author sy
 * @data 23:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationConfig.xml")
public class test2 {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void test(){
        studentDao.insert();
        studentDao.delete();
        studentDao.save();
        studentDao.select();
    }
}
