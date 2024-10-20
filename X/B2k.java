package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.credentials.DeviceBasedLoginCredentials;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSOFacebook;
import java.util.List;

/* loaded from: B2k.class */
public final class B2k extends B2l {
    public static final String __redex_internal_original_name = "AccountLoginSSOFacebookFragment";
    public COx A00;
    public List A01;
    public COx A02;
    public COx A03;
    public final C00i A06 = new 1HH(this, 50020);
    public final C00i A05 = AbI.A0N();
    public final C00i A0A = 1BV.A00(32994);
    public final C00i A07 = 1BQ.A01();
    public final C00i A04 = AlJ.A03(this);
    public final C00i A08 = 1BQ.A02(100107);
    public final DJy A0C = new ChQ(this, 1);
    public final DIj A09 = new ChW(this);
    public final BPY A0B = new B37(this, 10);

    public static String A08(FirstPartySsoSessionInfo firstPartySsoSessionInfo) {
        return firstPartySsoSessionInfo.A02 > 0 ? "sso_account_description_type_unseen_message" : firstPartySsoSessionInfo.A01 > 0 ? "sso_account_description_type_unread_message" : firstPartySsoSessionInfo.A03 > 0 ? "sso_account_description_type_unseen_stories" : firstPartySsoSessionInfo.A00 > 0 ? "sso_account_description_type_online_friends" : "sso_account_description_type_empty_description";
    }

    public static void A09(B2k b2k) {
        FirstPartySsoSessionInfo firstPartySsoSessionInfo = ((AccountLoginSegueSSOFacebook) ((AlJ) b2k).A01).A02;
        if (firstPartySsoSessionInfo != null && BRy.A00(firstPartySsoSessionInfo)) {
            if (b2k.A03 != null) {
                String str = firstPartySsoSessionInfo.A05;
                if (!1JF.A0B(str)) {
                    COx cOx = b2k.A03;
                    Bundle A05 = 1BK.A05();
                    A05.putString(cOx.A07, str);
                    cOx.A03(A05, "action_auth_with_fb_sso", 2131952189);
                    CQH A0V = AbF.A0V(b2k.A05);
                    BMG bmg = BMG.A2v;
                    String str2 = firstPartySsoSessionInfo.A08;
                    1UG A00 = CQH.A00(A0V);
                    if (A00.isSampled()) {
                        AbK.A1J(A00, bmg.name, CQH.A02(str2));
                        return;
                    }
                    return;
                }
            }
            String A002 = firstPartySsoSessionInfo.A00("secret");
            String A003 = firstPartySsoSessionInfo.A00("machine_id");
            if (b2k.A02 != null && !1JF.A0B(A002) && !1JF.A0B(A003)) {
                String str3 = firstPartySsoSessionInfo.A08;
                DeviceBasedLoginCredentials deviceBasedLoginCredentials = new DeviceBasedLoginCredentials(BLq.A01, str3, A002);
                Bundle A052 = 1BK.A05();
                A052.putParcelable("dblCredentials", deviceBasedLoginCredentials);
                A052.putString("login_source", "sso_login");
                A052.putString("machine_id", A003);
                b2k.A02.A03(A052, "action_auth_with_fb_sso", 2131952189);
                CQH A0V2 = AbF.A0V(b2k.A05);
                BMG bmg2 = BMG.A2z;
                1UG A004 = CQH.A00(A0V2);
                if (A004.isSampled()) {
                    AbK.A1J(A004, bmg2.name, CQH.A02(str3));
                    return;
                }
                return;
            }
        }
        b2k.A0C.BhJ();
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.B34, X.C00, X.B36] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.B34, X.C00, X.B36] */
    @Override // X.B2l
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        BPY bpy = this.A0B;
        Context context = getContext();
        DJy dJy = this.A0C;
        ?? b36 = new B36(context, dJy);
        b36.A00 = dJy;
        COx cOx = new COx(this, ((AlJ) this).A00, (C00) b36, bpy, "auth_sso", "sso_login", "accessToken", false);
        COx.A02(cOx);
        this.A03 = cOx;
        String A00 = 1BJ.A00(42);
        ?? b362 = new B36(getContext(), dJy);
        b362.A00 = dJy;
        COx cOx2 = new COx(this, ((AlJ) this).A00, (C00) b362, bpy, A00, "sso_login", "dblCredentials", false);
        COx.A02(cOx2);
        this.A02 = cOx2;
        List list = ((AccountLoginSegueSSOFacebook) ((AlJ) this).A01).A06;
        this.A01 = list;
        if (list != null) {
            COx cOx3 = new COx(this, (CIw) null, (C00) null, bpy, 1BJ.A00(426), "fetch_badge", "", false);
            COx.A02(cOx3);
            this.A00 = cOx3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int i;
        CQH cqh;
        BMG bmg;
        int A02 = 0FI.A02(-1822444323);
        super/*androidx.fragment.app.Fragment*/.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            String stringExtra = intent.getStringExtra(AbstractC00603o4.A00(192));
            if (intent.hasExtra("is_msite_sso_eligible") && intent.getBooleanExtra("is_msite_sso_eligible", false)) {
                intent.removeExtra("is_msite_sso_eligible");
                List list = this.A01;
                super.A03 = A1e("vcuid");
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        i2 = -1;
                        cqh = (CQH) super.A07.get();
                        bmg = BMG.A0w;
                        break;
                    } else {
                        if (((FirstPartySsoSessionInfo) list.get(i2)).A08.equals(super.A03)) {
                            cqh = (CQH) super.A07.get();
                            bmg = BMG.A0x;
                            break;
                        }
                        i2++;
                    }
                }
                cqh.A0N(bmg, "", "", super.A03, "");
                String A1e = A1e("vcuid");
                String A1e2 = A1e("entry_point");
                if (i2 == -1) {
                    A1i(BMG.A0z);
                } else if ("page_message_button".equals(A1e2) && 1JF.A0B(A1e)) {
                    i = 903937757;
                    0FI.A08(i, A02);
                } else {
                    AbN.A1B(this, i2);
                    ((CQH) this.A05.get()).A0N(BMG.A0v, "", "", A1e, "");
                }
            } else if ("auth_type_nonce".equals(stringExtra)) {
                A1g();
            } else if ("auth_type_native_sso".equals(stringExtra)) {
                A1h();
            } else if (intent.hasExtra("is_msite_sso_uri") && ((4DL) this.A0A.get()).A00(intent, intent.getStringExtra("is_msite_sso_uri"))) {
                intent.removeExtra("is_msite_sso_uri");
            }
        }
        i = -663334861;
        0FI.A08(i, A02);
    }
}
