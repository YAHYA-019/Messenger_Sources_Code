package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.0Q8;
import X.11T;
import X.1BM;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbJ;
import X.AbM;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.FKX;
import X.GOm;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: SuggestionMediaModel.class */
public final class SuggestionMediaModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(18);
    public final float A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final int A0C;

    /* loaded from: SuggestionMediaModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            long j = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            float f = 0.0f;
            String str = "";
            String str2 = str;
            String str3 = str;
            String str4 = str;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        switch (A1Y.hashCode()) {
                            case -1871587889:
                                if (A1Y.equals("score_description")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("scoreDescription", str4);
                                    break;
                                }
                                break;
                            case -900774058:
                                if (A1Y.equals("media_id")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("mediaId", str2);
                                    break;
                                }
                                break;
                            case -853798513:
                                if (A1Y.equals("date_taken_ms")) {
                                    j = abstractC01033pi.A1B();
                                    break;
                                }
                                break;
                            case -441981411:
                                if (A1Y.equals("is_selfie")) {
                                    z3 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -401658929:
                                if (A1Y.equals("is_travel")) {
                                    z4 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 109072843:
                                if (A1Y.equals("is_burst")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 109264530:
                                if (A1Y.equals("score")) {
                                    f = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 127171878:
                                if (A1Y.equals("is_video")) {
                                    z5 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 315759889:
                                if (A1Y.equals(GOm.A00(6))) {
                                    z2 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1931848974:
                                if (A1Y.equals("creation_date")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("creationDate", str);
                                    break;
                                }
                                break;
                            case 1939875509:
                                if (A1Y.equals("media_type")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("mediaType", str3);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, SuggestionMediaModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new SuggestionMediaModel(str, str2, str3, str4, f, j, z, z2, z3, z4, z5);
        }
    }

    /* loaded from: SuggestionMediaModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            SuggestionMediaModel suggestionMediaModel = (SuggestionMediaModel) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "creation_date", suggestionMediaModel.A02);
            long j = suggestionMediaModel.A01;
            r302.A0o("date_taken_ms");
            r302.A0g(j);
            boolean z = suggestionMediaModel.A06;
            r302.A0o("is_burst");
            r302.A0v(z);
            boolean z2 = suggestionMediaModel.A07;
            r302.A0o(GOm.A00(6));
            r302.A0v(z2);
            boolean z3 = suggestionMediaModel.A08;
            r302.A0o("is_selfie");
            r302.A0v(z3);
            boolean z4 = suggestionMediaModel.A09;
            r302.A0o("is_travel");
            r302.A0v(z4);
            boolean z5 = suggestionMediaModel.A0A;
            r302.A0o("is_video");
            r302.A0v(z5);
            AbstractC11224vw.A0D(r302, "media_id", suggestionMediaModel.A03);
            AbstractC11224vw.A0D(r302, "media_type", suggestionMediaModel.A04);
            float f = suggestionMediaModel.A00;
            r302.A0o("score");
            r302.A0e(f);
            AbstractC11224vw.A0D(r302, "score_description", suggestionMediaModel.A05);
            r302.A0Y();
        }
    }

    public SuggestionMediaModel(Parcel parcel) {
        AbG.A1X(this);
        this.A02 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A06 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = 1BM.A07(parcel);
        this.A0A = AbJ.A1W(parcel);
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A0B = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A05 = parcel.readString();
    }

    public SuggestionMediaModel(String str, String str2, String str3, String str4, float f, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C1pq.A08("creationDate", str);
        this.A02 = str;
        this.A01 = j;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A0A = z5;
        C1pq.A08("mediaId", str2);
        this.A03 = str2;
        C1pq.A08("mediaType", str3);
        this.A04 = str3;
        this.A0B = 0;
        this.A0C = 0;
        this.A00 = f;
        C1pq.A08("scoreDescription", str4);
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SuggestionMediaModel)) {
                return false;
            }
            SuggestionMediaModel suggestionMediaModel = (SuggestionMediaModel) obj;
            if (!11T.A0O(this.A02, suggestionMediaModel.A02) || this.A01 != suggestionMediaModel.A01 || this.A06 != suggestionMediaModel.A06 || this.A07 != suggestionMediaModel.A07 || this.A08 != suggestionMediaModel.A08 || this.A09 != suggestionMediaModel.A09 || this.A0A != suggestionMediaModel.A0A || !11T.A0O(this.A03, suggestionMediaModel.A03) || !11T.A0O(this.A04, suggestionMediaModel.A04) || this.A0B != suggestionMediaModel.A0B || this.A0C != suggestionMediaModel.A0C || this.A00 != suggestionMediaModel.A00 || !11T.A0O(this.A05, suggestionMediaModel.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, AbM.A00((((C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A01(C1pq.A03(this.A02), this.A01), this.A06), this.A07), this.A08), this.A09), this.A0A))) * 31) + this.A0B) * 31) + this.A0C, this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A0C);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A05);
    }
}
