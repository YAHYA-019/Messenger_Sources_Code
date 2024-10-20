package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* loaded from: Ds7.class */
public final class Ds7 extends C1rs {
    public Dx0 A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Ds7(Dx0 dx0, 1Iw r303) {
        super(dx0, r303, 0, 0);
        this.A03 = new String[]{"component", PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A00 = dx0;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A00;
    }
}
