package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.drawee.view.DraweeView;
import com.facebook.samples.zoomable.ZoomableDraweeView;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* renamed from: X.Glg, reason: case insensitive filesystem */
/* loaded from: Glg.class */
public final class C2694Glg extends C1rj {
    public static final CallerContext A05 = CallerContext.A0B("ZoomablePhotoSpec");
    public static final 1Br A06 = 1Bq.A00(49979);
    public static final java.util.Map A07;
    public C69f A00;
    public 2Dp A01;
    public 2Dp A02;
    public java.util.Map A03;
    public boolean A04;

    static {
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        11T.A0A(immutableMap);
        A07 = immutableMap;
    }

    public C2694Glg() {
        super("ZoomablePhoto");
        this.A03 = A07;
    }

    public boolean A0j(1Iw r302, 1Iw r303) {
        return r302.A09(ContextChain.class) != null ? r302.A09(ContextChain.class).equals(r303.A09(ContextChain.class)) : r303.A09(ContextChain.class) == null;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new ZoomableDraweeView(context);
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        C2694Glg c2694Glg = (C2694Glg) r302;
        C2694Glg c2694Glg2 = (C2694Glg) r303;
        2Dp r306 = null;
        2Dp r308 = c2694Glg == null ? null : c2694Glg.A01;
        if (c2694Glg2 != null) {
            r306 = c2694Glg2.A01;
        }
        return !(r308 == null ? AnonymousClass001.A1U(r306) : r308.equals(r306));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3om, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ InterfaceC00783om A11() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        Object obj;
        2Dp r0 = this.A01;
        2Dp r02 = this.A02;
        java.util.Map map = this.A03;
        boolean z = this.A04;
        ContextChain contextChain = (ContextChain) r302.A09(ContextChain.class);
        11T.A0F(r0, 1);
        if (!Hwh.A01 || Hwh.A00 == null) {
            Hwh.A00(r302.A0D);
        }
        ContextChain contextChain2 = new ContextChain(contextChain, "pi", "ZoomablePhotoSpec");
        if (map != null) {
            C6yj.A00(contextChain2, map);
        }
        CallerContext callerContext = A05;
        CallerContext A01 = CallerContext.A01(callerContext, contextChain2);
        IQJ iqj = Hwh.A00;
        C2508Gfo c2508Gfo = new C2508Gfo(iqj.A00, iqj.A01, iqj.A02);
        c2508Gfo.A00 = null;
        if (A01 != null) {
            callerContext = A01;
        }
        ((C69o) c2508Gfo).A02 = callerContext;
        c2508Gfo.A05 = true;
        c2508Gfo.A04 = r02;
        c2508Gfo.A03 = r0;
        c2508Gfo.A07 = true;
        c2508Gfo.A06 = z;
        c2508Gfo.A00 = (5CK) 1Br.A0B(A06);
        c2508Gfo.A05();
        if (c2508Gfo.A03 == null && c2508Gfo.A09 == null && (obj = c2508Gfo.A04) != null) {
            c2508Gfo.A03 = obj;
            c2508Gfo.A04 = null;
        }
        r302.A06().A05.A00 = c2508Gfo.A03();
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) obj;
        C69f c69f = this.A00;
        C69w c69w = r302.A06().A05.A00;
        1BL.A1H(zoomableDraweeView, c69f, c69w);
        zoomableDraweeView.A06(c69w);
        IDm iDm = zoomableDraweeView.A00;
        if (iDm != null) {
            11T.A0I(iDm, "null cannot be cast to non-null type com.facebook.samples.zoomable.DefaultZoomableController");
            iDm.A00 = 3.0f;
            zoomableDraweeView.A05.A00 = new GTf(iDm);
        }
        zoomableDraweeView.A05(c69f);
        zoomableDraweeView.A01 = false;
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DraweeView draweeView = (DraweeView) obj;
        11T.A0F(draweeView, 1);
        draweeView.A06(null);
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ((ITI) interfaceC00783om).A00 = ((ITI) interfaceC00783om2).A00;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C2694Glg c2694Glg = (C2694Glg) r302;
            C69f c69f = this.A00;
            C69f c69f2 = c2694Glg.A00;
            if (c69f != null) {
                if (!c69f.equals(c69f2)) {
                    return false;
                }
            } else if (c69f2 != null) {
                return false;
            }
            2Dp r0 = this.A01;
            2Dp r02 = c2694Glg.A01;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            java.util.Map map = this.A03;
            java.util.Map map2 = c2694Glg.A03;
            if (map != null) {
                if (!map.equals(map2)) {
                    return false;
                }
            } else if (map2 != null) {
                return false;
            }
            if (this.A04 != c2694Glg.A04) {
                return false;
            }
            2Dp r03 = this.A02;
            2Dp r04 = c2694Glg.A02;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
        }
        return true;
    }
}
