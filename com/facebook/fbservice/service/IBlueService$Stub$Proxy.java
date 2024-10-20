package com.facebook.fbservice.service;

import X.0FI;
import X.1BL;
import X.AnonymousClass001;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;

/* loaded from: IBlueService$Stub$Proxy.class */
public final class IBlueService$Stub$Proxy implements IBlueService {
    public IBinder A00;

    public static void A00(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public boolean AE1(String str) {
        int A03 = 0FI.A03(89602169);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.fbservice.service.IBlueService");
            obtain.writeString(str);
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 3) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1529107531, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1608345885, A03);
            throw th;
        }
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public boolean AEc(RequestPriority requestPriority, String str) {
        int A03 = 0FI.A03(-2026143436);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.fbservice.service.IBlueService");
            obtain.writeString(str);
            boolean z = false;
            A00(obtain, requestPriority);
            if (1BL.A02(this.A00, obtain, obtain2, 4) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1904554486, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1457264975, A03);
            throw th;
        }
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public boolean CcF(ICompletionHandler iCompletionHandler, String str) {
        int A03 = 0FI.A03(-1616644568);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.fbservice.service.IBlueService");
            obtain.writeString(str);
            obtain.writeStrongInterface(iCompletionHandler);
            boolean z = false;
            if (1BL.A02(this.A00, obtain, obtain2, 5) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1139903088, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-1225561177, A03);
            throw th;
        }
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public String D20(Bundle bundle, ViewerContext viewerContext, CallerContext callerContext, String str, boolean z) {
        int A03 = 0FI.A03(-923359697);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.fbservice.service.IBlueService");
            obtain.writeString(str);
            A00(obtain, bundle);
            obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
            A00(obtain, callerContext);
            A00(obtain, viewerContext);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(2051321409, A03);
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(-591938752, A03);
            throw th;
        }
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public String D21(Bundle bundle, ViewerContext viewerContext, CallerContext callerContext, ICompletionHandler iCompletionHandler, String str, boolean z, boolean z2) {
        int A03 = 0FI.A03(1099410229);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.fbservice.service.IBlueService");
            obtain.writeString(str);
            A00(obtain, bundle);
            int i = 1;
            obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
            if (!z2) {
                i = 0;
            }
            obtain.writeInt(i);
            obtain.writeStrongInterface(iCompletionHandler);
            A00(obtain, callerContext);
            A00(obtain, viewerContext);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(973686359, A03);
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(2136977699, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(1307174292);
        IBinder iBinder = this.A00;
        0FI.A09(-1307656054, A03);
        return iBinder;
    }
}
