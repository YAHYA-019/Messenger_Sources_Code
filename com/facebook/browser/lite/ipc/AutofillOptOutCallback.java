package com.facebook.browser.lite.ipc;

import X.0FI;
import X.7zS;
import X.KxI;
import X.Ln5;
import X.Ln6;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.browser.lite.extensions.autofill.facebook.AutofillController$FacebookAutofillOptOutCallbackHandler;

/* loaded from: AutofillOptOutCallback.class */
public interface AutofillOptOutCallback extends IInterface {

    /* loaded from: AutofillOptOutCallback$Stub.class */
    public abstract class Stub extends Binder implements AutofillOptOutCallback {

        /* loaded from: AutofillOptOutCallback$Stub$Proxy.class */
        public final class Proxy implements AutofillOptOutCallback {
            public IBinder A00;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int A03 = 0FI.A03(-1936173714);
                IBinder iBinder = this.A00;
                0FI.A09(-820015047, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = 0FI.A03(-1742465275);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillOptOutCallback");
            0FI.A09(602685671, A03);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(-387477542, 0FI.A03(-617270258));
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(-454439569);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    if (i == 1) {
                        String readString = parcel.readString();
                        boolean A1Z = 7zS.A1Z(parcel);
                        AutofillController$FacebookAutofillOptOutCallbackHandler autofillController$FacebookAutofillOptOutCallbackHandler = (AutofillController$FacebookAutofillOptOutCallbackHandler) this;
                        int A032 = 0FI.A03(1264454551);
                        autofillController$FacebookAutofillOptOutCallbackHandler.A03.put(readString, Boolean.valueOf(A1Z));
                        if (autofillController$FacebookAutofillOptOutCallbackHandler.A04) {
                            KxI.A00(new Ln5(autofillController$FacebookAutofillOptOutCallbackHandler, A1Z));
                        }
                        if (!A1Z) {
                            KxI.A00(new Ln6(autofillController$FacebookAutofillOptOutCallbackHandler, readString));
                        }
                        0FI.A09(1335925235, A032);
                        i3 = -2058053722;
                        0FI.A09(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    i3 = -918341382;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(1617105194, A03);
            return onTransact;
        }
    }
}
