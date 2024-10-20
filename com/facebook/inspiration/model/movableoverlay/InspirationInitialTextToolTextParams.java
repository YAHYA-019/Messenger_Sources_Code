package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
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
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationInitialTextToolTextParams.class */
public final class InspirationInitialTextToolTextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(18);
    public final InspirationGraphQLTextWithEntities A00;
    public final Float A01;
    public final String A02;
    public final String A03;

    /* loaded from: InspirationInitialTextToolTextParams$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            Float f = null;
            InspirationGraphQLTextWithEntities inspirationGraphQLTextWithEntities = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -169948061:
                                if (A1C.equals("initial_text_with_entities")) {
                                    inspirationGraphQLTextWithEntities = (InspirationGraphQLTextWithEntities) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationGraphQLTextWithEntities.class);
                                    break;
                                }
                                break;
                            case -2795703:
                                if (A1C.equals("initial_blocking_type")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 285815724:
                                if (A1C.equals("initial_text_alignment")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 768119960:
                                if (A1C.equals("initial_text_size")) {
                                    f = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationInitialTextToolTextParams.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationInitialTextToolTextParams(inspirationGraphQLTextWithEntities, f, str, str2);
        }
    }

    /* loaded from: InspirationInitialTextToolTextParams$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationInitialTextToolTextParams inspirationInitialTextToolTextParams = (InspirationInitialTextToolTextParams) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "initial_blocking_type", inspirationInitialTextToolTextParams.A02);
            AbstractC11224vw.A0D(r302, "initial_text_alignment", inspirationInitialTextToolTextParams.A03);
            AbstractC11224vw.A0A(r302, inspirationInitialTextToolTextParams.A01, "initial_text_size");
            AbstractC11224vw.A05(r302, c26c, inspirationInitialTextToolTextParams.A00, "initial_text_with_entities");
            r302.A0Y();
        }
    }

    public InspirationInitialTextToolTextParams(Parcel parcel) {
        InspirationGraphQLTextWithEntities inspirationGraphQLTextWithEntities = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Float.valueOf(parcel.readFloat());
        }
        this.A00 = parcel.readInt() != 0 ? (InspirationGraphQLTextWithEntities) InspirationGraphQLTextWithEntities.CREATOR.createFromParcel(parcel) : inspirationGraphQLTextWithEntities;
    }

    public InspirationInitialTextToolTextParams(InspirationGraphQLTextWithEntities inspirationGraphQLTextWithEntities, Float f, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = f;
        this.A00 = inspirationGraphQLTextWithEntities;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationInitialTextToolTextParams)) {
                return false;
            }
            InspirationInitialTextToolTextParams inspirationInitialTextToolTextParams = (InspirationInitialTextToolTextParams) obj;
            if (!11T.A0O(this.A02, inspirationInitialTextToolTextParams.A02) || !11T.A0O(this.A03, inspirationInitialTextToolTextParams.A03) || !11T.A0O(this.A01, inspirationInitialTextToolTextParams.A01) || !11T.A0O(this.A00, inspirationInitialTextToolTextParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A03(this.A02))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        DKH.A12(parcel, this.A01);
        InspirationGraphQLTextWithEntities inspirationGraphQLTextWithEntities = this.A00;
        if (inspirationGraphQLTextWithEntities == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationGraphQLTextWithEntities.writeToParcel(parcel, i);
        }
    }
}
