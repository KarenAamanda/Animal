public abstract class Animal{

    private String nome;
    private String raca;
    private int idade;

    public Animal(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public Animal(){

    }

    //get
    public String getNome(){
        return nome;
    }

    public String getRaca(){
        return raca;
    }

    public int getIdade(){
        return idade;
    }

    //set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
    }
}