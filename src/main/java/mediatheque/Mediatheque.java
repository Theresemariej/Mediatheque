package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque{
	private final List<Item> items = new LinkedList<>();

	  public void printCatalog() {
        for (Item i : items)
            i.print();
    }

    public void printOnlyBook() {
        printOnlyBook printBookVisitor = new printOnlyBook();
        for (Item item : items) {
            item.accept(printBookVisitor);
        }
    }


    public void printOnlyCD() {
        printOnlyCD printCDVisitor = new printOnlyCD();
        for (Item item : items) {
            item.accept(printCDVisitor);
        }
    }

}
