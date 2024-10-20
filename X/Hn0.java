package X;

import android.media.MediaCodec;
import android.view.Surface;

/* loaded from: Hn0.class */
public abstract class Hn0 {
    public final /* synthetic */ I3R A00;

    public Hn0(I3R i3r) {
        this.A00 = i3r;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, X.I3R] */
    public final void A00() {
        HFk hFk;
        Hn0 hn0;
        try {
            if (!(this instanceof H3f)) {
                H3e h3e = (H3e) this;
                MediaCodec mediaCodec = h3e.A01;
                try {
                    mediaCodec.release();
                    return;
                } catch (Exception unused) {
                    Thread.sleep(h3e.A00);
                    mediaCodec.release();
                    return;
                }
            }
            H3f h3f = (H3f) this;
            switch (h3f.A00) {
                case 0:
                    Hud hud = (Hud) h3f.A02;
                    if (hud != null) {
                        try {
                            StringBuilder sb = hud.A08;
                            sb.append("stopB,");
                            ?? obj = new Object();
                            MediaCodec mediaCodec2 = hud.A05;
                            try {
                                mediaCodec2.stop();
                            } catch (Exception unused2) {
                                if (hud.A0B) {
                                    try {
                                        Thread.sleep(hud.A04);
                                        mediaCodec2.stop();
                                    } catch (Exception unused3) {
                                    }
                                }
                            }
                            if (hud.A0B) {
                                new H3e(mediaCodec2, obj, hud.A04);
                                new Object();
                            } else {
                                new H3f(mediaCodec2, (I3R) obj);
                                new Object();
                            }
                            hFk.A00 = hn0;
                            hFk.A00();
                            hud.A02 = null;
                            hud.A03 = null;
                            hud.A00 = null;
                            Surface surface = hud.A06;
                            if (surface != null) {
                                surface.release();
                            }
                            Throwable th = ((I3R) obj).A00;
                            if (th != null) {
                                throw th;
                            }
                            sb.append("stopE,");
                            return;
                        } catch (Throwable th2) {
                            throw new IllegalStateException(0Pz.A0v("codec info:  ", hud.A01, " mediaCodecException: ", th2 instanceof MediaCodec.CodecException ? IFX.A02(th2) : "null"), th2);
                        }
                    }
                    return;
                case 1:
                    JNA jna = (JNA) h3f.A02;
                    if (jna != null) {
                        jna.release();
                        return;
                    }
                    return;
                case 2:
                    JNX jnx = (JNX) h3f.A02;
                    if (jnx != null) {
                        jnx.release();
                        return;
                    }
                    return;
                default:
                    MediaCodec mediaCodec3 = (MediaCodec) h3f.A02;
                    if (mediaCodec3 != null) {
                        mediaCodec3.release();
                        return;
                    }
                    return;
            }
        } catch (Throwable th3) {
            I3R.A00(this.A00, th3);
        }
        I3R.A00(this.A00, th3);
    }
}
