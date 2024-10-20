package X;

import java.util.BitSet;

/* renamed from: X.Aul, reason: case insensitive filesystem */
/* loaded from: Aul.class */
public final class C1848Aul extends C1rs {
    public 1Iw A00;
    public C1998Ayr A01;
    public final BitSet A02;
    public final String[] A03;

    public C1848Aul(1Iw r302, C1998Ayr c1998Ayr) {
        super(c1998Ayr, r302, 0, 0);
        this.A03 = new String[]{"audioPreferenceValue", "colorScheme", "controller", "documentPreferenceValue", "isMediaDownloadControlsEnabled", "isOpenLinksInAppBrowserEnabled", "isOpenMesseagingLinksInAppBrowserEnabled", "isSaveOnCaptureEnabled", "listener", "photoPreferenceValue", "showEmojiSkinToneOption", "videoPreferenceValue"};
        BitSet A18 = 1BK.A18(12);
        this.A02 = A18;
        this.A01 = c1998Ayr;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 12);
        A0J();
        return this.A01;
    }
}
