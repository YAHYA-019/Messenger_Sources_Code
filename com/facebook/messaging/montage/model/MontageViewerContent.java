package com.facebook.messaging.montage.model;

import X.11T;
import X.AnonymousClass001;
import X.C04v;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MontageViewerContent.class */
public final class MontageViewerContent extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(26);
    public final MontageBucketPreview A00;
    public final MontageNoteBucketPreview A01;

    public MontageViewerContent(MontageBucketPreview montageBucketPreview, MontageNoteBucketPreview montageNoteBucketPreview) {
        this.A00 = montageBucketPreview;
        this.A01 = montageNoteBucketPreview;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageViewerContent)) {
                return false;
            }
            MontageViewerContent montageViewerContent = (MontageViewerContent) obj;
            if (!11T.A0O(this.A00, montageViewerContent.A00) || !11T.A0O(this.A01, montageViewerContent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = AnonymousClass001.A02(this.A00) * 31;
        MontageNoteBucketPreview montageNoteBucketPreview = this.A01;
        if (montageNoteBucketPreview != null) {
            i = montageNoteBucketPreview.hashCode();
        }
        return A02 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        MontageNoteBucketPreview montageNoteBucketPreview = this.A01;
        if (montageNoteBucketPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            montageNoteBucketPreview.writeToParcel(parcel, i);
        }
    }
}
