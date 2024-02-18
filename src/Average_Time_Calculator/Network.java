package Average_Time_Calculator;

public class Network {

    private Integer Devices;
    public static one one;
    public static two two;

    public Network(Integer devices, Average_Time_Calculator.one one, Average_Time_Calculator.two two) {
        Devices = devices;
        Network.one = one;
        Network.two = two;
    }

    public Integer getDevices() {
        return Devices;
    }

    public void setDevices(Integer devices) {
        Devices = devices;
    }

    public Average_Time_Calculator.one getOne() {
        return one;
    }

    public void setOne(Average_Time_Calculator.one one) {
        Network.one = one;
    }

    public Average_Time_Calculator.two getTwo() {
        return two;
    }

    public void setTwo(Average_Time_Calculator.two two) {
        Network.two = two;
    }
}


