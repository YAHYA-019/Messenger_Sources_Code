package com.facebook.messaging.model.threads;

import X.11T;
import X.1BK;
import X.21B;
import X.3Gh;
import X.C2xc;
import X.C53v;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: JoinableInfo.class */
public final class JoinableInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(30);
    public final Uri A00;
    public final Uri A01;
    public final GroupApprovalInfo A02;
    public final 21B A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public JoinableInfo(Uri uri, Uri uri2, GroupApprovalInfo groupApprovalInfo, 21B r305, String str, boolean z, boolean z2) {
        this.A00 = uri;
        this.A01 = uri2;
        this.A06 = z2;
        this.A05 = z;
        this.A03 = r305;
        this.A02 = groupApprovalInfo;
        this.A04 = str;
    }

    public JoinableInfo(Parcel parcel) {
        this.A00 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A01 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A06 = C53v.A0S(parcel);
        this.A05 = C53v.A0S(parcel);
        this.A03 = 3Gh.A00(parcel.readInt());
        Parcelable readParcelable = parcel.readParcelable(GroupApprovalInfo.class.getClassLoader());
        if (readParcelable == null) {
            throw 1BK.A0h();
        }
        this.A02 = (GroupApprovalInfo) readParcelable;
        this.A04 = parcel.readString();
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
            JoinableInfo joinableInfo = (JoinableInfo) obj;
            if (this.A06 != joinableInfo.A06 || this.A05 != joinableInfo.A05 || !11T.A0O(this.A00, joinableInfo.A00) || !11T.A0O(this.A01, joinableInfo.A01) || this.A03 != joinableInfo.A03 || !11T.A0O(this.A02, joinableInfo.A02) || !11T.A0O(this.A04, joinableInfo.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, Boolean.valueOf(this.A06), Boolean.valueOf(this.A05), this.A03, this.A02, this.A04});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03.dbValue);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
    }
}
