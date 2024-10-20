package com.facebook.messaging.accountswitch;

import X.0Pz;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1G0;
import X.1G2;
import X.1G3;
import X.1Hv;
import X.1I7;
import X.1JF;
import X.1Kd;
import X.1Ql;
import X.1lN;
import X.2ZM;
import X.4YU;
import X.67R;
import X.7zL;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbR;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.B9K;
import X.C00i;
import X.C0A2;
import X.C1f0;
import X.C1io;
import X.C2ib;
import X.C6q;
import X.CbN;
import X.ChX;
import X.D4p;
import X.D4q;
import X.D7C;
import X.D7D;
import X.DHy;
import X.DLK;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: SwitchAccountActivity.class */
public class SwitchAccountActivity extends MessengerSettingActivity implements 1lN, C1io {
    public static final CallerContext A0G = CallerContext.A06(SwitchAccountActivity.class);
    public static final 1G2 A0H;
    public static final 1G2 A0I;
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public B9K A07;
    public 1I7 A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public final C00i A0E = AbH.A0R();
    public final List A0D = AnonymousClass001.A0s();
    public boolean A08 = false;
    public final DHy A0F = new ChX(this);

    static {
        1G2 r0 = 1G0.A04;
        A0H = 1G3.A01(r0, "navigate_to_chat_thread_info/");
        A0I = 1G3.A01(r0, "trigger_bcf_info/");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof B9K) {
            this.A07 = (B9K) fragment;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        if (intent != null) {
            setIntent(intent);
        }
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        int i;
        Executor A1E;
        D7C d7d;
        B9K b9k;
        Bundle A05;
        String queryParameter;
        String queryParameter2;
        1Ql A0V;
        1G2 r304;
        super.A2y(bundle);
        this.A09 = (1I7) 1Hv.A02(this, 65731);
        this.A04 = AbH.A0S();
        this.A0C = 1BQ.A02(33215);
        this.A0A = 1BV.A00(83654);
        this.A03 = 7zL.A0R(this, 33031);
        this.A01 = 7zL.A0R(this, 83979);
        this.A05 = 7zL.A0R(this, 49964);
        this.A06 = AbH.A0I();
        this.A02 = 1BQ.A02(16465);
        this.A0B = 1BV.A00(910);
        this.A00 = AbI.A0N();
        this.A08 = getIntent().getBooleanExtra(AbstractC00603o4.A00(86), false);
        A3B();
        if (AbG.A1b(1BK.A0N(((C2ib) this.A0E.get()).A01), 18299249331411770L)) {
            AbR abR = (AbR) this.A0B.get();
            DHy dHy = this.A0F;
            Context A01 = FbInjector.A01();
            AbL.A0y(abR);
            try {
                CbN cbN = new CbN(this, dHy);
                1Bn.A0K();
                FbInjector.A04(A01);
                i = 1;
                1Kd.A0D(cbN.A06, D4p.A00(AnonymousClass001.A0s(), cbN, 7), ((67R) cbN.A05.get()).A03(false, true));
                D4p A00 = D4p.A00(AnonymousClass001.A0s(), cbN, 8);
                A1E = 1BK.A1E(cbN.A03);
                d7d = new D7C(cbN, A00);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        } else {
            i = 1;
            1Kd.A0D(this.A06, D4q.A00(this, 7), ((67R) this.A05.get()).A03(false, true));
            D4q A002 = D4q.A00(this, 8);
            A1E = 1BK.A1E(this.A02);
            d7d = new D7D(this, A002);
        }
        A1E.execute(d7d);
        String stringExtra = getIntent().getStringExtra("extra_account_switch_redirect_source");
        if (bundle == null) {
            1Ql A0V2 = 1BL.A0V(this.A04);
            A0V2.CaL(C1f0.A02, stringExtra);
            A0V2.commit();
            ((C6q) this.A0A.get()).A00("AccountSwitchSetting");
        }
        this.A09.CkS(4YU.A0A("com.facebook.orca.notify.ACTION_CLEAR_SWITCH_TO_FB_ACCOUNT_NOTIFICATION"));
        B9K b9k2 = this.A07;
        if (b9k2 == null) {
            Uri data = getIntent().getData();
            if (data != null) {
                String authority = data.getAuthority();
                List<String> pathSegments = data.getPathSegments();
                if (!TextUtils.isEmpty(authority) && pathSegments.size() == i && (authority.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER) || authority.equals("groupthreadfbid"))) {
                    String A14 = 1BK.A14(pathSegments, 0);
                    1Ql A0V3 = 1BL.A0V(this.A04);
                    A0V3.CaL(A0H, 0Pz.A0j(authority, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A14));
                    A0V3.commit();
                }
                String queryParameter3 = data.getQueryParameter("link");
                if ("share".equals(authority) && !1JF.A0B(queryParameter3)) {
                    if (AbstractC00603o4.A00(558).equals(data.getQueryParameter("src"))) {
                        if (data.getBooleanQueryParameter("restricted_access", false)) {
                            boolean booleanQueryParameter = data.getBooleanQueryParameter("is_group", false);
                            A0V = 1BL.A0V(this.A04);
                            if (booleanQueryParameter) {
                                r304 = A0I;
                                queryParameter3 = 0Pz.A0W(queryParameter3, ",1");
                            } else {
                                A0V.CaL(A0I, 0Pz.A0j(queryParameter3, ",1,", data.getQueryParameter("author_name")));
                                A0V.commit();
                            }
                        } else {
                            A0V = 1BL.A0V(this.A04);
                            r304 = A0I;
                        }
                        A0V.CaL(r304, queryParameter3);
                        A0V.commit();
                    }
                }
            }
            if ("com.facebook.messaging.accountswitch.TRIGGER_DIODE".equals(getIntent().getAction())) {
                Intent intent = getIntent();
                String str = "";
                String str2 = str;
                if (intent.getData() != null) {
                    Uri uri = null;
                    try {
                        uri = C0A2.A03(String.valueOf(intent.getData()));
                    } catch (SecurityException unused) {
                    }
                    if (uri != null && (queryParameter2 = uri.getQueryParameter("browser_name")) != null) {
                        str = queryParameter2;
                    }
                }
                Intent intent2 = getIntent();
                if (intent2.getData() != null) {
                    Uri uri2 = null;
                    try {
                        uri2 = C0A2.A03(String.valueOf(intent2.getData()));
                    } catch (SecurityException unused2) {
                    }
                    if (uri2 != null && (queryParameter = uri2.getQueryParameter("mb")) != null) {
                        str2 = queryParameter;
                    }
                }
                String stringExtra2 = getIntent().getStringExtra("mtouch_diode_user_id");
                b9k = new B9K();
                A05 = 1BK.A05();
                A05.putString("browser_name", str);
                A05.putString("mb", str2);
                A05.putString("trigger_dialog_on_resume", "none");
                A05.putString("trigger_switch_user_id", stringExtra2);
                A05.putString("entering_source", stringExtra);
                A05.putParcelable("target_account_switch_ui_info", null);
            } else {
                String str3 = Objects.equal(getIntent().getAction(), AbstractC00603o4.A00(449)) ? "sso" : Objects.equal(getIntent().getAction(), "com.facebook.messaging.accountswitch.TRIGGER_ADD") ? "add" : "none";
                String stringExtra3 = getIntent().getStringExtra("extra_account_switch_target_uid");
                B9K b9k3 = new B9K();
                Bundle A052 = 1BK.A05();
                A052.putString("trigger_dialog_on_resume", str3);
                A052.putString("target_user_id", stringExtra3);
                A052.putString("entering_source", stringExtra);
                A052.putParcelable("target_account_switch_ui_info", null);
                b9k3.setArguments(A052);
                this.A07 = b9k3;
                if (getIntent().getParcelableExtra("extra_account_switch_target_ui_info") != null) {
                    Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_account_switch_target_ui_info");
                    B9K b9k4 = new B9K();
                    Bundle A053 = 1BK.A05();
                    A053.putString("trigger_dialog_on_resume", str3);
                    A053.putString("target_user_id", stringExtra3);
                    A053.putString("entering_source", stringExtra);
                    A053.putParcelable("target_account_switch_ui_info", parcelableExtra);
                    b9k4.setArguments(A053);
                    this.A07 = b9k4;
                }
                if (getIntent().getStringExtra("extra_account_switch_target_account_owner_id") != null) {
                    String stringExtra4 = getIntent().getStringExtra("extra_account_switch_target_account_owner_id");
                    b9k = new B9K();
                    A05 = 1BK.A05();
                    A05.putString("target_owner_id_dialog_param", stringExtra4);
                    A05.putString("entering_source", stringExtra);
                }
                b9k2 = this.A07;
            }
            b9k.setArguments(A05);
            this.A07 = b9k;
            b9k2 = this.A07;
        }
        A3C(b9k2);
        this.A07.A1f(this.A0D);
    }

    public String AWg() {
        return "mswitch_accounts";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        B9K b9k = this.A07;
        if (b9k != null) {
            b9k.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((2ZM) this.A0C.get()).A02(this, new DLK(AnonymousClass001.A0u()), "3886504514709834");
        super.onBackPressed();
    }
}
