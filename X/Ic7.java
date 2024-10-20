package X;

import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: Ic7.class */
public abstract class Ic7 implements JQC {
    public JOW A00;

    public static JQC A07(Ic7 ic7, GuJ guJ) {
        JOW jow = ic7.A00;
        jow.getClass();
        return jow.AdC(guJ);
    }

    public static JG5 A08(Ic7 ic7, HJS hjs) {
        JOW jow = ic7.A00;
        jow.getClass();
        return jow.AdD(hjs);
    }

    public static Object A09(Ic7 ic7, Hvf hvf) {
        JOW jow = ic7.A00;
        jow.getClass();
        return jow.Adn(hvf);
    }

    public static boolean A0A(Ic7 ic7, Hvf hvf, Object obj) {
        return ((Boolean) ic7.A0C(hvf, obj)).booleanValue();
    }

    public static boolean A0B(Ic7 ic7, GuJ guJ) {
        JOW jow = ic7.A00;
        jow.getClass();
        return jow.BRD(guJ);
    }

    private final Object A0C(Hvf hvf, Object obj) {
        Object A09 = A09(this, hvf);
        return A09 != null ? A09 : obj;
    }

    public void A0D() {
        JPe jPe;
        IOR ior;
        if (this instanceof C2423Gck) {
            C2423Gck c2423Gck = (C2423Gck) this;
            c2423Gck.A01 = (JQ2) A07(c2423Gck, JQ2.A00);
            c2423Gck.A02 = (JQ1) A07(c2423Gck, JQ1.A00);
            GuJ guJ = JQ3.A00;
            if (A0B(c2423Gck, guJ)) {
                JQ3 jq3 = (JQ3) A07(c2423Gck, guJ);
                c2423Gck.A03 = jq3;
                jq3.A7V(c2423Gck.A05);
                return;
            }
            return;
        }
        if (this instanceof C2427Gco) {
            C2427Gco c2427Gco = (C2427Gco) this;
            C2420Gch c2420Gch = (C2420Gch) ((JQ2) A07(c2427Gco, JQ2.A00));
            c2427Gco.A00 = c2420Gch.A0g;
            c2420Gch.A0f.A02(c2427Gco.A01);
            return;
        }
        if (this instanceof C2420Gch) {
            C2420Gch c2420Gch2 = (C2420Gch) this;
            GuJ guJ2 = JQ0.A04;
            if (A0B(c2420Gch2, guJ2)) {
                JQ0 jq0 = (JQ0) A07(c2420Gch2, guJ2);
                HP7 hp7 = c2420Gch2.A0A;
                if (hp7 == null) {
                    hp7 = new HP7(c2420Gch2);
                    c2420Gch2.A0A = hp7;
                }
                jq0.Cs1(hp7);
                HP8 hp8 = c2420Gch2.A0B;
                if (hp8 == null) {
                    hp8 = new HP8(c2420Gch2);
                    c2420Gch2.A0B = hp8;
                }
                jq0.Crn(hp8);
                Hh3 hh3 = c2420Gch2.A09;
                if (hh3 == null) {
                    hh3 = new Hh3(c2420Gch2.A0g);
                    c2420Gch2.A09 = hh3;
                }
                jq0.Cs0(hh3);
            }
            GuJ guJ3 = JPe.A00;
            if (!A0B(c2420Gch2, guJ3)) {
                return;
            }
            jPe = (JPe) A07(c2420Gch2, guJ3);
            ior = c2420Gch2.A0D;
            if (ior == null) {
                ior = new IOR(c2420Gch2);
                c2420Gch2.A0D = ior;
            }
        } else {
            if (this instanceof C2426Gcn) {
                C2426Gcn c2426Gcn = (C2426Gcn) this;
                JQ3 jq32 = (JQ3) A07(c2426Gcn, JQ3.A00);
                c2426Gcn.A04 = jq32;
                jq32.A7V(c2426Gcn.A05);
                c2426Gcn.A04.CwK(new Iee(c2426Gcn));
                return;
            }
            if (!(this instanceof C2422Gcj)) {
                return;
            }
            C2422Gcj c2422Gcj = (C2422Gcj) this;
            JQC A07 = A07(c2422Gcj, JQ1.A00);
            11T.A0A(A07);
            JQ1 jq1 = (JQ1) A07;
            JLp jLp = c2422Gcj.A02;
            if (jLp == null) {
                jLp = new Id3(c2422Gcj, 3);
                c2422Gcj.A02 = jLp;
            }
            jq1.A78(jLp);
            if (!A0A(c2422Gcj, JPx.A00, 1BK.A0d())) {
                return;
            }
            GuJ guJ4 = JPe.A00;
            if (!A0B(c2422Gcj, guJ4)) {
                return;
            }
            JQC A072 = A07(c2422Gcj, guJ4);
            11T.A0A(A072);
            jPe = (JPe) A072;
            ior = c2422Gcj.A01;
            if (ior == null) {
                ior = new IOS(c2422Gcj);
                c2422Gcj.A01 = ior;
            }
        }
        Gth gth = (Gth) jPe;
        gth.A04.A02(ior);
        ior.CAJ(gth.A01, gth.A00);
    }

    public void A0E() {
        I5d i5d;
        if (this instanceof C2428Gcp) {
            C2428Gcp c2428Gcp = (C2428Gcp) this;
            synchronized (this) {
                TextureView textureView = c2428Gcp.A06;
                c2428Gcp.A06 = null;
                Iterator it = c2428Gcp.A00.A00.iterator();
                while (it.hasNext()) {
                    ((JLp) it.next()).CDl(c2428Gcp.A06);
                }
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(null);
                }
                i5d = c2428Gcp.A07;
                c2428Gcp.A07 = null;
            }
        }
        if (this instanceof C2420Gch) {
            C2420Gch c2420Gch = (C2420Gch) this;
            I3h A00 = C2420Gch.A00(c2420Gch);
            A00.A00 = 0;
            if (A00.A02) {
                A00.A00();
            }
            A00.A01 = null;
            GuJ guJ = JQ0.A04;
            if (A0B(c2420Gch, guJ)) {
                JQ0 jq0 = (JQ0) A07(c2420Gch, guJ);
                jq0.Cs1(null);
                jq0.Crn(null);
                jq0.Cs0(null);
            }
            GuJ guJ2 = JPe.A00;
            if (A0B(c2420Gch, guJ2)) {
                JPe jPe = (JPe) A07(c2420Gch, guJ2);
                IOR ior = c2420Gch.A0D;
                if (ior == null) {
                    ior = new IOR(c2420Gch);
                    c2420Gch.A0D = ior;
                }
                ((Gth) jPe).A04.A03(ior);
                return;
            }
            return;
        }
        if (this instanceof C2419Gcg) {
            C2419Gcg c2419Gcg = (C2419Gcg) this;
            I2L i2l = c2419Gcg.A05;
            if (i2l != null) {
                c2419Gcg.A0A = AnonymousClass001.A11();
                c2419Gcg.A06.A01.sendEmptyMessage(3);
                IFI ifi = i2l.A00;
                if (ifi != null) {
                    ifi.A0A();
                    i2l.A00 = null;
                }
                Hy0 hy0 = i2l.A01;
                HJQ hjq = Hy0.A05;
                Object A0d = 1BK.A0d();
                java.util.Map map = hy0.A00;
                Object obj = map.get(hjq);
                if (obj != null) {
                    A0d = obj;
                }
                boolean A1V = AnonymousClass001.A1V(A0d);
                IFI ifi2 = (IFI) map.remove(Hy0.A0B);
                if (!A1V || ifi2 == null) {
                    return;
                }
                ifi2.A0A();
                return;
            }
            return;
        }
        if (this instanceof C2415Gcc) {
            C2415Gcc c2415Gcc = (C2415Gcc) this;
            c2415Gcc.A02 = false;
            IHW ihw = c2415Gcc.A01;
            if (ihw != null) {
                ihw.A01.sendEmptyMessage(3);
                return;
            }
            return;
        }
        if (this instanceof C2426Gcn) {
            C2426Gcn c2426Gcn = (C2426Gcn) this;
            c2426Gcn.A04.CfE(c2426Gcn.A05);
            return;
        }
        if (!(this instanceof C2429Gcq)) {
            if (this instanceof C2422Gcj) {
                C2422Gcj c2422Gcj = (C2422Gcj) this;
                JQC A07 = A07(c2422Gcj, JQ1.A00);
                11T.A0A(A07);
                JQ1 jq1 = (JQ1) A07;
                JLp jLp = c2422Gcj.A02;
                if (jLp == null) {
                    jLp = new Id3(c2422Gcj, 3);
                    c2422Gcj.A02 = jLp;
                }
                jq1.Cf0(jLp);
                return;
            }
            return;
        }
        C2429Gcq c2429Gcq = (C2429Gcq) this;
        synchronized (this) {
            TextureView textureView2 = c2429Gcq.A05;
            c2429Gcq.A05 = null;
            Iterator it2 = c2429Gcq.A02.A00.iterator();
            while (it2.hasNext()) {
                ((JLp) it2.next()).CDl(c2429Gcq.A05);
            }
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            i5d = c2429Gcq.A07;
            c2429Gcq.A07 = null;
        }
        if (i5d != null) {
            i5d.A01();
        }
    }

    @Override // X.JQC
    public GuJ Ase() {
        GuJ guJ;
        if (this instanceof C2426Gcn) {
            return JPs.A00;
        }
        if ((this instanceof C2425Gcm) || (this instanceof C2424Gcl)) {
            guJ = JPr.A00;
        } else if (this instanceof C2428Gcp) {
            guJ = JQ1.A00;
        } else {
            if (this instanceof C2423Gck) {
                return JPq.A00;
            }
            if (this instanceof C2422Gcj) {
                guJ = JPx.A01;
            } else {
                if (this instanceof C2427Gco) {
                    return JPt.A00;
                }
                if (this instanceof C2419Gcg) {
                    return JPz.A01;
                }
                if ((this instanceof C2418Gcf) || (this instanceof C2417Gce)) {
                    return JQ0.A04;
                }
                if (!(this instanceof C2415Gcc)) {
                    if (this instanceof C2414Gcb) {
                        return JPu.A01;
                    }
                    throw AnonymousClass001.A0q("getKey() not supported");
                }
                guJ = JPy.A01;
            }
        }
        11T.A0B(guJ);
        return guJ;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.IKT, java.lang.Object] */
    @Override // X.JMx
    public final void BP0() {
        if (this instanceof C2419Gcg) {
            C2419Gcg c2419Gcg = (C2419Gcg) this;
            GuJ guJ = JPm.A01;
            if (A0B(c2419Gcg, guJ)) {
                Icn icn = ((Gtm) ((JPm) A07(c2419Gcg, guJ))).A00;
                11T.A0A(icn);
                C2419Gcg.A01(c2419Gcg, icn);
                return;
            }
            return;
        }
        if (this instanceof C2415Gcc) {
            C2415Gcc c2415Gcc = (C2415Gcc) this;
            C2415Gcc.A00(c2415Gcc);
            I4u i4u = c2415Gcc.A03;
            JOW jow = ((Ic7) c2415Gcc).A00;
            jow.getClass();
            i4u.A00 = new Object();
            GuJ guJ2 = JQ1.A00;
            if (jow.BRD(guJ2)) {
                JQ1 jq1 = (JQ1) jow.AdC(guJ2);
                i4u.A05 = jq1;
                if (jq1 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                jq1.A78(i4u.A08);
            }
            GuJ guJ3 = JQ0.A04;
            if (jow.BRD(guJ3)) {
                JQ0 jq0 = (JQ0) jow.AdC(guJ3);
                i4u.A01 = jq0;
                if (jq0 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                jq0.Ct3(i4u.A00);
                i4u.A00();
            }
            GuJ guJ4 = JPp.A00;
            if (jow.BRD(guJ4)) {
                JQC AdC = jow.AdC(guJ4);
                11T.A0A(AdC);
                i4u.A02(1BK.A17(((JPp) AdC).B79()));
            }
        }
    }

    @Override // X.JMx
    public void CY8() {
    }

    @Override // X.JMx
    public final void connect() {
        boolean z;
        I5d i5d;
        if (this instanceof C2428Gcp) {
            z = true;
            i5d = ((C2428Gcp) this).A07;
        } else {
            if (this instanceof C2423Gck) {
                ((C2423Gck) this).A09 = false;
                return;
            }
            if (this instanceof C2427Gco) {
                synchronized (((C2427Gco) this).A03) {
                }
                return;
            }
            if (this instanceof C2420Gch) {
                C2420Gch c2420Gch = (C2420Gch) this;
                if (c2420Gch.A0V) {
                    c2420Gch.A0V = false;
                    JQ1 jq1 = (JQ1) A07(c2420Gch, JQ1.A00);
                    JLp jLp = c2420Gch.A0G;
                    if (jLp == null) {
                        jLp = new Id3(c2420Gch, 1);
                        c2420Gch.A0G = jLp;
                    }
                    jq1.A78(jLp);
                    if (c2420Gch.A0U) {
                        C2420Gch.A02(c2420Gch);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this instanceof C2419Gcg) {
                C2419Gcg c2419Gcg = (C2419Gcg) this;
                if (c2419Gcg.A05 != null) {
                    c2419Gcg.A06.A01.sendEmptyMessage(1);
                    return;
                }
                return;
            }
            if (this instanceof C2418Gcf) {
                C2418Gcf c2418Gcf = (C2418Gcf) this;
                GuJ guJ = JQ1.A00;
                JQ1 jq12 = (JQ1) A07(c2418Gcf, guJ);
                if (((JQ1) A07(c2418Gcf, guJ)).BNN()) {
                    View B4V = jq12.B4V();
                    c2418Gcf.A03 = B4V;
                    B4V.setOnTouchListener(c2418Gcf.A08);
                    return;
                }
                return;
            }
            if (this instanceof C2415Gcc) {
                C2415Gcc c2415Gcc = (C2415Gcc) this;
                c2415Gcc.A02 = true;
                IHW ihw = c2415Gcc.A01;
                if (ihw != null) {
                    ihw.A01.sendEmptyMessage(1);
                    return;
                }
                return;
            }
            if (!(this instanceof C2429Gcq)) {
                if (this instanceof C2430Gcr) {
                    C2430Gcr c2430Gcr = (C2430Gcr) this;
                    JQ1 jq13 = c2430Gcr.A02;
                    if (jq13 != null) {
                        jq13.A78(c2430Gcr.A0B);
                    }
                    if (!c2430Gcr.A07) {
                        c2430Gcr.A00 = 0;
                        c2430Gcr.A08 = false;
                    }
                    JLq jLq = c2430Gcr.A0C;
                    if (jLq != null) {
                        jLq.D1H(new Id4(c2430Gcr, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            z = true;
            i5d = ((C2429Gcq) this).A07;
        }
        if (i5d != null) {
            i5d.A0E = z;
        }
    }

    @Override // X.JMx
    public void disable() {
    }

    @Override // X.JMx
    public final void disconnect() {
        I5d i5d;
        IHW ihw;
        if (!(this instanceof C2428Gcp)) {
            if (this instanceof C2423Gck) {
                C2423Gck c2423Gck = (C2423Gck) this;
                synchronized (c2423Gck.A07) {
                    if (c2423Gck.A08 != null) {
                        JHs jHs = c2423Gck.A08.A01;
                        jHs.getClass();
                        RuntimeException A0T = AnonymousClass001.A0T("Photo capture already in progress: cancel request");
                        if (IHZ.A0C()) {
                            jHs.BnD();
                        } else {
                            1BK.A1I(IHZ.A00(), new Object[]{jHs, A0T}, 8);
                        }
                        C2423Gck.A01(c2423Gck);
                    }
                }
                c2423Gck.A09 = true;
                return;
            }
            if (this instanceof C2427Gco) {
                C2427Gco c2427Gco = (C2427Gco) this;
                synchronized (c2427Gco.A03) {
                    Integer num = c2427Gco.A05;
                    Integer num2 = 0S2.A01;
                    if (num == num2) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        if (c2427Gco.A05 == num2) {
                            c2427Gco.A00.D30(new Gua(countDownLatch, c2427Gco, 1), false);
                        }
                        c2427Gco.A05 = 0S2.A00;
                        C2427Gco.A00(c2427Gco);
                        HnX hnX = c2427Gco.A04;
                        c2427Gco.A04 = null;
                        if (hnX != null) {
                            IHZ.A07(hnX, AnonymousClass001.A0T("Camera is backgrounded during recording"));
                        }
                    }
                }
                return;
            }
            if (this instanceof C2420Gch) {
                C2420Gch c2420Gch = (C2420Gch) this;
                if (c2420Gch.A0V) {
                    return;
                }
                JQ1 jq1 = (JQ1) A07(c2420Gch, JQ1.A00);
                JLp jLp = c2420Gch.A0G;
                if (jLp == null) {
                    jLp = new Id3(c2420Gch, 1);
                    c2420Gch.A0G = jLp;
                }
                jq1.Cf0(jLp);
                c2420Gch.A07 = null;
                c2420Gch.A06 = null;
                I3h A00 = C2420Gch.A00(c2420Gch);
                A00.A00 = 0;
                if (A00.A02) {
                    A00.A00();
                }
                c2420Gch.A0V = true;
                List list = c2420Gch.A0f.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C2427Gco c2427Gco2 = ((HP9) list.get(i)).A00;
                    synchronized (c2427Gco2.A03) {
                        if (c2427Gco2.A05 == 0S2.A01) {
                            c2427Gco2.D2z(false);
                        }
                    }
                }
                C2420Gch.A03(c2420Gch);
                return;
            }
            if (this instanceof C2419Gcg) {
                C2419Gcg c2419Gcg = (C2419Gcg) this;
                if (c2419Gcg.A05 == null) {
                    return;
                } else {
                    ihw = c2419Gcg.A06;
                }
            } else {
                if (this instanceof C2418Gcf) {
                    C2418Gcf c2418Gcf = (C2418Gcf) this;
                    View view = c2418Gcf.A03;
                    if (view != null) {
                        view.setOnTouchListener(null);
                        c2418Gcf.A03 = null;
                        return;
                    }
                    return;
                }
                if (this instanceof C2415Gcc) {
                    C2415Gcc c2415Gcc = (C2415Gcc) this;
                    c2415Gcc.A02 = false;
                    ihw = c2415Gcc.A01;
                    if (ihw == null) {
                        return;
                    }
                    Icn icn = c2415Gcc.A00;
                    if (icn != null) {
                        icn.A0a = false;
                        Handler handler = icn.A01;
                        if (handler != null) {
                            handler.removeMessages(3);
                        }
                    }
                } else {
                    if (!(this instanceof C2429Gcq)) {
                        if (this instanceof C2430Gcr) {
                            C2430Gcr c2430Gcr = (C2430Gcr) this;
                            JLq jLq = c2430Gcr.A0C;
                            if (jLq != null) {
                                jLq.stop();
                            }
                            JQ1 jq12 = c2430Gcr.A02;
                            if (jq12 != null) {
                                jq12.Cf0(c2430Gcr.A0B);
                            }
                            I5d i5d2 = c2430Gcr.A03;
                            if (i5d2 != null) {
                                c2430Gcr.Ceu(i5d2);
                                c2430Gcr.A03 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i5d = ((C2429Gcq) this).A07;
                }
            }
            boolean z = ihw.A06;
            I9U i9u = ihw.A04;
            if (!z) {
                i9u.A02();
            } else if (i9u.A0B) {
                i9u.A0F = true;
            }
            ihw.A01.sendEmptyMessage(2);
            return;
        }
        i5d = ((C2428Gcp) this).A07;
        if (i5d != null) {
            i5d.A0E = false;
        }
    }

    @Override // X.JMx
    public void enable() {
    }

    @Override // X.JMx
    public final void init() {
        A0D();
    }

    @Override // X.JMx
    public void pause() {
        IHW ihw;
        I5d i5d;
        if (!(this instanceof C2415Gcc)) {
            if (this instanceof C2428Gcp) {
                i5d = ((C2428Gcp) this).A07;
            } else if (this instanceof C2429Gcq) {
                i5d = ((C2429Gcq) this).A07;
            } else {
                if (!(this instanceof C2419Gcg)) {
                    return;
                }
                C2419Gcg c2419Gcg = (C2419Gcg) this;
                if (c2419Gcg.A05 == null) {
                    return;
                } else {
                    ihw = c2419Gcg.A06;
                }
            }
            if (i5d != null) {
                i5d.A0E = false;
                return;
            }
            return;
        }
        C2415Gcc c2415Gcc = (C2415Gcc) this;
        c2415Gcc.A02 = false;
        ihw = c2415Gcc.A01;
        if (ihw == null) {
            return;
        }
        Icn icn = c2415Gcc.A00;
        if (icn != null) {
            icn.A0a = false;
            Handler handler = icn.A01;
            if (handler != null) {
                handler.removeMessages(3);
            }
        }
        boolean z = ihw.A06;
        I9U i9u = ihw.A04;
        if (!z) {
            i9u.A02();
        } else if (i9u.A0B) {
            i9u.A0F = true;
        }
        ihw.A01.sendEmptyMessage(2);
    }

    @Override // X.JMx
    public final void release() {
        A0E();
    }

    @Override // X.JMx
    public void resume() {
        boolean z;
        I5d i5d;
        if (this instanceof C2415Gcc) {
            C2415Gcc c2415Gcc = (C2415Gcc) this;
            c2415Gcc.A02 = true;
            IHW ihw = c2415Gcc.A01;
            if (ihw != null) {
                ihw.A01.sendEmptyMessage(1);
                return;
            }
            return;
        }
        if (this instanceof C2428Gcp) {
            z = true;
            i5d = ((C2428Gcp) this).A07;
        } else {
            if (!(this instanceof C2429Gcq)) {
                if (this instanceof C2419Gcg) {
                    C2419Gcg c2419Gcg = (C2419Gcg) this;
                    if (c2419Gcg.A05 != null) {
                        c2419Gcg.A06.A01.sendEmptyMessage(1);
                        return;
                    }
                    return;
                }
                return;
            }
            z = true;
            i5d = ((C2429Gcq) this).A07;
        }
        if (i5d != null) {
            i5d.A0E = z;
        }
    }
}
