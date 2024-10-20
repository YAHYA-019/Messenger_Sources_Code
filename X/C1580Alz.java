package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.business.ads.adcontext.MessengerAdContextView;
import com.facebook.messaging.business.ads.adcontext.MessengerAdsContextExtensionInputParams;

/* renamed from: X.Alz, reason: case insensitive filesystem */
/* loaded from: Alz.class */
public final class C1580Alz extends 1pK implements DF3 {
    public static final String __redex_internal_original_name = "MessengerAdsContextExtensionFragment";
    public ProgressBar A00;
    public FbUserSession A01;
    public MessengerAdContextView A02;
    public MessengerAdsContextExtensionInputParams A03;
    public 6Je A04;

    public 1iF A1R() {
        return AbF.A0C(1432111696997900L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = AbL.A09(this);
        if (bundle != null && bundle.containsKey("threadKey") && bundle.containsKey("adId")) {
            this.A03 = new MessengerAdsContextExtensionInputParams(AbG.A0j(bundle.getString("threadKey")), bundle.getString("adId"));
        }
    }

    public void A1X(Context context) {
        C2121Dea c2121Dea = new C2121Dea(context);
        c2121Dea.A0B(context.getResources().getString(2131952309));
        c2121Dea.A0A(context.getResources().getString(2131952308));
        c2121Dea.A0H(CSG.A00(this, 27), context.getResources().getString(2131952310));
        c2121Dea.A04();
        6Je r0 = this.A04;
        if (r0 != null) {
            r0.ANa((AXn) null, 0S2.A05);
        }
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A04 = r302;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1204460879);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541495);
        0FI.A08(561949409, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1052565018);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        ((5iG) ((BkJ) 7zO.A0l(this, 82313)).A01.get()).A02();
        0FI.A08(-1739311595, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        MessengerAdsContextExtensionInputParams messengerAdsContextExtensionInputParams = this.A03;
        if (messengerAdsContextExtensionInputParams != null && messengerAdsContextExtensionInputParams.A00 != null && !TextUtils.isEmpty(messengerAdsContextExtensionInputParams.A01)) {
            bundle.putString("threadKey", this.A03.A00.toString());
            bundle.putString("adId", this.A03.A01);
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = (ProgressBar) 7zL.A0F(this, 2131361928);
        MessengerAdContextView messengerAdContextView = (MessengerAdContextView) 7zL.A0F(this, 2131361987);
        this.A02 = messengerAdContextView;
        MessengerAdsContextExtensionInputParams messengerAdsContextExtensionInputParams = this.A03;
        messengerAdContextView.A01 = messengerAdsContextExtensionInputParams;
        Context context = view.getContext();
        if (context != null) {
            if (messengerAdsContextExtensionInputParams == null || messengerAdsContextExtensionInputParams.A01 == null || messengerAdsContextExtensionInputParams.A00 == null) {
                A1X(context);
                return;
            }
            BkJ bkJ = (BkJ) 1Bn.A0E(context, (1BY) null, 82313);
            FbUserSession fbUserSession = this.A01;
            fbUserSession.getClass();
            MessengerAdsContextExtensionInputParams messengerAdsContextExtensionInputParams2 = this.A03;
            String str = messengerAdsContextExtensionInputParams2.A01;
            String obj = messengerAdsContextExtensionInputParams2.A00.toString();
            C2X c2x = new C2X(context, this);
            GraphQlCallInput graphQlCallInput = new 2Jd(5);
            graphQlCallInput.A09("ad_id", str);
            graphQlCallInput.A09("thread_id", obj);
            Cfq cfq = new Cfq();
            cfq.A01.A01(graphQlCallInput, "query_params");
            cfq.A02 = true;
            C1580Alz c1580Alz = c2x.A01;
            c1580Alz.A00.setVisibility(0);
            c1580Alz.A02.setVisibility(8);
            ((5iG) bkJ.A01.get()).A08(new C1614Amv(c2x, bkJ, 2), AnonymousClass001.A0Z(graphQlCallInput, "MessengerAdContextFetcher", AnonymousClass001.A0k()), new DBG(3, fbUserSession, cfq, bkJ));
        }
    }
}
