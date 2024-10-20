package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueTwoFacAuth;

/* loaded from: B2p.class */
public final class B2p extends B2z implements CallerContextable {
    public static final String __redex_internal_original_name = "AccountLoginTwoFacAuthFragment";
    public Handler A00;
    public CDo A01;
    public COx A02;
    public COx A03;
    public C2R A04;
    public COx A05;
    public Bjv A06;
    public EwP A07;
    public final Bbh A08 = new Bbh(this);
    public final GF9 A0A = new Ctt(this, 2);
    public final BPY A0E = new B37(this, 16);
    public final DIO A0D = new ChP(this, 6);
    public final Runnable A0C = new D5B(this);
    public final Bbk A09 = new Bbk();
    public final FEY A0B = (FEY) 1Bi.A03(85276);
    public final BWd A0F = (BWd) 1Bi.A03(85285);

    /* JADX WARN: Type inference failed for: r0v17, types: [android.os.Parcelable, com.facebook.auth.credentials.TwoFactorCredentials, com.facebook.auth.credentials.PasswordCredentials] */
    public static void A08(B2p b2p) {
        b2p.A1a();
        AccountLoginSegueTwoFacAuth accountLoginSegueTwoFacAuth = (AccountLoginSegueTwoFacAuth) ((AlJ) b2p).A01;
        LoginErrorData loginErrorData = accountLoginSegueTwoFacAuth.A00;
        String str = accountLoginSegueTwoFacAuth.A04;
        String valueOf = String.valueOf(loginErrorData.A00);
        String str2 = accountLoginSegueTwoFacAuth.A03;
        String str3 = loginErrorData.A05;
        ?? passwordCredentials = new PasswordCredentials(EPM.A0Q, str, str2);
        passwordCredentials.A02 = valueOf;
        passwordCredentials.A01 = str2;
        passwordCredentials.A00 = str3;
        if (b2p.A1X() != BLS.A06) {
            b2p.A02.A04((Parcelable) passwordCredentials, "action_auth_two_fac_with_code", 2131952189);
        } else {
            b2p.A05.A03(AbJ.A07((Parcelable) passwordCredentials), "action_auth_two_fac_with_code", 2131952189);
        }
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A04 = (C2R) 1Bn.A0A(85275);
        this.A06 = (Bjv) 1Bn.A0A(85270);
        this.A00 = (Handler) 1Bn.A0A(16430);
        this.A07 = (EwP) 7zO.A0l(this, 100095);
        this.A01 = (CDo) 1Bn.A0A(85282);
        this.A07.A01();
        Context requireContext = requireContext();
        DIO dio = this.A0D;
        B36 b36 = new B36(requireContext, dio);
        BPY bpy = this.A0E;
        COx cOx = new COx(this, ((AlJ) this).A00, b36, bpy, "auth_password", "auth_operation", "passwordCredentials", false);
        COx.A02(cOx);
        this.A02 = cOx;
        COx cOx2 = new COx(this, ((AlJ) this).A00, new B36(requireContext(), dio), bpy, "auth_switch_accounts", "auth_operation_account_switch", "passwordCredentials", false);
        COx.A02(cOx2);
        this.A05 = cOx2;
        COx cOx3 = new COx(this, (CIw) null, (C00) null, bpy, 1BJ.A00(83), "poll_operation", "checkApprovedMachineParams", false);
        COx.A02(cOx3);
        this.A03 = cOx3;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-1960451764);
        super.onDestroy();
        this.A07.A00();
        0FI.A08(1281240063, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1168820015);
        super/*androidx.fragment.app.Fragment*/.onPause();
        FEY fey = this.A0B;
        if (fey.A00 == this.A0A) {
            fey.A00 = null;
        }
        0FI.A08(-215503233, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(833623657);
        super/*androidx.fragment.app.Fragment*/.onResume();
        FEY fey = this.A0B;
        String str = fey.A01;
        fey.A01 = null;
        if (str != null) {
            ((AccountLoginSegueTwoFacAuth) ((AlJ) this).A01).A03 = str;
            A08(this);
        } else {
            fey.A00 = this.A0A;
        }
        0FI.A08(-435976577, A02);
    }

    public void onStart() {
        int A02 = 0FI.A02(953845053);
        super.onStart();
        this.A00.postDelayed(this.A0C, 5000L);
        0FI.A08(-1159529736, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(-1817177757);
        super.onStop();
        this.A00.removeCallbacks(this.A0C);
        0FI.A08(-905967551, A02);
    }
}
