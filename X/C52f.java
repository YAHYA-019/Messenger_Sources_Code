package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioManager;
import android.view.WindowManager;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.52f, reason: invalid class name */
/* loaded from: 52f.class */
public final class C52f {
    public static final String A09 = C52f.class.getName();
    public 1G2 A00;
    public final AudioManager A01;
    public final C52g A02;
    public final 1G2 A06;
    public final Resources A07;
    public final WindowManager A08;
    public final 1Br A04 = 1Bq.A00(33013);
    public final 1Br A03 = 1Bq.A00(16511);
    public final 1Br A05 = 1Bq.A00(16385);

    public C52f() {
        1G2 A0D = 1G0.A02.A0D("sound_toggle_label_shown_times");
        11T.A0A(A0D);
        this.A06 = A0D;
        Context A00 = FbInjector.A00();
        11T.A0D(A00);
        11T.A0F(A00, 1);
        WindowManager windowManager = (WindowManager) 1Hv.A02(A00, 100186);
        ((2yD) this.A05.A00.get()).AZk(36313201164556168L);
        C52g c52g = new C52g();
        c52g.A03 = true;
        c52g.A02 = true;
        c52g.A01 = true;
        c52g.A00 = "v1";
        this.A02 = c52g;
        Resources resources = A00.getResources();
        11T.A0A(resources);
        this.A07 = resources;
        Object systemService = A00.getSystemService("audio");
        11T.A0I(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.A01 = (AudioManager) systemService;
        1G2 r0 = this.A06;
        String str = this.A02.A00;
        11T.A0D(str);
        this.A00 = r0.A0D(str);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) this.A04.A00.get();
        1G2 r02 = this.A00;
        11T.A0D(r02);
        fbSharedPreferences.ArU(r02, 0);
        this.A08 = windowManager;
        windowManager.getDefaultDisplay().getSize(new Point());
    }

    public static final void A00(C52f c52f) {
        1Br.A04(c52f.A03).D0u(new 0BR(0BR.A01(A09, "AudioManager is NULL")));
    }

    public final int A01() {
        int i;
        int i2 = 0;
        try {
            AudioManager audioManager = this.A01;
            11T.A0D(audioManager);
            i = audioManager.getStreamVolume(3);
        } catch (NullPointerException unused) {
            1Br.A04(this.A03).D0u(new 0BR(0BR.A01(A09, "AudioManager throws NPE.")));
            i = 0;
        }
        AudioManager audioManager2 = this.A01;
        11T.A0D(audioManager2);
        int streamMaxVolume = audioManager2.getStreamMaxVolume(3);
        if (streamMaxVolume != 0) {
            i2 = (i * 100) / streamMaxVolume;
        }
        return i2;
    }

    public final boolean A02() {
        AudioManager audioManager = this.A01;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3) > 0;
        }
        A00(this);
        return false;
    }

    public final boolean A03() {
        return ((FbSharedPreferences) this.A04.A00.get()).AZn(C52i.A02, this.A02.A02);
    }
}
