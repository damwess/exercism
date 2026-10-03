import java.util.regex.Pattern;

public class LogLevels {

    static Pattern levelPattern = Pattern.compile(
        "\\[INFO\\]:|\\[WARNING\\]:|\\[ERROR\\]:"
    );
    static Pattern bracketsPattern = Pattern.compile("[\\[|\\]]");

    public static String message(String logLine) {
        return logLine.replaceAll(levelPattern.pattern(), "").strip();
    }

    public static String logLevel(String logLine) {
        return logLine
            .split(": ")[0]
            .replaceAll(bracketsPattern.pattern(), "")
            .toLowerCase()
            .strip();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
