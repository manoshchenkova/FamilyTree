import java.util.List;

public class ResearchImpl implements Research {
    @Override
    public List<Node> searchByRelation(Node personNode, SearchRelation searchRelation) {
        return searchRelation.find(personNode);
    }
}
