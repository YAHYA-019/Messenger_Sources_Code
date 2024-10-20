package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Iel.class */
public final class Iel implements 1HN, 1HO {
    public final int A00;
    public final Object A01;

    public Iel(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        switch (this.A00) {
            case 0:
                ((BJB) this.A01).A1c();
                return;
            case 1:
                Gr2 gr2 = (Gr2) this.A01;
                HbK A00 = Gr2.A00(gr2);
                boolean z = false;
                if (AbL.A1H(gr2.A06) && 1Br.A09(gr2.A08).AZn(HNy.A00, false)) {
                    z = true;
                }
                A00.A00 = z;
                gr2.A0Z(new IZa(A00));
                return;
            default:
                I7Q i7q = (I7Q) this.A01;
                1G2 r0 = I7Q.A05;
                i7q.A00.post(new IuU(i7q));
                return;
        }
    }
}
