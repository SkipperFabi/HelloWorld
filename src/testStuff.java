import java.util.Random;        
class RandomPickString {
    static Random myRandom = new Random();
  
    static String getRandom(String[] arr) {        
        int rdm = myRandom.nextInt(arr.length);
        return arr[rdm];
    }    
    static String pickRandom() {
        String[] operator = {"+", "-", "/", "*", "%"};
        String r = getRandom(operator);
        return r;
    }    
    public static void main(String[] args){
       System.out.println(pickRandom());       
    }    
}