package X;

import android.preference.Preference;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: C6w.class */
public final class C6w {
    public final 1Br A01 = AbG.A0N();
    public final 1Br A00 = 1Bu.A00(84745);

    public final void A00(Preference preference, boolean z) {
        11T.A0F(preference, 0);
        boolean A03 = AbJ.A0J(this.A00).A14(preference).A03(false);
        A01(Boolean.valueOf(A03), Boolean.valueOf(z), preference.getKey());
    }

    public final void A01(Object obj, Object obj2, String str) {
        AbstractC01593ro A07 = AbF.A07(AgN.A00(AbI.A08(this.A01)), "preference", true);
        if (A07.A0B()) {
            A07.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
            A07.A02(obj, "before");
            A07.A02(obj2, "after");
            A07.A0A();
        }
    }
}
