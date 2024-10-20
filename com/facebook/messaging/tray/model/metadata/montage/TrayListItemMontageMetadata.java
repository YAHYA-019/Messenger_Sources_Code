package com.facebook.messaging.tray.model.metadata.montage;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: TrayListItemMontageMetadata.class */
public final class TrayListItemMontageMetadata extends C04v implements Parcelable {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new C4Ny(37);
    public final MontageBucketPreview A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(TrayListItemMontageMetadata.class, null);
    }

    public TrayListItemMontageMetadata(MontageBucketPreview montageBucketPreview) {
        11T.A0F(montageBucketPreview, 1);
        this.A00 = montageBucketPreview;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TrayListItemMontageMetadata) && 11T.A0O(this.A00, ((TrayListItemMontageMetadata) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TrayListItemMontageMetadata(montageThreadInfo=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
