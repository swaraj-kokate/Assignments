class CPU {
    double price;

    // nested class
    class Processor{

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
     class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class PC {
    public static void main(String[] args) {

        // create an object of outer class CPU
        CPU cpu = new CPU();

        // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();

        //Printing memeber function values
        System.out.println("Cache = " + processor.getCache());
        System.out.println("Clock speed = " + ram.getClockSpeed());
       // System.exit(0);
    }
}