package mediatheque;


public class printCaltalogue implements MediathequeVisitor{

  public void visit(Book book) {
        System.out.println("Book { TITRRE: " + book.getTitle() + " , AUTEUR: " + book.getAuthor() + " }");
    }
    
 public void visit(CD cd){
        System.out.println("CD {TITRE: " + cd.getTitle() + " ,NB: " + cd.getNumberOfTracks() + " }");
    }
}
