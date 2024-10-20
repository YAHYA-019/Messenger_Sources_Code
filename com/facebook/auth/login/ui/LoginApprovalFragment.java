package com.facebook.auth.login.ui;

import X.0BR;
import X.0BS;
import X.0FI;
import X.0Pz;
import X.0Q8;
import X.1BK;
import X.1BQ;
import X.1lN;
import X.35N;
import X.6HM;
import X.7zO;
import X.AbE;
import X.C00i;
import X.C01s;
import X.C1664Ap6;
import X.DKD;
import X.DKG;
import X.DKI;
import X.DeF;
import X.EwB;
import X.FFU;
import X.Fak;
import X.FzQ;
import X.GLg;
import X.JgM;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContextable;
import java.util.Iterator;

/* loaded from: LoginApprovalFragment.class */
public final class LoginApprovalFragment extends AuthFragmentBase implements 1lN, GLg, CallerContextable {
    public Bundle A00;
    public Bundle A01;
    public Handler A02;
    public EwB A03;
    public LoginErrorData A04;
    public JgM A05;
    public JgM A06;
    public JgM A07;
    public 6HM A08;
    public Runnable A09;
    public String A0A;
    public final C00i A0B = 1BQ.A02(100141);
    public final C00i A0C = 1BQ.A01();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(LoginApprovalFragment loginApprovalFragment, Throwable th, int i) {
        Iterator A0N = DKI.A0N(loginApprovalFragment);
        if (A0N.hasNext()) {
            ((35N) A0N.next()).A00(new Fak(1));
            throw 0Q8.createAndThrow();
        }
        C01s A09 = 1BK.A09(loginApprovalFragment.A0C);
        0BS A01 = 0BR.A01(0Pz.A0T("LoginApprovalFragment_", i), 0Pz.A0T("login approval error: ", i));
        A01.A04 = th;
        A01.A00 = 1000;
        DKD.A1F(A09, A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.os.Parcelable, java.lang.Object, com.facebook.account.twofac.protocol.CheckApprovedMachineParams] */
    /* JADX WARN: Type inference failed for: r0v69, types: [android.os.Parcelable, java.lang.Object, com.facebook.account.twofac.protocol.LoginApprovalResendCodeParams] */
    @Override // com.facebook.auth.login.ui.AuthFragmentBase
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A03 = DKD.A0G();
        this.A08 = (6HM) 7zO.A0m(this, 50020);
        LoginErrorData loginErrorData = (LoginErrorData) requireArguments().getParcelable("login_error_data");
        this.A04 = loginErrorData;
        if (loginErrorData != null && loginErrorData.A00 != 0) {
            if (loginErrorData.A06 == null) {
                loginErrorData.A06 = FFU.A01(this.A0B);
            }
            this.A02 = new Handler();
            LoginErrorData loginErrorData2 = this.A04;
            long j = loginErrorData2.A00;
            String str = loginErrorData2.A06;
            ?? obj = new Object();
            obj.A00 = j;
            obj.A01 = str;
            Bundle A05 = 1BK.A05();
            this.A00 = A05;
            A05.putParcelable(AbE.A00(429), obj);
            JgM A0L = DKG.A0L(this, "checkedApprovedMachineOperation");
            this.A06 = A0L;
            A0L.A02 = new C1664Ap6(this, 0);
            JgM A0L2 = DKG.A0L(this, "resendApprovalCode");
            this.A07 = A0L2;
            DeF.A00(A0L2, this, 1);
            Bundle A052 = 1BK.A05();
            this.A01 = A052;
            LoginErrorData loginErrorData3 = this.A04;
            long j2 = loginErrorData3.A00;
            String str2 = loginErrorData3.A05;
            ?? obj2 = new Object();
            obj2.A00 = j2;
            obj2.A01 = str2;
            A052.putParcelable(AbE.A00(576), obj2);
        }
        JgM A0L3 = DKG.A0L(this, "authenticateOperation");
        this.A05 = A0L3;
        DeF.A00(A0L3, this, 0);
        this.A0A = requireArguments().getString("orca:authparam:email");
    }

    public String AWg() {
        return "login_approval";
    }

    public Long Am7() {
        return 338399944209237L;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2105765558);
        View A1a = A1a(GLg.class);
        0FI.A08(1188270915, A02);
        return A1a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        Runnable runnable;
        int A02 = 0FI.A02(-810753558);
        super/*androidx.fragment.app.Fragment*/.onStart();
        LoginErrorData loginErrorData = this.A04;
        if (loginErrorData != null && loginErrorData.A00 != 0) {
            Handler handler = this.A02;
            if (handler != null && (runnable = this.A09) != null) {
                handler.removeCallbacks(runnable);
            }
            Runnable fzQ = new FzQ(this);
            this.A09 = fzQ;
            Handler handler2 = this.A02;
            if (handler2 != null) {
                handler2.postDelayed(fzQ, 5000L);
            }
        }
        0FI.A08(203037006, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        Runnable runnable;
        int A02 = 0FI.A02(-483524637);
        super/*androidx.fragment.app.Fragment*/.onStop();
        Handler handler = this.A02;
        if (handler != null && (runnable = this.A09) != null) {
            handler.removeCallbacks(runnable);
        }
        0FI.A08(-1286262516, A02);
    }
}
