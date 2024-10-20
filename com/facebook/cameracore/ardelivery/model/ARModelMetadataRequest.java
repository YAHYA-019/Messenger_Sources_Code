package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass001;

/* loaded from: ARModelMetadataRequest.class */
public class ARModelMetadataRequest {
    public VersionedCapability mCapability;
    public boolean mForceDownload;
    public boolean mIsMinVersionTranslatedToNmlml;
    public int mMinVersion;
    public int mPreferredVersion;
    public int mRequestId;

    public ARModelMetadataRequest(int i, int i2, int i3) {
        this(VersionedCapability.fromXplatValue(i), i2, i2, false);
        this.mRequestId = i3;
    }

    public ARModelMetadataRequest(VersionedCapability versionedCapability, int i, int i2, boolean z) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
        this.mPreferredVersion = i2;
        this.mForceDownload = z;
        this.mIsMinVersionTranslatedToNmlml = false;
    }

    public ARModelMetadataRequest(VersionedCapability versionedCapability, int i, int i2, boolean z, boolean z2) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
        this.mPreferredVersion = i2;
        this.mForceDownload = z;
        this.mIsMinVersionTranslatedToNmlml = z2;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public boolean getForceDownloadFlag() {
        return this.mForceDownload;
    }

    public boolean getIsMinVersionTranslatedToNmlmlFlag() {
        return this.mIsMinVersionTranslatedToNmlml;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int getPreferredVersion() {
        return this.mPreferredVersion;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.mCapability);
        A0k.append("-");
        A0k.append(this.mMinVersion);
        A0k.append("-");
        A0k.append(this.mPreferredVersion);
        return A0k.toString();
    }
}
