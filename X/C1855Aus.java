package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Aus, reason: case insensitive filesystem */
/* loaded from: Aus.class */
public final class C1855Aus extends C1rs {
    public 1Iw A00;
    public B1C A01;
    public final BitSet A02;
    public final String[] A03;

    public C1855Aus(1Iw r302, B1C b1c) {
        super(b1c, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contextualProfileActionsListener", "entryPoint", "fbUserSession", "folderName", "profileId", "threadSummary", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = b1c;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}
