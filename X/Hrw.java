package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerFragment;

/* loaded from: Hrw.class */
public final class Hrw {
    public final IQ1 A00;
    public final MontageComposerFragment A01;
    public final IWN A02;

    public Hrw(IQ1 iq1, MontageComposerFragment montageComposerFragment, IWN iwn) {
        this.A00 = iq1;
        this.A01 = montageComposerFragment;
        this.A02 = iwn;
    }

    public boolean A00() {
        ThreadKey threadKey = this.A00.A1N.A0B.A04;
        return 7zO.A1Y(threadKey == null ? false : threadKey.A1A());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r0.A01.A01.A06() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01() {
        /*
            r301 = this;
            r0 = r301
            X.IQ1 r0 = r0.A00
            X.IBw r0 = r0.A1G
            r302 = r0
            r0 = r302
            X.1pK r0 = r0.A03()
            X.JOH r0 = (X.JOH) r0
            X.Gbu r0 = (X.AbstractC2392Gbu) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r303
            X.GnK r0 = (X.GnK) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A1b()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3a
            r0 = r303
            X.Hag r0 = r0.A01
            X.ICU r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.A06()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L3e
        L3a:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L3e:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hrw.A01():boolean");
    }
}
