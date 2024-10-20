package com.facebook.photos.base.analytics.upload.images;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.smartcapture.logging.SCEventNames;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ImageUploadRecordSerializer.class */
public class ImageUploadRecordSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ImageUploadRecord.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ImageUploadRecord imageUploadRecord = (ImageUploadRecord) obj;
        if (imageUploadRecord == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "source_uri", imageUploadRecord.sourceUri);
        AbstractC11224vw.A0D(r302, "experiment_tag", imageUploadRecord.experimentTag);
        boolean z = imageUploadRecord.originalInputFileExists;
        r302.A0o("original_input_file_exists");
        r302.A0v(z);
        boolean z2 = imageUploadRecord.originalInputFileCanBeRead;
        r302.A0o("original_input_file_can_be_read");
        r302.A0v(z2);
        boolean z3 = imageUploadRecord.usingPersistedInputFile;
        r302.A0o("using_persisted_input_file");
        r302.A0v(z3);
        long j = imageUploadRecord.recordStart;
        r302.A0o("record_start");
        r302.A0g(j);
        AbstractC11224vw.A0C(r302, imageUploadRecord.recordEnd, "record_end");
        AbstractC11224vw.A0C(r302, imageUploadRecord.uploadStart, "upload_start");
        AbstractC11224vw.A0C(r302, imageUploadRecord.uploadEnd, "upload_end");
        AbstractC11224vw.A05(r302, c26c, imageUploadRecord.uploadStage, "upload_stage");
        AbstractC11224vw.A0D(r302, "upload_failure_reason", imageUploadRecord.uploadFailureReason);
        boolean z4 = imageUploadRecord.uploadFailed;
        r302.A0o(SCEventNames.UPLOAD_FAILED);
        r302.A0v(z4);
        boolean z5 = imageUploadRecord.infraFailure;
        r302.A0o("infra_failure");
        r302.A0v(z5);
        boolean z6 = imageUploadRecord.uploadCancelled;
        r302.A0o("upload_cancelled");
        r302.A0v(z6);
        AbstractC11224vw.A0C(r302, imageUploadRecord.transcodeStart, "transcode_start");
        AbstractC11224vw.A0C(r302, imageUploadRecord.transcodeEnd, "transcode_end");
        boolean z7 = imageUploadRecord.transcodeFailed;
        r302.A0o("transcode_failed");
        r302.A0v(z7);
        AbstractC11224vw.A0D(r302, "transcode_failure_reason", imageUploadRecord.transcodeFailureReason);
        AbstractC11224vw.A0D(r302, "msssim_failure_reason", imageUploadRecord.msSsimFailureReason);
        int i = imageUploadRecord.transcodeQuality;
        r302.A0o("transcode_quality");
        r302.A0f(i);
        AbstractC11224vw.A0D(r302, "transcode_sampling_pattern", imageUploadRecord.transcodeSamplingPattern);
        AbstractC11224vw.A0C(r302, imageUploadRecord.transferStart, "transfer_start");
        AbstractC11224vw.A0C(r302, imageUploadRecord.transferEnd, "transfer_end");
        boolean z8 = imageUploadRecord.transferFailed;
        r302.A0o("transfer_failed");
        r302.A0v(z8);
        AbstractC11224vw.A0D(r302, "transfer_failure_reason", imageUploadRecord.transferFailureReason);
        int i2 = imageUploadRecord.confirmedUploadBytes;
        r302.A0o("confirmed_upload_bytes");
        r302.A0f(i2);
        int i3 = imageUploadRecord.transferStatusCode;
        r302.A0o("transfer_status_code");
        r302.A0f(i3);
        AbstractC11224vw.A0D(r302, "transfer_response_headers", imageUploadRecord.transferResponseHeaders);
        AbstractC11224vw.A05(r302, c26c, imageUploadRecord.source, "source_image");
        AbstractC11224vw.A05(r302, c26c, imageUploadRecord.upload, "uploaded_image");
        AbstractC11224vw.A0D(r302, "analytics_tag", imageUploadRecord.analyticsTag);
        AbstractC11224vw.A0D(r302, "analytics_modole", imageUploadRecord.analyticsModuleTag);
        AbstractC11224vw.A0D(r302, "analytics_feature_tag", imageUploadRecord.featureTag);
        AbstractC11224vw.A0D(r302, "uploader", imageUploadRecord.uploader);
        AbstractC11224vw.A0D(r302, "multistep_disabled_reason", imageUploadRecord.multiStepDisabledReason);
        int i4 = imageUploadRecord.persistedRetryCount;
        r302.A0o("persisted_retry_count");
        r302.A0f(i4);
        boolean z9 = imageUploadRecord.isFallback;
        r302.A0o("fallback");
        r302.A0v(z9);
        float f = imageUploadRecord.scaleCropFactor;
        r302.A0o("scale_crop_factor");
        r302.A0e(f);
        boolean z10 = imageUploadRecord.spherical;
        r302.A0o("is_spherical");
        r302.A0v(z10);
        boolean z11 = imageUploadRecord.finalResolution;
        r302.A0o("is_final_resolution");
        r302.A0v(z11);
        AbstractC11224vw.A0D(r302, "client_media_id", imageUploadRecord.clientMediaId);
        AbstractC11224vw.A0D(r302, "waterfall_id", imageUploadRecord.waterfallId);
        int i5 = imageUploadRecord.batchSize;
        r302.A0o("batch_size");
        r302.A0f(i5);
        int i6 = imageUploadRecord.batchIndex;
        r302.A0o("batch_index");
        r302.A0f(i6);
        AbstractC11224vw.A0D(r302, "upload_color_profile", imageUploadRecord.uploadColorProfile);
        boolean z12 = imageUploadRecord.hdrFormatSignal;
        r302.A0o("hdr_format_signal");
        r302.A0v(z12);
        AbstractC11224vw.A05(r302, c26c, imageUploadRecord.provenanceInfo, "provenance_info");
        r302.A0Y();
    }
}
