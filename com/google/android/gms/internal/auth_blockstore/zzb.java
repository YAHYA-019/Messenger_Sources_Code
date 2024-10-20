package com.google.android.gms.internal.auth_blockstore;

import X.0FI;
import X.7zS;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.KY4;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    public zzb(String str) {
        int A03 = 0FI.A03(-709917162);
        attachInterface(this, str);
        0FI.A09(5853961, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-1811953677, 0FI.A03(-2026300582));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        boolean z;
        int i3;
        int i4;
        int A032 = 0FI.A03(-36567356);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i4 = -1201329244;
            0FI.A09(i4, A032);
            return z;
        }
        if (this instanceof zzk) {
            zzk zzkVar = (zzk) this;
            int A033 = 0FI.A03(1499518719);
            if (i == 1) {
                Parcelable.Creator creator = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    creator.createFromParcel(parcel);
                }
                parcel.createByteArray();
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw JQy.A0P(dataAvail);
                }
                int A034 = 0FI.A03(-323253540);
                UnsupportedOperationException A0p = AnonymousClass001.A0p();
                0FI.A09(-363254742, A034);
                throw A0p;
            }
            if (i != 2) {
                0FI.A09(-625242649, A033);
                z = false;
            } else {
                Status status = (Status) JQy.A0R(parcel, Status.CREATOR);
                Object createFromParcel = parcel.readInt() == 0 ? null : RetrieveBytesResponse.CREATOR.createFromParcel(parcel);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw JQy.A0P(dataAvail2);
                }
                zzv zzvVar = (zzv) zzkVar;
                int A035 = 0FI.A03(1172786908);
                KY4.A00(status, zzvVar.A00, createFromParcel);
                0FI.A09(1523190538, A035);
                0FI.A09(199390045, A033);
                z = true;
            }
        } else {
            if (this instanceof zzy) {
                zzy zzyVar = (zzy) this;
                A03 = 0FI.A03(309586204);
                z = true;
                if (i == 1) {
                    Status status2 = (Status) JQy.A0R(parcel, Status.CREATOR);
                    boolean A1Z = 7zS.A1Z(parcel);
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 > 0) {
                        throw JQy.A0P(dataAvail3);
                    }
                    int A036 = 0FI.A03(1109666827);
                    KY4.A00(status2, zzyVar.A00, Boolean.valueOf(A1Z));
                    0FI.A09(-2070289974, A036);
                    i3 = -1911967959;
                } else {
                    z = false;
                    i3 = 688817054;
                }
            } else {
                zzu zzuVar = (zzu) this;
                A03 = 0FI.A03(81411986);
                z = true;
                if (i == 1) {
                    Status status3 = (Status) JQy.A0R(parcel, Status.CREATOR);
                    int readInt = parcel.readInt();
                    int dataAvail4 = parcel.dataAvail();
                    if (dataAvail4 > 0) {
                        throw JQy.A0P(dataAvail4);
                    }
                    int A037 = 0FI.A03(969333406);
                    KY4.A00(status3, zzuVar.A00, Integer.valueOf(readInt));
                    0FI.A09(457067075, A037);
                    i3 = 68497620;
                } else {
                    z = false;
                    i3 = -853772175;
                }
            }
            0FI.A09(i3, A03);
        }
        i4 = 1450982289;
        0FI.A09(i4, A032);
        return z;
    }
}
