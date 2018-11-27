package org.usfirst.frc.team5507.robot.subsystems;

import org.usfirst.frc.team5507.robot.OI;

public class SwerveDrive {
	
	private WheelDrive backRight;
	private WheelDrive backLeft;
	private WheelDrive frontRight;
	private WheelDrive frontLeft;
	private WheelDrive wheel;
	private static final double TRACKWIDTH = 23.13;
	private static final double WHEELBASE = 28.29;
	private static final double RATIO = Math.sqrt(Math.pow(WHEELBASE, 2) + Math.pow(TRACKWIDTH, 2));
	// Constructors For our Swerve Drive
	public SwerveDrive(WheelDrive backRight, WheelDrive backLeft, WheelDrive frontRight, WheelDrive frontLeft)
	{
		this.backRight = backRight;
		this.backLeft = backLeft;
		this.frontRight = frontRight;
		this.frontLeft = frontLeft;
	}
	public SwerveDrive(WheelDrive wheel)
	{
		this.wheel = wheel;
	}
	
	//Methods for the Swerve Drive
	
	
}
