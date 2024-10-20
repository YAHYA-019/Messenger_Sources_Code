package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLRMSRecommendationFeatures;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: RMSFeaturesModel.class */
public final class RMSFeaturesModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(10);
    public final GraphQLRMSRecommendationFeatures A00;
    public final String A01;

    /* loaded from: RMSFeaturesModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            GraphQLRMSRecommendationFeatures graphQLRMSRecommendationFeatures = null;
            String str = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != -1167794456) {
                            if (hashCode == 1209016884 && A1C.equals(1BJ.A00(45))) {
                                graphQLRMSRecommendationFeatures = (GraphQLRMSRecommendationFeatures) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLRMSRecommendationFeatures.class);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("feature_value")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, RMSFeaturesModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new RMSFeaturesModel(graphQLRMSRecommendationFeatures, str);
        }
    }

    /* loaded from: RMSFeaturesModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            RMSFeaturesModel rMSFeaturesModel = (RMSFeaturesModel) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, rMSFeaturesModel.A00, 1BJ.A00(45));
            AbstractC11224vw.A0D(r302, "feature_value", rMSFeaturesModel.A01);
            r302.A0Y();
        }
    }

    public RMSFeaturesModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? GraphQLRMSRecommendationFeatures.values()[parcel.readInt()] : null;
        this.A01 = C3o5.A0O(parcel);
    }

    public RMSFeaturesModel(GraphQLRMSRecommendationFeatures graphQLRMSRecommendationFeatures, String str) {
        this.A00 = graphQLRMSRecommendationFeatures;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RMSFeaturesModel)) {
                return false;
            }
            RMSFeaturesModel rMSFeaturesModel = (RMSFeaturesModel) obj;
            if (this.A00 != rMSFeaturesModel.A00 || !11T.A0O(this.A01, rMSFeaturesModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C3o5.A03(this.A00) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
