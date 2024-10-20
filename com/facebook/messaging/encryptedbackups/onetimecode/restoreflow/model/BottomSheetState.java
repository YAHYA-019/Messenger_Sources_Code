package com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model;

import X.11T;
import X.1BL;
import X.4YW;
import X.7zL;
import X.7zU;
import X.AnonymousClass002;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: BottomSheetState.class */
public abstract class BottomSheetState implements Parcelable {

    /* loaded from: BottomSheetState$Error.class */
    public final class Error extends BottomSheetState {
        public static final Parcelable.Creator CREATOR = 7zL.A0v(47);
        public final int A00;

        public Error(int i) {
            this.A00 = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Error) && this.A00 == ((Error) obj).A00);
        }

        public int hashCode() {
            return this.A00;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeInt(this.A00);
        }
    }

    /* loaded from: BottomSheetState$Hidden.class */
    public final class Hidden extends BottomSheetState {
        public static final Hidden A00 = new Object();
        public static final Parcelable.Creator CREATOR = 7zL.A0v(48);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            7zU.A10(parcel);
        }
    }

    /* loaded from: BottomSheetState$LoadingDeviceList.class */
    public final class LoadingDeviceList extends BottomSheetState {
        public static final LoadingDeviceList A00 = new Object();
        public static final Parcelable.Creator CREATOR = 7zL.A0v(49);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            7zU.A10(parcel);
        }
    }

    /* loaded from: BottomSheetState$Visible.class */
    public final class Visible extends BottomSheetState {
        public static final Parcelable.Creator CREATOR = 7zL.A0v(50);
        public final List A00;
        public final boolean A01;
        public final boolean A02;

        public Visible(List list, boolean z, boolean z2) {
            this.A00 = list;
            this.A02 = z;
            this.A01 = z2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof Visible)) {
                    return false;
                }
                Visible visible = (Visible) obj;
                if (!11T.A0O(this.A00, visible.A00) || this.A02 != visible.A02 || this.A01 != visible.A01) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return ((1BL.A03(this.A00) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            Iterator A09 = 4YW.A09(parcel, this.A00);
            while (A09.hasNext()) {
                ((DeviceInfo) A09.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.A02 ? 1 : 0);
            parcel.writeInt(this.A01 ? 1 : 0);
        }
    }
}
