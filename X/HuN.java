package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Build;
import java.util.List;

/* loaded from: HuN.class */
public final class HuN {
    public AudioDeviceCallback A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final AudioManager A04;
    public final I5D A05;
    public final BroadcastReceiver A06;
    public final String A07;

    public HuN(AudioManager audioManager, I5D i5d) {
        11T.A0F(audioManager, 1);
        this.A04 = audioManager;
        this.A05 = i5d;
        this.A06 = new GSN(this);
        this.A07 = "FbAudioManager";
        this.A01 = AnonymousClass001.A0s();
    }

    public final void A00(Context context) {
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 29 && !this.A03) {
                this.A02 = this.A04.isSpeakerphoneOn();
                GOo.A15(this.A06, context, "android.media.action.SPEAKERPHONE_STATE_CHANGED");
                this.A03 = true;
            }
        }
    }

    public final void A01(Context context) {
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 29 && this.A03) {
                context.unregisterReceiver(this.A06);
                this.A03 = false;
            }
        }
    }

    public final void A02(boolean z) {
        synchronized (this) {
            I5D i5d = this.A05;
            if (i5d != null) {
                HtL A01 = i5d.A01();
                if (A01 != null) {
                    A01.A02(0Pz.A1C("system_set_speakerphone: ", z));
                }
            }
            this.A04.setSpeakerphoneOn(z);
            this.A02 = z;
            if (i5d != null) {
                HtL A012 = i5d.A01();
                if (A012 != null) {
                    A012.A01(0Pz.A1C("system_set_speakerphone: ", z));
                }
            }
        }
    }

    public final boolean A03() {
        boolean z;
        synchronized (this) {
            if (Build.VERSION.SDK_INT < 29 || !this.A03) {
                try {
                    z = this.A04.isSpeakerphoneOn();
                } catch (Exception e) {
                    0fH.A0r(this.A07, "audioManager.isSpeakerphoneOn failed with exception", e);
                    z = false;
                }
            } else {
                z = this.A02;
            }
        }
        return z;
    }
}
