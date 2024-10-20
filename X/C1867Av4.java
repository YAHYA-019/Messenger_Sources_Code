package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Av4, reason: case insensitive filesystem */
/* loaded from: Av4.class */
public final class C1867Av4 extends C1rs {
    public 1Iw A00;
    public B0C A01;
    public final BitSet A02;
    public final String[] A03;

    public C1867Av4(1Iw r302, B0C b0c) {
        super(b0c, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contextualProfileActionsListener", "profileId", "queryModel", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = b0c;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
