package com.facebook.photos.creativeediting.model;

import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StoryBackgroundGradientColor.class */
public final class StoryBackgroundGradientColor implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(23);
    public final int A00;
    public final int A01;

    public StoryBackgroundGradientColor(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public StoryBackgroundGradientColor(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryBackgroundGradientColor)) {
                return false;
            }
            StoryBackgroundGradientColor storyBackgroundGradientColor = (StoryBackgroundGradientColor) obj;
            if (this.A00 != storyBackgroundGradientColor.A00 || this.A01 != storyBackgroundGradientColor.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
