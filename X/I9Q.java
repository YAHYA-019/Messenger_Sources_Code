package X;

import android.net.Uri;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.ipc.media.data.MimeType;
import com.facebook.ipc.media.data.OriginalMediaData;
import com.facebook.ipc.media.data.metaverse.MetaGalleryMetadata;
import com.facebook.spherical.photo.metadata.SphericalPhotoData;
import com.facebook.videocodec.base.SphericalMetadata;
import com.google.common.base.Preconditions;

/* loaded from: I9Q.class */
public final class I9Q {
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public EKy A0D;
    public MimeType A0E;
    public OriginalMediaData A0F;
    public MetaGalleryMetadata A0G;
    public SphericalPhotoData A0H;
    public SphericalMetadata A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;

    public I9Q() {
        A00(this);
    }

    public I9Q(MediaData mediaData) {
        A00(this);
        this.A0M = mediaData.mId;
        this.A0D = mediaData.mType;
        this.A0R = mediaData.mUri;
        this.A0P = mediaData.mThumbnailUri;
        this.A0O = mediaData.mRemoteThumbnailPath;
        this.A0T = mediaData.mVideoOverlayImageUri;
        this.A0E = mediaData.mMimeType;
        this.A0H = mediaData.mSphericalPhotoData;
        this.A0I = mediaData.mSphericalVideoMetadata;
        this.A06 = mediaData.mOrientation;
        this.A07 = mediaData.mWidth;
        this.A04 = mediaData.mHeight;
        this.A02 = mediaData.mAspectRatio;
        this.A00 = mediaData.mLatitude;
        this.A01 = mediaData.mLongitude;
        this.A0Q = mediaData.mUnifiedStoriesMediaSource;
        this.A0K = mediaData.mCreationMediaSource;
        this.A0J = mediaData.mCreationMediaEntryPoint;
        this.A03 = mediaData.mHasDepthMap;
        this.A0C = mediaData.mVideoDurationMs;
        this.A0A = mediaData.mMediaSizeBytes;
        this.A0L = mediaData.mDisplayName;
        this.A09 = mediaData.mDateTakenMs;
        this.A08 = mediaData.mDateAddedSecond;
        this.A0F = mediaData.mOriginalMediaData;
        this.A0B = mediaData.mMediaStoreId;
        this.A0S = mediaData.mVideoDescription;
        this.A0N = mediaData.mPhotoMakerNote;
        this.A05 = mediaData.mIsFavorite;
        this.A0G = mediaData.mMetaGalleryMetadata;
    }

    public static void A00(I9Q i9q) {
        i9q.A0E = MimeType.A02;
        i9q.A07 = 0;
        i9q.A04 = 0;
        i9q.A02 = 0.0f / 0.0f;
        double d = 0.0d / 0.0d;
        i9q.A00 = d;
        i9q.A01 = d;
        i9q.A03 = -1;
        long j = -1;
        i9q.A0C = j;
        i9q.A0A = j;
        i9q.A0L = "";
        i9q.A0F = null;
        i9q.A0B = j;
        i9q.A0S = null;
        i9q.A0N = null;
        i9q.A05 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (java.lang.Double.isNaN(r302) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(double r302) {
        /*
            r301 = this;
            r0 = -4587338432941916160(0xc056800000000000, double:-90.0)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L1c
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 <= 0) goto L2a
        L1c:
            r0 = r302
            boolean r0 = java.lang.Double.isNaN(r0)
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L2d
        L2a:
            r0 = 1
            r307 = r0
        L2d:
            java.lang.String r0 = "Latitude value: "
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0n(r0)
            r308 = r0
            r0 = r308
            r1 = r302
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r308
            java.lang.String r0 = r0.toString()
            r308 = r0
            r0 = r307
            r1 = r308
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9Q.A01(double):void");
    }

    public void A02(Uri uri) {
        uri.getClass();
        Preconditions.checkArgument(uri.isHierarchical());
        this.A0R = uri.toString();
    }

    public void A03(EKy eKy) {
        eKy.getClass();
        this.A0D = eKy;
    }

    public void A04(MimeType mimeType) {
        this.A0E = mimeType;
    }

    public void A05(String str) {
        str.getClass();
        this.A0M = str;
    }
}
