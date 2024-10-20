package com.xiaomi.market;

import X.0FI;
import X.1BL;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: IMarketDownloadService$Stub$Proxy.class */
public final class IMarketDownloadService$Stub$Proxy implements IMarketDownloadService {
    public IBinder A00;

    @Override // com.xiaomi.market.IMarketDownloadService
    public boolean AE1(String str) {
        int A03 = 0FI.A03(-2022353659);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            obtain.writeString(str);
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 4) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-2000903893, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-2095468727, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public boolean AOB(Bundle bundle) {
        int A03 = 0FI.A03(-495027169);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            boolean z = false;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            if (1BL.A02(this.A00, obtain, obtain2, 1) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(624091011, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(111992093, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public int AUr() {
        int A03 = 0FI.A03(-157122105);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            int A02 = 1BL.A02(this.A00, obtain, obtain2, 8);
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(139172040, A03);
            return A02;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1927447758, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public boolean BRN() {
        int A03 = 0FI.A03(-1772007582);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 7) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1032744999, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-162752194, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public boolean CcI(IDownloadCallback iDownloadCallback) {
        int A03 = 0FI.A03(-1603349227);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            obtain.writeStrongInterface(iDownloadCallback);
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 5) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-794460711, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(2119061890, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public boolean D5T(IDownloadCallback iDownloadCallback) {
        int A03 = 0FI.A03(-78849943);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IMarketDownloadService");
            obtain.writeStrongInterface(iDownloadCallback);
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 6) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(547446441, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(499832632, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(1508016265);
        IBinder iBinder = this.A00;
        0FI.A09(377503589, A03);
        return iBinder;
    }
}
