package eventos;

//Importes Java//
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListasMultiplas extends JFrame {
    
    //Essa classe implementa livremente a API java.util.Vector, Atualmente, ele delega para um vetor, em uma versão// 
    //futura será uma implementação real da coleção//
    private DefaultListModel model = new DefaultListModel();
    //Declarando valores no colorNames//
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", 
        "Light Gray", "Magenta", "Orange", "Pink","Red", "White", "Yellow"};
    //Declarando uma JList que receberar a variavel colorNames//   
    private JList colorList = new JList(colorNames);
    //Declarando uma JList que receberar a classe DefaultListModel//
    private JList copyList = new JList(model);
    //Declarando os botões copiar e deletar//
    private JButton copiar;
    private JButton deletar;

    public ListasMultiplas(){
        super("Seleção Multipla");
        setLayout(new FlowLayout());
        colorList.setVisibleRowCount(5);
        add(new JScrollPane(colorList));
        
        //Evento Copiar//
        copiar = new JButton("Copiar >>");
        copiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selecionar  = colorList.getSelectedIndices();
                for (int x = selecionar.length - 1; x >= 0; x--) {
                    model.addElement(colorList.getModel().getElementAt(selecionar[x]));
                }
            }
        });

        //Evento Deletar//
        deletar = new JButton("Deletar");
        deletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selecionar = copyList.getSelectedIndices();
                for (int x = selecionar.length - 1; x >= 0; x--) {
                    model.removeElementAt(selecionar[x]);
                }
            }
        });

        add(copiar);
        add(deletar);
        copyList.setVisibleRowCount(5);
        copyList.setFixedCellWidth(100);
        copyList.setFixedCellHeight(15);
        add(new JScrollPane(copyList));
    }

    public static void main(String[] args) {
        ListasMultiplas tela = new ListasMultiplas();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(400, 150);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }

}