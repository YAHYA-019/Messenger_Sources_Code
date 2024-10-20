package com.facebook.privacy.e2ee.backuprestore;

import com.facebook.privacy.e2ee.DevicePKEKeypair;
import com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException;

/* loaded from: VestaBackupKeypairRestoreModule$Callback.class */
public interface VestaBackupKeypairRestoreModule$Callback {
    void onFailure(BackupException backupException, Integer num);

    void onSuccess(DevicePKEKeypair devicePKEKeypair);
}
