package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbJ;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationAIGeneratedTextInputParams.class */
public final class InspirationAIGeneratedTextInputParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(2);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* loaded from: InspirationAIGeneratedTextInputParams$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            String str = null;
            Boolean bool = null;
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
                            case -1248642762:
                                if (A1C.equals("suggestion_id")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -236732607:
                                if (A1C.equals("is_pregenerated")) {
                                    bool = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case 203667419:
                                if (A1C.equals("added_from_suggestion_tray")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 762863301:
                                if (A1C.equals("metagen_response_id")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 879628474:
                                if (A1C.equals("ai_generated_text_ent_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1102146309:
                                if (A1C.equals("original_unedited_ai_generated_text")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1387593311:
                                if (A1C.equals("metagen_request_id")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1910426181:
                                if (A1C.equals("write_with_ai_tracking_id")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationAIGeneratedTextInputParams.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationAIGeneratedTextInputParams(bool, str, str2, str3, str4, str5, str6, z);
        }
    }

    /* loaded from: InspirationAIGeneratedTextInputParams$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationAIGeneratedTextInputParams inspirationAIGeneratedTextInputParams = (InspirationAIGeneratedTextInputParams) obj;
            r302.A0b();
            boolean z = inspirationAIGeneratedTextInputParams.A07;
            r302.A0o("added_from_suggestion_tray");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "ai_generated_text_ent_id", inspirationAIGeneratedTextInputParams.A01);
            AbstractC11224vw.A08(r302, inspirationAIGeneratedTextInputParams.A00, "is_pregenerated");
            AbstractC11224vw.A0D(r302, "metagen_request_id", inspirationAIGeneratedTextInputParams.A02);
            AbstractC11224vw.A0D(r302, "metagen_response_id", inspirationAIGeneratedTextInputParams.A03);
            AbstractC11224vw.A0D(r302, "original_unedited_ai_generated_text", inspirationAIGeneratedTextInputParams.A04);
            AbstractC11224vw.A0D(r302, "suggestion_id", inspirationAIGeneratedTextInputParams.A05);
            AbstractC11224vw.A0D(r302, "write_with_ai_tracking_id", inspirationAIGeneratedTextInputParams.A06);
            r302.A0Y();
        }
    }

    public InspirationAIGeneratedTextInputParams(Parcel parcel) {
        this.A07 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Boolean.valueOf(AbJ.A1W(parcel));
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
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = C3o5.A0O(parcel);
    }

    public InspirationAIGeneratedTextInputParams(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A07 = z;
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationAIGeneratedTextInputParams)) {
                return false;
            }
            InspirationAIGeneratedTextInputParams inspirationAIGeneratedTextInputParams = (InspirationAIGeneratedTextInputParams) obj;
            if (this.A07 != inspirationAIGeneratedTextInputParams.A07 || !11T.A0O(this.A01, inspirationAIGeneratedTextInputParams.A01) || !11T.A0O(this.A00, inspirationAIGeneratedTextInputParams.A00) || !11T.A0O(this.A02, inspirationAIGeneratedTextInputParams.A02) || !11T.A0O(this.A03, inspirationAIGeneratedTextInputParams.A03) || !11T.A0O(this.A04, inspirationAIGeneratedTextInputParams.A04) || !11T.A0O(this.A05, inspirationAIGeneratedTextInputParams.A05) || !11T.A0O(this.A06, inspirationAIGeneratedTextInputParams.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A05(this.A07))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A01);
        AbN.A0s(parcel, this.A00);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
    }
}
