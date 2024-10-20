package com.facebook.ipc.media.data;

import X.0fH;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MimeType.class */
public final class MimeType implements Parcelable {
    public final String mRawType;
    public static final MimeType A05 = new MimeType("image/jpeg");
    public static final MimeType A06 = new MimeType("video/mp4");
    public static final MimeType A07 = new MimeType("image/png");
    public static final MimeType A03 = new MimeType("image/gif");
    public static final MimeType A09 = new MimeType("video/webm");
    public static final MimeType A0A = new MimeType("image/webp");
    public static final MimeType A01 = new MimeType("image/x-adobe-dng");
    public static final MimeType A08 = new MimeType("image/tiff");
    public static final MimeType A04 = new MimeType("model/gltf-binary");
    public static final MimeType A02 = new MimeType();
    public static final MimeType A00 = new MimeType("custom");
    public static final Parcelable.Creator CREATOR = CSR.A00(49);

    public MimeType() {
        this.mRawType = "";
    }

    public MimeType(String str) {
        this.mRawType = str;
    }

    public static MimeType A00(String str) {
        MimeType mimeType;
        if (str != null) {
            int i = 0;
            MimeType[] mimeTypeArr = {A05, A06, A07, A03, A02, A00};
            do {
                mimeType = mimeTypeArr[i];
                if (!mimeType.mRawType.equals(str)) {
                    i++;
                }
            } while (i < 6);
            0fH.A0h(str, "MimeType", "MimeType.create: consider adding MimeType %s");
            return new MimeType(str);
        }
        mimeType = A02;
        return mimeType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            z = false;
            if (obj != null && getClass() == obj.getClass()) {
                String str = this.mRawType;
                z = str.equals(((MimeType) obj).mRawType);
                if (z) {
                    0fH.A17("MimeType", "Duplicate instance that skipped mapping: %s", new Object[]{str});
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return this.mRawType.hashCode();
    }

    public String toString() {
        return this.mRawType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mRawType);
    }
}
