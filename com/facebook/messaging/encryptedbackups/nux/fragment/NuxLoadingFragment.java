package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.7zL;
import X.7zP;
import X.7zQ;
import X.9Bt;
import X.9mR;
import X.9nI;
import X.AQn;
import X.C9qq;
import X.GF6;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;

/* loaded from: NuxLoadingFragment.class */
public final class NuxLoadingFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 9nI A00;

    public void A1B(Bundle bundle) {
        super.A1B(bundle);
        if (A1l()) {
            EncryptedBackupsNuxViewData A1o = A1o();
            if (7zP.A0a(A1o.A07).A04()) {
                7zQ.A0M(A1o.A06).A0E(0S2.A0N);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        if (r313 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.nux.fragment.NuxLoadingFragment.A1S(android.os.Bundle):void");
    }

    @Override // X.GF6
    public boolean Bkd() {
        9nI r0 = this.A00;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        0fH.A0k("NuxLoadingViewData", "User exit with back btn");
        9mR.A02(9nI.A01(r0), "BACK_BUTTON_PRESSED", 14);
        A1Q().moveTaskToBack(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        9nI r0 = this.A00;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C9qq.A00(this, r0.A02, 41);
        A1o().A04(this, AQn.A01(this, 19));
        9Bt.A00(this, true);
    }
}
