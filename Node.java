public class Node implements TreeElement{
    private TreeElement right;
    private TreeElement left;
    private int mValue;

    public Node(int value) {
        this.mValue = value;
        this.right = new End();
        this.left = new End();
    }

    @Override
    public TreeElement insert(int value) {
        if(value < mValue) {
            left = left.insert(value);
        }
        else {
            right = right.insert(value);
        }

        return this;
    }
}
