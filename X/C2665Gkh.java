package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Gkh, reason: case insensitive filesystem */
/* loaded from: Gkh.class */
public final class C2665Gkh extends C1rs {
    public 1Iw A00;
    public C2686Gl4 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2665Gkh(1Iw r302, C2686Gl4 c2686Gl4) {
        super(c2686Gl4, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "onClick", "themeColor", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c2686Gl4;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
