package hashmapsimple;
public class ContainsKeyTest implements ITest
{
    @Override
    public void test() {
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println(" ");
        System.out.println("con containsKey: " + col.containsKey(1));
        System.out.println("con containsKey: " + col.containsKey(7));
        /*------------------------------------------------------*/
        System.out.println(" ");
        System.out.println("\t ---TODOS LOS DATOS---");
        System.out.println("tamaño -> " + col.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        col.values().stream().forEach((s) -> {
            System.out.println(s);            
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        col.keySet().stream().forEach((s) -> {
            if(s == 1 || s == 3 || s == 5){
                Console.println(Console.ANSI_BLUE,String.valueOf(s));
            } else {
                System.out.println(s);
            }
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        col.entrySet().stream().forEach((e)->{
            if(e.getKey() == 1 || e.getKey() == 3 || e.getKey() == 5){
                Console.println(Console.ANSI_BLUE,"clave -> "+ e.getKey() +" valor -> "+e.getValue());
            } else {
                System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
            }
        });
    
    }    
}