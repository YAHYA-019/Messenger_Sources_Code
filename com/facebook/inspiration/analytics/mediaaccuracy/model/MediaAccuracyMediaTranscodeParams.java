package com.facebook.inspiration.analytics.mediaaccuracy.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MediaAccuracyMediaTranscodeParams.class */
public final class MediaAccuracyMediaTranscodeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(17);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public MediaAccuracyMediaTranscodeParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        int readInt = parcel.readInt();
        MediaAccuracyGLRenderer[] mediaAccuracyGLRendererArr = new MediaAccuracyGLRenderer[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, mediaAccuracyGLRendererArr, i2);
        }
        this.A05 = ImmutableList.copyOf(mediaAccuracyGLRendererArr);
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A09 = 1BM.A07(parcel);
        this.A0A = AbJ.A1V(parcel);
        this.A03 = parcel.readInt();
        int readInt2 = parcel.readInt();
        MediaAccuracyMediaSegment[] mediaAccuracyMediaSegmentArr = new MediaAccuracyMediaSegment[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, mediaAccuracyMediaSegmentArr, i);
        }
        this.A06 = ImmutableList.copyOf(mediaAccuracyMediaSegmentArr);
        this.A04 = parcel.readInt();
        this.A07 = parcel.readString();
    }

    public MediaAccuracyMediaTranscodeParams(ImmutableList immutableList, ImmutableList immutableList2, String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        C1pq.A08("gLRendererList", immutableList);
        this.A05 = immutableList;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A03 = i4;
        C1pq.A08("mediaSegmentList", immutableList2);
        this.A06 = immutableList2;
        this.A04 = i5;
        C1pq.A08("sourceType", str);
        this.A07 = str;
        if (this.A04 != this.A06.size()) {
            throw AnonymousClass001.A0N("The number of media segments doesn't match");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaAccuracyMediaTranscodeParams)) {
                return false;
            }
            MediaAccuracyMediaTranscodeParams mediaAccuracyMediaTranscodeParams = (MediaAccuracyMediaTranscodeParams) obj;
            if (this.A00 != mediaAccuracyMediaTranscodeParams.A00 || this.A01 != mediaAccuracyMediaTranscodeParams.A01 || this.A02 != mediaAccuracyMediaTranscodeParams.A02 || !11T.A0O(this.A05, mediaAccuracyMediaTranscodeParams.A05) || this.A08 != mediaAccuracyMediaTranscodeParams.A08 || this.A09 != mediaAccuracyMediaTranscodeParams.A09 || this.A0A != mediaAccuracyMediaTranscodeParams.A0A || this.A03 != mediaAccuracyMediaTranscodeParams.A03 || !11T.A0O(this.A06, mediaAccuracyMediaTranscodeParams.A06) || this.A04 != mediaAccuracyMediaTranscodeParams.A04 || !11T.A0O(this.A07, mediaAccuracyMediaTranscodeParams.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, (C1pq.A04(this.A06, (C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A05, ((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02), this.A08), this.A09), this.A0A) * 31) + this.A03) * 31) + this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A05);
        while (A0b.hasNext()) {
            parcel.writeParcelable((MediaAccuracyGLRenderer) A0b.next(), i);
        }
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A03);
        1Du A0b2 = 1BL.A0b(parcel, this.A06);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((MediaAccuracyMediaSegment) A0b2.next(), i);
        }
        parcel.writeInt(this.A04);
        parcel.writeString(this.A07);
    }
}
