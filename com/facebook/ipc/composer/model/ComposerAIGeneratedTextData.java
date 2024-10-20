package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
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

/* loaded from: ComposerAIGeneratedTextData.class */
public final class ComposerAIGeneratedTextData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(92);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* loaded from: ComposerAIGeneratedTextData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            boolean z = false;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1938614671:
                                if (A1C.equals("tracking_token")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1248642762:
                                if (A1C.equals("suggestion_id")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1130339546:
                                if (A1C.equals("bottomsheet_id")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -236982773:
                                if (A1C.equals("original_generated_text")) {
                                    str7 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("originalGeneratedText", str7);
                                    break;
                                }
                                break;
                            case -236732607:
                                if (A1C.equals("is_pregenerated")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 762863301:
                                if (A1C.equals("metagen_response_id")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1387593311:
                                if (A1C.equals("metagen_request_id")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1494220390:
                                if (A1C.equals("ai_generated_text_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerAIGeneratedTextData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerAIGeneratedTextData(str, str2, str3, str4, str7, str5, z, str6);
        }
    }

    /* loaded from: ComposerAIGeneratedTextData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerAIGeneratedTextData composerAIGeneratedTextData = (ComposerAIGeneratedTextData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "ai_generated_text_id", composerAIGeneratedTextData.A00);
            AbstractC11224vw.A0D(r302, "bottomsheet_id", composerAIGeneratedTextData.A01);
            boolean z = composerAIGeneratedTextData.A07;
            r302.A0o("is_pregenerated");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "metagen_request_id", composerAIGeneratedTextData.A02);
            AbstractC11224vw.A0D(r302, "metagen_response_id", composerAIGeneratedTextData.A03);
            AbstractC11224vw.A0D(r302, "original_generated_text", composerAIGeneratedTextData.A04);
            AbstractC11224vw.A0D(r302, "suggestion_id", composerAIGeneratedTextData.A05);
            AbstractC11224vw.A0D(r302, "tracking_token", composerAIGeneratedTextData.A06);
            r302.A0Y();
        }
    }

    public ComposerAIGeneratedTextData(Parcel parcel) {
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
        this.A07 = AbN.A1U(parcel);
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
        this.A04 = parcel.readString();
        this.A05 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = C3o5.A0O(parcel);
    }

    public ComposerAIGeneratedTextData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.A00 = str;
        this.A01 = str2;
        this.A07 = z;
        this.A02 = str3;
        this.A03 = str4;
        C1pq.A08("originalGeneratedText", str5);
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerAIGeneratedTextData)) {
                return false;
            }
            ComposerAIGeneratedTextData composerAIGeneratedTextData = (ComposerAIGeneratedTextData) obj;
            if (!11T.A0O(this.A00, composerAIGeneratedTextData.A00) || !11T.A0O(this.A01, composerAIGeneratedTextData.A01) || this.A07 != composerAIGeneratedTextData.A07 || !11T.A0O(this.A02, composerAIGeneratedTextData.A02) || !11T.A0O(this.A03, composerAIGeneratedTextData.A03) || !11T.A0O(this.A04, composerAIGeneratedTextData.A04) || !11T.A0O(this.A05, composerAIGeneratedTextData.A05) || !11T.A0O(this.A06, composerAIGeneratedTextData.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A07))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComposerAIGeneratedTextData{aiGeneratedTextId=");
        A0k.append(this.A00);
        A0k.append(", bottomsheetId=");
        A0k.append(this.A01);
        A0k.append(", isPregenerated=");
        A0k.append(this.A07);
        A0k.append(", metagenRequestId=");
        A0k.append(this.A02);
        A0k.append(", metagenResponseId=");
        A0k.append(this.A03);
        A0k.append(", originalGeneratedText=");
        A0k.append(this.A04);
        A0k.append(", suggestionId=");
        A0k.append(this.A05);
        A0k.append(", trackingToken=");
        A0k.append(this.A06);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
    }
}
