import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public enum IOColor {
	RESET("\u001B[0m"),
	BLACK("\u001B[30m"),
	RED("\u001B[31m"),
	GREEN("\u001B[32m"),
	YELLOW("\u001B[33m"),
	BLUE("\u001B[34m"),
	PURPLE("\u001B[35m"),
	CYAN("\u001B[36m"),
	WHITE("\u001B[37m"),
	BLACK_BG("\u001B[30m"),
	RED_BG("\u001B[31m"),
	GREEN_BG("\u001B[32m"),
	YELLOW_BG("\u001B[33m"),
	BLUE_BG("\u001B[34m"),
	PURPLE_BG("\u001B[35m"),
	CYAN_BG("\u001B[36m"),
	WHITE_BG("\u001B[37m");

	public final String label;

	private IOColor(String label) {
		this.label = label;
	}

	private static final List<IOColor> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static String random(int min, int max) {
		if(max > SIZE) max = SIZE;
		return VALUES.get(RANDOM.nextInt(max)).label;
	}
}