package X;

/* loaded from: KO3.class */
public enum KO3 {
    NO_ERROR(0),
    UNKNOWN(1),
    API_DISABLED(2),
    ILLEGAL_ARGUMENT(3),
    ILLEGAL_STATE(4),
    INTERNAL_ERROR(5),
    NETWORK_FAILURE(6),
    UNKNOWN_APP_VERSION(7),
    UNKNOWN_MODULES(8),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILURE(9);

    public final int mReasonId;

    KO3(int i) {
        this.mReasonId = i;
    }
}
