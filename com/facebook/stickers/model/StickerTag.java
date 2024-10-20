package com.facebook.stickers.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: StickerTag.class */
public final class StickerTag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(38);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public StickerTag(Parcel parcel) {
        String str;
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = readString2;
        String readString3 = parcel.readString();
        str = "";
        this.A01 = readString3 == null ? str : readString3;
        this.A05 = AnonymousClass001.A1P(parcel.readInt());
        this.A00 = parcel.readInt();
        String readString4 = parcel.readString();
        this.A04 = readString4 != null ? readString4 : "";
    }

    public StickerTag(String str, String str2, String str3, String str4, int i, boolean z) {
        1BL.A1F(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A05 = z;
        this.A00 = i;
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
    }
}
