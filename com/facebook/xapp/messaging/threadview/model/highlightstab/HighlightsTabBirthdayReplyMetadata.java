package com.facebook.xapp.messaging.threadview.model.highlightstab;

import X.11T;
import X.AnonymousClass001;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsTabBirthdayReplyMetadata.class */
public final class HighlightsTabBirthdayReplyMetadata extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(67);
    public final Integer A00;

    public HighlightsTabBirthdayReplyMetadata() {
        this(null);
    }

    public HighlightsTabBirthdayReplyMetadata(Integer num) {
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HighlightsTabBirthdayReplyMetadata) && 11T.A0O(this.A00, ((HighlightsTabBirthdayReplyMetadata) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        11T.A0F(parcel, 0);
        Integer num = this.A00;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }
}
