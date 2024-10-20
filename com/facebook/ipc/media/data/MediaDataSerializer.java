package com.facebook.ipc.media.data;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: MediaDataSerializer.class */
public class MediaDataSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), MediaData.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        MediaData mediaData = (MediaData) obj;
        if (mediaData == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, mediaData.mId);
        AbstractC11224vw.A05(r302, c26c, mediaData.mType, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        AbstractC11224vw.A0D(r302, TraceFieldType.Uri, mediaData.mUri);
        AbstractC11224vw.A0D(r302, "thumbnail_uri", mediaData.mThumbnailUri);
        AbstractC11224vw.A0D(r302, "remote_thumbnail_path", mediaData.mRemoteThumbnailPath);
        AbstractC11224vw.A0D(r302, "video_overlay_image_uri", mediaData.mVideoOverlayImageUri);
        AbstractC11224vw.A05(r302, c26c, mediaData.mMimeType, "mime_type");
        AbstractC11224vw.A05(r302, c26c, mediaData.mSphericalPhotoData, "spherical_photo_data");
        AbstractC11224vw.A05(r302, c26c, mediaData.mSphericalVideoMetadata, "spherical_video_metadata");
        int i = mediaData.mOrientation;
        r302.A0o("orientation");
        r302.A0f(i);
        int i2 = mediaData.mWidth;
        r302.A0o(Property.ICON_TEXT_FIT_WIDTH);
        r302.A0f(i2);
        int i3 = mediaData.mHeight;
        r302.A0o(Property.ICON_TEXT_FIT_HEIGHT);
        r302.A0f(i3);
        float f = mediaData.mAspectRatio;
        r302.A0o("aspect_ratio");
        r302.A0e(f);
        double d = mediaData.mLatitude;
        r302.A0o(Location.LATITUDE);
        r302.A0d(d);
        double d2 = mediaData.mLongitude;
        r302.A0o("longitude");
        r302.A0d(d2);
        AbstractC11224vw.A0D(r302, "unified_stories_media_source", mediaData.mUnifiedStoriesMediaSource);
        AbstractC11224vw.A0D(r302, "creation_media_source", mediaData.mCreationMediaSource);
        AbstractC11224vw.A0D(r302, "creation_media_entry_point", mediaData.mCreationMediaEntryPoint);
        int i4 = mediaData.mHasDepthMap;
        r302.A0o("has_depth_map");
        r302.A0f(i4);
        long j = mediaData.mVideoDurationMs;
        r302.A0o("video_duration_ms");
        r302.A0g(j);
        long j2 = mediaData.mMediaSizeBytes;
        r302.A0o("media_size_bytes");
        r302.A0g(j2);
        AbstractC11224vw.A0D(r302, "display_name", mediaData.mDisplayName);
        long j3 = mediaData.mDateTakenMs;
        r302.A0o("date_taken_ms");
        r302.A0g(j3);
        long j4 = mediaData.mDateAddedSecond;
        r302.A0o("date_added_second");
        r302.A0g(j4);
        AbstractC11224vw.A05(r302, c26c, mediaData.mOriginalMediaData, "original_media_data");
        long j5 = mediaData.mMediaStoreId;
        r302.A0o("media_store_id");
        r302.A0g(j5);
        AbstractC11224vw.A0D(r302, "video_description", mediaData.mVideoDescription);
        AbstractC11224vw.A0D(r302, "photo_maker_note", mediaData.mPhotoMakerNote);
        int i5 = mediaData.mIsFavorite;
        r302.A0o("is_favorite");
        r302.A0f(i5);
        AbstractC11224vw.A05(r302, c26c, mediaData.mMetaGalleryMetadata, "meta_gallery_metadata");
        r302.A0Y();
    }
}
