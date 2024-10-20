package X;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.fbpay.auth.models.PttPayload;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: Fv0.class */
public final class Fv0 implements GIx {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public Fv0(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj;
    }

    @Override // X.GIx
    public void BkH(Throwable th) {
        int i = this.A00;
        DSM dsm = (DSM) this.A01;
        (i != 0 ? dsm.A03 : dsm.A02).postValue(FJC.A06(th));
    }

    @Override // X.GIx
    public void BkI(RMC rmc) {
        if (this.A00 != 0) {
            Bundle bundle = rmc.A00;
            if (bundle == null || !bundle.getBoolean("AUTH_FLOW_UTIL_HAVE_ASKED_FOR_BIO_SETUP", false)) {
                ((DSM) this.A01).A02((Bundle) this.A02, rmc.A01, this.A03, this.A04);
                return;
            } else {
                DSM dsm = (DSM) this.A01;
                KXx.A00(dsm.A01, dsm.A03, FZB.A00(this, 39));
                return;
            }
        }
        GKt gKt = C06014fk.A0B().A02;
        Bundle bundle2 = ((Ek0) this.A02).A01;
        gKt.BZT("fbpay_remove_biometric", FAt.A02(bundle2));
        DSM dsm2 = (DSM) this.A01;
        F8v f8v = dsm2.A06;
        String str = this.A04;
        String str2 = this.A03;
        FHJ fhj = dsm2.A07;
        PttPayload deleteBio = PttPayload.deleteBio(str2);
        FGo fGo = rmc.A01;
        fGo.getClass();
        FGo[] fGoArr = {fGo};
        HashSet A0v = AnonymousClass001.A0v();
        Collections.addAll(A0v, fGoArr);
        String string = bundle2.getString("PAYMENT_ACCOUNT_ID");
        java.util.Map A02 = FAt.A02(bundle2);
        C3o5.A0k(deleteBio, 2, A02);
        FEq fEq = new FEq(F2P.A00(new FvE(fhj, 1), A0v), deleteBio, "REVOKE_AUTH_TICKET", string, (String) null, (String) null, (String) null, (String) null, A02, A0v);
        F4T f4t = f8v.A02;
        RkZ rkZ = new RkZ(f8v, fEq, str, str2);
        F60 f60 = f8v.A01;
        Qmd A01 = F2R.A01(rkZ, f60, f4t, fEq);
        FH8.A02(A01);
        LiveData liveData = ((FH8) A01).A03;
        F8v.A00(liveData, f60);
        dsm2.A02.addSource(liveData, new FZ9(liveData, this, 4));
    }
}
