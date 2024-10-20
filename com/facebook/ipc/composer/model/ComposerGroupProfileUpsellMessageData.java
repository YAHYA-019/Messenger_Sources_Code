package com.facebook.ipc.composer.model;

import X.0Q8;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKH;
import X.EKh;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerGroupProfileUpsellMessageData.class */
public final class ComposerGroupProfileUpsellMessageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(29);
    public final EKh A00;

    /* loaded from: ComposerGroupProfileUpsellMessageData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            EKh eKh = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        if (A1C.hashCode() == 1008404266 && A1C.equals("message_status")) {
                            eKh = (EKh) AbstractC11224vw.A02(abstractC01033pi, c27t, EKh.class);
                        } else {
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerGroupProfileUpsellMessageData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerGroupProfileUpsellMessageData(eKh);
        }
    }

    /* loaded from: ComposerGroupProfileUpsellMessageData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, ((ComposerGroupProfileUpsellMessageData) obj).A00, "message_status");
            r302.A0Y();
        }
    }

    public ComposerGroupProfileUpsellMessageData(EKh eKh) {
        this.A00 = eKh;
    }

    public ComposerGroupProfileUpsellMessageData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : EKh.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerGroupProfileUpsellMessageData) && this.A00 == ((ComposerGroupProfileUpsellMessageData) obj).A00);
    }

    public int hashCode() {
        return C3o5.A03(this.A00) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A00));
    }
}
