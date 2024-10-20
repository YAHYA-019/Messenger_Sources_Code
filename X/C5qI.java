package X;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.inject.FbInjector;

/* renamed from: X.5qI, reason: invalid class name */
/* loaded from: 5qI.class */
public final class C5qI {
    public final Context A00;
    public final AudioManager A01;
    public final 1Od A02;
    public final 5qJ A03;
    public final C00653oY A04;
    public final C1q7 A05;
    public final C45a A06;
    public final 5II A07;
    public final 1PB A08;
    public final 5IJ A09;
    public final C00i A0A;

    public C5qI() {
        Context A00 = FbInjector.A00();
        AudioManager audioManager = (AudioManager) 1Hv.A02((Context) 1Bn.A0A(83719), 100191);
        5IJ r0 = (5IJ) 1Bi.A03(68025);
        C45a c45a = (C45a) 1Bi.A03(83227);
        this.A00 = A00;
        this.A01 = audioManager;
        this.A09 = r0;
        this.A06 = c45a;
        this.A02 = (1Od) 1Bi.A03(16616);
        this.A05 = (C1q7) 1Bi.A03(16822);
        this.A07 = (5II) 1Bi.A03(68025);
        this.A03 = (5qJ) 1Bi.A03(49847);
        this.A04 = (C00653oY) 1Bi.A03(32769);
        1BQ r02 = new 1BQ(16626);
        this.A0A = r02;
        this.A08 = ((1P8) r02.get()).A00("notification_instance");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e5, code lost:
    
        if (((X.21W) r0.A04.get()).A0A() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.Uri A00(com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5qI.A00(com.facebook.messaging.model.threadkey.ThreadKey):android.net.Uri");
    }
}
