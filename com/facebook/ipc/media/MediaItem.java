package com.facebook.ipc.media;

import X.1BL;
import X.AbstractC2326GOr;
import X.CSR;
import X.GOo;
import X.I9Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: MediaItem.class */
public final class MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(46);
    public final MediaData A00;

    public MediaItem(Parcel parcel) {
        this.A00 = (MediaData) 1BL.A0C(parcel, MediaData.class);
    }

    public MediaItem(MediaData mediaData) {
        this.A00 = mediaData;
    }

    public MediaItem A00(String str) {
        I9Q i9q = new I9Q(this.A00);
        i9q.A0Q = "CAMERA";
        i9q.A0K = "CAPTURED";
        i9q.A0J = str;
        return AbstractC2326GOr.A0G(i9q);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (com.google.common.base.Objects.equal(((com.facebook.ipc.media.MediaItem) r302).A00.mId, r301.A00.mId) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.ipc.media.MediaItem
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2e
            r0 = r302
            com.facebook.ipc.media.MediaItem r0 = (com.facebook.ipc.media.MediaItem) r0
            r302 = r0
            r0 = r302
            com.facebook.ipc.media.data.MediaData r0 = r0.A00
            java.lang.String r0 = r0.mId
            r304 = r0
            r0 = r301
            com.facebook.ipc.media.data.MediaData r0 = r0.A00
            java.lang.String r0 = r0.mId
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L33
        L2e:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L33:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ipc.media.MediaItem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00.A06()});
    }

    public String toString() {
        return String.format(Locale.US, "MediaItem(%s)", GOo.A1a(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
