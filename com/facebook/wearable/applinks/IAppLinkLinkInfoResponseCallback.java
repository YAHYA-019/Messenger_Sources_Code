package com.facebook.wearable.applinks;

import X.0FI;
import X.AnonymousClass002;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: IAppLinkLinkInfoResponseCallback.class */
public interface IAppLinkLinkInfoResponseCallback extends IInterface {

    /* loaded from: IAppLinkLinkInfoResponseCallback$Stub.class */
    public abstract class Stub extends Binder implements IAppLinkLinkInfoResponseCallback {
        public Stub() {
            int A03 = 0FI.A03(1638577685);
            attachInterface(this, "com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
            0FI.A09(-819373753, A03);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(137368293, 0FI.A03(1419547968));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(-951201954);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
                    if (i == 2) {
                        CHZ((AppLinkLinkInfoResponse) AnonymousClass002.A0I(parcel, AppLinkLinkInfoResponse.CREATOR));
                    } else if (i == 3) {
                        BwG(parcel.readInt(), parcel.readString());
                    }
                    i3 = -404517387;
                    0FI.A09(i3, A03);
                    return true;
                }
                if (i == 1598968902) {
                    parcel2.writeString("com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback");
                    i3 = -1759827056;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(-2010843487, A03);
            return onTransact;
        }
    }

    void BwG(int i, String str);

    void CHZ(AppLinkLinkInfoResponse appLinkLinkInfoResponse);
}
