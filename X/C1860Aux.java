package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Aux, reason: case insensitive filesystem */
/* loaded from: _Aux.class */
public final class C1860Aux extends C1rs {
    public 1Iw A00;
    public C8nx A01;
    public final BitSet A02;
    public final String[] A03;

    public C1860Aux(1Iw r302, C8nx c8nx) {
        super(c8nx, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contextualProfileActionsListener", "coverPhotoUri", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "profileId", "profilePhotoUri"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = c8nx;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
