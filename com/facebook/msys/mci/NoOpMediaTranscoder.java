package com.facebook.msys.mci;

import X.GOo;
import X.GtL;
import X.GtM;
import X.GtN;
import java.util.Map;

/* loaded from: NoOpMediaTranscoder.class */
public class NoOpMediaTranscoder implements MediaTranscoder {
    @Override // com.facebook.msys.mci.MediaTranscoder
    public void estimateVideoSize(String str, long j, Double d, Double d2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        GOo.A1I(new GtM(this, videoSizeEstimatorCompletionCallback));
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void reportTranscodeFailure(int i) {
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeGif(String str, TranscodeGifCompletionCallback transcodeGifCompletionCallback) {
        GOo.A1I(new GtN(this, transcodeGifCompletionCallback));
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public byte[] transcodeImage(String str, double d, double d2, String str2, Map map) {
        return null;
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeImageV2(String str, double d, double d2, double d3, double d4, String str2, Map map, TranscodeImageCompletionCallback transcodeImageCompletionCallback) {
        transcodeImageCompletionCallback.success(null, null, null, null);
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeVideo(String str, VideoEdits videoEdits, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        GOo.A1I(new GtL(this, transcodeVideoCompletionCallback));
    }
}
