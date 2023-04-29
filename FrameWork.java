//For Frame

//import java.awt.FlowLayout;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class FrameWork {
//    public static void main(String args[]){
//        JFrame frame = new JFrame("Jframe Example");
//        Jpanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
//        JLabel label = new JLabel("JFrame By Example");
//        JButton button = new JButton();
//        button.setText("Button");
//        panel.add(label);
//        panel.add(button);
//        frame.add(panel);
//        frame.setSize(200, 100);
//        frame.setLocationCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//}

// For Button Example
//
//import java.awt.event.*;
//import javax.swing.*;
//
//public class FrameWork {
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Button Example");
//        final JTextField tf = new JTextField();
//        tf.setBounds(50, 50, 150, 20);
//        JButton b = new JButton("Click Here");
//        b.setBounds(50, 100, 95, 30);
//        b.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//                tf.setText("Welcome to JavatPoint");
//            }
//        });
//        f.add(b);
//        f.add(tf);
//        f.setSize(400, 400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//Table Code in java
import javax.swing.*;
public class FrameWork {
    JFrame f;
    FrameWork(){
        f = new JFrame();
        String data[][] = {{"101", "Amit", "670000"}
                ,{"102", "Amit", "670000"},
                {"103", "Amit", "670000"},
                {"104", "Amit", "670000"}};
        String colume[]={"ID", "NAME", "SALARY"};
        JTable jt = new JTable(data, colume);
        jt.setBounds(10, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
    public static void main (String[] args){
        new FrameWork();
    }
}