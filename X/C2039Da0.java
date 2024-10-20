package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.checkout.model.CheckoutCommonParams;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.ui.ImageDetailView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Da0, reason: case insensitive filesystem */
/* loaded from: Da0.class */
public final class C2039Da0 extends 1pK implements GKM, GFP {
    public static final String __redex_internal_original_name = "CheckoutHeaderFragment";
    public GK3 A00;
    public CheckoutCommonParams A01;
    public CheckoutData A02;
    public ImageDetailView A03;
    public FFx A04;
    public EMD A05;
    public FI2 A06;
    public final C00i A07 = 1BQ.A00();
    public final AtomicBoolean A08 = DKC.A1E(true);

    public 1iF A1R() {
        return DKH.A0K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A06 = DKD.A0X();
        this.A04 = (FFx) 7zO.A0m(this, 99010);
        this.A05 = requireArguments().getSerializable("checkout_style");
    }

    public String AnR() {
        return "checkout_header_fragment_tag";
    }

    public boolean BTn() {
        return this.A08.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0258  */
    /* JADX WARN: Type inference failed for: r0v145, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bfd(com.facebook.payments.checkout.model.CheckoutData r302) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2039Da0.Bfd(com.facebook.payments.checkout.model.CheckoutData):void");
    }

    public void Bsf(CheckoutData checkoutData) {
    }

    public void CE1() {
    }

    public void CsR(ETu eTu) {
    }

    public void CsS(GK3 gk3) {
        this.A00 = gk3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(1326781096);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A03 = this.mView;
        0FI.A08(-1172950621, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-509362923);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541694);
        0FI.A08(-205650801, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-471387837);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A03 = null;
        0FI.A08(-256898769, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(2012113117);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A04.A04(this.A05).A01(this);
        0FI.A08(-1954894069, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1997499544);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A04.A04(this.A05).A00(this);
        Bfd(this.A04.A04(this.A05).A00);
        0FI.A08(-884989007, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AtomicBoolean atomicBoolean = this.A08;
        atomicBoolean.set(false);
        GK3 gk3 = this.A00;
        if (gk3 != null) {
            gk3.C4o(atomicBoolean.get());
        }
    }

    public void setVisibility(int i) {
    }
}
