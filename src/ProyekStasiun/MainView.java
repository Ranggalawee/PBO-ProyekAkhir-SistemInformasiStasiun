package ProyekStasiun;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    Connector connector = new Connector();

    JLabel lTitle = new JLabel("Sistem Informasi Stasiun Yogyakarta");

    public JButton btnCreate = new JButton("Create Data");
    public JButton btnData = new JButton("Data View");

    public MainView() {

        setTitle("Main View");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(500, 200);

        add(lTitle);
        lTitle.setBounds(140, 20, 300, 20);

        add(btnCreate);
        btnCreate.setBounds(75, 75, 150, 50);

        add(btnData);
        btnData.setBounds(260, 75, 150, 50);


        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainView mainView = new MainView();
                mainView.dispose();
                DataView dataView = new DataView();
                dataView.dispose();
                CreateView createView = new CreateView();
                Controller controller = new Controller(connector, mainView, createView, dataView);
            }
        });

        btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateView createView = new CreateView();
                createView.dispose();
                MainView mainView = new MainView();
                mainView.dispose();
                DataView dataView = new DataView();
                Controller controller = new Controller(connector, mainView, createView, dataView);
            }
        });

    }


}