package com.facebook.messaging.photos.editing.layer;

import X.11T;
import X.1BL;
import X.4YW;
import X.82M;
import X.AnonymousClass001;
import X.C53v;
import X.HAb;
import X.Hiu;
import X.HtI;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.model.art.ArtItem;
import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.facebook.messaging.photos.editing.model.LayerPosition;

/* loaded from: Layer.class */
public class Layer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(76);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public ArtItem A06;
    public CompositionInfo A07;
    public Hiu A08;
    public Hiu A09;
    public LayerPosition A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final HtI A0I;

    public Layer() {
        this.A0I = new HtI();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0G = true;
    }

    public Layer(Parcel parcel) {
        this();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readFloat();
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        boolean z = true;
        this.A0E = AnonymousClass001.A1N(parcel.readByte());
        this.A01 = parcel.readFloat();
        this.A0A = (LayerPosition) 1BL.A0C(parcel, LayerPosition.class);
        this.A06 = (ArtItem) 1BL.A0C(parcel, ArtItem.class);
        this.A07 = (CompositionInfo) 1BL.A0C(parcel, CompositionInfo.class);
        this.A0G = 4YW.A0K(parcel);
        this.A0H = 4YW.A0K(parcel);
        this.A0D = 4YW.A0K(parcel);
        this.A0C = parcel.readByte() == 0 ? false : z;
        this.A0B = parcel.readString();
        this.A05 = parcel.readInt();
        this.A0F = C53v.A0S(parcel);
    }

    public Layer(ArtItem artItem, Hiu hiu, Hiu hiu2, String str, float f, float f2) {
        this();
        this.A06 = artItem;
        this.A02 = f;
        this.A0E = false;
        this.A01 = f2;
        this.A08 = hiu;
        this.A09 = hiu2;
        this.A0B = str;
        this.A0H = AnonymousClass001.A1T(artItem);
    }

    public float A00() {
        return this.A02;
    }

    public void A01(float f) {
        this.A02 += f;
        this.A0I.A02(HAb.A05);
    }

    public void A02(float f) {
        this.A00 = f;
        this.A0I.A02(HAb.A06);
    }

    public void A03(float f, float f2) {
        this.A03 = f;
        this.A04 = f2;
        this.A0I.A02(HAb.A07);
    }

    public final void A04(boolean z) {
        this.A0C = z;
        this.A0I.A02(HAb.A02);
    }

    public final void A05(boolean z) {
        this.A0D = z;
        this.A0I.A02(HAb.A08);
    }

    public boolean A06() {
        return false;
    }

    public boolean A07() {
        return true;
    }

    public boolean A08() {
        return false;
    }

    public boolean A09() {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A02);
        parcel.writeByte(this.A0E ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.A01);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeByte(this.A0G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0F ? 1 : 0);
    }
}
