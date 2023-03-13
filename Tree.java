public class Tree{
    private TreeElement root;

    public Tree() {
        root = new End();
    }

    public void insert(int value) {
        root = root.insert(value);
    }

}
