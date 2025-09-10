public class InstrumenTest {
    
    public static void main(String[] args) {
        System.out.println("======alat musik======");
        Instruments gitar = new Instruments();
        Instruments pianika = new Instruments("pianika", 100.000);
        
        gitar.display();
        System.out.println();
        pianika.display();

        //Getter and Setter application
        Instruments drum = new Instruments();
        drum.setName("drum");
        drum.setPrice(900.000);
        drum.display();

        
    }
}

