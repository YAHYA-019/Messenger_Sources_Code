package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Aur, reason: case insensitive filesystem */
/* loaded from: Aur.class */
public final class C1854Aur extends C1rs {
    public 1Iw A00;
    public C2019Azg A01;
    public final BitSet A02;
    public final String[] A03;

    public C1854Aur(1Iw r302, C2019Azg c2019Azg) {
        super(c2019Azg, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contentViewManager", "contextualProfileActionsListener", "extraData", "fbUserSession", "folderName", "fragmentManager", "friendRequestSentListener", "lifecycleOwner", "profileBundle", "profileId", "shouldDisplayContextualProfilePhoto", "shouldDisplayNickname", "shouldDisplayVerifiedBadge", "threadCapabilities", "threadSummary", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        BitSet A18 = 1BK.A18(17);
        this.A02 = A18;
        this.A01 = c2019Azg;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 17);
        A0J();
        return this.A01;
    }
}
