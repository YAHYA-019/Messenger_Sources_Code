package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Fkg.class */
public final class Fkg implements GKF {
    public final int A00;
    public final int A01;
    public final FyG A02;
    public final Integer A03;
    public final Object A04;
    public final String A05;

    public Fkg(FyG fyG, Object obj, int i, int i2) {
        this.A03 = 0S2.A01;
        this.A05 = "";
        this.A01 = i;
        this.A02 = fyG;
        this.A00 = i2;
        this.A04 = obj;
    }

    public Fkg(FyG fyG, Object obj, String str, int i) {
        this.A03 = 0S2.A00;
        this.A05 = str;
        this.A01 = 0;
        this.A02 = fyG;
        this.A00 = i;
        this.A04 = obj;
    }

    public static List A00(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty() && (1BK.A0r(list) instanceof GL7)) {
                return list;
            }
        }
        return Collections.emptyList();
    }

    public GL7 A8c(GL7 gl7) {
        FyG fyG = this.A02;
        int i = this.A00;
        Object obj = this.A04;
        FwU ACy = gl7.ACy();
        Object BI5 = gl7.BI5(i);
        ACy.put(i, obj);
        Iterator it = A00(BI5).iterator();
        while (it.hasNext()) {
            FGI.A02(DKC.A0m(it), fyG);
        }
        if (!A00(obj).isEmpty() && !FGa.A00(gl7.BDE(), i)) {
            FGI.A01(fyG, A00(obj));
        }
        return ACy;
    }

    public int BEP() {
        return this.A01;
    }

    public String BES() {
        return this.A05;
    }

    public Integer BEX() {
        return this.A03;
    }

    public void Cmu(GL7 gl7) {
    }

    public void CsI(int i) {
    }
}
