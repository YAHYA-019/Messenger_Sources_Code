package com.facebook.messaging.montage.forked.model.viewer;

import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import java.util.EnumSet;

/* loaded from: StoryViewerOverlayTracker.class */
public final class StoryViewerOverlayTracker implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(86);
    public final ImmutableSet A00;

    public StoryViewerOverlayTracker(Parcel parcel) {
        this.A00 = (ImmutableSet) parcel.readSerializable();
    }

    public StoryViewerOverlayTracker(EnumSet enumSet) {
        this.A00 = ImmutableSet.A07(enumSet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet != null) {
            parcel.writeSerializable(immutableSet);
        }
    }
}
