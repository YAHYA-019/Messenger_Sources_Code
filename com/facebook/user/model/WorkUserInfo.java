package com.facebook.user.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: WorkUserInfo.class */
public final class WorkUserInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(48);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public WorkUserInfo(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        boolean z = false;
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = parcel.readInt() == 1 ? true : z;
        this.A02 = C3o5.A0O(parcel);
    }

    public WorkUserInfo(String str, String str2, String str3, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof WorkUserInfo)) {
                return false;
            }
            WorkUserInfo workUserInfo = (WorkUserInfo) obj;
            if (!11T.A0O(this.A00, workUserInfo.A00) || !11T.A0O(this.A01, workUserInfo.A01) || this.A03 != workUserInfo.A03 || this.A04 != workUserInfo.A04 || !11T.A0O(this.A02, workUserInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A03), this.A04));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        1BL.A13(parcel, this.A02);
    }
}
