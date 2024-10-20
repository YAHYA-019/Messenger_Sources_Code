package com.meta.foa.cds;

import X.0Pz;
import X.11T;
import X.AnonymousClass001;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CdsBottomSheetTopSpan.class */
public abstract class CdsBottomSheetTopSpan implements Parcelable {

    /* loaded from: CdsBottomSheetTopSpan$Dp.class */
    public final class Dp extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator CREATOR = new LGm(94);
        public final int A00;

        public Dp(int i) {
            this.A00 = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Dp) && this.A00 == ((Dp) obj).A00);
        }

        public int hashCode() {
            return this.A00;
        }

        public String toString() {
            return 0Pz.A0O("Dp(dp=", ')', this.A00);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeInt(this.A00);
        }
    }

    /* loaded from: CdsBottomSheetTopSpan$ScreenPercent.class */
    public final class ScreenPercent extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator CREATOR = new LGm(95);
        public final float A00;

        public ScreenPercent(float f) {
            this.A00 = f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ScreenPercent) && Float.compare(this.A00, ((ScreenPercent) obj).A00) == 0);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public String toString() {
            float f = this.A00;
            StringBuilder A0n = AnonymousClass001.A0n("ScreenPercent(percent=");
            A0n.append(f);
            return AnonymousClass001.A0g(A0n, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeFloat(this.A00);
        }
    }
}
