//Left or right stating position to baseline

package frc.robot;

import frc.robot.DriveAuto.DriveSpeed;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/*
 * This auto program just drives forward across
 * the baseline.
 */

public class AutoBaseLine extends AutoBaseClass {
	private char myRobotPosition;
	
	public AutoBaseLine(char robotPosition) {
		super(robotPosition);
		myRobotPosition = robotPosition;
	}

	public void tick() {
		
		if (isRunning()) {

			SmartDashboard.putNumber("Auto Step", getCurrentStep());

			switch (getCurrentStep()) {
			case 0:
				setTimerAndAdvanceStep(6000);
				CubeClaw.setArmTravelPosition();
				if (myRobotPosition == 'C') {
					driveInches(95, 24, .5);
				} else
				{
					driveInches(90, 0, .5);
				}
				break;
			case 2:
				stop();
				break;
			}	
		}
	}
}