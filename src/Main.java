public class Main{
    public static void main(String[] args){
        String name="Wentworth Miller";
        int biologymarks=67;
        int chemistrymarks=45;
        int physicsmarks=82;
        int total=biologymarks+chemistrymarks+physicsmarks;
        double average=(double) total/3;
        System.out.println("Student Name:"+name);
        System.out.println("Biology:"+biologymarks);
        System.out.println("Chemistry:"+chemistrymarks);
        System.out.println("Physics:"+physicsmarks);
        System.out.println("Totalmarks:"+total);
        System.out.printf("Average:%10.2f",average);


    }
}