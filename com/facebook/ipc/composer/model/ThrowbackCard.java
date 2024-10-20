package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.7zO;
import X.AbG;
import X.AbH;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import X.DKG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: ThrowbackCard.class */
public final class ThrowbackCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(17);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: ThrowbackCard$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Long l = null;
            String str = null;
            String str2 = null;
            ImmutableList of = ImmutableList.of();
            ImmutableList of2 = ImmutableList.of();
            String str3 = "unknown";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1708662769:
                                if (A1C.equals("source_media_i_d")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1027245013:
                                if (A1C.equals("media_items_to_upload")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, MediaData.class);
                                    C1pq.A08("mediaItemsToUpload", of);
                                    break;
                                }
                                break;
                            case -896505829:
                                if (A1C.equals(Property.SYMBOL_Z_ORDER_SOURCE)) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(Property.SYMBOL_Z_ORDER_SOURCE, str3);
                                    break;
                                }
                                break;
                            case -564627676:
                                if (A1C.equals("remote_media_ids")) {
                                    of2 = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    C1pq.A08("remoteMediaIds", of2);
                                    break;
                                }
                                break;
                            case 3076010:
                                if (A1C.equals("data")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 2083788458:
                                if (A1C.equals("campaign_id")) {
                                    l = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ThrowbackCard.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ThrowbackCard(of, of2, l, str, str3, str2);
        }
    }

    /* loaded from: ThrowbackCard$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ThrowbackCard throwbackCard = (ThrowbackCard) obj;
            r302.A0b();
            AbstractC11224vw.A0C(r302, throwbackCard.A02, "campaign_id");
            AbstractC11224vw.A0D(r302, "data", throwbackCard.A03);
            AbstractC11224vw.A06(r302, c26c, "media_items_to_upload", throwbackCard.A00);
            AbstractC11224vw.A06(r302, c26c, "remote_media_ids", throwbackCard.A01);
            AbstractC11224vw.A0D(r302, Property.SYMBOL_Z_ORDER_SOURCE, throwbackCard.A04);
            AbstractC11224vw.A0D(r302, "source_media_i_d", throwbackCard.A05);
            r302.A0Y();
        }
    }

    public ThrowbackCard(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = 7zO.A0j(parcel);
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        int readInt = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i2);
        }
        this.A00 = ImmutableList.copyOf(mediaDataArr);
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        while (i < readInt2) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A01 = ImmutableList.copyOf(strArr);
        this.A04 = parcel.readString();
        this.A05 = C3o5.A0O(parcel);
    }

    public ThrowbackCard(ImmutableList immutableList, ImmutableList immutableList2, Long l, String str, String str2, String str3) {
        this.A02 = l;
        this.A03 = str;
        C1pq.A08("mediaItemsToUpload", immutableList);
        this.A00 = immutableList;
        C1pq.A08("remoteMediaIds", immutableList2);
        this.A01 = immutableList2;
        C1pq.A08(Property.SYMBOL_Z_ORDER_SOURCE, str2);
        this.A04 = str2;
        this.A05 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThrowbackCard)) {
                return false;
            }
            ThrowbackCard throwbackCard = (ThrowbackCard) obj;
            if (!11T.A0O(this.A02, throwbackCard.A02) || !11T.A0O(this.A03, throwbackCard.A03) || !11T.A0O(this.A00, throwbackCard.A00) || !11T.A0O(this.A01, throwbackCard.A01) || !11T.A0O(this.A04, throwbackCard.A04) || !11T.A0O(this.A05, throwbackCard.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0g(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
    }
}
