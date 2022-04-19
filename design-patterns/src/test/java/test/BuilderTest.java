package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderTest {

    @Test
    @DisplayName("can create a hi-quality robot")
    void canCreateAHiQualityRobot() {
        RobotBuilder builder = new HiQualityRobotBuilder();
        assembleFullRobot(builder);
        Robot result = builder.build();

        assertEquals(new Robot("hi-quality arms", "hi-quality legs", "hi-quality chest"), result);
    }

    void assembleFullRobot(RobotBuilder builder) {
        builder.addChest();
        builder.addArms();
        builder.addLegs();
    }

}

record Robot(String arms, String legs, String chest) {
}

interface RobotBuilder {

    Robot build();

    void addChest();

    void addArms();

    void addLegs();

}

class HiQualityRobotBuilder implements RobotBuilder {

    private String chest;
    private String arms;
    private String legs;

    @Override
    public Robot build() {
        return new Robot(arms, legs, chest);
    }

    @Override
    public void addChest() {
        chest = "hi-quality chest";
    }

    @Override
    public void addArms() {
        arms = "hi-quality arms";
    }

    @Override
    public void addLegs() {
        legs = "hi-quality legs";
    }
}



