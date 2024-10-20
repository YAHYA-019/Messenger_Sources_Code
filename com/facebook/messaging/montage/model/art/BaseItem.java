package com.facebook.messaging.montage.model.art;

import X.4YV;
import X.AnonymousClass001;
import X.C53v;
import X.GOn;
import X.HAv;
import X.HC2;
import X.HCR;
import X.HkK;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;

/* loaded from: BaseItem.class */
public abstract class BaseItem implements Comparable, Parcelable {
    public Uri A00;
    public Uri A01;
    public Uri A02;
    public HC2 A03;
    public HCR A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public BaseItem() {
        this.A04 = HCR.A0N;
    }

    public BaseItem(Parcel parcel) {
        this.A04 = HCR.A0N;
        this.A09 = parcel.readString();
        this.A03 = parcel.readSerializable();
        this.A02 = (Uri) 4YV.A0l(parcel, Uri.class);
        this.A01 = (Uri) 4YV.A0l(parcel, Uri.class);
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A04 = C53v.A07(parcel, HCR.class);
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
    }

    public static ArtItem A01(HAv hAv) {
        HkK hkK = new HkK();
        hkK.A03 = hAv;
        hkK.A0E = hAv.name;
        return new ArtItem(hkK);
    }

    public static Long A02(BaseItem baseItem) {
        return Long.valueOf(baseItem.A03());
    }

    public long A03() {
        String str;
        if (this instanceof EffectItem) {
            try {
                return Long.parseLong(this.A09);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        if ((this instanceof PlaceholderItem) || !(this instanceof ArtItem)) {
            str = this.A09;
        } else {
            ArtItem artItem = (ArtItem) this;
            Sticker sticker = artItem.A04;
            if (sticker == null) {
                HAv hAv = artItem.A05;
                if (hAv == null) {
                    hAv = artItem.A03;
                    if (hAv == null) {
                        hAv = artItem.A01;
                        if (hAv == null) {
                            hAv = artItem.A02;
                            if (hAv == null) {
                                return 0L;
                            }
                        }
                    }
                }
                return GOn.A0B(hAv);
            }
            str = sticker.A0F;
        }
        return Long.parseLong(str);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str;
        BaseItem baseItem = (BaseItem) obj;
        if (baseItem == null || (str = this.A09) == null) {
            throw AnonymousClass001.A0Q("Effect item cannot be null");
        }
        return str.compareTo(baseItem.A09);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeSerializable(this.A03);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C53v.A0J(parcel, this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
    }
}
