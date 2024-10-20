package com.facebook.photos.base.analytics.upload.images;

import X.Qor;
import com.meta.images.metadata.gen_ai.model.ImageUploadProvenanceMetadata;

/* loaded from: ImageUploadRecord.class */
public final class ImageUploadRecord {
    public String analyticsModuleTag;
    public String analyticsTag;
    public int batchIndex;
    public int batchSize;
    public String clientMediaId;
    public int confirmedUploadBytes;
    public String experimentTag;
    public String featureTag;
    public boolean finalResolution;
    public boolean hdrFormatSignal;
    public boolean infraFailure;
    public boolean isFallback;
    public String msSsimFailureReason;
    public String multiStepDisabledReason;
    public boolean originalInputFileCanBeRead;
    public boolean originalInputFileExists;
    public int persistedRetryCount;
    public ImageUploadProvenanceMetadata provenanceInfo;
    public Long recordEnd;
    public long recordStart;
    public float scaleCropFactor;
    public ImageData source;
    public String sourceUri;
    public boolean spherical;
    public Long transcodeEnd;
    public boolean transcodeFailed;
    public String transcodeFailureReason;
    public int transcodeQuality;
    public String transcodeSamplingPattern;
    public Long transcodeStart;
    public Long transferEnd;
    public boolean transferFailed;
    public String transferFailureReason;
    public String transferResponseHeaders;
    public Long transferStart;
    public int transferStatusCode;
    public ImageData upload;
    public boolean uploadCancelled;
    public String uploadColorProfile;
    public Long uploadEnd;
    public boolean uploadFailed;
    public String uploadFailureReason;
    public Qor uploadStage;
    public Long uploadStart;
    public String uploader;
    public boolean usingPersistedInputFile;
    public String waterfallId;
}
