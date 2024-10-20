package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.Dl4;
import X.EVy;
import X.FHV;
import X.FJ8;
import X.FKc;
import X.Qzo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLTextWithEntities;

/* loaded from: InspirationGraphQLTextWithEntities.class */
public final class InspirationGraphQLTextWithEntities implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(16);
    public final GraphQLTextWithEntities textWithEntities;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InspirationGraphQLTextWithEntities() {
        /*
            r301 = this;
            java.lang.String r0 = ""
            com.facebook.graphql.model.GraphQLTextWithEntities r0 = X.Qzo.A00(r0)
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.inspiration.model.movableoverlay.InspirationGraphQLTextWithEntities.<init>():void");
    }

    public InspirationGraphQLTextWithEntities(Parcel parcel) {
        GraphQLTextWithEntities graphQLTextWithEntities = (GraphQLTextWithEntities) FJ8.A01(parcel);
        if (graphQLTextWithEntities == null) {
            graphQLTextWithEntities = Qzo.A00("");
            11T.A0A(graphQLTextWithEntities);
        }
        this.textWithEntities = graphQLTextWithEntities;
    }

    public InspirationGraphQLTextWithEntities(GraphQLTextWithEntities graphQLTextWithEntities) {
        this.textWithEntities = graphQLTextWithEntities;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspirationGraphQLTextWithEntities) {
            return FHV.A03((Dl4) EVy.A00(this.textWithEntities, Dl4.class, 750394272), (Dl4) EVy.A00(((InspirationGraphQLTextWithEntities) obj).textWithEntities, Dl4.class, 750394272));
        }
        return false;
    }

    public int hashCode() {
        return FHV.A00((Dl4) EVy.A00(this.textWithEntities, Dl4.class, 750394272)) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        FJ8.A0A(parcel, this.textWithEntities);
    }
}
