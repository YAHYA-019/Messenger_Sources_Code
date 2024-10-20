package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.0Q8;
import X.11T;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: PrivacyTextWithEntitiesImageData.class */
public final class PrivacyTextWithEntitiesImageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(14);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;

    /* loaded from: PrivacyTextWithEntitiesImageData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            String str = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1221029593:
                                if (A1C.equals(Property.ICON_TEXT_FIT_HEIGHT)) {
                                    num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 116076:
                                if (A1C.equals(TraceFieldType.Uri)) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(TraceFieldType.Uri, str);
                                    break;
                                }
                                break;
                            case 109250890:
                                if (A1C.equals("scale")) {
                                    num2 = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 113126854:
                                if (A1C.equals(Property.ICON_TEXT_FIT_WIDTH)) {
                                    num3 = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, PrivacyTextWithEntitiesImageData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new PrivacyTextWithEntitiesImageData(num, num2, num3, str);
        }
    }

    /* loaded from: PrivacyTextWithEntitiesImageData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            PrivacyTextWithEntitiesImageData privacyTextWithEntitiesImageData = (PrivacyTextWithEntitiesImageData) obj;
            r302.A0b();
            AbstractC11224vw.A0B(r302, privacyTextWithEntitiesImageData.A00, Property.ICON_TEXT_FIT_HEIGHT);
            AbstractC11224vw.A0B(r302, privacyTextWithEntitiesImageData.A01, "scale");
            AbstractC11224vw.A0D(r302, TraceFieldType.Uri, privacyTextWithEntitiesImageData.A03);
            AbstractC11224vw.A0B(r302, privacyTextWithEntitiesImageData.A02, Property.ICON_TEXT_FIT_WIDTH);
            r302.A0Y();
        }
    }

    public PrivacyTextWithEntitiesImageData(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbI.A0z(parcel);
        }
        this.A03 = parcel.readString();
        this.A02 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
    }

    public PrivacyTextWithEntitiesImageData(Integer num, Integer num2, Integer num3, String str) {
        this.A00 = num;
        this.A01 = num2;
        C1pq.A08(TraceFieldType.Uri, str);
        this.A03 = str;
        this.A02 = num3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PrivacyTextWithEntitiesImageData)) {
                return false;
            }
            PrivacyTextWithEntitiesImageData privacyTextWithEntitiesImageData = (PrivacyTextWithEntitiesImageData) obj;
            if (!11T.A0O(this.A00, privacyTextWithEntitiesImageData.A00) || !11T.A0O(this.A01, privacyTextWithEntitiesImageData.A01) || !11T.A0O(this.A03, privacyTextWithEntitiesImageData.A03) || !11T.A0O(this.A02, privacyTextWithEntitiesImageData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A00);
        C3o5.A0f(parcel, this.A01);
        parcel.writeString(this.A03);
        C3o5.A0f(parcel, this.A02);
    }
}
