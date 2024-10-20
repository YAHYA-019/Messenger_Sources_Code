package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FJ8;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLPage;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerPageRecommendationModel.class */
public final class ComposerPageRecommendationModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(49);
    public final GraphQLPage A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    public ComposerPageRecommendationModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = FJ8.A02(parcel);
        int i = 0;
        this.A04 = 4YV.A1U(parcel.readInt());
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt() == 0 ? null : (GraphQLPage) FJ8.A01(parcel);
        int readInt = parcel.readInt();
        ComposerPageRecommendationSelectedTag[] composerPageRecommendationSelectedTagArr = new ComposerPageRecommendationSelectedTag[readInt];
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, composerPageRecommendationSelectedTagArr, i);
        }
        this.A02 = ImmutableList.copyOf(composerPageRecommendationSelectedTagArr);
    }

    public ComposerPageRecommendationModel(GraphQLPage graphQLPage, ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z) {
        C1pq.A08("availablePageRecommendationTags", immutableList);
        this.A01 = immutableList;
        this.A04 = z;
        C1pq.A08("recommendationType", str);
        this.A03 = str;
        this.A00 = graphQLPage;
        C1pq.A08("selectedTags", immutableList2);
        this.A02 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPageRecommendationModel)) {
                return false;
            }
            ComposerPageRecommendationModel composerPageRecommendationModel = (ComposerPageRecommendationModel) obj;
            if (!11T.A0O(this.A01, composerPageRecommendationModel.A01) || this.A04 != composerPageRecommendationModel.A04 || !11T.A0O(this.A03, composerPageRecommendationModel.A03) || !11T.A0O(this.A00, composerPageRecommendationModel.A00) || !11T.A0O(this.A02, composerPageRecommendationModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A02(C1pq.A03(this.A01), this.A04))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FJ8.A0B(parcel, this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A03);
        GraphQLPage graphQLPage = this.A00;
        if (graphQLPage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, graphQLPage);
        }
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerPageRecommendationSelectedTag) A0b.next(), i);
        }
    }
}
