package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.Set;

/* loaded from: I99.class */
public final class I99 {
    public int A00;
    public int A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final HFY A06;
    public final HFa A07;
    public final Ht3 A08;
    public final Set A09;
    public final 1De A0A;

    public I99(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0A = r303;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 99476);
        this.A03 = 1Lm.A03(fbUserSession, r0, 115519);
        this.A05 = 1Lm.A03(fbUserSession, r0, 114856);
        this.A09 = GOn.A1J();
        this.A08 = new Gq8(this, 3);
        this.A06 = new Gps(this, 2);
        this.A07 = new Gq7(this, 1);
    }

    public static void A00(1Br r301) {
        C00i c00i = r301.A00;
        if (((I99) c00i.get()).A02) {
            ((I99) c00i.get()).A02();
        }
    }

    public static final void A01(I99 i99) {
        boolean z = true;
        if (GOq.A0b(i99.A05).A02 != 3 || ((!GOp.A0V(i99.A03).A09 && !GOp.A0Z(i99.A04).A00) || GOp.A0Z(i99.A04).A01)) {
            z = false;
        }
        if (i99.A02 != z) {
            i99.A02 = z;
            Iterator it = i99.A09.iterator();
            while (it.hasNext()) {
                ((JIf) it.next()).CCZ();
            }
        }
    }

    public void A02() {
        for (Object obj : this.A09) {
            if (obj instanceof Gpp) {
                Gpp gpp = (Gpp) obj;
                if (3 - gpp.A00 == 0) {
                    ((Gr4) gpp.A01).A0d();
                }
            }
        }
    }

    public void A03(JIf jIf) {
        11T.A0F(jIf, 0);
        Set set = this.A09;
        set.add(jIf);
        if (set.size() == 1) {
            GOp.A0a(this.A05).A62(this.A08);
            GOp.A0V(this.A03).A06(this.A06);
            GOp.A0Z(this.A04).A01(this.A07);
            A01(this);
        }
    }

    public void A04(JIf jIf) {
        11T.A0F(jIf, 0);
        if (GOo.A1Y(jIf, this.A09)) {
            GOp.A0a(this.A05).CeX(this.A08);
            GOp.A0V(this.A03).A07(this.A06);
            GOp.A0Z(this.A04).A02(this.A07);
            A01(this);
        }
    }
}
