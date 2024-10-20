package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Auy, reason: case insensitive filesystem */
/* loaded from: Auy.class */
public final class C1861Auy extends C1rs {
    public 1Iw A00;
    public B0x A01;
    public final BitSet A02;
    public final String[] A03;

    public C1861Auy(1Iw r302, B0x b0x) {
        super(b0x, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contextualProfileActionsListener", "extraData", "fbUserSession", "folderName", "fragmentManager", "lifecycleOwner", "profileBundle", "threadCapabilities", "threadSummary", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = b0x;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A1A(this, this.A02, this.A03);
        return this.A01;
    }
}
