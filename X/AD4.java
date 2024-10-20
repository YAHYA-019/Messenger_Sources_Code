package X;

import com.facebook.messaging.encryptedbackups.utils.debug.EncryptedBackupDebugActivity;

/* loaded from: AD4.class */
public final class AD4 implements Runnable {
    public static final String __redex_internal_original_name = "EncryptedBackupDebugActivity$continuePinSetupFlow$1";
    public final /* synthetic */ EncryptedBackupDebugActivity A00;

    public AD4(EncryptedBackupDebugActivity encryptedBackupDebugActivity) {
        this.A00 = encryptedBackupDebugActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncryptedBackupDebugActivity encryptedBackupDebugActivity = this.A00;
        9lN r0 = encryptedBackupDebugActivity.A01;
        if (r0 != null) {
            r0.A04("142857");
            9lN r02 = encryptedBackupDebugActivity.A01;
            if (r02 != null) {
                r02.A04("142857");
                return;
            }
        }
        11T.A0L("pinViewData");
        throw 0Q8.createAndThrow();
    }
}
