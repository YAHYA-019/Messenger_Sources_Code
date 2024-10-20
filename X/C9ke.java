package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsRestoreBackupFragment;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.fragment.EbOneTimeCodeRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbHsmMigrationRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbNuxPasskeyRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreOptionsFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreRecoveryCodeFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsGDriveRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinCodeRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinDisabledFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinResetYourPinFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinTryAgainFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsOtcFirstGreetingFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsOtherStepsToRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsResetYourRecoveryCodeFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.HighFrictionRestoreIntroFragment;
import java.util.List;
import java.util.Set;

/* renamed from: X.9ke, reason: invalid class name */
/* loaded from: 9ke.class */
public final class C9ke {
    public static final java.util.Map A08 = 04R.A09(new 03Y[]{1BK.A1G(C97j.A0Y.key, EbOneTimeCodeRestoreFragment.class), 1BK.A1G(C97j.A0e.key, EbRestoreRecoveryCodeFragment.class), 1BK.A1G(C97j.A0a.key, EncryptedBackupsHsmPinCodeRestoreFragment.class), 1BK.A1G(C97j.A0X.key, EbRestoreOptionsFragment.class)});
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final List A07;

    public C9ke(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A07 = C0s8.A14(EbRestoreRecoveryCodeFragment.class, EbOneTimeCodeRestoreFragment.class, EncryptedBackupsGDriveRestoreFragment.class, EbNuxPasskeyRestoreFragment.class, EncryptedBackupsHsmPinCodeRestoreFragment.class, EncryptedBackupsOtcFirstGreetingFragment.class, EncryptedBackupsHsmPinDisabledFragment.class, EncryptedBackupsHsmPinResetYourPinFragment.class, EncryptedBackupsHsmPinTryAgainFragment.class, EncryptedBackupsOtherStepsToRestoreFragment.class, EncryptedBackupsResetYourRecoveryCodeFragment.class, EncryptedBackupsRestoreBackupFragment.class, EbRestoreOptionsFragment.class, HighFrictionRestoreIntroFragment.class, EbHsmMigrationRestoreFragment.class);
        this.A01 = 7zM.A0W();
        this.A03 = 1Bu.A00(68823);
        this.A04 = 7zM.A0b();
        this.A02 = 1Lm.A01(fbUserSession, 68800);
        this.A00 = 1Bq.A00(68887);
        this.A05 = 1Bu.A00(68812);
        this.A06 = 1Bu.A00(68891);
    }

    public static final 8Kx A00(Bundle bundle, C9ke c9ke, Set set, boolean z) {
        Class cls;
        1Br r0 = c9ke.A03;
        if (7zP.A0a(((C9hn) 1Br.A0B(r0)).A00).A06() || !set.contains(C96p.A0E)) {
            C9hn c9hn = (C9hn) 1Br.A0B(r0);
            if (set.contains(C96p.A06)) {
                C1ud A0a = 7zP.A0a(c9hn.A00);
                if (!7zM.A1a(A0a, C1ud.A00(A0a), 36316426691160056L)) {
                    1Br.A0B(r0);
                    cls = EncryptedBackupsGDriveRestoreFragment.class;
                }
            }
            1Br.A0B(r0);
            if (set.contains(C96p.A08)) {
                1Br.A0B(r0);
                cls = EncryptedBackupsHsmPinCodeRestoreFragment.class;
            } else {
                1Br.A0B(r0);
                if (set.contains(C96p.A0D)) {
                    1Br.A0B(r0);
                    cls = EbRestoreRecoveryCodeFragment.class;
                } else if (((C9hn) 1Br.A0B(r0)).A02(set)) {
                    1Br.A0B(r0);
                    cls = EncryptedBackupsOtcFirstGreetingFragment.class;
                } else {
                    1Br.A0B(r0);
                    if (bundle.getBoolean("is_nux_flow", false)) {
                        7zO.A0Z(c9ke.A04).A06("RESTORE_BACKUP_NO_VALID_RESTORE_OPTIONS_AVAILABLE");
                        C9hn.A00((C9hn) 1Br.A0B(r0)).A04();
                        return null;
                    }
                    1Br.A0B(r0);
                    cls = EncryptedBackupsOtherStepsToRestoreFragment.class;
                }
            }
        } else {
            1Br.A0B(r0);
            cls = EbNuxPasskeyRestoreFragment.class;
        }
        return new 8Kx((Bundle) null, cls, !z, z);
    }
}
