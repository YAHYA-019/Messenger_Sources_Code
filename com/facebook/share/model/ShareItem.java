package com.facebook.share.model;

import X.1BL;
import X.C53v;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ShareItem.class */
public final class ShareItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(17);
    public final ComposerAppAttribution A00;
    public final OpenGraphShareItemData A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public ShareItem(Parcel parcel) {
        this.A08 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A09 = C53v.A0S(parcel);
        this.A00 = (ComposerAppAttribution) 1BL.A0C(parcel, ComposerAppAttribution.class);
        this.A01 = (OpenGraphShareItemData) 1BL.A0C(parcel, OpenGraphShareItemData.class);
    }

    public ShareItem(ComposerAppAttribution composerAppAttribution, OpenGraphShareItemData openGraphShareItemData, String str, String str2) {
        this.A08 = null;
        this.A06 = str2;
        this.A07 = null;
        this.A03 = str;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A09 = false;
        this.A00 = composerAppAttribution;
        this.A01 = openGraphShareItemData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("ShareItem{");
        sb.append("title='");
        sb.append(this.A08);
        sb.append('\'');
        sb.append(", subTitle='");
        sb.append(this.A06);
        sb.append('\'');
        sb.append(", summary='");
        sb.append(this.A07);
        sb.append('\'');
        sb.append(", imageUrl='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", clickTarget='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", shareLegacyAPIStoryId='");
        sb.append(this.A05);
        sb.append('\'');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
