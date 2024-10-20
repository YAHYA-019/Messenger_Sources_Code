package com.facebook.messaging.montage.model.art;

import X.C53v;
import X.CST;
import X.HAr;
import X.HAv;
import X.HB0;
import X.HC2;
import X.HCR;
import X.Hav;
import X.HkK;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;

/* loaded from: ArtItem.class */
public final class ArtItem extends BaseItem {
    public static final Parcelable.Creator CREATOR = CST.A00(4);
    public HAr A00;
    public HAv A01;
    public Hav A02;
    public HB0 A03;
    public Sticker A04;
    public ImmutableList A05;
    public ImmutableList A06;

    public ArtItem(HkK hkK) {
        String str = hkK.A0E;
        HC2 hc2 = hkK.A02;
        Uri uri = hkK.A01;
        Uri uri2 = hkK.A00;
        String str2 = hkK.A0A;
        String str3 = hkK.A0B;
        HCR hcr = hkK.A05;
        String str4 = hkK.A0D;
        String str5 = hkK.A0C;
        this.A09 = str;
        super.A03 = hc2;
        super.A02 = uri;
        super.A01 = uri2;
        super.A05 = str2;
        super.A06 = str3;
        super.A04 = hcr;
        this.A08 = str4;
        this.A07 = str5;
        this.A05 = hkK.A08;
        this.A06 = hkK.A09;
        this.A02 = hkK.A04;
        this.A04 = hkK.A07;
        this.A03 = hkK.A06;
        this.A01 = hkK.A03;
        this.A00 = null;
    }

    @Override // com.facebook.messaging.montage.model.art.BaseItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A04);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
        C53v.A0D(parcel, this.A05);
        C53v.A0D(parcel, this.A06);
    }
}
