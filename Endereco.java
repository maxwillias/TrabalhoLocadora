class Endereco{
    private String cidade;
    private String rua;
    private String bairro;
    private String numero;
    
    public Endereco(String cidade, String rua, String bairro, String numero){
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public String getRua(){
        return rua;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return numero;
    }
}
