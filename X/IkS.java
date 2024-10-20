package X;

/* loaded from: IkS.class */
public final class IkS implements JMJ {
    public final /* synthetic */ IE2 A00;

    public IkS(IE2 ie2) {
        this.A00 = ie2;
    }

    public /* bridge */ /* synthetic */ void Bn7(Object obj) {
        11T.A0F(obj, 0);
        IE2 ie2 = this.A00;
        synchronized (ie2) {
            if (ie2.A04 == 0S2.A01) {
                ie2.A04 = 0S2.A0C;
                C7rO c7rO = ie2.A01;
                if (c7rO != null) {
                    ie2.A06.A03(c7rO);
                    ie2.A01 = null;
                }
                ie2.A08.Bn7(obj);
            }
        }
    }

    public /* bridge */ /* synthetic */ void Bxd(Object obj) {
        Exception exc = (Exception) obj;
        11T.A0F(exc, 0);
        IE2 ie2 = this.A00;
        synchronized (ie2) {
            if (ie2.A04 == 0S2.A01) {
                C7rO c7rO = ie2.A01;
                if (c7rO != null) {
                    ie2.A06.A03(c7rO);
                    ie2.A01 = null;
                }
                IE2.A03(ie2, exc);
            }
        }
    }

    public void CEI(float f) {
        IE2 ie2 = this.A00;
        synchronized (ie2) {
            if (ie2.A04 == 0S2.A01) {
                JMJ jmj = ie2.A08;
                if (f > 0.99f) {
                    f = 0.99f;
                }
                jmj.CEI(f);
            }
        }
    }

    public /* synthetic */ void CSx(double d) {
    }

    public void onStart() {
        IE2 ie2 = this.A00;
        synchronized (ie2) {
            ie2.A04 = 0S2.A01;
            ie2.A08.onStart();
            IE2.A02(ie2);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Rac rac = (Rac) obj;
        11T.A0F(rac, 0);
        IE2 ie2 = this.A00;
        synchronized (ie2) {
            ie2.A03 = rac;
            if (ie2.A0B.size() == ie2.A0A.size() && ie2.A03 != null) {
                IE2.A01(ie2);
            }
        }
    }
}
