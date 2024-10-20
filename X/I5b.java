package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: I5b.class */
public final class I5b {
    public float[] A01;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public final HoE A08;
    public final HqN A09;
    public final JL0 A0B;
    public final java.util.Map A0C;
    public final Hi1 A0D;
    public final float[] A0E;
    public boolean A00 = false;
    public int A06 = 0;
    public int A05 = 0;
    public final RectF A07 = GOq.A0M();
    public final I2N A0A = new I2N();

    public I5b(HoE hoE, Hi1 hi1, JL0 jl0, H3X h3x) {
        this.A0B = jl0;
        this.A08 = hoE;
        HqN hqN = new HqN(h3x);
        this.A09 = hqN;
        this.A0D = hi1;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A0C = concurrentHashMap;
        AnonymousClass001.A1A(hqN, concurrentHashMap, 1);
        float[] A1a = GOn.A1a();
        this.A0E = A1a;
        Matrix.setIdentityM(A1a, 0);
    }

    public static void A00(I5b i5b, Hs9 hs9, IDj iDj, JMy jMy) {
        int i;
        int i2;
        if (jMy.Ar1() == 0S2.A00) {
            I5I i5i = i5b.A0A.A04;
            i5b.A04 = i5i.A03;
            synchronized (hs9) {
                i = hs9.A02;
            }
            synchronized (hs9) {
                i2 = hs9.A00;
            }
            float[] A08 = iDj.A08(H9r.A02, i, i2, 0, false);
            i5b.A02 = A08;
            i5i.A03 = A08;
        }
    }

    public ArrayList A01() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A1B = 1BK.A1B(this.A0C);
        while (A1B.hasNext()) {
            HqN hqN = (HqN) A1B.next();
            if (hqN.A00()) {
                JMy jMy = hqN.A04;
                if (!(jMy instanceof H3X)) {
                    JJA jja = hqN.A01;
                    if (jja != null) {
                        hqN.A00.A00 = jja.Auu();
                    }
                    HPJ hpj = hqN.A00;
                    jMy.isEnabled();
                    A0s.add(hpj);
                }
            }
        }
        return A0s;
    }

    public void A02() {
        if (this.A00) {
            Iterator A1B = 1BK.A1B(this.A0C);
            while (A1B.hasNext()) {
                HqN hqN = (HqN) A1B.next();
                hqN.A04.CPG();
                hqN.A03 = false;
            }
        }
        this.A00 = false;
        this.A06 = 0;
        this.A05 = 0;
    }

    public void A03(int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        Iterator A1B = 1BK.A1B(this.A0C);
        while (A1B.hasNext()) {
            ((HqN) A1B.next()).A04.CPA(i, i2);
        }
    }

    public void A04(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HqN hqN = (HqN) it.next();
            java.util.Map map = this.A0C;
            Number A0o = 1BK.A0o(hqN, map);
            if (A0o == null) {
                A0o = 4YU.A0k();
                Hi1 hi1 = this.A0D;
                JMy jMy = hqN.A04;
                jMy.Clo(new IiF(hi1, hqN));
                if (this.A00) {
                    jMy.CPE(this.A0B);
                    hqN.A03 = true;
                    int i2 = this.A05;
                    if (i2 > 0 && (i = this.A06) > 0) {
                        jMy.CPA(i, i2);
                        jMy.CPF(this.A07);
                    }
                }
            }
            1BK.A1P(hqN, map, A0o.intValue() + 1);
        }
    }

    public void A05(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HqN hqN = (HqN) it.next();
            java.util.Map map = this.A0C;
            Number A0o = 1BK.A0o(hqN, map);
            if (A0o == null) {
                android.util.Log.w("EffectManager", "Effect unregistered that wasn't previously registered");
            } else {
                int intValue = A0o.intValue() - 1;
                Integer valueOf = Integer.valueOf(intValue);
                if (intValue <= 0) {
                    map.remove(hqN);
                    JMy jMy = hqN.A04;
                    jMy.Clo(null);
                    if (this.A00) {
                        jMy.CPG();
                        hqN.A03 = false;
                    }
                } else {
                    map.put(hqN, valueOf);
                }
            }
        }
    }
}
