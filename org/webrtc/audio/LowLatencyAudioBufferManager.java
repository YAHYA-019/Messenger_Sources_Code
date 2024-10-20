package org.webrtc.audio;

import X.0Pz;
import android.media.AudioTrack;
import org.webrtc.Logging;

/* loaded from: LowLatencyAudioBufferManager.class */
public class LowLatencyAudioBufferManager {
    public static final String TAG = "LowLatencyAudioBufferManager";
    public int prevUnderrunCount = 0;
    public int ticksUntilNextDecrease = 10;
    public boolean keepLoweringBufferSize = true;
    public int bufferIncreaseCounter = 0;

    public void maybeAdjustBufferSize(AudioTrack audioTrack) {
        int underrunCount = audioTrack.getUnderrunCount();
        if (underrunCount > this.prevUnderrunCount) {
            if (this.bufferIncreaseCounter < 5) {
                int bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                int playbackRate = (audioTrack.getPlaybackRate() / 100) + bufferSizeInFrames;
                Logging.d(TAG, 0Pz.A0C(bufferSizeInFrames, playbackRate, "Underrun detected! Increasing AudioTrack buffer size from ", " to "));
                audioTrack.setBufferSizeInFrames(playbackRate);
                this.bufferIncreaseCounter++;
            }
            this.keepLoweringBufferSize = false;
            this.prevUnderrunCount = underrunCount;
        } else {
            if (!this.keepLoweringBufferSize) {
                return;
            }
            int i = this.ticksUntilNextDecrease - 1;
            this.ticksUntilNextDecrease = i;
            if (i > 0) {
                return;
            }
            int playbackRate2 = audioTrack.getPlaybackRate() / 100;
            int bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
            int max = Math.max(playbackRate2, bufferSizeInFrames2 - playbackRate2);
            if (max != bufferSizeInFrames2) {
                Logging.d(TAG, 0Pz.A0C(bufferSizeInFrames2, max, "Lowering AudioTrack buffer size from ", " to "));
                audioTrack.setBufferSizeInFrames(max);
            }
        }
        this.ticksUntilNextDecrease = 10;
    }
}
