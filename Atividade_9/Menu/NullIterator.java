package Menu;
import java.util.Iterator;

class NullIterator implements Iterator<MenuComponent> {
  public boolean hasNext() {
      return false;
  }

  public MenuComponent next() {
      return null;
  }
}