package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.28Q;
import X.5BB;
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
import X.DKF;
import X.DKG;
import X.DKH;
import X.EPI;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationOverlayGenericInteractiveStickerInfo.class */
public final class InspirationOverlayGenericInteractiveStickerInfo implements Parcelable {
    public static volatile EPI A03;
    public static volatile InspirationOverlayPosition A04;
    public static final Parcelable.Creator CREATOR = FKc.A00(28);
    public final EPI A00;
    public final InspirationOverlayPosition A01;
    public final Set A02;

    /* loaded from: InspirationOverlayGenericInteractiveStickerInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            InspirationOverlayPosition inspirationOverlayPosition = null;
            EPI epi = null;
            HashSet A0v = AnonymousClass001.A0v();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != -2030994180) {
                            if (hashCode == -561815496 && A1C.equals("overlay_position")) {
                                inspirationOverlayPosition = (InspirationOverlayPosition) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayPosition.class);
                                str = "overlayPosition";
                                C1pq.A08(str, inspirationOverlayPosition);
                                if (!A0v.contains(str)) {
                                    A0v = AbF.A1E(A0v);
                                    A0v.add(str);
                                }
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("sticker_type")) {
                                epi = (EPI) AbstractC11224vw.A02(abstractC01033pi, c27t, EPI.class);
                                str = "stickerType";
                                C1pq.A08(str, epi);
                                if (!A0v.contains(str)) {
                                    A0v = AbF.A1E(A0v);
                                    A0v.add(str);
                                }
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationOverlayGenericInteractiveStickerInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationOverlayGenericInteractiveStickerInfo(epi, inspirationOverlayPosition, A0v);
        }
    }

    /* loaded from: InspirationOverlayGenericInteractiveStickerInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationOverlayGenericInteractiveStickerInfo inspirationOverlayGenericInteractiveStickerInfo = (InspirationOverlayGenericInteractiveStickerInfo) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayGenericInteractiveStickerInfo.A01(), "overlay_position");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayGenericInteractiveStickerInfo.A00(), "sticker_type");
            r302.A0Y();
        }
    }

    public InspirationOverlayGenericInteractiveStickerInfo(EPI epi, InspirationOverlayPosition inspirationOverlayPosition, Set set) {
        this.A01 = inspirationOverlayPosition;
        this.A00 = epi;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayGenericInteractiveStickerInfo(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) != 0 ? DKG.A0W(parcel) : null;
        this.A00 = DKH.A0Q(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public EPI A00() {
        if (this.A02.contains("stickerType")) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = EPI.A13;
                }
            }
        }
        return A03;
    }

    public InspirationOverlayPosition A01() {
        if (DKF.A1b(this.A02)) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = DKG.A0V();
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
            if (!(obj instanceof InspirationOverlayGenericInteractiveStickerInfo)) {
                return false;
            }
            InspirationOverlayGenericInteractiveStickerInfo inspirationOverlayGenericInteractiveStickerInfo = (InspirationOverlayGenericInteractiveStickerInfo) obj;
            if (!11T.A0O(A01(), inspirationOverlayGenericInteractiveStickerInfo.A01()) || A00() != inspirationOverlayGenericInteractiveStickerInfo.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A032 = C1pq.A03(A01());
        return (A032 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0z(parcel, this.A01, i);
        C3o5.A0e(parcel, this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
