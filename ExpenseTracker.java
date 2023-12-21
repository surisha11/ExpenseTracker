import javax.swing.*;
import java.awt.*;
class ExpenseTracker extends JFrame {
    JTable table;
    String cols[] = {"Name", "Mobile no"};
    String rows[][] = {{"Surisha", "1234"}};
    ExpenseTracker(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        table = new JTable(rows, cols);
        JScrollPane j = new JScrollPane(table);
        add(j);
        setVisible(true);
    }
    public static void main(String args[]){
        ExpenseTracker et = new ExpenseTracker();
    }
}