package com.facebook.messenger.intents;

import X.08O;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1hN;
import X.AbE;
import X.AbF;
import X.C00i;
import X.C3o5;
import X.DKD;
import X.Hdi;
import X.Hpk;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.sharing.ShareLauncherActivity;

/* loaded from: ShareIntentHandler.class */
public class ShareIntentHandler extends FbFragmentActivity {
    public Hpk A00;
    public C00i A01;
    public 08O A02;
    public Hdi A03;
    public final C00i A05 = 1BQ.A02(85048);
    public final C00i A04 = 1BQ.A02(66441);

    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02ff, code lost:
    
        if (r312 == null) goto L26;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.lang.Throwable, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v209, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r0v240, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v93, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.String] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.intents.ShareIntentHandler.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A02 = DKD.A0d();
        this.A00 = (Hpk) 1Bi.A03(116151);
        this.A03 = (Hdi) 1Bi.A03(99677);
        this.A01 = 1BV.A00(99676);
        if (getIntent().getStringExtra(AbE.A00(ActionId.VIEW_WILL_APPEAR_BEGIN)) != null) {
            ((MessagingPerformanceLogger) this.A05.get()).A0O();
            ((1hN) this.A04.get()).A01("ui_idle_bg");
        }
    }

    public Intent A3B(Intent intent) {
        Intent A0D = C3o5.A0D(this, ShareLauncherActivity.class);
        A0D.setAction(intent.getAction());
        A0D.setType(intent.getType());
        A0D.putExtras(intent.getExtras());
        A0D.addFlags(1);
        return A0D;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            setResult(0, AbF.A05().putExtras(intent.getExtras()));
        } else {
            setResult(-1);
        }
        finish();
    }
}
