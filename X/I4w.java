package X;

import android.media.AudioManager;
import android.media.AudioTrack;
import com.facebook.audiofiltercore.interfaces.AudioInput;
import java.util.HashMap;

/* loaded from: I4w.class */
public final class I4w {
    public AudioTrack A00;
    public AudioInput A01;
    public I8p A02;
    public HWd A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AudioManager.OnAudioFocusChangeListener A07 = new IH5(this, 0);
    public final AudioManager A08;
    public final int A09;
    public final Hhz A0A;
    public final Qnj A0B;

    public I4w(AudioManager audioManager, Qnj qnj, HWd hWd) {
        audioManager.getClass();
        this.A08 = audioManager;
        this.A03 = hWd;
        int minBufferSize = AudioTrack.getMinBufferSize(44100, 4, 2);
        this.A09 = minBufferSize <= 0 ? 4096 : minBufferSize;
        this.A0B = qnj;
        this.A0A = new Hhz();
        A00();
    }

    private void A00() {
        AudioTrack audioTrack = this.A00;
        if (audioTrack != null) {
            audioTrack.release();
        }
        int i = 0;
        if (this.A0B == Qnj.A01) {
            i = 3;
        }
        this.A00 = new AudioTrack(i, 44100, 4, 2, this.A09, 1, 0);
    }

    public void A01() {
        HWd hWd;
        I8p i8p = this.A02;
        long j = -1;
        if (i8p != null) {
            i8p.A01 = this.A00.getUnderrunCount();
        }
        this.A05 = false;
        try {
            this.A00.pause();
            this.A00.flush();
        } catch (IllegalStateException e) {
            0fH.A0s("AudioPlayer", "Failed to pause AudioPlayer", e);
        }
        Hhz hhz = this.A0A;
        SG5 sg5 = hhz.A01;
        if (sg5 != null && sg5.isAlive()) {
            SG5 sg52 = hhz.A01;
            sg52.A00.A05 = false;
            boolean z = false;
            while (true) {
                try {
                    sg52.join();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        AnonymousClass001.A13();
                    }
                    throw th;
                }
            }
            if (z) {
                AnonymousClass001.A13();
            }
            hhz.A01 = null;
        }
        if (i8p != null) {
            Float valueOf = Float.valueOf(i8p.A02());
            float f = ((float) i8p.A0C) / 1000000.0f;
            Float valueOf2 = Float.valueOf(f);
            long j2 = i8p.A0B;
            HashMap A00 = I8p.A00(i8p, valueOf, valueOf2, Long.valueOf(j2));
            if (i8p.A06 > 30 && (hWd = this.A03) != null) {
                A00.put("render_audio_avg_processing_time_ms", String.valueOf(i8p.A02()));
                long j3 = i8p.A01;
                if (j3 > j) {
                    A00.put("render_audio_num_deadline_missed", String.valueOf(j3));
                }
                A00.put("render_audio_was_recording", String.valueOf(i8p.A0A));
                I8p.A01(i8p, A00, f);
                A00.put("render_audio_samples_per_frame", String.valueOf(j2));
                hWd.A00.BZb("audio_pipeline_effect_removed", "AudioPlayer", A00, GOn.A0B(this));
            }
            this.A02 = null;
        }
    }

    public void A02() {
        if (this.A05) {
            A01();
        }
        if (this.A04) {
            this.A08.abandonAudioFocus(this.A07);
        }
        if (this.A01 != null) {
            this.A01 = null;
        }
        try {
            this.A00.setPlaybackRate(44100);
        } catch (IllegalStateException e) {
            0fH.A0s("AudioPlayer", "Failed to set playback rate for AudioPlayer", e);
        }
    }

    public void A03(boolean z, boolean z2) {
        if (this.A01 != null) {
            AudioManager audioManager = this.A08;
            int i = 3;
            if (audioManager.getStreamVolume(3) <= 0 && z) {
                audioManager.setStreamVolume(3, (int) (audioManager.getStreamMaxVolume(3) * 0.5d), 4);
            }
            this.A06 = z2;
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A07;
            if (!z2) {
                i = 2;
            }
            boolean A1U = 4YV.A1U(audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, i));
            this.A04 = A1U;
            if (!A1U) {
                A01();
                if (this.A04) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                    return;
                }
                return;
            }
            try {
                this.A00.play();
            } catch (IllegalStateException unused) {
                A00();
                this.A00.play();
            }
            int i2 = this.A09;
            I8p i8p = new I8p(((((i2 / 2) / 1) * 1000000) / 44100) * 1000, i2 / 2);
            this.A02 = i8p;
            Hhz hhz = this.A0A;
            AudioInput audioInput = this.A01;
            AudioTrack audioTrack = this.A00;
            hhz.A02 = audioInput;
            hhz.A00 = audioTrack;
            hhz.A04 = new short[(i2 + 1) / 2];
            hhz.A03 = i8p;
            if (hhz.A01 == null) {
                hhz.A05 = true;
                I8p i8p2 = hhz.A03;
                i8p2.A03();
                i8p2.A09 = true;
                SG5 sg5 = new SG5(hhz);
                hhz.A01 = sg5;
                sg5.start();
            }
            this.A05 = true;
        }
    }
}
