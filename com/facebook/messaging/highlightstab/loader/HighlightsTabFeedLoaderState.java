package com.facebook.messaging.highlightstab.loader;

import X.11T;
import X.7zL;
import X.9CP;
import X.AnonymousClass001;
import X.C04v;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsTabFeedLoaderState.class */
public final class HighlightsTabFeedLoaderState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(74);
    public final Boolean A00;
    public final Integer A01;

    public HighlightsTabFeedLoaderState(Boolean bool, Integer num) {
        11T.A0F(num, 1);
        this.A01 = num;
        this.A00 = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsTabFeedLoaderState)) {
                return false;
            }
            HighlightsTabFeedLoaderState highlightsTabFeedLoaderState = (HighlightsTabFeedLoaderState) obj;
            if (this.A01 != highlightsTabFeedLoaderState.A01 || !11T.A0O(this.A00, highlightsTabFeedLoaderState.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return C3o5.A05(num, 9CP.A00(num)) + AnonymousClass001.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        11T.A0F(parcel, 0);
        parcel.writeString(9CP.A00(this.A01));
        Boolean bool = this.A00;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue() ? 1 : 0;
        }
        parcel.writeInt(i2);
    }
}
