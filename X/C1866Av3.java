package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Av3, reason: case insensitive filesystem */
/* loaded from: Av3.class */
public final class C1866Av3 extends C1rs {
    public 1Iw A00;
    public QJh A01;
    public final BitSet A02;
    public final String[] A03;

    public C1866Av3(1Iw r302, QJh qJh) {
        super(qJh, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contextualProfileActionsListener", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = qJh;
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
