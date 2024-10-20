package com.fbpay.w3c.client;

import X.0FI;
import X.AnonymousClass001;
import X.JR2;
import X.LA9;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import java.util.ArrayList;

/* loaded from: W3CClient$fbPaymentServiceAddressCallback$1.class */
public final class W3CClient$fbPaymentServiceAddressCallback$1 extends Binder implements FBPaymentServiceAddressCallback {
    public final /* synthetic */ LA9 A00;

    public W3CClient$fbPaymentServiceAddressCallback$1() {
        int A03 = 0FI.A03(-2017030353);
        attachInterface(this, "com.fbpay.w3c.FBPaymentServiceAddressCallback");
        0FI.A09(-881169151, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$fbPaymentServiceAddressCallback$1(LA9 la9) {
        this();
        this.A00 = la9;
        0FI.A09(-1768932903, 0FI.A03(-2108105030));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-200468075, 0FI.A03(1894100389));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(794397122);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceAddressCallback");
                if (i == 1) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    int A032 = 0FI.A03(61812738);
                    this.A00.A06.postValue(A0s);
                    0FI.A09(-864239752, A032);
                    parcel2.writeNoException();
                    int size = A0s.size();
                    parcel2.writeInt(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        JR2.A0b(parcel2, A0s, i4);
                    }
                    i3 = 2142510894;
                    0FI.A09(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.FBPaymentServiceAddressCallback");
                i3 = 2146588876;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-732583812, A03);
        return onTransact;
    }
}
