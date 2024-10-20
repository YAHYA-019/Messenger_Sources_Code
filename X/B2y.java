package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.account.recovery.common.protocol.AccountRecoverySendConfirmationCodeMethod$Params;
import com.facebook.account.recovery.common.protocol.AccountRecoveryValidateCodeMethod$Params;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import com.google.common.collect.ImmutableList;

/* loaded from: B2y.class */
public abstract class B2y extends B2z {
    public static final String __redex_internal_original_name = "AccountLoginRecBaseFragment";
    public COx A00;
    public COx A01;
    public DEf A02;
    public final C00i A05 = 1BV.A00(32994);
    public final BPY A04 = new B37(this, 6);
    public final 1Oe A03 = (1Oe) 1Bi.A03(16617);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        String A00 = 1BJ.A00(73);
        String A002 = DKB.A00(295);
        BPY bpy = this.A04;
        COx cOx = new COx(this, ((AlJ) this).A00, new C00(getContext()), bpy, A00, "send_code", A002, false);
        COx.A02(cOx);
        this.A01 = cOx;
        COx cOx2 = new COx(this, ((AlJ) this).A00, new QOw(getContext()), bpy, 1BJ.A00(74), "confirm_code", "accountRecoveryValidateCodeParamsKey", false);
        COx.A02(cOx2);
        this.A00 = cOx2;
    }

    public void A1e() {
    }

    public void A1f(String str) {
        ImmutableList A01;
        A1a();
        AccountLoginSegueRecBaseData accountLoginSegueRecBaseData = (AccountLoginSegueRecBaseData) ((AlJ) this).A01;
        AccountCandidateModel accountCandidateModel = accountLoginSegueRecBaseData.A02;
        if (accountCandidateModel != null) {
            int i = accountLoginSegueRecBaseData.A00;
            if (i == 1) {
                A01 = accountCandidateModel.A03();
            } else if (i != 2) {
                return;
            } else {
                A01 = accountCandidateModel.A01();
            }
            this.A01.A04(new AccountRecoverySendConfirmationCodeMethod$Params(((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A02.id, "messenger_account_login", A01), str, 2131957326);
        }
    }

    public boolean A1g(String str, String str2, boolean z, boolean z2) {
        String str3 = str2;
        A1a();
        String str4 = ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A05;
        if (TextUtils.isEmpty(str4)) {
            str4 = ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A07;
        }
        if (((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A02 == null || TextUtils.isEmpty(str4)) {
            return false;
        }
        String str5 = ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A02.id;
        int i = 2131957326;
        if (z2) {
            i = 2131952196;
        }
        COx cOx = this.A00;
        if (str2 == null) {
            str3 = "";
        }
        return cOx.A04(new AccountRecoveryValidateCodeMethod$Params(str5, str4, str3, z2 ? "google_sms_retriever" : "manual", z), str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof DEf) {
            this.A02 = (DEf) context;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (((X.4DL) r301.A05.get()).A00(r0, r0.getStringExtra(r306)) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r301 = this;
            r0 = 345973808(0x149f2430, float:1.606917E-26)
            r302 = r0
            r0 = r302
            int r0 = X.0FI.A02(r0)
            r303 = r0
            r0 = r301
            super/*androidx.fragment.app.Fragment*/.onResume()
            r0 = r301
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L41
            r0 = r304
            android.content.Intent r0 = r0.getIntent()
            r305 = r0
            java.lang.String r0 = "is_msite_sso_eligible"
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.hasExtra(r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L48
            r0 = 0
            r304 = r0
            r0 = r305
            r1 = r306
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L48
        L3a:
            r0 = r305
            r1 = r306
            r0.removeExtra(r1)
        L41:
            r0 = -645559050(0xffffffffd9858cf6, float:-4.698895E15)
            r1 = r303
            X.0FI.A08(r0, r1)
            return
        L48:
            java.lang.String r0 = "is_msite_sso_uri"
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.hasExtra(r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L41
            r0 = r301
            X.00i r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.4DL r0 = (X.4DL) r0
            r307 = r0
            r0 = r305
            r1 = r306
            java.lang.String r0 = r0.getStringExtra(r1)
            r304 = r0
            r0 = r307
            r1 = r305
            r2 = r304
            boolean r0 = r0.A00(r1, r2)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L41
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B2y.onResume():void");
    }
}
