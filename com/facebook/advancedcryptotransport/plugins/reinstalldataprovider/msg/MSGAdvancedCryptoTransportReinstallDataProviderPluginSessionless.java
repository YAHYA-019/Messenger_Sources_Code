package com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.msg;

import X.08W;
import X.0Pz;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1GD;
import X.1Oy;
import X.1SI;
import X.C06z;
import X.C0f1;
import X.InterfaceC00051a0;
import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* loaded from: MSGAdvancedCryptoTransportReinstallDataProviderPluginSessionless.class */
public final class MSGAdvancedCryptoTransportReinstallDataProviderPluginSessionless extends Sessionless {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new 08W(MSGAdvancedCryptoTransportReinstallDataProviderPluginSessionless.class, "tincanExperimentsUtil", "<v#0>")};
    public final String LOCK_BOX_STORAGE_KEY = "rf";

    private final boolean loggingEnabled() {
        return 1BK.A0N(((1SI) 1Br.A0B(1Bu.A01(C0f1.A00(), 16671))).A00).AZr(1GD.A05, 36314176135503506L);
    }

    public static final 1SI loggingEnabled$lambda$0(1Br r301) {
        return (1SI) 1Br.A0B(r301);
    }

    private final String sharedPrefsKey(String str) {
        return 0Pz.A0W("messenger.android.reinstall.flag/", str);
    }

    @Override // com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.msg.Sessionless
    public int MEMReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(String str, String str2) {
        int i;
        1BK.A1M(str, str2);
        if (!loggingEnabled()) {
            return 0;
        }
        String lockBoxGetSecret = LockBoxStorageManager.lockBoxGetSecret(str, this.LOCK_BOX_STORAGE_KEY);
        if (lockBoxGetSecret == null) {
            i = 7;
        } else {
            boolean contains = 1Oy.A00.A00(C0f1.A00()).contains(0Pz.A0W("messenger.android.reinstall.flag/", str));
            if (lockBoxGetSecret.equals("t")) {
                i = 3;
                if (contains) {
                    return 6;
                }
            } else if (lockBoxGetSecret.equals(str2)) {
                i = 1;
                if (contains) {
                    return 4;
                }
            } else {
                i = 2;
                if (contains) {
                    return 5;
                }
            }
        }
        return i;
    }

    @Override // com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.msg.Sessionless
    public boolean MEMReinstallDataProviderImpl_MEMReinstallDataProviderIsRegistrationIDChanged(String str, String str2) {
        return false;
    }

    @Override // com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.msg.Sessionless
    public boolean MEMReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(String str, String str2, String str3) {
        boolean A1W = 1BL.A1W(str, str2);
        boolean z = true;
        if (loggingEnabled()) {
            InterfaceC00051a0 AP5 = 1Oy.A00.A00(C0f1.A00()).AP5();
            AP5.Ca2(0Pz.A0W("messenger.android.reinstall.flag/", str), A1W);
            AP5.apply();
            if (LockBoxStorageManager.lockBoxSaveSecret(str, this.LOCK_BOX_STORAGE_KEY, str2) != A1W) {
                z = false;
            }
        }
        return z;
    }
}
