package X;

/* renamed from: X.48g, reason: invalid class name */
/* loaded from: 48g.class */
public enum C48g {
    VIDEO_ATTACHMENT(1, "FILE_ATTACHMENT"),
    QUICKCAM(2, "RECORDED_VIDEO"),
    VIDEO_STICKER(4, "RECORDED_STICKER"),
    VIDEO_MAIL(5, "VIDEO_MAIL");

    public final String apiStringValue;
    public final int intValue;

    C48g(int i, String str) {
        this.intValue = i;
        this.apiStringValue = str;
    }
}
