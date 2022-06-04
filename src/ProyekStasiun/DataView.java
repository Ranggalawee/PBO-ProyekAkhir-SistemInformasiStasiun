package ProyekStasiun;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DataView extends JFrame {
    Connector connector = new Connector();

    public JTable table;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Kode", "Nama Kereta", "Kelas", "Tujuan", "Jadwal", "Jam", "Waktu"};

    JLabel lTitle = new JLabel("Data Jadwal Kereta");
    JLabel lKode = new JLabel("Kode Jadwal");
    JLabel lNama = new JLabel("Nama Kereta");
    JLabel lKelas = new JLabel("Kelas");
    JLabel lTujuan = new JLabel("Tujuan Akhir");
    JLabel lJadwal = new JLabel("Jadwal Kereta");
    JLabel lJam = new JLabel("Jam Keberangkatan");
    JLabel lWaktu = new JLabel("Waktu Tempuh(jam)");

    public JTextField tfKode = new JTextField();
    public JTextField tfNama = new JTextField();
    public JTextField tfKelas = new JTextField();
    public JTextField tfTujuan = new JTextField();
    public JTextField tfJadwal = new JTextField();
    public JTextField tfJam = new JTextField();
    public JTextField tfWaktu = new JTextField();

    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");
    public JButton btnBack = new JButton("Back");

    public DataView() {
        dtm = new DefaultTableModel(namaKolom, 0);
        table = new JTable(dtm);
        scrollPane = new JScrollPane(table);

        setTitle("Database");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(1100, 570);

        add(lTitle);
        lTitle.setFont(new Font("Sans-Serif", Font.BOLD, 18));
        lTitle.setBounds(240, 20, 200, 20);

        add(btnBack);
        btnBack.setBounds(20, 20, 90, 35);

        add(scrollPane);
        scrollPane.setBounds(20, 80, 640, 420);

        add(lKode);
        lKode.setBounds(700, 90, 90, 20);
        add(tfKode);
        tfKode.setBounds(860, 90, 150, 20);

        add(lNama);
        lNama.setBounds(700, 120, 90, 20);
        add(tfNama);
        tfNama.setBounds(860, 120, 150, 20);

        add(lKelas);
        lKelas.setBounds(700, 150, 90, 20);
        add(tfKelas);
        tfKelas.setBounds(860, 150, 150, 20);

        add(lTujuan);
        lTujuan.setBounds(700, 180, 90, 20);
        add(tfTujuan);
        tfTujuan.setBounds(860, 180, 150, 20);

        add(lJadwal);
        lJadwal.setBounds(700, 210, 90, 20);
        add(tfJadwal);
        tfJadwal.setBounds(860, 210, 150, 20);

        add(lJam);
        lJam.setBounds(700, 240, 120, 20);
        add(tfJam);
        tfJam.setBounds(860, 240, 150, 20);

        add(lWaktu);
        lWaktu.setBounds(700, 270, 120, 20);
        add(tfWaktu);
        tfWaktu.setBounds(860, 270, 150, 20);

        add(btnUpdate);
        btnUpdate.setBackground(Color.GREEN);
        btnUpdate.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        btnUpdate.setBounds(750, 330, 90, 35);

        add(btnDelete);
        btnDelete.setBackground(Color.RED);
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setBounds(870, 330, 90, 35);

    }

    public String getKode() {
        return tfKode.getText();
    }

    public String getNama() {
        return tfNama.getText();
    }

    public String getKelas() {
        return tfKelas.getText();
    }

    public String getTujuan() {
        return tfTujuan.getText();
    }

    public String getJadwal() {
        return tfJadwal.getText();
    }

    public String getJam() { return tfJam.getText(); }

    public String getWaktu() { return tfWaktu.getText(); }

}