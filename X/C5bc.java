package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.5bc, reason: invalid class name */
/* loaded from: 5bc.class */
public final class C5bc extends C1rj {
    public static final Handler A05 = new Handler(Looper.getMainLooper());
    public float A00;
    public Uri A01;
    public CallerContext A02;
    public InterfaceC06154g3 A03;
    public C06974ih A04;

    public C5bc() {
        super("FbFrescoVitoImage");
        this.A00 = 1.0f;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1rs, X.5bd] */
    public static C5bd A00(1Iw r301) {
        C5bc c5bc = new C5bc();
        ?? c1rs = new C1rs(c5bc, r301, 0, 0);
        c1rs.A00 = c5bc;
        c1rs.A01 = r301;
        return c1rs;
    }

    public static void A01(Uri uri, CallerContext callerContext, 4iF r303, C5cl c5cl, C5bj c5bj, InterfaceC06154g3 interfaceC06154g3, C06974ih c06974ih, 1Iw r308) {
        C5bi c5bi;
        ContextChain contextChain;
        int intValue;
        int intValue2;
        C06864i5 A00 = r303.A00(callerContext);
        4iD r0 = A00.A01;
        r0.getClass();
        4hO r02 = A00.A06;
        boolean A002 = 4hO.A00(r02);
        4hL r03 = r02.A00;
        if ((A002 ? r03.AMU() : r03.D8g()) || c5bj == null) {
            C5bj CDE = r0.CDE(4YU.A0E(r308), uri, c5cl.A02, (InterfaceC06154g3) null, c06974ih, (C7hv) null, callerContext);
            c5cl.A02 = CDE;
            c5bi = (C5bi) CDE;
            c5bi.A08 = c5cl;
            r0.BjX(CDE, interfaceC06154g3);
        } else {
            c5bi = (C5bi) c5bj;
            c5bi.A08 = c5cl;
            r0.BjX(c5bj, interfaceC06154g3);
        }
        Integer valueOf = Integer.valueOf(c5bi.A02);
        Integer valueOf2 = Integer.valueOf(c5bi.A01);
        if (callerContext == null || (contextChain = callerContext.A01) == null || valueOf == null || valueOf2 == null || (intValue = valueOf.intValue()) <= 0 || (intValue2 = valueOf2.intValue()) <= 0) {
            return;
        }
        contextChain.A01("expected_response_size", Integer.valueOf(intValue + intValue2));
    }

    public static void A0L(CallerContext callerContext, 4iF r302, C5cl c5cl, C5bj c5bj) {
        C06864i5 A00 = r302.A00(callerContext);
        4hO r0 = A00.A06;
        boolean A002 = 4hO.A00(r0);
        4hL r02 = r0.A00;
        if (!(A002 ? r02.AMU() : r02.D8g()) && c5bj != null) {
            ((C5bi) c5bj).A08 = c5cl;
            4iD r03 = A00.A01;
            r03.getClass();
            r03.BtN(c5bj);
            return;
        }
        C5bj c5bj2 = c5cl.A02;
        if (c5bj2 != null) {
            4iD r04 = A00.A01;
            r04.getClass();
            r04.BtN(c5bj2);
        }
    }

    public static void A0M(C5bj c5bj) {
        Runnable runnable;
        C5bi c5bi = (C5bi) c5bj;
        synchronized (c5bi) {
            runnable = c5bi.A0F;
            c5bi.A0F = null;
        }
        if (runnable != null) {
            A05.removeCallbacks(runnable);
        }
    }

    public boolean A0j(1Iw r302, 1Iw r303) {
        return r302.A09(ContextChain.class) != null ? r302.A09(ContextChain.class).equals(r303.A09(ContextChain.class)) : r303.A09(ContextChain.class) == null;
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        return new C5cl();
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        C5bc c5bc = (C5bc) r302;
        C5bc c5bc2 = (C5bc) r303;
        C06974ih c06974ih = null;
        Uri uri = c5bc == null ? null : c5bc.A01;
        Uri uri2 = c5bc2 == null ? null : c5bc2.A01;
        Float f = null;
        Float f2 = null;
        if (c5bc != null) {
            f = Float.valueOf(c5bc.A00);
        }
        if (c5bc2 != null) {
            f2 = Float.valueOf(c5bc2.A00);
        }
        C06974ih c06974ih2 = c5bc == null ? null : ((C5bg) r304).A02;
        if (c5bc2 != null) {
            c06974ih = ((C5bg) r305).A02;
        }
        ((4iF) 1Bi.A03(116410)).A00((CallerContext) null);
        boolean z = true;
        if (0Ig.A00(uri, uri2) && 0Ig.A00(c06974ih2, c06974ih) && 0Ig.A00(f, f2)) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.274, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ AnonymousClass274 A10() {
        return new Object();
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

    @Override // X.C1rj
    public void A18(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 1Iw r304, AnonymousClass274 anonymousClass274) {
        accessibilityNodeInfoCompat.A07("android.widget.ImageView");
    }

    @Override // X.C1rj
    public void A1D(1Iw r302) {
        C5bg c5bg = (C5bg) r302.A06().A00();
        C5bj c5bj = c5bg.A01;
        C06864i5 A00 = ((4iF) 1Bi.A03(116410)).A00(c5bg.A00);
        4hO r0 = A00.A06;
        if (4hO.A00(r0) && r0.A01.AZk(36310718677124108L) && c5bj != null) {
            4iD r02 = A00.A01;
            r02.getClass();
            r02.BtN(c5bj);
        }
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        C5bg c5bg = (C5bg) r302.A06().A00();
        C5bj c5bj = null;
        Uri uri = this.A01;
        InterfaceC06154g3 interfaceC06154g3 = this.A03;
        C5bj c5bj2 = c5bg.A01;
        C06974ih c06974ih = c5bg.A02;
        CallerContext callerContext = c5bg.A00;
        4iF r0 = (4iF) 1Bi.A03(116410);
        4hO r02 = r0.A00(callerContext).A06;
        boolean A00 = 4hO.A00(r02);
        4hL r03 = r02.A00;
        if (!(A00 ? r03.AMU() : r03.D8g())) {
            4iD r04 = r0.A00(callerContext).A01;
            r04.getClass();
            c5bj = r04.CDE(r302.A0D.getResources(), uri, c5bj2, interfaceC06154g3, c06974ih, (C7hv) null, callerContext);
            if (c5bj2 != c5bj && r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{c5bj}, (-1) << (-1)));
            }
        }
        ((C5bf) r302.A06().A05).A00 = c5bj;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        C2ra.A02(c23p, this.A00, i, i2);
    }

    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        int i;
        int i2;
        C5bj c5bj = ((C5bf) r302.A06().A05).A00;
        int A052 = c27g.A05();
        int A00 = c27g.A00();
        if (c27g.A01) {
            i = c27g.A02() + c27g.A03();
            i2 = c27g.A04() + c27g.A01();
        } else {
            i = 0;
            i2 = 0;
        }
        Rect rect = new Rect(0, 0, A052 - i, A00 - i2);
        if (c5bj != null) {
            C5bi c5bi = (C5bi) c5bj;
            c5bi.A02 = A052;
            c5bi.A01 = A00;
        }
        ((C5bn) anonymousClass274).A00 = rect;
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C5bg c5bg = (C5bg) r302.A06().A00();
        C5cl c5cl = (C5cl) obj;
        Uri uri = this.A01;
        InterfaceC06154g3 interfaceC06154g3 = this.A03;
        CallerContext callerContext = c5bg.A00;
        C06974ih c06974ih = c5bg.A02;
        C5bj c5bj = ((C5bf) r302.A06().A05).A00;
        Rect rect = ((C5bn) anonymousClass274).A00;
        4iF r0 = (4iF) 1Bi.A03(116410);
        c5cl.A00 = rect;
        4hO r02 = r0.A00(callerContext).A06;
        boolean A00 = 4hO.A00(r02);
        4hL r03 = r02.A00;
        if ((A00 ? r03.AMR() : r03.AMY()) && c5bj != null) {
            A0M(c5bj);
        }
        if (r02.A02()) {
            A01(uri, callerContext, r0, c5cl, c5bj, interfaceC06154g3, c06974ih, r302);
        }
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        Activity A00;
        C5bg c5bg = (C5bg) r302.A06().A00();
        C5cl c5cl = (C5cl) obj;
        Uri uri = this.A01;
        InterfaceC06154g3 interfaceC06154g3 = this.A03;
        CallerContext callerContext = c5bg.A00;
        C06974ih c06974ih = c5bg.A02;
        C5bj c5bj = ((C5bf) r302.A06().A05).A00;
        Rect rect = ((C5bn) anonymousClass274).A00;
        4iF r0 = (4iF) 1Bi.A03(116410);
        c5cl.A00 = rect;
        4hO r02 = r0.A00(callerContext).A06;
        boolean A002 = 4hO.A00(r02);
        4hL r03 = r02.A00;
        if ((A002 ? r03.AMR() : r03.AMY()) && c5bj != null) {
            A0M(c5bj);
        }
        if (!4hO.A00(r02) && r02.A01.AZk(36323010868824205L) && (A00 = 4bQ.A00(r302.A0D)) != null && A00.getWindow() != null) {
            A00.getWindow().setColorMode(1);
        }
        if (r02.A02()) {
            return;
        }
        A01(uri, callerContext, r0, c5cl, c5bj, interfaceC06154g3, c06974ih, r302);
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C5cl c5cl = (C5cl) obj;
        CallerContext callerContext = ((C5bg) r302.A06().A00()).A00;
        C5bj c5bj = ((C5bf) r302.A06().A05).A00;
        4iF r0 = (4iF) 1Bi.A03(116410);
        4hO r02 = r0.A00(callerContext).A06;
        boolean A00 = 4hO.A00(r02);
        4hL r03 = r02.A00;
        if (!(A00 ? r03.AMR() : r03.AMY()) || c5bj == null) {
            if (r02.A02()) {
                A0L(callerContext, r0, c5cl, c5bj);
            }
        } else {
            A0M(c5bj);
            J1r j1r = new J1r(callerContext, r0, c5cl, c5bj);
            C5bi c5bi = (C5bi) c5bj;
            synchronized (c5bi) {
                c5bi.A0F = j1r;
            }
            A05.postDelayed(j1r, 80);
        }
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C5cl c5cl = (C5cl) obj;
        CallerContext callerContext = ((C5bg) r302.A06().A00()).A00;
        C5bj c5bj = ((C5bf) r302.A06().A05).A00;
        4iF r0 = (4iF) 1Bi.A03(116410);
        4hO r02 = r0.A00(callerContext).A06;
        if (r02.A02()) {
            return;
        }
        if (r02.A01.AZk(4hO.A00(r02) ? 2342153727890883597L : 2342153727891014671L)) {
            boolean A00 = 4hO.A00(r02);
            4hL r03 = r02.A00;
            if ((A00 ? r03.AMR() : r03.AMY()) && c5bj != null) {
                A0M(c5bj);
            }
            A0L(callerContext, r0, c5cl, c5bj);
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C5bg c5bg = (C5bg) r303;
        C5bj c5bj = null;
        Uri uri = this.A01;
        C06974ih c06974ih = this.A04;
        CallerContext callerContext = this.A02;
        InterfaceC06154g3 interfaceC06154g3 = this.A03;
        ContextChain contextChain = (ContextChain) r302.A09(ContextChain.class);
        4iF r0 = (4iF) 1Bi.A03(116410);
        CallerContext A01 = CallerContext.A01(callerContext, contextChain);
        4hO r02 = r0.A00(A01).A06;
        if (c06974ih == null) {
            c06974ih = C06974ih.A0Q;
        }
        boolean A00 = 4hO.A00(r02);
        4hL r03 = r02.A00;
        if (!(A00 ? r03.AMU() : r03.D8g())) {
            4iD r04 = r0.A00(A01).A01;
            r04.getClass();
            c5bj = r04.AL1(r302.A0D.getResources(), uri, interfaceC06154g3, c06974ih, (C7hv) null, A01);
        }
        c5bg.A01 = c5bj;
        c5bg.A00 = A01;
        c5bg.A02 = c06974ih;
    }

    @Override // X.C1rj
    public void A1O(AnonymousClass274 anonymousClass274, AnonymousClass274 anonymousClass2742) {
        ((C5bn) anonymousClass274).A00 = ((C5bn) anonymousClass2742).A00;
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ((C5bf) interfaceC00783om).A00 = ((C5bf) interfaceC00783om2).A00;
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1V() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1X() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C5bc c5bc = (C5bc) r302;
            CallerContext callerContext = this.A02;
            CallerContext callerContext2 = c5bc.A02;
            if (callerContext != null) {
                if (!callerContext.equals(callerContext2)) {
                    return false;
                }
            } else if (callerContext2 != null) {
                return false;
            }
            if (Float.compare(this.A00, c5bc.A00) != 0) {
                return false;
            }
            InterfaceC06154g3 interfaceC06154g3 = this.A03;
            InterfaceC06154g3 interfaceC06154g32 = c5bc.A03;
            if (interfaceC06154g3 != null) {
                if (!interfaceC06154g3.equals(interfaceC06154g32)) {
                    return false;
                }
            } else if (interfaceC06154g32 != null) {
                return false;
            }
            C06974ih c06974ih = this.A04;
            C06974ih c06974ih2 = c5bc.A04;
            if (c06974ih != null) {
                if (!c06974ih.equals(c06974ih2)) {
                    return false;
                }
            } else if (c06974ih2 != null) {
                return false;
            }
            Uri uri = this.A01;
            Uri uri2 = c5bc.A01;
            if (uri != null) {
                if (!uri.equals(uri2)) {
                    return false;
                }
            } else if (uri2 != null) {
                return false;
            }
        }
        return true;
    }
}
