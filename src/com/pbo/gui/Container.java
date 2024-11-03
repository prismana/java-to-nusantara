/*
Writen by Rahdriawan Prismana
L200200031

Reference
https://www.youtube.com/watch?v=QU9t-TqTnsg&list=PLLQOQa4PqY-v6SUSWSjWA4HmtjQ4HJ3QU&pp=iAQB
*/
package com.pbo.gui;

import com.pbo.gui.data.Data;
import com.pbo.gui.data.Price;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Container extends Data{
    JFrame frame;

    //konstruktor
    public Container(String title, int width, int height) {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
    }

    // semua komponen di method ini pakai java swing
    public void initComponent() {
        // nama
        JLabel label_nama = new JLabel("Nama");
        label_nama.setFont(new Font("Helvetica", Font.PLAIN, 48));
        label_nama.setBounds(70, 70, 400, 80);
        frame.add(label_nama);

        // email
        JLabel label_email = new JLabel("E-mail");
        label_email.setFont(new Font("Helvetica", Font.PLAIN, 48));
        label_email.setBounds(70, 190, 400, 80);
        frame.add(label_email);

        // maskapai
        JLabel label_maskapai = new JLabel("Maskapai");
        label_maskapai.setFont(new Font("Helvetica", Font.PLAIN, 48));
        label_maskapai.setBounds(70, 310, 400, 80);
        frame.add(label_maskapai);

        // Keberangkatan
        JLabel label_keberangkatan = new JLabel("Keberangkatan");
        label_keberangkatan.setFont(new Font("Helvetica", Font.PLAIN, 48));
        label_keberangkatan.setBounds(70, 430, 600, 80);
        frame.add(label_keberangkatan);

        // Tujuan
        JLabel label_tujuan = new JLabel("Tujuan");
        label_tujuan.setFont(new Font("Helvetica", Font.PLAIN, 48));
        label_tujuan.setBounds(70, 550, 400, 80);
        frame.add(label_tujuan);

        // kelas
        JLabel label_kelas = new JLabel("Kelas");
        label_kelas.setFont(new Font("Helvetica", Font.PLAIN, 48));
        label_kelas.setBounds(70, 670, 400, 80);
        frame.add(label_kelas);

        // Total
        JLabel label_total = new JLabel("Total (Rp)");
        label_total.setFont(new Font("Helvetica", Font.BOLD, 54));
        label_total.setBounds(70, 790, 400, 80);
        frame.add(label_total);


        // Drop Down menu
        // Kita buat comboBox untuk masing-masing label

        JComboBox<String> combo_maskapai = new JComboBox<>(Data.array_maskapai);
        combo_maskapai.setBounds(480,310, 400, 70);
        combo_maskapai.setFont(new Font("Helvetica", Font.PLAIN, 32));
        frame.add(combo_maskapai);

        JComboBox<String> combo_keberangkatan = new JComboBox<>(array_keberangkatan);
        combo_keberangkatan.setBounds(480,430, 400, 70);
        combo_keberangkatan.setFont(new Font("Helvetica", Font.PLAIN, 32));
        frame.add(combo_keberangkatan);

        JComboBox<String> combo_tujuan = new JComboBox<>(array_tujuan);
        combo_tujuan.setBounds(480,550, 400, 70);
        combo_tujuan.setFont(new Font("Helvetica", Font.PLAIN, 32));
        frame.add(combo_tujuan);

        JComboBox<String> combo_kelas = new JComboBox<>(array_kelas);
        combo_kelas.setBounds(480,670, 400, 70);
        combo_kelas.setFont(new Font("Helvetica", Font.PLAIN, 32));
        frame.add(combo_kelas);

        // untuk total kita akan memakai textfield
        /*
          resource: https://stackoverflow.com/questions/14916255/how-to-display-a-default-message-in-jtextfield-java
         */
        JTextField textField_total = new JTextField();
        textField_total.setBounds(480, 790, 400, 70);
        textField_total.setFont(new Font("Helvetica", Font.PLAIN, 32));
        textField_total.setText("0");
        frame.add(textField_total);

        // textfield nama
        JTextField textField_nama = new JTextField();
        textField_nama.setBounds(480, 70, 400, 70);
        textField_nama.setFont(new Font("Helvetica", Font.PLAIN, 32));
        textField_nama.setText("Nama Anda");
        frame.add(textField_nama);

        // textfield email
        JTextField textField_email = new JTextField();
        textField_email.setBounds(480, 190, 400, 70);
        textField_email.setFont(new Font("Helvetica", Font.PLAIN, 32));
        textField_email.setText("l200200031@student.ums.ac.id");
        frame.add(textField_email);


        // BUTTON BLOCK
        // Tombol untuk fitur cetak struk
        JButton button_cetak = new JButton("Pesan");
        button_cetak.setFont(new Font("Helvetica", Font.BOLD, 36));
        button_cetak.setBounds(480, 1070, 400, 90);
        button_cetak.setBorder(new RoundedBorder(80));
        button_cetak.setBackground(Color.orange);
        //listener untuk efek hover mouse
        button_cetak.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // buat dialog window baru
                JDialog dialog = new JDialog((Frame) null, "Notification", false);
                dialog.setSize(780, 1080);
                dialog.setLocation(200, 200);
                dialog.setVisible(true);

                // label
                JLabel label_info = new JLabel("Pemesanan Tiket Telah Berhasil!");
                label_info.setFont(new Font("Helvetica", Font.BOLD, 42));
                label_info.setBounds(50, 170, 700, 70);
                dialog.add(label_info);

                // gambar
                // buat gambar ukuran adalah 150x150 pixel
                ImageIcon checked = new ImageIcon("/home/prismana/Documents/JAVA/GUI/pemesanan_tiket_pesawat/src/com/pbo/gui/asset/checked.png");
                JLabel label_gambar = new JLabel(checked);
                label_gambar.setBounds(320, 20, 150, 150);
                label_gambar.setMaximumSize(new Dimension(200, 200));
                dialog.add(label_gambar);

                JLabel label_line = new JLabel("================================");
                label_line.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_line.setBounds(50, 220, 800, 70);
                dialog.add(label_line);

                // nama
                JLabel label_nama = new JLabel("Nama");
                label_nama.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_nama.setBounds(50, 270, 300, 70);
                dialog.add(label_nama);

                JLabel label_maskapai = new JLabel("Maskapai");
                label_maskapai.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_maskapai.setBounds(50, 330, 300, 70);
                dialog.add(label_maskapai);

                JLabel label_keberangkatan = new JLabel("Keberangkatan");
                label_keberangkatan.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_keberangkatan.setBounds(50, 390, 500, 70);
                dialog.add(label_keberangkatan);

                JLabel label_tujuan = new JLabel("Tujuan");
                label_tujuan.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_tujuan.setBounds(50, 450, 300, 70);
                dialog.add(label_tujuan);

                JLabel label_kelas = new JLabel("Kelas");
                label_kelas.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_kelas.setBounds(50, 510, 300, 70);
                dialog.add(label_kelas);

                JLabel label_harga = new JLabel("Harga");
                label_harga.setFont(new Font("Helvetica", Font.BOLD, 36));
                label_harga.setBounds(50, 570, 300, 70);
                dialog.add(label_harga);

                JLabel label_line2 = new JLabel("================================");
                label_line2.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_line2.setBounds(50, 620, 800, 70);
                dialog.add(label_line2);


                // label untuk item yang dipilih pengguna
                // nama
                JLabel label_nama_user = new JLabel(textField_nama.getText());
                label_nama_user.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_nama_user.setBounds(400, 270, 300, 70);
                dialog.add(label_nama_user);

                // maskapai yang dipilih user
                JLabel label_maskapai_user = new JLabel(String.valueOf(combo_maskapai.getSelectedItem()));
                label_maskapai_user.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_maskapai_user.setBounds(400, 330, 300, 70);
                dialog.add(label_maskapai_user);

                JLabel label_keberangkatan_user = new JLabel(String.valueOf(combo_keberangkatan.getSelectedItem()));
                label_keberangkatan_user.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_keberangkatan_user.setBounds(400, 390, 500, 70);
                dialog.add(label_keberangkatan_user);

                JLabel label_tujuan_user = new JLabel(String.valueOf(combo_tujuan.getSelectedItem()));
                label_tujuan_user.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_tujuan_user.setBounds(400, 450, 400, 70);
                dialog.add(label_tujuan_user);

                JLabel label_kelas_user = new JLabel(String.valueOf(combo_kelas.getSelectedItem()));
                label_kelas_user.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_kelas_user.setBounds(400, 510, 400, 70);
                dialog.add(label_kelas_user);

                JLabel label_harga_user = new JLabel("Rp " + textField_total.getText());
                label_harga_user.setFont(new Font("Helvetica", Font.BOLD, 36));
                label_harga_user.setBounds(400, 570, 300, 70);
                dialog.add(label_harga_user);

                // informasi email
                // email
                JLabel label_email_user1 = new JLabel( "Invoice telah dikirim ke email anda");
                label_email_user1.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_email_user1.setBounds(100, 720, 700, 70);
                dialog.add(label_email_user1);

                JLabel label_email_user2 = new JLabel( textField_email.getText());
                label_email_user2.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_email_user2.setForeground(Color.blue);
                label_email_user2.setBounds(120, 770, 700, 70);
                dialog.add(label_email_user2);

                JLabel label_email_user3 = new JLabel("Silahkan cek untuk pembayaran");
                label_email_user3.setFont(new Font("Helvetica", Font.PLAIN, 36));
                label_email_user3.setBounds(100, 820, 700, 70);
                dialog.add(label_email_user3);

                JLabel label_spacer = new JLabel("");
                label_spacer.setFont(new Font("Helvetica", Font.BOLD, 36));
                label_spacer.setBounds(50, 450, 700, 70);
                dialog.add(label_spacer);


                // kita buat button
                JButton button_ok = new JButton("Ok");
                button_ok.setFont(new Font("Helvetica", Font.BOLD, 32));
                button_ok.setBounds(230, 920, 300, 90);
                button_ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                });
                dialog.add(button_ok, BorderLayout.SOUTH);

                JButton button_spacer = new JButton("");
                button_spacer.setFont(new Font("Helvetica", Font.BOLD, 32));
                button_spacer.setBounds(500, 700, 0, 0);
                dialog.add(button_spacer, BorderLayout.SOUTH);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button_cetak.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button_cetak.setBackground(Color.orange);
            }
        });
        frame.add(button_cetak);

        // tombol Cek harga
        JButton button_hapus = new JButton("Cek Harga");
        button_hapus.setFont(new Font("Helvetica", Font.BOLD, 36));
        button_hapus.setBounds(480, 920, 400, 90);
        button_hapus.setBorder(new RoundedBorder(80));
        button_hapus.setBackground(Color.BLACK);
        button_hapus.setForeground(Color.white);
        button_hapus.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // hitung total harga, print di textfield
                Price price = new Price();

                // membuat list item price untuk menampung harga item yang dipilih item
                List<Integer> itemPrice= new ArrayList<>();

                // block disini akan menyamakan pilihan pengguna dan list harga
                // kemudian menambahkan ke array itemPrice
                Map<String, Integer> maskapai = price.maskapaiMapContent();
                for (Map.Entry<String, Integer> entry : maskapai.entrySet()) {
                    if (combo_maskapai.getSelectedItem() == entry.getKey()) {
                        int priceMaskapai = entry.getValue();
                        itemPrice.add(priceMaskapai);
                    }
                }

                Map<String, Integer> keberangkatan = price.KeberangkatanMapContent();
                for (Map.Entry<String, Integer> entry : keberangkatan.entrySet()) {
                    if (combo_keberangkatan.getSelectedItem() == entry.getKey()) {
                        int priceKeberangkatan = entry.getValue();
                        itemPrice.add(priceKeberangkatan);
                    }
                }

                Map<String, Integer> tujuan = price.tujuanMapContent();
                for (Map.Entry<String, Integer> entry : tujuan.entrySet()) {
                    if (combo_tujuan.getSelectedItem() == entry.getKey()) {
                        int priceTujuan = entry.getValue();
                        itemPrice.add(priceTujuan);
                    }
                }

                Map<String, Integer> kelas = price.KelasMapContent();
                // https://stackoverflow.com/questions/2686092/java-get-index-of-key-in-hashmap
                for (Map.Entry<String, Integer> entry : kelas.entrySet()) {
                    if (combo_kelas.getSelectedItem() == entry.getKey()) {
                        int priceKelas = entry.getValue();
                        itemPrice.add(priceKelas);
                    }
                }


                // kita melakukan loop untuk menambahkan semua harga yang terkumpul di list
                int totalPrice = 0;
                for (Integer i : itemPrice) {
                    totalPrice += i;
                }

                // set textFiled ke total harga
                textField_total.setText(String.valueOf(totalPrice));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button_hapus.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button_hapus.setBackground(Color.BLACK);
            }
        });
        frame.add(button_hapus);
    }
}