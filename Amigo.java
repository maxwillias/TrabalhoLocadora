class Amigo{
    private String nomeCompleto;
    private Endereco endereco;
    private String cpf;
    private String telefone;
    private int idade;
    private Filme filmePego;
     
    public Amigo(String nomeCompleto, Endereco endereco, String cpf, String telefone, int idade){
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }
    
    public void setFilme(Filme filme){
        filmePego = filme;
    }
    
    public Filme getFilmePego(){
        return filmePego;
    }
    
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return endereco;
    } 
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
}
