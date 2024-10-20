package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import com.facebook.inject.FbInjector;

/* loaded from: Dxu.class */
public final class Dxu extends C1rj {
    public ColorFilter A00;

    public Dxu() {
        super("TypingItemDotsImageViewComponent");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        C1F6 c1f6 = (C1F6) 1Bn.A0A(731);
        ImageView imageView = new ImageView(context);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            DNN dnn = new DNN(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            imageView.setImageDrawable(dnn);
            return imageView;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        AbR A0U = DKC.A0U(729);
        Context context = r302.A0D;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0U);
        try {
            EoA eoA = new EoA(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            c23p.A01 = eoA.A03;
            c23p.A00 = eoA.A02 + (C0A8.A00(context, 6.0f) * 2);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ColorFilter colorFilter = this.A00;
        DNN drawable = ((ImageView) obj).getDrawable();
        if (drawable != null) {
            if (colorFilter != null) {
                drawable.setColorFilter(colorFilter);
            }
            drawable.start();
        }
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DQC dqc = (DQC) obj;
        DNN drawable = dqc.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(null);
            drawable.stop();
        }
        dqc.A00 = false;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            ColorFilter colorFilter = this.A00;
            ColorFilter colorFilter2 = ((Dxu) r302).A00;
            if (colorFilter != null) {
                if (!colorFilter.equals(colorFilter2)) {
                    return false;
                }
            } else if (colorFilter2 != null) {
                return false;
            }
        }
        return true;
    }
}
