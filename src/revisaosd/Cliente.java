package revisaosd;

public class Cliente extends Pessoa {

    protected float saldo;

    public Cliente() {

    }

    public Cliente(String nome, int idade, float saldo) {
        saldo = this.saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSaldo: " + saldo;
    }
}
