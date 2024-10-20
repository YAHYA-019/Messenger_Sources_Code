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
import X.Hpo;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageLinkSticker.class */
public final class MontageLinkSticker implements Parcelable {
    public static volatile MontageStickerOverlayBounds A06;
    public static final Parcelable.Creator CREATOR = CST.A00(15);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final MontageStickerOverlayBounds A04;
    public final Set A05;

    /* loaded from: MontageLinkSticker$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            String A03;
            Hpo hpo = new Hpo();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -832833298:
                                if (A1C.equals("montage_sticker_overlay_bounds")) {
                                    hpo.A00((MontageStickerOverlayBounds) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageStickerOverlayBounds.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 116079:
                                str = "url";
                                if (A1C.equals(str)) {
                                    A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    hpo.A04 = A03;
                                    C1pq.A08(str, A03);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 109780401:
                                str = "style";
                                if (A1C.equals(str)) {
                                    A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    hpo.A03 = A03;
                                    C1pq.A08(str, A03);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1108410966:
                                if (A1C.equals("integrity_context_title")) {
                                    hpo.A02 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1806572395:
                                if (A1C.equals("integrity_context_identifier")) {
                                    hpo.A01 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            default:
                                abstractC01033pi.A20();
                                break;
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageLinkSticker.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageLinkSticker(hpo);
        }
    }

    /* loaded from: MontageLinkSticker$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageLinkSticker montageLinkSticker = (MontageLinkSticker) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "integrity_context_identifier", montageLinkSticker.A00);
            AbstractC11224vw.A0D(r302, "integrity_context_title", montageLinkSticker.A01);
            AbstractC11224vw.A05(r302, c26c, montageLinkSticker.A00(), "montage_sticker_overlay_bounds");
            AbstractC11224vw.A0D(r302, "style", montageLinkSticker.A02);
            AbstractC11224vw.A0D(r302, "url", montageLinkSticker.A03);
            r302.A0Y();
        }
    }

    public MontageLinkSticker(Hpo hpo) {
        this.A00 = hpo.A01;
        this.A01 = hpo.A02;
        this.A04 = hpo.A00;
        String str = hpo.A03;
        C1pq.A08("style", str);
        this.A02 = str;
        String str2 = hpo.A04;
        C1pq.A08("url", str2);
        this.A03 = str2;
        this.A05 = Collections.unmodifiableSet(hpo.A05);
    }

    public MontageLinkSticker(Parcel parcel) {
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
        this.A04 = parcel.readInt() != 0 ? (MontageStickerOverlayBounds) parcel.readParcelable(A0e) : montageStickerOverlayBounds;
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public MontageLinkSticker(MontageStickerOverlayBounds montageStickerOverlayBounds, String str, String str2, String str3, Set set) {
        this.A00 = str;
        this.A01 = null;
        this.A04 = montageStickerOverlayBounds;
        C1pq.A08("style", str2);
        this.A02 = str2;
        C1pq.A08("url", str3);
        this.A03 = str3;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public MontageStickerOverlayBounds A00() {
        if (this.A05.contains("montageStickerOverlayBounds")) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = GOp.A0M();
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageLinkSticker)) {
                return false;
            }
            MontageLinkSticker montageLinkSticker = (MontageLinkSticker) obj;
            if (!11T.A0O(this.A00, montageLinkSticker.A00) || !11T.A0O(this.A01, montageLinkSticker.A01) || !11T.A0O(A00(), montageLinkSticker.A00()) || !11T.A0O(this.A02, montageLinkSticker.A02) || !11T.A0O(this.A03, montageLinkSticker.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        C3o5.A0d(parcel, this.A04, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
