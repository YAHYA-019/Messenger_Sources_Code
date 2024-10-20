package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: CollaborativePromptsModel.class */
public final class CollaborativePromptsModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(90);
    public final int A00;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* loaded from: CollaborativePromptsModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            int i = 0;
            int i2 = 0;
            String str = "";
            ImmutableList of = ImmutableList.of();
            String str2 = str;
            String str3 = str;
            String str4 = str;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1981546130:
                                if (A1C.equals("contributors_uris")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    C1pq.A08("contributorsUris", of);
                                    break;
                                }
                                break;
                            case -1501013832:
                                if (A1C.equals("author_uri")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("authorUri", str);
                                    break;
                                }
                                break;
                            case -979805852:
                                if (A1C.equals("prompt")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("prompt", str3);
                                    break;
                                }
                                break;
                            case -798298666:
                                if (A1C.equals("prompt_id")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("promptId", str4);
                                    break;
                                }
                                break;
                            case 3373707:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
                                    break;
                                }
                                break;
                            case 506361563:
                                if (A1C.equals("group_id")) {
                                    i = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1815197715:
                                if (A1C.equals("total_contributors")) {
                                    i2 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, CollaborativePromptsModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new CollaborativePromptsModel(of, str, str2, str3, str4, i, i2);
        }
    }

    /* loaded from: CollaborativePromptsModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            CollaborativePromptsModel collaborativePromptsModel = (CollaborativePromptsModel) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "author_uri", collaborativePromptsModel.A03);
            AbstractC11224vw.A06(r302, c26c, "contributors_uris", collaborativePromptsModel.A02);
            int i = collaborativePromptsModel.A00;
            r302.A0o("group_id");
            r302.A0f(i);
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, collaborativePromptsModel.A04);
            AbstractC11224vw.A0D(r302, "prompt", collaborativePromptsModel.A05);
            AbstractC11224vw.A0D(r302, "prompt_id", collaborativePromptsModel.A06);
            int i2 = collaborativePromptsModel.A01;
            r302.A0o("total_contributors");
            r302.A0f(i2);
            r302.A0Y();
        }
    }

    public CollaborativePromptsModel(Parcel parcel) {
        this.A03 = 7zU.A0l(parcel, this);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A02 = ImmutableList.copyOf(strArr);
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = parcel.readInt();
    }

    public CollaborativePromptsModel(ImmutableList immutableList, String str, String str2, String str3, String str4, int i, int i2) {
        C1pq.A08("authorUri", str);
        this.A03 = str;
        C1pq.A08("contributorsUris", immutableList);
        this.A02 = immutableList;
        this.A00 = i;
        AbF.A1U(str2);
        this.A04 = str2;
        C1pq.A08("prompt", str3);
        this.A05 = str3;
        C1pq.A08("promptId", str4);
        this.A06 = str4;
        this.A01 = i2;
        if (this.A05 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (this.A04 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CollaborativePromptsModel)) {
                return false;
            }
            CollaborativePromptsModel collaborativePromptsModel = (CollaborativePromptsModel) obj;
            if (!11T.A0O(this.A03, collaborativePromptsModel.A03) || !11T.A0O(this.A02, collaborativePromptsModel.A02) || this.A00 != collaborativePromptsModel.A00 || !11T.A0O(this.A04, collaborativePromptsModel.A04) || !11T.A0O(this.A05, collaborativePromptsModel.A05) || !11T.A0O(this.A06, collaborativePromptsModel.A06) || this.A01 != collaborativePromptsModel.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, (C1pq.A04(this.A02, C1pq.A03(this.A03)) * 31) + this.A00))) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
    }
}
