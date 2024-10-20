package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* loaded from: Dtq.class */
public final class Dtq extends C1rs {
    public 1Iw A00;
    public DxB A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtq(1Iw r302, DxB dxB) {
        super(dxB, r302, 0, 0);
        this.A03 = new String[]{"onButtonClickListener", "textRes", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = dxB;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
