package com.facebook.presence.status.suggestions;

import X.11T;
import X.1BL;
import X.AnonymousClass002;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: StatusSuggestion.class */
public final class StatusSuggestion extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(58);
    public final long A00;
    public final Emoji A01;
    public final String A02;
    public final boolean A03;

    public StatusSuggestion(Emoji emoji, String str, long j, boolean z) {
        1BL.A1F(emoji, str);
        this.A01 = emoji;
        this.A02 = str;
        this.A03 = z;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StatusSuggestion)) {
                return false;
            }
            StatusSuggestion statusSuggestion = (StatusSuggestion) obj;
            if (!11T.A0O(this.A01, statusSuggestion.A01) || !11T.A0O(this.A02, statusSuggestion.A02) || this.A03 != statusSuggestion.A03 || this.A00 != statusSuggestion.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A02, 1BL.A03(this.A01)) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + 1BL.A01(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeLong(this.A00);
    }
}
