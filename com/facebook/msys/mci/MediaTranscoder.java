package com.facebook.msys.mci;

import java.util.Map;

/* loaded from: MediaTranscoder.class */
public interface MediaTranscoder {
    void estimateVideoSize(String str, long j, Double d, Double d2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback);

    void reportTranscodeFailure(int i);

    void transcodeGif(String str, TranscodeGifCompletionCallback transcodeGifCompletionCallback);

    byte[] transcodeImage(String str, double d, double d2, String str2, Map map);

    void transcodeImageV2(String str, double d, double d2, double d3, double d4, String str2, Map map, TranscodeImageCompletionCallback transcodeImageCompletionCallback);

    void transcodeVideo(String str, VideoEdits videoEdits, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback);
}
