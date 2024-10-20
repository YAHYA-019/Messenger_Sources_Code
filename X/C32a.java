package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.widget.RoundedCornersFrameLayout;
import com.google.common.base.Preconditions;
import java.lang.ref.WeakReference;

/* renamed from: X.32a, reason: invalid class name */
/* loaded from: 32a.class */
public abstract class C32a extends C31x {
    public C06q A00;
    public Parcelable A01;
    public 1CQ A02;
    public C00i A03;
    public boolean A04;
    public final C00i A05;
    public final 0KB A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;

    public C32a(Context context) {
        super(context);
        ((C31x) this).A00 = (C03903zR) 1Bi.A03(32845);
        Resources resources = context.getResources();
        setCornerRadius(resources.getDimensionPixelSize(2132279305));
        int color = resources.getColor(2132213962);
        Paint paint = ((RoundedCornersFrameLayout) this).A01;
        if (paint != null) {
            paint.setColor(color);
        }
        this.A09 = 1BQ.A02(16852);
        this.A05 = 1BQ.A01();
        this.A08 = 1BV.A00(66804);
        this.A07 = 1BV.A00(66470);
        this.A06 = new AfK(this, 1);
        this.A02 = (1CQ) 1Bi.A03(131252);
        this.A03 = new 1BV(context, 16761);
        hashCode();
        A0U(2132542909);
    }

    private void A00() {
        this.A05.get();
        if (this.A00 == null) {
            C06q c06q = new C06q(new 33D(this) { // from class: X.34v
                public final ViewGroup A00;

                {
                    super(this.getContext());
                    this.A00 = this;
                }

                public View A01(int i) {
                    return this.A00.findViewById(i);
                }

                public boolean A02() {
                    return AnonymousClass001.A1T(this.A00);
                }

                public LayoutInflater A03() {
                    return super/*X.06V*/.A03().cloneInContext(this.A00.getContext());
                }

                public /* bridge */ /* synthetic */ Object A04() {
                    return this.A00;
                }
            });
            this.A00 = c06q;
            06Z r0 = c06q.A00.A03;
            r0.A04 = (C06l) this.A03.get();
            r0.A1K(this.A06, false);
            this.A00.A01();
            C06q c06q2 = this.A00;
            Parcelable parcelable = this.A01;
            06Z r02 = c06q2.A00.A03;
            if (r02.A05 instanceof ViewModelStoreOwner) {
                06Z.A0J(r02, AnonymousClass001.A0N("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
                throw 0Q8.createAndThrow();
            }
            C07l c07l = r02.A06;
            c07l.A03.clear();
            c07l.A02.clear();
            c07l.A04.clear();
            r02.A12(parcelable);
            A0X();
            this.A00.A00.A03.A0k();
        }
    }

    public static void A01(C32a c32a) {
        Preconditions.checkNotNull(c32a.A00, "Caller of this method should ensure that mFragments is not null.");
        c32a.A00.A00.A03.A0n();
        c32a.A00.A00.A03.A1J(c32a.A06);
        c32a.A0Y();
        c32a.A00 = null;
    }

    public 06Z A0W() {
        if (this.A00 == null) {
            A00();
        }
        Preconditions.checkNotNull(this.A00, "mFragments is not null after ensureFragmentHost");
        return this.A00.A00.A03;
    }

    public void A0X() {
        if (this instanceof 37J) {
            37J r0 = (37J) this;
            View AUH = r0.A04.AUH();
            11T.A0I(AUH, 7zK.A00(0));
            r0.A00 = 1pH.A02((ViewGroup) AUH, r0.A0W(), (InterfaceC00633oW) null, false);
        }
    }

    public void A0Y() {
        37J r0;
        1pH r02;
        if (!(this instanceof 37J) || (r02 = (r0 = (37J) this).A00) == null) {
            return;
        }
        r02.A06();
        r0.A00 = null;
    }

    public void A0Z(Fragment fragment) {
        if (this instanceof 37J) {
            37J r0 = (37J) this;
            2Or.A00(fragment, r0.A04);
            if (fragment instanceof 2Oe) {
                2Oe r02 = (2Oe) fragment;
                r02.dismissibleFragmentDelegate = r0.A06;
                r02.screenshotDetectionListener = r0.A07;
            }
        }
    }

    @Override // X.ML5
    public String AWi() {
        return "unknown";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (A0W().A1V() == false) goto L6;
     */
    @Override // X.ML5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bkd() {
        /*
            r301 = this;
            r0 = r301
            X.06Z r0 = r0.A0W()
            r302 = r0
            r0 = r302
            boolean r0 = r0.A1U()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1e
            r0 = r301
            X.06Z r0 = r0.A0W()
            r302 = r0
            r0 = r302
            boolean r0 = r0.A1V()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32a.Bkd():boolean");
    }

    @Override // X.ML5
    public void Bl6() {
        ((C31x) this).A02 = true;
        if (this.A00 == null && (((C81l) this.A07.get()).A00() || C1gs.A00((C1gs) this.A08.get()).AZr(1GD.A05, 36317259911212130L))) {
            A00();
        }
        Preconditions.checkNotNull(this.A00, "mFragments is null in onBeforeContentShown.  Ensure FragmentBubbleContentView is attached to window.");
        this.A00.A00.A03.A0q();
        if (this.A02.A09(22, false)) {
            C1va c1va = (C1va) this.A09.get();
            Context context = getContext();
            06Z A0W = A0W();
            0fH.A17("RageShakeDetector", "setCustomContext, %s", new Object[]{context});
            ((1GU) c1va.A05.get()).AAs();
            c1va.A01 = new WeakReference(context);
            c1va.A00 = A0W;
            C1va.A02(c1va);
            this.A04 = true;
        }
    }

    @Override // X.C31x, X.ML5
    public void BrC() {
        super.BrC();
        C06q c06q = this.A00;
        if (c06q != null) {
            c06q.A00.A03.A0s();
        }
        if (this.A04) {
            C1va c1va = (C1va) this.A09.get();
            0fH.A0n("RageShakeDetector", "clearCustomContext");
            ((1GU) c1va.A05.get()).AAs();
            c1va.A01 = null;
            c1va.A00 = null;
            C1va.A01(c1va);
            this.A04 = false;
        }
    }

    @Override // X.C31x, com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1740288838);
        super.onAttachedToWindow();
        A00();
        0FI.A0C(728247086, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1626930138);
        C06q c06q = this.A00;
        if (c06q != null) {
            this.A01 = c06q.A00();
            A01(this);
        }
        super.onDetachedFromWindow();
        0FI.A0C(196591737, A06);
    }
}
