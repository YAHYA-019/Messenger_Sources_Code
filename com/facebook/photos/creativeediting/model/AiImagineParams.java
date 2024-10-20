package com.facebook.photos.creativeediting.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.EKg;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: AiImagineParams.class */
public final class AiImagineParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(14);
    public final EKg A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* loaded from: AiImagineParams$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            EKg eKg = null;
            String str = null;
            boolean z = false;
            String str2 = null;
            String str3 = null;
            String str4 = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2021814613:
                                if (A1C.equals("user_interaction_info_id")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -2011796634:
                                if (A1C.equals("edit_tools")) {
                                    eKg = (EKg) AbstractC11224vw.A02(abstractC01033pi, c27t, EKg.class);
                                    break;
                                }
                                break;
                            case -979805852:
                                if (A1C.equals("prompt")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("prompt", str4);
                                    break;
                                }
                                break;
                            case -318025478:
                                if (A1C.equals("is_uploaded_media")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1014577290:
                                if (A1C.equals("product_type")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 2076212140:
                                if (A1C.equals("imagine_a_i_bottomsheet_session_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AiImagineParams.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AiImagineParams(eKg, str, str2, str4, str3, z);
        }
    }

    /* loaded from: AiImagineParams$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            AiImagineParams aiImagineParams = (AiImagineParams) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, aiImagineParams.A00, "edit_tools");
            AbstractC11224vw.A0D(r302, "imagine_a_i_bottomsheet_session_id", aiImagineParams.A01);
            boolean z = aiImagineParams.A05;
            r302.A0o("is_uploaded_media");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "product_type", aiImagineParams.A02);
            AbstractC11224vw.A0D(r302, "prompt", aiImagineParams.A03);
            AbstractC11224vw.A0D(r302, "user_interaction_info_id", aiImagineParams.A04);
            r302.A0Y();
        }
    }

    public AiImagineParams(EKg eKg, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = eKg;
        this.A01 = str;
        this.A05 = z;
        this.A02 = str2;
        C1pq.A08("prompt", str3);
        this.A03 = str3;
        this.A04 = str4;
    }

    public AiImagineParams(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = EKg.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A05 = AbN.A1U(parcel);
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = parcel.readString();
        this.A04 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AiImagineParams)) {
                return false;
            }
            AiImagineParams aiImagineParams = (AiImagineParams) obj;
            if (this.A00 != aiImagineParams.A00 || !11T.A0O(this.A01, aiImagineParams.A01) || this.A05 != aiImagineParams.A05 || !11T.A0O(this.A02, aiImagineParams.A02) || !11T.A0O(this.A03, aiImagineParams.A03) || !11T.A0O(this.A04, aiImagineParams.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C3o5.A03(this.A00) + 31), this.A05))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
    }
}
