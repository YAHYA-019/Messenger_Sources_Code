package com.facebook.messaging.service.model;

import X.4YV;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;

/* loaded from: FetchThreadMetadataParams.class */
public final class FetchThreadMetadataParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(98);
    public final ImmutableSet A00;
    public final String[] A01;

    public FetchThreadMetadataParams(Parcel parcel) {
        Object[] createTypedArray = parcel.createTypedArray(ThreadKey.CREATOR);
        this.A00 = createTypedArray == null ? RegularImmutableSet.A05 : ImmutableSet.A08(createTypedArray);
        this.A01 = parcel.createStringArray();
    }

    public FetchThreadMetadataParams(ImmutableSet immutableSet, String[] strArr) {
        this.A00 = immutableSet;
        this.A01 = strArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("threadKeys", TextUtils.join(", ", this.A00));
        return 4YV.A0s(stringHelper, TextUtils.join(", ", this.A01), "fields");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableSet immutableSet = this.A00;
        parcel.writeTypedArray((ThreadKey[]) immutableSet.toArray(new ThreadKey[immutableSet.size()]), i);
        parcel.writeStringArray(this.A01);
    }
}
