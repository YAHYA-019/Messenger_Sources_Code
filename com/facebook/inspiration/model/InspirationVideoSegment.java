package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Bi;
import X.1Du;
import X.2yD;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AbM;
import X.AbN;
import X.AnonymousClass001;
import X.AnonymousClass047;
import X.C1pq;
import X.C3o5;
import X.DKB;
import X.DKG;
import X.DKH;
import X.EKy;
import X.EMG;
import X.FFp;
import X.FKf;
import X.I9Q;
import X.MRl;
import X.N3R;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.audiosharing.model.AudioTranscriptionParam;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.ipc.media.data.metaverse.MetaGalleryMetadata;
import com.facebook.photos.creativeediting.model.VideoTrimParams;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationVideoSegment.class */
public final class InspirationVideoSegment implements Parcelable {
    public static volatile EMG A0a;
    public static volatile VideoSegmentContext A0b;
    public static volatile MediaData A0c;
    public static final Parcelable.Creator CREATOR = new FKf(74);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AudioTranscriptionParam A04;
    public final InspirationEffectWithSource A05;
    public final EMG A06;
    public final VideoSegmentContext A07;
    public final InspirationZoomCropParams A08;
    public final InspirationZoomCropParams A09;
    public final InspirationZoomCropParams A0A;
    public final MediaData A0B;
    public final MediaData A0C;
    public final MediaData A0D;
    public final MetaGalleryMetadata A0E;
    public final VideoTrimParams A0F;
    public final VideoTrimParams A0G;
    public final ImmutableList A0H;
    public final Boolean A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final Set A0O;
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

    public InspirationVideoSegment(N3R n3r) {
        this.A04 = n3r.A04;
        this.A01 = n3r.A01;
        this.A08 = n3r.A08;
        this.A00 = n3r.A00;
        this.A0B = n3r.A0B;
        this.A0P = n3r.A0P;
        this.A0L = n3r.A0L;
        this.A0Q = n3r.A0Q;
        this.A06 = n3r.A06;
        this.A0R = n3r.A0R;
        this.A0S = n3r.A0S;
        this.A0I = n3r.A0I;
        this.A0T = n3r.A0T;
        this.A0U = n3r.A0U;
        this.A0V = n3r.A0V;
        this.A0W = n3r.A0W;
        this.A0X = n3r.A0X;
        this.A0Y = n3r.A0Y;
        this.A0Z = n3r.A0Z;
        this.A0C = n3r.A0C;
        this.A0D = n3r.A0D;
        this.A09 = n3r.A09;
        this.A05 = n3r.A05;
        this.A0F = n3r.A0F;
        this.A0J = n3r.A0J;
        this.A0K = n3r.A0K;
        this.A0M = n3r.A0M;
        this.A0N = n3r.A0N;
        this.A02 = n3r.A02;
        this.A03 = n3r.A03;
        ImmutableList immutableList = n3r.A0H;
        C1pq.A08(DKB.A00(562), immutableList);
        this.A0H = immutableList;
        this.A0E = n3r.A0E;
        this.A07 = n3r.A07;
        this.A0G = n3r.A0G;
        this.A0A = n3r.A0A;
        this.A0O = Collections.unmodifiableSet(n3r.A0O);
        ((2yD) 1Bi.A03(16385)).AZk(36311049424930641L);
        MediaData A02 = A02();
        if (A02.mType != EKy.A03 || A02.mVideoDurationMs > 0) {
            return;
        }
        AnonymousClass047 A01 = ((FFp) 1Bi.A03(98513)).A01("invalid_video_duration", "InspirationVideoSegment");
        A01.A8J("duration", A02.mVideoDurationMs);
        A01.report();
    }

    public InspirationVideoSegment(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationZoomCropParams inspirationZoomCropParams = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (AudioTranscriptionParam) AudioTranscriptionParam.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = DKG.A0Y(parcel);
        }
        int i = 0;
        this.A0P = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        this.A0Q = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = EMG.values()[parcel.readInt()];
        }
        this.A0R = 1BM.A07(parcel);
        this.A0S = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A0T = 1BM.A07(parcel);
        this.A0U = 1BM.A07(parcel);
        this.A0V = 1BM.A07(parcel);
        this.A0W = 1BM.A07(parcel);
        this.A0X = 1BM.A07(parcel);
        this.A0Y = 1BM.A07(parcel);
        this.A0Z = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (InspirationEffectWithSource) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (VideoTrimParams) VideoTrimParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        int readInt = parcel.readInt();
        InspirationVideoCropParams[] inspirationVideoCropParamsArr = new InspirationVideoCropParams[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationVideoCropParamsArr, i2);
        }
        this.A0H = ImmutableList.copyOf(inspirationVideoCropParamsArr);
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (MetaGalleryMetadata) MetaGalleryMetadata.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (VideoSegmentContext) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (VideoTrimParams) VideoTrimParams.CREATOR.createFromParcel(parcel);
        }
        this.A0A = parcel.readInt() != 0 ? (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel) : inspirationZoomCropParams;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0O = Collections.unmodifiableSet(A0v);
    }

    public EMG A00() {
        if (this.A0O.contains("inspirationMediaSource")) {
            return this.A06;
        }
        if (A0a == null) {
            synchronized (this) {
                if (A0a == null) {
                    A0a = EMG.A0U;
                }
            }
        }
        return A0a;
    }

    public VideoSegmentContext A01() {
        if (this.A0O.contains("videoSegmentContext")) {
            return this.A07;
        }
        if (A0b == null) {
            synchronized (this) {
                if (A0b == null) {
                    A0b = new VideoSegmentContext(null, 0, 0);
                }
            }
        }
        return A0b;
    }

    public MediaData A02() {
        if (this.A0O.contains("mediaData")) {
            return this.A0C;
        }
        if (A0c == null) {
            synchronized (this) {
                if (A0c == null) {
                    I9Q i9q = new I9Q();
                    i9q.A05("");
                    i9q.A03(EKy.A03);
                    i9q.A02(Uri.EMPTY);
                    A0c = new MediaData(i9q);
                }
            }
        }
        return A0c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoSegment)) {
                return false;
            }
            InspirationVideoSegment inspirationVideoSegment = (InspirationVideoSegment) obj;
            if (!11T.A0O(this.A04, inspirationVideoSegment.A04) || this.A01 != inspirationVideoSegment.A01 || !11T.A0O(this.A08, inspirationVideoSegment.A08) || this.A00 != inspirationVideoSegment.A00 || !11T.A0O(this.A0B, inspirationVideoSegment.A0B) || this.A0P != inspirationVideoSegment.A0P || !11T.A0O(this.A0L, inspirationVideoSegment.A0L) || this.A0Q != inspirationVideoSegment.A0Q || A00() != inspirationVideoSegment.A00() || this.A0R != inspirationVideoSegment.A0R || this.A0S != inspirationVideoSegment.A0S || !11T.A0O(this.A0I, inspirationVideoSegment.A0I) || this.A0T != inspirationVideoSegment.A0T || this.A0U != inspirationVideoSegment.A0U || this.A0V != inspirationVideoSegment.A0V || this.A0W != inspirationVideoSegment.A0W || this.A0X != inspirationVideoSegment.A0X || this.A0Y != inspirationVideoSegment.A0Y || this.A0Z != inspirationVideoSegment.A0Z || !11T.A0O(A02(), inspirationVideoSegment.A02()) || !11T.A0O(this.A0D, inspirationVideoSegment.A0D) || !11T.A0O(this.A09, inspirationVideoSegment.A09) || !11T.A0O(this.A05, inspirationVideoSegment.A05) || !11T.A0O(this.A0F, inspirationVideoSegment.A0F) || !11T.A0O(this.A0J, inspirationVideoSegment.A0J) || !11T.A0O(this.A0K, inspirationVideoSegment.A0K) || !11T.A0O(this.A0M, inspirationVideoSegment.A0M) || !11T.A0O(this.A0N, inspirationVideoSegment.A0N) || this.A02 != inspirationVideoSegment.A02 || this.A03 != inspirationVideoSegment.A03 || !11T.A0O(this.A0H, inspirationVideoSegment.A0H) || !11T.A0O(this.A0E, inspirationVideoSegment.A0E) || !11T.A0O(A01(), inspirationVideoSegment.A01()) || !11T.A0O(this.A0G, inspirationVideoSegment.A0G) || !11T.A0O(this.A0A, inspirationVideoSegment.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02(C1pq.A04(this.A0L, C1pq.A02(C1pq.A04(this.A0B, AbM.A00(C1pq.A04(this.A08, (C1pq.A03(this.A04) * 31) + this.A01), this.A00)), this.A0P)), this.A0Q);
        return C1pq.A04(this.A0A, C1pq.A04(this.A0G, C1pq.A04(A01(), C1pq.A04(this.A0E, C1pq.A04(this.A0H, (((C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A0F, C1pq.A04(this.A05, C1pq.A04(this.A09, C1pq.A04(this.A0D, C1pq.A04(A02(), C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0I, C1pq.A02(C1pq.A02((A02 * 31) + C3o5.A03(A00()), this.A0R), this.A0S)), this.A0T), this.A0U), this.A0V), this.A0W), this.A0X), this.A0Y), this.A0Z)))))))))) * 31) + this.A02) * 31) + this.A03)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AudioTranscriptionParam audioTranscriptionParam = this.A04;
        if (audioTranscriptionParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioTranscriptionParam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
        MRl.A0O(parcel, this.A08, i);
        parcel.writeFloat(this.A00);
        DKH.A10(parcel, this.A0B, i);
        parcel.writeInt(this.A0P ? 1 : 0);
        1BL.A13(parcel, this.A0L);
        parcel.writeInt(this.A0Q ? 1 : 0);
        C3o5.A0e(parcel, this.A06);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        AbN.A0s(parcel, this.A0I);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        DKH.A10(parcel, this.A0C, i);
        DKH.A10(parcel, this.A0D, i);
        MRl.A0O(parcel, this.A09, i);
        C3o5.A0d(parcel, this.A05, i);
        MRl.A0P(parcel, this.A0F, i);
        C3o5.A0f(parcel, this.A0J);
        C3o5.A0f(parcel, this.A0K);
        1BL.A13(parcel, this.A0M);
        1BL.A13(parcel, this.A0N);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        1Du A0b2 = 1BL.A0b(parcel, this.A0H);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationVideoCropParams) A0b2.next(), i);
        }
        MetaGalleryMetadata metaGalleryMetadata = this.A0E;
        if (metaGalleryMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metaGalleryMetadata.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A07, i);
        MRl.A0P(parcel, this.A0G, i);
        MRl.A0O(parcel, this.A0A, i);
        Iterator A0S = C3o5.A0S(parcel, this.A0O);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
