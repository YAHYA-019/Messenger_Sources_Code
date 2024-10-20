package com.facebook.messaging.encryptedbackups.hsm.ui.viewdata.viewstate;

import X.0Pz;
import X.11T;
import X.1BL;
import X.4YV;
import X.7zL;
import X.7zU;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ViewState.class */
public abstract class ViewState implements Parcelable {

    /* loaded from: ViewState$Loading.class */
    public final class Loading extends ViewState {
        public static final Loading A00 = new Object();
        public static final Parcelable.Creator CREATOR = 7zL.A0v(42);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            7zU.A10(parcel);
        }
    }

    /* loaded from: ViewState$LockedOutError.class */
    public final class LockedOutError extends ViewState {
        public static final Parcelable.Creator CREATOR = 7zL.A0v(43);
        public final String A00;

        public LockedOutError(String str) {
            11T.A0F(str, 1);
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LockedOutError) && 11T.A0O(this.A00, ((LockedOutError) obj).A00));
        }

        public int hashCode() {
            return this.A00.hashCode();
        }

        public String toString() {
            return 0Pz.A0X("LockedOutError(message=", this.A00, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.A00);
        }
    }

    /* loaded from: ViewState$NoError.class */
    public final class NoError extends ViewState {
        public static final NoError A00 = new Object();
        public static final Parcelable.Creator CREATOR = 7zL.A0v(44);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            7zU.A10(parcel);
        }
    }

    /* loaded from: ViewState$RequestLimitError.class */
    public final class RequestLimitError extends ViewState {
        public static final Parcelable.Creator CREATOR = 7zL.A0v(45);
        public final String A00;
        public final int A01;
        public final long A02;

        public RequestLimitError(String str, int i, long j) {
            11T.A0F(str, 1);
            this.A00 = str;
            this.A01 = i;
            this.A02 = j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof RequestLimitError)) {
                    return false;
                }
                RequestLimitError requestLimitError = (RequestLimitError) obj;
                if (!11T.A0O(this.A00, requestLimitError.A00) || this.A01 != requestLimitError.A01 || this.A02 != requestLimitError.A02) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return ((4YV.A02(this.A00) + this.A01) * 31) + 1BL.A01(this.A02);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("RequestLimitError(message=");
            A0k.append(this.A00);
            A0k.append(", attemptsLeft=");
            A0k.append(this.A01);
            A0k.append(", backoffIntervalMillis=");
            A0k.append(this.A02);
            return 4YV.A0x(A0k);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01);
            parcel.writeLong(this.A02);
        }
    }

    /* loaded from: ViewState$SomeError.class */
    public final class SomeError extends ViewState {
        public static final Parcelable.Creator CREATOR = 7zL.A0v(46);
        public final String A00;

        public SomeError(String str) {
            11T.A0F(str, 1);
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SomeError) && 11T.A0O(this.A00, ((SomeError) obj).A00));
        }

        public int hashCode() {
            return this.A00.hashCode();
        }

        public String toString() {
            return 0Pz.A0X("SomeError(message=", this.A00, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.A00);
        }
    }
}
