package Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


/**
 * @program: tel
 * @description:
 * @author: lydms
 * @create: 2022-10-27 10:33
 **/
class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        tongxun run = new tongxun();
    }
}

class tongxun extends JFrame implements ActionListener {
    private TextField text_1;   //单行文本输入框  （姓名）
    private TextField text_2;   //单行文本输入框  （电话）

    public tongxun() {
        JFrame mainFrame = new JFrame("通讯录");
        mainFrame.setLocation(800, 600);
        mainFrame.setSize(250, 220);
        mainFrame.setLayout(null);
        Button bt1 = new Button("add");
        mainFrame.add(bt1);
        bt1.setLocation(10, 30);
        bt1.setSize(80, 25);
        bt1.addActionListener(this);
        Button bt2 = new Button("show all");
        mainFrame.add(bt2);
        bt2.setLocation(120, 30);
        bt2.setSize(80, 25);
        bt2.addActionListener(this);
        Button bt4 = new Button("exit");
        mainFrame.add(bt4);
        bt4.setLocation(10, 65);
        bt4.setSize(80, 25);
        bt4.addActionListener(this);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String bt = e.getActionCommand();
        if (bt.equals("add")) {
            try {
                Insert();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (bt.equals("exit")) {
            System.exit(0);
        }

        if (bt.equals("show all")) {
            try {
                Display();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }

    void Insert() throws SQLException {
         InsertTel insertTel = new InsertTel();
    }

    void Display() throws Exception {
        Display display = new Display();
    }

}
