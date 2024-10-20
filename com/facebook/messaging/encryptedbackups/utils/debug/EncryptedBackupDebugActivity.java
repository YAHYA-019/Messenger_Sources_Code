package com.facebook.messaging.encryptedbackups.utils.debug;

import X.0Q8;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Fv;
import X.1Lo;
import X.7zU;
import X.9ZO;
import X.9lN;
import X.AnonymousClass001;
import X.C1ud;
import X.C1x8;
import X.C9qq;
import X.C9rb;
import X.RTT;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: EncryptedBackupDebugActivity.class */
public final class EncryptedBackupDebugActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public 9lN A01;
    public RTT A02;
    public C1x8 A03;
    public final Handler A04 = AnonymousClass001.A07();

    public static final void A12(EncryptedBackupDebugActivity encryptedBackupDebugActivity) {
        C1x8 c1x8 = encryptedBackupDebugActivity.A03;
        if (c1x8 == null) {
            11T.A0L("encryptedBackupsManager");
            throw 0Q8.createAndThrow();
        }
        C9rb.A00(c1x8.A05(), encryptedBackupDebugActivity, 29);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        super.A2y(bundle);
        if (!C1ud.A00((C1ud) 1Bi.A03(65997)).AZk(36316426685261784L)) {
            finish();
        }
        FbUserSession A05 = ((1Fv) 1Bi.A03(66351)).A05(this);
        this.A00 = A05;
        if (A05 != null) {
            this.A03 = (C1x8) 1Lo.A04(this, A05, (1BY) null, 16874);
            String stringExtra = getIntent().getStringExtra("USER_FLOW");
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (!stringExtra.equals("RC")) {
                if (!stringExtra.equals("PIN")) {
                    finish();
                    return;
                }
                0fH.A0j("EncryptedBackupDebugActivity", "startCreatePin");
                FbUserSession A052 = ((1Fv) 1Bi.A03(66351)).A05(this);
                1Bn.A0A(68895);
                9lN r0 = new 9lN(this, A052, (9ZO) 1Bi.A03(68801));
                this.A01 = r0;
                C9qq.A00(this, 7zU.A0E(r0.A0E), 64);
                9lN r02 = this.A01;
                str = "pinViewData";
                if (r02 != null) {
                    r02.A04("142857");
                    9lN r03 = this.A01;
                    if (r03 != null) {
                        r03.A04("142857");
                        return;
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            1Bn.A0A(68832);
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                RTT rtt = new RTT(fbUserSession, this);
                this.A02 = rtt;
                C9qq.A00(this, rtt.A02, 65);
                return;
            }
        }
        str = "fbUserSession";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
