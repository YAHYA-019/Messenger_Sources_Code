package com.facebook.privacy.e2ee.backupregister;

import com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException;

/* loaded from: VestaBackupSecretRegisterModule$Callback.class */
public interface VestaBackupSecretRegisterModule$Callback {
    void onFailure(BackupException backupException);

    void onSuccess();
}
