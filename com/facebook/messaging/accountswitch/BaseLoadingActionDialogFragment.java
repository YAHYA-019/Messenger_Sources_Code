package com.facebook.messaging.accountswitch;

import X.0FI;
import X.0S2;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1G1;
import X.1JF;
import X.1Ql;
import X.1iF;
import X.1lN;
import X.29B;
import X.2Ov;
import X.2Q0;
import X.4sY;
import X.6HM;
import X.7zO;
import X.7zR;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.AbL;
import X.AbM;
import X.BLq;
import X.BMG;
import X.C00i;
import X.C15h;
import X.C1664Ap6;
import X.C1f0;
import X.C1oi;
import X.C1s;
import X.C2M;
import X.C5vj;
import X.C8S;
import X.CIj;
import X.CMm;
import X.COW;
import X.CPl;
import X.D5G;
import X.DBe;
import X.DKB;
import X.EPM;
import X.JgM;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.credentials.DeviceBasedLoginCredentials;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.auth.protocol.LinkedFbUserFromIgSessionInfo;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.dbllite.data.DblLiteCredentials;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.msys.mci.TraceLogger;
import com.google.common.base.CharMatcher;
import java.util.Map;

/* loaded from: BaseLoadingActionDialogFragment.class */
public abstract class BaseLoadingActionDialogFragment extends 2Ov implements 1lN {
    public Activity A00;
    public View A01;
    public View A02;
    public Button A03;
    public Button A04;
    public TextView A05;
    public FbUserSession A06;
    public JgM A07;
    public CPl A08;
    public 4sY A09;
    public String A0B;
    public C15h A0C;
    public InputMethodManager A0D;
    public C15h A0E;
    public final C00i A0M = AbH.A0V();
    public final C00i A0J = AbH.A0S();
    public final C00i A0L = AbH.A0D();
    public final C00i A0G = AbI.A0N();
    public final C00i A0I = 1BQ.A02(83725);
    public final C00i A0F = AbF.A0S(this, 17037);
    public final C00i A0H = 1BV.A00(83726);
    public final C00i A0K = 1BV.A00(116182);
    public MigColorScheme A0A = LightColorScheme.A00();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(BaseLoadingActionDialogFragment baseLoadingActionDialogFragment) {
        View view = baseLoadingActionDialogFragment.mView;
        if (view == null || view.getWindowToken() == null) {
            return;
        }
        7zR.A12(baseLoadingActionDialogFragment.mView, baseLoadingActionDialogFragment.A0D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0386, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bf  */
    /* JADX WARN: Type inference failed for: r0v107, types: [com.facebook.messaging.accountswitch.IGSwitchDialogFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v215, types: [androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.SOAPDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v312, types: [com.facebook.messaging.accountswitch.SsoDialogFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.facebook.messaging.accountswitch.DblDialogFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v63, types: [androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.HorizonDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v99, types: [androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.IGSSODialogFragment] */
    /* JADX WARN: Type inference failed for: r309v5, types: [com.facebook.messaging.accountswitch.LoginApprovalDialogFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r309v9, types: [com.facebook.messaging.accountswitch.SwitchSavedAccountDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public 1iF A17() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v256, types: [android.os.Parcelable, com.facebook.auth.credentials.TwoFactorCredentials, com.facebook.auth.credentials.PasswordCredentials] */
    public void A1C() {
        String str;
        int i;
        String str2;
        String str3;
        AddAccountDialogFragment addAccountDialogFragment;
        Bundle bundle;
        AddAccountDialogFragment addAccountDialogFragment2;
        Bundle bundle2;
        if (this instanceof SsoDialogFragment) {
            SsoDialogFragment ssoDialogFragment = (SsoDialogFragment) this;
            AbH.A0g(ssoDialogFragment).A0H(BMG.A3I, ssoDialogFragment.A01);
            SsoDialogFragment.A05(ssoDialogFragment);
            return;
        }
        if (this instanceof SwitchSavedAccountDialogFragment) {
            SwitchSavedAccountDialogFragment switchSavedAccountDialogFragment = (SwitchSavedAccountDialogFragment) this;
            String trimFrom = CharMatcher.Whitespace.INSTANCE.trimFrom(AbM.A0u(switchSavedAccountDialogFragment.A01));
            String str4 = switchSavedAccountDialogFragment.A03.A0A;
            if (!switchSavedAccountDialogFragment.A1I()) {
                boolean isChecked = switchSavedAccountDialogFragment.A00.isChecked();
                1Ql.A01(1BL.A0V(switchSavedAccountDialogFragment.A0J), C1f0.A03, isChecked);
                CMm cMm = (CMm) switchSavedAccountDialogFragment.A07.get();
                FbUserSession fbUserSession = switchSavedAccountDialogFragment.A02;
                fbUserSession.getClass();
                cMm.A02(fbUserSession, "opt_out_checkbox", str4, isChecked);
                Bundle A07 = AbJ.A07(new PasswordCredentials(EPM.A0L, str4, trimFrom));
                A07.putBoolean("mo_account", switchSavedAccountDialogFragment.A06);
                AbK.A0P(A07, switchSavedAccountDialogFragment).A02("SwitchSavedAccountDialogFragment");
                switchSavedAccountDialogFragment.A1H("auth_switch_accounts", A07);
            }
            AbH.A0g(switchSavedAccountDialogFragment).A0H(BMG.A3P, switchSavedAccountDialogFragment.A03.A0A);
            return;
        }
        if (this instanceof SOAPDialogFragment) {
            SOAPDialogFragment sOAPDialogFragment = (SOAPDialogFragment) this;
            1G1 A0F = 1BL.A0F();
            ((C1s) sOAPDialogFragment.A05.get()).A00(A0F.A02, sOAPDialogFragment.A02, true);
            String str5 = A0F.A04;
            String str6 = sOAPDialogFragment.A02;
            if (str6 != null && !str6.equals(str5)) {
                ((C5vj) sOAPDialogFragment.A06.get()).A03(sOAPDialogFragment.A02);
            }
            if (sOAPDialogFragment.A1I() || 1JF.A0B(sOAPDialogFragment.A00) || 1JF.A0B(sOAPDialogFragment.A02) || 1JF.A0B(sOAPDialogFragment.A01)) {
                return;
            }
            Bundle A05 = 1BK.A05();
            A05.putString("accessToken", sOAPDialogFragment.A00);
            A05.putString("soapAccountId", sOAPDialogFragment.A02);
            A05.putString("sessionCookies", sOAPDialogFragment.A01);
            AbL.A12(sOAPDialogFragment, AbG.A0g(sOAPDialogFragment.A0I), "SOAPDialogFragment");
            str = DKB.A00(3);
            bundle2 = A05;
            addAccountDialogFragment2 = sOAPDialogFragment;
        } else {
            if (this instanceof OneClickAddAccountDialogFragment) {
                return;
            }
            if (this instanceof LoginApprovalDialogFragment) {
                LoginApprovalDialogFragment loginApprovalDialogFragment = (LoginApprovalDialogFragment) this;
                String trimFrom2 = CharMatcher.Whitespace.INSTANCE.trimFrom(AbM.A0u(loginApprovalDialogFragment.A00));
                if (loginApprovalDialogFragment.A1I()) {
                    return;
                }
                Bundle A052 = 1BK.A05();
                String str7 = loginApprovalDialogFragment.A02;
                LoginErrorData loginErrorData = loginApprovalDialogFragment.A01;
                String valueOf = String.valueOf(loginErrorData.A00);
                String str8 = loginErrorData.A05;
                ?? passwordCredentials = new PasswordCredentials(EPM.A0Q, str7, trimFrom2);
                passwordCredentials.A02 = valueOf;
                passwordCredentials.A01 = trimFrom2;
                passwordCredentials.A00 = str8;
                A052.putParcelable("passwordCredentials", passwordCredentials);
                AbL.A12(loginApprovalDialogFragment, AbK.A0P(A052, loginApprovalDialogFragment), "LoginApprovalDialogFragment");
                str = "auth_switch_accounts";
                bundle2 = A052;
                addAccountDialogFragment2 = loginApprovalDialogFragment;
            } else {
                if (this instanceof IGSwitchDialogFragment) {
                    IGSwitchDialogFragment iGSwitchDialogFragment = (IGSwitchDialogFragment) this;
                    if (iGSwitchDialogFragment.A1I()) {
                        return;
                    }
                    MessengerAccountInfo messengerAccountInfo = iGSwitchDialogFragment.A00;
                    str2 = "IGSwitchDialogFragment";
                    if (messengerAccountInfo != null && !1JF.A0B(messengerAccountInfo.A04) && !1JF.A0B(iGSwitchDialogFragment.A00.A0A)) {
                        if (1JF.A0B(iGSwitchDialogFragment.A01)) {
                            str3 = "A linked fbid is required";
                            0fH.A0n(str2, str3);
                            return;
                        }
                        MessengerAccountInfo messengerAccountInfo2 = iGSwitchDialogFragment.A00;
                        String str9 = messengerAccountInfo2.A04;
                        String str10 = messengerAccountInfo2.A0A;
                        Bundle A053 = 1BK.A05();
                        A053.putString("igAccessToken", str9);
                        A053.putString("igUserId", str10);
                        A053.putString("fbUserId", iGSwitchDialogFragment.A01);
                        AbL.A12(iGSwitchDialogFragment, AbG.A0g(iGSwitchDialogFragment.A0I), str2);
                        i = 81;
                        bundle = A053;
                        addAccountDialogFragment = iGSwitchDialogFragment;
                        str = 1BJ.A00(i);
                        bundle2 = bundle;
                        addAccountDialogFragment2 = addAccountDialogFragment;
                    }
                    str3 = "Both Access Token and UserId are required";
                    0fH.A0n(str2, str3);
                    return;
                }
                if (this instanceof IGSSODialogFragment) {
                    IGSSODialogFragment iGSSODialogFragment = (IGSSODialogFragment) this;
                    AbF.A0V(iGSSODialogFragment.A01).A0A(BMG.A0W);
                    if (iGSSODialogFragment.A1I()) {
                        return;
                    }
                    EPM epm = EPM.A0F;
                    LinkedFbUserFromIgSessionInfo linkedFbUserFromIgSessionInfo = iGSSODialogFragment.A00;
                    Bundle A072 = AbJ.A07(new PasswordCredentials(epm, linkedFbUserFromIgSessionInfo.A02, linkedFbUserFromIgSessionInfo.A01));
                    AbL.A12(iGSSODialogFragment, AbK.A0P(A072, iGSSODialogFragment), "IGSSODialogFragment");
                    str = "auth_switch_accounts";
                    bundle2 = A072;
                    addAccountDialogFragment2 = iGSSODialogFragment;
                } else {
                    if (this instanceof HorizonDialogFragment) {
                        HorizonDialogFragment horizonDialogFragment = (HorizonDialogFragment) this;
                        if (horizonDialogFragment.A1I()) {
                            return;
                        }
                        str2 = "HorizonDialogFragment";
                        if (!1JF.A0B(horizonDialogFragment.A00) && !1JF.A0B(horizonDialogFragment.A02)) {
                            Bundle A054 = 1BK.A05();
                            A054.putString("horizonAccessToken", horizonDialogFragment.A00);
                            A054.putString("horizonUserId", horizonDialogFragment.A02);
                            A054.putString("sessionCookies", horizonDialogFragment.A01);
                            AbL.A12(horizonDialogFragment, AbG.A0g(horizonDialogFragment.A0I), str2);
                            i = 80;
                            bundle = A054;
                            addAccountDialogFragment = horizonDialogFragment;
                        }
                        str3 = "Both Access Token and UserId are required";
                        0fH.A0n(str2, str3);
                        return;
                    }
                    if (this instanceof DblDialogFragment) {
                        DblDialogFragment dblDialogFragment = (DblDialogFragment) this;
                        AbH.A0g(dblDialogFragment).A0H(BMG.A3D, dblDialogFragment.A01);
                        if (dblDialogFragment.A1I()) {
                            return;
                        }
                        DblLiteCredentials dblLiteCredentials = dblDialogFragment.A00;
                        DeviceBasedLoginCredentials deviceBasedLoginCredentials = new DeviceBasedLoginCredentials(BLq.A01, dblLiteCredentials.userId, dblLiteCredentials.nonce);
                        Bundle A055 = 1BK.A05();
                        A055.putParcelable("dblCredentials", deviceBasedLoginCredentials);
                        AbL.A12(dblDialogFragment, AbK.A0P(A055, dblDialogFragment), "DblDialogFragment");
                        i = 42;
                        bundle = A055;
                        addAccountDialogFragment = dblDialogFragment;
                    } else {
                        AddAccountDialogFragment addAccountDialogFragment3 = (AddAccountDialogFragment) this;
                        CharMatcher charMatcher = CharMatcher.Whitespace.INSTANCE;
                        String trimFrom3 = charMatcher.trimFrom(AbM.A0u(addAccountDialogFragment3.A03));
                        String trimFrom4 = charMatcher.trimFrom(AbM.A0u(addAccountDialogFragment3.A02));
                        if (addAccountDialogFragment3.A1I()) {
                            return;
                        }
                        CIj cIj = addAccountDialogFragment3.A06;
                        if (cIj != null) {
                            C2M c2m = cIj.A02;
                            c2m.A00("regular_login_attempt");
                            AbG.A0r(c2m.A01).flowAnnotate(c2m.A00, "NULL_CREDENTIAL", "");
                        }
                        boolean isChecked2 = addAccountDialogFragment3.A01.isChecked();
                        1Ql.A01(1BL.A0V(addAccountDialogFragment3.A0J), C1f0.A03, isChecked2);
                        CMm cMm2 = (CMm) addAccountDialogFragment3.A0C.get();
                        FbUserSession fbUserSession2 = addAccountDialogFragment3.A05;
                        fbUserSession2.getClass();
                        cMm2.A02(fbUserSession2, "opt_out_checkbox", (String) null, isChecked2);
                        Bundle A073 = AbJ.A07(new PasswordCredentials(EPM.A0L, trimFrom3, trimFrom4, "switcher_add_account", addAccountDialogFragment3.A00 + 1));
                        AbK.A0P(A073, addAccountDialogFragment3).A02("AddAccountDialogFragment");
                        addAccountDialogFragment3.A0K.get();
                        TraceLogger.broadcastEvent(10000008, 0, null);
                        str = "auth_switch_accounts";
                        bundle2 = A073;
                        addAccountDialogFragment2 = addAccountDialogFragment3;
                    }
                    str = 1BJ.A00(i);
                    bundle2 = bundle;
                    addAccountDialogFragment2 = addAccountDialogFragment;
                }
            }
        }
        addAccountDialogFragment2.A1H(str, bundle2);
    }

    public void A1D() {
        this.A09.A02("_flow_cancel", AWg(), (String) null);
        A07(this);
        A0p();
        AbH.A0g(this).A0H(BMG.A39, (String) null);
        CMm cMm = (CMm) this.A0H.get();
        FbUserSession fbUserSession = this.A06;
        fbUserSession.getClass();
        CMm.A01(fbUserSession, cMm, 0S2.A0u, (String) null, (Map) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1E() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new D5G(this));
        }
    }

    public void A1F(Bundle bundle) {
        MessengerAccountInfo A0Q;
        String A01 = C15h.A01(this.A0C);
        if (A01 == null || (A0Q = AbK.A0Q(this.A0M, A01)) == null || A0Q.A09 != null) {
            return;
        }
        bundle.putString("alternative_token_app_id", "1517268191927890");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1G(ServiceException serviceException) {
        ApiErrorResult A0H;
        int A00;
        29B r0 = serviceException.errorCode;
        29B r02 = 29B.A02;
        if (r0 == r02 && (A0H = AbI.A0H(serviceException)) != null && ((A00 = A0H.A00()) == 400 || A00 == 401 || A00 == 405 || A00 == 407)) {
            this.A09.A02("_op_usererror", AWg(), Integer.toString(A00));
        } else {
            29B r03 = serviceException.errorCode;
            this.A09.A02("_op_failure", AWg(), r03 == r02 ? serviceException.result.errorDescription : r03.name());
        }
        6HM r04 = (6HM) this.A0E.get();
        Activity activity = this.A00;
        if (activity == null) {
            activity = A16();
        }
        C8S A002 = COW.A00(getContext());
        A002.A00 = this.A0A.Aho();
        A002.A03 = serviceException;
        r04.A01(activity, new COW(A002));
    }

    public void A1H(String str, Bundle bundle) {
        A07(this);
        this.A07.A1R(str, bundle);
        this.A09.A02("_op_start", AWg(), (String) null);
        ((2Q0) 1Bi.A03(100109)).A02(str);
        this.A0B = str;
        A1E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A1S() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1I() {
        /*
            r301 = this;
            r0 = r301
            X.JgM r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A1S()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment.A1I():boolean");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("account_user_id");
            String stringExtra2 = intent.getStringExtra("account_password");
            if (1JF.A0E(new CharSequence[]{stringExtra, stringExtra2}) || A1I()) {
                return;
            }
            Bundle A07 = AbJ.A07(new PasswordCredentials(EPM.A0L, stringExtra, stringExtra2, "switcher_recovered_account"));
            A1F(A07);
            A1H("auth_switch_accounts", A07);
        }
    }

    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof JgM) {
            JgM jgM = (JgM) fragment;
            this.A07 = jgM;
            jgM.A02 = new C1664Ap6(this, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(646764840);
        super.onCreate(bundle);
        this.A06 = 1BL.A0G(this);
        this.A0D = (InputMethodManager) 7zO.A0m(this, 100189);
        this.A09 = (4sY) 1Bn.A0A(83727);
        this.A0C = DBe.A00(this, 17);
        this.A0E = DBe.A00(this, 18);
        0FI.A08(1093864212, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-134634916);
        if (!(this instanceof SsoDialogFragment)) {
            if (this instanceof SwitchSavedAccountDialogFragment) {
                i = 2132543439;
            } else if (!(this instanceof SOAPDialogFragment)) {
                if (this instanceof OneClickAddAccountDialogFragment) {
                    i = 2132543442;
                } else if (this instanceof LoginApprovalDialogFragment) {
                    i = 2132543438;
                } else if (!(this instanceof IGSwitchDialogFragment) && !(this instanceof IGSSODialogFragment) && !(this instanceof HorizonDialogFragment) && !(this instanceof DblDialogFragment)) {
                    i = 2132543435;
                }
            }
            View A08 = AbG.A08(layoutInflater, viewGroup, i);
            0FI.A08(-482286088, A02);
            return A08;
        }
        i = 2132543440;
        View A082 = AbG.A08(layoutInflater, viewGroup, i);
        0FI.A08(-482286088, A02);
        return A082;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(223623840);
        super.onDestroy();
        Activity activity = this.A00;
        if (activity != null) {
            C1oi.A00(activity, -1);
        }
        0FI.A08(-744741021, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        CPl cPl = this.A08;
        if (cPl != null) {
            if (cPl.A02 == this) {
                cPl.A02 = null;
            }
            this.A08 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1995879255);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A1E();
        0FI.A08(-700171422, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0633, code lost:
    
        if (r304 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v176, types: [com.facebook.messaging.accountswitch.DblDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v216, types: [androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.HorizonDialogFragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v226, types: [androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment, com.facebook.messaging.accountswitch.IGSSODialogFragment] */
    /* JADX WARN: Type inference failed for: r0v237, types: [com.facebook.messaging.accountswitch.IGSwitchDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v252, types: [com.facebook.messaging.accountswitch.LoginApprovalDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v357, types: [com.facebook.openidconnect.model.OpenIDCredential, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v388, types: [androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.SOAPDialogFragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v545, types: [com.facebook.messaging.accountswitch.SsoDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 2492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
