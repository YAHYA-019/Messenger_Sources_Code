package X;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;

/* loaded from: I4r.class */
public final class I4r {
    public 5Vj A00;
    public 5Vj A01;
    public 5Vj A02;
    public final AudioManager.OnAudioFocusChangeListener A03;
    public final 5Vh A04;
    public final JKQ A05;
    public final JLv A06;
    public final JLL A07;

    public I4r(AudioManager audioManager, JKQ jkq, JLv jLv, JLL jll) {
        11T.A0F(audioManager, 1);
        this.A07 = jll;
        this.A06 = jLv;
        this.A04 = new 5Vh(audioManager);
        this.A05 = new If8(jkq);
        this.A03 = new IH5(this, 1);
    }

    public static final boolean A00(5Vj r301, I4r i4r) {
        boolean A1Q = AnonymousClass001.A1Q(i4r.A04.A01(r301), 1);
        i4r.A06.ALc("RtcAudioFocusHandler", "audio focus request successful: %b", 4YU.A1b(A1Q));
        if (!A1Q) {
            i4r.A07.CGw();
        }
        return A1Q;
    }

    public final void A01() {
        5Vj r0 = this.A02;
        if (r0 != null) {
            this.A06.ALc("RtcAudioFocusHandler", "releasing audio focus for call", AnonymousClass001.A1Z());
            this.A04.A00(r0);
        }
        this.A02 = null;
    }

    public final void A02() {
        5Vj r0 = this.A01;
        if (r0 != null) {
            this.A06.ALc("RtcAudioFocusHandler", "releasing audio focus for tones", AnonymousClass001.A1Z());
            this.A04.A00(r0);
        }
        this.A01 = null;
    }

    public final boolean A03() {
        this.A06.ALc("RtcAudioFocusHandler", "requesting audio focus for call", AnonymousClass001.A1Z());
        A01();
        A02();
        SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
        5Vd r0 = new 5Vd();
        AudioAttributes.Builder builder = r0.A00;
        builder.setUsage(2);
        builder.setContentType(1);
        AudioAttributesCompat A0Q = GOq.A0Q(r0);
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A03;
        5Vi r02 = new 5Vi(2);
        r02.A01(onAudioFocusChangeListener);
        r02.A03 = A0Q;
        5Vj A00 = r02.A00();
        this.A02 = A00;
        return A00(A00, this);
    }
}
