package com.facebook.contacts.model;

import X.C53v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: PhonebookContactMetadata.class */
public final class PhonebookContactMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(29);
    public String A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public PhonebookContactMetadata(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A08 = C53v.A0S(parcel);
        this.A02 = parcel.readLong();
        this.A04 = C53v.A0S(parcel);
        this.A05 = C53v.A0S(parcel);
        this.A07 = C53v.A0S(parcel);
        this.A06 = C53v.A0S(parcel);
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PhonebookContactMetadata)) {
                return false;
            }
            PhonebookContactMetadata phonebookContactMetadata = (PhonebookContactMetadata) obj;
            if (Objects.equal(this.A03, phonebookContactMetadata.A03) && this.A01 == phonebookContactMetadata.A01 && this.A08 == phonebookContactMetadata.A08 && this.A02 == phonebookContactMetadata.A02 && this.A04 == phonebookContactMetadata.A04 && this.A05 == phonebookContactMetadata.A05 && this.A07 == phonebookContactMetadata.A07 && this.A06 == phonebookContactMetadata.A06 && Objects.equal(this.A00, phonebookContactMetadata.A00)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A01), Boolean.valueOf(this.A08), Long.valueOf(this.A02), Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), Boolean.valueOf(this.A07), Boolean.valueOf(this.A06), this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A00);
    }
}
