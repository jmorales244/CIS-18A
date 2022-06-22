public class animal { // this is creating a class that we can use in the hello.java file
    
    public static String iAmDog() {
        return "I am a dog!\n";
    }
    public static void ifLoop(int x) {
        try{
            if (x == 1){
                for(int i = 0; i < 5; i++){
                    System.out.println("You input true!\n");
                }
            }
            else if(x == 0){
                for(int i = 0; i < 5; i++){
                    System.out.println("Your input is false!\n");
                }
            }
        } catch(Exception e){
            if(x > 1 && x < 0){
                System.out.println("YOUR INPUT CANNOT BE ACCEPTED!");
            }
        }
    }
}
