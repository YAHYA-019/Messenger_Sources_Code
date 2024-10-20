package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.48X;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.C00i;
import X.C1wk;
import X.C9hO;
import X.C9uq;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;

/* loaded from: GDriveHardNuxSetupFragment.class */
public final class GDriveHardNuxSetupFragment extends EncryptedBackupsGDriveSetupFragment {
    public C9uq A00;
    public C1wk A01;
    public 48X A02;
    public C9hO A03;

    @Override // com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1B(Bundle bundle) {
        super.A1B(bundle);
        GoogleDriveViewData A1a = A1a();
        C00i c00i = A1a.A0E.A00;
        1BK.A0G(c00i).A0K();
        if (7zP.A0a(A1a.A0B).A04()) {
            7zQ.A0M(A1a.A07).A0E(0S2.A0j);
        }
        7zU.A0P(A1a.A0G).A0A("HARD_NUX_FIRST_SEEN_TIMESTAMP", String.valueOf(1BK.A0G(c00i).A0D()));
    }

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsGDriveSetupFragment, com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 7zR.A0X();
        this.A01 = 7zU.A0Q();
        this.A03 = (C9hO) 1Bi.A03(68813);
        this.A02 = 7zQ.A0f();
        C9uq c9uq = this.A00;
        String str = "userFlowLogger";
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
                        c9uq2.A08("SETUP_EDUCATIONAL_SCREEN_IMPRESSION");
                        C9uq c9uq3 = this.A00;
                        if (c9uq3 != null) {
                            c9uq3.A09("GDriveIntroFragment");
                            return;
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-469499441);
        48X r0 = this.A02;
        if (r0 == null) {
            11T.A0L("coolDownFlagHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A00();
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(818231626, A02);
    }
}
