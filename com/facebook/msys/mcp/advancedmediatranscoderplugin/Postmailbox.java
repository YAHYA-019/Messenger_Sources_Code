package com.facebook.msys.mcp.advancedmediatranscoderplugin;

import X.C99r;
import android.net.Uri;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.TranscodeGifCompletionCallback;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.VideoEdits;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import java.util.Map;

/* loaded from: Postmailbox.class */
public abstract class Postmailbox {
    public AccountSession mPluginContext;

    public Postmailbox(AccountSession accountSession) {
        this.mPluginContext = accountSession;
    }

    private byte[] MsysAdvancedMediaTranscoderImpl_MsysMediaCreateTranscodeImageJNI(Uri uri, double d, double d2, String str, Map map) {
        if (uri == null) {
            uri = null;
        }
        if (str == null) {
            str = null;
        }
        if (map == null) {
            map = null;
        }
        return MsysAdvancedMediaTranscoderImpl_MsysMediaCreateTranscodeImage(uri, d, d2, str, map);
    }

    private void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeGifJNI(Uri uri, TranscodeGifCompletionCallback transcodeGifCompletionCallback) {
        MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeGif(uri, transcodeGifCompletionCallback);
    }

    private void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideoJNI(Uri uri, byte[] bArr, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        if (bArr == null) {
            bArr = null;
        }
        MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideo(uri, bArr, j, j2, transcodeVideoCompletionCallback);
    }

    private void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideoV2JNI(Uri uri, VideoEdits videoEdits, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        if (videoEdits == null) {
            videoEdits = null;
        }
        MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideoV2(uri, videoEdits, j, j2, transcodeVideoCompletionCallback);
    }

    private void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscoderReportTranscodeFailureJNI(int i) {
        C99r.A00.reportTranscodeFailure(i);
    }

    private void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscoderVideoSizeEstimatorJNI(Uri uri, long j, Number number, Number number2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        if (number == null) {
            number = null;
        }
        if (number2 == null) {
            number2 = null;
        }
        MsysAdvancedMediaTranscoderImpl_MsysMediaTranscoderVideoSizeEstimator(uri, j, number, number2, videoSizeEstimatorCompletionCallback);
    }

    public abstract byte[] MsysAdvancedMediaTranscoderImpl_MsysMediaCreateTranscodeImage(Uri uri, double d, double d2, String str, Map map);

    public abstract void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeGif(Uri uri, TranscodeGifCompletionCallback transcodeGifCompletionCallback);

    public abstract void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideo(Uri uri, byte[] bArr, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback);

    public abstract void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideoV2(Uri uri, VideoEdits videoEdits, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback);

    public abstract void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscoderReportTranscodeFailure(int i);

    public abstract void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscoderVideoSizeEstimator(Uri uri, long j, Number number, Number number2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback);

    public void MsysAdvancedMediaTranscoderPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }
}
