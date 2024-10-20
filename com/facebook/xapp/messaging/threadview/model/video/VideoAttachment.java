package com.facebook.xapp.messaging.threadview.model.video;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.6AF;
import X.82N;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C48g;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.engine.api.VideoDataSource;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: VideoAttachment.class */
public final class VideoAttachment implements Parcelable {
    public static volatile ImmutableList A0N;
    public static final Parcelable.Creator CREATOR = new 82N(36);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final Uri A0B;
    public final Uri A0C;
    public final C48g A0D;
    public final MediaResource A0E;
    public final ImmutableList A0F;
    public final String A0G;
    public final Set A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public VideoAttachment(6AF r302) {
        this.A00 = r302.A00;
        this.A01 = r302.A01;
        this.A07 = r302.A07;
        this.A08 = r302.A08;
        this.A09 = r302.A09;
        this.A02 = r302.A02;
        this.A03 = r302.A03;
        String str = r302.A0G;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        this.A0G = str;
        this.A0I = r302.A0I;
        this.A0J = r302.A0J;
        this.A0K = r302.A0K;
        this.A04 = r302.A04;
        this.A0B = r302.A0B;
        this.A05 = r302.A05;
        this.A0L = r302.A0L;
        this.A0M = r302.A0M;
        this.A0D = r302.A0D;
        this.A0A = r302.A0A;
        this.A0C = r302.A0C;
        this.A0E = r302.A0E;
        this.A0F = r302.A0F;
        this.A06 = r302.A06;
        this.A0H = Collections.unmodifiableSet(r302.A0H);
    }

    public VideoAttachment(Uri uri, C48g c48g, MediaResource mediaResource, ImmutableList immutableList, String str, Set set, int i, int i2, long j, long j2, boolean z, boolean z2) {
        this.A00 = 0;
        this.A01 = 0;
        this.A07 = j;
        this.A08 = 0L;
        this.A09 = j2;
        this.A02 = 0;
        this.A03 = i;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        this.A0G = str;
        this.A0I = z;
        this.A0J = false;
        this.A0K = false;
        this.A04 = 0;
        this.A0B = null;
        this.A05 = 0;
        this.A0L = z2;
        this.A0M = false;
        this.A0D = c48g;
        this.A0A = 0L;
        this.A0C = uri;
        this.A0E = mediaResource;
        this.A0F = immutableList;
        this.A06 = i2;
        this.A0H = Collections.unmodifiableSet(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAttachment(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A09 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readString();
        int i = 0;
        boolean z = true;
        this.A0I = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0J = 1BM.A07(parcel);
        this.A0K = 1BM.A07(parcel);
        this.A04 = parcel.readInt();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (Uri) parcel.readParcelable(A0e);
        }
        this.A05 = parcel.readInt();
        this.A0L = 1BM.A07(parcel);
        this.A0M = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = C48g.values()[parcel.readInt()];
        }
        this.A0A = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (Uri) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (MediaResource) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            VideoDataSource[] videoDataSourceArr = new VideoDataSource[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                videoDataSourceArr[i2] = VideoDataSource.CREATOR.createFromParcel(parcel);
            }
            immutableList = ImmutableList.copyOf(videoDataSourceArr);
        }
        this.A0F = immutableList;
        this.A06 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0H = Collections.unmodifiableSet(A0v);
    }

    public ImmutableList A00() {
        if (this.A0H.contains("videoSources")) {
            return this.A0F;
        }
        if (A0N == null) {
            synchronized (this) {
                if (A0N == null) {
                    ImmutableList of = ImmutableList.of();
                    11T.A0A(of);
                    A0N = of;
                }
            }
        }
        return A0N;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoAttachment)) {
                return false;
            }
            VideoAttachment videoAttachment = (VideoAttachment) obj;
            if (this.A00 != videoAttachment.A00 || this.A01 != videoAttachment.A01 || this.A07 != videoAttachment.A07 || this.A08 != videoAttachment.A08 || this.A09 != videoAttachment.A09 || this.A02 != videoAttachment.A02 || this.A03 != videoAttachment.A03 || !11T.A0O(this.A0G, videoAttachment.A0G) || this.A0I != videoAttachment.A0I || this.A0J != videoAttachment.A0J || this.A0K != videoAttachment.A0K || this.A04 != videoAttachment.A04 || !11T.A0O(this.A0B, videoAttachment.A0B) || this.A05 != videoAttachment.A05 || this.A0L != videoAttachment.A0L || this.A0M != videoAttachment.A0M || this.A0D != videoAttachment.A0D || this.A0A != videoAttachment.A0A || !11T.A0O(this.A0C, videoAttachment.A0C) || !11T.A0O(this.A0E, videoAttachment.A0E) || !11T.A0O(A00(), videoAttachment.A00()) || this.A06 != videoAttachment.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02(C1pq.A02((C1pq.A04(this.A0B, (C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0G, (((C1pq.A01(C1pq.A01(C1pq.A01(((this.A00 + 31) * 31) + this.A01, this.A07), this.A08), this.A09) * 31) + this.A02) * 31) + this.A03), this.A0I), this.A0J), this.A0K) * 31) + this.A04) * 31) + this.A05, this.A0L), this.A0M);
        C48g c48g = this.A0D;
        return (C1pq.A04(A00(), C1pq.A04(this.A0E, C1pq.A04(this.A0C, C1pq.A01((A02 * 31) + (c48g == null ? -1 : c48g.ordinal()), this.A0A)))) * 31) + this.A06;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoAttachment{atomSize=");
        A0k.append(this.A00);
        A0k.append(", bitrate=");
        A0k.append(this.A01);
        A0k.append(", durationMs=");
        A0k.append(this.A07);
        A0k.append(", endPositionMs=");
        A0k.append(this.A08);
        A0k.append(", fileSize=");
        A0k.append(this.A09);
        A0k.append(", hdBitrate=");
        A0k.append(this.A02);
        A0k.append(", height=");
        A0k.append(this.A03);
        A0k.append(", id=");
        A0k.append(this.A0G);
        A0k.append(", isGif=");
        A0k.append(this.A0I);
        A0k.append(", isPreview=");
        A0k.append(this.A0J);
        A0k.append(", isThirdPartyContent=");
        A0k.append(this.A0K);
        A0k.append(", loopCount=");
        A0k.append(this.A04);
        A0k.append(", miniPreviewBase64Uri=");
        A0k.append(this.A0B);
        A0k.append(", rotation=");
        A0k.append(this.A05);
        A0k.append(", shouldDisableDownload=");
        A0k.append(this.A0L);
        A0k.append(", shouldLoop=");
        A0k.append(this.A0M);
        A0k.append(", source=");
        A0k.append(this.A0D);
        A0k.append(", startPositionMs=");
        A0k.append(this.A0A);
        A0k.append(", thumbnailUri=");
        A0k.append(this.A0C);
        A0k.append(", uploadedMediaResource=");
        A0k.append(this.A0E);
        A0k.append(", videoSources=");
        A0k.append(A00());
        A0k.append(", width=");
        A0k.append(this.A06);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A04);
        C3o5.A0d(parcel, this.A0B, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        C3o5.A0e(parcel, this.A0D);
        parcel.writeLong(this.A0A);
        C3o5.A0d(parcel, this.A0C, i);
        C3o5.A0d(parcel, this.A0E, i);
        ImmutableList immutableList = this.A0F;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                ((VideoDataSource) A0b.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A0H);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
