package org.usfirst.frc.team5990.robot;

import edu.wpi.first.wpilibj.SPI.Port;

public class RobotMap {	
	public static int DRIVE_MOTOR_LEFT_BACK = 3;
	public static int DRIVE_MOTOR_LEFT_FRONT = 2;
	public static int DRIVE_MOTOR_RIGHT_BACK = 1;
	public static int DRIVE_MOTOR_RIGHT_FRONT = 0;
	

	public static final int PARALLELOGRAM_MOTOR1 = 4;
	public static final int PARALLELOGRAM_MOTOR2 = 5;

	public static final int PARALLELOGRAM_SOLENOID1 = 0;
	public static final int PARALLELOGRAM_SOLENOID2 = 1;

  	// Collector ports
	public static int COLLECTOR_ROBOT_TOP = 6;
	public static int COLLECTOR_ROBOT_BOTTOM = 7;
	public static int COLLECTOR_SWITCH = 4;
	public static int COLLECTOR_ENCODER_CHANNEL_A = 1;
	public static int COLLECTOR_ENCODER_CHANNEL_B = 2;

	//Collector flip
	public static double TIMEOUT_FLIP = 0.6;
	public static double POWER_TOP_FLIP = -0.385;
	public static double POWER_BOTTOM_FLIP = -0.485;

	// collector output
	public static double TIMEOUT_OUTPUT = 0.5;
		
	// Rumble
	public static double TIMEOUT_RUMBLE = 1;
	public static double RUMBLE_VALUE = 1;
}
