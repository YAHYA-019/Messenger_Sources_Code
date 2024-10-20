package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* loaded from: K0O.class */
public class K0O extends K0c {
    public AudioManager A00;
    public final 6Vz A01;

    public K0O(Context context, Handler handler, 6Vz r304, 6Vq r305, 6Wk r306, MFv mFv, 6W2 r308) {
        super(context, handler, r304, r305, r306, mFv, r308);
        this.A01 = r304;
        if (5N4.A02(5N3.A0g)) {
            ((DefaultAudioSink) r306).A0D = r304.A09;
        }
    }

    @Override // X.K0c, X.K0P
    public Krr A0T(6Yl r302, 6Yl r303, C6b1 c6b1) {
        return (!5N4.A02(5N3.A0L) || this.A01.A0K) ? super.A0T(r302, r303, c6b1) : new Krr(r302, r303, c6b1.A03, 0, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        if (r0 <= r0) goto L16;
     */
    @Override // X.K0c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.media.MediaFormat A0k(X.6Yl r302, java.lang.String r303, float r304, int r305) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0O.A0k(X.6Yl, java.lang.String, float, int):android.media.MediaFormat");
    }
}
