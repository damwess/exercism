public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int numberLevel;

    LogLevel(int numberLevel) {
        this.numberLevel = numberLevel;
    }

    public int getNumberLevel() {
        return this.numberLevel;
    }
}
