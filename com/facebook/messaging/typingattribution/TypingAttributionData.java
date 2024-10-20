package com.facebook.messaging.typingattribution;

import X.AnonymousClass001;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: TypingAttributionData.class */
public final class TypingAttributionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(86);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public TypingAttributionData(long j, String str, long j2, String str2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = str;
        this.A03 = str2;
    }

    public TypingAttributionData(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && obj.getClass() == getClass()) {
            TypingAttributionData typingAttributionData = (TypingAttributionData) obj;
            String str = this.A02;
            String str2 = typingAttributionData.A02;
            boolean A1U = str == null ? AnonymousClass001.A1U(str2) : str.equals(str2);
            String str3 = this.A03;
            String str4 = typingAttributionData.A03;
            boolean A1U2 = str3 == null ? AnonymousClass001.A1U(str4) : str3.equals(str4);
            boolean A1O = AnonymousClass001.A1O((this.A01 > typingAttributionData.A01 ? 1 : (this.A01 == typingAttributionData.A01 ? 0 : -1)));
            if (A1U && A1U2 && A1O) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A02, this.A03, Long.valueOf(this.A01)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
