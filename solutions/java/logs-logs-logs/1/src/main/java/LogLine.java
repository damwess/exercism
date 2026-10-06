public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        switch (this.logLine.split(":")[0]) {
            case "[TRC]":
                return LogLevel.TRACE;
            case "[DBG]":
                return LogLevel.DEBUG;
            case "[INF]":
                return LogLevel.INFO;
            case "[WRN]":
                return LogLevel.WARNING;
            case "[ERR]":
                return LogLevel.ERROR;
            case "[FTL]":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        String logMessage = this.logLine.split(":")[1].strip();
        String logLevel = this.logLine.split(":")[0].strip();

        switch (logLevel) {
            case "[TRC]":
                return String.format(
                    "%s:%s",
                    LogLevel.TRACE.getNumberLevel(),
                    logMessage
                );
            case "[DBG]":
                return String.format(
                    "%d:%s",
                    LogLevel.DEBUG.getNumberLevel(),
                    logMessage
                );
            case "[INF]":
                return String.format(
                    "%d:%s",
                    LogLevel.INFO.getNumberLevel(),
                    logMessage
                );
            case "[WRN]":
                return String.format(
                    "%d:%s",
                    LogLevel.WARNING.getNumberLevel(),
                    logMessage
                );
            case "[ERR]":
                return String.format(
                    "%d:%s",
                    LogLevel.ERROR.getNumberLevel(),
                    logMessage
                );
            case "[FTL]":
                return String.format(
                    "%d:%s",
                    LogLevel.FATAL.getNumberLevel(),
                    logMessage
                );
            default:
                return String.format(
                    "%d:%s",
                    LogLevel.UNKNOWN.getNumberLevel(),
                    logMessage
                );
        }
    }
}
