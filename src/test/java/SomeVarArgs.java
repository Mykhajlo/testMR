public class SomeVarArgs {
    public static void print (int ... nums){
        System.out.println(nums[1]);
    }
    public static void main (String[] args){
        print(1,2,3,4,5); //2
    }
}
