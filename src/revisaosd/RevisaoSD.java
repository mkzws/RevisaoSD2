package revisaosd;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RevisaoSD {
    
    static ArrayList<Cliente> c = new ArrayList<Cliente>();
    
    public static void main(String[] args) {
        int r = 0;
        Cliente cli;
        Scanner ler = new Scanner(System.in);
        int indexObj;
        
        JFrame janela = new JFrame("Atividade - Banco");
        janela.setSize(900, 700);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout());
        painel.setSize(900, 50);
        janela.add(painel);
        JPanel painel2 = new JPanel();
        painel2.setSize(900, 500);
        painel2.setLayout(new FlowLayout());
        janela.add(painel2);
        JButton adicionar = new JButton("Adiconar");
        JButton consultar = new JButton("Consultar");
        JButton remover = new JButton("Remover");
        JButton atualizar = new JButton("Atualizar");
        JButton sair = new JButton("Sair");
        
        painel.add(new JLabel("Escolha sua opção:"));
        
        painel.add(adicionar);
        painel.add(consultar);
        painel.add(remover);
        painel.add(atualizar);
        painel.add(sair);
        
        janela.setVisible(true);
        
        do {
            switch (r) {
                case 1:
                    cli = new Cliente();
                    System.out.println("Digite o nome: ");
                    cli.setNome(ler.next());
                    System.out.println("Digite a idade: ");
                    cli.setIdade(ler.nextInt());
                    System.out.println("Digite o saldo: ");
                    cli.setSaldo(ler.nextFloat());
                    c.add(cli);
                    System.out.println("Cadastro realizado");
                    listar();
                    break;
                //consultar
                case 2:
                    
                    indexObj = consultar(pesquisar());
                    if (indexObj == -1) {
                        System.out.println("Pessoa não encontrada!");
                    } else {
                        System.out.println("Pessoa encontrada");
                        System.out.println(c.get(indexObj).toString());
                    }
                    break;
                case 3:
                    //remover
                    //inserir o resultado de consultar()
                    //indexObj é o index que retorna de consultar
                    indexObj = consultar(pesquisar());
                    Cliente temp;
                    temp = c.get(indexObj);
                    c.remove(temp);
                    System.out.println("Pessoa removida");
                    break;
                case 4:
                    //atualizar
                    //idem ao remover
                    indexObj = consultar(pesquisar());
                    Cliente atual;
                    float valor;
                    atual = c.get(indexObj);
                    System.out.println("Digite seu novo saldo:");
                    valor = ler.nextFloat();
                    atual.setSaldo(valor);
                    System.out.println("Novo saldo: " + c.get(indexObj).toString());
                //cli.setSaldo(valor);
                case 5:
                    //mensagem de saida
                    System.out.println("Fim!");
            }
        } while (r != 5);
        
    }
    
    public static int consultar(String name) {
        boolean achou = false;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getNome().equals(name)) {
                achou = true;
                return i;
            }
        }
        return -1;
    }
    
    public static void listar() {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).toString());
        }
    }
    
    public static String pesquisar() {
        String name;
        Scanner ler2 = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        name = ler2.next();
        return name;
    }
    
}
