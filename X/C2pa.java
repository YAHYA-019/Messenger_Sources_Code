package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.2pa, reason: invalid class name */
/* loaded from: 2pa.class */
public final class C2pa extends C1rj {
    public Drawable A00;
    public C1p8 A01;
    public MigColorScheme A02;
    public 2KE A03;
    public CharSequence A04;

    public C2pa() {
        super("ThreadSnippetTextComponent");
    }

    public static C2zi A00(1Iw r301) {
        return new C2zi(r301, new C2pa());
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        CharSequence charSequence = this.A04;
        C1p8 c1p8 = this.A01;
        2KE r0 = this.A03;
        MigColorScheme migColorScheme = this.A02;
        Drawable drawable = this.A00;
        11T.A0F(r302, 0);
        11T.A0F(charSequence, 1);
        11T.A0F(c1p8, 2);
        11T.A0F(r0, 3);
        11T.A0F(migColorScheme, 4);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A2h(C1ro.BASELINE);
        2KD A012 = 2K3.A01(r302, 0);
        A012.A32(false);
        A012.A2z(charSequence);
        A012.A2w(c1p8);
        A012.A2y(r0);
        A012.A2q(1);
        A012.A2x(migColorScheme);
        A012.A2K("thread_last_msg");
        2K3 A2W = A012.A2W();
        if (drawable != null) {
            ?? obj = new Object();
            A2W.A0c(r302, (C23P) obj, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            C1rq A013 = C1rg.A01(r302, null, 0);
            A013.A0k(0.0f);
            A013.A1L(obj.A00);
            A013.A1y(C1ro.FLEX_START);
            A013.A2h(C1ro.CENTER);
            C2cq A00 = C2cp.A00(r302, 0);
            A00.A2a(drawable);
            A013.A2e(A00);
            A01.A2f(A013.A00);
        }
        A01.A2f(A2W);
        return A01.A00;
    }
}
