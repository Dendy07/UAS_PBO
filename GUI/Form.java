import javax.swing.*; //untuk memanggil package
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame { // pewarisan dari JFrame untuk digunakan di class Form

    public Form() {

        // PEMBUATAN OBJEK

        JPanel panel1 = new JPanel(); // pembuatan panel 1
        JPanel panel2 = new JPanel(); // pembuatan panel 1
        Container con = this.getContentPane(); // pembuatan ontainer

        // Membuat objek option button baru

        final JRadioButton rbHandphone1 = new JRadioButton("Handphone 1");
        final JRadioButton rbHandphone2 = new JRadioButton("Handphone 2");
        final JRadioButton rbHandphone3 = new JRadioButton("Handphone 3");
        final JRadioButton rbHandphone4 = new JRadioButton("Handphone 4");

        // Membuat button group

        ButtonGroup radioBgroup = new ButtonGroup();

        // Membuat label

        JLabel lblNamaPemilik = new JLabel("Nama Pemilik");
        final JLabel lblMerkHP = new JLabel("Merk HP");
        final JLabel lblBaterai = new JLabel("Baterai");

        // Membuat text field

        final JTextField txtNamaPemilik = new JTextField(5);
        final JTextField txtMerkHP = new JTextField(5);
        final JTextField txtBaterai = new JTextField(5);
        final JButton cmdTampilkan = new JButton("Tampilkan");
        final JButton cmdKosongkan = new JButton("Kosongkan");
        final JButton cmdExit = new JButton("Keluar");

        // konfigurasi layout

        con.setLayout(new GridLayout(1, 2)); //
        panel1.setLayout(new GridLayout(3, 3, 2, 5));
        panel2.setLayout(new GridLayout(6, 3, 2, 5));
        panel1.setBorder(BorderFactory.createTitledBorder("Pemilik Handphone"));
        panel2.setBorder(BorderFactory.createTitledBorder("Data"));

        // menambahkan panel ke window

        con.add(panel1);
        con.add(panel2);

        // mendaftarkan radio button sebagai group

        radioBgroup.add(rbHandphone1);
        radioBgroup.add(rbHandphone2);
        radioBgroup.add(rbHandphone3);
        radioBgroup.add(rbHandphone4);

        // menambahkan objek ke dalam panel 1

        panel1.add(rbHandphone1);
        panel1.add(rbHandphone2);
        panel1.add(rbHandphone3);
        panel1.add(rbHandphone4);

        // menambahkan objek ke dalam panel 2

        panel2.add(lblNamaPemilik);
        panel2.add(txtNamaPemilik);
        panel2.add(lblMerkHP);
        panel2.add(txtMerkHP);
        panel2.add(lblBaterai);
        panel2.add(txtBaterai);
        panel2.add(cmdTampilkan);
        panel2.add(cmdKosongkan);
        panel2.add(cmdExit);

        // memberikan even handling kepada command button

        cmdTampilkan.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (rbHandphone1.isSelected()) {
                    txtNamaPemilik.setText("Desatra");
                    txtMerkHP.setText("INFINIX");
                    txtBaterai.setText("5000 mAh");
                }
                if (rbHandphone2.isSelected()) {
                    txtNamaPemilik.setText("Dianil");
                    txtMerkHP.setText("ASUS");
                    txtBaterai.setText("5000 mAh");
                }
                if (rbHandphone3.isSelected()) {
                    txtNamaPemilik.setText("Bella");
                    txtMerkHP.setText("SAMSUNG mAh");
                    txtBaterai.setText("6000");
                }
                if (rbHandphone4.isSelected()) {
                    txtNamaPemilik.setText("Billa");
                    txtMerkHP.setText("iPhone");
                    txtBaterai.setText("4326 mAh");
                }
            }
        });
        cmdKosongkan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtNamaPemilik.setText(" ");
                txtMerkHP.setText(" ");
                txtBaterai.setText(" ");
            }
        });
        cmdExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(1);
            }
        });

        // menampilkan window

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(40, 120);
        this.setSize(520, 230);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Form();
    }
}