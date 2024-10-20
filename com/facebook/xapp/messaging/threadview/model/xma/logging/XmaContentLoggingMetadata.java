package com.facebook.xapp.messaging.threadview.model.xma.logging;

import X.11T;
import X.5PP;
import X.7dF;
import X.82N;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: XmaContentLoggingMetadata.class */
public final class XmaContentLoggingMetadata extends C04v implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new 82N(38);
    public final 7dF A00;

    public XmaContentLoggingMetadata(7dF r302) {
        this.A00 = r302;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof XmaContentLoggingMetadata) && 11T.A0O(this.A00, ((XmaContentLoggingMetadata) obj).A00));
    }

    public int hashCode() {
        7dF r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        7dF r0 = this.A00;
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.graphql.minimal.model.MinimalFragmentModel");
        parcel.writeString(r0.A00.toString());
    }
}
