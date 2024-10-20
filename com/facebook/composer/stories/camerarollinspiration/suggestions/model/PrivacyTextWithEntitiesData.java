package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.0Q8;
import X.11T;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: PrivacyTextWithEntitiesData.class */
public final class PrivacyTextWithEntitiesData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(13);
    public final int A00;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    /* loaded from: PrivacyTextWithEntitiesData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList immutableList = null;
            int i = 0;
            int i2 = 0;
            String str = "";
            String str2 = str;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1185250696:
                                if (A1C.equals("images")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, PrivacyTextWithEntitiesImageData.class);
                                    break;
                                }
                                break;
                            case -1106363674:
                                if (A1C.equals("length")) {
                                    i = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1019779949:
                                if (A1C.equals("offset")) {
                                    i2 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 116076:
                                if (A1C.equals(TraceFieldType.Uri)) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(TraceFieldType.Uri, str2);
                                    break;
                                }
                                break;
                            case 3556653:
                                if (A1C.equals("text")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("text", str);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, PrivacyTextWithEntitiesData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new PrivacyTextWithEntitiesData(immutableList, str, str2, i, i2);
        }
    }

    /* loaded from: PrivacyTextWithEntitiesData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            PrivacyTextWithEntitiesData privacyTextWithEntitiesData = (PrivacyTextWithEntitiesData) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "images", privacyTextWithEntitiesData.A02);
            int i = privacyTextWithEntitiesData.A00;
            r302.A0o("length");
            r302.A0f(i);
            int i2 = privacyTextWithEntitiesData.A01;
            r302.A0o("offset");
            r302.A0f(i2);
            AbstractC11224vw.A0D(r302, "text", privacyTextWithEntitiesData.A03);
            AbstractC11224vw.A0D(r302, TraceFieldType.Uri, privacyTextWithEntitiesData.A04);
            r302.A0Y();
        }
    }

    public PrivacyTextWithEntitiesData(Parcel parcel) {
        ImmutableList copyOf;
        ClassLoader A0e = 4YV.A0e(this);
        if (parcel.readInt() == 0) {
            copyOf = null;
        } else {
            int readInt = parcel.readInt();
            PrivacyTextWithEntitiesImageData[] privacyTextWithEntitiesImageDataArr = new PrivacyTextWithEntitiesImageData[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, privacyTextWithEntitiesImageDataArr, i);
            }
            copyOf = ImmutableList.copyOf(privacyTextWithEntitiesImageDataArr);
        }
        this.A02 = copyOf;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public PrivacyTextWithEntitiesData(ImmutableList immutableList, String str, String str2, int i, int i2) {
        this.A02 = immutableList;
        this.A00 = i;
        this.A01 = i2;
        C1pq.A08("text", str);
        this.A03 = str;
        C1pq.A08(TraceFieldType.Uri, str2);
        this.A04 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PrivacyTextWithEntitiesData)) {
                return false;
            }
            PrivacyTextWithEntitiesData privacyTextWithEntitiesData = (PrivacyTextWithEntitiesData) obj;
            if (!11T.A0O(this.A02, privacyTextWithEntitiesData.A02) || this.A00 != privacyTextWithEntitiesData.A00 || this.A01 != privacyTextWithEntitiesData.A01 || !11T.A0O(this.A03, privacyTextWithEntitiesData.A03) || !11T.A0O(this.A04, privacyTextWithEntitiesData.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, (((C1pq.A03(this.A02) * 31) + this.A00) * 31) + this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((PrivacyTextWithEntitiesImageData) A0Y.next(), i);
            }
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }
}
