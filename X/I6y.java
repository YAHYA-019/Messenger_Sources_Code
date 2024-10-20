package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* loaded from: I6y.class */
public final class I6y {
    public static final ImmutableSet A00;
    public static final ImmutableList A02;
    public static final ImmutableSet A04;
    public static final ImmutableSet A05;
    public static final ImmutableSet A01 = ImmutableSet.A02("OMX.ittiam.video.encoder.avc", "OMX.Exynos.avc.enc");
    public static final ImmutableMap A03 = AbG.A10(1BK.A0c(), "OMX.qcom.video.encoder.avc", 21);

    static {
        1Hz r0 = new 1Hz();
        r0.A05("OMX.qcom.video.decoder.avc");
        A05 = r0.A07();
        A00 = ImmutableSet.A02("OMX.ittiam.video.decoder.avc", "OMX.Exynos.AVC.Decoder");
        A04 = ImmutableSet.A04("GT-S6812i", "GT-I8552", "GT-I8552B", "GT-I8262B");
        A02 = ImmutableList.of((Object) "OMX.SEC.AVC.Encoder", (Object) "OMX.SEC.avc.enc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r301.equals("video/x-vnd.on2.vp8") != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(java.lang.String r301) {
        /*
            java.lang.String r0 = "video/avc"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L43
            java.lang.String r0 = "video/hevc"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L43
            java.lang.String r0 = "video/3gpp"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L43
            java.lang.String r0 = "video/mp4v-es"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L43
            r0 = r301
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L45
        L43:
            r0 = 1
            r303 = r0
        L45:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6y.A00(java.lang.String):boolean");
    }
}
