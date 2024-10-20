package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.forker.Process;
import com.facebook.litho.LithoView;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.picker.model.PickerRunTimeData;
import com.facebook.payments.picker.model.PickerScreenAnalyticsParams;
import com.facebook.payments.picker.model.PickerScreenCommonConfig;
import com.facebook.payments.picker.model.PickerScreenConfig;
import com.facebook.payments.picker.model.PickerScreenStyle;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;
import com.facebook.widget.loadingindicator.LoadingIndicatorView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;

/* renamed from: X.Da9, reason: case insensitive filesystem */
/* loaded from: Da9.class */
public final class C2048Da9 extends 33A implements 2S0 {
    public static final String __redex_internal_original_name = "PickerScreenFragment";
    public Context A00;
    public FIQ A02;
    public DPO A03;
    public GJY A04;
    public GII A05;
    public GFr A06;
    public GFs A07;
    public ETf A08;
    public EfW A09;
    public PickerRunTimeData A0A;
    public PickerScreenConfig A0B;
    public ListView A0D;
    public FII A0F;
    public FI2 A0G;
    public Exy A0H;
    public F8H A0I;
    public C00i A01 = DKD.A0U();
    public C00i A0E = DKG.A0U(this);
    public boolean A0C = false;
    public final EfV A0K = new EfV(this);
    public final GFp A0J = new Fnr(this);
    public final AbsListView.OnScrollListener A0M = new IL5(this, 2);
    public final ETu A0L = new E7Z(this, 11);

    public static StringBuilder A03(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Style ");
        sb.append(obj);
        return sb;
    }

    public static void A04(C2048Da9 c2048Da9) {
        GFr gFr = c2048Da9.A06;
        PickerRunTimeData pickerRunTimeData = c2048Da9.A0A;
        ImmutableList B8M = gFr.B8M(pickerRunTimeData, c2048Da9.A07.B0X(pickerRunTimeData));
        c2048Da9.A03.setNotifyOnChange(false);
        c2048Da9.A03.clear();
        c2048Da9.A03.addAll(B8M);
        0V5.A00(c2048Da9.A03, 1182271177);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A07(View view, ListView listView, int i, long j) {
        if (view instanceof GOS) {
            ((GOS) view).BoD();
        }
    }

    public 1iF A0A() {
        return DKG.A0I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        Intent B7x = this.A0A.B7x();
        Activity A07 = DKH.A07(this);
        if (A07 != null) {
            if (B7x != null) {
                A07.setResult(-1, B7x);
            } else {
                A07.setResult(0);
            }
        }
        PickerScreenConfig pickerScreenConfig = ((SimplePickerRunTimeData) this.A0A).A01;
        FIQ fiq = this.A02;
        PickerScreenAnalyticsParams pickerScreenAnalyticsParams = pickerScreenConfig.B2r().analyticsParams;
        fiq.A07(pickerScreenAnalyticsParams.paymentsFlowStep, pickerScreenAnalyticsParams.paymentsLoggingSessionData, "payflows_back_click");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 101 && i != 102 && i != 201 && i != 501 && i != 502) {
            switch (i) {
                case 402:
                case 403:
                case 404:
                    break;
                default:
                    super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
                    return;
            }
        }
        this.A05.Bhp(intent, this.A0A, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        SimplePickerRunTimeData simplePickerRunTimeData;
        int A02 = 0FI.A02(-1673766538);
        super.onCreate(bundle);
        this.A00 = DKH.A0C(this);
        this.A02 = DKG.A0i();
        this.A03 = (DPO) 1Bn.A0E(this.A00, (1BY) null, 98995);
        this.A09 = (EfW) 1Hv.A02(this.A00, 98977);
        this.A0F = (FII) 1Bn.A0E(this.A00, (1BY) null, 98904);
        this.A0I = (F8H) 1Bn.A0A(99087);
        this.A0G = DKD.A0X();
        PickerScreenConfig pickerScreenConfig = (PickerScreenConfig) requireArguments().getParcelable("extra_picker_screen_config");
        this.A0B = pickerScreenConfig;
        PickerScreenStyle pickerScreenStyle = pickerScreenConfig.B2r().pickerScreenStyle;
        ImmutableMap immutableMap = this.A09.A00;
        if (!immutableMap.containsKey(pickerScreenStyle)) {
            throw AnonymousClass002.A0D(" have not defined association", A03(pickerScreenStyle));
        }
        ETf eTf = (ETf) ((Eq6) immutableMap.get(pickerScreenStyle)).A00.get();
        this.A08 = eTf;
        eTf.A00 = this.A0K;
        ImmutableMap immutableMap2 = this.A09.A00;
        if (!immutableMap2.containsKey(pickerScreenStyle)) {
            throw AnonymousClass002.A0D(" have not defined association", A03(pickerScreenStyle));
        }
        this.A04 = (GJY) ((Eq6) immutableMap2.get(pickerScreenStyle)).A01.get();
        ImmutableMap immutableMap3 = this.A09.A00;
        if (!immutableMap3.containsKey(pickerScreenStyle)) {
            throw AnonymousClass002.A0D(" have not defined association", A03(pickerScreenStyle));
        }
        this.A06 = (GFr) ((Eq6) immutableMap3.get(pickerScreenStyle)).A04.get();
        ImmutableMap immutableMap4 = this.A09.A00;
        if (!immutableMap4.containsKey(pickerScreenStyle)) {
            throw AnonymousClass002.A0D(" have not defined association", A03(pickerScreenStyle));
        }
        this.A07 = (GFs) ((Eq6) immutableMap4.get(pickerScreenStyle)).A05.get();
        DPO dpo = this.A03;
        ImmutableMap immutableMap5 = this.A09.A00;
        if (!immutableMap5.containsKey(pickerScreenStyle)) {
            throw AnonymousClass002.A0D(" have not defined association", A03(pickerScreenStyle));
        }
        GFq gFq = (GFq) ((Eq6) immutableMap5.get(pickerScreenStyle)).A03.get();
        dpo.A01 = this.A0L;
        dpo.A00 = gFq;
        ImmutableMap immutableMap6 = this.A09.A00;
        if (!immutableMap6.containsKey(pickerScreenStyle)) {
            throw AnonymousClass002.A0D(" have not defined association", A03(pickerScreenStyle));
        }
        this.A05 = (GII) ((Eq6) immutableMap6.get(pickerScreenStyle)).A02.get();
        PickerScreenConfig pickerScreenConfig2 = this.A0B;
        pickerScreenConfig2.B2r().analyticsParams.getClass();
        FIQ fiq = this.A02;
        PickerScreenCommonConfig B2r = pickerScreenConfig2.B2r();
        PickerScreenAnalyticsParams pickerScreenAnalyticsParams = B2r.analyticsParams;
        fiq.A06(bundle, pickerScreenAnalyticsParams.paymentsFlowStep, pickerScreenAnalyticsParams.paymentsLoggingSessionData, B2r.paymentItemType);
        LinkedHashMap A01 = F2B.A01(PickerScreenConfig.A00(pickerScreenConfig2));
        if (pickerScreenConfig2.B2r().analyticsParams.paymentsFlowStep == PaymentsFlowStep.A2B) {
            String A00 = JQw.A00(Process.SD_BLACK_HOLE);
            if (bundle == null) {
                DKD.A0e().BZT(A00, A01);
            }
        }
        PickerRunTimeData pickerRunTimeData = this.A0A;
        if (pickerRunTimeData == null && bundle != null) {
            pickerRunTimeData = (PickerRunTimeData) bundle.getParcelable("picker_run_time_data");
            this.A0A = pickerRunTimeData;
        }
        if (pickerRunTimeData == null) {
            ETf eTf2 = this.A08;
            PickerScreenConfig pickerScreenConfig3 = this.A0B;
            if (eTf2 instanceof E6k) {
                simplePickerRunTimeData = new SimplePickerRunTimeData(pickerScreenConfig3);
            } else if (eTf2 instanceof E6j) {
                simplePickerRunTimeData = new SimplePickerRunTimeData(pickerScreenConfig3);
            } else if (eTf2 instanceof E6i) {
                simplePickerRunTimeData = new SimplePickerRunTimeData(pickerScreenConfig3);
            } else {
                if (eTf2 instanceof E6h) {
                    throw AnonymousClass001.A0p();
                }
                simplePickerRunTimeData = new SimplePickerRunTimeData(pickerScreenConfig3);
            }
            this.A0A = simplePickerRunTimeData;
        }
        0FI.A08(526856722, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-86966162);
        boolean A04 = this.A0G.A04();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.A00);
        int i = 2132542044;
        if (A04) {
            i = 2132542133;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        PaymentsDecoratorParams paymentsDecoratorParams = ((SimplePickerRunTimeData) this.A0A).A01.B2r().styleParams.paymentsDecoratorParams;
        FII.A04(inflate, paymentsDecoratorParams.A00, paymentsDecoratorParams.isFullScreenModal);
        0FI.A08(1269127761, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        CountDownTimer countDownTimer;
        int A02 = 0FI.A02(-861348054);
        F8H f8h = this.A0I;
        if (f8h != null) {
            f8h.A02.clear();
            Qxy qxy = f8h.A06;
            if (qxy != null && (countDownTimer = qxy.A02) != null) {
                countDownTimer.cancel();
                qxy.A02 = null;
            }
        }
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        GJY gjy = this.A04;
        if (gjy != null) {
            gjy.AE9();
        }
        0FI.A08(-1016908613, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("picker_run_time_data", this.A0A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.1rs, X.Dre] */
    public void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        super/*X.0kt*/.onViewCreated(view, bundle);
        Context A00 = AnonymousClass016.A00(getContext(), Activity.class);
        if (this.A0B.B2r().A02) {
            View view2 = this.mView;
            LegacyNavigationBar legacyNavigationBar = (LegacyNavigationBar) (view2 == null ? null : view2.findViewById(2131368089));
            if (legacyNavigationBar != null) {
                legacyNavigationBar.setVisibility(0);
                legacyNavigationBar.CvV(((SimplePickerRunTimeData) this.A0A).A01.B2r().title);
                legacyNavigationBar.A0F();
                Typeface typeface = Typeface.DEFAULT_BOLD;
                TextView textView = legacyNavigationBar.A0F;
                textView.setTypeface(typeface);
                legacyNavigationBar.A0G();
                textView.setTextColor(2Me.A02.A02(getContext()));
                legacyNavigationBar.Cm8(new FXs(this, this, 58));
            }
        } else {
            PaymentsTitleBarViewStub A0X = DKH.A0X(this);
            A0X.setVisibility(0);
            PaymentsDecoratorParams paymentsDecoratorParams = ((SimplePickerRunTimeData) this.A0A).A01.B2r().styleParams.paymentsDecoratorParams;
            A0X.A01((ViewGroup) this.mView, paymentsDecoratorParams.paymentsDecoratorAnimation.mTitleBarNavIconStyle, paymentsDecoratorParams.paymentsTitleBarStyle, new FsZ(A00, this, 6));
            A0X.A03.A00(null, paymentsDecoratorParams.paymentsTitleBarTitleStyle, ((SimplePickerRunTimeData) this.A0A).A01.B2r().title, 0);
        }
        View view3 = this.mView;
        TextView textView2 = (TextView) (view3 == null ? null : view3.findViewById(2131363595));
        if (textView2 != null) {
            C00i c00i = this.A01;
            if (DKH.A0T(c00i).AZk(36312870456398939L)) {
                String BDC = DKH.A0T(c00i).BDC(1GD.A07, "", 1189797325017121335L);
                11T.A0A(BDC);
                if (BDC.length() == 0) {
                    BDC = 7zO.A0D(this).getString(2131962877);
                }
                textView2.setText(BDC);
                textView2.setVisibility(0);
            }
        }
        View view4 = this.mView;
        if (view4 != null && (findViewById = view4.findViewById(2131366342)) != null) {
            if (DKH.A0T(this.A01).AZk(36312870456398939L)) {
                findViewById.setVisibility(0);
                1Iw A0W = 7zL.A0W(this.A00);
                QIJ qij = new QIJ();
                ?? c1rs = new C1rs(qij, A0W, 0, 0);
                c1rs.A01 = qij;
                c1rs.A00 = A0W;
                c1rs.A0J();
                ((LithoView) findViewById).A0x(c1rs.A01);
            } else {
                findViewById.setVisibility(8);
            }
        }
        ListView listView = (ListView) 7zL.A0F(this, R.id.list);
        this.A0D = listView;
        listView.setAdapter((ListAdapter) this.A03);
        this.A0D.setOnScrollListener(this.A0M);
        Exy exy = new Exy(this.A0D, (LoadingIndicatorView) 7zL.A0F(this, 2131365307));
        this.A0H = exy;
        GJY gjy = this.A04;
        gjy.CsU(exy);
        this.A05.AC1(exy, this.A0L);
        PickerRunTimeData pickerRunTimeData = this.A0A;
        if (pickerRunTimeData.BRb()) {
            this.A0C = AnonymousClass001.A1U(bundle);
            gjy.D1f(this.A0J, pickerRunTimeData);
        } else {
            A04(this);
        }
        AbH.A1K(requireView(), DKH.A0W(this, this.A0E).A0B());
        View view5 = this.mView;
        LegacyNavigationBar legacyNavigationBar2 = (LegacyNavigationBar) (view5 == null ? null : view5.findViewById(2131368089));
        if (legacyNavigationBar2 != null) {
            legacyNavigationBar2.A07 = true;
        }
    }
}
