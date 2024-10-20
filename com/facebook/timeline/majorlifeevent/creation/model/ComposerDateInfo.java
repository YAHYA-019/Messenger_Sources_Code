package com.facebook.timeline.majorlifeevent.creation.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.7zN;
import X.C53v;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.uicontrib.datepicker.Date;
import java.util.Arrays;

/* loaded from: ComposerDateInfo.class */
public final class ComposerDateInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(81);
    public final boolean isCurrent;
    public final Date startDate;

    public ComposerDateInfo() {
        Date date = Date.A00;
        11T.A0B(date);
        this.startDate = date;
        this.isCurrent = false;
    }

    public ComposerDateInfo(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, Date.class);
        if (A0C == null) {
            throw 1BK.A0h();
        }
        this.startDate = (Date) A0C;
        this.isCurrent = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerDateInfo)) {
                return false;
            }
            ComposerDateInfo composerDateInfo = (ComposerDateInfo) obj;
            if (!11T.A0O(this.startDate, composerDateInfo.startDate) || this.isCurrent != composerDateInfo.isCurrent) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(7zN.A1b(this.startDate, this.isCurrent));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.startDate, 0);
        parcel.writeInt(this.isCurrent ? 1 : 0);
    }
}
