package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Ato, reason: case insensitive filesystem */
/* loaded from: Ato.class */
public final class C1815Ato extends C1rs {
    public 1Iw A00;
    public QIr A01;
    public final BitSet A02;
    public final String[] A03;

    public C1815Ato(1Iw r302, QIr qIr) {
        super(qIr, r302, 0, 0);
        this.A03 = new String[]{"backButtonClickListener", "colorScheme", PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, "showFullTitlebar"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = qIr;
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
