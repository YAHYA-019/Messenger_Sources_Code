package com.facebook.messaging.nativepagereply.faq.data.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.4YW;
import X.5BB;
import X.82M;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.C7r1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: AutomatedResponseCustomQuestionSettingModel.class */
public final class AutomatedResponseCustomQuestionSettingModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(72);
    public final ImmutableList A00;
    public final String A01;
    public final boolean A02;

    /* loaded from: AutomatedResponseCustomQuestionSettingModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            C7r1 c7r1 = new C7r1();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        int hashCode = A1Y.hashCode();
                        if (hashCode == -2117646568) {
                            if (A1Y.equals("faq_enabled")) {
                                c7r1.A02 = abstractC01033pi.A1l();
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != -626538377) {
                            if (hashCode == 3355 && A1Y.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                                c7r1.A01 = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1Y.equals("faq_platforms")) {
                                ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                c7r1.A00 = A00;
                                C1pq.A08("faqPlatforms", A00);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AutomatedResponseCustomQuestionSettingModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AutomatedResponseCustomQuestionSettingModel(c7r1);
        }
    }

    /* loaded from: AutomatedResponseCustomQuestionSettingModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            AutomatedResponseCustomQuestionSettingModel automatedResponseCustomQuestionSettingModel = (AutomatedResponseCustomQuestionSettingModel) obj;
            r302.A0b();
            boolean z = automatedResponseCustomQuestionSettingModel.A02;
            r302.A0o("faq_enabled");
            r302.A0v(z);
            AbstractC11224vw.A06(r302, c26c, "faq_platforms", automatedResponseCustomQuestionSettingModel.A00);
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, automatedResponseCustomQuestionSettingModel.A01);
            r302.A0Y();
        }
    }

    public AutomatedResponseCustomQuestionSettingModel(C7r1 c7r1) {
        this.A02 = c7r1.A02;
        ImmutableList immutableList = c7r1.A00;
        C1pq.A08("faqPlatforms", immutableList);
        this.A00 = immutableList;
        this.A01 = c7r1.A01;
    }

    public AutomatedResponseCustomQuestionSettingModel(Parcel parcel) {
        this.A02 = 4YV.A1U(C3o5.A01(parcel, this));
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A01 = parcel.readInt() == 0 ? null : parcel.readString();
    }

    public AutomatedResponseCustomQuestionSettingModel(ImmutableList immutableList, String str, boolean z) {
        this.A02 = z;
        this.A00 = immutableList;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AutomatedResponseCustomQuestionSettingModel)) {
                return false;
            }
            AutomatedResponseCustomQuestionSettingModel automatedResponseCustomQuestionSettingModel = (AutomatedResponseCustomQuestionSettingModel) obj;
            if (this.A02 != automatedResponseCustomQuestionSettingModel.A02 || !11T.A0O(this.A00, automatedResponseCustomQuestionSettingModel.A00) || !11T.A0O(this.A01, automatedResponseCustomQuestionSettingModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        4YW.A0E(parcel, this.A01);
    }
}
