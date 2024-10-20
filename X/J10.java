package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* loaded from: J10.class */
public final class J10 implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$setAudioOutputRoute$runnable$1";
    public final /* synthetic */ AudioOutputRoute A00;
    public final /* synthetic */ Gw0 A01;
    public final /* synthetic */ boolean A02;

    public J10(AudioOutputRoute audioOutputRoute, Gw0 gw0, boolean z) {
        this.A00 = audioOutputRoute;
        this.A01 = gw0;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HBP hbp;
        JLv jLv;
        AudioOutputRoute audioOutputRoute = this.A00;
        Gw0 gw0 = this.A01;
        gw0.A02 = 11T.A0O(audioOutputRoute, AudioOutputRoute.SPEAKER);
        if (gw0.A0D && gw0.A0F != null && !11T.A0O(audioOutputRoute, gw0.A0F)) {
            if (11T.A0O(audioOutputRoute, AudioOutputRoute.UNKNOWN) || (jLv = gw0.A0A) == null) {
                return;
            }
            AudioOutputRoute audioOutputRoute2 = gw0.A0F;
            jLv.ALc("AndroidAudioProxy", 0Pz.A0w("rsys<->product audio route mismatch. Last product route [", audioOutputRoute2 != null ? audioOutputRoute2.name : null, "] rsys route [", audioOutputRoute.name, ']'), new Object[0]);
            return;
        }
        boolean z = this.A02;
        if ((z || (gw0.A0C && !gw0.A02)) && 11T.A0O(audioOutputRoute.identifier, AudioOutputRoute.EARPIECE.identifier)) {
            audioOutputRoute = AudioOutputRoute.SPEAKER;
            11T.A0B(audioOutputRoute);
        }
        if (!11T.A0O(gw0.A01, audioOutputRoute.identifier)) {
            if (!audioOutputRoute.identifier.equals(AudioOutputRoute.UNKNOWN.identifier)) {
                JLv jLv2 = gw0.A0A;
                if (jLv2 != null) {
                    jLv2.ALc("AndroidAudioProxy", 0Pz.A0W("change audio ", audioOutputRoute.name), new Object[0]);
                }
                if (Hvn.A01(audioOutputRoute)) {
                    hbp = HBP.A02;
                } else if (audioOutputRoute.equals(AudioOutputRoute.SPEAKER)) {
                    hbp = HBP.A05;
                } else if (audioOutputRoute.equals(AudioOutputRoute.EARPIECE)) {
                    hbp = HBP.A03;
                } else {
                    if (!audioOutputRoute.equals(AudioOutputRoute.HEADSET)) {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("audioOutput = ");
                        A0k.append(audioOutputRoute);
                        throw AnonymousClass002.A0D(" is not convertible", A0k);
                    }
                    hbp = HBP.A04;
                }
                gw0.A09.A01.AEW(hbp);
            }
            gw0.A01 = audioOutputRoute.identifier;
        }
        if (gw0.A04 && z != gw0.A05) {
            HgY hgY = gw0.A09;
            JOT jot = hgY.A01;
            if (jot.BRT() || jot.BRS()) {
                jot.Cuk(z ? true : hgY.A00);
            }
            ((If6) jot).aomShouldSpeakerOnHeadsetUnplug = z;
            gw0.A05 = z;
        }
        gw0.A09.A01.CqI(!(!z));
    }
}
