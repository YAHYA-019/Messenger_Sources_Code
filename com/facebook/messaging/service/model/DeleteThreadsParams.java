package com.facebook.messaging.service.model;

import X.AbN;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: DeleteThreadsParams.class */
public final class DeleteThreadsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(80);
    public final ImmutableList A00;
    public final boolean A01;

    public DeleteThreadsParams(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, ThreadKey.class);
        this.A01 = AbN.A1U(parcel);
    }

    public DeleteThreadsParams(List list, boolean z) {
        this.A00 = ImmutableList.copyOf((Collection) list);
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
