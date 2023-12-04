package practice;

public class Practice7_11 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }


}

class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;

    int prevChannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    boolean getIsPowerOn() {
        return this.isPowerOn;
    }

    void setIsPowerOn(boolean onOff) {
        this.isPowerOn = onOff;
    }

    int getChannel() {
        return this.channel;
    }

    void setChannel(int channel) {
        if(getChannel() != 0) {
            prevChannel = getChannel();
        }

        if(!(channel < MIN_CHANNEL || channel > MAX_CHANNEL))
            this.channel = channel;
    }

    int getVolume() {
        return this.volume;
    }

    void setVolume(int volume) {
        this.volume = volume;

    }

    void gotoPrevChannel() {
        setChannel(this.prevChannel);
    }
}

