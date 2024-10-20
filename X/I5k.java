package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.Set;

/* loaded from: I5k.class */
public final class I5k {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public D19 A06;
    public Integer A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final Set A0D;
    public final 1De A0E;

    public I5k(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0E = r303;
        this.A0D = GOn.A1J();
        this.A0B = 1Bq.A00(84489);
        this.A0C = 7zL.A0S(fbUserSession, r303, 33088);
        A00(this);
    }

    public static final void A00(I5k i5k) {
        i5k.A0A = false;
        i5k.A05 = 0L;
        i5k.A00 = 0;
        i5k.A09 = null;
        i5k.A07 = 0S2.A0C;
        i5k.A06 = null;
        i5k.A08 = "";
        i5k.A03 = 0;
        i5k.A01 = 0;
        i5k.A02 = 0;
        i5k.A04 = 0;
    }

    public void A01(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            Iterator it = this.A0D.iterator();
            while (it.hasNext()) {
                ((HG1) it.next()).A00();
            }
            GOp.A0O(this.A0C).A04(HAp.A0B);
        }
    }

    public void A02(D19 d19) {
        if (11T.A0O(d19, this.A06)) {
            return;
        }
        this.A06 = d19;
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next();
        }
        GOp.A0O(this.A0C).A04(HAp.A0B);
    }

    public void A03(HG1 hg1) {
        11T.A0F(hg1, 0);
        this.A0D.add(hg1);
    }

    public void A04(HG1 hg1) {
        11T.A0F(hg1, 0);
        this.A0D.remove(hg1);
    }

    public void A05(Integer num) {
        Integer num2 = this.A07;
        if (num2 == null) {
            11T.A0L("_optInFlowProgress");
            throw 0Q8.createAndThrow();
        }
        if (num2 != num) {
            this.A07 = num;
            Iterator it = this.A0D.iterator();
            while (it.hasNext()) {
                ((HG1) it.next()).A01();
            }
            GOp.A0O(this.A0C).A04(HAp.A0B);
        }
    }

    public /* synthetic */ void A06(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            if (z) {
                this.A05 = 1Br.A01(this.A0B);
            }
            Iterator it = this.A0D.iterator();
            while (it.hasNext()) {
                ((HG1) it.next()).A02();
            }
            GOp.A0O(this.A0C).A04(HAp.A0B);
        }
    }
}
