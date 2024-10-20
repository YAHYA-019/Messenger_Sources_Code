package com.facebook.android.maps;

import X.1BL;
import X.2Go;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.maps.model.LatLng;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: StaticMapView$StaticMapOptions.class */
public final class StaticMapView$StaticMapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(94);
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public List A0C = Collections.EMPTY_LIST;

    public StaticMapView$StaticMapOptions(String str) {
        this.A08 = str;
    }

    public void A00() {
        this.A0B = null;
        this.A02 = null;
        this.A0A = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0C.clear();
        this.A09 = null;
    }

    public void A01(double d, double d2) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(d);
        A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0k.append(d2);
        this.A02 = A0k.toString();
    }

    public void A02(LatLng latLng) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(latLng.A00);
        A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0k.append(latLng.A01);
        this.A02 = A0k.toString();
    }

    public void A03(LatLng latLng, int i, int i2) {
        int i3 = (i >>> 24) | (i << 8);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("color:0x");
        Locale locale = Locale.US;
        A0k.append(String.format(locale, "%08X", AnonymousClass001.A1a(i3)).toUpperCase(locale));
        A0k.append('|');
        A0k.append(latLng.A00);
        A0k.append(',');
        A0k.append(latLng.A01);
        A0k.append('|');
        A0k.append(i2);
        this.A03 = AnonymousClass001.A0g(A0k, 'm');
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof StaticMapView$StaticMapOptions)) {
                return false;
            }
            StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = (StaticMapView$StaticMapOptions) obj;
            if (2Go.A00(this.A04, staticMapView$StaticMapOptions.A04) && 2Go.A00(this.A08, staticMapView$StaticMapOptions.A08) && 2Go.A00(this.A0B, staticMapView$StaticMapOptions.A0B) && 2Go.A00(this.A02, staticMapView$StaticMapOptions.A02) && 2Go.A00(this.A0A, staticMapView$StaticMapOptions.A0A) && 2Go.A00(this.A03, staticMapView$StaticMapOptions.A03) && 2Go.A00(this.A05, staticMapView$StaticMapOptions.A05) && 2Go.A00(this.A06, staticMapView$StaticMapOptions.A06) && 2Go.A00(this.A07, staticMapView$StaticMapOptions.A07) && this.A00 == staticMapView$StaticMapOptions.A00 && this.A01 == staticMapView$StaticMapOptions.A01 && this.A0C.equals(staticMapView$StaticMapOptions.A0C) && 2Go.A00(this.A09, staticMapView$StaticMapOptions.A09)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((1BL.A00(1BL.A00((((((((((((((((AbstractC2326GOr.A03(1BL.A05(this.A04)) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A0B)) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A0A)) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A07)) * 31, this.A00), this.A01) + this.A0C.hashCode()) * 31) + 7zN.A05(this.A09);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
    }
}
