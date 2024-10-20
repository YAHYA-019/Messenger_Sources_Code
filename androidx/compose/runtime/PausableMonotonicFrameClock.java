package androidx.compose.runtime;

import X.0DD;
import X.0DE;
import X.0DH;
import X.0DK;
import X.JR0;
import X.Kjs;
import X.MRW;
import kotlin.jvm.functions.Function2;

/* loaded from: PausableMonotonicFrameClock.class */
public final class PausableMonotonicFrameClock implements MRW {
    public final Kjs A00 = new Kjs();
    public final MRW A01;

    public PausableMonotonicFrameClock(MRW mrw) {
        this.A01 = mrw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0147, code lost:
    
        if (r309 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        if (r314 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    @Override // X.MRW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object DAh(X.0DR r302, kotlin.jvm.functions.Function1 r303) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.DAh(X.0DR, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public Object fold(Object obj, Function2 function2) {
        return JR0.A0n(obj, this, function2);
    }

    public 0DD get(0DH r302) {
        return 0DK.A00(this, r302);
    }

    public /* synthetic */ 0DH getKey() {
        return MRW.A00;
    }

    public 0DE minusKey(0DH r302) {
        return 0DK.A01(this, r302);
    }

    public 0DE plus(0DE r302) {
        return 0DK.A02(this, r302);
    }
}
