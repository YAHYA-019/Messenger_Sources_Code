package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: DebugInfoScreenComponent.class */
public final class DebugInfoScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(73);
    public final ImmutableList A00;
    public final String A01;
    public final boolean A02;

    public DebugInfoScreenComponent(Parcel parcel) {
        ImmutableList copyOf;
        ClassLoader A0e = 4YV.A0e(this);
        if (parcel.readInt() == 0) {
            copyOf = null;
        } else {
            int readInt = parcel.readInt();
            DebugInfo[] debugInfoArr = new DebugInfo[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, debugInfoArr, i);
            }
            copyOf = ImmutableList.copyOf(debugInfoArr);
        }
        this.A00 = copyOf;
        this.A02 = DKH.A1W(parcel);
        this.A01 = parcel.readString();
    }

    public DebugInfoScreenComponent(ImmutableList immutableList, String str, boolean z) {
        this.A00 = immutableList;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DebugInfoScreenComponent)) {
                return false;
            }
            DebugInfoScreenComponent debugInfoScreenComponent = (DebugInfoScreenComponent) obj;
            if (!11T.A0O(this.A00, debugInfoScreenComponent.A00) || this.A02 != debugInfoScreenComponent.A02 || !11T.A0O(this.A01, debugInfoScreenComponent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02(C1pq.A03(this.A00), this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((DebugInfo) A0Y.next(), i);
            }
        }
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
