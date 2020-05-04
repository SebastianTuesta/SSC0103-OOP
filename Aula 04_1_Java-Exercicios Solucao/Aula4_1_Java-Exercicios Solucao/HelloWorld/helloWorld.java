class HelloWorldApp {
 public static void main(String[] args) {
    try{
        System.out.println("Hello, " + args[0]);
    }catch(Exception ex){
        System.out.println("Hello, World");
    }
 
 }
}