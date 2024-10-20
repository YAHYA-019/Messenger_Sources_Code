package com.facebook.messaging.threadview.params;

import X.11T;
import X.4YV;
import X.82M;
import X.C1pq;
import X.C3o5;
import X.EnumC3499Mfu;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: ThreadPreviewParams.class */
public final class ThreadPreviewParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(92);
    public final int A00;
    public final EnumC3499Mfu A01;
    public final String A02;
    public final boolean A03;

    public ThreadPreviewParams(EnumC3499Mfu enumC3499Mfu, String str, int i, boolean z) {
        this.A01 = enumC3499Mfu;
        this.A03 = z;
        C1pq.A08(Property.SYMBOL_Z_ORDER_SOURCE, str);
        this.A02 = str;
        this.A00 = i;
    }

    public ThreadPreviewParams(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : EnumC3499Mfu.values()[parcel.readInt()];
        this.A03 = 4YV.A1U(parcel.readInt());
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadPreviewParams)) {
                return false;
            }
            ThreadPreviewParams threadPreviewParams = (ThreadPreviewParams) obj;
            if (this.A01 != threadPreviewParams.A01 || this.A03 != threadPreviewParams.A03 || !11T.A0O(this.A02, threadPreviewParams.A02) || this.A00 != threadPreviewParams.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A02, C1pq.A02(C3o5.A03(this.A01) + 31, this.A03)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        EnumC3499Mfu enumC3499Mfu = this.A01;
        if (enumC3499Mfu == null) {
            ordinal = 0;
        } else {
            parcel.writeInt(1);
            ordinal = enumC3499Mfu.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}
