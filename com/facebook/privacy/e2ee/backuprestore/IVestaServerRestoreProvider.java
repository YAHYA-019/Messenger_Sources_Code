package com.facebook.privacy.e2ee.backuprestore;

import com.facebook.privacy.e2ee.genericimpl.backup.common.VestaServerInitResponse;

/* loaded from: IVestaServerRestoreProvider.class */
public interface IVestaServerRestoreProvider {

    /* loaded from: IVestaServerRestoreProvider$BeginLoginCallback.class */
    public interface BeginLoginCallback {
        void onFailure(Throwable th);

        void onSuccess(VestaServerBeginLoginResponse vestaServerBeginLoginResponse);
    }

    /* loaded from: IVestaServerRestoreProvider$FinishLoginCallback.class */
    public interface FinishLoginCallback {
        void onFailure(Throwable th);

        void onSuccess(VestaServerFinishLoginResponse vestaServerFinishLoginResponse);
    }

    /* loaded from: IVestaServerRestoreProvider$InitLoginCallback.class */
    public interface InitLoginCallback {
        void onFailure(Throwable th);

        void onSuccess(VestaServerInitResponse vestaServerInitResponse);
    }

    void beginLogin(String str, String str2, byte[] bArr, BeginLoginCallback beginLoginCallback, String str3);

    void finishLogin(String str, String str2, byte[] bArr, FinishLoginCallback finishLoginCallback, String str3);

    void initLogin(String str, String str2, InitLoginCallback initLoginCallback, String str3);
}
