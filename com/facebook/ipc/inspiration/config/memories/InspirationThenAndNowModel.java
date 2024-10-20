package com.facebook.ipc.inspiration.config.memories;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.AbH;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationThenAndNowModel.class */
public final class InspirationThenAndNowModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(36);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: InspirationThenAndNowModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList immutableList = null;
            ImmutableList immutableList2 = null;
            String str = null;
            String str2 = null;
            String str3 = "";
            String str4 = str3;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        switch (A1Y.hashCode()) {
                            case -1652324789:
                                if (A1Y.equals("then_photo_blurred_url")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1588292313:
                                if (A1Y.equals("then_photo_timestamp")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("thenPhotoTimestamp", str3);
                                    break;
                                }
                                break;
                            case -1244683553:
                                if (A1Y.equals("then_photo_i_d")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1244671427:
                                if (A1Y.equals("then_photo_uri")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("thenPhotoUri", str4);
                                    break;
                                }
                                break;
                            case -1185863658:
                                if (A1Y.equals("ai_frames_ids")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    break;
                                }
                                break;
                            case 1893303110:
                                if (A1Y.equals("ai_frames_urls")) {
                                    immutableList2 = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationThenAndNowModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationThenAndNowModel(immutableList, immutableList2, str, str2, str3, str4);
        }
    }

    /* loaded from: InspirationThenAndNowModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationThenAndNowModel inspirationThenAndNowModel = (InspirationThenAndNowModel) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "ai_frames_ids", inspirationThenAndNowModel.A00);
            AbstractC11224vw.A06(r302, c26c, "ai_frames_urls", inspirationThenAndNowModel.A01);
            AbstractC11224vw.A0D(r302, "then_photo_blurred_url", inspirationThenAndNowModel.A02);
            AbstractC11224vw.A0D(r302, "then_photo_i_d", inspirationThenAndNowModel.A03);
            AbstractC11224vw.A0D(r302, "then_photo_timestamp", inspirationThenAndNowModel.A04);
            AbstractC11224vw.A0D(r302, "then_photo_uri", inspirationThenAndNowModel.A05);
            r302.A0Y();
        }
    }

    public InspirationThenAndNowModel(Parcel parcel) {
        int i = 0;
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            while (i < readInt2) {
                i = AbH.A00(parcel, strArr2, i);
            }
            this.A01 = ImmutableList.copyOf(strArr2);
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C3o5.A0O(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public InspirationThenAndNowModel(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4) {
        this.A00 = immutableList;
        this.A01 = immutableList2;
        this.A02 = str;
        this.A03 = str2;
        C1pq.A08("thenPhotoTimestamp", str3);
        this.A04 = str3;
        C1pq.A08("thenPhotoUri", str4);
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationThenAndNowModel)) {
                return false;
            }
            InspirationThenAndNowModel inspirationThenAndNowModel = (InspirationThenAndNowModel) obj;
            if (!11T.A0O(this.A00, inspirationThenAndNowModel.A00) || !11T.A0O(this.A01, inspirationThenAndNowModel.A01) || !11T.A0O(this.A02, inspirationThenAndNowModel.A02) || !11T.A0O(this.A03, inspirationThenAndNowModel.A03) || !11T.A0O(this.A04, inspirationThenAndNowModel.A04) || !11T.A0O(this.A05, inspirationThenAndNowModel.A05)) {
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
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }
}
