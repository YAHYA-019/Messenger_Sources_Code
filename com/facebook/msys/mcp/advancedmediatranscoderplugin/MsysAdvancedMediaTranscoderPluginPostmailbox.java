package com.facebook.msys.mcp.advancedmediatranscoderplugin;

import X.4YV;
import X.C99r;
import android.net.Uri;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.TranscodeGifCompletionCallback;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.VideoEdits;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import java.util.Map;

/* loaded from: MsysAdvancedMediaTranscoderPluginPostmailbox.class */
public class MsysAdvancedMediaTranscoderPluginPostmailbox extends Postmailbox {
    public static final String TAG = "MsysAdvancedMediaTranscoderPluginPostmailbox";

    public MsysAdvancedMediaTranscoderPluginPostmailbox(AccountSession accountSession) {
        super(accountSession);
    }

    public static MsysError populateGenericError() {
        return new MsysError(TAG, 1, null);
    }

    @Override // com.facebook.msys.mcp.advancedmediatranscoderplugin.Postmailbox
    public byte[] MsysAdvancedMediaTranscoderImpl_MsysMediaCreateTranscodeImage(Uri uri, double d, double d2, String str, Map map) {
        byte[] transcodeImage = C99r.A00.transcodeImage(4YV.A0u(uri), d, d2, str, map);
        if (transcodeImage != null) {
            return transcodeImage;
        }
        throw populateGenericError();
    }

    @Override // com.facebook.msys.mcp.advancedmediatranscoderplugin.Postmailbox
    public void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeGif(Uri uri, TranscodeGifCompletionCallback transcodeGifCompletionCallback) {
        C99r.A00.transcodeGif(uri.toString(), transcodeGifCompletionCallback);
    }

    @Override // com.facebook.msys.mcp.advancedmediatranscoderplugin.Postmailbox
    public void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideo(Uri uri, byte[] bArr, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        C99r.A00.transcodeVideo(uri.toString(), null, j, j2, transcodeVideoCompletionCallback);
    }

    @Override // com.facebook.msys.mcp.advancedmediatranscoderplugin.Postmailbox
    public void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscodeVideoV2(Uri uri, VideoEdits videoEdits, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        C99r.A00.transcodeVideo(uri.toString(), videoEdits, j, j2, transcodeVideoCompletionCallback);
    }

    @Override // com.facebook.msys.mcp.advancedmediatranscoderplugin.Postmailbox
    public void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscoderReportTranscodeFailure(int i) {
        C99r.A00.reportTranscodeFailure(i);
    }

    @Override // com.facebook.msys.mcp.advancedmediatranscoderplugin.Postmailbox
    public void MsysAdvancedMediaTranscoderImpl_MsysMediaTranscoderVideoSizeEstimator(Uri uri, long j, Number number, Number number2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        Double d = null;
        Double valueOf = number == null ? null : Double.valueOf(number.doubleValue());
        if (number2 != null) {
            d = Double.valueOf(number2.doubleValue());
        }
        C99r.A00.estimateVideoSize(uri.toString(), j, valueOf, d, videoSizeEstimatorCompletionCallback);
    }
}
