import java.util.ArrayList;
import java.util.List;

public class SearchParents implements SearchRelation {
    @Override
    public List<Node> find(Node personNode) {
        List<Node> parentsList = new ArrayList<Node>();
        parentsList.add(personNode.getFather());
        parentsList.add(personNode.getMother());
        return parentsList;
    }
}
