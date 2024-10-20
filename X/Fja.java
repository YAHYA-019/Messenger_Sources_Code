package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: Fja.class */
public final class Fja implements DH5 {
    public final /* synthetic */ FHh A00;
    public final /* synthetic */ GJj A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ boolean A03;

    public Fja(FHh fHh, GJj gJj, GJj gJj2, boolean z) {
        this.A00 = fHh;
        this.A03 = z;
        this.A02 = gJj;
        this.A01 = gJj2;
    }

    @Override // X.DH5
    public void BxV() {
        GJj gJj = this.A01;
        FEK.A00(this.A00, DKM.A04(), gJj);
    }

    @Override // X.DH5
    public void CQK(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        FHh fHh = this.A00;
        String str = EUl.A00(fHh).A02;
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            if (this.A03) {
                String str2 = user.A13;
                11T.A0A(str2);
                if (str2.contentEquals(str)) {
                }
            }
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, user.A13);
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, user.A0X.A00());
            String A07 = user.A07();
            if (A07 == null) {
                A07 = "";
            }
            A0u.put("profile_pic_url", A07);
            A0s.add(A0u);
        }
        DKM.A0F(fHh, DKM.A00(), this.A02, A0s, 0);
    }
}
