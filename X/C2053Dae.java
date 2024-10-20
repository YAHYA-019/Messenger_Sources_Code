package X;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Dae, reason: case insensitive filesystem */
/* loaded from: Dae.class */
public final class C2053Dae extends 5W3 {
    public final int A00;
    public final Object A01;

    public C2053Dae(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean Bke(Activity activity) {
        if (this.A00 != 0) {
            return super.Bke(activity);
        }
        C05w A0Y = ((Fragment) this.A01).getChildFragmentManager().A0Y(2131363328);
        if (A0Y instanceof GGt) {
            return ((GGt) A0Y).Bkd();
        }
        return false;
    }

    public Boolean C31(Activity activity, KeyEvent keyEvent, int i) {
        View view;
        Context applicationContext;
        switch (this.A00) {
            case 0:
                ((Fragment) this.A01).getChildFragmentManager().A0Y(2131363328);
                return null;
            case 1:
            default:
                return super.C31(activity, keyEvent, i);
            case 2:
                Object obj = null;
                if (i == 24) {
                    0fH.A0l(7zK.A00(180), "[Volume] Received volume up key event. Will unmute all montages");
                    9Yc r0 = ((8Gh) this.A01).A0E;
                    if (r0 != null) {
                        r0.A00(false);
                        return null;
                    }
                } else {
                    if (i != 25) {
                        return null;
                    }
                    if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
                        obj = applicationContext.getSystemService("audio");
                    }
                    AudioManager audioManager = (AudioManager) obj;
                    if (audioManager == null) {
                        return null;
                    }
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    Integer valueOf = Integer.valueOf(streamMaxVolume);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (Integer.valueOf(streamVolume) == null || valueOf == null || streamMaxVolume <= 0) {
                        return null;
                    }
                    float f = streamVolume / streamMaxVolume;
                    if (streamVolume > 0 && f >= 0.05f) {
                        return null;
                    }
                    9Yc r02 = ((8Gh) this.A01).A0E;
                    if (r02 != null) {
                        r02.A00(true);
                        return null;
                    }
                }
                11T.A0L("feedState");
                throw 0Q8.createAndThrow();
            case 3:
                int unicodeChar = keyEvent.getUnicodeChar();
                Boolean A0K = AnonymousClass001.A0K();
                if (i == 67) {
                    DZp dZp = (DZp) this.A01;
                    if (dZp.A00 > 0) {
                        view = dZp.A06;
                        view.performClick();
                        return A0K;
                    }
                }
                if (!Character.isDigit(unicodeChar)) {
                    return null;
                }
                view = ((DZp) this.A01).A0a[Character.digit(unicodeChar, 10)];
                view.performClick();
                return A0K;
        }
    }

    public Boolean C35(Activity activity, KeyEvent keyEvent, int i) {
        if (this.A00 != 0) {
            return super.C35(activity, keyEvent, i);
        }
        ((Fragment) this.A01).getChildFragmentManager().A0Y(2131363328);
        return null;
    }
}
