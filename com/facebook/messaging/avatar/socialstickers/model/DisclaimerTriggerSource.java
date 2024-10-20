package com.facebook.messaging.avatar.socialstickers.model;

import X.11T;
import X.7zU;
import X.CSR;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DisclaimerTriggerSource.class */
public abstract class DisclaimerTriggerSource implements Parcelable {

    /* loaded from: DisclaimerTriggerSource$DxmaTap.class */
    public final class DxmaTap extends DisclaimerTriggerSource {
        public static final DxmaTap A00 = new Object();
        public static final Parcelable.Creator CREATOR = CSR.A00(97);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeInt(1);
        }
    }

    /* loaded from: DisclaimerTriggerSource$StickerReceive.class */
    public final class StickerReceive extends DisclaimerTriggerSource {
        public static final Parcelable.Creator CREATOR = CSR.A00(98);
        public final String A00;

        public StickerReceive(String str) {
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.A00);
        }
    }

    /* loaded from: DisclaimerTriggerSource$StickerSend.class */
    public final class StickerSend extends DisclaimerTriggerSource {
        public static final StickerSend A00 = new Object();
        public static final Parcelable.Creator CREATOR = new CSR(99);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            7zU.A10(parcel);
        }
    }

    /* loaded from: DisclaimerTriggerSource$StickerTrayOpen.class */
    public final class StickerTrayOpen extends DisclaimerTriggerSource {
        public static final StickerTrayOpen A00 = new Object();
        public static final Parcelable.Creator CREATOR = new CSW(0);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            7zU.A10(parcel);
        }
    }
}
