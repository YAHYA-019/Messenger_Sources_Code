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
import com.facebook.graphql.model.GraphQLTextWithEntities;

/* loaded from: ComposerFundraiserForStoryData.class */
public final class ComposerFundraiserForStoryData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(18);
    public final GraphQLTextWithEntities A00;
    public final GraphQLTextWithEntities A01;
    public final GraphQLTextWithEntities A02;
    public final String A03;
    public final String A04;

    public ComposerFundraiserForStoryData(Parcel parcel) {
        GraphQLTextWithEntities graphQLTextWithEntities = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (GraphQLTextWithEntities) FJ8.A01(parcel);
        }
        this.A03 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (GraphQLTextWithEntities) FJ8.A01(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? (GraphQLTextWithEntities) FJ8.A01(parcel) : graphQLTextWithEntities;
        this.A04 = C3o5.A0O(parcel);
    }

    public ComposerFundraiserForStoryData(GraphQLTextWithEntities graphQLTextWithEntities, GraphQLTextWithEntities graphQLTextWithEntities2, GraphQLTextWithEntities graphQLTextWithEntities3, String str, String str2) {
        this.A00 = graphQLTextWithEntities;
        C1pq.A08("charityId", str);
        this.A03 = str;
        this.A01 = graphQLTextWithEntities2;
        this.A02 = graphQLTextWithEntities3;
        this.A04 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerFundraiserForStoryData)) {
                return false;
            }
            ComposerFundraiserForStoryData composerFundraiserForStoryData = (ComposerFundraiserForStoryData) obj;
            if (!11T.A0O(this.A00, composerFundraiserForStoryData.A00) || !11T.A0O(this.A03, composerFundraiserForStoryData.A03) || !11T.A0O(this.A01, composerFundraiserForStoryData.A01) || !11T.A0O(this.A02, composerFundraiserForStoryData.A02) || !11T.A0O(this.A04, composerFundraiserForStoryData.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0y(parcel, this.A00);
        parcel.writeString(this.A03);
        DKH.A0y(parcel, this.A01);
        DKH.A0y(parcel, this.A02);
        1BL.A13(parcel, this.A04);
    }
}
