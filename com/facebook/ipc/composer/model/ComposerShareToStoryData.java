package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerShareToStoryData.class */
public final class ComposerShareToStoryData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(67);
    public final String A00;
    public final String A01;
    public final boolean A02;

    /* loaded from: ComposerShareToStoryData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            String str = "ONCE";
            String str2 = "PUBLIC";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -1272961740) {
                            if (A1C.equals("story_audience_mode")) {
                                str2 = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("storyAudienceMode", str2);
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != -109284052) {
                            if (hashCode == 765660601 && A1C.equals("sharing_frequency")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("sharingFrequency", str);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("is_enabled")) {
                                z = abstractC01033pi.A1l();
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerShareToStoryData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerShareToStoryData(z, str, str2);
        }
    }

    /* loaded from: ComposerShareToStoryData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerShareToStoryData composerShareToStoryData = (ComposerShareToStoryData) obj;
            r302.A0b();
            boolean z = composerShareToStoryData.A02;
            r302.A0o("is_enabled");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "sharing_frequency", composerShareToStoryData.A00);
            AbstractC11224vw.A0D(r302, "story_audience_mode", composerShareToStoryData.A01);
            r302.A0Y();
        }
    }

    public ComposerShareToStoryData(Parcel parcel) {
        this.A02 = DKI.A0k(parcel, this);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public ComposerShareToStoryData(boolean z, String str, String str2) {
        this.A02 = z;
        C1pq.A08("sharingFrequency", str);
        this.A00 = str;
        C1pq.A08("storyAudienceMode", str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerShareToStoryData)) {
                return false;
            }
            ComposerShareToStoryData composerShareToStoryData = (ComposerShareToStoryData) obj;
            if (this.A02 != composerShareToStoryData.A02 || !11T.A0O(this.A00, composerShareToStoryData.A00) || !11T.A0O(this.A01, composerShareToStoryData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A02)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComposerShareToStoryData{isEnabled=");
        A0k.append(this.A02);
        A0k.append(", sharingFrequency=");
        A0k.append(this.A00);
        A0k.append(", storyAudienceMode=");
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
