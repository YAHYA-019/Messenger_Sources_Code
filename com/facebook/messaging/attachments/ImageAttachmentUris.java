package com.facebook.messaging.attachments;

import X.82M;
import X.C61r;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: ImageAttachmentUris.class */
public final class ImageAttachmentUris implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(13);
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final Uri A03;
    public final Uri A04;
    public final Uri A05;

    public ImageAttachmentUris(C61r c61r) {
        Uri uri = c61r.A02;
        uri.getClass();
        this.A02 = uri;
        this.A04 = c61r.A04;
        this.A03 = c61r.A03;
        this.A01 = c61r.A01;
        this.A00 = c61r.A00;
        this.A05 = c61r.A05;
    }

    public ImageAttachmentUris(Uri uri) {
        uri.getClass();
        this.A02 = uri;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public ImageAttachmentUris(Parcel parcel) {
        this.A02 = (Uri) parcel.readParcelable(null);
        this.A04 = (Uri) parcel.readParcelable(null);
        this.A03 = (Uri) parcel.readParcelable(null);
        this.A01 = (Uri) parcel.readParcelable(null);
        this.A00 = (Uri) parcel.readParcelable(null);
        this.A05 = (Uri) parcel.readParcelable(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof ImageAttachmentUris)) {
            ImageAttachmentUris imageAttachmentUris = (ImageAttachmentUris) obj;
            if (Objects.equal(this.A02, imageAttachmentUris.A02) && Objects.equal(this.A04, imageAttachmentUris.A04) && Objects.equal(this.A03, imageAttachmentUris.A03) && Objects.equal(this.A01, imageAttachmentUris.A01) && Objects.equal(this.A00, imageAttachmentUris.A00) && Objects.equal(this.A05, imageAttachmentUris.A05)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A04, this.A03, this.A01, this.A05});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A05, i);
    }
}
