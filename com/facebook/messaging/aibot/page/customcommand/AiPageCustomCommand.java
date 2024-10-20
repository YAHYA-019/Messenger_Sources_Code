package com.facebook.messaging.aibot.page.customcommand;

import X.11T;
import X.7zS;
import X.AnonymousClass002;
import X.C04v;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AiPageCustomCommand.class */
public final class AiPageCustomCommand extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(91);
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final long A05;
    public final String A06;

    public AiPageCustomCommand(String str, String str2, String str3, int i, long j, long j2, boolean z) {
        7zS.A17(3, str, str2, str3);
        this.A05 = j;
        this.A01 = j2;
        this.A03 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A04 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AiPageCustomCommand)) {
                return false;
            }
            AiPageCustomCommand aiPageCustomCommand = (AiPageCustomCommand) obj;
            if (this.A05 != aiPageCustomCommand.A05 || this.A01 != aiPageCustomCommand.A01 || !11T.A0O(this.A03, aiPageCustomCommand.A03) || !11T.A0O(this.A02, aiPageCustomCommand.A02) || !11T.A0O(this.A06, aiPageCustomCommand.A06) || this.A04 != aiPageCustomCommand.A04 || this.A00 != aiPageCustomCommand.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A06, AnonymousClass002.A07(this.A02, AnonymousClass002.A07(this.A03, AnonymousClass002.A02(this.A01, AnonymousClass002.A01(this.A05))))) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
