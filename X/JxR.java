package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.banner.FBPayBanner;
import com.facebookpay.widget.button.FBPayButton;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: JxR.class */
public final class JxR extends JgV implements MIr {
    public static final String __redex_internal_original_name = "ECPNuxFormContentFragment";
    public ContextThemeWrapper A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public ConstraintLayout A0D;
    public NestedScrollView A0E;
    public QWs A0F;
    public QWr A0G;
    public ECPHandler A0H;
    public ECPPaymentRequest A0I;
    public KOY A0J;
    public C3030Jgt A0K;
    public FormLayout A0L;
    public Q2O A0M;
    public LoggingContext A0N;
    public FBPayBanner A0O;
    public FBPayButton A0P;
    public boolean A0Q;
    public boolean A0R;
    public LayoutInflater A0S;
    public final MutableLiveData A0T = JQx.A0a();
    public final Observer A0W = LR9.A01(this, 45);
    public final Observer A0V = LR9.A01(this, 43);
    public final Observer A0X = LR9.A01(this, 47);
    public final Function2 A0a = new GBs(this, 12);
    public final Observer A0Y = LR9.A01(this, 44);
    public final Observer A0U = LR9.A01(this, 42);
    public final LKi A0Z = new LKi(this, 2);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(JxR jxR) {
        ContextThemeWrapper contextThemeWrapper = jxR.A00;
        IBinder iBinder = null;
        if (contextThemeWrapper == null) {
            11T.A0L("wrapperContext");
            throw 0Q8.createAndThrow();
        }
        Object systemService = contextThemeWrapper.getSystemService("input_method");
        11T.A0I(systemService, 4YT.A00(42));
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = jxR.mView;
        if (view != null) {
            iBinder = view.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        View view2 = jxR.mView;
        if (view2 != null) {
            view2.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(JxR jxR) {
        KwN.A01(jxR.A0G(), "otc_back_button");
        7zU.A0b().A0U(jxR.A0H(), "pux_checkout", DKH.A0t(jxR.A0G().A0S));
        new Bundle(jxR.requireArguments()).putBoolean("IS_ECP_NUX_FORM_SCREEN", false);
        C05w c05w = jxR.mParentFragment;
        11T.A0I(c05w, DKB.A00(475));
        ((MLm) c05w).BdB();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void A07(JxR jxR, Integer num) {
        Ri6.A01(jxR);
        C3030Jgt A0G = jxR.A0G();
        jxR.getViewLifecycleOwner();
        A0G.A05(jxR.A0H(), num);
        throw 0Q8.createAndThrow();
    }

    public final C3030Jgt A0G() {
        C3030Jgt c3030Jgt = this.A0K;
        if (c3030Jgt != null) {
            return c3030Jgt;
        }
        11T.A0L("nuxViewModel");
        throw 0Q8.createAndThrow();
    }

    public final LoggingContext A0H() {
        LoggingContext loggingContext = this.A0N;
        if (loggingContext != null) {
            return loggingContext;
        }
        11T.A0L("loggingContext");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MIr
    public boolean Bmr(LoggingContext loggingContext, Integer num) {
        11T.A0H(num, loggingContext);
        C3030Jgt A0G = A0G();
        getViewLifecycleOwner();
        A0G.A05(loggingContext, num);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MIr
    public void CoJ(ECPHandler eCPHandler) {
        String str;
        this.A0H = eCPHandler;
        if (this.A0K != null) {
            A0G().A04(this.A0H);
            ConstraintLayout constraintLayout = this.A0D;
            if (constraintLayout == null) {
                str = "productDetailsContainer";
            } else {
                constraintLayout.setVisibility(8);
                FrameLayout frameLayout = this.A07;
                str = "orderSummaryContainer";
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    LAF A0V = JQz.A0V(KOy.A0A, A0G().A0T);
                    if (A0V != null) {
                        GAW gaw = new GAW(this, 9);
                        if (!A0V.A01) {
                            A0V.A01 = true;
                            gaw.invoke();
                        }
                    }
                    LoggingContext A0H = A0H();
                    KP0 kp0 = KP0.A0P;
                    AbstractC3052Jhk abstractC3052Jhk = new AbstractC3052Jhk(KP0.A0o, A0H(), true);
                    AbstractC3052Jhk abstractC3052Jhk2 = new AbstractC3052Jhk(KP0.A0f, A0H(), true);
                    AbstractC3052Jhk abstractC3052Jhk3 = new AbstractC3052Jhk(KP0.A0c, A0H(), true);
                    AbstractC3052Jhk abstractC3052Jhk4 = new AbstractC3052Jhk(KP0.A0h, A0H(), true);
                    ContextThemeWrapper contextThemeWrapper = this.A00;
                    if (contextThemeWrapper == null) {
                        str = "wrapperContext";
                    } else {
                        QWW qww = new QWW(contextThemeWrapper, A0H());
                        qww.A00 = new LKL(qww, this, 26);
                        LinkedHashMap A09 = 04R.A09(new 03Y[]{JgV.A03(abstractC3052Jhk), JgV.A03(abstractC3052Jhk2), JgV.A03(abstractC3052Jhk3), JgV.A03(qww), JgV.A03(abstractC3052Jhk4)});
                        ECPPaymentRequest eCPPaymentRequest = this.A0I;
                        if (eCPPaymentRequest == null) {
                            str = "ecpPaymentRequest";
                        } else {
                            QWr qWr = new QWr(kp0, A0H, A09, new GBs(this, 13), LD1.A04(eCPPaymentRequest));
                            this.A0G = qWr;
                            FrameLayout frameLayout2 = this.A07;
                            if (frameLayout2 != null) {
                                QWs A092 = qWr.A09(frameLayout2);
                                11T.A0I(A092, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.AccordionViewBinder.AccordionViewHolder");
                                this.A0F = A092;
                                FrameLayout frameLayout3 = this.A07;
                                if (frameLayout3 != null) {
                                    frameLayout3.addView(A092.A0I);
                                    JgV.A04(this, A0G().A0B, 46);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        if (i == 10101) {
            if (i2 != -1 || intent == null) {
                7zU.A0b().A0h(A0H(), DKH.A0t(A0G().A0S));
                return;
            }
            Rem A00 = R44.A00(requireContext(), intent);
            A0G().A00 = A00;
            RgV rgV = RDG.A00;
            Q2O q2o = this.A0M;
            if (q2o == null) {
                11T.A0L("formViewModel");
                throw 0Q8.createAndThrow();
            }
            rgV.A03(A00, q2o);
            7zU.A0b().A0i(A0H(), DKH.A0t(A0G().A0S), AnonymousClass001.A1T(A00.A00), AnonymousClass001.A1T(A00.A01), AnonymousClass001.A1T(A00.A02));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxR.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(370196320);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A00 = A01;
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A01);
        11T.A0A(cloneInContext);
        this.A0S = cloneInContext;
        View inflate = cloneInContext.inflate(2132541896, viewGroup, false);
        0FI.A08(1083732930, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (X.1BK.A1X(r0.A02, true) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxR.onResume():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxR.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
