package com.facebook.fbshorts.sharesheet.tagtopics.model;

import X.0Q8;
import X.11T;
import X.28Q;
import X.4YW;
import X.5BB;
import X.7zU;
import X.AbF;
import X.AbG;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FbShareSheetSubTopicModel.class */
public final class FbShareSheetSubTopicModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(78);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* loaded from: FbShareSheetSubTopicModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            boolean z = false;
            String str2 = "";
            String str3 = str2;
            String str4 = str2;
            String str5 = str2;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -511276551:
                                if (A1C.equals("fit_name")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("fitName", str3);
                                    break;
                                }
                                break;
                            case 3355:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
                                    break;
                                }
                                break;
                            case 3373707:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
                                    break;
                                }
                                break;
                            case 1191572123:
                                if (A1C.equals("selected")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1615086568:
                                if (A1C.equals("display_name")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str2);
                                    break;
                                }
                                break;
                            case 2070327504:
                                if (A1C.equals("parent_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, FbShareSheetSubTopicModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new FbShareSheetSubTopicModel(str2, str3, str4, str5, str, z);
        }
    }

    /* loaded from: FbShareSheetSubTopicModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            FbShareSheetSubTopicModel fbShareSheetSubTopicModel = (FbShareSheetSubTopicModel) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "display_name", fbShareSheetSubTopicModel.A00);
            AbstractC11224vw.A0D(r302, "fit_name", fbShareSheetSubTopicModel.A01);
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, fbShareSheetSubTopicModel.A02);
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, fbShareSheetSubTopicModel.A03);
            AbstractC11224vw.A0D(r302, "parent_id", fbShareSheetSubTopicModel.A04);
            DKG.A1T(r302, "selected", fbShareSheetSubTopicModel.A05);
        }
    }

    public FbShareSheetSubTopicModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = DKH.A0l(parcel);
        this.A05 = AbN.A1U(parcel);
    }

    public FbShareSheetSubTopicModel(String str, String str2, String str3, String str4, String str5, boolean z) {
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str);
        this.A00 = str;
        C1pq.A08("fitName", str2);
        this.A01 = str2;
        AbF.A1T(str3);
        this.A02 = str3;
        AbF.A1U(str4);
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbShareSheetSubTopicModel)) {
                return false;
            }
            FbShareSheetSubTopicModel fbShareSheetSubTopicModel = (FbShareSheetSubTopicModel) obj;
            if (!11T.A0O(this.A00, fbShareSheetSubTopicModel.A00) || !11T.A0O(this.A01, fbShareSheetSubTopicModel.A01) || !11T.A0O(this.A02, fbShareSheetSubTopicModel.A02) || !11T.A0O(this.A03, fbShareSheetSubTopicModel.A03) || !11T.A0O(this.A04, fbShareSheetSubTopicModel.A04) || this.A05 != fbShareSheetSubTopicModel.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        4YW.A0E(parcel, this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
