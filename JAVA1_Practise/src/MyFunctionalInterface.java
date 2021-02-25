@FunctionalInterface
public interface MyFunctionalInterface {
  default void printDetails2(){
        System.out.println("I'm in default method");
    }

    void printName();

}

