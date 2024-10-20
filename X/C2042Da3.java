package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.ui.PaymentsDividerView;
import com.facebook.payments.ui.PaymentsFragmentHeaderView;
import com.facebook.payments.ui.PriceTableView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.textwithentitiesview.TextWithEntitiesView;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Da3, reason: case insensitive filesystem */
/* loaded from: Da3.class */
public final class C2042Da3 extends 1pK implements GKM, GFP {
    public static final Qpk A0M = Qpk.A01;
    public static final String __redex_internal_original_name = "PriceTableFragment";
    public Context A01;
    public View A02;
    public FFx A03;
    public CheckoutData A04;
    public EMD A05;
    public C6oh A06;
    public PaymentItemType A07;
    public ETu A08;
    public CustomLinearLayout A09;
    public CustomLinearLayout A0A;
    public CustomLinearLayout A0B;
    public CustomLinearLayout A0C;
    public CustomLinearLayout A0D;
    public TextWithEntitiesView A0E;
    public TextWithEntitiesView A0F;
    public GK3 A0G;
    public F7n A0H;
    public FI2 A0I;
    public PaymentsFragmentHeaderView A0J;
    public final C00i A0K = DKG.A0U(this);
    public int A00 = -1;
    public final AtomicBoolean A0L = DKC.A1E(true);

    private PriceTableView A03(CustomLinearLayout customLinearLayout, ImmutableList immutableList, boolean z) {
        PriceTableView A08 = AbG.A08(DKD.A0A(customLinearLayout), customLinearLayout, 2132543588);
        A08.A0F((GFS) null, immutableList);
        A08.setOnClickListener(new CZB(8, this, z));
        return A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (r0.booleanValue() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.payments.ui.PriceTableView A06(com.facebook.widget.CustomLinearLayout r302, com.google.common.collect.ImmutableList r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2042Da3.A06(com.facebook.widget.CustomLinearLayout, com.google.common.collect.ImmutableList, boolean, boolean):com.facebook.payments.ui.PriceTableView");
    }

    public 1iF A1R() {
        return DKH.A0K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = DKH.A0C(this);
        this.A0H = (F7n) 1Bn.A0A(99085);
        this.A03 = (FFx) 1Hv.A02(this.A01, 99010);
        this.A06 = DKG.A0g();
        this.A0I = DKD.A0X();
        this.mArguments.getClass();
        this.A07 = (PaymentItemType) this.mArguments.getSerializable("payment_item_type");
        this.A05 = this.mArguments.getSerializable("extra_checkout_style");
        GK3 gk3 = this.A0G;
        if (gk3 != null) {
            gk3.BzY();
        }
    }

    public String AnR() {
        return A0M.mValue;
    }

    public boolean BTn() {
        return this.A0L.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bfd(com.facebook.payments.checkout.model.CheckoutData r302) {
        /*
            Method dump skipped, instructions count: 2087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2042Da3.Bfd(com.facebook.payments.checkout.model.CheckoutData):void");
    }

    public void Bsf(CheckoutData checkoutData) {
    }

    public void CE1() {
    }

    public void CsR(ETu eTu) {
        this.A08 = eTu;
    }

    public void CsS(GK3 gk3) {
        this.A0G = gk3;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-99559004);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543158);
        0FI.A08(1383550523, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1331869091);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A03.A04(this.A05).A01(this);
        0FI.A08(19825451, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1038476584);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A03.A04(this.A05).A00(this);
        Bfd(this.A03.A04(this.A05).A00);
        0FI.A08(33132688, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A09 = (CustomLinearLayout) 7zL.A0F(this, 2131363324);
        this.A0J = 7zL.A0F(this, 2131364443);
        this.A0B = (CustomLinearLayout) 7zL.A0F(this, 2131366655);
        this.A0D = (CustomLinearLayout) 7zL.A0F(this, 2131368177);
        this.A0A = (CustomLinearLayout) 7zL.A0F(this, 2131365316);
        FIR.A01(requireContext(), this.A09, DKC.A0V(this.A0K));
        ViewStub viewStub = (ViewStub) 7zL.A0F(this, 2131367892);
        int i = 2132543587;
        if (EXE.A00(this.A07)) {
            i = 2132543597;
        }
        this.A02 = DKF.A0C(viewStub, i);
        this.A0F = (TextWithEntitiesView) DKF.A0C((ViewStub) 7zL.A0F(this, 2131363509), 2132541698);
        this.A0C = (CustomLinearLayout) DKF.A0C((ViewStub) 7zL.A0F(this, 2131366757), 2132543179);
        FYT.A00((CompoundButton) 7zL.A0F(this, 2131366758), this, 7);
        this.A0E = (TextWithEntitiesView) DKF.A0C((ViewStub) 7zL.A0F(this, 2131363499), 2132541697);
        AtomicBoolean atomicBoolean = this.A0L;
        atomicBoolean.set(false);
        GK3 gk3 = this.A0G;
        if (gk3 != null) {
            gk3.C4o(atomicBoolean.get());
        }
        if (!EXE.A00(this.A07)) {
            this.A0J.A0F(2131962773);
            this.A0J.setVisibility(0);
            DKF.A1J(this);
            ((ViewGroup) 7zL.A0F(this, 2131363324)).addView(new PaymentsDividerView(getContext(), new int[]{7zO.A0D(this).getDimensionPixelOffset(2132279348), 0, 7zO.A0D(this).getDimensionPixelOffset(2132279327), 0}), 0);
        }
    }

    public void setVisibility(int i) {
        this.A0G.setVisibility(i);
    }
}
