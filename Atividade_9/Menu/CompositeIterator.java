package Menu;
import java.util.Iterator;
import java.util.Stack;

class CompositeIterator implements Iterator{
  private Stack<Iterator<MenuComponent>> stack;

  public CompositeIterator(Iterator<MenuComponent> iterator) {
      stack = new Stack<>();
      stack.push(iterator);
  }

  public boolean hasNext() {
      if (stack.isEmpty()) {
          return false;
      } else {
          Iterator<MenuComponent> iterator = stack.peek();
          if (!iterator.hasNext()) {
              stack.pop();
              return hasNext();
          } else {
              return true;
          }
      }
  }

  public MenuComponent next() {
      if (hasNext()) {
          Iterator<MenuComponent> iterator = stack.peek();
          MenuComponent component = iterator.next();
          if (component instanceof Menu) {
              stack.push(component.iterator());
          }
          return component;
      } else {
          return null;
      }
  }
}
