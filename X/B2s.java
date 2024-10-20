package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.accountlogin.AccountLoginActivity;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecPassword;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: B2s.class */
public final class B2s extends B2y {
    public static final String __redex_internal_original_name = "AccountLoginRecPasswordFragment";
    public DE4 A00;
    public final C00i A01 = AbI.A0N();
    public final C00i A02 = new 1HH(this, 85277);
    public final C00i A04 = AbH.A0M();
    public final Bzz A05 = new Bzz(this);
    public final C00i A03 = 1BV.A00(100129);

    public void A1K() {
        super/*X.1pK*/.A1K();
        1BK.A0U(this.A04).markerEnd(725091390, (short) 2);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    @Override // X.B2y
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        BMG bmg = BMG.A2X;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("contact_point", AlJ.A07(this));
        AbF.A0V(this.A01).A0O(bmg, A0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.facebook.mig.scheme.interfaces.MigColorScheme] */
    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        QBL qbl = new QBL(r303, new QLH());
        DEf dEf = ((AlJ) this).A02;
        LightColorScheme A00 = dEf != null ? ((AccountLoginActivity) dEf).A0B : LightColorScheme.A00();
        1LI r0 = qbl.A01;
        ((QLH) r0).A03 = A00;
        BitSet bitSet = qbl.A02;
        bitSet.set(0);
        ((QLH) r0).A06 = ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A09;
        ((QLH) r0).A05 = 4YV.A1U(((FIM) this.A03.get()).A05(EPg.A0f));
        ((QLH) r0).A02 = AlJ.A06();
        bitSet.set(1);
        ((QLH) r0).A00 = c7xz;
        ((QLH) r0).A01 = this.A05;
        String str = ((AccountLoginSegueRecPassword) ((AlJ) this).A01).A00;
        if (str == null) {
            str = "";
        }
        ((QLH) r0).A04 = str;
        C1rs.A00(bitSet, qbl.A03);
        qbl.A0J();
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.B2y
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof DE4) {
            this.A00 = (DE4) context;
        }
    }
}
