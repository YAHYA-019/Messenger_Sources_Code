package com.facebook.inspiration.model.fonts;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import X.GKh;
import X.QqS;
import X.Rb5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationFont.class */
public final class InspirationFont implements Parcelable, GKh {
    public static final Parcelable.Creator CREATOR = FKf.A01(98);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final QqS A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public InspirationFont(Rb5 rb5) {
        String str = rb5.A06;
        C1pq.A08("assetName", str);
        this.A06 = str;
        String str2 = rb5.A07;
        C1pq.A08("assetUrl", str2);
        this.A07 = str2;
        String str3 = rb5.A08;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str3);
        this.A08 = str3;
        ImmutableList immutableList = rb5.A05;
        C1pq.A08("expressiveTextDecorations", immutableList);
        this.A05 = immutableList;
        this.A09 = rb5.A09;
        String str4 = rb5.A0A;
        C1pq.A08("iconUrl", str4);
        this.A0A = str4;
        String str5 = rb5.A0B;
        AbF.A1T(str5);
        this.A0B = str5;
        this.A0E = rb5.A0E;
        this.A0F = rb5.A0F;
        this.A01 = rb5.A01;
        this.A02 = rb5.A02;
        this.A00 = rb5.A00;
        String str6 = rb5.A0C;
        C1pq.A08("postScriptName", str6);
        this.A0C = str6;
        String str7 = rb5.A0D;
        C1pq.A08("styleDisplayName", str7);
        this.A0D = str7;
        this.A03 = rb5.A03;
        this.A04 = rb5.A04;
    }

    public InspirationFont(Parcel parcel) {
        this.A06 = 7zU.A0l(parcel, this);
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A05 = ImmutableList.copyOf(strArr);
        QqS qqS = null;
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A0E = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0F = AbJ.A1W(parcel);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt() != 0 ? QqS.values()[parcel.readInt()] : qqS;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationFont)) {
                return false;
            }
            InspirationFont inspirationFont = (InspirationFont) obj;
            if (!11T.A0O(this.A06, inspirationFont.A06) || !11T.A0O(this.A07, inspirationFont.A07) || !11T.A0O(this.A08, inspirationFont.A08) || !11T.A0O(this.A05, inspirationFont.A05) || !11T.A0O(this.A09, inspirationFont.A09) || !11T.A0O(this.A0A, inspirationFont.A0A) || !11T.A0O(this.A0B, inspirationFont.A0B) || this.A0E != inspirationFont.A0E || this.A0F != inspirationFont.A0F || this.A01 != inspirationFont.A01 || this.A02 != inspirationFont.A02 || this.A00 != inspirationFont.A00 || !11T.A0O(this.A0C, inspirationFont.A0C) || !11T.A0O(this.A0D, inspirationFont.A0D) || this.A03 != inspirationFont.A03 || this.A04 != inspirationFont.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = (C1pq.A04(this.A0D, C1pq.A04(this.A0C, AbM.A00((((C1pq.A02(C1pq.A02(C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A05, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A03(this.A06))))))), this.A0E), this.A0F) * 31) + this.A01) * 31) + this.A02, this.A00))) * 31) + this.A03;
        return (A04 * 31) + C3o5.A03(this.A04);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationFont{assetName=");
        A0k.append(this.A06);
        A0k.append(", assetUrl=");
        A0k.append(this.A07);
        A0k.append(", displayName=");
        A0k.append(this.A08);
        A0k.append(", expressiveTextDecorations=");
        A0k.append(this.A05);
        A0k.append(", fontDisplayName=");
        A0k.append(this.A09);
        A0k.append(", iconUrl=");
        A0k.append(this.A0A);
        A0k.append(", id=");
        A0k.append(this.A0B);
        A0k.append(", isAllCapsFont=");
        A0k.append(this.A0E);
        A0k.append(", isDefaultFont=");
        A0k.append(this.A0F);
        A0k.append(", maxFontSize=");
        A0k.append(this.A01);
        A0k.append(", minFontSize=");
        A0k.append(this.A02);
        A0k.append(", outlineRatio=");
        A0k.append(this.A00);
        A0k.append(", postScriptName=");
        A0k.append(this.A0C);
        A0k.append(", styleDisplayName=");
        A0k.append(this.A0D);
        A0k.append(", styleSizeSp=");
        A0k.append(this.A03);
        A0k.append(", textFormat=");
        A0k.append(this.A04);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        1Du A0b = 1BL.A0b(parcel, this.A05);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1BL.A13(parcel, this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A03);
        C3o5.A0e(parcel, this.A04);
    }
}
