package com.meta.wearable.applinks.sdk;

import X.0FI;
import X.LDe;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.facebook.wearable.applinks.AppLinkRegisterRequest;

/* loaded from: LinkedAppManagerImpl$registerLinkableAppService$1$1.class */
public final class LinkedAppManagerImpl$registerLinkableAppService$1$1 extends Binder implements IInterface {
    public final /* synthetic */ AppLinkRegisterRequest A00;
    public final /* synthetic */ LDe A01;

    public LinkedAppManagerImpl$registerLinkableAppService$1$1() {
        int A03 = 0FI.A03(1231225173);
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback");
        0FI.A09(860472203, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkedAppManagerImpl$registerLinkableAppService$1$1(AppLinkRegisterRequest appLinkRegisterRequest, LDe lDe) {
        this();
        this.A01 = lDe;
        this.A00 = appLinkRegisterRequest;
        0FI.A09(-1094624571, 0FI.A03(1405176820));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1061403271, 0FI.A03(-787759897));
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae A[SYNTHETIC] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTransact(int r302, android.os.Parcel r303, android.os.Parcel r304, int r305) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.wearable.applinks.sdk.LinkedAppManagerImpl$registerLinkableAppService$1$1.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
