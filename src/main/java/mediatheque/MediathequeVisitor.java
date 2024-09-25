package mediatheque;

public interface MediathequeVisitor {
  public void visit(Book book);
  public void visit(CD cd);

}
