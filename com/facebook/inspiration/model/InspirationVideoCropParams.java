package com.facebook.inspiration.model;

import X.0Q8;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbM;
import X.AbstractC01033pi;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationVideoCropParams.class */
public final class InspirationVideoCropParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(71);
    public final double A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;

    /* loaded from: InspirationVideoCropParams$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            double d = 0.0d;
            float f7 = 0.0f;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        switch (A1Y.hashCode()) {
                            case -1518229669:
                                if (A1Y.equals("top_percent")) {
                                    f7 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -755984436:
                                if (A1Y.equals("offset_x")) {
                                    f4 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -755984435:
                                if (A1Y.equals("offset_y")) {
                                    f5 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -443960307:
                                if (A1Y.equals("left_percent")) {
                                    f3 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -233895069:
                                if (A1Y.equals("crop_box_width")) {
                                    f2 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 109250890:
                                if (A1Y.equals("scale")) {
                                    f6 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 906192682:
                                if (A1Y.equals("crop_box_height")) {
                                    f = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 1590012519:
                                if (A1Y.equals("timestamp_us")) {
                                    d = abstractC01033pi.A11();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationVideoCropParams.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationVideoCropParams(d, f, f2, f3, f4, f5, f6, f7);
        }
    }

    /* loaded from: InspirationVideoCropParams$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationVideoCropParams inspirationVideoCropParams = (InspirationVideoCropParams) obj;
            r302.A0b();
            float f = inspirationVideoCropParams.A01;
            r302.A0o("crop_box_height");
            r302.A0e(f);
            float f2 = inspirationVideoCropParams.A02;
            r302.A0o("crop_box_width");
            r302.A0e(f2);
            float f3 = inspirationVideoCropParams.A03;
            r302.A0o("left_percent");
            r302.A0e(f3);
            float f4 = inspirationVideoCropParams.A04;
            r302.A0o("offset_x");
            r302.A0e(f4);
            float f5 = inspirationVideoCropParams.A05;
            r302.A0o("offset_y");
            r302.A0e(f5);
            float f6 = inspirationVideoCropParams.A06;
            r302.A0o("scale");
            r302.A0e(f6);
            double d = inspirationVideoCropParams.A00;
            r302.A0o("timestamp_us");
            r302.A0d(d);
            float f7 = inspirationVideoCropParams.A07;
            r302.A0o("top_percent");
            r302.A0e(f7);
            r302.A0Y();
        }
    }

    public InspirationVideoCropParams(double d, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A05 = f5;
        this.A06 = f6;
        this.A00 = d;
        this.A07 = f7;
    }

    public InspirationVideoCropParams(Parcel parcel) {
        AbG.A1X(this);
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readFloat();
        this.A05 = parcel.readFloat();
        this.A06 = parcel.readFloat();
        this.A00 = parcel.readDouble();
        this.A07 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoCropParams)) {
                return false;
            }
            InspirationVideoCropParams inspirationVideoCropParams = (InspirationVideoCropParams) obj;
            if (this.A01 != inspirationVideoCropParams.A01 || this.A02 != inspirationVideoCropParams.A02 || this.A03 != inspirationVideoCropParams.A03 || this.A04 != inspirationVideoCropParams.A04 || this.A05 != inspirationVideoCropParams.A05 || this.A06 != inspirationVideoCropParams.A06 || this.A00 != inspirationVideoCropParams.A00 || this.A07 != inspirationVideoCropParams.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(C1pq.A00(this.A00, AbM.A00(AbM.A00(AbM.A00(AbM.A00(AbM.A00(Float.floatToIntBits(this.A01) + 31, this.A02), this.A03), this.A04), this.A05), this.A06)), this.A07);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
        parcel.writeFloat(this.A06);
        parcel.writeDouble(this.A00);
        parcel.writeFloat(this.A07);
    }
}
