package com.facebook.camerarollprocessor.model;

import X.0Q8;
import X.11T;
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
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ContextualFeatureConcept.class */
public final class ContextualFeatureConcept implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(83);
    public final double A00;
    public final int A01;
    public final String A02;

    /* loaded from: ContextualFeatureConcept$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            int i = 0;
            double d = 0.0d;
            String str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -1936261550) {
                            if (A1C.equals("concept_id")) {
                                i = abstractC01033pi.A1y();
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != -1026360830) {
                            if (hashCode == 1646948509 && A1C.equals("confidence_score")) {
                                d = abstractC01033pi.A11();
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("concept_name")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("conceptName", str);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ContextualFeatureConcept.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ContextualFeatureConcept(i, str, d);
        }
    }

    /* loaded from: ContextualFeatureConcept$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ContextualFeatureConcept contextualFeatureConcept = (ContextualFeatureConcept) obj;
            r302.A0b();
            int i = contextualFeatureConcept.A01;
            r302.A0o("concept_id");
            r302.A0f(i);
            AbstractC11224vw.A0D(r302, "concept_name", contextualFeatureConcept.A02);
            double d = contextualFeatureConcept.A00;
            r302.A0o("confidence_score");
            r302.A0d(d);
            r302.A0Y();
        }
    }

    public ContextualFeatureConcept(int i, String str, double d) {
        this.A01 = i;
        C1pq.A08("conceptName", str);
        this.A02 = str;
        this.A00 = d;
    }

    public ContextualFeatureConcept(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ContextualFeatureConcept)) {
                return false;
            }
            ContextualFeatureConcept contextualFeatureConcept = (ContextualFeatureConcept) obj;
            if (this.A01 != contextualFeatureConcept.A01 || !11T.A0O(this.A02, contextualFeatureConcept.A02) || this.A00 != contextualFeatureConcept.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A00(this.A00, C1pq.A04(this.A02, this.A01 + 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
        parcel.writeDouble(this.A00);
    }
}
