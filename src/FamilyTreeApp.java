import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class FamilyTreeApp {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setId(1);
        person1.setFirstName("Елена");
        person1.setLastName("Иванова");
        person1.setSex(Person.Sex.FEMALE);
        person1.setDateOfBirth(LocalDate.of(1980,8,23));

        Person person2 = new Person("Зиновьев", "Владимир", LocalDate.of(1979,2,8),Person.Sex.MALE, 2);
        Person person3 = new Person("Зиновьева", "Инна", LocalDate.of(2010,9,10),Person.Sex.FEMALE, 3);
        Person person4 = new Person("Зиновьев", "Иннокентий", LocalDate.of(2008,02,28), Person.Sex.MALE, 4);
        Person person5 = new Person("Зиновьев", "Андрей", LocalDate.of(2022,01,22), Person.Sex.MALE,5); 
        
        Node node1 = new Node(person1);
        Node node2 = new Node(person2);
        Node node3 = new Node(person3);
        node3.setMother(node1);
        node3.setFather(node2);
        Node node4 = new Node(person4);
        node4.setFather(node2);
        node4.setMother(node1);
        
        Node node5 = new Node(person5);
        node5.setMother(node1);
        node5.setFather(node2);

//        System.out.println(person1.getFullName());
        UI.printFamilyTree(node1, " ");

//        System.out.println("Children " + node1.getChildren());

        SearchRelation findChildren = new SearchChildren();
        List<Node> childrenNodes = findChildren.find(node1);

        Collections.sort(childrenNodes);
        System.out.println("Child by date of birth --->" + childrenNodes);
        
        Collections.sort(childrenNodes, (o1, o2) -> {

            String firstName1 = o1.getPerson().getFirstName();
            String firstName2 = o2.getPerson().getFirstName();
            return firstName1.compareTo(firstName2);
        });
        System.out.println("Child by name --->" + childrenNodes);

//        List<Person> childrenPersons = new ArrayList<>();
//        for (Node node: childrenNodes) {
//            Person person = node.getPerson();
//            childrenPersons.add(person);
//        }
//        System.out.println("Child --->" + childrenPersons);
        

//        Research newResearch = new ResearchImpl();
//        SearchRelation newRelation = new SearchChildren();
//        List<Node> childrenList = newResearch.searchByRelation(node1, newRelation);
//        System.out.println("Child ---> " + childrenList);

        //Поиск родителя
        SearchRelation findParent1 = new SearchParents();
        List<Node> parents = findParent1.find(node3);
        System.out.println("Parent --->" + parents);

    }


    // add Note addChild

}
