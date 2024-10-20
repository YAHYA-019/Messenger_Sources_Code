package X;

/* loaded from: Isj.class */
public final class Isj implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecordingTrack$8";
    public final /* synthetic */ IdJ A00;

    public Isj(IdJ idJ) {
        this.A00 = idJ;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.release();
    }
}
