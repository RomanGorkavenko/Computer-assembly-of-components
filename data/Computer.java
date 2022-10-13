package HWSem5OOP.data;

public class Computer {

    private String motherBoard;
    private String cpu;
    private String raw;
    private String ssd;
    private String graphicsCard;
    private String powerSupply;
    private String computerCase;

    public Computer(String motherBoard, String cpu, String raw, String ssd, String graphicsCard,
                    String powerSupply, String computerCase) {
        this.motherBoard = motherBoard;
        this.cpu = cpu;
        this.raw = raw;
        this.ssd = ssd;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
        this.computerCase = computerCase;

    }

    @Override
    public String toString() {
        return "Компьютер:\n" + motherBoard + "\n" + cpu + "\n" + raw + "\n" + ssd + "\n" + graphicsCard + "\n" +
                powerSupply + "\n" + computerCase;
    }
}
