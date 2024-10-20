package com.facebook.inspiration.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.EKg;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationAiImagineData.class */
public final class InspirationAiImagineData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(44);
    public final EKg A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    /* loaded from: InspirationAiImagineData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            EKg eKg = null;
            boolean z = false;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = "";
            String str6 = str5;
            String str7 = str5;
            String str8 = str5;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2021814613:
                                if (A1C.equals("user_interaction_info_id")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -2011796634:
                                if (A1C.equals("edit_tools")) {
                                    eKg = (EKg) AbstractC11224vw.A02(abstractC01033pi, c27t, EKg.class);
                                    break;
                                }
                                break;
                            case -877823861:
                                if (A1C.equals("image_url")) {
                                    str7 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("imageUrl", str7);
                                    break;
                                }
                                break;
                            case -859601281:
                                if (A1C.equals("image_id")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("imageId", str6);
                                    break;
                                }
                                break;
                            case -318025478:
                                if (A1C.equals("is_uploaded_media")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -237854632:
                                if (A1C.equals("user_prompt")) {
                                    str8 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("userPrompt", str8);
                                    break;
                                }
                                break;
                            case 37109963:
                                if (A1C.equals(TraceFieldType.RequestID)) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1014577290:
                                if (A1C.equals("product_type")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1609243096:
                                if (A1C.equals("bottom_sheet_session_id")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("bottomSheetSessionId", str5);
                                    break;
                                }
                                break;
                            case 1847552473:
                                if (A1C.equals("response_id")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationAiImagineData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationAiImagineData(eKg, str5, str6, str7, str, str2, str3, str4, str8, z);
        }
    }

    /* loaded from: InspirationAiImagineData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationAiImagineData inspirationAiImagineData = (InspirationAiImagineData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "bottom_sheet_session_id", inspirationAiImagineData.A01);
            AbstractC11224vw.A05(r302, c26c, inspirationAiImagineData.A00, "edit_tools");
            AbstractC11224vw.A0D(r302, "image_id", inspirationAiImagineData.A02);
            AbstractC11224vw.A0D(r302, "image_url", inspirationAiImagineData.A03);
            boolean z = inspirationAiImagineData.A09;
            r302.A0o("is_uploaded_media");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "product_type", inspirationAiImagineData.A04);
            AbstractC11224vw.A0D(r302, TraceFieldType.RequestID, inspirationAiImagineData.A05);
            AbstractC11224vw.A0D(r302, "response_id", inspirationAiImagineData.A06);
            AbstractC11224vw.A0D(r302, "user_interaction_info_id", inspirationAiImagineData.A07);
            AbstractC11224vw.A0D(r302, "user_prompt", inspirationAiImagineData.A08);
            r302.A0Y();
        }
    }

    public InspirationAiImagineData(EKg eKg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        C1pq.A08("bottomSheetSessionId", str);
        this.A01 = str;
        this.A00 = eKg;
        C1pq.A08("imageId", str2);
        this.A02 = str2;
        C1pq.A08("imageUrl", str3);
        this.A03 = str3;
        this.A09 = z;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        C1pq.A08("userPrompt", str8);
        this.A08 = str8;
    }

    public InspirationAiImagineData(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = EKg.values()[parcel.readInt()];
        }
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A09 = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C3o5.A0O(parcel);
        this.A08 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationAiImagineData)) {
                return false;
            }
            InspirationAiImagineData inspirationAiImagineData = (InspirationAiImagineData) obj;
            if (!11T.A0O(this.A01, inspirationAiImagineData.A01) || this.A00 != inspirationAiImagineData.A00 || !11T.A0O(this.A02, inspirationAiImagineData.A02) || !11T.A0O(this.A03, inspirationAiImagineData.A03) || this.A09 != inspirationAiImagineData.A09 || !11T.A0O(this.A04, inspirationAiImagineData.A04) || !11T.A0O(this.A05, inspirationAiImagineData.A05) || !11T.A0O(this.A06, inspirationAiImagineData.A06) || !11T.A0O(this.A07, inspirationAiImagineData.A07) || !11T.A0O(this.A08, inspirationAiImagineData.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, (A03 * 31) + C3o5.A03(this.A00))), this.A09))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        C3o5.A0e(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
    }
}
