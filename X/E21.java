package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: E21.class */
public final class E21 extends BJB implements 1pN {
    public static final String __redex_internal_original_name = "ContactCardPreferenceFragment";
    public EdV A00;
    public Eq1 A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public final Edx A07 = new Edx(this);
    public final C1t5 A08 = new Ckh(this, 1);
    public final Edy A09 = new Edy(this);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        C1t6.A00(this, this.A08);
        Eq1 eq1 = (Eq1) 1Lm.A05(requireContext(), 1BM.A01(this), 99794);
        this.A01 = eq1;
        if (eq1 == null) {
            11T.A0L("contactCardPreferenceManager");
            throw 0Q8.createAndThrow();
        }
        Edy edy = this.A09;
        11T.A0F(edy, 0);
        eq1.A00 = edy;
        this.A06 = bundle != null ? bundle.getBoolean("is_first_fetch") : true;
        this.A00 = (EdV) 7zO.A0m(this, 99796);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        Context context;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || (context = getContext()) == null) {
            return;
        }
        A1b();
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131954828;
        c9bw.A01(new FkI(this, 14));
        By5 A00 = c9bw.A00();
        1Iw A0W = 7zL.A0W(context);
        new 1Iw(context);
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        boolean z = this.A05;
        Integer num = this.A03;
        C1972Ay1 c1972Ay1 = new C1972Ay1(this.A07, migColorScheme, this.A02, Integer.valueOf(num != null ? num.intValue() : 1), this.A04, z);
        if (this.A06) {
            if (this.A00 == null) {
                11T.A0L("shareContactPrivacyControlLogger");
                throw 0Q8.createAndThrow();
            }
            this.A06 = false;
        }
        lithoView.A0y(A1Z(c1972Ay1, A0W, A00));
    }

    public boolean Bkd() {
        if (this.A00 != null) {
            return false;
        }
        11T.A0L("shareContactPrivacyControlLogger");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -563789917);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setClickable(true);
        frameLayout.addView(A1Y(layoutInflater, viewGroup));
        0FI.A08(-1563460674, A04);
        return frameLayout;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(1233937110);
        super/*X.DZJ*/.onDestroy();
        Eq1 eq1 = this.A01;
        if (eq1 == null) {
            11T.A0L("contactCardPreferenceManager");
            throw 0Q8.createAndThrow();
        }
        if (eq1.A01) {
            C21S.A01(eq1.A04, (1Uj) 1Br.A0B(eq1.A02));
            eq1.A01 = false;
        }
        eq1.A00 = null;
        0FI.A08(-347951347, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        bundle.putBoolean("is_first_fetch", this.A06);
    }
}
