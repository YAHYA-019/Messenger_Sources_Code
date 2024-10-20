package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.0FI;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IGalaxyStoreDownloadCallback$Stub$Proxy.class */
public final class IGalaxyStoreDownloadCallback$Stub$Proxy implements IGalaxyStoreDownloadCallback {
    public IBinder A00;

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public void BwS(String str, int i) {
        int A03 = 0FI.A03(1262266218);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.A00.transact(2, obtain, null, 1);
            obtain.recycle();
            0FI.A09(1958353276, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(1793551453, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public void CES(String str, float f, long j) {
        long j2 = 100;
        int A03 = 0FI.A03(-1116893604);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeLong(j2);
            obtain.writeFloat(f);
            this.A00.transact(3, obtain, null, 1);
            obtain.recycle();
            0FI.A09(1385210236, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(609468397, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public void CN7(String str, int i, String str2) {
        int A03 = 0FI.A03(1513386760);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            this.A00.transact(1, obtain, null, 1);
            obtain.recycle();
            0FI.A09(-247607057, A03);
        } catch (Throwable th) {
            obtain.recycle();
            0FI.A09(-103999645, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(-1284916534);
        IBinder iBinder = this.A00;
        0FI.A09(-1826486074, A03);
        return iBinder;
    }
}
