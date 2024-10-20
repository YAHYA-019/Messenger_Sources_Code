package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.litho.ComponentsSystrace;
import com.google.common.base.Objects;

/* renamed from: X.2qf, reason: invalid class name */
/* loaded from: 2qf.class */
public final class C2qf extends C1rj {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Path A06;
    public Typeface A07;
    public Drawable A08;
    public 2qZ A09;
    public C2qg A0A;
    public C2qa A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C2qf() {
        super("UserTileDrawableComponent");
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        Integer valueOf;
        Integer num;
        int i = this.A04;
        Context context = r302.A0D;
        int i2 = 2qN.A0W;
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
        C2qm c2qm = (C2qm) anonymousClass274;
        c2qm.A03 = valueOf2;
        c2qm.A02 = valueOf3;
        c2qm.A01 = num;
        c2qm.A00 = valueOf;
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C2qm c2qm = (C2qm) anonymousClass274;
        ((C2kr) obj).A02(c2qm.A01.intValue(), c2qm.A00.intValue());
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        1tT r0 = r302.A06;
        r0.getClass();
        C2qi c2qi = (C2qi) r0.A00();
        C2kr c2kr = (C2kr) obj;
        2qZ r02 = this.A09;
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        int i = this.A04;
        int i2 = this.A03;
        boolean z3 = this.A0F;
        Drawable drawable = this.A08;
        C2qa c2qa = this.A0B;
        int i3 = this.A05;
        float f = this.A01;
        Typeface typeface = this.A07;
        float f2 = this.A00;
        C2qg c2qg = this.A0A;
        Path path = this.A06;
        int i4 = this.A02;
        String str = this.A0C;
        r302.A09(C2qy.class);
        C2qj c2qj = c2qi.A00;
        C2qm c2qm = (C2qm) anonymousClass274;
        int intValue = c2qm.A03.intValue();
        int intValue2 = c2qm.A02.intValue();
        2qN A00 = c2qj.A00();
        c2qj.A06 = r302.A0D;
        if (z != c2qj.A0G || z2 != c2qj.A0F || i != c2qj.A04 || i2 != c2qj.A03 || z3 != c2qj.A0I || drawable != c2qj.A09 || c2qa != c2qj.A0D || i3 != c2qj.A05 || f != c2qj.A01 || typeface != c2qj.A08 || f2 != c2qj.A00 || !Objects.equal(c2qg, c2qj.A0C) || !Objects.equal(path, c2qj.A07) || !Objects.equal(r02, c2qj.A0B) || i4 != c2qj.A02) {
            c2qj.A0G = z;
            c2qj.A0F = z2;
            c2qj.A04 = i;
            c2qj.A03 = i2;
            c2qj.A0I = z3;
            c2qj.A09 = drawable;
            c2qj.A0D = c2qa;
            c2qj.A05 = i3;
            c2qj.A01 = f;
            c2qj.A08 = typeface;
            c2qj.A00 = f2;
            c2qj.A0C = c2qg;
            c2qj.A07 = path;
            c2qj.A0B = r02;
            c2qj.A02 = i4;
            c2qj.A0E = str;
            c2qj.A0H = true;
        }
        long A002 = 1EK.A00();
        1EK.A02();
        try {
            ReqContext A04 = AnonymousClass018.A04("UserTileDrawableComponentSpec", ReqContextTypeResolver.resolveName("ui_components"));
            try {
                2qN A003 = c2qj.A00();
                if (c2kr.A00 != null && A00 != null && A00 != A003) {
                    ComponentsSystrace.A02("onDetach");
                    A00.A07();
                    A00.A05();
                    ComponentsSystrace.A01();
                }
                A003.A04.setBounds(0, 0, intValue, intValue2);
                Drawable drawable2 = A003.A03;
                if (drawable2 != null) {
                    drawable2.setBounds(0, 0, intValue, intValue2);
                }
                Drawable drawable3 = A003.A04;
                ComponentsSystrace.A02("createDrawableMatrix");
                C2jj A004 = C2jj.A01.A00(drawable3, null, intValue, intValue2);
                ComponentsSystrace.A01();
                ComponentsSystrace.A02("mountMatrixDrawable");
                c2kr.A03(drawable3, A004);
                ComponentsSystrace.A01();
                ComponentsSystrace.A02("userTileDrawableController:onAttach");
                A003.A06();
                ComponentsSystrace.A01();
                if (A04 != null) {
                    A04.close();
                }
            } finally {
            }
        } finally {
            1EK.A04(A002);
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C2qi) r303).A00 = (C2qj) 1Bn.A0E(r302.A0D, (1BY) null, 17097);
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
}
