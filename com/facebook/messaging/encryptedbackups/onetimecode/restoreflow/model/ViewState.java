package com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model;

import X.0Pz;
import X.11T;
import X.7zL;
import X.7zU;
import X.JQw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: ViewState.class */
public abstract class ViewState implements Parcelable {

    /* loaded from: ViewState$Error.class */
    public final class Error extends ViewState {
        public static final Parcelable.Creator CREATOR = 7zL.A0v(52);
        public final Integer A00;

        public Error(Integer num) {
            11T.A0F(num, 1);
            this.A00 = num;
        }

        public static String A00(Integer num) {
            switch (num.intValue()) {
                case 1:
                    return "RetryCountReached";
                case 2:
                    return "SessionExpired";
                case 3:
                    return "NoSession";
                case 4:
                    return "NoValidDevices";
                case 5:
                    return "Unknown";
                default:
                    return "WrongCode";
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Error) && this.A00 == ((Error) obj).A00);
        }

        public int hashCode() {
            Integer num = this.A00;
            return A00(num).hashCode() + num.intValue();
        }

        public String toString() {
            String A00 = JQw.A00(ActionId.FUTURE_LISTENERS_COMPLETE);
            Integer num = this.A00;
            return 0Pz.A0X(A00, num != null ? A00(num) : "null", ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(A00(this.A00));
        }
    }

    /* loaded from: ViewState$Loading.class */
    public final class Loading extends ViewState {
        public static final Loading A00 = new Object();
        public static final Parcelable.Creator CREATOR = 7zL.A0v(54);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            7zU.A10(parcel);
        }
    }

    /* loaded from: ViewState$Success.class */
    public final class Success extends ViewState {
        public static final Success A00 = new Object();
        public static final Parcelable.Creator CREATOR = 7zL.A0v(55);

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
