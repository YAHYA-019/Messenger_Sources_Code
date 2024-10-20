package com.facebook.messaging.composer;

import X.11T;
import X.7zL;
import X.7zU;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ComposerKeyboardZeroRatingParam.class */
public final class ComposerKeyboardZeroRatingParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(12);
    public final ParcelableSecondaryData A00;
    public final String A01;
    public final String A02;

    public ComposerKeyboardZeroRatingParam(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readInt() == 0 ? null : (ParcelableSecondaryData) ParcelableSecondaryData.CREATOR.createFromParcel(parcel);
        this.A02 = parcel.readString();
    }

    public ComposerKeyboardZeroRatingParam(String str, String str2) {
        C1pq.A08("finderKey", str);
        this.A01 = str;
        this.A00 = null;
        C1pq.A08("zeroFeatureKey", str2);
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerKeyboardZeroRatingParam)) {
                return false;
            }
            ComposerKeyboardZeroRatingParam composerKeyboardZeroRatingParam = (ComposerKeyboardZeroRatingParam) obj;
            if (!11T.A0O(this.A01, composerKeyboardZeroRatingParam.A01) || !11T.A0O(this.A00, composerKeyboardZeroRatingParam.A00) || !11T.A0O(this.A02, composerKeyboardZeroRatingParam.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        ParcelableSecondaryData parcelableSecondaryData = this.A00;
        if (parcelableSecondaryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelableSecondaryData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A02);
    }
}
