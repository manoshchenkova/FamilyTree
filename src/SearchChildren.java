import java.util.List;

public class SearchChildren implements SearchRelation {
    @Override
    public List<Node> find(Node personNode) {
        return personNode.getChildren();
    }
}
