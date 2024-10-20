package com.meta.foa.cds;

import X.11T;
import X.AnonymousClass001;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: CdsBottomSheetDimmingBehaviour.class */
public abstract class CdsBottomSheetDimmingBehaviour implements Parcelable {

    /* loaded from: CdsBottomSheetDimmingBehaviour$Default.class */
    public final class Default extends CdsBottomSheetDimmingBehaviour {
        public static final Default A00 = new Object();
        public static final Parcelable.Creator CREATOR = new LGm(92);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj && !(obj instanceof Default)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return -1522220413;
        }

        public String toString() {
            return ServerW3CShippingAddressConstants.DEFAULT;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeInt(1);
        }
    }

    /* loaded from: CdsBottomSheetDimmingBehaviour$FixedAlpha.class */
    public final class FixedAlpha extends CdsBottomSheetDimmingBehaviour {
        public static final Parcelable.Creator CREATOR = new LGm(93);
        public final float A00;

        public FixedAlpha() {
            this(0.5f);
        }

        public FixedAlpha(float f) {
            this.A00 = f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FixedAlpha) && Float.compare(this.A00, ((FixedAlpha) obj).A00) == 0);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public String toString() {
            float f = this.A00;
            StringBuilder A0n = AnonymousClass001.A0n("FixedAlpha(alpha=");
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
