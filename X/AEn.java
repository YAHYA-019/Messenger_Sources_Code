package X;

import com.facebook.messaging.encryptedbackups.utils.debug.EncryptedBackupDebugActivity;

/* loaded from: AEn.class */
public final class AEn implements Runnable {
    public static final String __redex_internal_original_name = "EncryptedBackupDebugActivity$createToast$1";
    public final /* synthetic */ EncryptedBackupDebugActivity A00;
    public final /* synthetic */ String A01;

    public AEn(EncryptedBackupDebugActivity encryptedBackupDebugActivity, String str) {
        this.A00 = encryptedBackupDebugActivity;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        7zR.A0z(this.A00, this.A01);
    }
}
