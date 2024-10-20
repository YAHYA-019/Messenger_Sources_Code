package com.facebook.ipc.media.data;

import X.0CO;
import X.1BK;
import X.1BL;
import X.2Go;
import X.4YU;
import X.C0A2;
import X.CSR;
import X.EKy;
import X.I9Q;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.metaverse.MetaGalleryMetadata;
import com.facebook.spherical.photo.metadata.SphericalPhotoData;
import com.facebook.videocodec.base.SphericalMetadata;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: MediaData.class */
public final class MediaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(47);
    public final float mAspectRatio;
    public final String mCreationMediaEntryPoint;
    public final String mCreationMediaSource;
    public final long mDateAddedSecond;
    public final long mDateTakenMs;
    public final String mDisplayName;
    public final int mHasDepthMap;
    public final int mHeight;
    public final String mId;
    public final int mIsFavorite;
    public final double mLatitude;
    public final double mLongitude;
    public final long mMediaSizeBytes;
    public final long mMediaStoreId;
    public final MetaGalleryMetadata mMetaGalleryMetadata;
    public final MimeType mMimeType;
    public final int mOrientation;
    public final OriginalMediaData mOriginalMediaData;
    public final String mPhotoMakerNote;
    public final String mRemoteThumbnailPath;
    public final SphericalPhotoData mSphericalPhotoData;
    public final SphericalMetadata mSphericalVideoMetadata;
    public final String mThumbnailUri;
    public final EKy mType;
    public final String mUnifiedStoriesMediaSource;
    public final String mUri;
    public final String mVideoDescription;
    public final long mVideoDurationMs;
    public final String mVideoOverlayImageUri;
    public final int mWidth;

    public MediaData() {
        this.mId = "INVALID_ID";
        this.mType = EKy.A02;
        this.mUri = "";
        this.mThumbnailUri = null;
        this.mRemoteThumbnailPath = null;
        this.mVideoOverlayImageUri = null;
        this.mMimeType = MimeType.A02;
        this.mSphericalPhotoData = null;
        this.mSphericalVideoMetadata = null;
        this.mOrientation = 0;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mAspectRatio = 0.0f / 0.0f;
        double d = 0.0d / 0.0d;
        this.mLatitude = d;
        this.mLongitude = d;
        this.mUnifiedStoriesMediaSource = null;
        this.mCreationMediaSource = null;
        this.mCreationMediaEntryPoint = null;
        this.mHasDepthMap = -1;
        long j = -1;
        this.mVideoDurationMs = j;
        this.mMediaSizeBytes = j;
        this.mDisplayName = "";
        this.mDateTakenMs = 0L;
        this.mDateAddedSecond = 0L;
        this.mOriginalMediaData = null;
        this.mMediaStoreId = j;
        this.mVideoDescription = null;
        this.mPhotoMakerNote = null;
        this.mIsFavorite = 0;
        this.mMetaGalleryMetadata = null;
    }

    public MediaData(I9Q i9q) {
        String str = i9q.A0M;
        str.getClass();
        this.mId = str;
        EKy eKy = i9q.A0D;
        eKy.getClass();
        this.mType = eKy;
        String str2 = i9q.A0R;
        str2.getClass();
        this.mUri = str2;
        this.mThumbnailUri = i9q.A0P;
        this.mRemoteThumbnailPath = i9q.A0O;
        this.mVideoOverlayImageUri = i9q.A0T;
        this.mMimeType = i9q.A0E;
        this.mSphericalPhotoData = i9q.A0H;
        this.mSphericalVideoMetadata = i9q.A0I;
        this.mOrientation = i9q.A06;
        this.mWidth = i9q.A07;
        this.mHeight = i9q.A04;
        this.mAspectRatio = i9q.A02;
        this.mLatitude = i9q.A00;
        this.mLongitude = i9q.A01;
        this.mUnifiedStoriesMediaSource = i9q.A0Q;
        this.mCreationMediaSource = i9q.A0K;
        this.mCreationMediaEntryPoint = i9q.A0J;
        this.mHasDepthMap = i9q.A03;
        this.mVideoDurationMs = i9q.A0C;
        this.mMediaSizeBytes = i9q.A0A;
        this.mDisplayName = i9q.A0L;
        this.mDateTakenMs = i9q.A09;
        this.mDateAddedSecond = i9q.A08;
        this.mOriginalMediaData = i9q.A0F;
        this.mMediaStoreId = i9q.A0B;
        this.mVideoDescription = i9q.A0S;
        this.mPhotoMakerNote = i9q.A0N;
        this.mIsFavorite = i9q.A05;
        this.mMetaGalleryMetadata = i9q.A0G;
    }

    public MediaData(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.mId = readString;
        this.mType = EKy.valueOf(parcel.readString());
        String readString2 = parcel.readString();
        readString2.getClass();
        this.mUri = readString2;
        this.mThumbnailUri = parcel.readString();
        this.mRemoteThumbnailPath = parcel.readString();
        this.mVideoOverlayImageUri = parcel.readString();
        Parcelable A0C = 1BL.A0C(parcel, MimeType.class);
        A0C.getClass();
        this.mMimeType = (MimeType) A0C;
        this.mSphericalPhotoData = (SphericalPhotoData) 1BL.A0C(parcel, SphericalPhotoData.class);
        this.mSphericalVideoMetadata = (SphericalMetadata) 1BL.A0C(parcel, SphericalMetadata.class);
        this.mOrientation = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mHeight = parcel.readInt();
        this.mAspectRatio = parcel.readFloat();
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mUnifiedStoriesMediaSource = parcel.readString();
        this.mCreationMediaSource = parcel.readString();
        this.mCreationMediaEntryPoint = parcel.readString();
        this.mHasDepthMap = parcel.readInt();
        this.mVideoDurationMs = parcel.readLong();
        this.mMediaSizeBytes = parcel.readLong();
        this.mDisplayName = parcel.readString();
        this.mDateTakenMs = parcel.readLong();
        this.mDateAddedSecond = parcel.readLong();
        this.mOriginalMediaData = (OriginalMediaData) 1BL.A0C(parcel, OriginalMediaData.class);
        this.mMediaStoreId = parcel.readLong();
        this.mVideoDescription = parcel.readString();
        this.mPhotoMakerNote = parcel.readString();
        this.mIsFavorite = parcel.readInt();
        this.mMetaGalleryMetadata = (MetaGalleryMetadata) 1BL.A0C(parcel, MetaGalleryMetadata.class);
    }

    public int A00() {
        int i = this.mOrientation;
        return (i == 90 || i == 270) ? this.mWidth : this.mHeight;
    }

    public int A01() {
        int i = this.mOrientation;
        return (i == 90 || i == 270) ? this.mHeight : this.mWidth;
    }

    public Uri A02() {
        String str = this.mRemoteThumbnailPath;
        if (str == null || "".equals(str)) {
            return null;
        }
        return C0A2.A03(str);
    }

    public Uri A03() {
        return 4YU.A0F(this.mUri);
    }

    public EKy A04() {
        MimeType mimeType = this.mMimeType;
        EKy eKy = null;
        if (mimeType != null) {
            String str = mimeType.mRawType;
            if (str.startsWith("image/")) {
                eKy = EKy.A02;
            } else if (str.startsWith("video/")) {
                return EKy.A03;
            }
        }
        return eKy;
    }

    public MediaIdKey A05() {
        return new MediaIdKey(A06(), this.mMediaStoreId);
    }

    public String A06() {
        Uri A0F = 4YU.A0F(this.mUri);
        if (Uri.EMPTY.equals(A0F)) {
            return null;
        }
        return 0CO.A04(A0F) ? A0F.toString() : A0F.getPath();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            MediaData mediaData = (MediaData) obj;
            if (!2Go.A00(this.mId, mediaData.mId) || !2Go.A00(this.mType, mediaData.mType) || !2Go.A00(this.mUri, mediaData.mUri) || !2Go.A00(this.mThumbnailUri, mediaData.mThumbnailUri) || !2Go.A00(this.mRemoteThumbnailPath, mediaData.mRemoteThumbnailPath) || !2Go.A00(this.mVideoOverlayImageUri, mediaData.mVideoOverlayImageUri) || !2Go.A00(this.mMimeType, mediaData.mMimeType) || !2Go.A00(this.mSphericalPhotoData, mediaData.mSphericalPhotoData) || !2Go.A00(this.mSphericalVideoMetadata, mediaData.mSphericalVideoMetadata) || !2Go.A00(Integer.valueOf(this.mOrientation), Integer.valueOf(mediaData.mOrientation)) || !2Go.A00(Integer.valueOf(this.mWidth), Integer.valueOf(mediaData.mWidth)) || !2Go.A00(Integer.valueOf(this.mHeight), Integer.valueOf(mediaData.mHeight)) || !2Go.A00(Float.valueOf(this.mAspectRatio), Float.valueOf(mediaData.mAspectRatio)) || !2Go.A00(Double.valueOf(this.mLatitude), Double.valueOf(mediaData.mLatitude)) || !2Go.A00(Double.valueOf(this.mLongitude), Double.valueOf(mediaData.mLongitude)) || !2Go.A00(this.mUnifiedStoriesMediaSource, mediaData.mUnifiedStoriesMediaSource) || !2Go.A00(this.mCreationMediaSource, mediaData.mCreationMediaSource) || !2Go.A00(this.mCreationMediaEntryPoint, mediaData.mCreationMediaEntryPoint) || !2Go.A00(Integer.valueOf(this.mHasDepthMap), Integer.valueOf(mediaData.mHasDepthMap)) || !2Go.A00(Long.valueOf(this.mVideoDurationMs), Long.valueOf(mediaData.mVideoDurationMs)) || !2Go.A00(Long.valueOf(this.mMediaSizeBytes), Long.valueOf(mediaData.mMediaSizeBytes)) || !2Go.A00(this.mDisplayName, mediaData.mDisplayName) || !2Go.A00(Long.valueOf(this.mDateTakenMs), Long.valueOf(mediaData.mDateTakenMs)) || !2Go.A00(Long.valueOf(this.mDateAddedSecond), Long.valueOf(mediaData.mDateAddedSecond)) || !2Go.A00(this.mOriginalMediaData, mediaData.mOriginalMediaData) || !2Go.A00(Long.valueOf(this.mMediaStoreId), Long.valueOf(mediaData.mMediaStoreId)) || !2Go.A00(this.mVideoDescription, mediaData.mVideoDescription) || !2Go.A00(this.mPhotoMakerNote, mediaData.mPhotoMakerNote) || !2Go.A00(Integer.valueOf(this.mIsFavorite), Integer.valueOf(mediaData.mIsFavorite)) || !2Go.A00(this.mMetaGalleryMetadata, mediaData.mMetaGalleryMetadata)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[30];
        System.arraycopy(new Object[]{this.mPhotoMakerNote, Integer.valueOf(this.mIsFavorite), this.mMetaGalleryMetadata}, 1BK.A1W(new Object[]{this.mId, this.mType, this.mUri, this.mThumbnailUri, this.mRemoteThumbnailPath, this.mVideoOverlayImageUri, this.mMimeType, this.mSphericalPhotoData, this.mSphericalVideoMetadata, Integer.valueOf(this.mOrientation), Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Float.valueOf(this.mAspectRatio), Double.valueOf(this.mLatitude), Double.valueOf(this.mLongitude), this.mUnifiedStoriesMediaSource, this.mCreationMediaSource, this.mCreationMediaEntryPoint, Integer.valueOf(this.mHasDepthMap), Long.valueOf(this.mVideoDurationMs), Long.valueOf(this.mMediaSizeBytes), this.mDisplayName, Long.valueOf(this.mDateTakenMs), Long.valueOf(this.mDateAddedSecond), this.mOriginalMediaData, Long.valueOf(this.mMediaStoreId), this.mVideoDescription}, objArr) ? 1 : 0, objArr, 27, 3);
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        return String.format(Locale.US, "{MediaData: %s %s %s}", this.mType, this.mId, this.mUri);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mType.toString());
        parcel.writeString(this.mUri);
        parcel.writeString(this.mThumbnailUri);
        parcel.writeString(this.mRemoteThumbnailPath);
        parcel.writeString(this.mVideoOverlayImageUri);
        parcel.writeParcelable(this.mMimeType, i);
        parcel.writeParcelable(this.mSphericalPhotoData, i);
        parcel.writeParcelable(this.mSphericalVideoMetadata, i);
        parcel.writeInt(this.mOrientation);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mHeight);
        parcel.writeFloat(this.mAspectRatio);
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeString(this.mUnifiedStoriesMediaSource);
        parcel.writeString(this.mCreationMediaSource);
        parcel.writeString(this.mCreationMediaEntryPoint);
        parcel.writeInt(this.mHasDepthMap);
        parcel.writeLong(this.mVideoDurationMs);
        parcel.writeLong(this.mMediaSizeBytes);
        parcel.writeString(this.mDisplayName);
        parcel.writeLong(this.mDateTakenMs);
        parcel.writeLong(this.mDateAddedSecond);
        parcel.writeParcelable(this.mOriginalMediaData, i);
        parcel.writeLong(this.mMediaStoreId);
        parcel.writeString(this.mVideoDescription);
        parcel.writeString(this.mPhotoMakerNote);
        parcel.writeInt(this.mIsFavorite);
        parcel.writeParcelable(this.mMetaGalleryMetadata, i);
    }
}
