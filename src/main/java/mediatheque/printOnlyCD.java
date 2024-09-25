package mediatheque;


public class printOnlyCD implements MediathequeVisitor{

	
    public void visit(Book book){}

    public void visit(CD cd){
        System.out.println("CD {TITRE: " + cd.getTitle() + " ,NB: " + cd.getNumberOfTracks() + " }");
    }
}
