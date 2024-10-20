package com.facebook.ipc.composer.model;

import X.0Q8;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKI;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerAutoShortFormPlaylistData.class */
public final class ComposerAutoShortFormPlaylistData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(97);
    public final boolean A00;

    /* loaded from: ComposerAutoShortFormPlaylistData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        if (A1C.hashCode() == -1499035055 && A1C.equals("is_auto_short_form_playlist_enabled")) {
                            z = abstractC01033pi.A1l();
                        } else {
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerAutoShortFormPlaylistData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerAutoShortFormPlaylistData(z);
        }
    }

    /* loaded from: ComposerAutoShortFormPlaylistData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            r302.A0b();
            DKG.A1T(r302, "is_auto_short_form_playlist_enabled", ((ComposerAutoShortFormPlaylistData) obj).A00);
        }
    }

    public ComposerAutoShortFormPlaylistData(Parcel parcel) {
        this.A00 = DKI.A0k(parcel, this);
    }

    public ComposerAutoShortFormPlaylistData(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerAutoShortFormPlaylistData) && this.A00 == ((ComposerAutoShortFormPlaylistData) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
