package com.google.android.gms.common.api.internal;

import X.0FI;
import X.JQy;
import X.L6l;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;

/* loaded from: IStatusCallback.class */
public interface IStatusCallback extends IInterface {

    /* loaded from: IStatusCallback$Stub.class */
    public abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
            0FI.A09(1257834874, 0FI.A03(718259093));
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = 0FI.A03(409316828);
            boolean z = true;
            if (i == 1) {
                Status status = (Status) JQy.A0R(parcel, Status.CREATOR);
                L6l.A00(parcel);
                CHc(status);
                i3 = -1572063994;
            } else {
                z = false;
                i3 = -1889013388;
            }
            0FI.A09(i3, A03);
            return z;
        }
    }

    void CHc(Status status);
}
