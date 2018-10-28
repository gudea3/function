public class Main {
    public static void main(String[] args) {
        BinarryTree<Person> personBinarryTree = new BinarryTree();
        Person maria = new Person("Maria", "Sarb", 55);
        Person petru = new Person("Petru", "Georgescu", 32);
        Person alina = new Person("Alina", "Dragan", 44);
        Person cristian = new Person("Cristian", "Ardelean", 20);
        Person diana = new Person("Diana", "Muresan", 26);
        Person raluca = new Person("Raluca", "Balan", 36);
        Person alin = new Person("Alin", "Baidoc", 29);

        personBinarryTree.add(maria);
        personBinarryTree.add(petru);
        personBinarryTree.add(alina);
        personBinarryTree.add(cristian);
        personBinarryTree.add(diana);
        personBinarryTree.add(raluca);
        personBinarryTree.add(alin);

        personBinarryTree.traverseInOrder(personBinarryTree.root);
    }
}
