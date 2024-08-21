import java.util.ArrayList;

public class Items {
    ArrayList<Item> items;

    public Items() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void  markItemDone(int i) {
        this.items.get(i-1).markAsDone();
    }

    public void  markItemUndone(int i) {
        this.items.get(i-1).markAsUndone();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.items.size(); i++) {
            result.append(i + 1)
                  .append(".")
                  .append(this.items.get(i).toString())
                  .append("\n");
        }
        return result.toString();
    }

}
