package com.facebook.xapp.messaging.publicchats.prompt.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PromptArgs.class */
public final class PromptArgs extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(58);
    public final long A00;
    public final ThreadKey A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public PromptArgs(ThreadKey threadKey, String str, String str2, long j, boolean z) {
        1BL.A1F(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = threadKey;
        this.A04 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PromptArgs)) {
                return false;
            }
            PromptArgs promptArgs = (PromptArgs) obj;
            if (!11T.A0O(this.A02, promptArgs.A02) || !11T.A0O(this.A03, promptArgs.A03) || this.A00 != promptArgs.A00 || !11T.A0O(this.A01, promptArgs.A01) || this.A04 != promptArgs.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A03, 4YV.A02(this.A02))) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
