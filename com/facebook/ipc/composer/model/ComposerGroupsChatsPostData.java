package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerGroupsChatsPostData.class */
public final class ComposerGroupsChatsPostData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(31);
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public ComposerGroupsChatsPostData(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
    }

    public ComposerGroupsChatsPostData(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGroupsChatsPostData)) {
                return false;
            }
            ComposerGroupsChatsPostData composerGroupsChatsPostData = (ComposerGroupsChatsPostData) obj;
            if (!11T.A0O(this.A01, composerGroupsChatsPostData.A01) || !11T.A0O(this.A02, composerGroupsChatsPostData.A02) || !11T.A0O(this.A00, composerGroupsChatsPostData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        AbN.A0s(parcel, this.A00);
    }
}
