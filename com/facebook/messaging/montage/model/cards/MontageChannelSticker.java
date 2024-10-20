package com.facebook.messaging.montage.model.cards;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CST;
import X.GOp;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageChannelSticker.class */
public final class MontageChannelSticker implements Parcelable {
    public static volatile MontageStickerOverlayBounds A07;
    public static final Parcelable.Creator CREATOR = CST.A00(9);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final MontageStickerOverlayBounds A05;
    public final Set A06;

    /* loaded from: MontageChannelSticker$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            MontageStickerOverlayBounds montageStickerOverlayBounds = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            HashSet A0v = AnonymousClass001.A0v();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1562235024:
                                if (A1C.equals("thread_id")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1132110017:
                                if (A1C.equals("thread_member_count")) {
                                    num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case -832833298:
                                if (A1C.equals("montage_sticker_overlay_bounds")) {
                                    montageStickerOverlayBounds = (MontageStickerOverlayBounds) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageStickerOverlayBounds.class);
                                    C1pq.A08("montageStickerOverlayBounds", montageStickerOverlayBounds);
                                    A0v = 4YV.A10("montageStickerOverlayBounds", A0v);
                                    break;
                                }
                                break;
                            case -235130553:
                                if (A1C.equals("thread_description")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 217141241:
                                if (A1C.equals("thread_picture_url")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1930845088:
                                if (A1C.equals("thread_name")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageChannelSticker.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageChannelSticker(montageStickerOverlayBounds, num, str, str2, str3, str4, A0v);
        }
    }

    /* loaded from: MontageChannelSticker$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageChannelSticker montageChannelSticker = (MontageChannelSticker) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, montageChannelSticker.A00(), "montage_sticker_overlay_bounds");
            AbstractC11224vw.A0D(r302, "thread_description", montageChannelSticker.A01);
            AbstractC11224vw.A0D(r302, "thread_id", montageChannelSticker.A02);
            AbstractC11224vw.A0B(r302, montageChannelSticker.A00, "thread_member_count");
            AbstractC11224vw.A0D(r302, "thread_name", montageChannelSticker.A03);
            AbstractC11224vw.A0D(r302, "thread_picture_url", montageChannelSticker.A04);
            r302.A0Y();
        }
    }

    public MontageChannelSticker(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (MontageStickerOverlayBounds) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Integer.valueOf(parcel.readInt());
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public MontageChannelSticker(MontageStickerOverlayBounds montageStickerOverlayBounds, Integer num, String str, String str2, String str3, String str4, Set set) {
        this.A05 = montageStickerOverlayBounds;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public MontageStickerOverlayBounds A00() {
        if (this.A06.contains("montageStickerOverlayBounds")) {
            return this.A05;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = GOp.A0M();
                }
            }
        }
        return A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageChannelSticker)) {
                return false;
            }
            MontageChannelSticker montageChannelSticker = (MontageChannelSticker) obj;
            if (!11T.A0O(A00(), montageChannelSticker.A00()) || !11T.A0O(this.A01, montageChannelSticker.A01) || !11T.A0O(this.A02, montageChannelSticker.A02) || !11T.A0O(this.A00, montageChannelSticker.A00) || !11T.A0O(this.A03, montageChannelSticker.A03) || !11T.A0O(this.A04, montageChannelSticker.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(A00()))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A05, i);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        C3o5.A0f(parcel, this.A00);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
