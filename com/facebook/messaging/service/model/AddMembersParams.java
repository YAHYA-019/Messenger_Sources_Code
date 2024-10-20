package com.facebook.messaging.service.model;

import X.1BL;
import X.4YV;
import X.7zS;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserFbidIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: AddMembersParams.class */
public final class AddMembersParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(73);
    public final ThreadKey A00;
    public final ImmutableList A01;
    public final boolean A02;

    public AddMembersParams(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, ThreadKey.class);
        A0C.getClass();
        this.A00 = (ThreadKey) A0C;
        ArrayList A0y = 4YV.A0y(parcel, UserFbidIdentifier.class);
        A0y.getClass();
        this.A01 = ImmutableList.copyOf((Collection) A0y);
        this.A02 = 7zS.A1Z(parcel);
    }

    public AddMembersParams(ThreadKey threadKey, List list) {
        this.A00 = threadKey;
        this.A01 = ImmutableList.copyOf((Collection) list);
        this.A02 = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AddMembersParams addMembersParams = (AddMembersParams) obj;
            if (this.A02 != addMembersParams.A02 || !this.A00.equals(addMembersParams.A00)) {
                return false;
            }
            ImmutableList immutableList = this.A01;
            ImmutableList immutableList2 = addMembersParams.A01;
            if (immutableList != null) {
                z = immutableList.equals(immutableList2);
            } else if (immutableList2 != null) {
                return false;
            }
        }
        return z;
    }

    public int hashCode() {
        int A03 = 1BL.A03(this.A00);
        ImmutableList immutableList = this.A01;
        return ((A03 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + (this.A02 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
