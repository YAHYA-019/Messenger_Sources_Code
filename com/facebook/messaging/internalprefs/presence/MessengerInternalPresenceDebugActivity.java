package com.facebook.messaging.internalprefs.presence;

import X.0S2;
import X.1BJ;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1FV;
import X.1XZ;
import X.1pH;
import X.2MQ;
import X.2Re;
import X.2TN;
import X.2TO;
import X.2TR;
import X.2TS;
import X.2Ti;
import X.2Tj;
import X.3wJ;
import X.3wL;
import X.4LS;
import X.6T0;
import X.7zM;
import X.7zN;
import X.7zP;
import X.A21;
import X.AQr;
import X.AbG;
import X.AbK;
import X.BFd;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C0ty;
import X.C5yu;
import X.C5yw;
import X.C5z1;
import X.Cbt;
import X.CpW;
import X.Cx1;
import X.CxB;
import X.CxE;
import X.D3J;
import X.D3S;
import X.D3T;
import X.D3U;
import X.D4p;
import X.InterfaceC00633oW;
import android.R;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.DefaultPresenceManager;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: MessengerInternalPresenceDebugActivity.class */
public final class MessengerInternalPresenceDebugActivity extends FbFragmentActivity {
    public 1pH A00;
    public 2TS A01;
    public Integer A02;
    public String A03;
    public List A04;
    public List A05;
    public final 3wJ A0C;
    public final C01i A0K;
    public final Function A0E = D3J.A01(this, 20);
    public final Predicate A0F = D3S.A00;
    public final Predicate A0G = D3T.A00;
    public final Predicate A0H = D3U.A00;
    public final 4LS A0B = new CpW(this, 2);
    public final 2TO A0M = new BFd(this, 0);
    public final 2Ti A0D = new A21(this, 2);
    public final C01i A0I = C01g.A01(new AQr(this, 11));
    public final 1Br A09 = 1Bq.A00(65723);
    public final C01i A0J = C01g.A01(new AQr(this, 12));
    public final C01i A0L = C01g.A01(new AQr(this, 14));
    public final 1Br A08 = AbG.A0L();
    public final 1Br A06 = 1Bq.A00(16431);
    public final 1Br A0A = 7zM.A0P();
    public final 1Br A07 = 7zM.A0U();

    public MessengerInternalPresenceDebugActivity() {
        C0ty c0ty = C0ty.A00;
        this.A05 = c0ty;
        this.A0C = new CxB(this, 2);
        this.A02 = 0S2.A00;
        this.A0K = C01g.A01(new AQr(this, 13));
        this.A04 = c0ty;
    }

    public static final void A12(MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity) {
        ConcurrentMap concurrentMap = ((DefaultPresenceManager) ((1XZ) 1Br.A0B(messengerInternalPresenceDebugActivity.A09))).A0t;
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator A1B = 1BK.A1B(concurrentMap);
        while (A1B.hasNext()) {
            AbK.A1Q(builder, A1B);
        }
        ImmutableList build = builder.build();
        2TN r0 = (2TN) 1Bi.A03(17024);
        build.size();
        2TR A03 = r0.A03(build);
        A03.A01 = new Cbt(messengerInternalPresenceDebugActivity, 5);
        A03.A08();
    }

    public static final void A15(MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity, List list) {
        1FV A03 = ((2Tj) messengerInternalPresenceDebugActivity.A0L.getValue()).A03();
        1Br.A0D(messengerInternalPresenceDebugActivity.A06, D4p.A00(messengerInternalPresenceDebugActivity, list, 31), A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        C00i c00i = this.A09.A00;
        ((1XZ) c00i.get()).Cez(this.A0M);
        ((1XZ) c00i.get()).CeM(this);
        ((2Tj) this.A0L.getValue()).A06(this.A0D);
        super.A2l();
        1pH r0 = this.A00;
        if (r0 != null) {
            r0.A06();
        }
        this.A00 = null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        super.A2y(bundle);
        3wL r0 = new 3wL();
        for (Integer num : 0S2.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str = "Rich Status";
                    break;
                case 2:
                    str = "All";
                    break;
                default:
                    str = 1BJ.A00(ActionId.CARD_DATA_LOADED);
                    break;
            }
            r0.A02(str, false);
        }
        this.A05 = r0.A00();
        this.A00 = 1pH.A02((ViewGroup) A2c(R.id.content), BDe(), (InterfaceC00633oW) null, true);
        setContentView(2132542582);
        int i = C5yu.A00;
        6T0 r02 = new 6T0();
        r02.A00((MigColorScheme) 1Bn.A0E(this, (1BY) null, 16979));
        r02.A00 = 7zP.A0S(this.A07).A02(2MQ.A3E, 2Re.A02);
        r02.A04 = Cx1.A01(this, 23);
        C5z1 c5z1 = new C5z1(r02);
        LithoView lithoView = (LithoView) A2c(2131368069);
        C5yw A0b = 7zN.A0b(lithoView.A09, false);
        A0b.A2b((MigColorScheme) 1Bn.A0E(this, (1BY) null, 16979));
        A0b.A2f(getTitle().toString());
        CxE.A01(A0b, this, 54);
        A0b.A2e(c5z1);
        lithoView.A0y(A0b.A2V());
        A12(this);
        C00i c00i = this.A09.A00;
        ((1XZ) c00i.get()).A77(this.A0M);
        ((1XZ) c00i.get()).A5m(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 != null) {
            r0.A07();
        } else {
            super.onBackPressed();
        }
    }
}
