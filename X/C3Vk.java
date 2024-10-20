package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* renamed from: X.3Vk, reason: invalid class name */
/* loaded from: 3Vk.class */
public final class C3Vk implements 1xJ {
    public final int A00;
    public final Object A01;

    public C3Vk(1xH r302, int i) {
        this.A00 = i;
        this.A01 = r302;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        1xH r304;
        Object valueOf;
        int parseBackupManagerResultToLockboxResult;
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                1xH r0 = (1xH) this.A01;
                if (str != null) {
                    r0.A04(new C8p(str, null));
                    return;
                } else {
                    r0.A02();
                    return;
                }
            case 1:
                r304 = (1xH) this.A01;
                valueOf = Boolean.valueOf(obj instanceof 0EI);
                r304.A04(valueOf);
                return;
            case 2:
                LockBoxStorageManager.INSTANCE.nullableComplete((1xH) this.A01, obj);
                return;
            default:
                0EJ r02 = (0EJ) obj;
                3lS r03 = LockBoxStorageManager.logger;
                if (r03 != null) {
                    r03.ATN("LOCK_BOX_BACKUP_BLOCK_STORE_END");
                }
                LockBoxStorageManager lockBoxStorageManager = LockBoxStorageManager.INSTANCE;
                lockBoxStorageManager.markEntrySaveSuccess();
                r304 = (1xH) this.A01;
                parseBackupManagerResultToLockboxResult = lockBoxStorageManager.parseBackupManagerResultToLockboxResult(r02);
                valueOf = Integer.valueOf(parseBackupManagerResultToLockboxResult);
                r304.A04(valueOf);
                return;
        }
    }
}
