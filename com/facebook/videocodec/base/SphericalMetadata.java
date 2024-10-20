package com.facebook.videocodec.base;

import X.0Q8;
import X.11T;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: SphericalMetadata.class */
public final class SphericalMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(15);
    public final String A00;
    public final String A01;

    /* loaded from: SphericalMetadata$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = "";
            String str2 = str;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != -151612022) {
                            if (hashCode == 823760682 && A1C.equals("projection_type")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("projectionType", str);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("stereo_mode")) {
                                str2 = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("stereoMode", str2);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, SphericalMetadata.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new SphericalMetadata(str, str2);
        }
    }

    /* loaded from: SphericalMetadata$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            SphericalMetadata sphericalMetadata = (SphericalMetadata) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "projection_type", sphericalMetadata.A00);
            AbstractC11224vw.A0D(r302, "stereo_mode", sphericalMetadata.A01);
            r302.A0Y();
        }
    }

    public SphericalMetadata(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public SphericalMetadata(String str, String str2) {
        C1pq.A08("projectionType", str);
        this.A00 = str;
        C1pq.A08("stereoMode", str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SphericalMetadata)) {
                return false;
            }
            SphericalMetadata sphericalMetadata = (SphericalMetadata) obj;
            if (!11T.A0O(this.A00, sphericalMetadata.A00) || !11T.A0O(this.A01, sphericalMetadata.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
