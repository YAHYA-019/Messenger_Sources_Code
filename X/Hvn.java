package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* loaded from: Hvn.class */
public abstract class Hvn {
    public static final AudioOutputRoute A00(HBP hbp) {
        AudioOutputRoute audioOutputRoute;
        11T.A0F(hbp, 0);
        int ordinal = hbp.ordinal();
        if (ordinal == 0) {
            audioOutputRoute = AudioOutputRoute.EARPIECE;
        } else if (ordinal == 1) {
            audioOutputRoute = AudioOutputRoute.SPEAKER;
        } else if (ordinal == 2) {
            audioOutputRoute = AudioOutputRoute.BLUETOOTH;
        } else {
            if (ordinal != 3) {
                throw 1BK.A1F();
            }
            audioOutputRoute = AudioOutputRoute.HEADSET;
        }
        11T.A0B(audioOutputRoute);
        return audioOutputRoute;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r301.equals(com.facebook.rsys.audio.gen.AudioOutputRoute.BLUETOOTH_HFP) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.rsys.audio.gen.AudioOutputRoute r301) {
        /*
            com.facebook.rsys.audio.gen.AudioOutputRoute r0 = com.facebook.rsys.audio.gen.AudioOutputRoute.BLUETOOTH
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3c
            com.facebook.rsys.audio.gen.AudioOutputRoute r0 = com.facebook.rsys.audio.gen.AudioOutputRoute.BLUETOOTH_A2DP
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3c
            com.facebook.rsys.audio.gen.AudioOutputRoute r0 = com.facebook.rsys.audio.gen.AudioOutputRoute.BLUETOOTH_LE
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3c
            com.facebook.rsys.audio.gen.AudioOutputRoute r0 = com.facebook.rsys.audio.gen.AudioOutputRoute.BLUETOOTH_HFP
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L3e
        L3c:
            r0 = 1
            r303 = r0
        L3e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hvn.A01(com.facebook.rsys.audio.gen.AudioOutputRoute):boolean");
    }
}
