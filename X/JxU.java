package X;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MediatorLiveData;
import com.facebook.acra.constants.ActionId;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: JxU.class */
public final class JxU extends K83 implements MLR {
    public static final String __redex_internal_original_name = "ECPBottomSheetFragment";
    public ECPHandler A00;
    public ECPPaymentRequest A01;
    public DMd A02;
    public Boolean A03;
    public Boolean A04;
    public final MediatorLiveData A05;
    public final C01i A06;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;
    public final C00m A0A;
    public final C00m A0B;
    public final EyR A0C;

    public JxU() {
        EyR A01 = C06014fk.A01();
        11T.A0A(A01);
        this.A0C = A01;
        this.A05 = new MediatorLiveData();
        this.A07 = C01g.A01(new M3L(this, 45));
        this.A0A = new M3L(this, 44);
        this.A0B = new GAW(this, 0);
        this.A09 = GAW.A00(this, 1);
        this.A06 = C01g.A01(new M3L(this, 43));
        this.A08 = C01g.A01(new M3L(this, 46));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ECPPaymentRequest A05(JxU jxU) {
        ECPPaymentRequest eCPPaymentRequest = jxU.A01;
        if (eCPPaymentRequest == null) {
            Parcelable parcelable = jxU.requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
            eCPPaymentRequest = parcelable instanceof ECPPaymentRequest ? (ECPPaymentRequest) parcelable : null;
            jxU.A01 = eCPPaymentRequest;
        }
        return eCPPaymentRequest;
    }

    private final void A06() {
        Dialog dialog = ((0D2) this).A01;
        if (dialog instanceof DR7) {
            ConstraintLayout constraintLayout = super.A06;
            if (constraintLayout != null) {
                constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new LKk(dialog, this, 2));
            } else {
                11T.A0L("viewContainer");
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A07(JxU jxU) {
        JgV jgV;
        JgV A0b = jxU.getChildFragmentManager().A0b("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        return ((A0b instanceof JgV) && (jgV = A0b) != null && (jgV instanceof JxP)) ? false : true;
    }

    @Override // X.K83
    public Dialog A0n(Bundle bundle) {
        return A0q(new M3L(this, 48));
    }

    @Override // X.K83, X.MLm
    public boolean BrB() {
        A06();
        return super.BrB();
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super/*X.0D2*/.onAttach(context);
        this.A0C.A01(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        DR7 dr7;
        BottomSheetBehavior A05;
        11T.A0F(fragment, 0);
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            if (fragment instanceof MIr) {
                ((MIr) fragment).CoJ(eCPHandler);
            }
            ((C3033Jgw) this.A06.getValue()).A0n(eCPHandler);
        }
        A06();
        DR7 dr72 = ((0D2) this).A01;
        if (!(dr72 instanceof DR7) || (dr7 = dr72) == null || (A05 = dr7.A05()) == null) {
            return;
        }
        A05.A0I(!A07(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        EyR eyR = this.A0C;
        Resources A0D = 7zO.A0D(this);
        11T.A0A(A0D);
        eyR.A02(A0D);
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(947327772);
        super/*X.0D2*/.onCreate(bundle);
        A05(this);
        this.A02 = new DMd(requireContext(), this.A0C);
        MediatorLiveData mediatorLiveData = this.A05;
        mediatorLiveData.addSource(((C3033Jgw) this.A06.getValue()).A0o, LR9.A01(this, 38));
        mediatorLiveData.addSource(((C3030Jgt) this.A08.getValue()).A07, LR9.A01(this, 39));
        C06014fk.A03();
        LZv A0b = 7zU.A0b();
        C01i c01i = this.A07;
        LoggingContext loggingContext = (LoggingContext) c01i.getValue();
        11T.A0F(loggingContext, 0);
        A0b.A01.markerStart(223872662);
        1UD r0 = A0b.A00;
        1ZG r02 = 1ZG.A01;
        LZv.A03(AbF.A08(1UD.A00(r0, r02, "client_fetch_cardscanner_init"), 51), loggingContext, new GBq(loggingContext, (Object) null, 10));
        FJC.A07(C06014fk.A09().A00(), this, LR9.A01(this, 36));
        FJC.A07(C06014fk.A09().A01(), this, LR9.A01(this, 37));
        7zU.A0b().A01.markerPoint(223872662, "CARD_SCANNER_FETCH_STARTED");
        Context context = getContext();
        if (context != null) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager.isEnabled() && autofillManager.isAutofillSupported()) {
                7zU.A0b().A01.markerStart(223872246);
                ((AutofillManager) context.getSystemService(AutofillManager.class)).registerCallback((AutofillManager.AutofillCallback) Kao.A00.getValue());
                LZv A0b2 = 7zU.A0b();
                LoggingContext loggingContext2 = (LoggingContext) c01i.getValue();
                String str = null;
                ComponentName autofillServiceComponentName = ((AutofillManager) context.getSystemService(AutofillManager.class)).getAutofillServiceComponentName();
                if (autofillServiceComponentName != null) {
                    str = autofillServiceComponentName.flattenToShortString();
                }
                11T.A0F(loggingContext2, 0);
                A0b2.A01.markerEnd(223872246, (short) 2);
                LZv.A02(AbF.A08(AbG.A0A(r02, A0b2.A00, "client_enable_platformautofill_success"), 46), loggingContext2, (Object) null, str, 26);
            }
        }
        0FI.A08(-951073789, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(971937823);
        MediatorLiveData mediatorLiveData = this.A05;
        mediatorLiveData.removeSource(((C3033Jgw) this.A06.getValue()).A0o);
        mediatorLiveData.removeSource(((C3030Jgt) this.A08.getValue()).A07);
        Context context = getContext();
        if (context != null) {
            ((AutofillManager) context.getSystemService(AutofillManager.class)).unregisterCallback((AutofillManager.AutofillCallback) Kao.A00.getValue());
        }
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(-1232211660, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1530022880);
        super/*androidx.fragment.app.Fragment*/.onPause();
        requireActivity().setRequestedOrientation(10);
        0FI.A08(-1995717248, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        CheckoutConfiguration checkoutConfiguration;
        int A02 = 0FI.A02(824119500);
        super/*androidx.fragment.app.Fragment*/.onResume();
        EyR eyR = this.A0C;
        Resources A0D = 7zO.A0D(this);
        11T.A0A(A0D);
        eyR.A02(A0D);
        FragmentActivity requireActivity = requireActivity();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        requireActivity.setRequestedOrientation((eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) ? 1 : checkoutConfiguration.A00);
        0FI.A08(1942760132, A02);
    }

    @Override // X.K83
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest != null && LD1.A04(eCPPaymentRequest)) {
            A0r();
            ConstraintLayout constraintLayout = super.A05;
            if (constraintLayout == null) {
                11T.A0L("transparentViewContainer");
                throw 0Q8.createAndThrow();
            }
            LKO.A01(constraintLayout, this, ActionId.ON_VIEW_CREATED_END);
        }
        DR7 dr7 = ((0D2) this).A01;
        if (dr7 instanceof DR7) {
            BottomSheetBehavior A05 = dr7.A05();
            A05.A0I(false);
            A05.A0G(new 94V(this, A05, 2));
        }
    }
}
