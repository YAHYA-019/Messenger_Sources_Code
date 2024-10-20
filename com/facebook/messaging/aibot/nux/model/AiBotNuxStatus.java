package com.facebook.messaging.aibot.nux.model;

import X.11T;
import X.1BK;
import X.AnonymousClass002;
import X.C04v;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: AiBotNuxStatus.class */
public final class AiBotNuxStatus extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(90);
    public final CharSequence A00;
    public final CharSequence A01;
    public final boolean A02;

    public AiBotNuxStatus(CharSequence charSequence, boolean z) {
        11T.A0F(charSequence, 2);
        this.A02 = z;
        this.A00 = charSequence;
        this.A01 = (z || charSequence.length() <= 0) ? null : charSequence;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AiBotNuxStatus)) {
                return false;
            }
            AiBotNuxStatus aiBotNuxStatus = (AiBotNuxStatus) obj;
            if (this.A02 != aiBotNuxStatus.A02 || !11T.A0O(this.A00, aiBotNuxStatus.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A00(this.A02 ? 1 : 0) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        TextUtils.writeToParcel(this.A00, parcel, i);
    }
}
