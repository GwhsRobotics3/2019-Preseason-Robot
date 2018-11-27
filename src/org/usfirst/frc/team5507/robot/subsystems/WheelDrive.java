package org.usfirst.frc.team5507.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class WheelDrive {

	private TalonSRX angleMotor;
	private TalonSRX speedMotor;
	
	public WheelDrive(int angleMotorPort, int speedMotorPort) 
	{
		this.angleMotor = new TalonSRX(angleMotorPort); 
		this.speedMotor = new TalonSRX(speedMotorPort);
	}
	
	public void drive(double speed, double direction)
	{
		this.speedMotor.set(ControlMode.Current, speed);
		this.angleMotor.set(ControlMode.Current, direction);
	}
}
