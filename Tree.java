public class Tree{
    private TreeElement root;

    public Tree() {
        root = new End();
    }

    public void insert(int value) {
        root = root.insert(value);
    }

    public void remove(int value) {
        root = root.remove(value);
    }

    public int depth(int value) {
        return root.depth(value, 1);
    }

    public void inorder() {
        root.inorder();
        System.out.println();
    }

}
