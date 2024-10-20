package com.facebook.messaging.model.threads;

import X.11T;
import X.3pJ;
import X.C4Ny;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: GroupThreadAssociatedFbGroup.class */
public final class GroupThreadAssociatedFbGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(18);
    public 3pJ A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public GroupThreadAssociatedFbGroup(3pJ r302, String str, String str2, int i, int i2, long j, boolean z) {
        this.A00 = 3pJ.A05;
        this.A05 = str2;
        this.A03 = j;
        this.A04 = str;
        this.A00 = r302;
        this.A06 = z;
        this.A02 = i2;
        this.A01 = i;
    }

    public GroupThreadAssociatedFbGroup(Parcel parcel) {
        this.A00 = 3pJ.A05;
        this.A05 = parcel.readString();
        this.A03 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A00 = C53v.A07(parcel, 3pJ.class);
        this.A06 = C53v.A0S(parcel);
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            GroupThreadAssociatedFbGroup groupThreadAssociatedFbGroup = (GroupThreadAssociatedFbGroup) obj;
            if (this.A03 != groupThreadAssociatedFbGroup.A03 || !11T.A0O(this.A05, groupThreadAssociatedFbGroup.A05) || !11T.A0O(this.A04, groupThreadAssociatedFbGroup.A04) || this.A00 != groupThreadAssociatedFbGroup.A00 || this.A06 != groupThreadAssociatedFbGroup.A06 || this.A02 != groupThreadAssociatedFbGroup.A02 || this.A01 != groupThreadAssociatedFbGroup.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, Long.valueOf(this.A03), this.A04, this.A00, Boolean.valueOf(this.A06), Integer.valueOf(this.A02), Integer.valueOf(this.A01)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
        parcel.writeString(this.A04);
        C53v.A0J(parcel, this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
    }
}
