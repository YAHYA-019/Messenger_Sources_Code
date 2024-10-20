package com.facebook.messaging.montage.model.montagemetadata;

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
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: MontageStoryLocationData.class */
public final class MontageStoryLocationData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(22);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: MontageStoryLocationData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1737619624:
                                if (A1C.equals("footer_description")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1214645724:
                                if (A1C.equals("poster_location_description")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1170385640:
                                if (A1C.equals("secondary_text")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1114218166:
                                if (A1C.equals("primary_text")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1090636345:
                                if (A1C.equals("help_center_id")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 549649749:
                                if (A1C.equals("location_mismatch_description")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageStoryLocationData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageStoryLocationData(str, str2, str3, str4, str5, str6);
        }
    }

    /* loaded from: MontageStoryLocationData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageStoryLocationData montageStoryLocationData = (MontageStoryLocationData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "footer_description", montageStoryLocationData.A00);
            AbstractC11224vw.A0D(r302, "help_center_id", montageStoryLocationData.A01);
            AbstractC11224vw.A0D(r302, "location_mismatch_description", montageStoryLocationData.A02);
            AbstractC11224vw.A0D(r302, "poster_location_description", montageStoryLocationData.A03);
            AbstractC11224vw.A0D(r302, "primary_text", montageStoryLocationData.A04);
            AbstractC11224vw.A0D(r302, "secondary_text", montageStoryLocationData.A05);
            r302.A0Y();
        }
    }

    public MontageStoryLocationData(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
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
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    public MontageStoryLocationData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageStoryLocationData)) {
                return false;
            }
            MontageStoryLocationData montageStoryLocationData = (MontageStoryLocationData) obj;
            if (!11T.A0O(this.A00, montageStoryLocationData.A00) || !11T.A0O(this.A01, montageStoryLocationData.A01) || !11T.A0O(this.A02, montageStoryLocationData.A02) || !11T.A0O(this.A03, montageStoryLocationData.A03) || !11T.A0O(this.A04, montageStoryLocationData.A04) || !11T.A0O(this.A05, montageStoryLocationData.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
    }
}
