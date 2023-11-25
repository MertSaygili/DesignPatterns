package models;

//* Builder example, with a simple computer builder.
//* This is a simple example, but it's a good one.
//* https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java

public class Computer {

    // required parameters
    private String cpu;
    private String ram;
    private String storage;

    // optional parameters
    private String powerSupply;
    private String monitor;
    private String keyboard;
    private String mouse;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.powerSupply = builder.powerSupply;
        this.monitor = builder.monitor;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    // toString() method
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", monitor='" + monitor + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }


    //* Builder class for Computer
    public static class Builder {
        // required parameters
        private String cpu;
        private String ram;
        private String storage;

        // optional parameters
        private String powerSupply;
        private String monitor;
        private String keyboard;
        private String mouse;

        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
