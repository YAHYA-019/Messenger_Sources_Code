package X;

import com.facebook.photos.base.analytics.upload.images.ImageData;
import com.facebook.photos.base.analytics.upload.images.ImageUploadRecord;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.smartcapture.logging.SCEventNames;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.meta.images.metadata.gen_ai.model.ImageUploadProvenanceMetadata;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: Kon.class */
public final class Kon {
    public final 1Br A00 = 7zM.A0S();

    public final void A00(ImageUploadRecord imageUploadRecord, Long l) {
        List A19;
        String[] A0n;
        String str = imageUploadRecord.sourceUri;
        int i = 1;
        int hashCode = str != null ? str.hashCode() : 1;
        1Br r0 = this.A00;
        QuickPerformanceLogger A0e = 7zP.A0e(r0);
        long j = imageUploadRecord.recordStart;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        A0e.markerStart(49807361, hashCode, j, timeUnit);
        ImageData imageData = imageUploadRecord.source;
        if (imageData != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "source_bytes", imageData.bytes);
            QuickPerformanceLogger A0e2 = 7zP.A0e(r0);
            String str2 = imageData.format;
            if (str2 == null) {
                str2 = "unknown";
            }
            A0e2.markerAnnotate(49807361, hashCode, "source_format", str2);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "source_width", imageData.width);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "source_height", imageData.height);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "source_rotation", imageData.rotation);
        }
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "original_input_file_exists", imageUploadRecord.originalInputFileExists);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "original_input_file_can_be_read", imageUploadRecord.originalInputFileCanBeRead);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "using_persisted_input_file", imageUploadRecord.usingPersistedInputFile);
        ImageData imageData2 = imageUploadRecord.upload;
        if (imageData2 != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "upload_bytes", imageData2.bytes);
            QuickPerformanceLogger A0e3 = 7zP.A0e(r0);
            String str3 = imageData2.format;
            if (str3 == null) {
                str3 = "unknown";
            }
            A0e3.markerAnnotate(49807361, hashCode, "upload_format", str3);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "upload_width", imageData2.width);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "upload_height", imageData2.height);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "upload_rotation", imageData2.rotation);
            Double d = imageData2.msSsim;
            if (d != null) {
                double doubleValue = d.doubleValue();
                if (!Double.isNaN(doubleValue)) {
                    7zP.A0e(r0).markerAnnotate(49807361, hashCode, "msssim", doubleValue);
                }
            }
            if (imageUploadRecord.msSsimFailureReason != null) {
                7zP.A0e(r0).markerAnnotate(49807361, hashCode, "msssim_failure_reason", imageUploadRecord.msSsimFailureReason);
            }
        }
        Long l2 = imageUploadRecord.uploadStart;
        Long l3 = imageUploadRecord.uploadEnd;
        if (l2 != null) {
            7zP.A0e(r0).markerPoint(49807361, hashCode, "upload_0_start", l2.longValue(), timeUnit);
        }
        if (l3 != null) {
            7zP.A0e(r0).markerPoint(49807361, hashCode, "upload_0_end", l3.longValue(), timeUnit);
        }
        if (imageUploadRecord.uploadFailureReason != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, TraceFieldType.FailureReason, imageUploadRecord.uploadFailureReason);
        }
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, SCEventNames.UPLOAD_FAILED, imageUploadRecord.uploadFailed);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "infra_failure", imageUploadRecord.infraFailure);
        if (imageUploadRecord.confirmedUploadBytes > 0) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "confirmed_upload_bytes", imageUploadRecord.confirmedUploadBytes);
        }
        ImageUploadProvenanceMetadata imageUploadProvenanceMetadata = imageUploadRecord.provenanceInfo;
        if (imageUploadProvenanceMetadata != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "iptc_confirms_ai", imageUploadProvenanceMetadata.A09);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "iptc_source_type", imageUploadProvenanceMetadata.A03);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "c2pa_present", imageUploadProvenanceMetadata.A07);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "c2pa_confirms_ai", imageUploadProvenanceMetadata.A06);
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "c2pa_source_ai", imageUploadProvenanceMetadata.A02);
            String str4 = imageUploadProvenanceMetadata.A01;
            if (str4 != null && (A19 = 4YU.A19(str4, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null && (A0n = C3o5.A0n(A19)) != null) {
                7zP.A0e(r0).markerAnnotate(49807361, hashCode, "c2pa_action_names_ai", A0n);
            }
            String str5 = imageUploadProvenanceMetadata.A00;
            if (str5 != null) {
                7zP.A0e(r0).markerAnnotate(49807361, hashCode, "c2pa_actions_data", str5);
            }
        }
        Long l4 = imageUploadRecord.transcodeStart;
        Long l5 = imageUploadRecord.transcodeEnd;
        if (l4 != null) {
            7zP.A0e(r0).markerPoint(49807361, hashCode, "transcoder_0_start", l4.longValue(), timeUnit);
        }
        if (l5 != null) {
            7zP.A0e(r0).markerPoint(49807361, hashCode, "transcoder_0_end", l5.longValue(), timeUnit);
        }
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "scale_crop", imageUploadRecord.scaleCropFactor);
        if (imageUploadRecord.transcodeFailureReason != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transcode_failure_reason", imageUploadRecord.transcodeFailureReason);
        }
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transcode_failed", imageUploadRecord.transcodeFailed);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transcode_quality", imageUploadRecord.transcodeQuality);
        String str6 = imageUploadRecord.transcodeSamplingPattern;
        if (str6 != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transcode_sampling_pattern", str6);
        }
        String str7 = imageUploadRecord.uploadColorProfile;
        if (str7 != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "upload_color_profile", str7);
        }
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "hdr_format_signal", imageUploadRecord.hdrFormatSignal);
        Long l6 = imageUploadRecord.transferStart;
        Long l7 = imageUploadRecord.transferEnd;
        if (l6 != null) {
            7zP.A0e(r0).markerPoint(49807361, hashCode, "transfer_0_start", l6.longValue(), timeUnit);
        }
        if (l7 != null) {
            7zP.A0e(r0).markerPoint(49807361, hashCode, "transfer_0_end", l7.longValue(), timeUnit);
        }
        if (imageUploadRecord.transferFailureReason != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transfer_failure_reason", imageUploadRecord.transferFailureReason);
        }
        if (imageUploadRecord.transferStatusCode != 0) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transfer_status_code", imageUploadRecord.transferStatusCode);
        }
        if (imageUploadRecord.transferResponseHeaders != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transfer_response_headers", imageUploadRecord.transferResponseHeaders);
        }
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "transfer_failed", imageUploadRecord.transferFailed);
        if (l != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, AbE.A00(79), l.longValue());
        }
        QuickPerformanceLogger A0e4 = 7zP.A0e(r0);
        short s = 2;
        if (imageUploadRecord.uploadStage == Qor.A04) {
            i = 2;
        }
        A0e4.markerAnnotate(49807361, hashCode, "upload_stage", i);
        if (imageUploadRecord.analyticsTag != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "analytics_tag", imageUploadRecord.analyticsTag);
        }
        if (imageUploadRecord.analyticsModuleTag != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "analytics_module_tag", imageUploadRecord.analyticsModuleTag);
        }
        if (imageUploadRecord.featureTag != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "feature_tag", imageUploadRecord.featureTag);
        }
        if (imageUploadRecord.uploader != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "uploader", imageUploadRecord.uploader);
        }
        if (imageUploadRecord.experimentTag != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "experiment_tag", imageUploadRecord.experimentTag);
        }
        if (imageUploadRecord.multiStepDisabledReason != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "multistep_disabled_reason", imageUploadRecord.multiStepDisabledReason);
        }
        if (imageUploadRecord.clientMediaId != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "client_media_id", imageUploadRecord.clientMediaId);
        }
        if (imageUploadRecord.waterfallId != null) {
            7zP.A0e(r0).markerAnnotate(49807361, hashCode, "waterfall_id", imageUploadRecord.waterfallId);
        }
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "batch_size", imageUploadRecord.batchSize);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "batch_index", imageUploadRecord.batchIndex);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "spherical", imageUploadRecord.spherical);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "final_resolution", imageUploadRecord.finalResolution);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "persisted_retry_count", imageUploadRecord.persistedRetryCount);
        7zP.A0e(r0).markerAnnotate(49807361, hashCode, "fallback", imageUploadRecord.isFallback);
        if (imageUploadRecord.uploadFailed) {
            s = 3;
        } else if (imageUploadRecord.uploadCancelled) {
            s = 4;
        }
        Long l8 = imageUploadRecord.recordEnd;
        if (l8 != null) {
            7zP.A0e(r0).markerEnd(49807361, hashCode, s, l8.longValue(), timeUnit);
        } else {
            C0d7.A08("ImageUploadLogger", "Missing record end point, falling back to current time");
            7zP.A0e(r0).markerEnd(49807361, hashCode, s);
        }
    }
}
