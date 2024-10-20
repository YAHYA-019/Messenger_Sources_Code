package com.xiaomi.market;

import X.0FI;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IDownloadCallback$Stub$Proxy.class */
public final class IDownloadCallback$Stub$Proxy implements IDownloadCallback {
    public IBinder A00;

    @Override // com.xiaomi.market.IDownloadCallback
    public void BwT(String str, int i, String str2) {
        int A03 = 0FI.A03(-2107269528);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(844029172, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1818176817, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IDownloadCallback
    public void CES(String str, float f, long j) {
        long j2 = 100;
        int A03 = 0FI.A03(-564295723);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeLong(j2);
            obtain.writeFloat(f);
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(755066518, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-259536704, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IDownloadCallback
    public void CN7(String str, int i, String str2) {
        int A03 = 0FI.A03(98528078);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-755031180, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-865783883, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(1509759323);
        IBinder iBinder = this.A00;
        0FI.A09(1713897700, A03);
        return iBinder;
    }
}
