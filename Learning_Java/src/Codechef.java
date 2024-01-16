interface kunj{

}
interface KKR implements kunj{
    private void meth3(){

    }

    static void meth(){
        System.out.println("kkr");
    }
}

public class Codechef implements KKR{

    public static void main(String[] args)
    {
        KKR.meth();
    }

}