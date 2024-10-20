package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.p2p.paypal.P2pPaypalFundingOptionsParams;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.widget.loadingindicator.LoadingIndicatorView;
import com.google.common.base.Objects;

/* renamed from: X.Da7, reason: case insensitive filesystem */
/* loaded from: Da7.class */
public final class C2046Da7 extends 33A {
    public static final String __redex_internal_original_name = "P2pPaypalFundingOptionsFragment";
    public Context A00;
    public DPR A01;
    public Ev0 A02;
    public P2pPaypalFundingOptionsParams A04;
    public Exy A05;
    public FbUserSession A06;
    public FII A07;
    public final C00i A08 = DKG.A0U(this);
    public GIE A03 = new Fn3(this);

    public void A07(View view, ListView listView, int i, long j) {
        DPR dpr = this.A01;
        dpr.A00.BoJ((2JX) dpr.getItem(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        GIE gie;
        String stringExtra;
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        if (i == 8512 && i2 == -1 && (stringExtra = intent.getStringExtra("success_uri")) != null) {
            Ev0 ev0 = this.A02;
            FbUserSession fbUserSession = this.A06;
            fbUserSession.getClass();
            ev0.A00.getClass();
            ev0.A00.A00.A05.A00();
            Uri parse = Uri.parse(stringExtra);
            String queryParameter = parse.getQueryParameter("scope");
            String queryParameter2 = parse.getQueryParameter("login_ref_id");
            String queryParameter3 = parse.getQueryParameter("state");
            String queryParameter4 = parse.getQueryParameter("code");
            String queryParameter5 = parse.getQueryParameter("failedBecause");
            if ((queryParameter != null || (queryParameter3 != null && queryParameter4 == null && queryParameter5 == null)) && Objects.equal(queryParameter2, ev0.A02)) {
                ev0.A00(fbUserSession);
                return;
            }
            gie = ev0.A00.A00.A03;
        } else {
            gie = this.A03;
        }
        gie.onCancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(150288741);
        super.onCreate(bundle);
        this.A06 = AbL.A09(this);
        this.A07 = (FII) 7zO.A0l(this, 98904);
        this.A01 = (DPR) 7zO.A0l(this, 98987);
        this.A02 = (Ev0) 1Bn.A0A(98985);
        this.A00 = DKH.A0C(this);
        this.A04 = (P2pPaypalFundingOptionsParams) this.mArguments.getParcelable("extra_paypal_funding_options_param");
        0FI.A08(-672610533, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1648280581);
        View A08 = AbG.A08(layoutInflater.cloneInContext(this.A00), viewGroup, 2132542044);
        PaymentsDecoratorParams A00 = this.A04.A00();
        FII.A04(A08, A00.A00, A00.isFullScreenModal);
        0FI.A08(-1594755207, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1164520095);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        DKG.A1N(this.A02.A03);
        0FI.A08(685974161, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super/*X.0kt*/.onViewCreated(view, bundle);
        Context A00 = AnonymousClass016.A00(getContext(), Activity.class);
        PaymentsTitleBarViewStub A0X = DKH.A0X(this);
        PaymentsDecoratorParams A002 = this.A04.A00();
        ViewGroup viewGroup = (ViewGroup) this.mView;
        FsZ fsZ = new FsZ(A00, this, 5);
        A0X.A01(viewGroup, A002.paymentsDecoratorAnimation.mTitleBarNavIconStyle, A002.paymentsTitleBarStyle, fsZ);
        A0X.A03(A002.paymentsTitleBarTitleStyle, "", 2132347133);
        AbsListView absListView = (AbsListView) 7zL.A0F(this, R.id.list);
        absListView.setAdapter((ListAdapter) this.A01);
        this.A05 = new Exy(absListView, (LoadingIndicatorView) 7zL.A0F(this, 2131365307));
        this.A01.A00 = new Fn1(this);
        Ev0 ev0 = this.A02;
        P2pPaypalFundingOptionsParams p2pPaypalFundingOptionsParams = this.A04;
        ev0.A00 = new EfK(this);
        ev0.A01 = p2pPaypalFundingOptionsParams;
        FbUserSession fbUserSession = this.A06;
        fbUserSession.getClass();
        ev0.A00(fbUserSession);
        AbH.A1K(requireView(), DKH.A0W(this, this.A08).A0B());
    }
}
