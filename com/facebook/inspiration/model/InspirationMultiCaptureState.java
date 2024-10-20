package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKf;
import X.NAn;
import X.QpO;
import X.RaL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.capture.multicapture.remix.model.InspirationRemixData;
import com.facebook.inspiration.capture.multicapture.remix.model.InspirationRemixableVideoAssetMetaData;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationMultiCaptureState.class */
public final class InspirationMultiCaptureState implements Parcelable, NAn {
    public static volatile InspirationRemixData A0a;
    public static volatile QpO A0b;
    public static final Parcelable.Creator CREATOR = new FKf(59);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final InspirationRemixData A07;
    public final ClipZoomCropParamsBackup A08;
    public final QpO A09;
    public final InspirationFbShortsGallerySelectedMediasModel A0A;
    public final InspirationVideoSegment A0B;
    public final InspirationVideoTemplate A0C;
    public final SoundSyncState A0D;
    public final MediaData A0E;
    public final MusicTrackParams A0F;
    public final ImmutableList A0G;
    public final ImmutableList A0H;
    public final ImmutableList A0I;
    public final ImmutableList A0J;
    public final String A0K;
    public final Set A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InspirationMultiCaptureState(X.N40 r302) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.inspiration.model.InspirationMultiCaptureState.<init>(X.N40):void");
    }

    public InspirationMultiCaptureState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            int readInt = parcel.readInt();
            InspirationRemixableVideoAssetMetaData[] inspirationRemixableVideoAssetMetaDataArr = new InspirationRemixableVideoAssetMetaData[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = DKG.A02(parcel, InspirationRemixableVideoAssetMetaData.CREATOR, inspirationRemixableVideoAssetMetaDataArr, i2);
            }
            this.A0G = ImmutableList.copyOf(inspirationRemixableVideoAssetMetaDataArr);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (InspirationVideoSegment) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = QpO.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (ClipZoomCropParamsBackup) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (InspirationVideoTemplate) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (InspirationFbShortsGallerySelectedMediasModel) parcel.readParcelable(A0e);
        }
        this.A0M = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A00 = parcel.readInt();
        this.A0N = 1BM.A07(parcel);
        this.A0O = 1BM.A07(parcel);
        int readInt2 = parcel.readInt();
        InspirationVideoTemplateVideoIGLUEffect[] inspirationVideoTemplateVideoIGLUEffectArr = new InspirationVideoTemplateVideoIGLUEffect[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoIGLUEffectArr, i3);
        }
        this.A0H = ImmutableList.copyOf(inspirationVideoTemplateVideoIGLUEffectArr);
        this.A0P = 1BM.A07(parcel);
        this.A0Q = 1BM.A07(parcel);
        this.A0R = 1BM.A07(parcel);
        this.A0S = 1BM.A07(parcel);
        this.A0T = 1BM.A07(parcel);
        this.A0U = 1BM.A07(parcel);
        this.A0V = 1BM.A07(parcel);
        this.A0W = 1BM.A07(parcel);
        this.A0X = 1BM.A07(parcel);
        this.A0Y = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (InspirationRemixData) InspirationRemixData.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0Z = AbJ.A1V(parcel);
        this.A04 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (SoundSyncState) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = DKG.A0Y(parcel);
        }
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            InspirationVideoTemplate[] inspirationVideoTemplateArr = new InspirationVideoTemplate[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = AbI.A01(parcel, A0e, inspirationVideoTemplateArr, i4);
            }
            immutableList = ImmutableList.copyOf(inspirationVideoTemplateArr);
        }
        this.A0I = immutableList;
        int readInt4 = parcel.readInt();
        InspirationVideoSegment[] inspirationVideoSegmentArr = new InspirationVideoSegment[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = AbI.A01(parcel, A0e, inspirationVideoSegmentArr, i5);
        }
        this.A0J = ImmutableList.copyOf(inspirationVideoSegmentArr);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt5 = parcel.readInt();
        while (i < readInt5) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0L = Collections.unmodifiableSet(A0v);
    }

    @Override // X.NAn
    public QpO AYB() {
        if (this.A0L.contains("autoAddMusicPillState")) {
            return this.A09;
        }
        if (A0b == null) {
            synchronized (this) {
                if (A0b == null) {
                    A0b = QpO.A05;
                }
            }
        }
        return A0b;
    }

    @Override // X.NAn
    public InspirationRemixData B6n() {
        if (this.A0L.contains("remixData")) {
            return this.A07;
        }
        if (A0a == null) {
            synchronized (this) {
                if (A0a == null) {
                    A0a = new InspirationRemixData(new RaL());
                }
            }
        }
        return A0a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationMultiCaptureState)) {
                return false;
            }
            InspirationMultiCaptureState inspirationMultiCaptureState = (InspirationMultiCaptureState) obj;
            if (!11T.A0O(this.A0G, inspirationMultiCaptureState.A0G) || !11T.A0O(this.A0B, inspirationMultiCaptureState.A0B) || AYB() != inspirationMultiCaptureState.AYB() || !11T.A0O(this.A08, inspirationMultiCaptureState.A08) || !11T.A0O(this.A0F, inspirationMultiCaptureState.A0F) || !11T.A0O(this.A0C, inspirationMultiCaptureState.A0C) || !11T.A0O(this.A0A, inspirationMultiCaptureState.A0A) || this.A0M != inspirationMultiCaptureState.A0M || this.A00 != inspirationMultiCaptureState.A00 || this.A0N != inspirationMultiCaptureState.A0N || this.A0O != inspirationMultiCaptureState.A0O || !11T.A0O(this.A0H, inspirationMultiCaptureState.A0H) || this.A0P != inspirationMultiCaptureState.A0P || this.A0Q != inspirationMultiCaptureState.A0Q || this.A0R != inspirationMultiCaptureState.A0R || this.A0S != inspirationMultiCaptureState.A0S || this.A0T != inspirationMultiCaptureState.A0T || this.A0U != inspirationMultiCaptureState.A0U || this.A0V != inspirationMultiCaptureState.A0V || this.A0W != inspirationMultiCaptureState.A0W || this.A0X != inspirationMultiCaptureState.A0X || this.A0Y != inspirationMultiCaptureState.A0Y || !11T.A0O(this.A0K, inspirationMultiCaptureState.A0K) || !11T.A0O(B6n(), inspirationMultiCaptureState.B6n()) || this.A01 != inspirationMultiCaptureState.A01 || this.A02 != inspirationMultiCaptureState.A02 || this.A03 != inspirationMultiCaptureState.A03 || this.A0Z != inspirationMultiCaptureState.A0Z || this.A04 != inspirationMultiCaptureState.A04 || !11T.A0O(this.A0D, inspirationMultiCaptureState.A0D) || !11T.A0O(this.A0E, inspirationMultiCaptureState.A0E) || this.A05 != inspirationMultiCaptureState.A05 || this.A06 != inspirationMultiCaptureState.A06 || !11T.A0O(this.A0I, inspirationMultiCaptureState.A0I) || !11T.A0O(this.A0J, inspirationMultiCaptureState.A0J)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0B, C1pq.A03(this.A0G));
        return C1pq.A04(this.A0J, C1pq.A04(this.A0I, (((C1pq.A04(this.A0E, C1pq.A04(this.A0D, (C1pq.A02((((((C1pq.A04(B6n(), C1pq.A04(this.A0K, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0H, C1pq.A02(C1pq.A02((C1pq.A02(C1pq.A04(this.A0A, C1pq.A04(this.A0C, C1pq.A04(this.A0F, C1pq.A04(this.A08, (A04 * 31) + C3o5.A03(AYB()))))), this.A0M) * 31) + this.A00, this.A0N), this.A0O)), this.A0P), this.A0Q), this.A0R), this.A0S), this.A0T), this.A0U), this.A0V), this.A0W), this.A0X), this.A0Y))) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03, this.A0Z) * 31) + this.A04)) * 31) + this.A05) * 31) + this.A06));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A0G;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((InspirationRemixableVideoAssetMetaData) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        C3o5.A0d(parcel, this.A0B, i);
        C3o5.A0e(parcel, this.A09);
        C3o5.A0d(parcel, this.A08, i);
        MusicTrackParams musicTrackParams = this.A0F;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A0C, i);
        C3o5.A0d(parcel, this.A0A, i);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        1Du A0b2 = 1BL.A0b(parcel, this.A0H);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoIGLUEffect) A0b2.next(), i);
        }
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        1BL.A13(parcel, this.A0K);
        InspirationRemixData inspirationRemixData = this.A07;
        if (inspirationRemixData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationRemixData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A04);
        C3o5.A0d(parcel, this.A0D, i);
        DKH.A10(parcel, this.A0E, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        ImmutableList immutableList2 = this.A0I;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeParcelable((InspirationVideoTemplate) A0Y2.next(), i);
            }
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A0J);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((InspirationVideoSegment) A0b3.next(), i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0L);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
