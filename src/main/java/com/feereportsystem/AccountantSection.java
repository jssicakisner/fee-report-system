package com.feereportsystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountantSection extends JFrame {

    static AccountantSection frame;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AccountantSection();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AccountantSection() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 423);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JButton btnNewButton = new JButton("Add Student");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                com.feereportsystem.AddStudent.main(new String[]{});
                frame.setEnabled(false);
            }
        });

        JLabel lblAccountantSection = new JLabel("Accountant Section");
        lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAccountantSection.setForeground(Color.DARK_GRAY);

        JButton btnViewStudent = new JButton("View Student");
        btnViewStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                com.feereportsystem.ViewStudent.main(new String[]{});
            }
        });

        JButton btnEditStudent = new JButton("Edit Student");
        btnEditStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                com.feereportsystem.EditStudent.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnDueFee = new JButton("Due Fee");
        btnDueFee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                com.feereportsystem.DueFee.main(new String[]{});
            }
        });

        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                com.feereportsystem.FeeReport.main(new String[]{});
                frame.dispose();
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(136)
                                                .addComponent(lblAccountantSection))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(52)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(btnEditStudent, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnDueFee, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(53)
                                                                .addComponent(btnViewStudent, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(144)
                                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(7)
                                .addComponent(lblAccountantSection)
                                .addGap(25)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnViewStudent, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addGap(35)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEditStudent, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDueFee, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addGap(36)
                                .addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(138, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
