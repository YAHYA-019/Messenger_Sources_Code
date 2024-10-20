package X;

/* renamed from: X.537, reason: invalid class name */
/* loaded from: 537.class */
public enum AnonymousClass537 {
    ONE_SEC(1000, "1_sec"),
    ONE_DAY(86400000, "1_day"),
    TWO_DAYS(172800000, "2_days"),
    THREE_DAYS(259200000, "3_days"),
    SEVEN_DAYS(604800000, "7_days");

    public final String mFileDirSuffix;
    public final long mLengthMs;

    AnonymousClass537(long j, String str) {
        this.mLengthMs = j;
        this.mFileDirSuffix = str;
    }
}
