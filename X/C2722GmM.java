package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.widget.listview.BetterListView;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.GmM, reason: case insensitive filesystem */
/* loaded from: GmM.class */
public final class C2722GmM extends DYd {
    public static final String __redex_internal_original_name = "CommerceOrderHistoryFragment";
    public ProgressBar A00;
    public ProgressBar A01;
    public GUk A02;
    public Hjc A03;
    public HQl A04;
    public BetterListView A05;
    public String A06;
    public FbUserSession A07;
    public final C00i A08 = AbH.A0D();

    public static void A03(C2722GmM c2722GmM, String str) {
        String A0r;
        Hjc hjc = c2722GmM.A03;
        hjc.getClass();
        2JX r0 = hjc.A00;
        if (r0 == null || r0.getBooleanValue(-1575811850)) {
            if (c2722GmM.A02.isEmpty()) {
                c2722GmM.A01.setVisibility(0);
            } else if (c2722GmM.A05.getFooterViewsCount() == 0) {
                c2722GmM.A05.addFooterView(c2722GmM.A00);
            }
            Hjc hjc2 = c2722GmM.A03;
            hjc2.getClass();
            FbUserSession fbUserSession = c2722GmM.A07;
            fbUserSession.getClass();
            if (hjc2.A02 == null) {
                C30G A0H = AbF.A0H(30);
                A0H.A02(str, JQw.A00(16));
                A0H.A02("10", "receipt_count");
                A0H.A02(7zN.A0i(), "item_count");
                2JX r02 = hjc2.A00;
                if (r02 != null && r02.getBooleanValue(-1575811850) && (A0r = r02.A0r(-77796550)) != null) {
                    A0H.A02(A0r, "receipt_after_cursor");
                }
                C3sa A00 = C3sa.A00(A0H);
                long j = ActionId.VIDEO_SET_RENDERER_CONTEXT;
                A00.A0A(j);
                A00.A09(j);
                long now = hjc2.A04.now();
                AbstractC05414dq A09 = 1VX.A09(1BK.A04(hjc2.A05), fbUserSession);
                4YU.A1J(A00, 675975893060109L);
                C03713yu A03 = A09.A03(A00);
                hjc2.A02 = A03;
                1Kd.A0F(new InG(hjc2, now, 0), A03, hjc2.A07);
            }
        }
    }

    public 1iF A1R() {
        return AbF.A0C(675975893060109L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A07 = 1BL.A0G(this);
        this.A03 = (Hjc) 7zO.A0l(this, 116228);
    }

    public String A1X(Context context) {
        return context.getString(2131954398);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1Y(Context context, Parcelable parcelable) {
        this.A06 = ((BaseBundle) parcelable).getString("commerce_id");
    }

    public void A1Z(HQl hQl) {
        this.A04 = hQl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Context getContext() {
        Context context = super/*androidx.fragment.app.Fragment*/.getContext();
        context.getClass();
        return context;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(271857534);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542881);
        0FI.A08(-428061956, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-216336547);
        super/*androidx.fragment.app.Fragment*/.onPause();
        Hjc hjc = this.A03;
        hjc.getClass();
        ListenableFuture listenableFuture = hjc.A02;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            hjc.A02 = null;
        }
        0FI.A08(-1799566223, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A01 = (ProgressBar) 7zL.A0F(this, 2131365283);
        this.A05 = (BetterListView) 7zL.A0F(this, 2131366176);
        ProgressBar progressBar = (ProgressBar) AbG.A08(LayoutInflater.from(getContext()), this.A05, 2132542882);
        this.A00 = progressBar;
        this.A05.addFooterView(progressBar);
        Context context = getContext();
        BaseAdapter baseAdapter = new BaseAdapter();
        ((GUk) baseAdapter).A01 = AnonymousClass001.A0s();
        ((GUk) baseAdapter).A00 = context;
        this.A02 = baseAdapter;
        this.A05.setAdapter((ListAdapter) baseAdapter);
        this.A05.removeFooterView(this.A00);
        this.A05.setOnItemClickListener(new FYO(this, 4));
        this.A05.A6u(new IL5(this, 1));
        Hjc hjc = this.A03;
        hjc.getClass();
        hjc.A01 = new HQk(this);
        String str = this.A06;
        if (str != null) {
            A03(this, str);
        }
    }
}
