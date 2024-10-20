package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Atx, reason: case insensitive filesystem */
/* loaded from: Atx.class */
public final class C1824Atx extends C1rs {
    public 1Iw A00;
    public C2017Aze A01;
    public final BitSet A02;
    public final String[] A03;

    public C1824Atx(1Iw r302, C2017Aze c2017Aze) {
        super(c2017Aze, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "extraData", "fbUserSession", "fragmentManager", "lifecycleOwner", "profileBundle", "upListener", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = c2017Aze;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}
