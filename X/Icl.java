package X;

import java.util.List;

/* loaded from: Icl.class */
public final class Icl implements JLE, JDF {
    public I9U A01;
    public boolean A02;
    public Icw A03;
    public Icw A04;
    public final I1d A05;
    public final I4V A06 = I4V.A00();
    public float A00 = 1.0f;

    public Icl(I1d i1d) {
        this.A05 = i1d;
    }

    public static final Icw A00(Icl icl) {
        Icw icw;
        I9U i9u = icl.A01;
        if (i9u == null) {
            throw AnonymousClass001.A0N("GlRenderChain.init() must be called before getFrameBuffer()");
        }
        if (icl.A02) {
            icw = icl.A03;
            if (icw == null) {
                icw = new Icw(icl.A05, new Gu6(), new Gu5(), true);
                i9u.A03(icw);
                icl.A03 = icw;
            }
        } else {
            icw = icl.A04;
            if (icw == null) {
                Icw icw2 = new Icw(icl.A05, new Gu6(), new Gu5(), true);
                i9u.A03(icw2);
                icl.A04 = icw2;
                return icw2;
            }
        }
        return icw;
    }

    public void A01(int i) {
        synchronized (this) {
            List list = this.A06.A00;
            int A08 = GOo.A08(list);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < A08) {
                    Icm icm = (Icm) list.get(i3);
                    if (icm instanceof JDF) {
                        HcY hcY = icm.A07;
                        HB9 hb9 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? HB9.A05 : HB9.A04 : HB9.A03 : HB9.A02 : HB9.A01;
                        hcY.A00 = hb9;
                        hcY.A01 = HLY.A00(hb9);
                    }
                    i2 = i3 + 1;
                }
            }
        }
    }

    public boolean A02() {
        synchronized (this) {
            List list = this.A06.A00;
            int A08 = GOo.A08(list);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= A08) {
                    return false;
                }
                Icm icm = (Icm) list.get(i2);
                if (icm instanceof JDF) {
                    JMy jMy = icm.A03;
                    if (jMy instanceof JQX) {
                        11T.A0I(jMy, "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer");
                        if (((JQX) jMy).BUO()) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
                i = i2 + 1;
            }
        }
    }

    public void AAv(JMu jMu) {
    }

    public void AN3() {
    }

    public void BOo(I9U i9u) {
        11T.A0F(i9u, 0);
        this.A01 = i9u;
    }

    public void release() {
        synchronized (this) {
            this.A03 = null;
            this.A04 = null;
        }
    }
}
