package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.facebook.user.model.User;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: F9i.class */
public final class F9i {
    public C11474wl A00;
    public final C15h A01;

    public F9i(C15h c15h) {
        11T.A0F(c15h, 1);
        this.A01 = c15h;
    }

    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, X.Qxo] */
    public static final DSB A00(F9i f9i, String str, String str2, String str3) {
        L0H l0h = new L0H(str, str2);
        C15h c15h = f9i.A01;
        Object obj = c15h.get();
        11T.A0A(obj);
        EpP epP = ((Ep7) obj).A01;
        11T.A0A(Collections.singleton(EnumC3477Mev.CREDIT_CARD));
        RTz rTz = new RTz(EYK.A00(new FvH(epP, (String) null, (String) null), GBJ.A00), new GBn(l0h, 17));
        FvL fvL = ((Ep7) c15h.get()).A02;
        Qme A03 = fvL.A03(str3);
        8Ls r0 = fvL.A00;
        SecurityProviderEphemeral.A03.A00(new GBp(A03, r0, 5), true);
        LinkedHashMap A1C = 1BK.A1C();
        A1C.put("cred_id", str);
        A1C.put("device_key", A03.A00());
        F9p f9p = (F9p) r0.A00;
        11T.A0I(f9p, "null cannot be cast to non-null type com.fbpay.w3c.security.SecurityProviderEphemeral");
        A1C.put("result_key", f9p.A00());
        String str4 = r0.A01;
        DKC.A1U(str4);
        A1C.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, str4);
        A1C.put("csc", str2);
        HashSet A0v = AnonymousClass001.A0v();
        A0v.add("csc");
        RPq rPq = FEq.A0A;
        FHJ fhj = C06014fk.A0C().A01;
        ?? obj2 = new Object();
        ((Qxo) obj2).A00 = A1C;
        ((Qxo) obj2).A01 = A0v;
        FEq A00 = rPq.A00(fhj, (Object) obj2, "SEND_E2EE_DATA", (String) null, (String) null, (String) null, 04R.A0G(), (Set) null);
        F4T A0F = C06014fk.A0F();
        11T.A0A(A0F);
        F60 A0C = C06014fk.A0C();
        11T.A0A(A0C);
        S4s s4s = new S4s(fvL.A05, AbJ.A0t(((C81n) 1Br.A0B(fvL.A01)).A00, new FvS(fvL, str3, str), FH8.A00(F2R.A00(A0C, A0F, A00))));
        s4s.A6b(new FvJ(fvL, 1));
        RTz[] rTzArr = {rTz, new RTz(s4s, new GBn(l0h, 18))};
        FvG fvG = new FvG();
        int i = 0;
        do {
            RTz rTz2 = rTzArr[i];
            rTz2.A00.A6b(new FvK(rTz2, fvG, 0));
            i++;
        } while (i < 2);
        return new DSB(fvG);
    }

    public final LiveData A01() {
        String str;
        Ep7 ep7 = (Ep7) this.A01.get();
        C11474wl c11474wl = this.A00;
        String str2 = null;
        if (c11474wl != null) {
            C11394wd c11394wd = c11474wl.A00.A08;
            str = c11394wd.A05;
            str2 = c11394wd.A04;
        } else {
            str = null;
        }
        EpP epP = ep7.A01;
        11T.A0A(Collections.singleton(EnumC3477Mev.CREDIT_CARD));
        return Transformations.map(new DSB(EYK.A00(new FvH(epP, str, str2), GBJ.A00)), GBK.A00);
    }

    public final String A02() {
        User Auc = ((1Ex) 1Br.A0B(((Ep7) this.A01.get()).A02.A02)).Auc();
        return new Qme(Auc != null ? Auc.A13 : null).A00();
    }

    public final void A03(String str, String str2, String str3) {
        new DSB(((Ep7) this.A01.get()).A02.AC7(str, str2, str3));
    }
}
