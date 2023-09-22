package com.feereportsystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeeReport extends JFrame {

    static FeeReport frame;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new FeeReport();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FeeReport() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setForeground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblFeeReport = new JLabel("Fee Report");
        lblFeeReport.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JButton btnAdminLogin = new JButton("Admin Login");
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AdminLogin.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnAccountantLogin = new JButton("Accountant Login");
        btnAccountantLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AccountantLogin.main(new String[]{});
                frame.dispose();
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(143)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAccountantLogin, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnAdminLogin, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                                .addComponent(lblFeeReport)))
                                .addContainerGap(210, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(lblFeeReport)
                                .addGap(42)
                                .addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addGap(30)
                                .addComponent(btnAccountantLogin, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(91, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
