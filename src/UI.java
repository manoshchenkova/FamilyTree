public class UI {
    // Вызвать меню - что Вы хотите сделать:
    // === люди ===

    // !Добавить человека
    //
    // Задать родственные связи

    // Найти человека по данным

    // Удалить человека

    // !Распечатать дерево для человека
        public static void printFamilyTree(Node nodeWeWant, String space) {
            if (nodeWeWant != null) {
                Person person = nodeWeWant.getPerson();
                System.out.println(space + person.getFullName());

                for (Node children: nodeWeWant.getChildren()) {
                    printFamilyTree(children, space + "  ");
                }
            }

        }


    // !=== исследования === по дереву

    // вывести семью (мама папа дети) для человека

    // найти родственника для человека например теща дедушка

    // найти связь между 2-мя людьми

}
