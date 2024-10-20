package com.meta.images.metadata.gen_ai.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ImageUploadProvenanceMetadata.class */
public final class ImageUploadProvenanceMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(98);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public ImageUploadProvenanceMetadata(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A06 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A07 = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A08 = 1BM.A07(parcel);
        this.A09 = AbJ.A1W(parcel);
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = parcel.readString();
        this.A05 = C3o5.A0O(parcel);
    }

    public ImageUploadProvenanceMetadata(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = str;
        this.A06 = z;
        this.A01 = str2;
        this.A07 = z2;
        this.A02 = str3;
        this.A08 = z3;
        this.A09 = z4;
        this.A03 = str4;
        C1pq.A08("provenanceType", str5);
        this.A04 = str5;
        this.A05 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ImageUploadProvenanceMetadata)) {
                return false;
            }
            ImageUploadProvenanceMetadata imageUploadProvenanceMetadata = (ImageUploadProvenanceMetadata) obj;
            if (!11T.A0O(this.A00, imageUploadProvenanceMetadata.A00) || this.A06 != imageUploadProvenanceMetadata.A06 || !11T.A0O(this.A01, imageUploadProvenanceMetadata.A01) || this.A07 != imageUploadProvenanceMetadata.A07 || !11T.A0O(this.A02, imageUploadProvenanceMetadata.A02) || this.A08 != imageUploadProvenanceMetadata.A08 || this.A09 != imageUploadProvenanceMetadata.A09 || !11T.A0O(this.A03, imageUploadProvenanceMetadata.A03) || !11T.A0O(this.A04, imageUploadProvenanceMetadata.A04) || !11T.A0O(this.A05, imageUploadProvenanceMetadata.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C1pq.A02(C1pq.A03(this.A00), this.A06)), this.A07)), this.A08), this.A09))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
    }
}
