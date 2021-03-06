package org.firstinspires.ftc.teamcode.common;

import com.qualcomm.robotcore.hardware.DcMotor;





public class TankDrive implements IDrive {

    private final Robot robot;
    private boolean isReverse;
    private final FtcGamePad driver;

    public TankDrive(Robot robot, FtcGamePad driver)
    {
        this.robot = robot;
        this.driver = driver;
    }


    @Override
    public boolean getIsReverse() {
        return this.isReverse;
    }

    @Override
    public void setIsReverse(boolean value) {
        this.isReverse = value;
    }

    @Override
    public void handle() {
        this.drive(this.driver.getLeftStickY() * -1, this.driver.getRightStickY() * -1);

    }

    public void drive(double left, double right) {
        this.robot.motorFrontLeft.setPower(this.isReverse ? -right : left);
        this.robot.motorFrontRight.setPower(this.isReverse ? -left : right);
    }


    @Override
    public void drive(double ly, double lx, double rx) {

    }

    @Override
    public void stop() {
        this.robot.stop();
    }

    @Override
    public void setMode(DcMotor.RunMode runMode) {

    }

    @Override
    public void driveToPosition(int leftPosition, int rightPosition)
    {

    }
}
