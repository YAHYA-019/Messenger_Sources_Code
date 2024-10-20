package com.facebook.composer.stories.camerarollinspiration.mediaprovider.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: CollageContext.class */
public final class CollageContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(9);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: CollageContext$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = "";
            ImmutableList of = ImmutableList.of();
            String str2 = str;
            String str3 = str;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2126711345:
                                if (A1C.equals("selection_rule")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("selectionRule", str2);
                                    break;
                                }
                                break;
                            case -1573629589:
                                if (A1C.equals("start_date")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("startDate", str3);
                                    break;
                                }
                                break;
                            case 1725067410:
                                if (A1C.equals("end_date")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("endDate", str);
                                    break;
                                }
                                break;
                            case 1939621913:
                                if (A1C.equals("media_list")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, MediaData.class);
                                    C1pq.A08("mediaList", of);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, CollageContext.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new CollageContext(of, str, str2, str3);
        }
    }

    /* loaded from: CollageContext$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            CollageContext collageContext = (CollageContext) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "end_date", collageContext.A01);
            AbstractC11224vw.A06(r302, c26c, "media_list", collageContext.A00);
            AbstractC11224vw.A0D(r302, "selection_rule", collageContext.A02);
            AbstractC11224vw.A0D(r302, "start_date", collageContext.A03);
            r302.A0Y();
        }
    }

    public CollageContext(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        int readInt = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = ImmutableList.copyOf(mediaDataArr);
                this.A02 = parcel.readString();
                this.A03 = parcel.readString();
                return;
            }
            i = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i2);
        }
    }

    public CollageContext(ImmutableList immutableList, String str, String str2, String str3) {
        C1pq.A08("endDate", str);
        this.A01 = str;
        C1pq.A08("mediaList", immutableList);
        this.A00 = immutableList;
        C1pq.A08("selectionRule", str2);
        this.A02 = str2;
        C1pq.A08("startDate", str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CollageContext)) {
                return false;
            }
            CollageContext collageContext = (CollageContext) obj;
            if (!11T.A0O(this.A01, collageContext.A01) || !11T.A0O(this.A00, collageContext.A00) || !11T.A0O(this.A02, collageContext.A02) || !11T.A0O(this.A03, collageContext.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
