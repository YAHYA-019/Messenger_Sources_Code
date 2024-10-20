package X;

import android.media.MediaPlayer;

/* renamed from: X.9oJ, reason: invalid class name */
/* loaded from: 9oJ.class */
public final class C9oJ implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ 8vJ A00;

    public C9oJ(8vJ r302) {
        this.A00 = r302;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        8vJ r0 = this.A00;
        MediaPlayer mediaPlayer2 = r0.A00;
        if (mediaPlayer2 == null) {
            11T.A0L("audioPlayer");
            throw 0Q8.createAndThrow();
        }
        mediaPlayer2.start();
        9Vm A03 = 8vJ.A03(r0);
        A03.A03.Cvx(96E.A07);
    }
}
