package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.facebook.messaging.audio.playback.view.AudioPlayerWaveformBubbleView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.widget.FbImageView;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gli, reason: case insensitive filesystem */
/* loaded from: Gli.class */
public final class C2696Gli extends C1rj {
    public int A00;
    public int A01;
    public C2ko A02;
    public C2ko A03;
    public C2ko A04;
    public MigColorScheme A05;
    public MediaResource A06;
    public 6Sn A07;
    public Hgt A08;
    public I5O A09;
    public HAN A0A;
    public boolean A0B;

    public C2696Gli() {
        super("RecordingControlsWaveform");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.RHY, java.lang.Object] */
    public static void A00(C2iw c2iw, boolean z) {
        C2ko A0G = 1LI.A0G(c2iw, 1998489358);
        if (A0G != 0) {
            ?? obj = new Object();
            ((RHY) obj).A00 = z;
            A0G.A00(obj, AnonymousClass001.A1Z());
        }
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new AudioPlayerWaveformBubbleView(context, null, 0);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        int i = c2ko.A02;
        if (i == -1299219168) {
            1Iw r0 = c2ko.A00;
            long j = ((HZ1) obj).A00;
            AtomicReference atomicReference = ((C2707Glu) 4YU.A0P(r0)).A00;
            11T.A0F(atomicReference, 1);
            AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView = (AudioPlayerWaveformBubbleView) atomicReference.get();
            if (audioPlayerWaveformBubbleView == null) {
                return null;
            }
            audioPlayerWaveformBubbleView.A0E(j);
            return null;
        }
        if (i != 928851057) {
            if (i != 1998489358) {
                return null;
            }
            1Iw r02 = c2ko.A00;
            boolean z = ((RHY) obj).A00;
            r02.A06();
            if (r02.A02 == null) {
                return null;
            }
            r02.A0G(7zS.A0M(0, z), "updateState:RecordingControlsWaveform.onUpdateAvatarAudioMessageEnabled");
            return null;
        }
        1Iw r03 = c2ko.A00;
        double d = ((HZ2) obj).A00;
        AtomicReference atomicReference2 = ((C2707Glu) 4YU.A0P(r03)).A00;
        11T.A0F(atomicReference2, 1);
        AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView2 = (AudioPlayerWaveformBubbleView) atomicReference2.get();
        if (audioPlayerWaveformBubbleView2 == null) {
            return null;
        }
        VoiceVisualizer voiceVisualizer = audioPlayerWaveformBubbleView2.A0G;
        voiceVisualizer.A0D.clear();
        voiceVisualizer.A02((float) C7ui.A00(d));
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A04, this, r303);
        7zQ.A1H(r302, this.A03, this, r303);
        7zQ.A1H(r302, this.A02, this, r303);
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        1BK.A1K(r302, 0, c23p);
        C2ra.A05(c23p, i, i2, View.MeasureSpec.getSize(i), GOn.A07(r302.A0D.getResources(), 2132279359));
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        JNF jnf;
        VoiceVisualizer voiceVisualizer;
        FY4 iKg;
        C2707Glu c2707Glu = (C2707Glu) 4YU.A0P(r302);
        AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView = (AudioPlayerWaveformBubbleView) obj;
        I5O i5o = this.A09;
        int i = this.A01;
        MigColorScheme migColorScheme = this.A05;
        HAN han = this.A0A;
        Hgt hgt = this.A08;
        MediaResource mediaResource = this.A06;
        int i2 = this.A00;
        6Sn r0 = this.A07;
        boolean z = c2707Glu.A01;
        AtomicReference atomicReference = c2707Glu.A00;
        11T.A0F(audioPlayerWaveformBubbleView, 1);
        7zT.A11(2, i5o, migColorScheme, han, hgt);
        7zP.A1O(r0, 9, atomicReference);
        i5o.A02 = audioPlayerWaveformBubbleView;
        VoiceVisualizer voiceVisualizer2 = audioPlayerWaveformBubbleView.A0G;
        if (voiceVisualizer2 != null) {
            i5o.A05 = new GPX(i5o.A0B, voiceVisualizer2);
        }
        i5o.A04 = han;
        i5o.A03 = hgt;
        AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView2 = i5o.A02;
        if (audioPlayerWaveformBubbleView2 != null) {
            audioPlayerWaveformBubbleView2.A0F.setOnClickListener(new IKB(i5o, 72));
        }
        AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView3 = i5o.A02;
        if (audioPlayerWaveformBubbleView3 != null) {
            GPX gpx = i5o.A05;
            if (gpx == null) {
                iKg = new FY4(2);
            } else {
                iKg = new IKg(1, i5o, gpx, new GestureDetector(new GfS(i5o, gpx)));
                i5o.A00 = iKg;
            }
            audioPlayerWaveformBubbleView3.setOnTouchListener(iKg);
        }
        AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView4 = i5o.A02;
        if (audioPlayerWaveformBubbleView4 != null) {
            audioPlayerWaveformBubbleView4.A00 = i5o.A0A;
        }
        if (i5o.A04 == HAN.A05) {
            i5o.A06 = Integer.valueOf(i2);
            I5O.A00(migColorScheme, i5o, i2, true);
            AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView5 = i5o.A02;
            if (audioPlayerWaveformBubbleView5 != null) {
                FbImageView fbImageView = audioPlayerWaveformBubbleView5.A0F;
                fbImageView.setVisibility(8);
                fbImageView.requestLayout();
            }
            AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView6 = i5o.A02;
            if (audioPlayerWaveformBubbleView6 != null && (voiceVisualizer = audioPlayerWaveformBubbleView6.A0G) != null) {
                voiceVisualizer.A0C.clear();
            }
            AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView7 = i5o.A02;
            if (audioPlayerWaveformBubbleView7 != null) {
                audioPlayerWaveformBubbleView7.setProgress(1.0f);
            }
        } else {
            i5o.A06 = Integer.valueOf(i);
            I5O.A00(migColorScheme, i5o, i, false);
        }
        int ordinal = i5o.A04.ordinal();
        Integer num = ordinal != 2 ? ordinal != 3 ? ordinal != 1 ? 0S2.A0N : 0S2.A0Y : 0S2.A0C : 0S2.A01;
        AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView8 = i5o.A02;
        if (audioPlayerWaveformBubbleView8 != null) {
            audioPlayerWaveformBubbleView8.A0G(num);
        }
        if (mediaResource != null) {
            IDp iDp = i5o.A01;
            i5o.A02(mediaResource, (iDp == null || (jnf = iDp.A01) == null) ? null : 1BK.A0l(jnf.getCurrentPosition()));
        }
        atomicReference.set(audioPlayerWaveformBubbleView);
        audioPlayerWaveformBubbleView.A0E.setVisibility(DKG.A00(z ? 1 : 0));
        audioPlayerWaveformBubbleView.A04 = r0.A02();
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        AtomicReference atomicReference = ((C2707Glu) 4YU.A0P(r302)).A00;
        11T.A0F(atomicReference, 2);
        atomicReference.set(null);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C2707Glu c2707Glu = (C2707Glu) r303;
        boolean z = this.A0B;
        AtomicReference atomicReference = new AtomicReference();
        c2707Glu.A01 = 7zO.A1Y(z);
        c2707Glu.A00 = atomicReference;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C2696Gli c2696Gli = (C2696Gli) r302;
            6Sn r0 = this.A07;
            6Sn r02 = c2696Gli.A07;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (this.A0B != c2696Gli.A0B || this.A00 != c2696Gli.A00) {
                return false;
            }
            MigColorScheme migColorScheme = this.A05;
            MigColorScheme migColorScheme2 = c2696Gli.A05;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            I5O i5o = this.A09;
            I5O i5o2 = c2696Gli.A09;
            if (i5o != null) {
                if (!i5o.equals(i5o2)) {
                    return false;
                }
            } else if (i5o2 != null) {
                return false;
            }
            MediaResource mediaResource = this.A06;
            MediaResource mediaResource2 = c2696Gli.A06;
            if (mediaResource != null) {
                if (!mediaResource.equals(mediaResource2)) {
                    return false;
                }
            } else if (mediaResource2 != null) {
                return false;
            }
            if (this.A01 != c2696Gli.A01) {
                return false;
            }
            Hgt hgt = this.A08;
            Hgt hgt2 = c2696Gli.A08;
            if (hgt != null) {
                if (!hgt.equals(hgt2)) {
                    return false;
                }
            } else if (hgt2 != null) {
                return false;
            }
            HAN han = this.A0A;
            HAN han2 = c2696Gli.A0A;
            if (han != null) {
                if (!han.equals(han2)) {
                    return false;
                }
            } else if (han2 != null) {
                return false;
            }
        }
        return true;
    }
}
