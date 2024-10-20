package com.facebook.messaging.media.service;

import X.AnonymousClass001;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: LocalMediaLoadResult.class */
public final class LocalMediaLoadResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(28);
    public final ImmutableList A00;

    public LocalMediaLoadResult(Parcel parcel) {
        Parcelable.Creator creator = MediaResource.CREATOR;
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, creator);
        this.A00 = ImmutableList.copyOf((Collection) A0s);
    }

    public LocalMediaLoadResult(List list) {
        this.A00 = ImmutableList.copyOf((Collection) list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A00);
    }
}
