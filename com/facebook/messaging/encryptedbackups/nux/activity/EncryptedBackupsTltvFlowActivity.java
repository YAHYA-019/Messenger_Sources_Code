package com.facebook.messaging.encryptedbackups.nux.activity;

import X.0S2;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.1pK;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.AQv;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C06c;
import X.C95y;
import X.C9X3;
import X.DKy;
import X.R0d;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbSetupMoreOptionFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.MeNuxCreatePinSoftBlockFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: EncryptedBackupsTltvFlowActivity.class */
public final class EncryptedBackupsTltvFlowActivity extends FbFragmentActivity {
    public final 1Br A00 = 7zM.A0f(this);
    public final 1Br A01 = 7zM.A0Y();
    public final 1Br A02 = 1Bu.A00(68910);
    public final 1Br A03 = 7zM.A0W();
    public final C01i A04 = C01g.A01(AQv.A01(this, 26));

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return 7zR.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String string;
        Integer num;
        C06c A0D;
        int i;
        1pK hsmPinCodeSetupBaseFragment;
        String str;
        super.A2y(bundle);
        setContentView(2132541927);
        MigColorScheme.A00(A2c(2131363888), 7zQ.A0m(this.A00));
        ((DKy) this.A04.getValue()).A01(this);
        if (bundle == null) {
            Bundle A0H = 7zO.A0H(this);
            if (A0H == null || (string = A0H.getString("USER_FLOW_ARG")) == null) {
                throw 1BK.A0h();
            }
            if (string.equals("DEFAULT")) {
                num = 0S2.A00;
            } else if (string.equals("ADVANCED_OPTION")) {
                num = 0S2.A01;
            } else if (string.equals("SETUP_BACKUP_SETTING")) {
                num = 0S2.A0C;
            } else {
                if (!string.equals("SHOW_FS_NUX")) {
                    throw AnonymousClass001.A0L(string);
                }
                num = 0S2.A0N;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                A0D = 7zU.A0D(this);
                i = 2131363889;
                hsmPinCodeSetupBaseFragment = new HsmPinCodeSetupBaseFragment();
                str = "Default_Option";
            } else if (intValue != 3) {
                C95y c95y = (7zP.A0a(this.A03).A09() && ((C9X3) 1Br.A0B(this.A02)).A00()) ? C95y.A03 : C95y.A04;
                A0D = 7zU.A0D(this);
                i = 2131363889;
                hsmPinCodeSetupBaseFragment = new EbSetupMoreOptionFragment();
                Bundle A05 = 1BK.A05();
                A05.putBoolean("IS_FROM_SETTING", true);
                A05.putString("PREFERRED_OPTION", c95y.toString());
                hsmPinCodeSetupBaseFragment.setArguments(A05);
                str = "Advanced_Option";
            } else {
                1pK gDriveSetupRestoreFragment = ((C9X3) 1Br.A0B(this.A02)).A00() ? new GDriveSetupRestoreFragment() : new MeNuxCreatePinSoftBlockFragment();
                A0D = 7zU.A0D(this);
                i = 2131363889;
                hsmPinCodeSetupBaseFragment = (Fragment) gDriveSetupRestoreFragment;
                str = "FS_NUX_FLOW";
            }
            A0D.A0P(hsmPinCodeSetupBaseFragment, str, i);
            A0D.A04();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (R0d.A00(this)) {
            return;
        }
        super.onBackPressed();
    }
}
