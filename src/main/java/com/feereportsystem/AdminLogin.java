package com.feereportsystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame {

    static AdminLogin frame;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AdminLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAdminLogin = new JLabel("Admin Login");
        lblAdminLogin.setForeground(Color.DARK_GRAY);
        lblAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblName = new JLabel("Name:");

        JLabel lblPassword = new JLabel("Password:");

        textField = new JTextField();
        textField.setColumns(10);

        passwordField = new JPasswordField();

        JButton btnLogin = new JButton("login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=textField.getText();
                char ch[]=passwordField.getPassword();
                String password=String.valueOf(ch);
                if(name.equals("admin")&&password.equals("admin123")){
                    String s[]={};
                    com.feereportsystem.AdminSection.main(s);
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
                    textField.setText("");passwordField.setText("");
                }
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(180)
                                                .addComponent(lblAdminLogin))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(25)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblName)
                                                        .addComponent(lblPassword))
                                                .addGap(58)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(passwordField)
                                                        .addComponent(textField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(177)
                                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(111, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(lblAdminLogin)
                                .addGap(29)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(27)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassword))
                                .addGap(36)
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
