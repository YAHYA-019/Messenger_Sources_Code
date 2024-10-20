package com.facebook.messaging.threadview.params;

import X.11T;
import X.1BL;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadAndMaybeMessage.class */
public final class ThreadAndMaybeMessage extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(82);
    public final ThreadKey A00;
    public final String A01;

    public ThreadAndMaybeMessage(ThreadKey threadKey, String str) {
        11T.A0F(threadKey, 1);
        this.A00 = threadKey;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadAndMaybeMessage)) {
                return false;
            }
            ThreadAndMaybeMessage threadAndMaybeMessage = (ThreadAndMaybeMessage) obj;
            if (!11T.A0O(this.A00, threadAndMaybeMessage.A00) || !11T.A0O(this.A01, threadAndMaybeMessage.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1BL.A05(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
