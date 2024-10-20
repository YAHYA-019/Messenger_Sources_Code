package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.JdR, reason: case insensitive filesystem */
/* loaded from: JdR.class */
public abstract class AbstractC2938JdR extends AbstractC2927JdF implements MKq, MNG, MES {
    public float A00;
    public KTM A02;
    public GraphicsLayer A03;
    public MKR A04;
    public Km6 A05;
    public AbstractC2938JdR A06;
    public AbstractC2938JdR A07;
    public ML3 A08;
    public MNh A09;
    public Function1 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public KMW A0F;
    public java.util.Map A0G;
    public final LPQ A0H;
    public static final Function1 A0P = M59.A00;
    public static final Function1 A0O = M58.A00;
    public static final LOO A0K = new LOO();
    public static final Km6 A0L = new Km6();
    public static final float[] A0Q = LBd.A04();
    public static final MK0 A0M = new LPS();
    public static final MK0 A0N = new LPT();
    public float A0E = 0.8f;
    public long A01 = 0;
    public final Function2 A0J = new AVM(this, 13);
    public final C00m A0I = M3K.A00(this, 42);

    public AbstractC2938JdR(LPQ lpq) {
        this.A0H = lpq;
        this.A09 = lpq.A0C;
        this.A0F = lpq.A0D;
    }

    public static long A03(AbstractC2938JdR abstractC2938JdR, long j) {
        long A00 = KvH.A00(DKH.A00(j) - JQz.A02(abstractC2938JdR.A01), JR1.A02(j) - JR0.A0I(r0));
        ML3 ml3 = abstractC2938JdR.A08;
        if (ml3 != null) {
            A00 = ml3.BcH(A00, true);
        }
        return A00;
    }

    public static long A04(AbstractC2938JdR abstractC2938JdR, long j) {
        ML3 ml3 = abstractC2938JdR.A08;
        if (ml3 != null) {
            j = ml3.BcH(j, false);
        }
        return KvH.A00(DKH.A00(j) + JQz.A02(abstractC2938JdR.A01), JR1.A02(j) + JR0.A0I(r0));
    }

    private final long A05(AbstractC2938JdR abstractC2938JdR, long j) {
        if (abstractC2938JdR == this) {
            return j;
        }
        AbstractC2938JdR abstractC2938JdR2 = this.A07;
        return (abstractC2938JdR2 == null || 11T.A0O(abstractC2938JdR, abstractC2938JdR2)) ? A03(this, j) : A03(this, abstractC2938JdR2.A05(abstractC2938JdR, j));
    }

    public static final long A06(AbstractC2938JdR abstractC2938JdR, long j) {
        return KvJ.A00(Math.max(0.0f, (LCr.A01(j) - JQz.A02(((L56) abstractC2938JdR).A03)) / 2.0f), Math.max(0.0f, (LCr.A00(j) - JR0.A0I(r0)) / 2.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r303 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r306 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.LPR A07(int r302) {
        /*
            r301 = this;
            X.JaX r0 = X.LD2.A00
            r303 = r0
            r0 = 128(0x80, float:1.8E-43)
            r1 = r302
            r0 = r0 & r1
            r304 = r0
            r0 = r304
            boolean r0 = X.AnonymousClass001.A1N(r0)
            r305 = r0
            r0 = r301
            X.LPR r0 = r0.A0P()
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L29
            r0 = r303
            X.LPR r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L29
        L23:
            r0 = 0
            r306 = r0
        L26:
            r0 = r306
            return r0
        L29:
            r0 = r301
            r1 = r305
            X.LPR r0 = A08(r0, r1)
            r306 = r0
        L31:
            r0 = r306
            if (r0 == 0) goto L23
            r0 = r306
            int r0 = r0.A00
            r1 = r302
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L23
            r0 = r306
            int r0 = r0.A01
            r1 = r302
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L26
            r0 = r306
            r1 = r303
            if (r0 == r1) goto L23
            r0 = r306
            X.LPR r0 = r0.A02
            r306 = r0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A07(int):X.LPR");
    }

    public static final LPR A08(AbstractC2938JdR abstractC2938JdR, boolean z) {
        LPR A0P2;
        LDS lds = abstractC2938JdR.A0H.A0T;
        LPR lpr = null;
        if (lds.A04 == abstractC2938JdR) {
            lpr = lds.A02;
        } else {
            AbstractC2938JdR abstractC2938JdR2 = abstractC2938JdR.A07;
            if (z) {
                if (abstractC2938JdR2 != null && (A0P2 = abstractC2938JdR2.A0P()) != null) {
                    return A0P2.A02;
                }
            } else if (abstractC2938JdR2 != null) {
                return abstractC2938JdR2.A0P();
            }
        }
        return lpr;
    }

    public static final void A09(LPR lpr, Lsx lsx, MK0 mk0, AbstractC2938JdR abstractC2938JdR, float f, long j, boolean z, boolean z2) {
        if (lpr == null) {
            abstractC2938JdR.A0a(lsx, mk0, j, z, z2);
            return;
        }
        if (!mk0.BPr(lpr)) {
            A09(KUk.A00(lpr, mk0.AQo()), lsx, mk0, abstractC2938JdR, f, j, z, z2);
            return;
        }
        M18 m18 = new M18(lpr, lsx, mk0, abstractC2938JdR, f, 1, j, z, z2);
        int i = lsx.A00;
        int size = lsx.size() - 1;
        if (i == size) {
            lsx.A02(lpr, m18, f, z2);
            if (lsx.A00 + 1 == lsx.size() - 1) {
                Lsx.A01(lsx);
                return;
            }
            return;
        }
        long A00 = Lsx.A00(lsx);
        lsx.A00 = size;
        lsx.A02(lpr, m18, f, z2);
        int i2 = lsx.A00 + 1;
        int size2 = lsx.size();
        if (i2 < size2 - 1 && KUf.A00(A00, Lsx.A00(lsx)) > 0) {
            int i3 = i + 1;
            Object[] objArr = lsx.A04;
            C1A9.A0I(objArr, objArr, i3, i2, size2);
            long[] jArr = lsx.A03;
            System.arraycopy(jArr, i2, jArr, i3, lsx.size() - i2);
            lsx.A00 = ((lsx.size() + i) - lsx.A00) - 1;
        }
        Lsx.A01(lsx);
        lsx.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        if ((((X.LPR) r314).A00 & 16) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
    
        if ((((X.LPR) r314).A01 & 16) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r317 = null;
        r318 = r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        if ((r318 instanceof X.MNZ) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        if (r318.Cx3() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0172, code lost:
    
        r318 = X.LDX.A00(r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x017b, code lost:
    
        if (r318 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        if ((((X.LPR) r318).A01 & 16) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        if ((r318 instanceof X.AbstractC2887Jc8) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
    
        r313 = ((X.AbstractC2887Jc8) r318).A00;
        r320 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        if (r313 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
    
        if ((((X.LPR) r313).A01 & 16) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
    
        r320 = r320 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0139, code lost:
    
        if (r320 != 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013c, code lost:
    
        r318 = r313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0140, code lost:
    
        r313 = ((X.LPR) r313).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014a, code lost:
    
        r317 = X.JR0.A0Z(r317);
        r318 = X.JQx.A0Z(r317, (X.LPR) r318);
        r317.A0C(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016c, code lost:
    
        if (r320 != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0181, code lost:
    
        r314 = ((X.LPR) r314).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018a, code lost:
    
        if (r314 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0A(X.LPR r301, X.Lsx r302, X.MK0 r303, X.AbstractC2938JdR r304, long r305, boolean r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0A(X.LPR, X.Lsx, X.MK0, X.JdR, long, boolean, boolean):void");
    }

    private final void A0B(KTM ktm, AbstractC2938JdR abstractC2938JdR, boolean z) {
        if (abstractC2938JdR != this) {
            AbstractC2938JdR abstractC2938JdR2 = this.A07;
            if (abstractC2938JdR2 != null) {
                abstractC2938JdR2.A0B(ktm, abstractC2938JdR, z);
            }
            long j = this.A01;
            float f = (int) (j >> 32);
            ktm.A01 -= f;
            ktm.A02 -= f;
            float f2 = (int) (j & 4294967295L);
            ktm.A03 -= f2;
            ktm.A00 -= f2;
            ML3 ml3 = this.A08;
            if (ml3 != null) {
                ml3.BcG(ktm, true);
                if (this.A0B && z) {
                    long j2 = ((L56) this).A03;
                    ktm.A00(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    public static final void A0C(KTM ktm, AbstractC2938JdR abstractC2938JdR, boolean z, boolean z2) {
        ML3 ml3 = abstractC2938JdR.A08;
        if (ml3 != null) {
            if (abstractC2938JdR.A0B) {
                if (z2) {
                    long D4W = abstractC2938JdR.A09.D4W(abstractC2938JdR.A0H.A0B.Axt());
                    float A01 = LCr.A01(D4W) / 2.0f;
                    float A00 = LCr.A00(D4W) / 2.0f;
                    ktm.A00(-A01, -A00, JQz.A02(((L56) abstractC2938JdR).A03) + A01, JR0.A0I(r0) + A00);
                } else if (z) {
                    ktm.A00(0.0f, 0.0f, JQz.A02(((L56) abstractC2938JdR).A03), JR0.A0I(r0));
                }
                if (ktm.A01 >= ktm.A02 || ktm.A03 >= ktm.A00) {
                    return;
                }
            }
            ml3.BcG(ktm, false);
        }
        long j = abstractC2938JdR.A01;
        float A0C = JQz.A0C(j);
        ktm.A01 += A0C;
        ktm.A02 += A0C;
        float A0I = JR0.A0I(j);
        ktm.A03 += A0I;
        ktm.A00 += A0I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ef, code lost:
    
        if (r318 == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0D(X.MLE r301, androidx.compose.ui.graphics.layer.GraphicsLayer r302, X.AbstractC2938JdR r303) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0D(X.MLE, androidx.compose.ui.graphics.layer.GraphicsLayer, X.JdR):void");
    }

    public static final void A0E(GraphicsLayer graphicsLayer, AbstractC2938JdR abstractC2938JdR, Function1 function1, float f, long j) {
        if (graphicsLayer == null) {
            if (abstractC2938JdR.A03 != null) {
                abstractC2938JdR.A03 = null;
                abstractC2938JdR.A0c(null, false);
            }
            abstractC2938JdR.A0c(function1, false);
        } else {
            if (function1 != null) {
                throw AnonymousClass001.A0L("both ways to create layers shouldn't be used together");
            }
            if (abstractC2938JdR.A03 != graphicsLayer) {
                abstractC2938JdR.A03 = null;
                abstractC2938JdR.A0c(null, false);
                abstractC2938JdR.A03 = graphicsLayer;
            }
            if (abstractC2938JdR.A08 == null) {
                LPQ lpq = abstractC2938JdR.A0H;
                MNF A00 = Kx3.A00(lpq);
                Function2 function2 = abstractC2938JdR.A0J;
                C00m c00m = abstractC2938JdR.A0I;
                ML3 AJz = A00.AJz(graphicsLayer, c00m, function2);
                AJz.Chp(((L56) abstractC2938JdR).A03);
                AJz.BeY(j);
                abstractC2938JdR.A08 = AJz;
                lpq.A0H = true;
                c00m.invoke();
            }
        }
        if (abstractC2938JdR.A01 != j) {
            abstractC2938JdR.A01 = j;
            LPQ lpq2 = abstractC2938JdR.A0H;
            lpq2.A0R.A0J.A0M();
            ML3 ml3 = abstractC2938JdR.A08;
            if (ml3 != null) {
                ml3.BeY(j);
            } else {
                AbstractC2938JdR abstractC2938JdR2 = abstractC2938JdR.A07;
                if (abstractC2938JdR2 != null) {
                    abstractC2938JdR2.A0S();
                }
            }
            AbstractC2927JdF.A02(abstractC2938JdR);
            MNF mnf = lpq2.A0A;
            if (mnf != null) {
                mnf.C3P(lpq2);
            }
        }
        abstractC2938JdR.A00 = f;
        if (((AbstractC2927JdF) abstractC2938JdR).A02) {
            return;
        }
        AbstractC2927JdF.A01(abstractC2938JdR, new LPX(abstractC2938JdR.A0N(), abstractC2938JdR));
    }

    public static final void A0F(AbstractC2938JdR abstractC2938JdR, boolean z) {
        MNF mnf;
        if (abstractC2938JdR.A03 == null) {
            ML3 ml3 = abstractC2938JdR.A08;
            if (ml3 == null) {
                if (abstractC2938JdR.A0A != null) {
                    throw AnonymousClass001.A0N("null layer with a non-null layerBlock");
                }
                return;
            }
            Function1 function1 = abstractC2938JdR.A0A;
            if (function1 == null) {
                throw AnonymousClass001.A0N("updateLayerParameters requires a non-null layerBlock");
            }
            LOO loo = A0K;
            loo.CuF(1.0f);
            loo.CuG(1.0f);
            loo.Clf(1.0f);
            if (loo.A04 != 0.0f) {
                loo.A05 |= 32;
                loo.A04 = 0.0f;
            }
            long j = KZc.A00;
            loo.Cli(j);
            long j2 = loo.A08;
            long j3 = LDp.A01;
            if (j2 != j) {
                loo.A05 |= 128;
                loo.A08 = j;
            }
            if (loo.A01 != 8.0f) {
                loo.A05 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                loo.A01 = 8.0f;
            }
            loo.Cvj(L3m.A01);
            loo.CuV(KZd.A00);
            if (loo.A0E) {
                loo.A05 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                loo.A0E = false;
            }
            loo.A07 = 9205357640488583168L;
            loo.A0A = null;
            loo.A05 = 0;
            LPQ lpq = abstractC2938JdR.A0H;
            loo.A0C = lpq.A0C;
            loo.A0D = lpq.A0D;
            loo.A07 = KvR.A01(((L56) abstractC2938JdR).A03);
            ((AndroidComposeView) Kx3.A00(lpq)).A0g.A00(abstractC2938JdR, M3K.A00(function1, 43), A0P);
            Km6 km6 = abstractC2938JdR.A05;
            if (km6 == null) {
                km6 = new Km6();
                abstractC2938JdR.A05 = km6;
            }
            km6.A04 = loo.A02;
            km6.A05 = loo.A03;
            km6.A06 = 0.0f;
            km6.A07 = 0.0f;
            km6.A01 = 0.0f;
            km6.A02 = 0.0f;
            km6.A03 = 0.0f;
            km6.A00 = loo.A01;
            km6.A08 = loo.A09;
            ml3.D7A(loo);
            abstractC2938JdR.A0B = loo.A0E;
            abstractC2938JdR.A0E = loo.A00;
            if (!z || (mnf = lpq.A0A) == null) {
                return;
            }
            mnf.C3P(lpq);
        }
    }

    private final float A0O(long j, long j2) {
        float f = (int) (((L56) this).A03 >> 32);
        float f2 = 1.0f / 0.0f;
        if (f < LCr.A01(j2) || JR0.A0I(r0) < LCr.A00(j2)) {
            long A06 = A06(this, j2);
            float A01 = LCr.A01(A06);
            float A00 = LCr.A00(A06);
            float A002 = DKH.A00(j);
            float max = Math.max(0.0f, A002 < 0.0f ? -A002 : A002 - f);
            float A02 = JR1.A02(j);
            long A003 = KvH.A00(max, Math.max(0.0f, A02 < 0.0f ? -A02 : A02 - JR0.A0I(r0)));
            if ((A01 > 0.0f || A00 > 0.0f) && DKH.A00(A003) <= A01 && JR1.A02(A003) <= A00) {
                float A004 = DKF.A00(A003);
                float A022 = JR1.A02(A003);
                return (A004 * A004) + (A022 * A022);
            }
        }
        return f2;
    }

    private final boolean A0e(long j) {
        ML3 ml3;
        long j2 = (j & 9187343241974906880L) ^ 9187343241974906880L;
        boolean z = false;
        if (AnonymousClass001.A1O((((j2 ^ (-1)) & (j2 - 4294967297L) & (-9223372034707292160L)) > 0L ? 1 : (((j2 ^ (-1)) & (j2 - 4294967297L) & (-9223372034707292160L)) == 0L ? 0 : -1))) && ((ml3 = this.A08) == null || !this.A0B || ml3.BTO(j))) {
            z = true;
        }
        return z;
    }

    @Override // X.L56
    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A0E(graphicsLayer, this, null, f, j);
    }

    @Override // X.L56
    public void A0K(Function1 function1, float f, long j) {
        A0E(null, this, function1, f, j);
    }

    public LPR A0P() {
        return this instanceof C2943Je8 ? ((C2943Je8) this).A01.A03 : ((C2942Je7) this).A01;
    }

    public AbstractC2941JdU A0Q() {
        return this instanceof C2943Je8 ? ((C2943Je8) this).A02 : ((C2942Je7) this).A00;
    }

    public final AbstractC2938JdR A0R(AbstractC2938JdR abstractC2938JdR) {
        LPQ lpq = abstractC2938JdR.A0H;
        LPQ lpq2 = lpq;
        LPQ lpq3 = this.A0H;
        LPQ lpq4 = lpq3;
        if (lpq != lpq3) {
            while (lpq2.A00 > lpq3.A00) {
                lpq2 = lpq2.A0E();
                11T.A0D(lpq2);
            }
            while (lpq4.A00 > lpq2.A00) {
                lpq4 = lpq4.A0E();
                11T.A0D(lpq4);
            }
            while (lpq2 != lpq4) {
                lpq2 = lpq2.A0E();
                lpq4 = lpq4.A0E();
                if (lpq2 == null || lpq4 == null) {
                    throw AnonymousClass001.A0L("layouts are not part of the same hierarchy");
                }
            }
            return lpq4 == lpq3 ? this : lpq2 != lpq ? lpq2.A0T.A06 : abstractC2938JdR;
        }
        LPR A0P2 = abstractC2938JdR.A0P();
        LPR lpr = A0P().A03;
        if (!lpr.A08) {
            throw AnonymousClass001.A0N("visitLocalAncestors called on an unattached node");
        }
        while (true) {
            lpr = lpr.A04;
            if (lpr == null) {
                return this;
            }
            if ((lpr.A01 & 2) != 0 && lpr == A0P2) {
                return abstractC2938JdR;
            }
        }
    }

    public void A0S() {
        ML3 ml3 = this.A08;
        if (ml3 != null) {
            ml3.invalidate();
            return;
        }
        AbstractC2938JdR abstractC2938JdR = this.A07;
        if (abstractC2938JdR != null) {
            abstractC2938JdR.A0S();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0T() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0T():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
    
        if (r317 == 1) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0U() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0U():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e9, code lost:
    
        if (r311 == 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0V() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0V():void");
    }

    public final void A0W() {
        if (this.A08 != null) {
            if (this.A03 != null) {
                this.A03 = null;
            }
            A0c(null, false);
            this.A0H.A0a(false);
        }
    }

    public void A0X(MLE mle, GraphicsLayer graphicsLayer) {
        if (this instanceof C2943Je8) {
            AbstractC2938JdR abstractC2938JdR = this.A06;
            11T.A0D(abstractC2938JdR);
            abstractC2938JdR.A0Y(mle, graphicsLayer);
            if (((AndroidComposeView) Kx3.A00(this.A0H)).A0A) {
                mle.AOh(C2943Je8.A03, 0.5f, 0.5f, JQz.A02(((L56) this).A03) - 0.5f, JR0.A0I(r0) - 0.5f);
                return;
            }
            return;
        }
        LPQ lpq = this.A0H;
        MNF A00 = Kx3.A00(lpq);
        LtK A0C = lpq.A0C();
        int i = A0C.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0C.A02;
            do {
                LPQ lpq2 = (LPQ) objArr[i2];
                if (lpq2.A0R.A0J.A0E) {
                    lpq2.A0T.A04.A0Y(mle, graphicsLayer);
                }
                i2++;
            } while (i2 < i);
        }
        if (((AndroidComposeView) A00).A0A) {
            mle.AOh(C2942Je7.A02, 0.5f, 0.5f, JQz.A02(((L56) this).A03) - 0.5f, JR0.A0I(r0) - 0.5f);
        }
    }

    public final void A0Y(MLE mle, GraphicsLayer graphicsLayer) {
        ML3 ml3 = this.A08;
        if (ml3 != null) {
            ml3.AOc(mle, graphicsLayer);
            return;
        }
        long j = this.A01;
        float A02 = JQz.A02(j);
        float A0I = JR0.A0I(j);
        mle.D55(A02, A0I);
        A0D(mle, graphicsLayer, this);
        mle.D55(-A02, -A0I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0176, code lost:
    
        if (r304 == 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Z(X.MKR r302) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0Z(X.MKR):void");
    }

    public void A0a(Lsx lsx, MK0 mk0, long j, boolean z, boolean z2) {
        boolean z3 = z2;
        if (!(this instanceof C2942Je7)) {
            AbstractC2938JdR abstractC2938JdR = this.A06;
            if (abstractC2938JdR != null) {
                abstractC2938JdR.A0b(lsx, mk0, A03(abstractC2938JdR, j), z, z2);
                return;
            }
            return;
        }
        LPQ lpq = this.A0H;
        if (mk0.Cxn(lpq)) {
            if (!A0e(j)) {
                if (!z) {
                    return;
                }
                float A0O2 = A0O(j, this.A09.D4W(lpq.A0B.Axt()));
                if (Float.isInfinite(A0O2) || Float.isNaN(A0O2)) {
                    return;
                } else {
                    z3 = false;
                }
            }
            int i = lsx.A00;
            LtK A0C = lpq.A0C();
            int i2 = A0C.A00;
            if (i2 > 0) {
                int i3 = i2 - 1;
                Object[] objArr = A0C.A02;
                do {
                    LPQ lpq2 = (LPQ) objArr[i3];
                    if (lpq2.A0R.A0J.A0E) {
                        mk0.AF2(lsx, lpq2, j, z, z3);
                        long A00 = Lsx.A00(lsx);
                        if (DKH.A00(A00) < 0.0f && JR0.A0I(A00) != 0) {
                            if (!lsx.A02) {
                                break;
                            } else {
                                lsx.A00 = lsx.size() - 1;
                            }
                        }
                    }
                    i3--;
                } while (i3 >= 0);
            }
            lsx.A00 = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0219, code lost:
    
        if (X.KUf.A00(X.Lsx.A00(r302), (X.4YV.A03(r307 ? 1 : 0) & 4294967295L) | (java.lang.Float.floatToIntBits(r320) << 32)) > 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0b(X.Lsx r302, X.MK0 r303, long r304, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0b(X.Lsx, X.MK0, long, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r301.A0F != r0.A0D) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0c(kotlin.jvm.functions.Function1 r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.A0c(kotlin.jvm.functions.Function1, boolean):void");
    }

    public final boolean A0d() {
        if (this.A08 != null && this.A0E <= 0.0f) {
            return true;
        }
        AbstractC2938JdR abstractC2938JdR = this.A07;
        if (abstractC2938JdR != null) {
            return abstractC2938JdR.A0d();
        }
        return false;
    }

    public float AhL() {
        return this.A0H.A0C.AhL();
    }

    public float Amu() {
        return this.A0H.A0C.Amu();
    }

    public KMW AtT() {
        return this.A0H.A0D;
    }

    @Override // X.MKq
    public final MKq B1N() {
        if (!A0P().A08) {
            throw AnonymousClass001.A0N("LayoutCoordinate operations are only valid when isAttached is true");
        }
        A0T();
        return this.A0H.A0T.A04.A07;
    }

    @Override // X.MKq
    public final long BB7() {
        return ((L56) this).A03;
    }

    @Override // X.MKq
    public boolean BQl() {
        return A0P().A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r301.A0H.A0A == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BX9() {
        /*
            r301 = this;
            r0 = r301
            X.ML3 r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r301
            boolean r0 = r0.A0D
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L22
            r0 = r301
            X.LPQ r0 = r0.A0H
            r302 = r0
            r0 = r302
            X.MNF r0 = r0.A0A
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L26:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.BX9():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r307 == null) goto L16;
     */
    /* JADX WARN: Type inference failed for: r309v3, types: [X.KTM, java.lang.Object] */
    @Override // X.MKq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.L5L BZ3(X.MKq r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2938JdR.BZ3(X.MKq, boolean):X.L5L");
    }

    @Override // X.MKq
    public long BZ8(MKq mKq, long j) {
        return BZ9(mKq, j, true);
    }

    @Override // X.MKq
    public long BZ9(MKq mKq, long j, boolean z) {
        if (mKq instanceof LOt) {
            ((LOt) mKq).A00.A04.A0T();
            return mKq.BZ9(this, j ^ (-9223372034707292160L), true) ^ (-9223372034707292160L);
        }
        11T.A0I(mKq, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        AbstractC2938JdR abstractC2938JdR = (AbstractC2938JdR) mKq;
        abstractC2938JdR.A0T();
        AbstractC2938JdR A0R = A0R(abstractC2938JdR);
        while (abstractC2938JdR != A0R) {
            j = A04(abstractC2938JdR, j);
            abstractC2938JdR = abstractC2938JdR.A07;
            11T.A0D(abstractC2938JdR);
        }
        return A05(A0R, j);
    }

    @Override // X.MKq
    public long BZC(long j) {
        if (!A0P().A08) {
            throw AnonymousClass001.A0N("LayoutCoordinate operations are only valid when isAttached is true");
        }
        A0T();
        AbstractC2938JdR abstractC2938JdR = this;
        do {
            j = A04(abstractC2938JdR, j);
            abstractC2938JdR = abstractC2938JdR.A07;
        } while (abstractC2938JdR != null);
        return j;
    }

    @Override // X.MKq
    public long BZE(long j) {
        long BZC = BZC(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) Kx3.A00(this.A0H);
        AndroidComposeView.A0C(androidComposeView);
        return LBd.A00(androidComposeView.A0t, BZC);
    }
}
