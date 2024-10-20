package com.facebook.ui.media.attachments.source;

import X.4YV;
import X.82N;
import X.C53v;
import X.C5es;
import X.C5et;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Platform;
import java.util.Arrays;

/* loaded from: MediaResourceSendSource.class */
public final class MediaResourceSendSource implements Parcelable {
    public static final MediaResourceSendSource A03 = new MediaResourceSendSource(C5es.A0p, C5et.UNSPECIFIED);
    public static final Parcelable.Creator CREATOR = new 82N(13);
    public final C5es A00;
    public final C5et A01;
    public final String A02;

    public MediaResourceSendSource(C5es c5es, C5et c5et) {
        this(c5es, c5et, null);
    }

    public MediaResourceSendSource(C5es c5es, C5et c5et, String str) {
        this.A00 = c5es;
        this.A01 = c5et;
        this.A02 = str;
    }

    public MediaResourceSendSource(Parcel parcel) {
        this.A00 = (C5es) C53v.A07(parcel, C5es.class);
        this.A01 = (C5et) C53v.A07(parcel, C5et.class);
        this.A02 = parcel.readString();
    }

    public static MediaResourceSendSource A00(String str) {
        String[] split;
        int length;
        String[] split2;
        int length2;
        C5es c5es;
        C5et c5et;
        if (Platform.stringIsNullOrEmpty(str) || (length = (split = str.split("_")).length) > 2 || length < 1 || (length2 = (split2 = split[0].split("#")).length) > 2 || length2 < 1) {
            return A03;
        }
        String str2 = split2[0];
        C5es[] values = C5es.values();
        int length3 = values.length;
        int i = 0;
        while (true) {
            if (i >= length3) {
                c5es = C5es.A0p;
                break;
            }
            c5es = values[i];
            if (c5es.analyticsName.equals(str2)) {
                break;
            }
            i++;
        }
        String str3 = null;
        if (split2.length > 1) {
            String str4 = split2[1];
            if (str4.length() > 0) {
                str3 = str4;
            }
        }
        if (length > 1) {
            String str5 = split[1];
            C5et[] values2 = C5et.values();
            int length4 = values2.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length4) {
                    break;
                }
                c5et = values2[i3];
                if (c5et.analyticsName.equals(str5)) {
                    break;
                }
                i2 = i3 + 1;
            }
        }
        c5et = C5et.UNSPECIFIED;
        return new MediaResourceSendSource(c5es, c5et, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof MediaResourceSendSource)) {
            MediaResourceSendSource mediaResourceSendSource = (MediaResourceSendSource) obj;
            if (this.A00 == mediaResourceSendSource.A00 && this.A01 == mediaResourceSendSource.A01) {
                z = 4YV.A1Z(this.A02, mediaResourceSendSource.A02);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A02});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.analyticsName);
        String str = this.A02;
        if (str != null) {
            sb.append("#");
            sb.append(str);
        }
        C5et c5et = this.A01;
        if (c5et != C5et.UNSPECIFIED) {
            sb.append('_');
            sb.append(c5et.analyticsName);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A00);
        C53v.A0J(parcel, this.A01);
        parcel.writeString(this.A02);
    }
}
