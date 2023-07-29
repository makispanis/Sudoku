

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//δημιουργει το βασικο frame με το menu
public class Menu extends JFrame implements ActionListener {
    JMenu menu, submenu;

    JMenuItem i1, i2, i3, i4, i5, i6, i7, i8;

    //δημιιουργει το μενου και της επιλογες του και το εμφανιζει
    public Menu() {
        JFrame f = new JFrame("Let's play Sudoku!");
        JMenuBar menubar = new JMenuBar();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu = new JMenu("Menu");
        submenu = new JMenu("Play");
        i1 = new JMenuItem("Classic Sudoku (9x9)");
        i2 = new JMenuItem("Classic Sudoku - Words (9x9)");
        i3 = new JMenuItem("Killer Sudoku (9x9)");
        i4 = new JMenuItem("Killer Sudoku - Words (9x9)");
        i5 = new JMenuItem("Duidoku (4x4)");
        i6 = new JMenuItem("Duidoku - Words (4x4)");
        i7 = new JMenuItem("Score");
        i8 = new JMenuItem("Exit");

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i6.addActionListener(this);
        i5.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);

        menubar.add(menu);
        menu.add(submenu);

        submenu.add(i1);
        submenu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        submenu.add(i6);
        menu.add(i7);
        menu.add(i8);


        f.setJMenuBar(menubar);
        f.setSize(500, 200);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == i1) {
            try {
                new NameForm(1);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == i2) {
            try {
                new NameForm(2);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == i3) {
            try {
                new NameForm(3);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if(e.getSource()==i4) {
            try {
                new NameForm(4);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == i5) {
            try {
                new NameForm(5);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == i6) {
            try {
                new NameForm(6);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == i7) {
            try {
                new NameForm(7);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == i8) {
            System.exit(0);
        }
    }


}
