import com.lg.gupao.prototype.bean.User;
import com.lg.gupao.prototype.controller.UserController;
import org.junit.Test;

/**
 * @ClassName PrototypeTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/13
 **/

class AUser implements Cloneable {
    String name;
    User user;

    public AUser() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

public class PrototypeTest {

    @Test
    public void testOldCode() {
        UserController userController = new UserController();
        Object object = userController.getUserByName("tom");
        System.out.println(object);
    }

    @Test
    public void testPrototype() {
        UserController userController = new UserController();
        Object object = userController.getUserByNameUsePrototype("tom");
        System.out.println(object);
    }

    @Test
    public void testBeanUtil() {
        UserController userController = new UserController();
        String user = "{'id': '1', 'name': 'tom'}";
        userController.addUser(user);
    }

    @Test
    public  void TestCloneInterface() {
        AUser aUser = new AUser();
        User user = new User();
        user.setName("tom");
        aUser.setUser(user);

        try {
            AUser aUser1 = (AUser) aUser.clone();
            System.out.println(aUser.getUser() == aUser1.getUser());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
