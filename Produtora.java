class Produtora{
    private String cidade;
    private String nome;
    private String fundacao;
    
    public Produtora(String cidade, String nome, String fundacao){
        this.cidade = cidade;
        this.nome = nome;
        this.fundacao = fundacao;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setFundacao(String fundacao){
        this.fundacao = fundacao;
    }
    
    public String getFundacao(){
        return fundacao;
    }
}

