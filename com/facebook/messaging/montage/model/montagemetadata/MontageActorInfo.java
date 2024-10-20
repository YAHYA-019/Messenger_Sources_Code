package com.facebook.messaging.montage.model.montagemetadata;

import X.0Q8;
import X.11T;
import X.1BL;
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
import X.C4Ny;
import X.C4V6;
import X.Hg5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.user.profilepic.PicSquare;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: MontageActorInfo.class */
public final class MontageActorInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(28);
    public final PicSquare A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: MontageActorInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Hg5 hg5 = new Hg5();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1340043452:
                                if (A1C.equals("actor_type")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    hg5.A01 = A03;
                                    C1pq.A08("actorType", A03);
                                    break;
                                }
                                break;
                            case 3373707:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                    hg5.A02 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1561734725:
                                if (A1C.equals("fallback_profile_pic_square")) {
                                    hg5.A00 = (PicSquare) AbstractC11224vw.A02(abstractC01033pi, c27t, PicSquare.class);
                                    break;
                                }
                                break;
                            case 1565793390:
                                if (A1C.equals("short_name")) {
                                    hg5.A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageActorInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageActorInfo(hg5);
        }
    }

    /* loaded from: MontageActorInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageActorInfo montageActorInfo = (MontageActorInfo) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "actor_type", montageActorInfo.A01);
            AbstractC11224vw.A05(r302, c26c, montageActorInfo.A00, "fallback_profile_pic_square");
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, montageActorInfo.A02);
            AbstractC11224vw.A0D(r302, "short_name", montageActorInfo.A03);
            r302.A0Y();
        }
    }

    public MontageActorInfo(Hg5 hg5) {
        String str = hg5.A01;
        C1pq.A08("actorType", str);
        this.A01 = str;
        this.A00 = hg5.A00;
        this.A02 = hg5.A02;
        this.A03 = hg5.A03;
    }

    public MontageActorInfo(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A01 = parcel.readString();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (PicSquare) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
    }

    public MontageActorInfo(String str, String str2, String str3) {
        C1pq.A08("actorType", str);
        this.A01 = str;
        this.A00 = null;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageActorInfo)) {
                return false;
            }
            MontageActorInfo montageActorInfo = (MontageActorInfo) obj;
            if (!11T.A0O(this.A01, montageActorInfo.A01) || !11T.A0O(this.A00, montageActorInfo.A00) || !11T.A0O(this.A02, montageActorInfo.A02) || !11T.A0O(this.A03, montageActorInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
