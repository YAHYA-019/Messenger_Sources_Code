package com.facebook.messaging.memories.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AnonymousClass002;
import X.C04v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MemoryMessageContext.class */
public final class MemoryMessageContext extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(37);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public MemoryMessageContext(String str, String str2, long j, String str3, String str4) {
        1BL.A1F(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
        this.A04 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MemoryMessageContext)) {
                return false;
            }
            MemoryMessageContext memoryMessageContext = (MemoryMessageContext) obj;
            if (!11T.A0O(this.A02, memoryMessageContext.A02) || !11T.A0O(this.A01, memoryMessageContext.A01) || this.A00 != memoryMessageContext.A00 || !11T.A0O(this.A04, memoryMessageContext.A04) || !11T.A0O(this.A03, memoryMessageContext.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A01, 4YV.A02(this.A02))) + 1BL.A05(this.A04)) * 31) + 7zN.A05(this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }
}
