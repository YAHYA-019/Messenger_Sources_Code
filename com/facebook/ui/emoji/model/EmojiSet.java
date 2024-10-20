package com.facebook.ui.emoji.model;

import X.1BL;
import X.3E2;
import X.AnonymousClass001;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: EmojiSet.class */
public final class EmojiSet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(83);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Metadata A03;

    /* loaded from: EmojiSet$Metadata.class */
    public final class Metadata implements Parcelable {
        public static final Parcelable.Creator CREATOR = new FKe(84);
        public final 3E2 A00;
        public final List A01;

        public Metadata(3E2 r302, List list) {
            this.A00 = r302;
            this.A01 = list;
        }

        public Metadata(Parcel parcel) {
            String readString = parcel.readString();
            this.A00 = readString != null ? 3E2.valueOf(readString) : 3E2.A06;
            ArrayList A0s = AnonymousClass001.A0s();
            this.A01 = A0s;
            parcel.readList(A0s, Emoji.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00.value);
            parcel.writeList(this.A01);
        }
    }

    public EmojiSet(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, Metadata.class);
        A0C.getClass();
        this.A03 = (Metadata) A0C;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public EmojiSet(Metadata metadata, int i, int i2, int i3) {
        this.A03 = metadata;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public boolean A00() {
        return AnonymousClass001.A1W(this.A03.A00, 3E2.A08);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }
}
