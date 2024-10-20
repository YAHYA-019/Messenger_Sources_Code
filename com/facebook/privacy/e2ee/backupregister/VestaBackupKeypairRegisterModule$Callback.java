package com.facebook.privacy.e2ee.backupregister;

import com.facebook.privacy.e2ee.DevicePKEKeypair;
import com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException;

/* loaded from: VestaBackupKeypairRegisterModule$Callback.class */
public interface VestaBackupKeypairRegisterModule$Callback {
    void onFailure(BackupException backupException, DevicePKEKeypair devicePKEKeypair);

    void onSuccess(DevicePKEKeypair devicePKEKeypair);
}
