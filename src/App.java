public class App {
    public static void main(String args[]) {
        System.out.println("Programa de Associação");
        Fabricante f1 = new Fabricante("Coca-cola", "Brasil");
        Produto p1 = new Produto(125, "Fanta", 2.60, f1);
        System.out.println(p1.getCodigo() + " é fabricado por: " + p1.getFabricante().getNome());
        Produto p2 = new Produto(126, "Sprite", 2.50, f1);
        System.out.println(p2.getCodigo() + " é fabricado por: " + p2.getFabricante().getNome());

    }
}
