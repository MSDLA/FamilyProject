package family;

 class Son{


private String name;
private int age;

public Son(String name,int age){
        this.name=name;
        this.age=age;
        }

public void setName(String name){
        this.name=name;
        }

public void setAge(int age){
        this.age=age;
        }

public void printSon(){
        System.out.println("Nome do filho: "+name);
        System.out.println("Idade do filho: "+age);
        }
        }

