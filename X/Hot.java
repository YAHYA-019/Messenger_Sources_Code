package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Hot.class */
public final class Hot {
    public final AudioManager A00;
    public final Set A01;
    public final Context A02;
    public final 1De A03;

    public Hot(1De r302) {
        this.A03 = r302;
        Context A0A = AbK.A0A(r302);
        this.A02 = A0A;
        this.A00 = (AudioManager) 7zR.A0o(A0A, 100191);
        this.A01 = AbI.A07();
    }

    public final boolean A00(int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        11T.A0F(keyEvent, 1);
        boolean z = true;
        if (keyEvent.getAction() == 0) {
            if (i == 24) {
                audioManager = this.A00;
                audioManager.adjustStreamVolume(3, 1, 0);
            } else if (i == 25) {
                audioManager = this.A00;
                audioManager.adjustStreamVolume(3, -1, 0);
            }
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((JEn) it.next()).CUx(streamVolume, streamMaxVolume);
            }
            return z;
        }
        z = false;
        return z;
    }
}
