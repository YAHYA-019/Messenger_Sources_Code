package com.facebook.messaging.montage.model.cards;

import X.1BL;
import X.AnonymousClass001;
import X.C53v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MontageFeedbackPoll.class */
public final class MontageFeedbackPoll implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(11);
    public final int A00;
    public final LoggingData A01;
    public final MontageStickerOverlayBounds A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    /* loaded from: MontageFeedbackPoll$LoggingData.class */
    public final class LoggingData implements Parcelable {
        public static final Parcelable.Creator CREATOR = CST.A00(12);
        public final float A00;
        public final String A01;
        public final boolean A02;

        public LoggingData(Parcel parcel) {
            this.A02 = C53v.A0S(parcel);
            this.A01 = parcel.readString();
            this.A00 = parcel.readFloat();
        }

        public LoggingData(String str, float f, boolean z) {
            this.A02 = z;
            this.A01 = str;
            this.A00 = f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A02 ? 1 : 0);
            parcel.writeString(this.A01);
            parcel.writeFloat(this.A00);
        }
    }

    public MontageFeedbackPoll(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        boolean z = true;
        this.A08 = AnonymousClass001.A1N(parcel.readByte());
        this.A00 = parcel.readInt();
        this.A02 = (MontageStickerOverlayBounds) 1BL.A0C(parcel, MontageStickerOverlayBounds.class);
        this.A03 = C53v.A02(parcel, MontageFeedbackPollOption.CREATOR);
        this.A01 = (LoggingData) 1BL.A0C(parcel, LoggingData.class);
        this.A09 = parcel.readByte() == 0 ? false : z;
    }

    public MontageFeedbackPoll(LoggingData loggingData, MontageStickerOverlayBounds montageStickerOverlayBounds, ImmutableList immutableList, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A08 = z;
        this.A00 = i;
        this.A02 = montageStickerOverlayBounds;
        this.A03 = immutableList;
        this.A01 = loggingData;
        this.A09 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        C53v.A0D(parcel, this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
    }
}
