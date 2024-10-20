package X;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Icn.class */
public final class Icn implements JLE, JQ6, Handler.Callback, JJF {
    public static final int[] A0b = {0, 1, 2, 3, 4};
    public int A00;
    public Handler A01;
    public HP3 A02;
    public HwD A03;
    public JQ9 A04;
    public I9U A05;
    public List A06;
    public boolean A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Long A0G;
    public boolean A0H;
    public boolean A0I;
    public final ConditionVariable A0J;
    public final Ij2 A0K;
    public final Icf A0L;
    public final Icl A0M;
    public final Iiq A0N;
    public final boolean A0O;
    public final Context A0P;
    public final JEE A0Q;
    public final HPD A0R;
    public final I1d A0S;
    public final List A0T;
    public final AtomicInteger A0U;
    public final boolean A0V;
    public final boolean A0W;
    public volatile JMv A0X;
    public volatile Long A0Y;
    public volatile Long A0Z;
    public volatile boolean A0a;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x009e, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.Iiq, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Icn(android.content.Context r302, android.os.Handler r303, android.os.Handler r304, X.JEE r305, X.I1d r306, X.JQ9 r307, boolean r308, boolean r309, boolean r310, boolean r311) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Icn.<init>(android.content.Context, android.os.Handler, android.os.Handler, X.JEE, X.I1d, X.JQ9, boolean, boolean, boolean, boolean):void");
    }

    private final JMv A00(Handler handler, JMv jMv, JMh jMh, Integer num, boolean z, boolean z2, boolean z3) {
        JMv jMv2 = jMv;
        try {
            HvA.A01("GlProcessorGraph.renderSingleOutputInSeparateThread");
            CountDownLatch A11 = AnonymousClass001.A11();
            this.A0Y = A04(this, this.A0Y);
            handler.post(new J3g(this, jMv, jMh, num, A11, z2, z3));
            try {
                A11.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            Long l = this.A0Z;
            if (l != null) {
                GLES20.glFlush();
                long longValue = l.longValue();
                GLES30.glWaitSync(longValue, 0, -1);
                GLES30.glDeleteSync(longValue);
            }
            this.A0Z = null;
            JMv jMv3 = this.A0X;
            if (jMv3 != null) {
                jMv2 = jMv3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (this.A0a && !z) {
                jMh.Cky(jMv2, 0);
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                I9U i9u = this.A05;
                if (i9u != null) {
                    J76.A00(i9u, "MediaPipeline.renderSingleOutputInSeparateThread() failed.", th);
                }
                HvA.A00();
                this.A0X = null;
                return jMv2;
            } catch (Throwable th3) {
                HvA.A00();
                this.A0X = null;
                throw th3;
            }
        }
        HvA.A00();
        this.A0X = null;
        return jMv2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x023a A[Catch: all -> 0x031e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x031e, blocks: (B:199:0x00ed, B:202:0x00f8, B:205:0x0104, B:207:0x010b, B:6:0x011d, B:7:0x0123, B:9:0x012b, B:13:0x0136, B:17:0x023a, B:20:0x0245, B:24:0x025c, B:25:0x0262, B:27:0x0268, B:30:0x0272, B:33:0x027e, B:36:0x028b, B:39:0x0297, B:42:0x02a3, B:43:0x02aa, B:44:0x02b1, B:46:0x02bf, B:48:0x02c6, B:50:0x02cd, B:52:0x02d6, B:55:0x02e0, B:59:0x02ed, B:61:0x02f4, B:62:0x02f9, B:64:0x0300, B:65:0x0305, B:67:0x0314, B:80:0x0140, B:83:0x014b, B:84:0x0151, B:88:0x015e, B:89:0x0166, B:91:0x0175, B:93:0x017c, B:98:0x0193, B:99:0x019c, B:100:0x01a3, B:102:0x01ae, B:122:0x01eb, B:123:0x01f1, B:125:0x01fb, B:126:0x0201, B:128:0x020c, B:137:0x0225), top: B:198:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.JMv A01(X.Icn r301, X.JMv r302, X.JMh r303, java.lang.Integer r304, boolean r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Icn.A01(X.Icn, X.JMv, X.JMh, java.lang.Integer, boolean, boolean, boolean):X.JMv");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.JJD, java.lang.Object, X.Iij] */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.JJD, java.lang.Object, X.Iii] */
    private final JMv A02(JMv jMv) {
        int i;
        int i2;
        int i3;
        int i4;
        JMv jMv2;
        Icm icm;
        JMu A01;
        Icw A00;
        JMv jMv3 = jMv;
        Handler handler = this.A01;
        if (this.A0a && BNe() && (handler == null || 11T.A0O(Looper.myLooper(), handler.getLooper()) || !this.A07)) {
            0Z9.A01("ProcessGlRenderer", -904925411);
            int Ahi = jMv3.Ahi();
            if (Ahi != this.A0A || jMv3.B0k() != this.A0E) {
                this.A0A = Ahi;
                int B0k = jMv3.B0k();
                this.A0E = B0k;
                if ((Ahi + B0k) % 180 != 0) {
                    i = this.A0D;
                    i2 = this.A0F;
                } else {
                    i = this.A0F;
                    i2 = this.A0D;
                }
                Ij2 ij2 = this.A0K;
                float f = this.A08;
                ?? obj = new Object();
                obj.A02 = i;
                obj.A01 = i2;
                obj.A00 = f;
                ij2.CZR(obj, null);
                if (this.A0E % 180 != 0) {
                    i3 = this.A0B;
                    i4 = this.A0C;
                } else {
                    i3 = this.A0C;
                    i4 = this.A0B;
                }
                ij2.CZR(new Iit(i3, i4), null);
                int i5 = this.A0E / 90;
                int i6 = -this.A0A;
                ?? obj2 = new Object();
                obj2.A00 = i5;
                obj2.A01 = i6;
                ij2.CZR(obj2, null);
            }
            this.A0K.CZR(Iiu.A00, null);
            Icl icl = this.A0M;
            synchronized (icl) {
                icl.A02 = true;
                List list = icl.A06.A00;
                int A08 = GOo.A08(list);
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 < A08) {
                        Object A0q = 4YU.A0q(list, i8);
                        Icm icm2 = (Icm) A0q;
                        long BFt = jMv3.BFt() / 1000;
                        JMy jMy = icm2.A03;
                        if (jMy != null && jMy.isEnabled() && icm2.A05.BS3(BFt)) {
                            I9U i9u = icl.A01;
                            if (i9u == null) {
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append("GlRenderChain.init() must be called before doFrame() with enabled ");
                                A0k.append(A0q);
                                throw AnonymousClass001.A0N(AnonymousClass001.A0g(A0k, ' '));
                            }
                            Hp4 BKK = jMv3.BKK();
                            if (BKK != null && BKK.A00()) {
                                Icw A002 = Icl.A00(icl);
                                float f2 = BKK.A01;
                                float f3 = icl.A00;
                                A002.A02(GOn.A03(f2, f3), GOn.A03(BKK.A00, f3), jMv3.Ahi());
                            }
                            try {
                                icm = (Icm) A0q;
                                A01 = i9u.A01();
                                11T.A0A(Icl.A00(icl).A0A);
                                A00 = Icl.A00(icl);
                            } catch (Throwable th) {
                                th = th;
                                jMv2 = jMv3;
                            }
                            synchronized (A00) {
                                HsT texture = jMv3.getTexture();
                                if (texture != null) {
                                    try {
                                        if (A00.BcC() == null) {
                                            Hp4 D7T = A00.D7T(jMv3, A00.A01);
                                            Hp4 BKK2 = jMv3.BKK();
                                            if (BKK2 != null && D7T != null && BKK2.A00() && D7T.A00()) {
                                                I5I i5i = icm.A06;
                                                i5i.A01(texture, BKK2.A03, D7T.A03, null, jMv3.BFt());
                                                AbstractC2326GOr.A0q(D7T.A01, D7T.A00);
                                                JMy jMy2 = icm.A03;
                                                if (jMy2 != null) {
                                                    int i9 = icm.A01;
                                                    int i10 = D7T.A01;
                                                    if (i9 != i10 || icm.A00 != D7T.A00) {
                                                        icm.A01 = i10;
                                                        icm.A00 = D7T.A00;
                                                        11T.A0D(jMy2);
                                                        jMy2.CPA(icm.A01, icm.A00);
                                                    }
                                                }
                                                if (icm.A02 != null) {
                                                    JMy jMy3 = icm.A03;
                                                    if (jMy3 != null && jMy3.isEnabled()) {
                                                        long j = i5i.A00 / 1000;
                                                        if (!icm.A04) {
                                                            icm.A08.BvA(i5i, j);
                                                        }
                                                        JMy jMy4 = icm.A03;
                                                        if (jMy4 instanceof JQX) {
                                                            11T.A0I(jMy4, "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer");
                                                            ((JQX) jMy4).Co7(icm.A07);
                                                        }
                                                        JMy jMy5 = icm.A03;
                                                        11T.A0D(jMy5);
                                                        if (jMy5.BvA(i5i, j)) {
                                                            A00.D3m();
                                                            A01.BcD();
                                                            N34.A02(AnonymousClass001.A0Z(A0q, "GL Error after renderFrame(): ", AnonymousClass001.A0k()), new Object[0]);
                                                            jMv2 = Icl.A00(icl).A0A;
                                                            11T.A0A(jMv2);
                                                            try {
                                                                icl.A02 = !icl.A02;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                J76.A00(i9u, "GlRenderChain.doFrame() error!", th);
                                                                jMv3 = jMv2;
                                                                i7 = i8 + 1;
                                                            }
                                                            jMv3 = jMv2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        A01.BcD();
                                    } catch (Throwable th3) {
                                        A01.BcD();
                                        throw th3;
                                        break;
                                    }
                                }
                                N34.A02(AnonymousClass001.A0Z(A0q, "GL Error after skip renderFrame(): ", AnonymousClass001.A0k()), new Object[0]);
                            }
                        }
                        i7 = i8 + 1;
                    }
                }
            }
            0Z9.A00(-920525786);
            if (this.A0W) {
                I9U i9u2 = this.A05;
                if (i9u2 == null) {
                    throw 1BK.A0h();
                }
                if (i9u2.A03.A01 >= 3) {
                    0Z9.A01("WaitForGpuCompletion", -60559716);
                    Long l = this.A0G;
                    if (l != null) {
                        GLES30.glClientWaitSync(l.longValue(), 1, 500000000L);
                        GLES30.glDeleteSync(l.longValue());
                        this.A0G = null;
                    }
                    this.A0G = Long.valueOf(GLES30.glFenceSync(37143, 0));
                    GLES20.glFlush();
                    0Z9.A00(-1498932802);
                    return jMv3;
                }
            }
        }
        return jMv3;
    }

    private final JMv A03(JMv jMv, JMh jMh, boolean z) {
        JMv jMv2 = jMv;
        if (this.A0a) {
            try {
                HvA.A01("GlProcessorGraph.renderInSeparateThread");
                Handler handler = this.A01;
                if (handler != null) {
                    if (this.A0U.get() < this.A00) {
                        handler.removeMessages(3);
                        1BK.A1I(handler, new Object[]{jMh, jMv}, 3);
                        if (this.A0a && !z) {
                            jMh.Cky(jMv, 0);
                        }
                    } else if (!z && this.A0V && this.A0M.A02()) {
                        int i = 0;
                        List Anv = jMh.Anv(0);
                        int size = Anv.size();
                        boolean[] zArr = new boolean[5];
                        int i2 = 0;
                        for (int i3 = 0; i3 < 5; i3++) {
                            int i4 = A0b[i3];
                            int i5 = 0;
                            while (true) {
                                if (i5 < size) {
                                    JNP jnp = (JNP) Anv.get(i5);
                                    zArr[i3] = false;
                                    int B0l = jnp.B0l();
                                    if (i4 != B0l) {
                                        if (i4 != 0) {
                                            if (i4 != 5) {
                                                continue;
                                            } else if (B0l != 0) {
                                                continue;
                                            }
                                            i5++;
                                        } else if (B0l != 5) {
                                            continue;
                                            i5++;
                                        }
                                    }
                                    if (jnp.BS5(jMv2)) {
                                        zArr[i3] = true;
                                        i2++;
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        int i6 = 0;
                        do {
                            if (zArr[i6]) {
                                int i7 = A0b[i6];
                                JMv jMv3 = null;
                                boolean A1O = AnonymousClass001.A1O(i);
                                boolean A1Q = AnonymousClass001.A1Q(i, i2 - 1);
                                for (int i8 = 0; i8 < size; i8++) {
                                    JNP jnp2 = (JNP) Anv.get(i8);
                                    int B0l2 = jnp2.B0l();
                                    if (i7 != B0l2) {
                                        if (i7 != 0) {
                                            if (i7 == 5) {
                                                if (B0l2 != 0) {
                                                }
                                            }
                                        } else if (B0l2 != 5) {
                                        }
                                    }
                                    if (jnp2.BS5(jMv2)) {
                                        if (jMv3 == null) {
                                            jMv3 = A00(handler, jMv2, jMh, Integer.valueOf(i7), true, A1O, A1Q);
                                        }
                                        ((Id0) jMh).A07.A01(jMv3, jnp2);
                                    }
                                }
                                i++;
                            }
                            i6++;
                        } while (i6 < 5);
                    } else {
                        jMv2 = A00(handler, jMv2, jMh, null, z, true, true);
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return jMv2;
    }

    public static final Long A04(Icn icn, Long l) {
        if (l != null) {
            GLES20.glFlush();
            GLES30.glDeleteSync(l.longValue());
        }
        I9U i9u = icn.A05;
        if (i9u == null) {
            throw 1BK.A0h();
        }
        if (i9u.A03.A01 < 3) {
            return null;
        }
        Long valueOf = Long.valueOf(GLES30.glFenceSync(37143, 0));
        GLES20.glFlush();
        return valueOf;
    }

    public static final void A05(Icn icn, JJD jjd, JJE jje) {
        if (!jjd.AMl()) {
            icn.A06(jjd, jje);
            return;
        }
        if (icn.A07 && icn.A01 == null) {
            return;
        }
        Handler handler = icn.A01;
        if (handler == null) {
            throw 1BK.A0h();
        }
        handler.sendMessage(jje != null ? handler.obtainMessage(2, new Object[]{jjd, jje}) : handler.obtainMessage(1, jjd));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r308.A0H != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r0 = r308.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r0.A0E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0170, code lost:
    
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A06(X.JJD r302, X.JJE r303) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Icn.A06(X.JJD, X.JJE):void");
    }

    private final void A07(List list) {
        IllegalStateException th;
        JMu jMu;
        if (this.A05 == null) {
            this.A06 = list;
            return;
        }
        List list2 = this.A0T;
        ArrayList A17 = 1BK.A17(list2);
        ArrayList A0s = AnonymousClass001.A0s();
        list2.clear();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            JMy jMy = (JMy) list.get(i);
            list2.add(jMy);
            if (!A17.remove(jMy)) {
                A0s.add(jMy);
            }
            Icm AIW = this.A0Q.AIW(i);
            JMy jMy2 = AIW.A03;
            if (jMy2 != jMy) {
                if (jMy2 != null) {
                    jMy2.CPG();
                }
                AIW.A03 = jMy;
                AIW.A04 = jMy instanceof JQV;
                if (jMy != null && (jMu = AIW.A02) != null) {
                    11T.A0D(jMu);
                    jMy.CPE(jMu.B57());
                }
            }
            A0s2.add(AIW);
        }
        int size2 = A17.size();
        for (int i2 = 0; i2 < size2; i2++) {
            JJE jje = (JMy) A17.get(i2);
            if (jje instanceof JJE) {
                jje.Ctv((JLR) null);
            }
            if (jje instanceof JJA) {
                ((JJA) jje).Cqs((JQ9) null);
            }
        }
        Ij2 ij2 = this.A0K;
        JQ9 jq9 = this.A04;
        int size3 = A0s.size();
        for (int i3 = 0; i3 < size3; i3++) {
            JJE jje2 = (JMy) A0s.get(i3);
            if (jje2 instanceof JJE) {
                jje2.Ctv(ij2);
            }
            if (jje2 instanceof JJA) {
                ((JJA) jje2).Cqs(jq9);
            }
        }
        Icl icl = this.A0M;
        synchronized (icl) {
            I9U i9u = icl.A01;
            if (i9u != null) {
                ArrayList A0s3 = AnonymousClass001.A0s();
                ArrayList A172 = 1BK.A17(A0s2);
                I4V i4v = icl.A06;
                List list3 = i4v.A00;
                int A08 = GOo.A08(list3);
                for (int i4 = 0; i4 < A08; i4++) {
                    Icm icm = (Icm) 4YU.A0q(list3, i4);
                    if (A172.remove(icm)) {
                        A0s2.set(A0s2.indexOf(icm), icm);
                    } else {
                        A0s3.add(icm);
                    }
                }
                int size4 = A0s3.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    Icm icm2 = (Icm) A0s3.get(i5);
                    if (icm2 instanceof JLE) {
                        i9u.A04(icm2);
                    }
                }
                int size5 = A172.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    Icm icm3 = (Icm) A172.get(i6);
                    if (icm3 instanceof JLE) {
                        i9u.A03(icm3);
                    }
                }
                i4v.A01();
                synchronized (i4v) {
                    try {
                        if (!A0s2.isEmpty()) {
                            int size6 = A0s2.size();
                            ArrayList A0t = AnonymousClass001.A0t(i4v.A00.size() + size6);
                            A0t.addAll(i4v.A00);
                            boolean z = false;
                            for (int i7 = 0; i7 < size6; i7++) {
                                Object obj = A0s2.get(i7);
                                if (!i4v.A00.contains(obj)) {
                                    A0t.add(obj);
                                    z = true;
                                }
                            }
                            if (z) {
                                i4v.A00 = Collections.unmodifiableList(A0t);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } else {
                th = AnonymousClass001.A0N("GlRenderChain.init() must be called before setGlRenderers()");
            }
            throw th;
        }
    }

    public final void A08(float f) {
        if (f == 0.0f) {
            this.A0S.A00(HBq.A0R);
        }
        this.A09 = f;
        Icl icl = this.A0M;
        if (f == 0.0f) {
            icl.A05.A00(HBq.A0S);
        }
        icl.A00 = f;
    }

    public void AAv(JMu jMu) {
        this.A0a = true;
        Ij2 ij2 = this.A0K;
        HyR hyR = ij2.A01;
        if (hyR.A00.compareAndSet(false, true)) {
            HyR.A00(hyR);
        }
        ij2.A00.A01.set(true);
    }

    public void AN3() {
        this.A0a = false;
        Long l = this.A0G;
        if (l != null) {
            GLES30.glDeleteSync(l.longValue());
            this.A0G = null;
        }
        Long l2 = this.A0Y;
        if (l2 != null) {
            GLES30.glDeleteSync(l2.longValue());
            this.A0Y = null;
        }
        Long l3 = this.A0Z;
        if (l3 != null) {
            GLES30.glDeleteSync(l3.longValue());
            this.A0Z = null;
        }
        Ij2 ij2 = this.A0K;
        ij2.A01.A00.set(false);
        ij2.A00.A01.set(false);
    }

    @Override // X.JQ6
    public /* synthetic */ int Agx() {
        return 0;
    }

    @Override // X.JQ6
    public boolean BNe() {
        List list = this.A0M.A06.A00;
        int A08 = GOo.A08(list);
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < A08) {
                JMy jMy = ((Icm) list.get(i2)).A03;
                if (jMy != null && jMy.isEnabled()) {
                    z = true;
                    break;
                }
                i = i2 + 1;
            } else {
                break;
            }
        }
        return z;
    }

    public void BOo(I9U i9u) {
        11T.A0F(i9u, 0);
        this.A05 = i9u;
        i9u.A03(this.A0M);
        Icf icf = this.A0L;
        if (icf != null) {
            i9u.A03(icf);
        }
        Handler handler = this.A01;
        if (handler == null || !11T.A0O(handler.getLooper(), i9u.A00.getLooper())) {
            this.A01 = new Handler(i9u.A00.getLooper(), this);
        }
        List list = this.A06;
        if (list != null) {
            A05(this, new Iin(list), null);
            this.A06 = null;
        }
    }

    @Override // X.JQ6
    public /* synthetic */ boolean BVL() {
        return false;
    }

    public void CZQ(JJD jjd) {
        11T.A0F(jjd, 0);
        A05(this, jjd, null);
    }

    public void CZR(JJD jjd, JJE jje) {
        11T.A0H(jjd, jje);
        A05(this, jjd, jje);
    }

    @Override // X.JQ6
    public void CfU(JMh jMh, Long l) {
        11T.A0F(jMh, 0);
        if (jMh.BTW(0)) {
            try {
                HvA.A01("GlProcessorGraph.renderInternal");
                JMv jMv = (JMv) jMh.Aqr(0);
                if (!this.A0O || jMh.Anu(0) != 0) {
                    if (this.A01 != null && BNe() && this.A07) {
                        11T.A0D(jMv);
                        A03(jMv, jMh, false);
                    } else {
                        11T.A0D(jMv);
                        A01(this, jMv, jMh, null, false, true, true);
                    }
                }
            } catch (Throwable th) {
                I9U i9u = this.A05;
                if (i9u != null) {
                    J76.A00(i9u, "MediaPipeline.renderInternal() failed.", th);
                }
            } finally {
            }
        }
    }

    @Override // X.JQ6
    public JMv CfV(JMv jMv, JNP jnp, JMh jMh, Long l) {
        JMv jMv2 = jMv;
        4YV.A1N(jMv, jMh);
        try {
            try {
                HvA.A01("GlProcessorGraph.render");
                jMv2 = (this.A01 != null && BNe() && this.A07) ? A03(jMv, jMh, true) : A01(this, jMv2, jMh, null, true, true, true);
            } finally {
                HvA.A00();
                return jMv2;
            }
            HvA.A00();
            return jMv2;
        } catch (Throwable th) {
            HvA.A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.JJD, java.lang.Object, X.Iih] */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.JJD, java.lang.Object, X.Iii] */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.JJD, java.lang.Object, X.Iij] */
    @Override // X.JQ6
    public void D7Z(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (i == 0) {
            float f = this.A09;
            this.A0C = GOn.A03(i2, f);
            this.A0B = GOn.A03(i3, f);
            this.A0F = i4;
            this.A0D = i5;
            this.A08 = 7zO.A0I(this.A0P).density;
            this.A0A = 0;
            this.A0E = 0;
            Icf icf = this.A0L;
            if (icf != null) {
                int i6 = this.A0C;
                int i7 = this.A0B;
                IHB ihb = icf.A04;
                if (i6 > 0 && i7 > 0) {
                    int max = Math.max(i6, i7);
                    int i8 = (i6 * 600) / max;
                    ihb.A02 = i8;
                    int i9 = (i7 * 600) / max;
                    ihb.A01 = i9;
                    ihb.A02 = i8 - (i8 % 2);
                    ihb.A01 = i9 - (i9 % 2);
                }
                if (ihb.A0G) {
                    ihb.A08.post(ihb.A0B);
                    if (ihb.A06) {
                        ConditionVariable conditionVariable = ihb.A07;
                        conditionVariable.block();
                        conditionVariable.close();
                    }
                }
            }
            Ij2 ij2 = this.A0K;
            ij2.CZR(new Iis(this.A0I), null);
            ij2.CZR(new Iit(this.A0C, this.A0B), null);
            Integer num = z ? 0S2.A00 : 0S2.A01;
            ?? obj = new Object();
            obj.A00 = num;
            ij2.CZR(obj, null);
            int i10 = this.A0E / 90;
            int i11 = this.A0A;
            ?? obj2 = new Object();
            obj2.A00 = i10;
            obj2.A01 = i11;
            ij2.CZR(obj2, null);
            int i12 = this.A0F;
            int i13 = this.A0D;
            float f2 = this.A08;
            ?? obj3 = new Object();
            obj3.A02 = i12;
            obj3.A01 = i13;
            obj3.A00 = f2;
            ij2.CZR(obj3, null);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        JJD jjd;
        JJE jje;
        11T.A0F(message, 0);
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            if (obj == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            jjd = (JJD) obj;
            jje = null;
        } else {
            if (i != 2) {
                if (i == 3 && this.A0a) {
                    Object obj2 = message.obj;
                    if (obj2 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    Object[] objArr = (Object[]) obj2;
                    Object obj3 = objArr[0];
                    11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.mediagraph.interfaces.MediaGraphIO");
                    JMh jMh = (JMh) obj3;
                    Object obj4 = objArr[1];
                    11T.A0I(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.interfaces.GlFrame");
                    A01(this, (JMv) obj4, jMh, null, true, true, true);
                }
                return true;
            }
            Object obj5 = message.obj;
            if (obj5 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            Object[] objArr2 = (Object[]) obj5;
            Object obj6 = objArr2[0];
            11T.A0I(obj6, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEvent");
            jjd = (JJD) obj6;
            Object obj7 = objArr2[1];
            11T.A0I(obj7, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEventListener");
            jje = (JJE) obj7;
        }
        A06(jjd, jje);
        return true;
    }

    public void release() {
        List list = this.A0T;
        if (1BK.A1Y(list)) {
            this.A06 = 1BK.A17(list);
            A07(C0ty.A00);
        }
        Ij2 ij2 = this.A0K;
        Arrays.fill(ij2.A01.A02, false);
        ij2.A00.A00.A01();
        ij2.A02.clear();
    }
}
