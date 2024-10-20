package X;

/* renamed from: X.98M, reason: invalid class name */
/* loaded from: 98M.class */
public enum C98M implements C07n {
    XMA_CTA(0),
    CAMERA(1),
    COMPOSER(2),
    MEDIA_PICKER(3),
    VIEWER(4),
    THREAD_QP(5),
    POST_CAPTURE(6),
    POST_SEND(7),
    UNKNOWN(999);

    public final long mValue;

    C98M(long j) {
        this.mValue = j;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
