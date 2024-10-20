package com.facebook.voltron.ui.impl;

import X.00Y;
import X.0FI;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1GU;
import X.1Iw;
import X.1iF;
import X.2vC;
import X.2vD;
import X.2vI;
import X.2vK;
import X.2vL;
import X.4YU;
import X.7zL;
import X.AbF;
import X.AbH;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C00i;
import X.C1rs;
import X.C2v7;
import X.C4Fv;
import X.EzN;
import X.FsG;
import X.G16;
import X.QIK;
import X.RCk;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import java.util.Arrays;
import java.util.Set;

/* loaded from: AppModuleDownloadActivity2.class */
public class AppModuleDownloadActivity2 extends FbFragmentActivity implements CallerContextable, C4Fv {
    public Intent A02;
    public C00i A04;
    public String A05;
    public String A07;
    public String[] A0A;
    public C00i A0B;
    public C00i A0C;
    public boolean A0E = false;
    public boolean A08 = false;
    public boolean A0F = false;
    public String A06 = null;
    public final Set A0H = AnonymousClass001.A0v();
    public int A00 = -1;
    public long A01 = -1;
    public EzN A03 = null;
    public Runnable A0D = null;
    public boolean A09 = false;
    public final C00i A0G = 1BQ.A01();
    public final C00i A0I = AbH.A0D();
    public final 2vK A0J = new FsG(this, 1);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02e1, code lost:
    
        if (r309 == null) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00f8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c3 A[Catch: all -> 0x0325, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:11:0x0020, B:13:0x002b, B:15:0x0031, B:18:0x003b, B:21:0x0046, B:26:0x005a, B:30:0x006f, B:33:0x007a, B:34:0x00bb, B:38:0x00d0, B:40:0x00d6, B:41:0x00db, B:42:0x00e2, B:43:0x00e9, B:44:0x00ef, B:47:0x014c, B:48:0x0152, B:50:0x0165, B:52:0x0172, B:54:0x017b, B:57:0x0187, B:58:0x02ae, B:59:0x02b7, B:62:0x02c3, B:65:0x02cf, B:67:0x02d8, B:71:0x0196, B:73:0x019f, B:76:0x01ab, B:78:0x01ba, B:80:0x01c3, B:83:0x01cf, B:85:0x01de, B:87:0x01e7, B:90:0x01f3, B:92:0x0202, B:94:0x020b, B:97:0x0217, B:99:0x0226, B:101:0x022f, B:104:0x023b, B:106:0x024a, B:108:0x0253, B:111:0x025f, B:113:0x026e, B:115:0x0277, B:118:0x0283, B:120:0x0292, B:122:0x029b, B:125:0x02a7, B:127:0x02ef, B:129:0x02fa, B:131:0x0301, B:132:0x0306, B:134:0x0310, B:136:0x031a, B:138:0x00b5, B:140:0x007f, B:140:0x007f, B:143:0x008c, B:145:0x0096, B:147:0x00a0, B:149:0x00af), top: B:4:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A12(com.facebook.voltron.ui.impl.AppModuleDownloadActivity2 r301, java.lang.String r302, short r303) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.voltron.ui.impl.AppModuleDownloadActivity2.A12(com.facebook.voltron.ui.impl.AppModuleDownloadActivity2, java.lang.String, short):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(371927823823983L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        this.A0F = true;
        C2v7 c2v7 = (C2v7) 4YU.A0p(this.A0B);
        synchronized (c2v7) {
            Set set = c2v7.A03;
            synchronized (set) {
                set.remove(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1rs, X.Drk] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1Iw A0W = 7zL.A0W(this);
        QIK qik = new QIK();
        ?? c1rs = new C1rs(qik, A0W, 0, 0);
        c1rs.A01 = qik;
        c1rs.A00 = A0W;
        c1rs.A0J();
        setContentView(LithoView.A02(c1rs.A01, A0W));
        if (this.A0A != null) {
            2vD A00 = ((C2v7) 4YU.A0p(this.A0B)).A00(2vC.A03);
            for (String str : this.A0A) {
                A00.A02(str);
            }
            A00.A02 = "com.facebook.voltron.ui.impl.AppModuleDownloadActivity2";
            String str2 = this.A07;
            if (str2 != null) {
                A00.A03 = str2;
            }
            int i = this.A00;
            if (i >= 0) {
                A00.A00 = i;
            }
            2vI A01 = A00.A01();
            2vL r0 = new 2vL(7zL.A14(this.A0J), RCk.A00);
            synchronized (A01.A03) {
                A01.A04.add(r0);
                2vI.A02(A01);
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        Intent intent = getIntent();
        this.A0A = intent.getStringArrayExtra("app_module_names");
        this.A02 = (Intent) intent.getParcelableExtra("redirect_intent");
        this.A05 = intent.getStringExtra(AbstractC00603o4.A00(ActionId.FUTURE_LISTENERS_COMPLETE));
        this.A07 = intent.getStringExtra("redirect_component_name");
        this.A00 = intent.getIntExtra("redirect_fragment_id", -1);
        this.A01 = intent.getLongExtra("prompt_delay", -1);
        if (0fH.A01.BTv(3)) {
            0fH.A0g(Arrays.toString(this.A0A), "AppModuleDownloadActivity2", "modules names: %s");
            0fH.A0g(this.A02, "AppModuleDownloadActivity2", "redirect intent: %s");
            0fH.A0g(this.A05, "AppModuleDownloadActivity2", "mComponentHelperName: %s");
            0fH.A0g(this.A07, "AppModuleDownloadActivity2", "mRedirectComponentName: %s");
            0fH.A0g(Integer.valueOf(this.A00), "AppModuleDownloadActivity2", "mRedirectFragmentId: %s");
        }
        String[] strArr = this.A0A;
        if (strArr == null || strArr.length == 0) {
            1BK.A09(this.A0G).D0v("AppModuleDownloadActivity2", "Null or empty value for EXTRA_MODULE_NAMES");
            A12(this, "app_module_download_cancel_reason_error", (short) 3);
        }
        Set set = ((C2v7) 4YU.A0p(this.A0B)).A03;
        synchronized (set) {
            set.add(this);
        }
        String[] strArr2 = this.A0A;
        if (strArr2 != null) {
            for (String str : strArr2) {
                if (!00Y.A00().A0A(str)) {
                    return;
                }
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A0B = 1BQ.A02(17111);
        this.A04 = 1BQ.A02(98625);
        this.A0C = AbH.A0K();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        A12(this, "app_module_download_cancel_reason_back", (short) 4);
        this.A0E = true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-530854430);
        super.onPause();
        this.A08 = true;
        EzN ezN = this.A03;
        if (ezN != null) {
            ezN.A00();
            this.A03 = null;
        }
        if (this.A0D != null) {
            ((1GU) 4YU.A0p(this.A0C)).CeL(this.A0D);
            this.A0D = null;
        }
        0FI.A07(-127029568, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1425323756);
        super.onResume();
        if (this.A01 >= 0) {
            this.A0D = new G16(this);
            ((1GU) 4YU.A0p(this.A0C)).CY4(this.A0D, this.A01);
        }
        0FI.A07(215826944, A00);
    }
}
