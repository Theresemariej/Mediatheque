package mediatheque;


public class printOnlyBook implements MediathequeVisitor{

     public void visit(Book book) {
        System.out.println("Book { TITRRE: " + book.getTitle() + " , AUTEUR: " + book.getAuthor() + " }");
    }

     public void visit(CD cd){}//methode vide, ici on s'occupe que des books
    
}
