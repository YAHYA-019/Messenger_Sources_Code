package com.facebook.messaging.notify.permissions.plugins.postprompt.inboxnux;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BM;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1HG;
import X.1Iw;
import X.1Lo;
import X.1Ql;
import X.2RH;
import X.4YU;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.8Lf;
import X.8NJ;
import X.8Tn;
import X.AbF;
import X.AbH;
import X.AbK;
import X.C00i;
import X.C15h;
import X.C2do;
import X.C5cc;
import X.C5gc;
import X.C8nn;
import X.C8xf;
import X.CZF;
import X.Czk;
import X.DBY;
import X.FAJ;
import X.FJE;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import java.util.List;
import java.util.Map;

/* loaded from: BackgroundAccountNotificationNuxFragment.class */
public final class BackgroundAccountNotificationNuxFragment extends NuxFragment {
    public FAJ A00;
    public C5cc A01;
    public String A02;
    public C15h A03;
    public final 1Br A07 = 7zN.A0I(this);
    public final 1Br A08 = 1HG.A01(this, 83178);
    public final 1Br A06 = 1BK.A0E();
    public final View.OnClickListener A05 = CZF.A00(this, 26);
    public final View.OnClickListener A04 = CZF.A00(this, 25);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1J() {
        View findViewById;
        super.A1J();
        View view = this.mView;
        if (view == null || (findViewById = view.findViewById(2131365271)) == null) {
            return;
        }
        MigColorScheme.A00(findViewById, 7zQ.A0m(this.A07));
        findViewById.invalidate();
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return "background_account_notification_nux_flow";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        String A0u;
        String str;
        11T.A0F(context, 0);
        super.onAttach(context);
        FbUserSession A01 = 1BM.A01(this);
        this.A03 = DBY.A00;
        if (A01 == null) {
            throw 1BK.A0h();
        }
        this.A01 = (C5cc) 1Lo.A04(context, A01, (1BY) null, 82058);
        this.A00 = (FAJ) 1Bn.A0E(context, (1BY) null, 100122);
        C15h c15h = this.A03;
        if (c15h == null) {
            11T.A0L("loggedInUserProvider");
            throw 0Q8.createAndThrow();
        }
        User A0x = AbF.A0x(c15h);
        if (A0x != null) {
            Name name = A0x.A0X;
            String str2 = name.firstName;
            str = "";
            if (str2 == null) {
                str2 = str;
            }
            String str3 = name.lastName;
            str = str3 != null ? str3 : "";
            int length = str2.length();
            if (length > 0 && str.length() > 0) {
                A0u = 0Pz.A0Y(str2, str, ' ');
                this.A02 = A0u;
            } else if (length > 0) {
                this.A02 = str2;
                return;
            } else if (str.length() > 0) {
                this.A02 = str;
                return;
            }
        }
        A0u = 1BK.A0u(context, 2131953171);
        this.A02 = A0u;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(951539415);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541560, viewGroup, false);
        AbH.A1K(inflate.findViewById(2131368172), 0);
        View findViewById = inflate.findViewById(2131364301);
        C00i c00i = this.A07.A00;
        MigColorScheme.A00(findViewById, 7zM.A11(c00i));
        View findViewById2 = inflate.findViewById(2131365271);
        11T.A0I(findViewById2, 1BJ.A00(4));
        MigColorScheme.A00(findViewById2, 7zM.A11(c00i));
        0FI.A08(942918961, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-1620454958);
        super/*androidx.fragment.app.Fragment*/.onStart();
        C5cc c5cc = this.A01;
        if (c5cc != null) {
            ((C5gc) 1Br.A0B(c5cc.A03)).A00(Czk.A00(c5cc, 78), true);
            C5cc c5cc2 = this.A01;
            if (c5cc2 != null) {
                1Ql.A01(1Br.A08(c5cc2.A02), c5cc2.A06, true);
                0fH.A0j("BackgroundAccountNotificationController", "[BANotif] setNuxDisplayed=true");
                0FI.A08(-957884456, A02);
                return;
            }
        }
        11T.A0L("backgroundAccountNotificationManager");
        throw 0Q8.createAndThrow();
    }

    public void onViewCreated(View view, Bundle bundle) {
        1Iw r0;
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = (LithoView) view.findViewById(2131365271);
        if (lithoView == null || (r0 = lithoView.A09) == null) {
            return;
        }
        8Tn A00 = C8nn.A00(r0);
        A00.A2a(7zQ.A0m(this.A07));
        String A0u = 7zN.A0u(r0, AbK.A12(r0.A0D), 2131953174);
        C8xf c8xf = new C8xf(null, 2132411111);
        String str2 = this.A02;
        if (str2 == null) {
            str = "userName";
        } else {
            A00.A2Y(new 8NJ(new 8Lf(this.A05, this.A04, r0.A0D(2131953173), r0.A0D(2131953172), true), c8xf, 7zN.A0u(r0, str2, 2131953170), (CharSequence) null, A0u, (List) null, true));
            4YU.A1N(A00, 2RH.A05);
            lithoView.A0x(A00.A2W());
            1Br.A08(this.A06).putBoolean(C2do.A01, true).commitImmediately();
            ((FJE) 1Br.A0B(this.A08)).A0F("background_account_notification_nux_flow");
            FAJ faj = this.A00;
            if (faj != null) {
                FAJ.A00(faj, "background_account_notification", (Map) null);
                return;
            }
            str = "nuxAnalyticsLogger";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
