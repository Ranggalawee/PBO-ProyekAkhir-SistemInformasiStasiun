package ProyekStasiun;

import javax.swing.*;
import java.awt.*;

public class CreateView extends JFrame {
    Connector connector = new Connector();

    JLabel lTitle = new JLabel("Tambah Jadwal Kereta");
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

    public JButton btnCreate = new JButton("Create");
    public JButton btnCancel = new JButton("Cancel");

    public CreateView() {

        setTitle("Create Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(700, 500);

        add(lTitle);
        lTitle.setFont(new Font("Sans-Serif", Font.BOLD, 18));
        lTitle.setBounds(230, 20, 200, 20);

        add(lKode);
        lKode.setBounds(180, 90, 90, 20);
        add(tfKode);
        tfKode.setBounds(340, 90, 150, 20);

        add(lNama);
        lNama.setBounds(180, 120, 90, 20);
        add(tfNama);
        tfNama.setBounds(340, 120, 150, 20);

        add(lKelas);
        lKelas.setBounds(180, 150, 90, 20);
        add(tfKelas);
        tfKelas.setBounds(340, 150, 150, 20);

        add(lTujuan);
        lTujuan.setBounds(180, 180, 90, 20);
        add(tfTujuan);
        tfTujuan.setBounds(340, 180, 150, 20);

        add(lJadwal);
        lJadwal.setBounds(180, 210, 90, 20);
        add(tfJadwal);
        tfJadwal.setBounds(340, 210, 150, 20);

        add(lJam);
        lJam.setBounds(180, 240, 120, 20);
        add(tfJam);
        tfJam.setBounds(340, 240, 150, 20);

        add(lWaktu);
        lWaktu.setBounds(180, 270, 120, 20);
        add(tfWaktu);
        tfWaktu.setBounds(340, 270, 150, 20);

        add(btnCreate);
        btnCreate.setBackground(Color.GREEN);
        btnCreate.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        btnCreate.setBounds(230, 330, 90, 35);

        add(btnCancel);
        btnCancel.setBackground(Color.RED);
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setBounds(350, 330, 90, 35);
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