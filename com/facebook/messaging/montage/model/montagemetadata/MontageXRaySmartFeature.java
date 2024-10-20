package com.facebook.messaging.montage.model.montagemetadata;

import X.0Q8;
import X.11T;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.CST;
import X.Hax;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: MontageXRaySmartFeature.class */
public final class MontageXRaySmartFeature implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(23);
    public final double A00;
    public final String A01;

    /* loaded from: MontageXRaySmartFeature$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Hax hax = new Hax();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != 3373707) {
                            if (hashCode == 111972721 && A1C.equals("value")) {
                                hax.A00 = abstractC01033pi.A11();
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                hax.A01 = A03;
                                C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A03);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageXRaySmartFeature.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageXRaySmartFeature(hax);
        }
    }

    /* loaded from: MontageXRaySmartFeature$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageXRaySmartFeature montageXRaySmartFeature = (MontageXRaySmartFeature) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, montageXRaySmartFeature.A01);
            double d = montageXRaySmartFeature.A00;
            r302.A0o("value");
            r302.A0d(d);
            r302.A0Y();
        }
    }

    public MontageXRaySmartFeature(Hax hax) {
        String str = hax.A01;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        this.A01 = str;
        this.A00 = hax.A00;
    }

    public MontageXRaySmartFeature(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageXRaySmartFeature)) {
                return false;
            }
            MontageXRaySmartFeature montageXRaySmartFeature = (MontageXRaySmartFeature) obj;
            if (!11T.A0O(this.A01, montageXRaySmartFeature.A01) || this.A00 != montageXRaySmartFeature.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A00(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeDouble(this.A00);
    }
}
