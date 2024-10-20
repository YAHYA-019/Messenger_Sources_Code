package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationTextStyle.class */
public final class InspirationTextStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(55);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    /* loaded from: InspirationTextStyle$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            Integer num = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            String str = "default";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        switch (A1Y.hashCode()) {
                            case -1206692474:
                                if (A1Y.equals("is_blocking_color_inverted")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1023723150:
                                if (A1Y.equals("text_blocking_type")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("textBlockingType", str);
                                    break;
                                }
                                break;
                            case 232784224:
                                if (A1Y.equals("text_blocking_color_override")) {
                                    num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 909085312:
                                if (A1Y.equals("text_blocking_vertical_padding")) {
                                    i3 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1372058244:
                                if (A1Y.equals("text_blocking_corner_radius")) {
                                    i = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1759212334:
                                if (A1Y.equals("text_blocking_horizontal_padding")) {
                                    i2 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationTextStyle.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationTextStyle(num, str, i, i2, i3, z);
        }
    }

    /* loaded from: InspirationTextStyle$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationTextStyle inspirationTextStyle = (InspirationTextStyle) obj;
            r302.A0b();
            boolean z = inspirationTextStyle.A05;
            r302.A0o("is_blocking_color_inverted");
            r302.A0v(z);
            AbstractC11224vw.A0B(r302, inspirationTextStyle.A03, "text_blocking_color_override");
            int i = inspirationTextStyle.A00;
            r302.A0o("text_blocking_corner_radius");
            r302.A0f(i);
            int i2 = inspirationTextStyle.A01;
            r302.A0o("text_blocking_horizontal_padding");
            r302.A0f(i2);
            AbstractC11224vw.A0D(r302, "text_blocking_type", inspirationTextStyle.A04);
            int i3 = inspirationTextStyle.A02;
            r302.A0o("text_blocking_vertical_padding");
            r302.A0f(i3);
            r302.A0Y();
        }
    }

    public InspirationTextStyle(Parcel parcel) {
        AbG.A1X(this);
        this.A05 = AbN.A1U(parcel);
        this.A03 = parcel.readInt() == 0 ? null : AbI.A0z(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A02 = parcel.readInt();
    }

    public InspirationTextStyle(Integer num, String str, int i, int i2, int i3, boolean z) {
        this.A05 = z;
        this.A03 = num;
        this.A00 = i;
        this.A01 = i2;
        C1pq.A08("textBlockingType", str);
        this.A04 = str;
        this.A02 = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationTextStyle)) {
                return false;
            }
            InspirationTextStyle inspirationTextStyle = (InspirationTextStyle) obj;
            if (this.A05 != inspirationTextStyle.A05 || !11T.A0O(this.A03, inspirationTextStyle.A03) || this.A00 != inspirationTextStyle.A00 || this.A01 != inspirationTextStyle.A01 || !11T.A0O(this.A04, inspirationTextStyle.A04) || this.A02 != inspirationTextStyle.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A04, (((C1pq.A04(this.A03, C1pq.A05(this.A05)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(AbN.A01(parcel, this.A03));
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A02);
    }
}
