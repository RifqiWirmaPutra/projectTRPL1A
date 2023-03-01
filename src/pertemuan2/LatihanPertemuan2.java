/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Rifqi Wirma Putra
 */
public class LatihanPertemuan2 {

    public static void main(String[] args) {
        JFrame j = new JFrame("Form Pendaftaran Mahasiswa Baru");

        JLabel judul1 = new JLabel();
        JLabel judul2 = new JLabel();
        judul1.setText("FORMULIR PENDAFTARAN MAHASISWA BARU");
        judul2.setText("Tahun Akademik 2023/2024");
        judul1.setBounds(100, 20, 300, 30);
        judul2.setBounds(150, 40, 300, 30);
        j.add(judul1);
        j.add(judul2);

        JLabel np = new JLabel();
        np.setText("No.Pendaftaran");
        np.setBounds(30, 100, 150, 30);
        j.add(np);

        JTextField npTxt = new JTextField();
        npTxt.setBounds(200, 100, 250, 30);
        j.add(npTxt);

        JLabel prodi = new JLabel();
        prodi.setText("Prodi Yang Diambil");
        prodi.setBounds(30, 150, 150, 30);
        j.add(prodi);

        String[] amenu = {"Teknik Komputer", "Teknologi Rekayasa Perangkat Lunak", "Manajemen Informatika"};
        JComboBox cbMenu = new JComboBox(amenu);
        cbMenu.setBounds(200, 150, 250, 30);
        j.add(cbMenu);

        JLabel name = new JLabel();
        name.setText("Nama Calon Mahasiswa");
        name.setBounds(30, 200, 150, 30);
        j.add(name);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200, 200, 250, 30);
        j.add(nameTxt);

        JLabel jk = new JLabel();
        jk.setText("Jenis Kelamin");
        jk.setBounds(30, 250, 150, 30);
        j.add(jk);

        JRadioButton a = new JRadioButton("Laki-Laki", true);
        a.setBounds(200, 250, 100, 30);
        j.add(a);
        JRadioButton b = new JRadioButton("Perempuan");
        b.setBounds(300, 250, 100, 30);
        j.add(b);

        JLabel agama = new JLabel();
        agama.setText("Agama");
        agama.setBounds(30, 300, 150, 30);
        j.add(agama);

        String[] aagama = {"Islam", "Kristen", "Hindu", "Budha", "Konghucu"};
        JComboBox cbAgama = new JComboBox(aagama);
        cbAgama.setBounds(200, 300, 100, 30);
        j.add(cbAgama);

        JLabel noTelp = new JLabel();
        noTelp.setText("No.Telpon/HP");
        noTelp.setBounds(30, 400, 150, 30);
        j.add(noTelp);

        JTextField noTelpTxt = new JTextField();
        noTelpTxt.setBounds(200, 400, 250, 30);
        j.add(noTelpTxt);

        JLabel email = new JLabel();
        email.setText("Alamat E-mail");
        email.setBounds(30, 350, 150, 30);
        j.add(email);

        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(200, 350, 250, 30);
        j.add(emailTxt);

        JLabel alamat = new JLabel();
        alamat.setText("Alamat Lengkap");
        alamat.setBounds(30, 450, 150, 30);
        j.add(alamat);

        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(200, 450, 250, 50);
        j.add(testTxt);

        JButton SignUpButton = new JButton();
        SignUpButton.setText("Daftar");
        SignUpButton.setBounds(370, 520, 80, 30);
        j.add(SignUpButton);

        j.setSize(500, 700);
        j.setLayout(null);
        j.setVisible(true);
    }

}
