package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationVideoTemplateVideoTrack.class */
public final class InspirationVideoTemplateVideoTrack implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(85);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;

    public InspirationVideoTemplateVideoTrack(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        InspirationVideoTemplateVideoAREffect[] inspirationVideoTemplateVideoAREffectArr = new InspirationVideoTemplateVideoAREffect[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoAREffectArr, i2);
        }
        this.A00 = ImmutableList.copyOf(inspirationVideoTemplateVideoAREffectArr);
        int readInt2 = parcel.readInt();
        InspirationVideoTemplateVideoClip[] inspirationVideoTemplateVideoClipArr = new InspirationVideoTemplateVideoClip[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoClipArr, i3);
        }
        this.A01 = ImmutableList.copyOf(inspirationVideoTemplateVideoClipArr);
        int readInt3 = parcel.readInt();
        InspirationVideoTemplateVideoIGLUEffect[] inspirationVideoTemplateVideoIGLUEffectArr = new InspirationVideoTemplateVideoIGLUEffect[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoIGLUEffectArr, i4);
        }
        this.A02 = ImmutableList.copyOf(inspirationVideoTemplateVideoIGLUEffectArr);
        int readInt4 = parcel.readInt();
        InspirationVideoTemplateVideoTransition[] inspirationVideoTemplateVideoTransitionArr = new InspirationVideoTemplateVideoTransition[readInt4];
        while (i < readInt4) {
            i = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoTransitionArr, i);
        }
        this.A03 = ImmutableList.copyOf(inspirationVideoTemplateVideoTransitionArr);
    }

    public InspirationVideoTemplateVideoTrack(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4) {
        C1pq.A08("arEffects", immutableList);
        this.A00 = immutableList;
        C1pq.A08("clips", immutableList2);
        this.A01 = immutableList2;
        C1pq.A08("igluEffects", immutableList3);
        this.A02 = immutableList3;
        C1pq.A08("transitions", immutableList4);
        this.A03 = immutableList4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateVideoTrack)) {
                return false;
            }
            InspirationVideoTemplateVideoTrack inspirationVideoTemplateVideoTrack = (InspirationVideoTemplateVideoTrack) obj;
            if (!11T.A0O(this.A00, inspirationVideoTemplateVideoTrack.A00) || !11T.A0O(this.A01, inspirationVideoTemplateVideoTrack.A01) || !11T.A0O(this.A02, inspirationVideoTemplateVideoTrack.A02) || !11T.A0O(this.A03, inspirationVideoTemplateVideoTrack.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoAREffect) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoClip) A0b2.next(), i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A02);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoIGLUEffect) A0b3.next(), i);
        }
        1Du A0b4 = 1BL.A0b(parcel, this.A03);
        while (A0b4.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoTransition) A0b4.next(), i);
        }
    }
}
