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





    @Override
    public TreeElement remove(int value) {
        if(value == mValue) {
            if(right.isEnd()) {
                return left;
            }
            else{
                right = right.append(left);
                return this;
            }
        }

        if(value < mValue) {
            left = left.remove(value);
        }
        else {
            right = right.remove(value);
        }

        return this;
    }

    @Override
    public int depth(int value, int currentD) {
        if(value == mValue) {
            return currentD;
        }

        if(value < mValue) {
            return left.depth(value, currentD + 1);
        }
        else {
            return right.depth(value, currentD + 1);
        }
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public TreeElement append(TreeElement elem) {
        left = left.append(elem);
        return this;
    }

    @Override
    public void inorder() {
        left.inorder();
        System.out.print(mValue + " ");
        right.inorder();
    }
}
