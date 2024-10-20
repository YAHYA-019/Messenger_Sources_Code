package com.facebook.ui.media.attachments.source;

import X.82N;
import X.C53v;
import X.C5ev;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: MediaResourceCameraPosition.class */
public final class MediaResourceCameraPosition implements Parcelable {
    public static final MediaResourceCameraPosition A01 = new MediaResourceCameraPosition(C5ev.UNKNOWN);
    public static final Parcelable.Creator CREATOR = new 82N(12);
    public final C5ev A00;

    public MediaResourceCameraPosition(C5ev c5ev) {
        this.A00 = c5ev;
    }

    public MediaResourceCameraPosition(Parcel parcel) {
        this.A00 = (C5ev) C53v.A07(parcel, C5ev.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof MediaResourceCameraPosition) && ((MediaResourceCameraPosition) obj).A00 == this.A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public String toString() {
        return this.A00.analyticsName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A00);
    }
}
