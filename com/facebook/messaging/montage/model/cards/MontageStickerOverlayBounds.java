package com.facebook.messaging.montage.model.cards;

import X.82M;
import X.AbstractC01033pi;
import X.C27T;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: MontageStickerOverlayBounds.class */
public class MontageStickerOverlayBounds implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(60);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    /* loaded from: MontageStickerOverlayBounds$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        public static final MontageStickerOverlayBounds_MontageStickerOverlayBoundsBuilderDeserializer A00 = new MontageStickerOverlayBounds_MontageStickerOverlayBoundsBuilderDeserializer();

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return ((MontageStickerOverlayBoundsBuilder) A00.A0M(abstractC01033pi, c27t)).A00();
        }
    }

    /* loaded from: MontageStickerOverlayBounds$MontageStickerOverlayBoundsBuilder.class */
    public class MontageStickerOverlayBoundsBuilder {
        public double A00;
        public double A01;
        public double A02;
        public double A03;
        public double A04;

        public MontageStickerOverlayBounds A00() {
            return new MontageStickerOverlayBounds(this.A00, this.A01, this.A04, this.A02, this.A03);
        }

        public MontageStickerOverlayBoundsBuilder setBoundX(double d) {
            this.A00 = d;
            return this;
        }

        public MontageStickerOverlayBoundsBuilder setBoundY(double d) {
            this.A01 = d;
            return this;
        }

        public MontageStickerOverlayBoundsBuilder setHeight(double d) {
            this.A02 = d;
            return this;
        }

        public MontageStickerOverlayBoundsBuilder setRotation(double d) {
            this.A03 = d;
            return this;
        }

        public MontageStickerOverlayBoundsBuilder setWidth(double d) {
            this.A04 = d;
            return this;
        }
    }

    public MontageStickerOverlayBounds(double d, double d2, double d3, double d4, double d5) {
        this.A00 = d;
        this.A01 = d2;
        this.A04 = d3;
        this.A02 = d4;
        this.A03 = d5;
    }

    public MontageStickerOverlayBounds(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A04 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getBoundX() {
        return this.A00;
    }

    public double getBoundY() {
        return this.A01;
    }

    public double getHeight() {
        return this.A02;
    }

    public double getRotation() {
        return this.A03;
    }

    public double getWidth() {
        return this.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A04);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
    }
}
