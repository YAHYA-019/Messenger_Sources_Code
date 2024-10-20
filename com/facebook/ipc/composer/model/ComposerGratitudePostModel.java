package com.facebook.ipc.composer.model;

import X.11T;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBMomentOfGratitudeStories;

/* loaded from: ComposerGratitudePostModel.class */
public final class ComposerGratitudePostModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(23);
    public final GraphQLXFBMomentOfGratitudeStories A00;
    public final String A01;
    public final boolean A02;

    public ComposerGratitudePostModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : GraphQLXFBMomentOfGratitudeStories.values()[parcel.readInt()];
        this.A02 = AbN.A1U(parcel);
        this.A01 = parcel.readString();
    }

    public ComposerGratitudePostModel(GraphQLXFBMomentOfGratitudeStories graphQLXFBMomentOfGratitudeStories, String str, boolean z) {
        this.A00 = graphQLXFBMomentOfGratitudeStories;
        this.A02 = z;
        C1pq.A08("prompt", str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGratitudePostModel)) {
                return false;
            }
            ComposerGratitudePostModel composerGratitudePostModel = (ComposerGratitudePostModel) obj;
            if (this.A00 != composerGratitudePostModel.A00 || this.A02 != composerGratitudePostModel.A02 || !11T.A0O(this.A01, composerGratitudePostModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02(C3o5.A03(this.A00) + 31, this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A00));
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
