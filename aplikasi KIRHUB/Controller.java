import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;



public class Controller {
    public Controller() {
            JFrame jframe = new JFrame();//membuat objek jframe
            jframe.setSize(210, 450);//ukuran jendela
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//meng-terminate 
            jframe.setLocationRelativeTo(null);//penmpatannya di tengah

            JPanel jpanel = new JPanel();//objek jpanel
            jpanel.setLayout(null);//

            JButton masuk = new JButton("Masuk");//buat objek tambah teks
            masuk.setBounds(55, 200, 100, 30);
            masuk.setBackground(Color.decode("#008000"));
            masuk.setBorder(new EmptyBorder(10, 10, 10, 10));
            masuk.setVisible(true);
            jpanel.add(masuk);
            jframe.add(jpanel);
            jframe.setVisible(true);
        }
    }


