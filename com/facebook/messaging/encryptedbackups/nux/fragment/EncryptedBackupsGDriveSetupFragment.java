package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.0fH;
import X.11T;
import X.1BL;
import X.1pK;
import X.7zL;
import X.7zR;
import X.7zT;
import X.96R;
import X.AnonymousClass001;
import X.C06c;
import X.C97j;
import X.C9uq;
import X.FAn;
import X.GF6;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;

/* loaded from: EncryptedBackupsGDriveSetupFragment.class */
public class EncryptedBackupsGDriveSetupFragment extends GDriveSetupRestoreFragment implements GF6 {
    public C9uq A00;
    public FAn A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(EncryptedBackupsGDriveSetupFragment encryptedBackupsGDriveSetupFragment) {
        int A0U = encryptedBackupsGDriveSetupFragment.mFragmentManager.A0U();
        String str = "setupFlowLogger";
        C9uq c9uq = encryptedBackupsGDriveSetupFragment.A00;
        if (A0U > 0) {
            if (c9uq != null) {
                c9uq.A08("SETUP_WITH_GDRIVE_BACK_BUTTON_TAP");
                encryptedBackupsGDriveSetupFragment.mFragmentManager.A0w();
                return;
            }
        } else if (c9uq != null) {
            c9uq.A06("SETUP_WITH_GDRIVE_BACK_BUTTON_TAP");
            String str2 = C97j.A0O.key;
            if (encryptedBackupsGDriveSetupFragment.A01 != null) {
                7zR.A10(Bundle.EMPTY, encryptedBackupsGDriveSetupFragment, str2);
                return;
            }
            str = "intentBuilder";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 7zR.A0X();
        this.A01 = 7zR.A0Y();
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            0fH.A0j("EncryptedBackupsGDriveSetupFragment", "arguments is null: add setup type");
            7zT.A1B(this, "flow_type", 96R.A03.value);
            return;
        }
        1BL.A1I(bundle2, "arguments is not null: put setup type ", "EncryptedBackupsGDriveSetupFragment", AnonymousClass001.A0k());
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            bundle3.putString("flow_type", 96R.A03.value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1b() {
        C9uq c9uq = this.A00;
        if (c9uq == null) {
            11T.A0L("setupFlowLogger");
            throw 0Q8.createAndThrow();
        }
        c9uq.A08("SETUP_WITH_GDRIVE_CREATE_PIN_TAP");
        1pK hsmPinCodeSetupBaseFragment = new HsmPinCodeSetupBaseFragment();
        7zT.A1B(hsmPinCodeSetupBaseFragment, "from_setting", AnonymousClass001.A0K());
        C06c A0G = 7zL.A0G(this.mFragmentManager);
        A0G.A0P(hsmPinCodeSetupBaseFragment, this.mTag, 2131363889);
        A0G.A0V(this.mTag);
        A0G.A04();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.facebook.messaging.encryptedbackups.nux.fragment.GDriveMESoftNuxSetupFragment, androidx.fragment.app.Fragment] */
    @Override // X.GF6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bkd() {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsGDriveSetupFragment.Bkd():boolean");
    }
}
