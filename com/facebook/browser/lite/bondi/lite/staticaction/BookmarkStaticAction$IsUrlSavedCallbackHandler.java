package com.facebook.browser.lite.bondi.lite.staticaction;

import X.0FI;
import X.7zS;
import X.KxI;
import X.LU6;
import X.LpF;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.IsUrlSavedCallback;

/* loaded from: BookmarkStaticAction$IsUrlSavedCallbackHandler.class */
public final class BookmarkStaticAction$IsUrlSavedCallbackHandler extends Binder implements IsUrlSavedCallback {
    public final /* synthetic */ LU6 A00;

    public BookmarkStaticAction$IsUrlSavedCallbackHandler() {
        int A03 = 0FI.A03(1477883099);
        attachInterface(this, "com.facebook.browser.lite.ipc.IsUrlSavedCallback");
        0FI.A09(-434061635, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BookmarkStaticAction$IsUrlSavedCallbackHandler(LU6 lu6) {
        this();
        this.A00 = lu6;
        0FI.A09(-2097441169, 0FI.A03(-766825069));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-285222794, 0FI.A03(907699773));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(-917294732);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.IsUrlSavedCallback");
                if (i == 1) {
                    String readString = parcel.readString();
                    boolean A1Z = 7zS.A1Z(parcel);
                    int A032 = 0FI.A03(324165786);
                    KxI.A00(new LpF(this.A00, readString, A1Z));
                    0FI.A09(-735322374, A032);
                    i3 = -1550563252;
                    0FI.A09(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.browser.lite.ipc.IsUrlSavedCallback");
                i3 = -253959950;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-155589598, A03);
        return onTransact;
    }
}
