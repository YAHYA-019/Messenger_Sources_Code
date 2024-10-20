package com.facebook.messaging.montage.model.cards;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.4YV;
import X.5BB;
import X.82M;
import X.AbF;
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
import X.Hg4;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageBloksSticker.class */
public final class MontageBloksSticker implements Parcelable {
    public static volatile MontageStickerOverlayBounds A04;
    public static final Parcelable.Creator CREATOR = new 82M(57);
    public final String A00;
    public final String A01;
    public final MontageStickerOverlayBounds A02;
    public final Set A03;

    /* loaded from: MontageBloksSticker$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Hg4 hg4 = new Hg4();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -832833298) {
                            if (A1C.equals("montage_sticker_overlay_bounds")) {
                                MontageStickerOverlayBounds montageStickerOverlayBounds = (MontageStickerOverlayBounds) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageStickerOverlayBounds.class);
                                hg4.A00 = montageStickerOverlayBounds;
                                C1pq.A08("montageStickerOverlayBounds", montageStickerOverlayBounds);
                                if (!hg4.A03.contains("montageStickerOverlayBounds")) {
                                    HashSet A1E = AbF.A1E(hg4.A03);
                                    hg4.A03 = A1E;
                                    A1E.add("montageStickerOverlayBounds");
                                }
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != 794783964) {
                            if (hashCode == 1886405885 && A1C.equals("bloks_sticker_style")) {
                                hg4.A02 = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("bloks_payload")) {
                                hg4.A01 = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageBloksSticker.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageBloksSticker(hg4);
        }
    }

    /* loaded from: MontageBloksSticker$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageBloksSticker montageBloksSticker = (MontageBloksSticker) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "bloks_payload", montageBloksSticker.A00);
            AbstractC11224vw.A0D(r302, "bloks_sticker_style", montageBloksSticker.A01);
            AbstractC11224vw.A05(r302, c26c, montageBloksSticker.A00(), "montage_sticker_overlay_bounds");
            r302.A0Y();
        }
    }

    public MontageBloksSticker(Hg4 hg4) {
        this.A00 = hg4.A01;
        this.A01 = hg4.A02;
        this.A02 = hg4.A00;
        this.A03 = Collections.unmodifiableSet(hg4.A03);
    }

    public MontageBloksSticker(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        MontageStickerOverlayBounds montageStickerOverlayBounds = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? (MontageStickerOverlayBounds) parcel.readParcelable(A0e) : montageStickerOverlayBounds;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public MontageBloksSticker(MontageStickerOverlayBounds montageStickerOverlayBounds, String str, String str2, Set set) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = montageStickerOverlayBounds;
        this.A03 = Collections.unmodifiableSet(set);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds$MontageStickerOverlayBoundsBuilder, java.lang.Object] */
    public MontageStickerOverlayBounds A00() {
        if (this.A03.contains("montageStickerOverlayBounds")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = new Object().A00();
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageBloksSticker)) {
                return false;
            }
            MontageBloksSticker montageBloksSticker = (MontageBloksSticker) obj;
            if (!11T.A0O(this.A00, montageBloksSticker.A00) || !11T.A0O(this.A01, montageBloksSticker.A01) || !11T.A0O(A00(), montageBloksSticker.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        C3o5.A0d(parcel, this.A02, i);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
