package test;

import bean.User;
import org.apache.commons.dbutils.QueryRunner;
import utils.JDBCUtils;

import java.sql.SQLException;

/**
 * @program: tel
 * @description:
 * @author: lydms
 * @create: 2022-10-27 21:13
 **/
//public class test {
//    public static void main(String[] args) throws SQLException {
//
//        QueryRunner runner = new QueryRunner();
//        String sql = "UPDATE info SET number=? ,`NAME`=? WHERE number = ?; ";
//        User user = new User("song", "262192592");
//        runner.update(JDBCUtils.getConnection3(),sql,user.getNumber(),user.getName(),user.getNumber());
//    }
//}
