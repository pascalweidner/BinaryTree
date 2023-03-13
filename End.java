public class End implements TreeElement {
    @Override
    public TreeElement insert(int value) {
        return new Node(value);
    }
}
