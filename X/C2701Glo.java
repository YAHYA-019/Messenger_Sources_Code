package X;

import android.content.Context;
import android.view.View;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Glo, reason: case insensitive filesystem */
/* loaded from: Glo.class */
public final class C2701Glo extends C1rj {
    public static final GR2 A0J = new GR2();
    public float A00;
    public int A01;
    public 6TM A02;
    public 6TN A03;
    public PlayerOrigin A04;
    public GRS A05;
    public HkR A06;
    public GRD A07;
    public GR2 A08;
    public 6UD A09;
    public 6UF A0A;
    public 6TI A0B;
    public 6U2 A0C;
    public GRd A0D;
    public ImmutableList A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public C2701Glo() {
        super("GrootVideoNoFromMeasureComponent");
        this.A08 = A0J;
        this.A0F = Collections.emptyList();
        this.A0H = true;
    }

    public static ITK A00(1Iw r301) {
        return r301.A06().A05;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new GUl(context);
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        C2701Glo c2701Glo = (C2701Glo) r302;
        C2701Glo c2701Glo2 = (C2701Glo) r303;
        Set set = null;
        C2i4 c2i4 = new C2i4(c2701Glo == null ? null : c2701Glo.A0B, c2701Glo2 == null ? null : c2701Glo2.A0B);
        C2i4 c2i42 = new C2i4(c2701Glo == null ? null : c2701Glo.A05, c2701Glo2 == null ? null : c2701Glo2.A05);
        C2i4 c2i43 = new C2i4(c2701Glo == null ? null : c2701Glo.A04, c2701Glo2 == null ? null : c2701Glo2.A04);
        C2i4 c2i44 = new C2i4(c2701Glo == null ? null : c2701Glo.A07, c2701Glo2 == null ? null : c2701Glo2.A07);
        new C2i4(c2701Glo == null ? null : ((C2715Gm2) r304).A01, c2701Glo2 == null ? null : ((C2715Gm2) r305).A01);
        C2i4 c2i45 = new C2i4(c2701Glo == null ? null : ((C2715Gm2) r304).A00, c2701Glo2 == null ? null : ((C2715Gm2) r305).A00);
        C2i4 c2i46 = new C2i4(c2701Glo == null ? null : ((C2715Gm2) r304).A06, c2701Glo2 == null ? null : ((C2715Gm2) r305).A06);
        Set set2 = c2701Glo == null ? null : ((C2715Gm2) r304).A04;
        if (c2701Glo2 != null) {
            set = ((C2715Gm2) r305).A04;
        }
        return GR3.A0O(c2i4, c2i42, c2i43, c2i44, c2i45, c2i46, new C2i4(set2, set));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3om, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ InterfaceC00783om A11() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.66W] */
    @Override // X.C1rj
    public void A1F(1Iw r302) {
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        ?? obj5 = new Object();
        ?? obj6 = new Object();
        6TI r0 = this.A0B;
        GRS grs = this.A05;
        6UF r02 = this.A0A;
        7zT.A1S(r302, r0, grs);
        GR3.A0L(r302, (66W) obj, (66W) obj2, (66W) obj3, (66W) obj4, (66W) obj6, grs, r02, r0);
        A00(r302).A03 = (H2c) ((66W) obj).A00;
        A00(r302).A01 = (H2b) ((66W) obj2).A00;
        A00(r302).A04 = (H2d) ((66W) obj3).A00;
        A00(r302).A02 = (Hgk) ((66W) obj4).A00;
        A00(r302).A05 = (GPl) ((66W) obj5).A00;
        A00(r302).A00 = (GRJ) ((66W) obj6).A00;
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C2715Gm2 c2715Gm2 = (C2715Gm2) 4YU.A0P(r302);
        GUl gUl = (GUl) obj;
        6TI r0 = this.A0B;
        GRS grs = this.A05;
        6U2 r02 = this.A0C;
        6TM r312 = this.A02;
        HkR hkR = this.A06;
        float f = this.A00;
        GRD grd = this.A07;
        boolean z = this.A0H;
        GR2 gr2 = this.A08;
        6TN r03 = this.A03;
        boolean z2 = this.A0G;
        boolean z3 = this.A0I;
        6UD r04 = this.A09;
        GRd gRd = this.A0D;
        GRJ grj = A00(r302).A00;
        H2c h2c = A00(r302).A03;
        H2b h2b = A00(r302).A01;
        H2d h2d = A00(r302).A04;
        Hgk hgk = A00(r302).A02;
        GPl gPl = A00(r302).A05;
        GRB grb = c2715Gm2.A02;
        Integer num = c2715Gm2.A03;
        AtomicBoolean atomicBoolean = c2715Gm2.A05;
        1BL.A1H(gUl, r0, grs);
        11T.A0F(grb, 37);
        C00j.A05("GrootVideoNoFromMeasureComponentSpec.onMount", -2067205572);
        if (r312 == null) {
            try {
                r312 = 6TM.A05;
            } catch (Throwable th) {
                C00j.A01(-1017087338);
                throw th;
            }
        }
        if (atomicBoolean == null) {
            atomicBoolean = DKC.A1E(false);
        }
        GR3.A0N(r302, r312, r03, grs, hkR, grd, grj, h2b, hgk, h2c, grb, gUl, gr2, r04, r0, r02, h2d, gPl, gRd, (Integer) null, (Integer) null, (Integer) null, (Integer) null, num, atomicBoolean, f, 0, z, z2, z3);
        C00j.A01(1503444100);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C2715Gm2 c2715Gm2 = (C2715Gm2) 4YU.A0P(r302);
        GUl gUl = (GUl) obj;
        6TI r0 = this.A0B;
        GRS grs = this.A05;
        6U2 r02 = this.A0C;
        HkR hkR = this.A06;
        GRD grd = this.A07;
        GR2 gr2 = this.A08;
        boolean z = this.A0G;
        6TN r03 = this.A03;
        GRJ grj = A00(r302).A00;
        H2c h2c = A00(r302).A03;
        H2b h2b = A00(r302).A01;
        Hgk hgk = A00(r302).A02;
        GPl gPl = A00(r302).A05;
        View.OnLayoutChangeListener onLayoutChangeListener = c2715Gm2.A07;
        GRB grb = c2715Gm2.A02;
        1BL.A1H(gUl, r0, grs);
        11T.A0F(gr2, 7);
        11T.A0F(grb, 20);
        C00j.A05("GrootVideoNoFromMeasureComponentSpec.onUnmount", 663358565);
        try {
            GR3.A01(onLayoutChangeListener, r302, r03, grs, hkR, grd, grj, h2b, hgk, h2c, grb, gUl, r0, r02, gPl, z);
            C00j.A01(-1144101070);
        } catch (Throwable th) {
            C00j.A01(1633360705);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.66W, X.66V] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.66W, X.66V] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.66W, X.66V] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.66W, X.66V] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.66W, X.66V] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.66W, X.66V] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.66W, X.66V] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C2715Gm2 c2715Gm2 = (C2715Gm2) r303;
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        ?? obj5 = new Object();
        ?? obj6 = new Object();
        ?? obj7 = new Object();
        PlayerOrigin playerOrigin = this.A04;
        6TI r0 = this.A0B;
        int i = this.A01;
        GR2 gr2 = this.A08;
        7zS.A18(0, r302, playerOrigin, r0);
        GR3.A0M(r302, (66V) obj3, (66V) obj, (66V) obj2, (66V) obj4, (66V) obj5, (66V) obj6, (66V) obj7, playerOrigin, gr2, r0, i);
        c2715Gm2.A03 = (Integer) ((66W) obj).A00;
        c2715Gm2.A05 = (AtomicBoolean) ((66W) obj2).A00;
        c2715Gm2.A04 = (Set) ((66W) obj3).A00;
        c2715Gm2.A00 = (Hmw) ((66W) obj4).A00;
        c2715Gm2.A06 = (C15h) ((66W) obj5).A00;
        c2715Gm2.A01 = (I3f) ((66W) obj6).A00;
        c2715Gm2.A02 = (GRB) ((66W) obj7).A00;
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ITK itk = (ITK) interfaceC00783om;
        ITK itk2 = (ITK) interfaceC00783om2;
        itk.A02 = itk2.A02;
        itk.A05 = itk2.A05;
        itk.A01 = itk2.A01;
        itk.A04 = itk2.A04;
        itk.A00 = itk2.A00;
        itk.A03 = itk2.A03;
    }

    @Override // X.C1rj
    public boolean A1Q() {
        GR2 gr2 = this.A08;
        11T.A0F(gr2, 0);
        return gr2.A07;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C2701Glo c2701Glo = (C2701Glo) r302;
            if (this.A0G != c2701Glo.A0G) {
                return false;
            }
            ImmutableList immutableList = this.A0E;
            ImmutableList immutableList2 = c2701Glo.A0E;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            6TM r0 = this.A02;
            6TM r02 = c2701Glo.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            GRD grd = this.A07;
            GRD grd2 = c2701Glo.A07;
            if (grd != null) {
                if (!grd.equals(grd2)) {
                    return false;
                }
            } else if (grd2 != null) {
                return false;
            }
            GRS grs = this.A05;
            GRS grs2 = c2701Glo.A05;
            if (grs != null) {
                if (!grs.equals(grs2)) {
                    return false;
                }
            } else if (grs2 != null) {
                return false;
            }
            HkR hkR = this.A06;
            HkR hkR2 = c2701Glo.A06;
            if (hkR != null) {
                if (!hkR.equals(hkR2)) {
                    return false;
                }
            } else if (hkR2 != null) {
                return false;
            }
            GR2 gr2 = this.A08;
            GR2 gr22 = c2701Glo.A08;
            if (gr2 != null) {
                if (!gr2.equals(gr22)) {
                    return false;
                }
            } else if (gr22 != null) {
                return false;
            }
            if (this.A01 != c2701Glo.A01) {
                return false;
            }
            GRd gRd = this.A0D;
            GRd gRd2 = c2701Glo.A0D;
            if (gRd != null) {
                if (!gRd.equals(gRd2)) {
                    return false;
                }
            } else if (gRd2 != null) {
                return false;
            }
            PlayerOrigin playerOrigin = this.A04;
            PlayerOrigin playerOrigin2 = c2701Glo.A04;
            if (playerOrigin != null) {
                if (!playerOrigin.equals(playerOrigin2)) {
                    return false;
                }
            } else if (playerOrigin2 != null) {
                return false;
            }
            6TN r03 = this.A03;
            6TN r04 = c2701Glo.A03;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            6UF r05 = this.A0A;
            6UF r06 = c2701Glo.A0A;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            6U2 r07 = this.A0C;
            6U2 r08 = c2701Glo.A0C;
            if (r07 != null) {
                if (!r07.equals(r08)) {
                    return false;
                }
            } else if (r08 != null) {
                return false;
            }
            6TI r09 = this.A0B;
            6TI r010 = c2701Glo.A0B;
            if (r09 != null) {
                if (!r09.equals(r010)) {
                    return false;
                }
            } else if (r010 != null) {
                return false;
            }
            List list = this.A0F;
            List list2 = c2701Glo.A0F;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            if (this.A0H != c2701Glo.A0H || this.A0I != c2701Glo.A0I) {
                return false;
            }
            6UD r011 = this.A09;
            6UD r012 = c2701Glo.A09;
            if (r011 != null) {
                if (!r011.equals(r012)) {
                    return false;
                }
            } else if (r012 != null) {
                return false;
            }
            if (Float.compare(this.A00, c2701Glo.A00) != 0) {
                return false;
            }
        }
        return true;
    }
}
