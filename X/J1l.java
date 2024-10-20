package X;

import android.os.Handler;

/* loaded from: J1l.class */
public final class J1l implements Runnable {
    public static final String __redex_internal_original_name = "AudioPipelineController$10";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ IEE A01;
    public final /* synthetic */ HOp A02;
    public final /* synthetic */ JIk A03;

    public J1l(Handler handler, IEE iee, HOp hOp, JIk jIk) {
        this.A01 = iee;
        this.A02 = hOp;
        this.A03 = jIk;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        IEE iee = this.A01;
        HOp hOp = this.A02;
        JIk jIk = this.A03;
        Handler handler = this.A00;
        I3J.A00(iee.A0H, "aAS");
        if (iee.A03 == null) {
            IEE.A02(handler, new Gty("Audio pipeline should not be null"), jIk, "addOutput");
            return;
        }
        iee.A0K.BZb("audio_pipeline_adding_output", "AudioPipelineController", null, GOn.A0B(iee));
        iee.A0F.A00 = hOp;
        iee.A03.startInput(new IcH(1, handler, iee, jIk), iee.A0A);
    }
}
