package com.facebook.iabadscontext;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: ReceiverInfo.class */
public final class ReceiverInfo extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(11);
    public final String A00;
    public final String A01;
    public final List A02;

    public ReceiverInfo(String str, String str2, List list) {
        1BL.A1H(str, str2, list);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReceiverInfo)) {
                return false;
            }
            ReceiverInfo receiverInfo = (ReceiverInfo) obj;
            if (!11T.A0O(this.A00, receiverInfo.A00) || !11T.A0O(this.A01, receiverInfo.A01) || !11T.A0O(this.A02, receiverInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A07(this.A01, 4YV.A02(this.A00)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ReceiverInfo(id=");
        A0k.append(this.A00);
        A0k.append(", name=");
        A0k.append(this.A01);
        A0k.append(", validOrigins=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A02);
    }
}
