package com.facebook.wearable.applinks;

import X.0FI;
import X.DKI;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: IAppLinkServiceV2$Stub$Proxy.class */
public final class IAppLinkServiceV2$Stub$Proxy implements IInterface {
    public IBinder A00;

    public void A00(AppLinkLinkInfoRequest appLinkLinkInfoRequest, IAppLinkLinkInfoResponseCallback iAppLinkLinkInfoResponseCallback) {
        int A03 = 0FI.A03(-707953240);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            boolean A0j = DKI.A0j(obtain, appLinkLinkInfoRequest);
            obtain.writeStrongInterface(iAppLinkLinkInfoResponseCallback);
            this.A00.transact(4, obtain, obtain2, A0j ? 1 : 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(1121561150, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            0FI.A09(381500791, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int A03 = 0FI.A03(1001308424);
        IBinder iBinder = this.A00;
        0FI.A09(2078826187, A03);
        return iBinder;
    }
}
