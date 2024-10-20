package X;

import android.content.Intent;
import com.facebook.payments.checkout.configuration.model.CheckoutConfigPrice;
import com.facebook.payments.checkout.configuration.model.CheckoutEntity;
import com.facebook.payments.checkout.configuration.model.CheckoutInfoCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.CouponCodeCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.FreeTrialCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.MemoCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.NotesCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.PriceAmountInputCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.model.CheckoutAnalyticsParams;
import com.facebook.payments.checkout.model.CheckoutEntryPointType;
import com.facebook.payments.checkout.model.PaymentsPriceTableParams;
import com.facebook.payments.checkout.model.PaymentsPrivacyData;
import com.facebook.payments.checkout.model.SelectedPaymentMethodInput;
import com.facebook.payments.checkout.model.TermsAndPoliciesParams;
import com.facebook.payments.contactinfo.model.EmailInfoCheckoutParams;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.ui.countdowntimer.model.PaymentsCountdownTimerParams;
import com.google.common.collect.ImmutableList;

/* loaded from: GKf.class */
public interface GKf {
    boolean A80();

    Intent AbV();

    CheckoutAnalyticsParams Ac8();

    ImmutableList AcA();

    CheckoutEntity AcB();

    CheckoutInfoCheckoutPurchaseInfoExtension AcC();

    CheckoutInformation AcD();

    ImmutableList AcE();

    ImmutableList AcF();

    ImmutableList AcH();

    EMD AcK();

    CheckoutConfigPrice AcL();

    CouponCodeCheckoutPurchaseInfoExtension Aeo();

    Intent Ahc();

    String Ahm();

    EmailInfoCheckoutParams AjJ();

    CheckoutEntryPointType Ak8();

    FreeTrialCheckoutPurchaseInfoExtension Ana();

    MemoCheckoutPurchaseInfoExtension AwV();

    String Awj();

    NotesCheckoutPurchaseInfoExtension AzW();

    String B0V();

    Qun B0W();

    String B1o();

    PaymentItemType B1z();

    String B21();

    PaymentsCountdownTimerParams B27();

    PaymentsDecoratorParams B28();

    PaymentsPriceTableParams B2J();

    PaymentsPrivacyData B2K();

    PriceAmountInputCheckoutPurchaseInfoExtension B4b();

    ImmutableList B50();

    String B6N();

    SelectedPaymentMethodInput B9k();

    Intent BDX();

    TermsAndPoliciesParams BEh();

    int BG0();

    boolean BR9();

    boolean BSx();

    boolean CxJ();

    boolean Cxd();

    boolean Cxm();

    boolean Cxw();

    boolean CyS();

    boolean CyV();

    boolean Cyb();

    boolean Cyo();

    boolean D8c();

    boolean D8k();
}
