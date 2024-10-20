package com.facebook.inspiration.emp.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: EMPOverlayModel.class */
public final class EMPOverlayModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(31);
    public final ImmutableList A00;

    /* loaded from: EMPOverlayModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList of = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        if (A1C.hashCode() == 529810979 && A1C.equals("overlays")) {
                            of = AbstractC11224vw.A00(abstractC01033pi, c27t, EMPPreviewOverlay.class);
                            C1pq.A08("overlays", of);
                        } else {
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, EMPOverlayModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new EMPOverlayModel(of);
        }
    }

    /* loaded from: EMPOverlayModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "overlays", ((EMPOverlayModel) obj).A00);
            r302.A0Y();
        }
    }

    public EMPOverlayModel(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        EMPPreviewOverlay[] eMPPreviewOverlayArr = new EMPPreviewOverlay[A01];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                this.A00 = ImmutableList.copyOf(eMPPreviewOverlayArr);
                return;
            }
            i = DKG.A02(parcel, EMPPreviewOverlay.CREATOR, eMPPreviewOverlayArr, i2);
        }
    }

    public EMPOverlayModel(ImmutableList immutableList) {
        C1pq.A08("overlays", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EMPOverlayModel) && 11T.A0O(this.A00, ((EMPOverlayModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            ((EMPPreviewOverlay) A0b.next()).writeToParcel(parcel, i);
        }
    }
}
