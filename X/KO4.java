package X;

/* loaded from: KO4.class */
public enum KO4 {
    UNKNOWN(0),
    INSTALLED(1),
    FAILED(2),
    CANCELED(3),
    PENDING(4),
    DOWNLOADING(5),
    DOWNLOADED(6),
    INSTALLING(7),
    PENDING_USER_ACTION(8);

    public final int mInstallStateId;

    KO4(int i) {
        this.mInstallStateId = i;
    }
}
