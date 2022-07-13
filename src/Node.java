import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {
    
    private Person person;
    private Node father;
    private Node mother;
    private List<Node> children = new ArrayList<>();

    public Node(Person person) {
        this.person = person;
    }

    @Override
    public int compareTo(Node o) {

        LocalDate dateOfBirth = this.getPerson().getDateOfBirth();

        LocalDate dateOfBirth1 = o.getPerson().getDateOfBirth();

        return dateOfBirth.compareTo(dateOfBirth1);
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
        father.addChild(this, Parent.FATHER);
    }

    public Node getMother() {
        return mother;
    }

    public void setMother(Node mother) {
        this.mother = mother;
        mother.addChild(this, Parent.MOTHER);
    }

    public List<Node> getChildren() {
        return children;
    }

    public Person getPerson() {
        return person;
    }


    public void addChild(Node child, Parent fatherOrMother) {
        if (children.contains(child)) {
            return;
        }
        children.add(child);

        switch (fatherOrMother) {
            case FATHER: {
                child.setFather(this);
                break;
            }

            case MOTHER: {
                child.setMother(this);
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "Node{" +
                "person=" + person +
                '}';
    }
}
