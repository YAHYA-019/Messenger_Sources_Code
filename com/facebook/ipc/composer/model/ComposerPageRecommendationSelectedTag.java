package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLPageRecommendationsTag;

/* loaded from: ComposerPageRecommendationSelectedTag.class */
public final class ComposerPageRecommendationSelectedTag implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(50);
    public final GraphQLPageRecommendationsTag A00;
    public final String A01;

    public ComposerPageRecommendationSelectedTag(Parcel parcel) {
        GraphQLPageRecommendationsTag graphQLPageRecommendationsTag = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? (GraphQLPageRecommendationsTag) FJ8.A01(parcel) : graphQLPageRecommendationsTag;
    }

    public ComposerPageRecommendationSelectedTag(GraphQLPageRecommendationsTag graphQLPageRecommendationsTag, String str) {
        this.A01 = str;
        this.A00 = graphQLPageRecommendationsTag;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPageRecommendationSelectedTag)) {
                return false;
            }
            ComposerPageRecommendationSelectedTag composerPageRecommendationSelectedTag = (ComposerPageRecommendationSelectedTag) obj;
            if (!11T.A0O(this.A01, composerPageRecommendationSelectedTag.A01) || !11T.A0O(this.A00, composerPageRecommendationSelectedTag.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        DKH.A0y(parcel, this.A00);
    }
}
