package androidx.compose.ui.graphics.layer;

import X.AnonymousClass001;
import X.C2820Jac;
import X.C2905Jct;
import X.C2906Jcu;
import X.DKH;
import X.JQx;
import X.JQy;
import X.JR1;
import X.Jcs;
import X.KMW;
import X.KR7;
import X.KUR;
import X.KUa;
import X.KZH;
import X.KZf;
import X.Kkj;
import X.KvI;
import X.KvR;
import X.L5L;
import X.LCr;
import X.LOR;
import X.LOf;
import X.M4x;
import X.MBY;
import X.MHx;
import X.MLe;
import X.MLu;
import X.MNh;
import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* loaded from: GraphicsLayer.class */
public final class GraphicsLayer {
    public static final MBY A0K = LOf.A00;
    public float A00;
    public int A01;
    public long A02;
    public long A05;
    public long A06;
    public Outline A07;
    public MHx A08;
    public MLe A09;
    public MLe A0A;
    public boolean A0E;
    public boolean A0G;
    public KR7 A0H;
    public final MLu A0J;
    public MNh A0B = KZf.A00;
    public KMW A0C = KMW.A01;
    public Function1 A0D = M4x.A00;
    public boolean A0F = true;
    public long A04 = 0;
    public long A03 = 9205357640488583168L;
    public final Kkj A0I = new Object();

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.Kkj] */
    public GraphicsLayer(MLu mLu) {
        this.A0J = mLu;
        mLu.Cmx(false);
        this.A06 = 0L;
        this.A05 = 0L;
        this.A02 = 9205357640488583168L;
    }

    public static final void A00(GraphicsLayer graphicsLayer) {
        Outline outline;
        if (graphicsLayer.A0F) {
            MLu mLu = graphicsLayer.A0J;
            if (mLu.Acr() || mLu.BAJ() > 0.0f) {
                LOR lor = graphicsLayer.A09;
                if (lor != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || lor.A03.isConvex()) {
                        outline = graphicsLayer.A07;
                        if (outline == null) {
                            outline = new Outline();
                            graphicsLayer.A07 = outline;
                        }
                        if (i >= 30) {
                            KUa.A00(outline, lor);
                        } else {
                            if (!(lor instanceof LOR)) {
                                throw AnonymousClass001.A0q("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(lor.A03);
                        }
                        graphicsLayer.A0G = !outline.canClip();
                    } else {
                        Outline outline2 = graphicsLayer.A07;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        outline = null;
                        graphicsLayer.A0G = true;
                    }
                    graphicsLayer.A09 = (MLe) lor;
                    float AWR = mLu.AWR();
                    if (AWR != AWR) {
                        mLu.Clf(AWR);
                    }
                } else {
                    outline = graphicsLayer.A07;
                    if (outline == null) {
                        outline = new Outline();
                        graphicsLayer.A07 = outline;
                    }
                    long A01 = KvR.A01(graphicsLayer.A05);
                    long j = graphicsLayer.A04;
                    long j2 = graphicsLayer.A03;
                    if (j2 != 9205357640488583168L) {
                        A01 = j2;
                    }
                    float A00 = DKH.A00(j);
                    int round = Math.round(A00);
                    float A02 = JR1.A02(j);
                    outline.setRoundRect(round, Math.round(A02), Math.round(A00 + LCr.A01(A01)), Math.round(A02 + LCr.A00(A01)), graphicsLayer.A00);
                    outline.setAlpha(mLu.AWR());
                }
            } else {
                outline = null;
            }
            mLu.Cs8(outline);
        }
        graphicsLayer.A0F = false;
    }

    public static final void A01(GraphicsLayer graphicsLayer) {
        if (graphicsLayer.A0E && graphicsLayer.A01 == 0) {
            Kkj kkj = graphicsLayer.A0I;
            GraphicsLayer graphicsLayer2 = kkj.A02;
            if (graphicsLayer2 != null) {
                graphicsLayer2.A01--;
                A01(graphicsLayer2);
                kkj.A02 = null;
            }
            C2820Jac c2820Jac = kkj.A00;
            if (c2820Jac != null) {
                Object[] objArr = c2820Jac.A03;
                long[] jArr = c2820Jac.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        long j = jArr[i2];
                        if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                            int A08 = 8 - JQx.A08(i2, length);
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= A08) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    r0.A01--;
                                    A01((GraphicsLayer) JQx.A0t(objArr, i2, i4));
                                }
                                j >>= 8;
                                i3 = i4 + 1;
                            }
                            if (A08 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i = i2 + 1;
                        }
                    }
                }
                c2820Jac.A06();
            }
            graphicsLayer.A0J.ANW();
        }
    }

    public static final void A02(GraphicsLayer graphicsLayer) {
        Kkj kkj = graphicsLayer.A0I;
        kkj.A03 = kkj.A02;
        C2820Jac c2820Jac = kkj.A00;
        if (c2820Jac != null && c2820Jac.A01 != 0) {
            C2820Jac c2820Jac2 = kkj.A01;
            if (c2820Jac2 == null) {
                C2820Jac c2820Jac3 = KZH.A00;
                c2820Jac2 = C2820Jac.A02();
                kkj.A01 = c2820Jac2;
            }
            c2820Jac2.A08(c2820Jac);
            c2820Jac.A06();
        }
        kkj.A04 = true;
        graphicsLayer.A0J.CbS(graphicsLayer, graphicsLayer.A0B, graphicsLayer.A0C, graphicsLayer.A0D);
        kkj.A04 = false;
        GraphicsLayer graphicsLayer2 = kkj.A03;
        if (graphicsLayer2 != null) {
            graphicsLayer2.A01--;
            A01(graphicsLayer2);
        }
        C2820Jac c2820Jac4 = kkj.A01;
        if (c2820Jac4 == null || c2820Jac4.A01 == 0) {
            return;
        }
        Object[] objArr = c2820Jac4.A03;
        long[] jArr = c2820Jac4.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                long j = jArr[i2];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A08 = 8 - JQx.A08(i2, length);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= A08) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            r0.A01--;
                            A01((GraphicsLayer) JQx.A0t(objArr, i2, i4));
                        }
                        j >>= 8;
                        i3 = i4 + 1;
                    }
                    if (A08 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i = i2 + 1;
                }
            }
        }
        c2820Jac4.A06();
    }

    public static final void A03(GraphicsLayer graphicsLayer) {
        graphicsLayer.A0H = null;
        graphicsLayer.A09 = null;
        graphicsLayer.A03 = 9205357640488583168L;
        graphicsLayer.A04 = 0L;
        graphicsLayer.A00 = 0.0f;
        graphicsLayer.A0F = true;
        graphicsLayer.A0G = false;
    }

    public final KR7 A04() {
        KR7 kr7 = this.A0H;
        MLe mLe = this.A09;
        if (kr7 == null) {
            if (mLe != null) {
                kr7 = new Jcs(mLe);
            } else {
                long A01 = KvR.A01(this.A05);
                long j = this.A04;
                long j2 = this.A03;
                if (j2 != 9205357640488583168L) {
                    A01 = j2;
                }
                float A00 = DKH.A00(j);
                float A02 = JR1.A02(j);
                float A012 = A00 + LCr.A01(A01);
                float A002 = A02 + LCr.A00(A01);
                float f = this.A00;
                kr7 = f > 0.0f ? new C2906Jcu(KvI.A00(A00, A02, A012, A002, KUR.A00(f, f))) : new C2905Jct(new L5L(A00, A02, A012, A002));
            }
            this.A0H = kr7;
        }
        return kr7;
    }
}
