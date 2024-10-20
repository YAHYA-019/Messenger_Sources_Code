package com.facebook.xapp.messaging.threadview.model.highlightstab;

import X.11T;
import X.1BL;
import X.5PP;
import X.65N;
import X.82N;
import X.C04v;
import X.C5g3;
import X.C5gJ;
import X.C5wh;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsTabMetadata.class */
public final class HighlightsTabMetadata extends C04v implements Parcelable, 5PP {
    public final 65N A00;
    public final HighlightsTabBirthdayReplyMetadata A01;
    public final C5wh A02;
    public final boolean A03;
    public static final Parcelable.Creator CREATOR = new 82N(33);
    public static final C5g3 A04 = C5gJ.A00;

    public HighlightsTabMetadata() {
        this(null, null, C5wh.A09, false);
    }

    public HighlightsTabMetadata(65N r302, HighlightsTabBirthdayReplyMetadata highlightsTabBirthdayReplyMetadata, C5wh c5wh, boolean z) {
        11T.A0F(c5wh, 2);
        this.A03 = z;
        this.A02 = c5wh;
        this.A00 = r302;
        this.A01 = highlightsTabBirthdayReplyMetadata;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsTabMetadata)) {
                return false;
            }
            HighlightsTabMetadata highlightsTabMetadata = (HighlightsTabMetadata) obj;
            if (this.A03 != highlightsTabMetadata.A03 || this.A02 != highlightsTabMetadata.A02 || this.A00 != highlightsTabMetadata.A00 || !11T.A0O(this.A01, highlightsTabMetadata.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int hashCode = ((i * 31) + this.A02.hashCode()) * 31;
        65N r0 = this.A00;
        int i2 = 0;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        HighlightsTabBirthdayReplyMetadata highlightsTabBirthdayReplyMetadata = this.A01;
        if (highlightsTabBirthdayReplyMetadata != null) {
            i2 = highlightsTabBirthdayReplyMetadata.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        1BL.A12(parcel, this.A02);
        65N r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, r0);
        }
        parcel.writeValue(this.A01);
    }
}
