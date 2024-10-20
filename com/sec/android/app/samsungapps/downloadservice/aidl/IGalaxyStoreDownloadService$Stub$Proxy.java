package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.0FI;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IGalaxyStoreDownloadService$Stub$Proxy.class */
public final class IGalaxyStoreDownloadService$Stub$Proxy implements IGalaxyStoreDownloadService {
    public IBinder A00;

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public void AE7(String str) {
        int A03 = 0FI.A03(1126411774);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeString(str);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1821696996, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-380424201, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public void AOC(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback) {
        int A03 = 0FI.A03(-1433854231);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongInterface(iGalaxyStoreDownloadCallback);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(47907361, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-733732898, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public void BOV(Bundle bundle) {
        int A03 = 0FI.A03(-1804808989);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1820646487, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1816901655, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(2113744178);
        IBinder iBinder = this.A00;
        0FI.A09(1009501896, A03);
        return iBinder;
    }
}
