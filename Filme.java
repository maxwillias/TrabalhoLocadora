class Filme{
    private String nome;
    private String anoLancamento;
    private String elenco;
    private String personagens;
    private String diretor;
    private Produtora produtora;
    
    public Filme(String nome, String anoLancamento, String elenco, String personagens, String diretor, Produtora produtora){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.elenco = elenco;
        this.personagens = personagens;
        this.diretor = diretor;
        this.produtora = produtora;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setAnoLancamento(String anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    
    public String getAnoLancamento(){
        return anoLancamento;
    }
    
    public void setElenco(String elenco){
        this.elenco = elenco;
    }
    
    public String getElenco(){
        return elenco;
    }
    
    public void setPersonagens(String personagens){
        this.personagens = personagens;
    }
    
    public String getPersonagens(){
        return personagens;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    
    public String getDiretor(){
        return diretor;
    }
    
    public void setProdutora(Produtora produtora){
        this.produtora = produtora;
    }
    
    public Produtora getProdutora(){
        return produtora;
    }
}
