public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(3);
        tree.inorder();
        tree.remove(3);
        tree.inorder();
    }
}
