package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: Cla.class */
public final class Cla implements DH5 {
    public final /* synthetic */ FHh A00;
    public final /* synthetic */ GJj A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ boolean A03;

    public Cla(FHh fHh, GJj gJj, GJj gJj2, boolean z) {
        this.A00 = fHh;
        this.A03 = z;
        this.A02 = gJj;
        this.A01 = gJj2;
    }

    @Override // X.DH5
    public void BxV() {
        GJj gJj = this.A01;
        FEK.A00(this.A00, new DKM().A0G(), gJj);
    }

    @Override // X.DH5
    public void CQK(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        FHh fHh = this.A00;
        String str = EUl.A00(fHh).A02;
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            if (!this.A03 || !AbF.A1A(A0t).contentEquals(str)) {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0t.A13);
                A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 7zL.A13(A0t));
                String A07 = A0t.A07();
                if (A07 == null) {
                    A07 = "";
                }
                A0u.put("profile_pic_url", A07);
                A0s.add(A0u);
            }
        }
        GJj gJj = this.A02;
        DKM dkm = new DKM();
        dkm.A0J(A0s, 0);
        FEK.A00(fHh, dkm.A0G(), gJj);
    }
}
