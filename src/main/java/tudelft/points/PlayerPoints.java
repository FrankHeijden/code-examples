package tudelft.points;

public class PlayerPoints {

	public int totalPoints(int currentPoints, int remainingLives) {
		if(currentPoints < 50)
			return currentPoints+50;

		return remainingLives < 3 ? currentPoints+30 : currentPoints*3;
	}
}
