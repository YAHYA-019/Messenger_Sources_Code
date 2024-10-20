package com.facebook.stickers.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.82N;
import X.AnonymousClass001;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLStickerState;
import com.facebook.graphql.enums.GraphQLStickerType;
import java.util.Arrays;

/* loaded from: Sticker.class */
public final class Sticker implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(6);
    public final int A00;
    public final Uri A01;
    public final Uri A02;
    public final Uri A03;
    public final Uri A04;
    public final Uri A05;
    public final Uri A06;
    public final Uri A07;
    public final Uri A08;
    public final Uri A09;
    public final GraphQLStickerState A0A;
    public final GraphQLStickerType A0B;
    public final StickerCapabilities A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;

    public Sticker(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, Uri uri8, Uri uri9, GraphQLStickerState graphQLStickerState, GraphQLStickerType graphQLStickerType, StickerCapabilities stickerCapabilities, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        11T.A0F(str, 1);
        this.A0F = str;
        this.A0H = str2;
        this.A0G = str3;
        this.A0D = str4;
        this.A0E = str5;
        this.A00 = i;
        this.A0A = graphQLStickerState;
        this.A0B = graphQLStickerType;
        this.A09 = uri;
        this.A08 = uri2;
        this.A02 = uri3;
        this.A01 = uri4;
        this.A07 = uri5;
        this.A06 = uri6;
        this.A04 = uri7;
        this.A03 = uri8;
        this.A05 = uri9;
        this.A0C = stickerCapabilities;
        this.A0I = z;
    }

    public Sticker(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0F = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0H = readString2;
        this.A0G = parcel.readString();
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0A = (GraphQLStickerState) parcel.readSerializable();
        this.A0B = (GraphQLStickerType) parcel.readSerializable();
        Parcelable A0C = 1BL.A0C(parcel, Uri.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A09 = (Uri) A0C;
        this.A08 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A02 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A01 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A07 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A06 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A04 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A03 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A05 = (Uri) 1BL.A0C(parcel, Uri.class);
        Parcelable A0C2 = 1BL.A0C(parcel, StickerCapabilities.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0C = (StickerCapabilities) A0C2;
        this.A0I = 4YV.A1U(parcel.readInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != 2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.graphql.enums.GraphQLStickerType r0 = r0.A0B
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            int r0 = r0.ordinal()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L20
            r0 = 2
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L20
        L1e:
            r0 = 0
            r304 = r0
        L20:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stickers.model.Sticker.A00():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof Sticker)) {
                return false;
            }
            Sticker sticker = (Sticker) obj;
            if (!11T.A0O(this.A0F, sticker.A0F) || !11T.A0O(this.A0H, sticker.A0H) || !11T.A0O(this.A0G, sticker.A0G) || !11T.A0O(this.A0D, sticker.A0D) || !11T.A0O(this.A0E, sticker.A0E) || this.A00 != sticker.A00 || this.A0A != sticker.A0A || this.A0B != sticker.A0B || !11T.A0O(this.A09, sticker.A09) || !11T.A0O(this.A08, sticker.A08) || !11T.A0O(this.A01, sticker.A01) || !11T.A0O(this.A07, sticker.A07) || !11T.A0O(this.A06, sticker.A06) || !11T.A0O(this.A04, sticker.A04) || !11T.A0O(this.A03, sticker.A03) || !11T.A0O(this.A05, sticker.A05) || !11T.A0O(this.A0C, sticker.A0C) || this.A0I != sticker.A0I) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0F, this.A0H, this.A0G, this.A0D, this.A0E, Integer.valueOf(this.A00), this.A0A, this.A0B, this.A09, this.A08, this.A02, this.A01, this.A07, this.A06, this.A04, this.A03, this.A05, this.A0C, Boolean.valueOf(this.A0I)});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Sticker{id='");
        A0k.append(this.A0F);
        A0k.append("', packId='");
        A0k.append(this.A0H);
        A0k.append("', label='");
        A0k.append(this.A0G);
        A0k.append("', avatarStickerTemplateId='");
        A0k.append(this.A0D);
        A0k.append("', avatarStickerTemplateName='");
        A0k.append(this.A0E);
        A0k.append("', numberOfAvatars='");
        A0k.append(this.A00);
        A0k.append("', stickerState=");
        A0k.append(this.A0A);
        A0k.append("', stickerType=");
        A0k.append(this.A0B);
        A0k.append("', staticWebUri=");
        A0k.append(this.A09);
        A0k.append(", staticDiskUri=");
        A0k.append(this.A08);
        A0k.append(", animatedWebUri=");
        A0k.append(this.A02);
        A0k.append(", animatedDiskUri=");
        A0k.append(this.A01);
        A0k.append(", previewWebUri=");
        A0k.append(this.A07);
        A0k.append(", previewDiskUri=");
        A0k.append(this.A06);
        A0k.append(", lockedImageUri=");
        A0k.append(this.A04);
        A0k.append(", keyframe2WebUri=");
        A0k.append(this.A03);
        A0k.append(", lottieUri=");
        A0k.append(this.A05);
        A0k.append(", stickerCapabilities=");
        A0k.append(this.A0C);
        A0k.append(", isAvatarStudioSticker=");
        A0k.append(this.A0I);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A00);
        parcel.writeSerializable(this.A0A);
        parcel.writeSerializable(this.A0B);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeInt(this.A0I ? 1 : 0);
    }
}
