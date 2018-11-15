package org.usfirst.frc.team5507.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class WheelDrive {

	private TalonSRX angleMotor;
	private TalonSRX speedMotor;
	
	public WheelDrive(int angleMotor, int speedMotor) 
	{
		this.angleMotor = new TalonSRX(angleMotor);
		this.speedMotor = new TalonSRX(speedMotor);
	}
}
