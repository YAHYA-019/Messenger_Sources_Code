package com.facebook.auth.login.ui;

import X.0BR;
import X.0BS;
import X.0FI;
import X.0Pz;
import X.0Q8;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Ew;
import X.1JF;
import X.1lN;
import X.35N;
import X.6HM;
import X.7zO;
import X.AbE;
import X.AbH;
import X.AbI;
import X.C00i;
import X.C01s;
import X.C15h;
import X.CfG;
import X.DKD;
import X.DKG;
import X.DKI;
import X.DeF;
import X.EPM;
import X.EwB;
import X.Fak;
import X.G7K;
import X.GHW;
import X.GLh;
import X.JgM;
import X.MIN;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.credentials.PasswordCredentials;
import java.util.Iterator;

/* loaded from: PasswordCredentialsFragment.class */
public final class PasswordCredentialsFragment extends AuthFragmentBase implements 1lN, GLh {
    public int A00;
    public PasswordCredentials A01;
    public EwB A02;
    public GHW A03;
    public 6HM A04;
    public Boolean A05;
    public C15h A06;
    public C15h A07;
    public C15h A08;
    public JgM A0A;
    public final 1Ew A0B = AbI.A09();
    public final C00i A0F = 1BQ.A01();
    public final C00i A0C = 1BQ.A02(100141);
    public final C00i A0E = AbH.A0D();
    public final C00i A0D = 1BV.A00(68334);
    public boolean A09 = false;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(PasswordCredentialsFragment passwordCredentialsFragment, Throwable th, int i) {
        if (i != 400 && i != 401 && i != 405 && i != 407 && i != 613) {
            C01s A09 = 1BK.A09(passwordCredentialsFragment.A0F);
            0BS A01 = 0BR.A01(0Pz.A0T("PasswordCredentialsFragment_", i), 0Pz.A0T("login error: ", i));
            A01.A04 = th;
            A01.A00 = 1000;
            DKD.A1F(A09, A01);
        }
        Iterator A0N = DKI.A0N(passwordCredentialsFragment);
        if (A0N.hasNext()) {
            ((35N) A0N.next()).A00(new Fak(2));
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.auth.login.ui.AuthFragmentBase
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A02 = DKD.A0G();
        this.A08 = G7K.A01(this, 9);
        this.A07 = G7K.A01(this, 10);
        this.A06 = G7K.A01(this, 11);
        this.A05 = (Boolean) 1Bi.A03(83605);
        this.A04 = (6HM) 7zO.A0m(this, 50020);
        JgM A0L = DKG.A0L(this, "authenticateOperation");
        this.A0A = A0L;
        DeF.A00(A0L, this, 3);
        if (bundle != null) {
            this.A01 = (PasswordCredentials) bundle.getParcelable("passwordCredentials");
            this.A00 = bundle.getInt("userAuthFailureCount", 0);
        }
    }

    @Override // X.GLh
    public void AO4(PasswordCredentials passwordCredentials, MIN min) {
        if (this.A0A.A1S()) {
            return;
        }
        this.A01 = passwordCredentials;
        this.A0B.D2n();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("passwordCredentials", passwordCredentials);
        if (min != null) {
            this.A0A.A1Q(min);
        }
        this.A0A.A1R(this.A05.booleanValue() ? "auth_password_work" : "auth_password", A05);
    }

    public String AWg() {
        return "login_screen";
    }

    public Long Am7() {
        return 338399944209237L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-166066797);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        DKD.A1E(this.A02.A01, "com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI");
        0FI.A08(147969762, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("account_user_id");
            String stringExtra2 = intent.getStringExtra(AbE.A00(369));
            if (1JF.A0E(new CharSequence[]{stringExtra, stringExtra2})) {
                return;
            }
            AO4(new PasswordCredentials(EPM.A0R, stringExtra, stringExtra2), new CfG(getContext(), 2131958828));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-919208200);
        GHW A1a = A1a(GLh.class);
        this.A03 = A1a;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("orca:authparam:phone");
            if (string != null) {
                this.A03.setUser(string, bundle2.getString("orca:authparam:name"), bundle2.getString("orca:authparam:photourl"), !bundle2.getBoolean("orca:authparam:require_specific_account", false));
            }
            this.A09 = bundle2.getBoolean("orca:authparam:from_registration", false);
        }
        0FI.A08(2058443657, A02);
        return A1a;
    }

    @Override // com.facebook.auth.login.ui.AuthFragmentBase
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("passwordCredentials", this.A01);
        bundle.putInt("userAuthFailureCount", this.A00);
    }
}
