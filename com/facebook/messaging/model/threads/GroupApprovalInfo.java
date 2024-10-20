package com.facebook.messaging.model.threads;

import X.11T;
import X.1BK;
import X.C2xc;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: GroupApprovalInfo.class */
public final class GroupApprovalInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(28);
    public final ImmutableList A00;
    public final boolean A01;
    public final boolean A02;

    public GroupApprovalInfo(Parcel parcel) {
        this.A02 = C53v.A0S(parcel);
        this.A01 = C53v.A0S(parcel);
        ArrayList createTypedArrayList = parcel.createTypedArrayList(ThreadJoinRequest.CREATOR);
        if (createTypedArrayList == null) {
            throw 1BK.A0h();
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) createTypedArrayList);
        11T.A0A(copyOf);
        this.A00 = copyOf;
    }

    public GroupApprovalInfo(ImmutableList immutableList) {
        this.A02 = false;
        this.A01 = false;
        11T.A0A(immutableList);
        this.A00 = immutableList;
    }

    public GroupApprovalInfo(ImmutableList immutableList, boolean z, boolean z2) {
        this.A02 = z2;
        this.A01 = z;
        11T.A0A(immutableList);
        this.A00 = immutableList;
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
            GroupApprovalInfo groupApprovalInfo = (GroupApprovalInfo) obj;
            if (this.A02 != groupApprovalInfo.A02 || this.A01 != groupApprovalInfo.A01 || !11T.A0O(this.A00, groupApprovalInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A02;
        boolean z2 = this.A01;
        return (((((z ? 1 : 0) + 31) * 31) + (z2 ? 1 : 0)) * 31) + this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeTypedList(this.A00);
    }
}
