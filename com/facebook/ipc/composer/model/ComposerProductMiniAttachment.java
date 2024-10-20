package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbG;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerProductMiniAttachment.class */
public final class ComposerProductMiniAttachment implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(59);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ComposerProductMiniAttachment(long j, String str, String str2, String str3) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public ComposerProductMiniAttachment(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readLong();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerProductMiniAttachment)) {
                return false;
            }
            ComposerProductMiniAttachment composerProductMiniAttachment = (ComposerProductMiniAttachment) obj;
            if (this.A00 != composerProductMiniAttachment.A00 || !11T.A0O(this.A01, composerProductMiniAttachment.A01) || !11T.A0O(this.A02, composerProductMiniAttachment.A02) || !11T.A0O(this.A03, composerProductMiniAttachment.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, 1BL.A01(this.A00) + 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
