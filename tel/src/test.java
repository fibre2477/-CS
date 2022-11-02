//
//import bean.User;
//import dao.BeanDAOImpl;
//import org.junit.Service.Test;
//import utils.JDBCUtils;
//
//import java.sql.Connection;
//import java.util.List;
//
//
///**
// * @program: tel
// * @description:
// * @author: lydms
// * @create: 2022-10-27 19:07
// **/
//public class test {
//    @Service.Test
//    public void test() throws Exception {
//        Connection conn = JDBCUtils.getConnection3();
//        BeanDAOImpl beanDAO = new BeanDAOImpl();
//        List<User> all = beanDAO.getAll(conn, 0);
//        for (User c:all
//        ) {
//            System.out.println(c);//增强for循环，将集合元素直接赋值给c然后输出
//        }
//    }
//}
