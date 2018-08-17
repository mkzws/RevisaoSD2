package revisaosd;

public class Pessoa {
   protected String nome;
   protected int idade;
   
   public Pessoa (){
       
   }
   
   public Pessoa (String nome, int idade){
       nome = this.nome;
       idade = this.idade;
   }
   
   
   
   @Override
   public String toString(){
       return "Nome: " + this.nome + "\nIdade: "+ this.idade;
   }
   
}
