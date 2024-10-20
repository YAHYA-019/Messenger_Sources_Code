package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.BitSet;

/* renamed from: X.Gbn, reason: case insensitive filesystem */
/* loaded from: Gbn.class */
public final class C2386Gbn extends 1pK implements 1lN, C1lM {
    public static final String __redex_internal_original_name = "BusinessProfileFragment";
    public PopupWindow.OnDismissListener A00;
    public QxS A01;
    public RMc A02;
    public CHY A03;
    public MigColorScheme A04;
    public User A05;
    public String A06;
    public long A07;
    public C0dr A08;
    public final C00i A0B = 1BV.A00(50179);
    public final C00i A09 = 1BQ.A02(49965);
    public final CH8 A0A = (CH8) 1Bi.A03(85098);

    public 1iF A1R() {
        return AbF.A0C(2429843100654746L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A08 = (C0dr) 1Bi.A03(84488);
        this.A04 = AbK.A0h(this);
        this.A03 = (CHY) 7zO.A0m(this, 83173);
        ((C6tg) this.A0B.get()).A0A(getContext());
        setRetainInstance(true);
    }

    @Override // X.C1lM
    public java.util.Map AWe() {
        return AnonymousClass001.A0u();
    }

    public String AWg() {
        return "messenger_business_contextual_profile";
    }

    public Long Am7() {
        return 2429843100654746L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-228525562);
        View inflate = layoutInflater.inflate(2132541643, viewGroup, false);
        LithoView lithoView = (LithoView) inflate.findViewById(2131366691);
        1Iw A0P = AbI.A0P(this);
        this.A06 = this.mArguments.getString("pageId");
        QBY qby = new QBY(A0P, new QJn());
        String str = this.A06;
        QJn qJn = qby.A01;
        qJn.A03 = str;
        BitSet bitSet = qby.A02;
        bitSet.set(3);
        qJn.A00 = this.A01;
        bitSet.set(0);
        qJn.A02 = new CoU(this, 0);
        bitSet.set(2);
        qJn.A01 = this.A04;
        bitSet.set(1);
        C1rs.A02(bitSet, qby.A03);
        qby.A0J();
        lithoView.A0x(qJn);
        0FI.A08(-1206944200, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1341572788);
        super/*androidx.fragment.app.Fragment*/.onPause();
        RMc rMc = this.A02;
        if (rMc != null) {
            long now = this.A08.now() - this.A07;
            F9F f9f = (F9F) rMc.A03.A02.get();
            String str = rMc.A02.A08;
            int A01 = 1NS.A01(now);
            1UG A08 = 1BK.A08(1BK.A07(f9f.A04), "mn_story_ads_business_profile_time_spent");
            if (A08.isSampled()) {
                A08.A7R("client_token", str);
                A08.A5q("time_on_screen_in_ms", Integer.valueOf(A01));
                A08.BZL();
            }
        }
        0FI.A08(1844535145, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1539932903);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A07 = this.A08.now();
        0FI.A08(-1159305402, A02);
    }
}
