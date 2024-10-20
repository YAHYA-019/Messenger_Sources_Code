package com.fbpay.w3c.client;

import X.0FI;
import X.AnonymousClass001;
import X.JR2;
import X.LA9;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import java.util.ArrayList;

/* loaded from: W3CClient$fbPaymentServiceCardDetailsCallback$1.class */
public final class W3CClient$fbPaymentServiceCardDetailsCallback$1 extends Binder implements FBPaymentServiceCardDetailsCallback {
    public final /* synthetic */ LA9 A00;

    public W3CClient$fbPaymentServiceCardDetailsCallback$1() {
        int A03 = 0FI.A03(629012965);
        attachInterface(this, "com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
        0FI.A09(-1131318937, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$fbPaymentServiceCardDetailsCallback$1(LA9 la9) {
        this();
        this.A00 = la9;
        0FI.A09(-501834097, 0FI.A03(-1431082756));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1730063349, 0FI.A03(1804295469));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(-2085153601);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                if (i == 1) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    int A032 = 0FI.A03(1009832864);
                    this.A00.A07.postValue(A0s);
                    0FI.A09(-765680577, A032);
                    parcel2.writeNoException();
                    int size = A0s.size();
                    parcel2.writeInt(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        JR2.A0b(parcel2, A0s, i4);
                    }
                    i3 = 1746836669;
                    0FI.A09(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                i3 = 350388303;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(1423870877, A03);
        return onTransact;
    }
}
