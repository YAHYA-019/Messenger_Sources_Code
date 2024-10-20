package com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment;

import X.0Q8;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1xK;
import X.7zN;
import X.7zU;
import X.AQn;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C96q;
import X.C97j;
import X.C9uq;
import X.GF6;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: EbProdRecoveryCodeMigrationFragment.class */
public final class EbProdRecoveryCodeMigrationFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 1xK A00;
    public final 1Br A01 = 1Bq.A00(68794);
    public final C01i A02 = C01g.A00(C03i.A02, AQn.A01(this, 41));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        1xK r0 = (1xK) 7zN.A0n(this, A1b(), 68817);
        this.A00 = r0;
        if (r0 == null) {
            11T.A0L("recoveryCodeMigrationProvider");
            throw 0Q8.createAndThrow();
        }
        int intValue = r0.A01().intValue();
        String str = intValue != 2 ? intValue != 3 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : "THREE" : "ONE";
        C00i c00i = this.A01.A00;
        C9uq.A01(7zU.A0O(c00i), C96q.A0D, null, null);
        7zU.A0O(c00i).A0A("TOUCH_POINT", "NUX");
        7zU.A0O(c00i).A0A("DAY", str);
        7zU.A0O(c00i).A08("NUX_IMPRESSION");
    }

    @Override // X.GF6
    public boolean Bkd() {
        7zU.A0P(this.A01).A06("BACK_BUTTON_TAP");
        7zU.A1O(C97j.A0O, this);
        return false;
    }
}
