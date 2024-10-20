package com.facebook.messaging.model.threads;

import X.11T;
import X.1BK;
import X.1BL;
import X.3pM;
import X.3pN;
import X.C4Ny;
import X.EnumC00873pL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.enums.EnumEntries;

/* loaded from: GroupThreadAssociatedObject.class */
public final class GroupThreadAssociatedObject implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(19);
    public GroupThreadAssociatedFbGroup A00;
    public final long A01;
    public final String A02;

    public GroupThreadAssociatedObject(Parcel parcel) {
        String readString = parcel.readString();
        this.A02 = readString;
        this.A01 = parcel.readLong();
        EnumEntries enumEntries = EnumC00873pL.A01;
        EnumC00873pL A00 = 3pM.A00(readString);
        3pN r0 = 3pN.$redex_init_class;
        if (A00.ordinal() == 0) {
            Parcelable A0C = 1BL.A0C(parcel, GroupThreadAssociatedFbGroup.class);
            if (A0C == null) {
                throw 1BK.A0h();
            }
            this.A00 = (GroupThreadAssociatedFbGroup) A0C;
        }
    }

    public GroupThreadAssociatedObject(GroupThreadAssociatedFbGroup groupThreadAssociatedFbGroup, String str, long j) {
        this.A02 = str;
        this.A01 = j;
        EnumEntries enumEntries = EnumC00873pL.A01;
        EnumC00873pL A00 = 3pM.A00(str);
        3pN r0 = 3pN.$redex_init_class;
        if (A00.ordinal() == 0) {
            if (groupThreadAssociatedFbGroup == null) {
                throw 1BK.A0h();
            }
            this.A00 = groupThreadAssociatedFbGroup;
        }
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
            GroupThreadAssociatedObject groupThreadAssociatedObject = (GroupThreadAssociatedObject) obj;
            if (!11T.A0O(this.A02, groupThreadAssociatedObject.A02) || !11T.A0O(this.A00, groupThreadAssociatedObject.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        String str = this.A02;
        parcel.writeString(str);
        parcel.writeLong(this.A01);
        EnumEntries enumEntries = EnumC00873pL.A01;
        EnumC00873pL A00 = 3pM.A00(str);
        3pN r0 = 3pN.$redex_init_class;
        if (A00.ordinal() == 0) {
            parcel.writeParcelable(this.A00, i);
        }
    }
}
