public class abs01 extends abs00 {

    public void m1(){
              
        System.out.println("m1 executed from abs01 class");
    }

    public void m2(){
        System.out.println("m2 executed from abs01 class");
    }
    public static void main(String[] args) {
        
        //abs00 ab=new abs00();
        System.out.println("tejas bedke at deogiri college");
        abs00 ab=new abs01();
            //abs00 ab1=new abs01();
           // abs00 ab2=new abs01();

        ab.m1();
        ab.m2();

       // System.out.println(abs00.count);

    }
    
}
