package com.facebook.ipc.composer.model;

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
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerFanRecognitionModel.class */
public final class ComposerFanRecognitionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(15);
    public final String A00;
    public final String A01;

    /* loaded from: ComposerFanRecognitionModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            String str2 = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != -799136893) {
                            if (hashCode == 1783628482 && A1C.equals("recognition_type")) {
                                str2 = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("recognitionType", str2);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("entry_point")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("entryPoint", str);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerFanRecognitionModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerFanRecognitionModel(str, str2);
        }
    }

    /* loaded from: ComposerFanRecognitionModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerFanRecognitionModel composerFanRecognitionModel = (ComposerFanRecognitionModel) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "entry_point", composerFanRecognitionModel.A00);
            AbstractC11224vw.A0D(r302, "recognition_type", composerFanRecognitionModel.A01);
            r302.A0Y();
        }
    }

    public ComposerFanRecognitionModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public ComposerFanRecognitionModel(String str, String str2) {
        C1pq.A08("entryPoint", str);
        this.A00 = str;
        C1pq.A08("recognitionType", str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerFanRecognitionModel)) {
                return false;
            }
            ComposerFanRecognitionModel composerFanRecognitionModel = (ComposerFanRecognitionModel) obj;
            if (!11T.A0O(this.A00, composerFanRecognitionModel.A00) || !11T.A0O(this.A01, composerFanRecognitionModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
