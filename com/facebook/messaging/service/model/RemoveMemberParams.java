package com.facebook.messaging.service.model;

import X.1BL;
import X.AbN;
import X.C53v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserFbidIdentifier;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: RemoveMemberParams.class */
public final class RemoveMemberParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(10);
    public final ThreadKey A00;
    public final ImmutableList A01;
    public final boolean A02;
    public final UserKey A03;

    public RemoveMemberParams(Parcel parcel) {
        this.A00 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A02 = C53v.A0S(parcel);
        this.A01 = AbN.A0e(parcel, UserFbidIdentifier.class);
        this.A03 = (UserKey) 1BL.A0C(parcel, ThreadKey.class);
    }

    public RemoveMemberParams(ThreadKey threadKey, List list, boolean z) {
        this.A00 = threadKey;
        this.A02 = z;
        this.A01 = ImmutableList.copyOf((Collection) list);
        this.A03 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A03, i);
    }
}
