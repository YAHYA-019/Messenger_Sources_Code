package com.facebook.inspiration.analytics.mediaaccuracy.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.RelativeImageOverlayParams;

/* loaded from: MediaAccuracyGLRenderer.class */
public final class MediaAccuracyGLRenderer implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(15);
    public final RelativeImageOverlayParams A00;
    public final String A01;

    public MediaAccuracyGLRenderer(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : (RelativeImageOverlayParams) RelativeImageOverlayParams.CREATOR.createFromParcel(parcel);
        this.A01 = parcel.readString();
    }

    public MediaAccuracyGLRenderer(RelativeImageOverlayParams relativeImageOverlayParams, String str) {
        this.A00 = relativeImageOverlayParams;
        C1pq.A08("renderKey", str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaAccuracyGLRenderer)) {
                return false;
            }
            MediaAccuracyGLRenderer mediaAccuracyGLRenderer = (MediaAccuracyGLRenderer) obj;
            if (!11T.A0O(this.A00, mediaAccuracyGLRenderer.A00) || !11T.A0O(this.A01, mediaAccuracyGLRenderer.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        RelativeImageOverlayParams relativeImageOverlayParams = this.A00;
        if (relativeImageOverlayParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            relativeImageOverlayParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }
}
