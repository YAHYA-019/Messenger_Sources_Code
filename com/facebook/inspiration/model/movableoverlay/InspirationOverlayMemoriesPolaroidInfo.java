package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
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
import X.DKF;
import X.DKG;
import X.DKH;
import X.DKI;
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

/* loaded from: InspirationOverlayMemoriesPolaroidInfo.class */
public final class InspirationOverlayMemoriesPolaroidInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A03;
    public static final Parcelable.Creator CREATOR = FKc.A00(30);
    public final int A00;
    public final InspirationOverlayPosition A01;
    public final Set A02;

    /* loaded from: InspirationOverlayMemoriesPolaroidInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            InspirationOverlayPosition inspirationOverlayPosition = null;
            int i = 0;
            HashSet A0v = AnonymousClass001.A0v();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != -561815496) {
                            if (hashCode == 55126294 && A1C.equals("timestamp")) {
                                i = abstractC01033pi.A1y();
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("overlay_position")) {
                                inspirationOverlayPosition = (InspirationOverlayPosition) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayPosition.class);
                                C1pq.A08("overlayPosition", inspirationOverlayPosition);
                                A0v = 4YV.A10("overlayPosition", A0v);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationOverlayMemoriesPolaroidInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationOverlayMemoriesPolaroidInfo(inspirationOverlayPosition, A0v, i);
        }
    }

    /* loaded from: InspirationOverlayMemoriesPolaroidInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationOverlayMemoriesPolaroidInfo inspirationOverlayMemoriesPolaroidInfo = (InspirationOverlayMemoriesPolaroidInfo) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayMemoriesPolaroidInfo.A00(), "overlay_position");
            int i = inspirationOverlayMemoriesPolaroidInfo.A00;
            r302.A0o("timestamp");
            r302.A0f(i);
            r302.A0Y();
        }
    }

    public InspirationOverlayMemoriesPolaroidInfo(Parcel parcel) {
        this.A01 = DKH.A0R(parcel, C3o5.A01(parcel, this));
        this.A00 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayMemoriesPolaroidInfo(InspirationOverlayPosition inspirationOverlayPosition, Set set, int i) {
        this.A01 = inspirationOverlayPosition;
        this.A00 = i;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A02)) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = DKG.A0V();
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
            if (!(obj instanceof InspirationOverlayMemoriesPolaroidInfo)) {
                return false;
            }
            InspirationOverlayMemoriesPolaroidInfo inspirationOverlayMemoriesPolaroidInfo = (InspirationOverlayMemoriesPolaroidInfo) obj;
            if (!11T.A0O(A00(), inspirationOverlayMemoriesPolaroidInfo.A00()) || this.A00 != inspirationOverlayMemoriesPolaroidInfo.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A03(A00()) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKI.A0P(parcel, this.A01, i);
        parcel.writeInt(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
