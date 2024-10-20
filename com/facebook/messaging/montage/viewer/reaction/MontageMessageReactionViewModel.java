package com.facebook.messaging.montage.viewer.reaction;

import X.1BK;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: MontageMessageReactionViewModel.class */
public final class MontageMessageReactionViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(32);
    public final int A00;
    public final UserKey A01;
    public final String A02;

    public MontageMessageReactionViewModel(UserKey userKey, String str, int i) {
        userKey.getClass();
        this.A01 = userKey;
        str.getClass();
        this.A02 = str;
        this.A00 = i;
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
            MontageMessageReactionViewModel montageMessageReactionViewModel = (MontageMessageReactionViewModel) obj;
            if (this.A00 != montageMessageReactionViewModel.A00 || !Objects.equal(this.A01, montageMessageReactionViewModel.A01) || !Objects.equal(this.A02, montageMessageReactionViewModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(1BK.A1a(this.A01, this.A02, this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}
