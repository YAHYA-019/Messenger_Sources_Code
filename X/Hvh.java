package X;

/* loaded from: Hvh.class */
public abstract class Hvh {
    public static final void A00(HDP hdp, JQ9 jq9, String str, String str2, int i) {
        1BK.A1K(jq9, 0, hdp);
        0fH.A0j(str, "logTakePhotoFailed QPL CAPTURE_PHOTO");
        jq9.BZg(hdp, "photo_capture_failed", str, str2, str, null, i);
    }

    public static final void A01(JQ9 jq9, String str, int i) {
        11T.A0F(jq9, 0);
        0fH.A0j(str, "logTakePhotoFinished QPL CAPTURE_PHOTO");
        jq9.BZh("photo_capture_finished", str, null, i);
    }
}
