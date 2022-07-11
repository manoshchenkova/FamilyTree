import java.util.List;

public class FamilyTreeApp {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setId(1);
        person1.setFirstName("Елена");
        person1.setLastName("Иванова");
        person1.setSex(Person.Sex.FEMALE);
        person1.setDateOfBirth("01.01.1980");
        person1.setId(1);

        Person person2 = new Person("Зиновьев", "Владимир", "02.08.1979",Person.Sex.MALE, 2);
        Person person3 = new Person("Зиновьева", "Инна", "10.09.2010",Person.Sex.FEMALE, 3);
        Person person4 = new Person("Зиновьев", "Иннокентий", "28.02.2008",Person.Sex.MALE, 4);

        Node node1 = new Node(person1);
        Node node2 = new Node(person2);
        Node node3 = new Node(person3);
        node3.setMother(node1);
        node3.setFather(node2);
        Node node4 = new Node(person4);
        node4.setFather(node2);
        node4.setMother(node1);

//        System.out.println(person1.getFullName());
        UI.printFamilyTree(node1, " ");

//        System.out.println("Children " + node1.getChildren());

        SearchRelation findChildren = new SearchChildren();
        List<Node> children = findChildren.find(node1);
        System.out.println("Child --->" + children);

//        Research newResearch = new ResearchImpl();
//        SearchRelation newRelation = new SearchChildren();
//        List<Node> childrenList = newResearch.searchByRelation(node1, newRelation);
//        System.out.println("Child ---> " + childrenList);

        SearchRelation findParent1 = new SearchParents();
        List<Node> parents = findParent1.find(node3);
        System.out.println("Parent --->" + parents);

    }



    // add Note addChild

}
