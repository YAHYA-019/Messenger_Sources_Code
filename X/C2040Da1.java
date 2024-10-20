package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.PriceSelectorConfig;
import com.facebook.payments.checkout.configuration.model.PriceSelectorFixedAmountModel;
import com.facebook.payments.checkout.model.CheckoutCommonParams;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.form.model.AmountFormData;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Da1, reason: case insensitive filesystem */
/* loaded from: Da1.class */
public final class C2040Da1 extends 1pK implements GKM, GFP {
    public static final CallerContext A0C = CallerContext.A0B("PriceSelectorFragment");
    public static final String __redex_internal_original_name = "P4PDonationPriceSelectorFragment";
    public LithoView A00;
    public GK3 A01;
    public CheckoutData A02;
    public RuS A03;
    public ETu A04;
    public CustomLinearLayout A05;
    public Context A06;
    public final C00i A07 = DKC.A0W(this, 99010);
    public final C00i A08 = 1BV.A00(1098);
    public final C00i A09 = AbF.A0S(this, 99078);
    public final AtomicBoolean A0B = DKC.A1E(true);
    public final GFX A0A = new FmT(this);

    /* JADX WARN: Multi-variable type inference failed */
    private Ex9 A03() {
        this.mArguments.getClass();
        return ((FFx) this.A07.get()).A04(((CheckoutCommonParams) this.mArguments.getParcelable("checkout_params")).A02.A0F);
    }

    public 1iF A1R() {
        return DKH.A0K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        DKF.A1J(this);
        this.A06 = DKH.A0C(this);
        C1F6 A0P = AbF.A0P(this.A08);
        Context context = getContext();
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            RuS ruS = new RuS(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = ruS;
            GK3 gk3 = this.A01;
            if (gk3 != null) {
                gk3.BzY();
            }
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public String AnR() {
        return "price_selector_fragment_tag";
    }

    public boolean BTn() {
        return this.A0B.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object, X.Es9] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.Qxi, java.lang.Object] */
    public void Bfd(CheckoutData checkoutData) {
        PriceSelectorConfig priceSelectorConfig;
        ImmutableList build;
        CurrencyAmount currencyAmount;
        boolean z;
        String str = null;
        this.A02 = checkoutData;
        FHe fHe = (FHe) this.A09.get();
        SimpleCheckoutData simpleCheckoutData = (SimpleCheckoutData) checkoutData;
        CheckoutCommonParamsCore checkoutCommonParamsCore = simpleCheckoutData.A07.A02;
        if (checkoutCommonParamsCore.A0c) {
            CheckoutInformation checkoutInformation = checkoutCommonParamsCore.A06;
            checkoutInformation.getClass();
            priceSelectorConfig = checkoutInformation.A0A;
        } else {
            priceSelectorConfig = simpleCheckoutData.A05;
        }
        if (priceSelectorConfig == null) {
            z = false;
        } else {
            ImmutableList immutableList = priceSelectorConfig.A02;
            if (09K.A01(immutableList)) {
                build = FHe.A01(priceSelectorConfig.A00, priceSelectorConfig.A03);
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    PriceSelectorFixedAmountModel priceSelectorFixedAmountModel = (PriceSelectorFixedAmountModel) it.next();
                    if (priceSelectorFixedAmountModel != null && (currencyAmount = priceSelectorFixedAmountModel.A00) != null) {
                        builder.m11011add((Object) currencyAmount);
                    }
                }
                build = builder.build();
            }
            ImmutableList.Builder A00 = FHe.A00(fHe, build, FHe.A02(build));
            AmountFormData amountFormData = priceSelectorConfig.A01;
            CurrencyAmount currencyAmount2 = simpleCheckoutData.A0C;
            if (amountFormData != null) {
                String str2 = amountFormData.A05;
                Integer num = 0S2.A01;
                ?? obj = new Object();
                ((Qxi) obj).A01 = str2;
                ((Qxi) obj).A00 = num;
                A00.m11011add((Object) obj);
                if (currencyAmount2 != null) {
                    amountFormData = new AmountFormData(amountFormData.A00, amountFormData.A01, amountFormData.A02.A00(DKF.A0t(currencyAmount2)), amountFormData.A03, amountFormData.A04, str2, amountFormData.A06, amountFormData.A07, amountFormData.A08, amountFormData.A09);
                }
            }
            A00.build();
            String string = fHe.A01.getResources().getString(2131963792);
            str = priceSelectorConfig.A05;
            if (TextUtils.isEmpty(str)) {
                str = string;
            }
            FHe.A03(fHe, amountFormData, string);
            z = true;
        }
        CustomLinearLayout customLinearLayout = this.A05;
        ?? obj2 = new Object();
        obj2.A00 = customLinearLayout;
        if (z) {
            DKF.A1J(this);
            AmountFormData A002 = RbO.A00(getContext(), this.A02);
            if (this.A05.getChildCount() == 0 && A002 != null) {
                RuS ruS = this.A03;
                if (str == null) {
                    str = "";
                }
                ruS.A03 = str;
                ruS.A01((Es9) obj2, A002);
            }
            setVisibility(0);
        }
    }

    public void Bsf(CheckoutData checkoutData) {
    }

    public void CE1() {
        RuS ruS = this.A03;
        if (ruS.BQS()) {
            return;
        }
        String str = ruS.A02;
        RuS.A00(ruS, str, "", RbO.A01(ruS.A05, (C6oh) ruS.A06.get(), ruS.A01, str, false), true);
    }

    public void CsR(ETu eTu) {
        this.A04 = eTu;
    }

    public void CsS(GK3 gk3) {
        this.A01 = gk3;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-770675257);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543005);
        0FI.A08(-833876082, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1392222665);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A03().A01(this);
        0FI.A08(537060193, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-82134096);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A03().A00(this);
        A03().A00.getClass();
        Bfd(A03().A00);
        0FI.A08(-544692257, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = (LithoView) 7zL.A0F(this, 2131367931);
        this.A05 = (CustomLinearLayout) 7zL.A0F(this, 2131364215);
        String string = 7zO.A0D(this).getString(2131955904);
        DKF.A1J(this);
        1Iw A0P = AbI.A0P(this);
        DfW A00 = EVZ.A00(A0P);
        A00.A0g(string);
        A00.A07 = true;
        A00.A01 = EML.A01;
        1LI A0O = A00.A0O(A0C);
        A0O.getClass();
        this.A00.A10(DKE.A0a(A0O, A0P), true);
        this.A03.A00 = this.A0A;
        AtomicBoolean atomicBoolean = this.A0B;
        atomicBoolean.set(false);
        GK3 gk3 = this.A01;
        if (gk3 != null) {
            gk3.C4o(atomicBoolean.get());
        }
    }

    public void setVisibility(int i) {
        this.A01.setVisibility(i);
    }
}
