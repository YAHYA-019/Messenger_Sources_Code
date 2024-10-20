package com.facebook.messaging.montage.model.cards;

import X.0Q8;
import X.11T;
import X.28Q;
import X.4YV;
import X.4YW;
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
import X.GOm;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageResharedFbShortsSticker.class */
public final class MontageResharedFbShortsSticker implements Parcelable {
    public static volatile MontageStickerOverlayBounds A03;
    public static final Parcelable.Creator CREATOR = CST.A00(18);
    public final String A00;
    public final MontageStickerOverlayBounds A01;
    public final Set A02;

    /* loaded from: MontageResharedFbShortsSticker$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            MontageStickerOverlayBounds montageStickerOverlayBounds = null;
            HashSet A0v = AnonymousClass001.A0v();
            String str = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != -832833298) {
                            if (hashCode == 116079 && A1C.equals("url")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("url", str);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals(GOm.A00(76))) {
                                montageStickerOverlayBounds = (MontageStickerOverlayBounds) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageStickerOverlayBounds.class);
                                C1pq.A08("montageStickerOverlayBounds", montageStickerOverlayBounds);
                                A0v = 4YV.A10("montageStickerOverlayBounds", A0v);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageResharedFbShortsSticker.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageResharedFbShortsSticker(montageStickerOverlayBounds, str, A0v);
        }
    }

    /* loaded from: MontageResharedFbShortsSticker$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageResharedFbShortsSticker montageResharedFbShortsSticker = (MontageResharedFbShortsSticker) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, montageResharedFbShortsSticker.A00(), GOm.A00(76));
            AbstractC11224vw.A0D(r302, "url", montageResharedFbShortsSticker.A00);
            r302.A0Y();
        }
    }

    public MontageResharedFbShortsSticker(Parcel parcel) {
        this.A01 = parcel.readInt() == 0 ? null : (MontageStickerOverlayBounds) parcel.readParcelable(4YV.A0e(this));
        this.A00 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public MontageResharedFbShortsSticker(MontageStickerOverlayBounds montageStickerOverlayBounds, String str, Set set) {
        this.A01 = montageStickerOverlayBounds;
        C1pq.A08("url", str);
        this.A00 = str;
        this.A02 = Collections.unmodifiableSet(set);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds$MontageStickerOverlayBoundsBuilder, java.lang.Object] */
    public MontageStickerOverlayBounds A00() {
        if (this.A02.contains("montageStickerOverlayBounds")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = new Object().A00();
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageResharedFbShortsSticker)) {
                return false;
            }
            MontageResharedFbShortsSticker montageResharedFbShortsSticker = (MontageResharedFbShortsSticker) obj;
            if (!11T.A0O(A00(), montageResharedFbShortsSticker.A00()) || !11T.A0O(this.A00, montageResharedFbShortsSticker.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A01, i);
        parcel.writeString(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
