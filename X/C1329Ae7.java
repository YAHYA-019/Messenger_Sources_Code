package X;

import java.util.BitSet;

/* renamed from: X.Ae7, reason: case insensitive filesystem */
/* loaded from: Ae7.class */
public final class C1329Ae7 extends C1rs {
    public 1Iw A00;
    public C1328Ae6 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1329Ae7(1Iw r302, C1328Ae6 c1328Ae6) {
        super(c1328Ae6, r302, 0, 0);
        this.A03 = new String[]{"adId", "colorScheme", "fbUserSession", "fragmentManager", "iceBreakerItems", "instructionText", "isVertical", "messageId", "messageListCoreBindings", "privacyTextWithLink", "quickReplyLoggingType", "threadKey"};
        BitSet A18 = 1BK.A18(12);
        this.A02 = A18;
        this.A01 = c1328Ae6;
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
