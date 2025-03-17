public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Spider-Man";
        meuFilme.anoDeLancamento = 2002;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacao);

        System.out.println(meuFilme.pegaMedia());
    }
}
