package com.facebook.rti.mqtt.protocol.messages;

import X.09U;
import X.0qE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: SubscribeTopic.class */
public final class SubscribeTopic implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qE(5);
    public final int A00;
    public final String A01;

    public SubscribeTopic(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        parcel.readParcelable(TopicExtraInfo.class.getClassLoader());
    }

    public SubscribeTopic(String str, int i) {
        str.getClass();
        this.A01 = str;
        this.A00 = Integer.valueOf(i).intValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SubscribeTopic subscribeTopic = (SubscribeTopic) obj;
            if (!09U.A00(this.A01, subscribeTopic.A01) || this.A00 != subscribeTopic.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00)});
    }

    public String toString() {
        return String.format("{ name='%s', qos='%s', extra='%s' }", this.A01, Integer.valueOf(this.A00), null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(null, i);
    }
}
