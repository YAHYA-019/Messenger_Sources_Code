package com.facebook.messaging.model.threads;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.4YT;
import X.5BB;
import X.7zK;
import X.AbE;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.Byz;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSV;
import X.DKB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: AdsConversionsQPData.class */
public final class AdsConversionsQPData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(59);
    public final double A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    /* loaded from: AdsConversionsQPData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Byz byz = new Byz();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1595528053:
                                if (A1C.equals(4YT.A00(460))) {
                                    byz.A0B = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1324558330:
                                if (A1C.equals("upsell_title")) {
                                    byz.A0E = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -634286772:
                                if (A1C.equals("is_eligible")) {
                                    byz.A0F = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -467109298:
                                if (A1C.equals(4YT.A00(461))) {
                                    byz.A0C = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -133689903:
                                if (A1C.equals(4YT.A00(190))) {
                                    byz.A08 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 55126294:
                                if (A1C.equals("timestamp")) {
                                    byz.A01 = abstractC01033pi.A1B();
                                    break;
                                }
                                break;
                            case 208888189:
                                if (A1C.equals(4YT.A00(462))) {
                                    byz.A0D = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 277108806:
                                if (A1C.equals(DKB.A00(14))) {
                                    byz.A00 = abstractC01033pi.A11();
                                    break;
                                }
                                break;
                            case 455204194:
                                if (A1C.equals("shipping_provider")) {
                                    byz.A07 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 624279747:
                                if (A1C.equals("conversion_type")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    byz.A02 = A03;
                                    C1pq.A08("conversionType", A03);
                                    break;
                                }
                                break;
                            case 928726729:
                                if (A1C.equals("icebreaker_message")) {
                                    byz.A05 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1108728155:
                                if (A1C.equals("currency_code")) {
                                    String A032 = AbstractC11224vw.A03(abstractC01033pi);
                                    byz.A03 = A032;
                                    C1pq.A08("currencyCode", A032);
                                    break;
                                }
                                break;
                            case 1175371562:
                                if (A1C.equals("upsell_description")) {
                                    byz.A0A = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1363517698:
                                if (A1C.equals("trigger_id")) {
                                    byz.A09 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1548979745:
                                if (A1C.equals("icebreaker_key")) {
                                    byz.A04 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1628467514:
                                if (A1C.equals("page_reply")) {
                                    byz.A06 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AdsConversionsQPData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AdsConversionsQPData(byz);
        }
    }

    /* loaded from: AdsConversionsQPData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            AdsConversionsQPData adsConversionsQPData = (AdsConversionsQPData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "conversion_type", adsConversionsQPData.A02);
            double d = adsConversionsQPData.A00;
            r302.A0o(DKB.A00(14));
            r302.A0d(d);
            AbstractC11224vw.A0D(r302, "currency_code", adsConversionsQPData.A03);
            AbstractC11224vw.A0D(r302, "icebreaker_key", adsConversionsQPData.A04);
            AbstractC11224vw.A0D(r302, "icebreaker_message", adsConversionsQPData.A05);
            boolean z = adsConversionsQPData.A0F;
            r302.A0o("is_eligible");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "page_reply", adsConversionsQPData.A06);
            AbstractC11224vw.A0D(r302, "shipping_provider", adsConversionsQPData.A07);
            long j = adsConversionsQPData.A01;
            r302.A0o("timestamp");
            r302.A0g(j);
            AbstractC11224vw.A0D(r302, 4YT.A00(190), adsConversionsQPData.A08);
            AbstractC11224vw.A0D(r302, "trigger_id", adsConversionsQPData.A09);
            AbstractC11224vw.A0D(r302, "upsell_description", adsConversionsQPData.A0A);
            AbstractC11224vw.A0D(r302, 4YT.A00(460), adsConversionsQPData.A0B);
            AbstractC11224vw.A0D(r302, 4YT.A00(461), adsConversionsQPData.A0C);
            AbstractC11224vw.A0D(r302, 4YT.A00(462), adsConversionsQPData.A0D);
            AbstractC11224vw.A0D(r302, "upsell_title", adsConversionsQPData.A0E);
            r302.A0Y();
        }
    }

    public AdsConversionsQPData(Byz byz) {
        String str = byz.A02;
        C1pq.A08(AbE.A00(ActionId.NOTIFY_SUBSCRIBERS), str);
        this.A02 = str;
        this.A00 = byz.A00;
        String str2 = byz.A03;
        C1pq.A08(7zK.A00(26), str2);
        this.A03 = str2;
        this.A04 = byz.A04;
        this.A05 = byz.A05;
        this.A0F = byz.A0F;
        this.A06 = byz.A06;
        this.A07 = byz.A07;
        this.A01 = byz.A01;
        this.A08 = byz.A08;
        this.A09 = byz.A09;
        this.A0A = byz.A0A;
        this.A0B = byz.A0B;
        this.A0C = byz.A0C;
        this.A0D = byz.A0D;
        this.A0E = byz.A0E;
    }

    public AdsConversionsQPData(Parcel parcel) {
        getClass().getClassLoader();
        this.A02 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A03 = parcel.readString();
        String str = null;
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
        this.A0F = parcel.readInt() != 1 ? false : true;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        this.A0D = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0E = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdsConversionsQPData)) {
                return false;
            }
            AdsConversionsQPData adsConversionsQPData = (AdsConversionsQPData) obj;
            if (!11T.A0O(this.A02, adsConversionsQPData.A02) || this.A00 != adsConversionsQPData.A00 || !11T.A0O(this.A03, adsConversionsQPData.A03) || !11T.A0O(this.A04, adsConversionsQPData.A04) || !11T.A0O(this.A05, adsConversionsQPData.A05) || this.A0F != adsConversionsQPData.A0F || !11T.A0O(this.A06, adsConversionsQPData.A06) || !11T.A0O(this.A07, adsConversionsQPData.A07) || this.A01 != adsConversionsQPData.A01 || !11T.A0O(this.A08, adsConversionsQPData.A08) || !11T.A0O(this.A09, adsConversionsQPData.A09) || !11T.A0O(this.A0A, adsConversionsQPData.A0A) || !11T.A0O(this.A0B, adsConversionsQPData.A0B) || !11T.A0O(this.A0C, adsConversionsQPData.A0C) || !11T.A0O(this.A0D, adsConversionsQPData.A0D) || !11T.A0O(this.A0E, adsConversionsQPData.A0E)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A01(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A00(this.A00, C1pq.A03(this.A02))))), this.A0F))), this.A01))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeInt(this.A0F ? 1 : 0);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeLong(this.A01);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
    }
}
