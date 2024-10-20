package com.facebook.maps.delegate.common.interfaces;

import X.0S2;
import X.4YT;
import X.C53v;
import X.CSR;
import X.KOh;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.maps.model.CameraPosition;

/* loaded from: MapOptions.class */
public final class MapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(73);
    public CameraPosition A03;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0D;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A02 = 1;
    public boolean A0E = true;
    public boolean A0J = true;
    public boolean A0C = true;
    public float A01 = 2.0f;
    public float A00 = 21.0f;
    public KOh A04 = KOh.A03;
    public Integer A05 = 0S2.A0N;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (r307 == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.maps.delegate.common.interfaces.MapOptions A00(android.util.AttributeSet r301) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.maps.delegate.common.interfaces.MapOptions.A00(android.util.AttributeSet):com.facebook.maps.delegate.common.interfaces.MapOptions");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        C53v.A0J(parcel, this.A04);
        switch (this.A05.intValue()) {
            case 1:
                i2 = 457;
                break;
            case 2:
                i2 = 268;
                break;
            case 3:
                i2 = 269;
                break;
            default:
                i2 = 456;
                break;
        }
        parcel.writeString(4YT.A00(i2));
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
