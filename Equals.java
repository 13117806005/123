public class Equals{
    public boolean equals(Object obj){
    if(this == obj)
    return true;
    if(obj != null && obj.getClass() == Integer.class){
    if(this.equals(obj)){
    return true;
    }
    return false;
    }
}
}
   public static void main(String[] args){
     String str1 = new String("hello");
     String str2 = new String("hello"); 
     Integer ina = 128;
     Integer inb = 128;
     float fta = 128.0f;
     System.out.println(ina.equals(fta));//true
     //System.out.println(ina.equals(a));//true
     //System.out.println(ina.equals(fta));//Êä³öfalse

     System.out.println(ina.equals(inb));//Êä³ötrue
     System.out.println(ina == inb);//Êä³öfalse
    }

}