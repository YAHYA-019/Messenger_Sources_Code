package com.facebook.messaging.montage.model;

import X.11T;
import X.1BL;
import X.AnonymousClass002;
import X.C04v;
import X.C2fd;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;

/* loaded from: MontageNoteBucketPreview.class */
public final class MontageNoteBucketPreview extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(24);
    public final RichStatus A00;
    public final User A01;
    public final C2fd A02;

    public MontageNoteBucketPreview(RichStatus richStatus, User user, C2fd c2fd) {
        11T.A0F(richStatus, 1);
        11T.A0F(user, 2);
        11T.A0F(c2fd, 3);
        this.A00 = richStatus;
        this.A01 = user;
        this.A02 = c2fd;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageNoteBucketPreview)) {
                return false;
            }
            MontageNoteBucketPreview montageNoteBucketPreview = (MontageNoteBucketPreview) obj;
            if (!11T.A0O(this.A00, montageNoteBucketPreview.A00) || !11T.A0O(this.A01, montageNoteBucketPreview.A01) || this.A02 != montageNoteBucketPreview.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        1BL.A12(parcel, this.A02);
    }
}
