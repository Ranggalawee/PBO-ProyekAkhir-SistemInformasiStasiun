package ProyekStasiun;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller {
    Connector connector;
    MainView mainView;
    CreateView createView;
    DataView dataView;

    public String pKode, pNama, pKelas, pTujuan, pJadwal, pJam, pWaktu;

    public Controller(Connector connector, MainView mainView, CreateView createView, DataView dataView) {
        this.connector = connector;
        this.mainView = mainView;
        this.dataView = dataView;
        this.createView = createView;

        if (connector.getBanyakData()!=0) {
            String dataItem[][] = connector.ItemList();
            dataView.table.setModel((new JTable(dataItem, dataView.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        createView.btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String kode = createView.getKode();
                String nama = createView.getNama();
                String kelas = createView.getKelas();
                String tujuan = createView.getTujuan();
                String jadwal = createView.getJadwal();
                String jam = createView.getJam();
                String waktu = createView.getWaktu();
                connector.insertItem(kode, nama, kelas, tujuan, jadwal, jam, waktu);

                String dataItem[][] = connector.ItemList();
                dataView.table.setModel((new JTable(dataItem, dataView.namaKolom)).getModel());
            }
        });

        createView.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createView.dispose();
            }
        });

        dataView.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = dataView.table.getSelectedRow();

                pKode = dataView.table.getValueAt(baris, 0).toString();
                pNama = dataView.table.getValueAt(baris, 1).toString();
                pKelas = dataView.table.getValueAt(baris, 2).toString();
                pTujuan = dataView.table.getValueAt(baris, 3).toString();
                pJadwal = dataView.table.getValueAt(baris, 4).toString();
                pJam = dataView.table.getValueAt(baris, 5).toString();
                pWaktu = dataView.table.getValueAt(baris, 6).toString();

                dataView.tfKode.setText(pKode);
                dataView.tfNama.setText(pNama);
                dataView.tfKelas.setText(pKelas);
                dataView.tfTujuan.setText(pTujuan);
                dataView.tfJadwal.setText(pJadwal);
                dataView.tfJam.setText(pJam);
                dataView.tfWaktu.setText(pWaktu);
            }
        });

        dataView.btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataView.dispose();
            }
        });

        dataView.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String kode = dataView.getKode();
                String nama = dataView.getNama();
                String kelas = dataView.getKelas();
                String tujuan = dataView.getTujuan();
                String jadwal = dataView.getJadwal();
                String jam = dataView.getJam();
                String waktu = dataView.getWaktu();
                connector.updateItem(kode, nama, kelas, tujuan, jadwal, jam, waktu);

                String dataItem[][] = connector.ItemList();
                dataView.table.setModel((new JTable(dataItem, dataView.namaKolom)).getModel());
            }
        });

        dataView.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String kode = dataView.getKode();
                connector.deleteItem(kode);

                String dataItem[][] = connector.ItemList();
                dataView.table.setModel((new JTable(dataItem, dataView.namaKolom)).getModel());

                dataView.tfKode.setText("");
                dataView.tfNama.setText("");
                dataView.tfKelas.setText("");
                dataView.tfTujuan.setText("");
                dataView.tfJadwal.setText("");
                dataView.tfJam.setText("");
                dataView.tfWaktu.setText("");
            }
        });

    }

}
