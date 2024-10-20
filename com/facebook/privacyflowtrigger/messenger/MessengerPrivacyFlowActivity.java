package com.facebook.privacyflowtrigger.messenger;

import X.0FI;
import X.0Q8;
import X.0eS;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.7zM;
import X.AbF;
import X.BKV;
import X.F3t;
import X.InterfaceC03743yx;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.concurrent.locks.Lock;

/* loaded from: MessengerPrivacyFlowActivity.class */
public final class MessengerPrivacyFlowActivity extends FbFragmentActivity implements InterfaceC03743yx {
    public ProgressBar A00;
    public BKV A01;
    public SecureWebView A02;
    public 0eS A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final 1Br A08 = 1Bu.A00(98418);
    public final 1Br A09 = 1BK.A0D();
    public final 1Br A0A = 7zM.A0f(this);
    public final 1Br A07 = 1Bq.A00(83426);
    public final 1Br A0B = 1Bu.A00(100159);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(792133868405948L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        if (this.A06) {
            1Br.A0C(this.A08);
            String str = this.A05;
            if (str != null) {
                Lock writeLock = F3t.A01.writeLock();
                writeLock.lock();
                try {
                    F3t.A00.remove(str);
                } finally {
                    writeLock.unlock();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fb  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.privacyflowtrigger.messenger.MessengerPrivacyFlowActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        SecureWebView secureWebView = this.A02;
        if (secureWebView != null) {
            if (!secureWebView.canGoBack()) {
                return;
            }
            SecureWebView secureWebView2 = this.A02;
            if (secureWebView2 != null) {
                secureWebView2.goBack();
                return;
            }
        }
        11T.A0L("secureWebView");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(90920871);
        super.onPause();
        SecureWebView secureWebView = this.A02;
        if (secureWebView == null) {
            11T.A0L("secureWebView");
            throw 0Q8.createAndThrow();
        }
        secureWebView.onPause();
        0FI.A07(-1607284445, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1756231883);
        super.onResume();
        SecureWebView secureWebView = this.A02;
        if (secureWebView == null) {
            11T.A0L("secureWebView");
            throw 0Q8.createAndThrow();
        }
        secureWebView.onResume();
        0FI.A07(1766386528, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        SecureWebView secureWebView = this.A02;
        if (secureWebView == null) {
            11T.A0L("secureWebView");
            throw 0Q8.createAndThrow();
        }
        secureWebView.saveState(bundle);
    }
}
