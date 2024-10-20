package com.facebook.messaging.highlightstab.model;

import X.0Q8;
import X.11T;
import X.4YV;
import X.5Yu;
import X.5cH;
import X.7mU;
import X.7zL;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsReactionContent.class */
public final class HighlightsReactionContent extends C04v implements Parcelable {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final boolean A04;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = 7zL.A0v(79);

    /* loaded from: HighlightsReactionContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return 5cH.A00;
        }
    }

    public /* synthetic */ HighlightsReactionContent(String str, int i, int i2, long j, long j2, boolean z) {
        if (31 != (i & 31)) {
            7mU.A00(5cH.A01, i, 31);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A04 = z;
        this.A02 = j;
        this.A00 = i2;
        this.A01 = j2;
    }

    public HighlightsReactionContent(String str, int i, long j, long j2, boolean z) {
        11T.A0F(str, 1);
        this.A03 = str;
        this.A04 = z;
        this.A02 = j;
        this.A00 = i;
        this.A01 = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsReactionContent)) {
                return false;
            }
            HighlightsReactionContent highlightsReactionContent = (HighlightsReactionContent) obj;
            if (!11T.A0O(this.A03, highlightsReactionContent.A03) || this.A04 != highlightsReactionContent.A04 || this.A02 != highlightsReactionContent.A02 || this.A00 != highlightsReactionContent.A00 || this.A01 != highlightsReactionContent.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = (AnonymousClass002.A02(this.A02, (4YV.A02(this.A03) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + this.A00) * 31;
        long j = this.A01;
        return A02 + ((int) (j ^ (j >>> 32)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
