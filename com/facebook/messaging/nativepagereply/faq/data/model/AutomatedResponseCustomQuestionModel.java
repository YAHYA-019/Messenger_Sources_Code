package com.facebook.messaging.nativepagereply.faq.data.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.5BB;
import X.7zK;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;

/* loaded from: AutomatedResponseCustomQuestionModel.class */
public final class AutomatedResponseCustomQuestionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(43);
    public final int A00;
    public final AutomatedResponseAttachmentModel A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* loaded from: AutomatedResponseCustomQuestionModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            AutomatedResponseAttachmentModel automatedResponseAttachmentModel = null;
            int i = 0;
            boolean z = false;
            ImmutableList of = ImmutableList.of();
            String str = "";
            String str2 = str;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1963501277:
                                if (A1C.equals("attachment")) {
                                    automatedResponseAttachmentModel = (AutomatedResponseAttachmentModel) AbstractC11224vw.A02(abstractC01033pi, c27t, AutomatedResponseAttachmentModel.class);
                                    break;
                                }
                                break;
                            case -1165870106:
                                if (A1C.equals("question")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("question", str);
                                    break;
                                }
                                break;
                            case -1083124733:
                                if (A1C.equals(7zK.A00(427))) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -340323263:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE)) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str2);
                                    break;
                                }
                                break;
                            case 100346066:
                                if (A1C.equals("index")) {
                                    i = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 241352577:
                                if (A1C.equals("buttons")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, AutomatedResponseButtonModel.class);
                                    C1pq.A08("buttons", of);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AutomatedResponseCustomQuestionModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AutomatedResponseCustomQuestionModel(automatedResponseAttachmentModel, of, str, str2, i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutomatedResponseCustomQuestionModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readInt() == 0 ? null : (AutomatedResponseAttachmentModel) parcel.readParcelable(A0e);
        int readInt = parcel.readInt();
        AutomatedResponseButtonModel[] automatedResponseButtonModelArr = new AutomatedResponseButtonModel[readInt];
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            }
            automatedResponseButtonModelArr[i2] = parcel.readParcelable(A0e);
            i = i2 + 1;
        }
        this.A02 = ImmutableList.copyOf(automatedResponseButtonModelArr);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readInt() == 1 ? true : z;
    }

    public AutomatedResponseCustomQuestionModel(AutomatedResponseAttachmentModel automatedResponseAttachmentModel, ImmutableList immutableList, String str, String str2, int i, boolean z) {
        this.A01 = automatedResponseAttachmentModel;
        C1pq.A08("buttons", immutableList);
        this.A02 = immutableList;
        this.A00 = i;
        C1pq.A08("question", str);
        this.A03 = str;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str2);
        this.A04 = str2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AutomatedResponseCustomQuestionModel)) {
                return false;
            }
            AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel = (AutomatedResponseCustomQuestionModel) obj;
            if (!11T.A0O(this.A01, automatedResponseCustomQuestionModel.A01) || !11T.A0O(this.A02, automatedResponseCustomQuestionModel.A02) || this.A00 != automatedResponseCustomQuestionModel.A00 || !11T.A0O(this.A03, automatedResponseCustomQuestionModel.A03) || !11T.A0O(this.A04, automatedResponseCustomQuestionModel.A04) || this.A05 != automatedResponseCustomQuestionModel.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A03, (C1pq.A04(this.A02, C1pq.A03(this.A01)) * 31) + this.A00)), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A01, i);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AutomatedResponseButtonModel) A0b.next(), i);
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
