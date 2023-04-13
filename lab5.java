import java.util.ArrayList;
import java.util.Scanner;


    public static ArrayList<Double> array = new ArrayList();
    public static void main(String[] args) {
       nhapDS();
       xuatDS();
       tongDS();
        
    }
    
    public static void nhapDS(){
        Scanner sc = new Scanner(System.in);
        String them;
        while(true){
            System.out.println("Nhap so thuc ");
            Double x = sc.nextDouble();
            array.add(x);
            System.out.println("Tiep tuc nhap hoac nhan n de bo qua ");
            them = sc.next();
            
            if(them.equalsIgnoreCase("n"))
                break;
        }
    }

    private static void xuatDS() {
        for(int i= 0; i< array.size();i++){
            System.out.println(array.get(i).toString());
        }
    }
    private static void tongDS() {
        double tong = 0;
        for(int i=0; i<array.size();i++){
            tong = tong + array.get(i);
           
        }
        System.out.println("tong DS"+tong);
    }
}