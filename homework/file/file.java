package homework.file;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

public class file extends JFrame {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {

                file form = new file();
                form.setVisible(true);
            }
        });
    }

    public file() {

        // Create Form Frame
        super("ThaiCreate.Com Java GUI Tutorial");
        setSize(450, 300);
        setLocation(500, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Label Result
        final JLabel lblResult = new JLabel("Result", JLabel.CENTER);
        lblResult.setBounds(22, 22, 370, 14);
        getContentPane().add(lblResult);

        // EditPane
        JTextPane textPane = new JTextPane();

        // ScrollPane
        JScrollPane scroll = new JScrollPane(textPane);
        scroll.setBounds(124, 98, 162, 67);
        getContentPane().add(scroll);

        // Create txtPane Style

        final StyledDocument doc = textPane.getStyledDocument();

        // Create Button Open JFileChooser

        JButton btnButton = new JButton("Open File Chooser");

        btnButton.setBounds(147, 47, 135, 23);

        btnButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFileChooser fileopen = new JFileChooser();

                FileFilter filter = new FileNameExtensionFilter("Text/CSV file", "txt", "csv");

                fileopen.addChoosableFileFilter(filter);

                int ret = fileopen.showDialog(null, "Choose file");

                if (ret == JFileChooser.APPROVE_OPTION) {

                    // Read Text file

                    File file = fileopen.getSelectedFile();

                    try {

                        BufferedReader br = new BufferedReader(new FileReader(file));

                        String line;

                        while ((line = br.readLine()) != null) {

                            // System.out.println(line);

                            doc.insertString(doc.getLength(), line + "\n", null);

                        }

                        br.close();

                    } catch (IOException | BadLocationException ex) {

                        // TODO Auto-generated catch block

                        ex.printStackTrace();

                    }
                    lblResult.setText(fileopen.getSelectedFile().toString());

                }
            }
        });
        getContentPane().add(btnButton);
    }

}
