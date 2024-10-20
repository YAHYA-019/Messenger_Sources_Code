package X;

import android.media.MediaRecorder;

/* loaded from: Ilj.class */
public final class Ilj implements JM5 {
    public final MediaRecorder A00;

    public Ilj(String str) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        mediaRecorder.setAudioChannels(1);
        mediaRecorder.setAudioSamplingRate(44100);
        mediaRecorder.setAudioEncodingBitRate(64000);
        mediaRecorder.setOutputFile(str);
        mediaRecorder.prepare();
    }

    @Override // X.JM5
    public int Ave() {
        return this.A00.getMaxAmplitude();
    }

    @Override // X.JM5
    public long B1B() {
        return 0L;
    }

    @Override // X.JM5
    public void release() {
        MediaRecorder mediaRecorder = this.A00;
        mediaRecorder.reset();
        mediaRecorder.release();
    }

    @Override // X.JM5
    public void start() {
        this.A00.start();
    }

    @Override // X.JM5
    public void stop() {
        this.A00.stop();
    }
}
