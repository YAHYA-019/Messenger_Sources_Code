package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;

/* renamed from: X.53o, reason: invalid class name */
/* loaded from: 53o.class */
public final class C53o extends C1rj {
    public int A00;
    public Drawable A01;

    public C53o() {
        super("Progress");
        this.A00 = 0;
    }

    public static Drawable A00(1Iw r301, int i) {
        TypedArray A02 = r301.A02(i, C53r.A03);
        int indexCount = A02.getIndexCount();
        Drawable drawable = null;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= indexCount) {
                A02.recycle();
                return drawable;
            }
            int index = A02.getIndex(i3);
            if (index == 0) {
                drawable = r301.A0D.getDrawable(A02.getResourceId(index, 0));
            }
            i2 = i3 + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1rs, X.53p] */
    public static C53p A01(1Iw r301, int i) {
        C53o c53o = new C53o();
        ?? c1rs = new C1rs(c53o, r301, 0, i);
        c1rs.A01 = c53o;
        c1rs.A00 = r301;
        return c1rs;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new ProgressBar(context);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3om, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ InterfaceC00783om A11() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        Drawable A00 = A00(r302, 0);
        if (A00 != null) {
            this.A01 = A00;
        }
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        Drawable drawable = this.A01;
        if (drawable == null) {
            drawable = A00(r302, R.attr.progressBarStyle);
        }
        ((C53q) r302.A06().A05).A00 = drawable;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 0 || View.MeasureSpec.getMode(i2) != 0) {
            C2ra.A04(c23p, i, i2);
        } else {
            c23p.A01 = 50;
            c23p.A00 = 50;
        }
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ProgressBar progressBar = (ProgressBar) obj;
        int i = this.A00;
        Drawable drawable = ((C53q) r302.A06().A05).A00;
        if (drawable != null) {
            progressBar.setIndeterminateDrawable(drawable);
        }
        if (i == 0 || progressBar.getIndeterminateDrawable() == null) {
            return;
        }
        progressBar.getIndeterminateDrawable().mutate().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ProgressBar progressBar = (ProgressBar) obj;
        int i = this.A00;
        r302.A06();
        if (i != 0 && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().mutate().clearColorFilter();
        }
        progressBar.setIndeterminateDrawable(null);
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ((C53q) interfaceC00783om).A00 = ((C53q) interfaceC00783om2).A00;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C53o c53o = (C53o) r302;
            if (this.A00 != c53o.A00) {
                return false;
            }
            Drawable drawable = this.A01;
            Drawable drawable2 = c53o.A01;
            if (drawable != null) {
                if (!drawable.equals(drawable2)) {
                    return false;
                }
            } else if (drawable2 != null) {
                return false;
            }
        }
        return true;
    }
}
