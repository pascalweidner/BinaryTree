public class End implements TreeElement {
    @Override
    public TreeElement insert(int value) {
        return new Node(value);
    }

    @Override
    public TreeElement remove(int value) {
        return this;
    }

    @Override
    public int depth(int value, int currentD) {
        return -1;
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public TreeElement append(TreeElement elem) {
        return elem;
    }

    @Override
    public void inorder() {}
}
