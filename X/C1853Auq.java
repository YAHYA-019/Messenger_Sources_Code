package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* renamed from: X.Auq, reason: case insensitive filesystem */
/* loaded from: Auq.class */
public final class C1853Auq extends C1rs {
    public 1Iw A00;
    public C8mk A01;
    public final BitSet A02;
    public final String[] A03;

    public C1853Auq(1Iw r302, C8mk c8mk) {
        super(c8mk, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "contextualProfileActionsListener", "coverPhotoUri", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "profileId", "profilePhotoUri"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = c8mk;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}