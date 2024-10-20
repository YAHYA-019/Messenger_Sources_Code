package com.facebook.messaging.tray.model.metadata.notes;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: TrayListItemNotesMetadata.class */
public final class TrayListItemNotesMetadata extends C04v implements Parcelable {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new C4Ny(38);
    public final RichStatus A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(TrayListItemNotesMetadata.class, null);
    }

    public TrayListItemNotesMetadata(RichStatus richStatus) {
        11T.A0F(richStatus, 1);
        this.A00 = richStatus;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TrayListItemNotesMetadata) && 11T.A0O(this.A00, ((TrayListItemNotesMetadata) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TrayListItemNotesMetadata(richStatus=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
