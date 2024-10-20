package com.facebook.media.upload.photo.model;

import X.0Q8;
import X.11T;
import X.1BM;
import X.28Q;
import X.4YW;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbJ;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.CSR;
import X.DKH;
import X.JQw;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UploadFile.class */
public final class UploadFile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(81);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* loaded from: UploadFile$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            boolean z = false;
            String str2 = "";
            String str3 = str2;
            boolean z2 = true;
            boolean z3 = true;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1596718857:
                                if (A1C.equals("fallback_input_path")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1349993885:
                                if (A1C.equals(JQw.A00(96))) {
                                    z2 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -808882020:
                                if (A1C.equals(JQw.A00(97))) {
                                    z3 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1385459856:
                                if (A1C.equals("canonical_path")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("canonicalPath", str2);
                                    break;
                                }
                                break;
                            case 1386550138:
                                if (A1C.equals("input_path")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("inputPath", str3);
                                    break;
                                }
                                break;
                            case 1850686456:
                                if (A1C.equals(JQw.A00(108))) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, UploadFile.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new UploadFile(str2, str, str3, z2, z3, z);
        }
    }

    /* loaded from: UploadFile$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            UploadFile uploadFile = (UploadFile) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "canonical_path", uploadFile.A00);
            AbstractC11224vw.A0D(r302, "fallback_input_path", uploadFile.A01);
            AbstractC11224vw.A0D(r302, "input_path", uploadFile.A02);
            boolean z = uploadFile.A03;
            r302.A0o(JQw.A00(96));
            r302.A0v(z);
            boolean z2 = uploadFile.A04;
            r302.A0o(JQw.A00(97));
            r302.A0v(z2);
            boolean z3 = uploadFile.A05;
            r302.A0o(JQw.A00(108));
            r302.A0v(z3);
            r302.A0Y();
        }
    }

    public UploadFile(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = DKH.A0l(parcel);
        this.A02 = parcel.readString();
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1W(parcel);
    }

    public UploadFile(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C1pq.A08("canonicalPath", str);
        this.A00 = str;
        this.A01 = str2;
        C1pq.A08("inputPath", str3);
        this.A02 = str3;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UploadFile)) {
                return false;
            }
            UploadFile uploadFile = (UploadFile) obj;
            if (!11T.A0O(this.A00, uploadFile.A00) || !11T.A0O(this.A01, uploadFile.A01) || !11T.A0O(this.A02, uploadFile.A02) || this.A03 != uploadFile.A03 || this.A04 != uploadFile.A04 || this.A05 != uploadFile.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A03), this.A04), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        4YW.A0E(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
