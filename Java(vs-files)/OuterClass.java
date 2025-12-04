class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        double cores;
        String manufactures;

        Processor(double cores, String manufactures) {
            this.cores = cores;
            this.manufactures = manufactures;
        }

        double getCache() {
            return 4.3;
        }
    }

    protected class RAM {
        double memory;
        String manufacturer;

        RAM (double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        double getClockSpeed(){
            return 5.5;
        }
    }
}
    // public class OuterClass {
    //     public static void main (String[] args) {
    //         CPU cpu = new CPU(20_000);

    //         CPU.Processor processor = cpu.new Processor(8, "Intel");
    //         CPU.RAM ram = cpu.new RAM(16, "AMD");

    //         System.out.println("CPU Price = " + cpu.price);

    //         System.out.println("Processor Cores = " + processor.cores);
    //         System.out.println("Processor Manufactures = " + processor.manufactures);
    //         System.out.println("Processor Cache = " + processor.getCache());
            
    //         System.out.println("Ram Memory = " + ram.memory);
    //         System.out.println("Ram Manufactures = " + ram.manufacturer);
    //         System.out.println("Ram Clock Speed = " + ram.getClockSpeed());
    //     }
    // }

class Cars {
    String carName;
    String carType;

    Cars(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    private String getCarName() {
        return this.carName;
    }

    class Engine {
        String engineType;
        void setEngine() {
            if(Cars.this.carType.equals("4WD")){
                if(Cars.this.getCarName().equals("Gil Robert")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }
            }
            else {
                this.engineType = "Bigger";
            }
        }
        
        String getEngineType() {
            return this.engineType;
        }
    }
}

public class OuterClass {
        public static void main (String[] args) {
            Cars car1 = new Cars("Gil Robert", "4WD");

            Cars.Engine engine = car1.new Engine();

            engine.setEngine();
            System.out.println("Engine Type for 8WD = " + engine.getEngineType());
        }
    }