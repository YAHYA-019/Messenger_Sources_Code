package com.facebook.messaging.memories.model;

import X.11T;
import X.AnonymousClass002;
import X.C04v;
import X.C2xc;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MemoriesTrayPogModel.class */
public interface MemoriesTrayPogModel extends Parcelable {

    /* loaded from: MemoriesTrayPogModel$Consent.class */
    public final class Consent extends C04v implements MemoriesTrayPogModel {
        public static final Parcelable.Creator CREATOR = new CSV(34);
        public final boolean A00;

        public Consent(boolean z) {
            this.A00 = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Consent) && this.A00 == ((Consent) obj).A00);
        }

        public int hashCode() {
            return AnonymousClass002.A00(this.A00 ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    /* loaded from: MemoriesTrayPogModel$Memory.class */
    public final class Memory extends C04v implements MemoriesTrayPogModel {
        public static final Memory A01;
        public static final Parcelable.Creator CREATOR = new C2xc(22);
        public final ImmutableList A00;

        static {
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            A01 = new Memory(of);
        }

        public Memory(ImmutableList immutableList) {
            11T.A0F(immutableList, 1);
            this.A00 = immutableList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Memory) && 11T.A0O(this.A00, ((Memory) obj).A00));
        }

        public int hashCode() {
            return this.A00.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeSerializable(this.A00);
        }
    }
}
