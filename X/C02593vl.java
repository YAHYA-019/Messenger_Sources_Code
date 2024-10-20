package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.3vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vl.class */
public final class C02593vl extends C1rj {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Path A06;
    public Typeface A07;
    public Drawable A08;
    public CallerContext A09;
    public 2qZ A0A;
    public C2qg A0B;
    public C2qa A0C;
    public boolean A0D;
    public boolean A0E;

    public C02593vl() {
        super("UserTileFrescoComponent");
    }

    public boolean A0j(1Iw r302, 1Iw r303) {
        if (r302.A09(ContextChain.class) != null) {
            if (!r302.A09(ContextChain.class).equals(r303.A09(ContextChain.class))) {
                return false;
            }
        } else if (r303.A09(ContextChain.class) != null) {
            return false;
        }
        if (r302.A09(C2qy.class) == null) {
            return r303.A09(C2qy.class) == null;
        }
        r302.A09(C2qy.class);
        r303.A09(C2qy.class);
        throw AnonymousClass001.A0Q("equals");
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        return new Drawable();
    }

    public boolean A0o() {
        return true;
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
        accessibilityNodeInfoCompat.A07(1BJ.A00(947));
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        C06974ih c06974ih;
        C4Q4 c4q4 = (C4Q4) r302.A06().A00();
        1OW r305 = null;
        2qZ r0 = this.A0A;
        CallerContext callerContext = this.A09;
        int i = this.A04;
        Path path = this.A06;
        float f = this.A00;
        C2qa c2qa = this.A0C;
        int i2 = this.A05;
        float f2 = this.A01;
        Typeface typeface = this.A07;
        boolean z = this.A0D;
        boolean z2 = this.A0E;
        int i3 = this.A03;
        int i4 = this.A02;
        C2qg c2qg = this.A0B;
        Drawable drawable = this.A08;
        r302.A09(C2qy.class);
        ContextChain contextChain = (ContextChain) r302.A09(ContextChain.class);
        ExS exS = c4q4.A00;
        5BW A00 = 5BS.A00().A00();
        if (5BS.A00().A00().CYP()) {
            exS.A01(path, typeface, drawable, callerContext, contextChain, r302, r0, c2qg, c2qa, f2, f, i, i3, i2, i4, z2, z);
            FFv A002 = exS.A00();
            if (A002 != null && (c06974ih = A002.A0A) != null) {
                r305 = 5BS.A02().CYM(5BS.A03().A04(r302.A0D.getResources(), c06974ih, A002.A02(i), callerContext), null, A00.CYR(), callerContext, 1BJ.A00(302));
            }
        }
        ((C4Vn) r302.A06().A05).A00 = r305;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        int i3 = this.A04;
        Context context = r302.A0D;
        if (i3 <= 0) {
            i3 = C0A8.A00(context, 50.0f);
        }
        if (i3 <= 0) {
            c23p.A01 = 0;
            c23p.A00 = 0;
        } else if (View.MeasureSpec.getMode(i) != 0 || View.MeasureSpec.getMode(i2) != 0) {
            C2ra.A03(c23p, 1.0f, i, i2, i3, i3);
        } else {
            c23p.A01 = i3;
            c23p.A00 = i3;
        }
    }

    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        Integer valueOf;
        Integer num;
        int i = this.A04;
        Context context = r302.A0D;
        if (i <= 0) {
            i = C0A8.A00(context, 50.0f);
        }
        Integer valueOf2 = Integer.valueOf((c27g.A05() - c27g.A02()) - c27g.A03());
        Integer valueOf3 = Integer.valueOf((c27g.A00() - c27g.A04()) - c27g.A01());
        if (i <= 0) {
            num = valueOf2;
            valueOf = valueOf3;
        } else {
            valueOf = Integer.valueOf(i);
            num = valueOf;
        }
        C4Vm c4Vm = (C4Vm) anonymousClass274;
        c4Vm.A03 = valueOf2;
        c4Vm.A02 = valueOf3;
        c4Vm.A01 = num;
        c4Vm.A00 = valueOf;
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C4Vm c4Vm = (C4Vm) anonymousClass274;
        ((C2kr) obj).A02(c4Vm.A01.intValue(), c4Vm.A00.intValue());
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C4Q4 c4q4 = (C4Q4) r302.A06().A00();
        C2kr c2kr = (C2kr) obj;
        2qZ r0 = this.A0A;
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        int i = this.A04;
        int i2 = this.A03;
        Drawable drawable = this.A08;
        C2qa c2qa = this.A0C;
        int i3 = this.A05;
        float f = this.A01;
        Typeface typeface = this.A07;
        float f2 = this.A00;
        C2qg c2qg = this.A0B;
        int i4 = this.A02;
        Path path = this.A06;
        CallerContext callerContext = this.A09;
        r302.A09(C2qy.class);
        ExS exS = c4q4.A00;
        ContextChain contextChain = (ContextChain) r302.A09(ContextChain.class);
        1OW r02 = ((C4Vn) r302.A06().A05).A00;
        C4Vm c4Vm = (C4Vm) anonymousClass274;
        int intValue = c4Vm.A03.intValue();
        int intValue2 = c4Vm.A02.intValue();
        FFv A00 = exS.A00();
        exS.A01(path, typeface, drawable, callerContext, contextChain, r302, r0, c2qg, c2qa, f, f2, i, i2, i3, i4, z, z2);
        long A002 = 1EK.A00();
        1EK.A02();
        try {
            ReqContext A04 = AnonymousClass018.A04("UserTileFrescoComponentSpec", ReqContextTypeResolver.resolveName(AnonymousClass000.A00(228)));
            try {
                FFv A003 = exS.A00();
                if (A003 != null) {
                    if (c2kr.A00 != null && A00 != null && A00 != A003) {
                        ComponentsSystrace.A02("onDetach");
                        if (!A00.A0G) {
                            A00.A0G = true;
                            A00.A09 = null;
                        }
                        A00.A03();
                        ComponentsSystrace.A01();
                    }
                    Drawable drawable2 = A003.A05;
                    if (drawable2 != null) {
                        drawable2.setBounds(0, 0, intValue, intValue2);
                    }
                    Drawable drawable3 = A003.A04;
                    if (drawable3 != null) {
                        drawable3.setBounds(0, 0, intValue, intValue2);
                    }
                    Drawable drawable4 = A003.A05;
                    drawable4.getClass();
                    ComponentsSystrace.A02("createDrawableMatrix");
                    C2jj A004 = C2jj.A01.A00(drawable4, null, intValue, intValue2);
                    ComponentsSystrace.A01();
                    ComponentsSystrace.A02("mountMatrixDrawable");
                    c2kr.A03(drawable4, A004);
                    ComponentsSystrace.A01();
                    ComponentsSystrace.A02("userTileFrescoController:onAttach");
                    A003.A05();
                    ComponentsSystrace.A01();
                    if (r02 != null) {
                        r02.AGD();
                    }
                }
                if (A04 != null) {
                    A04.close();
                }
            } catch (Throwable th) {
                if (A04 != null) {
                    try {
                        A04.close();
                    } catch (Throwable th2) {
                        7kF.A00(th, th2);
                    }
                }
                throw th;
            }
        } finally {
            1EK.A04(A002);
        }
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C4Q4 c4q4 = (C4Q4) r302.A06().A00();
        C2kr c2kr = (C2kr) obj;
        1OW r0 = ((C4Vn) r302.A06().A05).A00;
        FFv A00 = c4q4.A00.A00();
        if (A00 != null) {
            if (!A00.A0G) {
                A00.A0G = true;
                A00.A09 = null;
            }
            A00.A03();
        }
        c2kr.A01();
        if (r0 != null) {
            r0.AGD();
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C4Q4) r303).A00 = (ExS) 1Bn.A0A(99789);
    }

    @Override // X.C1rj
    public void A1O(AnonymousClass274 anonymousClass274, AnonymousClass274 anonymousClass2742) {
        C4Vm c4Vm = (C4Vm) anonymousClass274;
        C4Vm c4Vm2 = (C4Vm) anonymousClass2742;
        c4Vm.A00 = c4Vm2.A00;
        c4Vm.A01 = c4Vm2.A01;
        c4Vm.A02 = c4Vm2.A02;
        c4Vm.A03 = c4Vm2.A03;
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ((C4Vn) interfaceC00783om).A00 = ((C4Vn) interfaceC00783om2).A00;
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
            C02593vl c02593vl = (C02593vl) r302;
            if (this.A0D != c02593vl.A0D || this.A02 != c02593vl.A02) {
                return false;
            }
            C2qg c2qg = this.A0B;
            C2qg c2qg2 = c02593vl.A0B;
            if (c2qg != null) {
                if (!c2qg.equals(c2qg2)) {
                    return false;
                }
            } else if (c2qg2 != null) {
                return false;
            }
            if (this.A0E != c02593vl.A0E) {
                return false;
            }
            CallerContext callerContext = this.A09;
            CallerContext callerContext2 = c02593vl.A09;
            if (callerContext != null) {
                if (!callerContext.equals(callerContext2)) {
                    return false;
                }
            } else if (callerContext2 != null) {
                return false;
            }
            Path path = this.A06;
            Path path2 = c02593vl.A06;
            if (path != null) {
                if (!path.equals(path2)) {
                    return false;
                }
            } else if (path2 != null) {
                return false;
            }
            if (this.A03 != c02593vl.A03) {
                return false;
            }
            Drawable drawable = this.A08;
            Drawable drawable2 = c02593vl.A08;
            if (drawable != null) {
                if (!drawable.equals(drawable2)) {
                    return false;
                }
            } else if (drawable2 != null) {
                return false;
            }
            2qZ r0 = this.A0A;
            2qZ r02 = c02593vl.A0A;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (Float.compare(this.A00, c02593vl.A00) != 0 || this.A04 != c02593vl.A04) {
                return false;
            }
            C2qa c2qa = this.A0C;
            C2qa c2qa2 = c02593vl.A0C;
            if (c2qa != null) {
                if (!c2qa.equals(c2qa2)) {
                    return false;
                }
            } else if (c2qa2 != null) {
                return false;
            }
            if (this.A05 != c02593vl.A05 || Float.compare(this.A01, c02593vl.A01) != 0) {
                return false;
            }
            Typeface typeface = this.A07;
            Typeface typeface2 = c02593vl.A07;
            if (typeface != null) {
                if (!typeface.equals(typeface2)) {
                    return false;
                }
            } else if (typeface2 != null) {
                return false;
            }
        }
        return true;
    }
}
