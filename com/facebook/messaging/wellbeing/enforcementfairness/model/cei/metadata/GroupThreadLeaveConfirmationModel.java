package com.facebook.messaging.wellbeing.enforcementfairness.model.cei.metadata;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbF;
import X.AbG;
import X.AbI;
import X.C1pq;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: GroupThreadLeaveConfirmationModel.class */
public final class GroupThreadLeaveConfirmationModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(89);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;

    public GroupThreadLeaveConfirmationModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        ListItem[] listItemArr = new ListItem[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, listItemArr, i2);
        }
        this.A00 = ImmutableList.copyOf(listItemArr);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        int readInt2 = parcel.readInt();
        UserKey[] userKeyArr = new UserKey[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, userKeyArr, i);
        }
        this.A01 = ImmutableList.copyOf(userKeyArr);
    }

    public GroupThreadLeaveConfirmationModel(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2) {
        C1pq.A08("helpItems", immutableList);
        this.A00 = immutableList;
        C1pq.A08("helpTitle", str);
        this.A02 = str;
        AbF.A1V(str2);
        this.A03 = str2;
        C1pq.A08("userKeys", immutableList2);
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GroupThreadLeaveConfirmationModel)) {
                return false;
            }
            GroupThreadLeaveConfirmationModel groupThreadLeaveConfirmationModel = (GroupThreadLeaveConfirmationModel) obj;
            if (!11T.A0O(this.A00, groupThreadLeaveConfirmationModel.A00) || !11T.A0O(this.A02, groupThreadLeaveConfirmationModel.A02) || !11T.A0O(this.A03, groupThreadLeaveConfirmationModel.A03) || !11T.A0O(this.A01, groupThreadLeaveConfirmationModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ListItem) A0b.next(), i);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            parcel.writeParcelable(AbG.A0v(A0b2), i);
        }
    }
}
