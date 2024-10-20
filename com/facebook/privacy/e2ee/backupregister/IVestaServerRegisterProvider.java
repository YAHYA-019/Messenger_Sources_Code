package com.facebook.privacy.e2ee.backupregister;

import com.facebook.privacy.e2ee.genericimpl.backup.common.VestaServerInitResponse;

/* loaded from: IVestaServerRegisterProvider.class */
public interface IVestaServerRegisterProvider {

    /* loaded from: IVestaServerRegisterProvider$BeginRegisterCallback.class */
    public interface BeginRegisterCallback {
        void onFailure(Throwable th);

        void onSuccess(VestaServerBeginRegisterResponse vestaServerBeginRegisterResponse);
    }

    /* loaded from: IVestaServerRegisterProvider$FinishRegisterCallback.class */
    public interface FinishRegisterCallback {
        void onFailure(Throwable th);

        void onSuccess(VestaServerFinishRegisterResponse vestaServerFinishRegisterResponse);
    }

    /* loaded from: IVestaServerRegisterProvider$InitRegisterCallback.class */
    public interface InitRegisterCallback {
        void onFailure(Throwable th);

        void onSuccess(VestaServerInitResponse vestaServerInitResponse);
    }

    void beginRegister(String str, String str2, byte[] bArr, BeginRegisterCallback beginRegisterCallback);

    void finishRegister(String str, String str2, byte[] bArr, String str3, FinishRegisterCallback finishRegisterCallback);

    void initRegister(String str, String str2, InitRegisterCallback initRegisterCallback);
}
