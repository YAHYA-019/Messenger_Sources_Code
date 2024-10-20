package com.fbpay.w3c.client;

import X.0FI;
import X.JQy;
import X.Khv;
import X.LA9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: W3CClient$AutofillKeyFetchServiceCallbackImpl.class */
public final class W3CClient$AutofillKeyFetchServiceCallbackImpl extends Binder implements IInterface {
    public final /* synthetic */ LA9 A00;

    public W3CClient$AutofillKeyFetchServiceCallbackImpl() {
        int A03 = 0FI.A03(-125617242);
        attachInterface(this, "com.fbpay.w3c.AutofillKeyFetchServiceCallback");
        0FI.A09(-1535947328, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$AutofillKeyFetchServiceCallbackImpl(LA9 la9) {
        this();
        this.A00 = la9;
        0FI.A09(-740512437, 0FI.A03(-1788740951));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-2097102086, 0FI.A03(2124261914));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(355360402);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                if (i == 1) {
                    String readString = parcel.readString();
                    int A0E = JQy.A0E(readString, -778260113);
                    this.A00.A05.postValue(new Khv(readString, null));
                    0FI.A09(-658241482, A0E);
                    parcel2.writeNoException();
                    i3 = -194203271;
                    0FI.A09(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.AutofillKeyFetchServiceCallback");
                i3 = -936323531;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-1874112196, A03);
        return onTransact;
    }
}
