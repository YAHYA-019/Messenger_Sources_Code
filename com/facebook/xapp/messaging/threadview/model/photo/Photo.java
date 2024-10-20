package com.facebook.xapp.messaging.threadview.model.photo;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.5wW;
import X.82N;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.threadview.model.attribution.AttributionApp;

/* loaded from: Photo.class */
public final class Photo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(35);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final MediaResource A05;
    public final AttributionApp A06;
    public final Float A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public Photo(5wW r302) {
        this.A07 = r302.A07;
        this.A06 = r302.A06;
        this.A04 = r302.A04;
        this.A0G = r302.A0G;
        this.A08 = r302.A08;
        this.A09 = r302.A09;
        String str = r302.A0B;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        this.A0B = str;
        this.A0H = r302.A0H;
        this.A0I = r302.A0I;
        this.A0J = r302.A0J;
        this.A0C = r302.A0C;
        String str2 = r302.A0D;
        C1pq.A08("mimeType", str2);
        this.A0D = str2;
        this.A00 = r302.A00;
        String str3 = r302.A0E;
        C1pq.A08("photoUri", str3);
        this.A0E = str3;
        this.A01 = r302.A01;
        this.A0A = r302.A0A;
        this.A02 = r302.A02;
        String str4 = r302.A0F;
        C1pq.A08("thumbnailUri", str4);
        this.A0F = str4;
        this.A03 = r302.A03;
        this.A05 = r302.A05;
    }

    public Photo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        MediaResource mediaResource = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (AttributionApp) AttributionApp.CREATOR.createFromParcel(parcel);
        }
        this.A04 = parcel.readLong();
        boolean z = false;
        this.A0G = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = Integer.valueOf(parcel.readInt());
        }
        this.A0B = parcel.readString();
        this.A0H = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = parcel.readInt() == 1 ? true : z;
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        this.A0D = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = 0S2.A00(3)[parcel.readInt()];
        }
        this.A02 = parcel.readInt();
        this.A0F = parcel.readString();
        this.A03 = parcel.readInt();
        this.A05 = parcel.readInt() != 0 ? (MediaResource) parcel.readParcelable(A0e) : mediaResource;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) obj;
            if (!11T.A0O(this.A07, photo.A07) || !11T.A0O(this.A06, photo.A06) || this.A04 != photo.A04 || this.A0G != photo.A0G || !11T.A0O(this.A08, photo.A08) || !11T.A0O(this.A09, photo.A09) || !11T.A0O(this.A0B, photo.A0B) || this.A0H != photo.A0H || this.A0I != photo.A0I || this.A0J != photo.A0J || !11T.A0O(this.A0C, photo.A0C) || !11T.A0O(this.A0D, photo.A0D) || this.A00 != photo.A00 || !11T.A0O(this.A0E, photo.A0E) || this.A01 != photo.A01 || this.A0A != photo.A0A || this.A02 != photo.A02 || !11T.A0O(this.A0F, photo.A0F) || this.A03 != photo.A03 || !11T.A0O(this.A05, photo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = (C1pq.A04(this.A0E, (C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0B, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A02(C1pq.A01(C1pq.A04(this.A06, C1pq.A04(this.A07, 1)), this.A04), this.A0G)))), this.A0H), this.A0I), this.A0J))) * 31) + this.A00) * 31) + this.A01;
        Integer num = this.A0A;
        return C1pq.A04(this.A05, (C1pq.A04(this.A0F, (((A04 * 31) + (num == null ? -1 : num.intValue())) * 31) + this.A02) * 31) + this.A03);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Photo{aspectRatio=");
        sb.append(this.A07);
        sb.append(", attributionApp=");
        sb.append(this.A06);
        sb.append(", dateModifiedMs=");
        sb.append(this.A04);
        sb.append(", disableDownload=");
        sb.append(this.A0G);
        sb.append(", groupIndex=");
        sb.append(this.A08);
        sb.append(", groupSize=");
        sb.append(this.A09);
        sb.append(", id=");
        sb.append(this.A0B);
        sb.append(", isGif=");
        sb.append(this.A0H);
        sb.append(", isHd=");
        sb.append(this.A0I);
        sb.append(", isTrustedExternalContentUri=");
        sb.append(this.A0J);
        sb.append(", localPlaintextHash=");
        sb.append(this.A0C);
        sb.append(", mimeType=");
        sb.append(this.A0D);
        sb.append(", photoHeightPx=");
        sb.append(this.A00);
        sb.append(", photoUri=");
        sb.append(this.A0E);
        sb.append(", photoWidthPx=");
        sb.append(this.A01);
        sb.append(", stickerType=");
        Integer num = this.A0A;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "CUSTOM_STICKER";
                    break;
                case 2:
                    str = "FIRST_PARTY_STICKER";
                    break;
                default:
                    str = "AVATAR_STICKER";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", thumbnailHeightPx=");
        sb.append(this.A02);
        sb.append(", thumbnailUri=");
        sb.append(this.A0F);
        sb.append(", thumbnailWidthPx=");
        sb.append(this.A03);
        sb.append(", uploadedMediaResource=");
        sb.append(this.A05);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Float f = this.A07;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        AttributionApp attributionApp = this.A06;
        if (attributionApp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attributionApp.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A0G ? 1 : 0);
        C3o5.A0f(parcel, this.A08);
        C3o5.A0f(parcel, this.A09);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        1BL.A13(parcel, this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A01);
        C3o5.A0f(parcel, this.A0A);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A03);
        C3o5.A0d(parcel, this.A05, i);
    }
}
