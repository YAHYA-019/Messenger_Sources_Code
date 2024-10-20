package com.facebook.payments.chromecustomtabs;

import X.0FI;
import X.1BQ;
import X.3K9;
import X.6Gx;
import X.C00i;
import X.C09h;
import X.C3Qn;
import X.DKC;
import X.DKD;
import X.DKH;
import X.ER3;
import X.FHR;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: CustomTabMainActivity.class */
public class CustomTabMainActivity extends Activity {
    public C00i A00;
    public boolean A01 = true;
    public final C00i A02 = 1BQ.A01();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        String scheme;
        int A00 = 0FI.A00(1479545814);
        super.onCreate(bundle);
        this.A00 = DKD.A0P();
        if (C09h.A03().A04(this, getIntent(), this)) {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("extra_url");
                C3Qn c3Qn = new C3Qn();
                Uri A0A = DKH.A0A(this.A02, stringExtra);
                if (A0A != null && (scheme = A0A.getScheme()) != null && (scheme.equals("https") || scheme.equals("http"))) {
                    3K9 A01 = c3Qn.A01();
                    Intent intent = A01.A00;
                    intent.setData(A0A);
                    startActivity(intent, A01.A01);
                }
                this.A01 = false;
            }
            i = 1795890110;
        } else {
            finish();
            i = 415572128;
        }
        0FI.A07(i, A00);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        int i = 0;
        if ("action_custom_tab_redirect".equals(intent.getAction())) {
            i = -1;
        }
        setResult(i, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1138806396);
        super.onResume();
        if (this.A01) {
            setResult(0);
            finish();
            6Gx A0a = DKC.A0a(this.A00);
            FHR A002 = FHR.A00();
            A002.A08("cancel_add_paypal");
            A002.A04(ER3.A03);
            A0a.A05(A002);
        }
        this.A01 = true;
        0FI.A07(185115811, A00);
    }
}
