package com.facebook.messaging.montage.forked.viewer.overlays.slider.model;

import X.11T;
import X.AbG;
import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.forked.viewer.model.ViewerInfo;

/* loaded from: FbSliderVoteModel.class */
public final class FbSliderVoteModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(95);
    public final float A00;
    public final ViewerInfo A01;

    public FbSliderVoteModel(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt() == 0 ? null : (ViewerInfo) ViewerInfo.CREATOR.createFromParcel(parcel);
    }

    public FbSliderVoteModel(ViewerInfo viewerInfo, float f) {
        this.A00 = f;
        this.A01 = viewerInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbSliderVoteModel)) {
                return false;
            }
            FbSliderVoteModel fbSliderVoteModel = (FbSliderVoteModel) obj;
            if (this.A00 != fbSliderVoteModel.A00 || !11T.A0O(this.A01, fbSliderVoteModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, Float.floatToIntBits(this.A00) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        ViewerInfo viewerInfo = this.A01;
        if (viewerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewerInfo.writeToParcel(parcel, i);
        }
    }
}
