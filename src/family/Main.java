package family;


    public class Main {
        public static void main(String[] args) {
            Son son = new Son("Erik", 15);
            son.printSon();
            son.setName("Karl");
            son.setAge(16);
            son.printSon();

            Daughter daughter = new Daughter("Anna", 12);
            daughter.printDaughter();
            daughter.setName("Eva");
            daughter.setAge(13);
            daughter.printDaughter();
        }
    }

