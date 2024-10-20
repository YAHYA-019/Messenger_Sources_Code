package com.facebook.video.creativeediting.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbM;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKb;
import X.RZW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.imagetovideo.model.VideoConversionConfiguration;
import com.facebook.inspiration.model.InspirationVideoTemplateVideoIGLUEffect;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.facebook.photos.creativeediting.model.DoodleParams;
import com.facebook.photos.creativeediting.model.MusicSaveParams;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.facebook.photos.creativeediting.model.RemixParams;
import com.facebook.photos.creativeediting.model.VideoTrimParams;
import com.facebook.photos.creativeediting.model.audio.AudioTrackParams;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.facebook.spherical.video.model.KeyframeParams;
import com.facebook.videocodec.effects.persistence.common.PersistedGLRenderer;
import com.google.common.collect.ImmutableList;

/* loaded from: VideoCreativeEditingData.class */
public final class VideoCreativeEditingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(5);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final VideoConversionConfiguration A04;
    public final InspirationZoomCropParams A05;
    public final MusicSaveParams A06;
    public final MusicTrackParams A07;
    public final RemixParams A08;
    public final VideoTrimParams A09;
    public final PersistableRect A0A;
    public final ImmutableList A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final ImmutableList A0G;
    public final ImmutableList A0H;
    public final Boolean A0I;
    public final Float A0J;
    public final Float A0K;
    public final Integer A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public VideoCreativeEditingData(RZW rzw) {
        this.A0J = rzw.A0J;
        ImmutableList immutableList = rzw.A0B;
        C1pq.A08("audioTrackParams", immutableList);
        this.A0B = immutableList;
        this.A0M = rzw.A0M;
        this.A0A = rzw.A0A;
        this.A0N = rzw.A0N;
        ImmutableList immutableList2 = rzw.A0C;
        C1pq.A08("doodleParamsList", immutableList2);
        this.A0C = immutableList2;
        this.A0R = rzw.A0R;
        ImmutableList immutableList3 = rzw.A0D;
        C1pq.A08("igluEffects", immutableList3);
        this.A0D = immutableList3;
        this.A0S = rzw.A0S;
        this.A0T = rzw.A0T;
        this.A0I = rzw.A0I;
        this.A0U = rzw.A0U;
        ImmutableList immutableList4 = rzw.A0E;
        C1pq.A08("keyframes", immutableList4);
        this.A0E = immutableList4;
        this.A0O = rzw.A0O;
        this.A06 = rzw.A06;
        this.A07 = rzw.A07;
        this.A00 = rzw.A00;
        this.A0P = rzw.A0P;
        this.A0Q = rzw.A0Q;
        ImmutableList immutableList5 = rzw.A0F;
        C1pq.A08("persistedRenderers", immutableList5);
        this.A0F = immutableList5;
        this.A08 = rzw.A08;
        this.A01 = rzw.A01;
        this.A0V = rzw.A0V;
        this.A0L = rzw.A0L;
        this.A02 = rzw.A02;
        this.A03 = rzw.A03;
        this.A04 = rzw.A04;
        this.A0G = rzw.A0G;
        ImmutableList immutableList6 = rzw.A0H;
        C1pq.A08("videoSegmentsList", immutableList6);
        this.A0H = immutableList6;
        this.A09 = rzw.A09;
        this.A0K = rzw.A0K;
        this.A05 = rzw.A05;
    }

    public VideoCreativeEditingData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationZoomCropParams inspirationZoomCropParams = null;
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = Float.valueOf(parcel.readFloat());
        }
        int readInt = parcel.readInt();
        AudioTrackParams[] audioTrackParamsArr = new AudioTrackParams[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, AudioTrackParams.CREATOR, audioTrackParamsArr, i2);
        }
        this.A0B = ImmutableList.copyOf(audioTrackParamsArr);
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        int readInt2 = parcel.readInt();
        DoodleParams[] doodleParamsArr = new DoodleParams[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = DKG.A02(parcel, DoodleParams.CREATOR, doodleParamsArr, i3);
        }
        this.A0C = ImmutableList.copyOf(doodleParamsArr);
        this.A0R = AnonymousClass001.A1Q(parcel.readInt(), 1);
        int readInt3 = parcel.readInt();
        InspirationVideoTemplateVideoIGLUEffect[] inspirationVideoTemplateVideoIGLUEffectArr = new InspirationVideoTemplateVideoIGLUEffect[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = DKG.A02(parcel, InspirationVideoTemplateVideoIGLUEffect.CREATOR, inspirationVideoTemplateVideoIGLUEffectArr, i4);
        }
        this.A0D = ImmutableList.copyOf(inspirationVideoTemplateVideoIGLUEffectArr);
        this.A0S = 1BM.A07(parcel);
        this.A0T = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A0U = 1BM.A07(parcel);
        int readInt4 = parcel.readInt();
        KeyframeParams[] keyframeParamsArr = new KeyframeParams[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = DKG.A02(parcel, KeyframeParams.CREATOR, keyframeParamsArr, i5);
        }
        this.A0E = ImmutableList.copyOf(keyframeParamsArr);
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (MusicSaveParams) MusicSaveParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = parcel.readString();
        }
        int readInt5 = parcel.readInt();
        PersistedGLRenderer[] persistedGLRendererArr = new PersistedGLRenderer[readInt5];
        int i6 = 0;
        while (i6 < readInt5) {
            i6 = DKG.A02(parcel, PersistedGLRenderer.CREATOR, persistedGLRendererArr, i6);
        }
        this.A0F = ImmutableList.copyOf(persistedGLRendererArr);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (RemixParams) RemixParams.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt();
        this.A0V = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = AbI.A0z(parcel);
        }
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (VideoConversionConfiguration) VideoConversionConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            int readInt6 = parcel.readInt();
            ClipMetaData[] clipMetaDataArr = new ClipMetaData[readInt6];
            int i7 = 0;
            while (i7 < readInt6) {
                i7 = AbI.A01(parcel, A0e, clipMetaDataArr, i7);
            }
            this.A0G = ImmutableList.copyOf(clipMetaDataArr);
        }
        int readInt7 = parcel.readInt();
        VideoSegmentHolder[] videoSegmentHolderArr = new VideoSegmentHolder[readInt7];
        while (i < readInt7) {
            i = AbI.A01(parcel, A0e, videoSegmentHolderArr, i);
        }
        this.A0H = ImmutableList.copyOf(videoSegmentHolderArr);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (VideoTrimParams) VideoTrimParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = Float.valueOf(parcel.readFloat());
        }
        this.A05 = parcel.readInt() != 0 ? (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel) : inspirationZoomCropParams;
    }

    public static RZW A00(VideoCreativeEditingData videoCreativeEditingData) {
        return videoCreativeEditingData != null ? new RZW(videoCreativeEditingData) : new RZW();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoCreativeEditingData)) {
                return false;
            }
            VideoCreativeEditingData videoCreativeEditingData = (VideoCreativeEditingData) obj;
            if (!11T.A0O(this.A0J, videoCreativeEditingData.A0J) || !11T.A0O(this.A0B, videoCreativeEditingData.A0B) || !11T.A0O(this.A0M, videoCreativeEditingData.A0M) || !11T.A0O(this.A0A, videoCreativeEditingData.A0A) || !11T.A0O(this.A0N, videoCreativeEditingData.A0N) || !11T.A0O(this.A0C, videoCreativeEditingData.A0C) || this.A0R != videoCreativeEditingData.A0R || !11T.A0O(this.A0D, videoCreativeEditingData.A0D) || this.A0S != videoCreativeEditingData.A0S || this.A0T != videoCreativeEditingData.A0T || !11T.A0O(this.A0I, videoCreativeEditingData.A0I) || this.A0U != videoCreativeEditingData.A0U || !11T.A0O(this.A0E, videoCreativeEditingData.A0E) || !11T.A0O(this.A0O, videoCreativeEditingData.A0O) || !11T.A0O(this.A06, videoCreativeEditingData.A06) || !11T.A0O(this.A07, videoCreativeEditingData.A07) || this.A00 != videoCreativeEditingData.A00 || !11T.A0O(this.A0P, videoCreativeEditingData.A0P) || !11T.A0O(this.A0Q, videoCreativeEditingData.A0Q) || !11T.A0O(this.A0F, videoCreativeEditingData.A0F) || !11T.A0O(this.A08, videoCreativeEditingData.A08) || this.A01 != videoCreativeEditingData.A01 || this.A0V != videoCreativeEditingData.A0V || !11T.A0O(this.A0L, videoCreativeEditingData.A0L) || this.A02 != videoCreativeEditingData.A02 || this.A03 != videoCreativeEditingData.A03 || !11T.A0O(this.A04, videoCreativeEditingData.A04) || !11T.A0O(this.A0G, videoCreativeEditingData.A0G) || !11T.A0O(this.A0H, videoCreativeEditingData.A0H) || !11T.A0O(this.A09, videoCreativeEditingData.A09) || !11T.A0O(this.A0K, videoCreativeEditingData.A0K) || !11T.A0O(this.A05, videoCreativeEditingData.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A0K, C1pq.A04(this.A09, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A04, (((C1pq.A04(this.A0L, C1pq.A02((C1pq.A04(this.A08, C1pq.A04(this.A0F, C1pq.A04(this.A0Q, C1pq.A04(this.A0P, AbM.A00(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A0O, C1pq.A04(this.A0E, C1pq.A02(C1pq.A04(this.A0I, C1pq.A02(C1pq.A02(C1pq.A04(this.A0D, C1pq.A02(C1pq.A04(this.A0C, C1pq.A04(this.A0N, C1pq.A04(this.A0A, C1pq.A04(this.A0M, C1pq.A04(this.A0B, C1pq.A03(this.A0J)))))), this.A0R)), this.A0S), this.A0T)), this.A0U))))), this.A00))))) * 31) + this.A01, this.A0V)) * 31) + this.A02) * 31) + this.A03))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A12(parcel, this.A0J);
        1Du A0b = 1BL.A0b(parcel, this.A0B);
        while (A0b.hasNext()) {
            ((AudioTrackParams) A0b.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0M);
        DKH.A11(parcel, this.A0A, i);
        1BL.A13(parcel, this.A0N);
        1Du A0b2 = 1BL.A0b(parcel, this.A0C);
        while (A0b2.hasNext()) {
            ((DoodleParams) A0b2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0R ? 1 : 0);
        1Du A0b3 = 1BL.A0b(parcel, this.A0D);
        while (A0b3.hasNext()) {
            ((InspirationVideoTemplateVideoIGLUEffect) A0b3.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        AbN.A0s(parcel, this.A0I);
        parcel.writeInt(this.A0U ? 1 : 0);
        1Du A0b4 = 1BL.A0b(parcel, this.A0E);
        while (A0b4.hasNext()) {
            ((KeyframeParams) A0b4.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0O);
        MusicSaveParams musicSaveParams = this.A06;
        if (musicSaveParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicSaveParams.writeToParcel(parcel, i);
        }
        MusicTrackParams musicTrackParams = this.A07;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A00);
        1BL.A13(parcel, this.A0P);
        1BL.A13(parcel, this.A0Q);
        1Du A0b5 = 1BL.A0b(parcel, this.A0F);
        while (A0b5.hasNext()) {
            ((PersistedGLRenderer) A0b5.next()).writeToParcel(parcel, i);
        }
        RemixParams remixParams = this.A08;
        if (remixParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            remixParams.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0V ? 1 : 0);
        C3o5.A0f(parcel, this.A0L);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        VideoConversionConfiguration videoConversionConfiguration = this.A04;
        if (videoConversionConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoConversionConfiguration.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A0G;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((ClipMetaData) A0Y.next(), i);
            }
        }
        1Du A0b6 = 1BL.A0b(parcel, this.A0H);
        while (A0b6.hasNext()) {
            parcel.writeParcelable((VideoSegmentHolder) A0b6.next(), i);
        }
        VideoTrimParams videoTrimParams = this.A09;
        if (videoTrimParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTrimParams.writeToParcel(parcel, i);
        }
        DKH.A12(parcel, this.A0K);
        InspirationZoomCropParams inspirationZoomCropParams = this.A05;
        if (inspirationZoomCropParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationZoomCropParams.writeToParcel(parcel, i);
        }
    }
}
