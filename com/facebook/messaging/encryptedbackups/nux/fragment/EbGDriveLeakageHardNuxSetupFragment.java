package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.48X;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.9Zc;
import X.C1wk;
import X.C9hO;
import X.C9uq;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment;

/* loaded from: EbGDriveLeakageHardNuxSetupFragment.class */
public final class EbGDriveLeakageHardNuxSetupFragment extends EncryptedBackupsGDriveSetupFragment {
    public C9uq A00;
    public C1wk A01;
    public 48X A02;
    public C9hO A03;
    public 9Zc A04;

    @Override // com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1B(Bundle bundle) {
        super.A1B(bundle);
        9Zc r0 = this.A04;
        if (r0 == null) {
            11T.A0L("leakageHardNuxViewData");
            throw 0Q8.createAndThrow();
        }
        r0.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsGDriveSetupFragment, com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1S(Bundle bundle) {
        String str;
        super.A1S(bundle);
        this.A00 = 7zR.A0X();
        this.A01 = 7zU.A0Q();
        this.A03 = (C9hO) 1Bi.A03(68813);
        this.A02 = 7zQ.A0f();
        1Bn.A0A(68825);
        FbUserSession fbUserSession = ((GDriveSetupRestoreFragment) this).A00;
        if (fbUserSession != null) {
            this.A04 = new 9Zc(fbUserSession, requireContext());
            C9uq c9uq = this.A00;
            str = "userFlowLogger";
            if (c9uq != null) {
                C1wk c1wk = this.A01;
                if (c1wk == null) {
                    str = "nuxFlagManager";
                } else {
                    Integer valueOf = Integer.valueOf(c1wk.A09());
                    C9hO c9hO = this.A03;
                    if (c9hO == null) {
                        str = "touchPointProvider";
                    } else {
                        c9uq.A05(c9hO.A01(), valueOf);
                        C9uq c9uq2 = this.A00;
                        if (c9uq2 != null) {
                            c9uq2.A09("EbGDriveLeakageHardNuxSetupFragment");
                            return;
                        }
                    }
                }
            }
        } else {
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-111394666);
        48X r0 = this.A02;
        if (r0 == null) {
            11T.A0L("coolDownFlagHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A00();
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(858052551, A02);
    }
}
