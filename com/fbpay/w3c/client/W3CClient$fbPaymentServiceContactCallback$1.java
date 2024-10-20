package com.fbpay.w3c.client;

import X.0FI;
import X.AnonymousClass001;
import X.JR2;
import X.LA9;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.fbpay.w3c.FBPaymentServiceContactCallback;
import java.util.ArrayList;

/* loaded from: W3CClient$fbPaymentServiceContactCallback$1.class */
public final class W3CClient$fbPaymentServiceContactCallback$1 extends Binder implements FBPaymentServiceContactCallback {
    public final /* synthetic */ LA9 A00;

    public W3CClient$fbPaymentServiceContactCallback$1() {
        int A03 = 0FI.A03(602980648);
        attachInterface(this, "com.fbpay.w3c.FBPaymentServiceContactCallback");
        0FI.A09(-1213135367, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$fbPaymentServiceContactCallback$1(LA9 la9) {
        this();
        this.A00 = la9;
        0FI.A09(2010852366, 0FI.A03(-2033748833));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(608498638, 0FI.A03(1870010473));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(-1485413108);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceContactCallback");
                if (i == 1) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    int A032 = 0FI.A03(-829710130);
                    this.A00.A08.postValue(A0s);
                    0FI.A09(652984677, A032);
                    parcel2.writeNoException();
                    int size = A0s.size();
                    parcel2.writeInt(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        JR2.A0b(parcel2, A0s, i4);
                    }
                    i3 = -1835301998;
                    0FI.A09(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.FBPaymentServiceContactCallback");
                i3 = 260151072;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-1586883804, A03);
        return onTransact;
    }
}
