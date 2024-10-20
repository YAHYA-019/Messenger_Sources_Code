package X;

import java.util.BitSet;

/* renamed from: X.Atz, reason: case insensitive filesystem */
/* loaded from: Atz.class */
public final class C1826Atz extends C1rs {
    public 1Iw A00;
    public C2020Azh A01;
    public final BitSet A02;
    public final String[] A03;

    public C1826Atz(1Iw r302, C2020Azh c2020Azh) {
        super(c2020Azh, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "fragmentManager", "friendRequestSentListener", "launchContextualProfileHelper", "otherUser", "threadKey", "threadSettingsExperimentSettingsHandler", "threadSummary", "xavFriendingEventsLogger"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = c2020Azh;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A19(this, this.A02, this.A03);
        return this.A01;
    }
}
