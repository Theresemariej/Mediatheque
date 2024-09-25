package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque{
	private final List<Item> items = new LinkedList<>();

    public void addItem(Item i) {
		items.add(i);
	}
	

	  public void printCatalog() {
        for (Item i : items)
            i.print();
    }

    public void printOnlyBooks() {
        printOnlyBook printBookVisitor = new printOnlyBook();
        for (Item i : items) {
            i.accept(printBookVisitor);
        }
    }


    public void printOnlyCDs() {
        printOnlyCD printCDVisitor = new printOnlyCD();
        for (Item i : items) {
            i.accept(printCDVisitor);
        }
    }

}
