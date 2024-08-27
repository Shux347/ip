public class Deadline extends Item {

    private String by;
    
    public Deadline(String newname, String by) {
        super(newname);
        this.by = by;
    }
    @Override
    public String toData() {
        String str = String.format("D | %s | %s\n", super.toData(), this.by);
        return str;
    }
    @Override
    public String toString() {
        String str = String.format("[D] %s (by: %s)", super.toString(), this.by);
        return str;
    }
}
