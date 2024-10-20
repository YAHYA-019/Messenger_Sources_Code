package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.28Q;
import X.4YW;
import X.5BB;
import X.AbG;
import X.AbK;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerGroupPostTitleModel.class */
public final class ComposerGroupPostTitleModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(27);
    public final String A00;

    /* loaded from: ComposerGroupPostTitleModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        if (A1C.hashCode() == -1906182463 && A1C.equals("post_message_title")) {
                            str = AbstractC11224vw.A03(abstractC01033pi);
                        } else {
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerGroupPostTitleModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerGroupPostTitleModel(str);
        }
    }

    /* loaded from: ComposerGroupPostTitleModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            r302.A0b();
            AbstractC11224vw.A0D(r302, "post_message_title", ((ComposerGroupPostTitleModel) obj).A00);
            r302.A0Y();
        }
    }

    public ComposerGroupPostTitleModel(Parcel parcel) {
        this.A00 = AbK.A15(parcel, C3o5.A01(parcel, this));
    }

    public ComposerGroupPostTitleModel(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerGroupPostTitleModel) && 11T.A0O(this.A00, ((ComposerGroupPostTitleModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
    }
}
