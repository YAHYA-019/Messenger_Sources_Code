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

/* loaded from: InspirationVideoTemplateAudioTrack.class */
public final class InspirationVideoTemplateAudioTrack implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(76);
    public final ImmutableList A00;
    public final ImmutableList A01;

    public InspirationVideoTemplateAudioTrack(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        InspirationVideoTemplateMusicAudioClip[] inspirationVideoTemplateMusicAudioClipArr = new InspirationVideoTemplateMusicAudioClip[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationVideoTemplateMusicAudioClipArr, i2);
        }
        this.A00 = ImmutableList.copyOf(inspirationVideoTemplateMusicAudioClipArr);
        int readInt2 = parcel.readInt();
        InspirationVideoTemplateOriginalAudioClip[] inspirationVideoTemplateOriginalAudioClipArr = new InspirationVideoTemplateOriginalAudioClip[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, inspirationVideoTemplateOriginalAudioClipArr, i);
        }
        this.A01 = ImmutableList.copyOf(inspirationVideoTemplateOriginalAudioClipArr);
    }

    public InspirationVideoTemplateAudioTrack(ImmutableList immutableList, ImmutableList immutableList2) {
        C1pq.A08("musicAudioClips", immutableList);
        this.A00 = immutableList;
        C1pq.A08("originalAudioClips", immutableList2);
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateAudioTrack)) {
                return false;
            }
            InspirationVideoTemplateAudioTrack inspirationVideoTemplateAudioTrack = (InspirationVideoTemplateAudioTrack) obj;
            if (!11T.A0O(this.A00, inspirationVideoTemplateAudioTrack.A00) || !11T.A0O(this.A01, inspirationVideoTemplateAudioTrack.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateMusicAudioClip) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateOriginalAudioClip) A0b2.next(), i);
        }
    }
}
