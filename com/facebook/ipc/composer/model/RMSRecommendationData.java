package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: RMSRecommendationData.class */
public final class RMSRecommendationData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(11);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;

    /* loaded from: RMSRecommendationData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            ImmutableList immutableList = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -2087999740) {
                            if (A1C.equals("rms_features")) {
                                immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, RMSFeaturesModel.class);
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != -216171678) {
                            if (hashCode == 474540897 && A1C.equals("recommendation_id")) {
                                str2 = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("delivery_surface")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, RMSRecommendationData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new RMSRecommendationData(immutableList, str, str2);
        }
    }

    /* loaded from: RMSRecommendationData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            RMSRecommendationData rMSRecommendationData = (RMSRecommendationData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "delivery_surface", rMSRecommendationData.A01);
            AbstractC11224vw.A0D(r302, "recommendation_id", rMSRecommendationData.A02);
            AbstractC11224vw.A06(r302, c26c, "rms_features", rMSRecommendationData.A00);
            r302.A0Y();
        }
    }

    public RMSRecommendationData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            RMSFeaturesModel[] rMSFeaturesModelArr = new RMSFeaturesModel[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, rMSFeaturesModelArr, i);
            }
            immutableList = ImmutableList.copyOf(rMSFeaturesModelArr);
        }
        this.A00 = immutableList;
    }

    public RMSRecommendationData(ImmutableList immutableList, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RMSRecommendationData)) {
                return false;
            }
            RMSRecommendationData rMSRecommendationData = (RMSRecommendationData) obj;
            if (!11T.A0O(this.A01, rMSRecommendationData.A01) || !11T.A0O(this.A02, rMSRecommendationData.A02) || !11T.A0O(this.A00, rMSRecommendationData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RMSRecommendationData{deliverySurface=");
        A0k.append(this.A01);
        A0k.append(", recommendationId=");
        A0k.append(this.A02);
        A0k.append(", rmsFeatures=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y = AbL.A0Y(parcel, immutableList);
        while (A0Y.hasNext()) {
            parcel.writeParcelable((RMSFeaturesModel) A0Y.next(), i);
        }
    }
}
