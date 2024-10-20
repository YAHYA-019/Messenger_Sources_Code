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
import X.H9K;
import X.Hsp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLStoryCardTypes;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageReshareContentSticker.class */
public final class MontageReshareContentSticker implements Parcelable {
    public static volatile GraphQLStoryCardTypes A0A;
    public static volatile H9K A0B;
    public static final Parcelable.Creator CREATOR = CST.A00(17);
    public final MontageStickerOverlayBounds A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final GraphQLStoryCardTypes A07;
    public final H9K A08;
    public final Set A09;

    /* loaded from: MontageReshareContentSticker$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Hsp hsp = new Hsp();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2034615233:
                                if (A1C.equals("story_card_type")) {
                                    hsp.A00((GraphQLStoryCardTypes) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLStoryCardTypes.class));
                                    break;
                                }
                                break;
                            case -1650554971:
                                if (A1C.equals("actor_id")) {
                                    hsp.A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1340245355:
                                if (A1C.equals("actor_name")) {
                                    hsp.A04 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -497512794:
                                if (A1C.equals("actor_type_name")) {
                                    hsp.A05 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -388807511:
                                if (A1C.equals("content_url")) {
                                    hsp.A07 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 110371416:
                                if (A1C.equals("title")) {
                                    hsp.A08 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 264552097:
                                if (A1C.equals("content_id")) {
                                    hsp.A06 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 831846208:
                                if (A1C.equals(TraceFieldType.ContentType)) {
                                    hsp.A01((H9K) AbstractC11224vw.A02(abstractC01033pi, c27t, H9K.class));
                                    break;
                                }
                                break;
                            case 1900313591:
                                if (A1C.equals("sticker_bounds")) {
                                    hsp.A02 = (MontageStickerOverlayBounds) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageStickerOverlayBounds.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageReshareContentSticker.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageReshareContentSticker(hsp);
        }
    }

    /* loaded from: MontageReshareContentSticker$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageReshareContentSticker montageReshareContentSticker = (MontageReshareContentSticker) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "actor_id", montageReshareContentSticker.A01);
            AbstractC11224vw.A0D(r302, "actor_name", montageReshareContentSticker.A02);
            AbstractC11224vw.A0D(r302, "actor_type_name", montageReshareContentSticker.A03);
            AbstractC11224vw.A0D(r302, "content_id", montageReshareContentSticker.A04);
            AbstractC11224vw.A05(r302, c26c, montageReshareContentSticker.A01(), TraceFieldType.ContentType);
            AbstractC11224vw.A0D(r302, "content_url", montageReshareContentSticker.A05);
            AbstractC11224vw.A05(r302, c26c, montageReshareContentSticker.A00, "sticker_bounds");
            AbstractC11224vw.A05(r302, c26c, montageReshareContentSticker.A00(), "story_card_type");
            AbstractC11224vw.A0D(r302, "title", montageReshareContentSticker.A06);
            r302.A0Y();
        }
    }

    public MontageReshareContentSticker(Hsp hsp) {
        this.A01 = hsp.A03;
        this.A02 = hsp.A04;
        this.A03 = hsp.A05;
        this.A04 = hsp.A06;
        this.A08 = hsp.A01;
        this.A05 = hsp.A07;
        this.A00 = hsp.A02;
        this.A07 = hsp.A00;
        this.A06 = hsp.A08;
        this.A09 = Collections.unmodifiableSet(hsp.A09);
    }

    public MontageReshareContentSticker(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        GraphQLStoryCardTypes graphQLStoryCardTypes = null;
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
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = H9K.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MontageStickerOverlayBounds) parcel.readParcelable(A0e);
        }
        this.A07 = parcel.readInt() != 0 ? GraphQLStoryCardTypes.values()[parcel.readInt()] : graphQLStoryCardTypes;
        this.A06 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public GraphQLStoryCardTypes A00() {
        if (this.A09.contains("storyCardType")) {
            return this.A07;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = GraphQLStoryCardTypes.A02;
                }
            }
        }
        return A0A;
    }

    public H9K A01() {
        if (this.A09.contains("contentType")) {
            return this.A08;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = H9K.A01;
                }
            }
        }
        return A0B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageReshareContentSticker)) {
                return false;
            }
            MontageReshareContentSticker montageReshareContentSticker = (MontageReshareContentSticker) obj;
            if (!11T.A0O(this.A01, montageReshareContentSticker.A01) || !11T.A0O(this.A02, montageReshareContentSticker.A02) || !11T.A0O(this.A03, montageReshareContentSticker.A03) || !11T.A0O(this.A04, montageReshareContentSticker.A04) || A01() != montageReshareContentSticker.A01() || !11T.A0O(this.A05, montageReshareContentSticker.A05) || !11T.A0O(this.A00, montageReshareContentSticker.A00) || A00() != montageReshareContentSticker.A00() || !11T.A0O(this.A06, montageReshareContentSticker.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A00, C1pq.A04(this.A05, (C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))) * 31) + C3o5.A03(A01())));
        GraphQLStoryCardTypes A00 = A00();
        if (A00 != null) {
            i = A00.ordinal();
        }
        return C1pq.A04(this.A06, (A04 * 31) + i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        C3o5.A0e(parcel, this.A08);
        1BL.A13(parcel, this.A05);
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0e(parcel, this.A07);
        1BL.A13(parcel, this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
