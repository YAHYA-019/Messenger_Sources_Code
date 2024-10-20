package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Av2, reason: case insensitive filesystem */
/* loaded from: Av2.class */
public final class C1865Av2 extends C1rs {
    public 1Iw A00;
    public AzO A01;
    public final BitSet A02;
    public final String[] A03;

    public C1865Av2(1Iw r302, AzO azO) {
        super(azO, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contextualProfileActionsListener", "entryPoint", "extraData", "fbUserSession", "folderName", "fragmentManager", "lifecycleOwner", "profileBundle", "profileId", "queryModel", "threadCapabilities", "threadSummary", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        BitSet A18 = 1BK.A18(14);
        this.A02 = A18;
        this.A01 = azO;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        AbM.A1L(this, this.A02, this.A03);
        return this.A01;
    }
}
