class TestarLocadora{
    
    public static void main(String args[]){
        
        Produtora warnerBros = new Produtora("Hollywood", "Warner Bros. Entertainment", "4 de abril de 1923");
        
        Produtora cbsFilms = new Produtora("Los Angeles", "CBS Films Inc.", "março de 2007");
        
        Filme constatine = new Filme("Constatine", "11 de Março de 2005", "Keanu Reeves, Gavin Rossdale, Peter Stormare", "John Constatine, Balthazar, Lúcifer", " Francis Lawrence", warnerBros);
        
        Filme coringa = new Filme("Coringa", "3 de outubro de 2019", "Joaquin Phoenix, Robert De Niro, Brett Cullen", "Arthur Fleck, Murray Franklin, Thomas Wayne", "Todd Phillips", warnerBros);
        
        Filme cincoPassos = new Filme("A Cinco Passos de Você", "21 de março de 2019", "Cole Sprouse, Haley Lu Richardson, Moises Arias", "Will, Stella, Poe", "Justin Baldoni", cbsFilms);
        
        Endereco missoes = new Endereco("São João das Missões","rua A", "Centro", "81");
        
        Endereco januaria = new Endereco("Januária","rua Z", "Janette", "69");
        
        Amigo willias = new Amigo("Willias Júnior",missoes,"150.111.222-55","99885533",22);
        
        Amigo edlaine = new Amigo("Edlaine Nunes",januaria,"166.876.443-53","99707070",40);
        
        willias.setFilme(coringa);
        
        edlaine.setFilme(constatine);
        
        System.out.println(willias.getFilmePego().getNome());
        
        System.out.println(edlaine.getFilmePego().getNome());
    }
}
