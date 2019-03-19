import org.junit.Test;

import static org.junit.Assert.*;

public class RemoteControlTest {
    @Test
    public void shouldTurnOnTheLight() {
        RemoteControl rc = new RemoteControl();
        Light light = new Light();

        LightOnCommand lonc = new LightOnCommand(light);
        LightOffCommand loffc = new LightOffCommand(light);

        rc.setCommand("light", lonc, loffc);

        assertEquals("Light is on", rc.turnOn("light"));
    }

    @Test
    public void shouldTurnOffTheTv() {
        RemoteControl rc = new RemoteControl();
        TV tv = new TV();

        TVOnCommand tonc = new TVOnCommand(tv);
        TVOffCommand toffc = new TVOffCommand(tv);

        rc.setCommand("tv", tonc, toffc);

        assertEquals("TV is off", rc.turnOff("tv"));
    }
}
