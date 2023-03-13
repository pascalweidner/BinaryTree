public interface TreeElement {
    TreeElement insert(int value);
    int depth(int value, int currentD);
    TreeElement remove(int value);
    boolean isEnd();
    TreeElement append(TreeElement elem);
    void inorder();
}
