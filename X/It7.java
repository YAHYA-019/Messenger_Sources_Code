package X;

/* loaded from: It7.class */
public final class It7 implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerImpl$turnOnVideoSpeakerphone$$inlined$Runnable$1";
    public final /* synthetic */ Gyj A00;

    public It7(Gyj gyj) {
        this.A00 = gyj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HtL A01;
        Gyj gyj = this.A00;
        I5D i5d = ((If6) gyj).A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00("turn_on_video_speakerphone");
        }
        if (!gyj.BRT() && !gyj.BRR() && !gyj.aomIsHeadsetAttached) {
            gyj.AEW(HBP.A05);
        }
        gyj.aomShouldSpeakerOnHeadsetUnplug = true;
    }
}
