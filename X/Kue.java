package X;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* loaded from: Kue.class */
public abstract class Kue {
    public static int A08(Recomposer recomposer) {
        return ((KN2) recomposer.A0K.getValue()).compareTo(KN2.ShuttingDown);
    }

    public 0DE A09() {
        return this instanceof Recomposer ? ((Recomposer) this).A0J : ((C2833Jap) this).A07.A0U.A09();
    }

    public void A0A(MMw mMw) {
        C2s8 c2s8;
        if (!(this instanceof Recomposer)) {
            LNS lns = ((C2833Jap) this).A07;
            Kue kue = lns.A0U;
            kue.A0A(lns.A0V);
            kue.A0A(mMw);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        synchronized (recomposer.A0D) {
            LtK ltK = recomposer.A0C;
            if (ltK.A0D(mMw)) {
                c2s8 = null;
            } else {
                ltK.A0C(mMw);
                c2s8 = Recomposer.A01(recomposer);
            }
        }
        if (c2s8 != null) {
            c2s8.resumeWith(04S.A00);
        }
    }

    public void A0B(MMw mMw) {
        if (!(this instanceof Recomposer)) {
            ((C2833Jap) this).A07.A0U.A0B(mMw);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        synchronized (recomposer.A0D) {
            Set set = recomposer.A04;
            if (set == null) {
                set = 7zL.A15();
                recomposer.A04 = set;
            }
            set.add(mMw);
        }
    }

    public void A0C(MMw mMw) {
        if (!(this instanceof Recomposer)) {
            ((C2833Jap) this).A07.A0U.A0C(mMw);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        synchronized (recomposer.A0D) {
            recomposer.A0E.remove(mMw);
            recomposer.A03 = null;
            recomposer.A0C.A0E(mMw);
            recomposer.A0G.remove(mMw);
        }
    }

    public void A0D(MMw mMw, Function2 function2) {
        if (!(this instanceof Recomposer)) {
            ((C2833Jap) this).A07.A0U.A0D(mMw, function2);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        LNU lnu = (LNU) mMw;
        LNS lns = lnu.A05;
        boolean z = lns.A0L;
        try {
            C2874Jbr A00 = M6y.A00(mMw, null);
            try {
                L32 l32 = LEY.A05;
                Snapshot snapshot = (Snapshot) l32.A01();
                l32.A02(A00);
                try {
                    synchronized (lnu.A0D) {
                        LNU.A02(lnu);
                        KsG ksG = lnu.A00;
                        lnu.A00 = new KsG();
                        try {
                            if (lns.A0E.A00.A02 != 0) {
                                LDN.A03("Expected applyChanges() to have been called");
                                throw 0Q8.createAndThrow();
                            }
                            LNS.A0M(lns, ksG, function2);
                        } catch (Exception e) {
                            lnu.A00 = ksG;
                            throw e;
                        }
                    }
                    Recomposer.A04(A00);
                    if (!z) {
                        LEY.A00().A0E();
                    }
                    Object obj = recomposer.A0D;
                    synchronized (obj) {
                        if (A08(recomposer) > 0 && !Recomposer.A00(recomposer).contains(mMw)) {
                            recomposer.A0E.add(mMw);
                            recomposer.A03 = null;
                        }
                    }
                    synchronized (obj) {
                        try {
                            List list = recomposer.A0F;
                            if (0 < list.size()) {
                                list.get(0);
                                throw AnonymousClass001.A0Q("getComposition$runtime_release");
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    try {
                        mMw.A8k();
                        mMw.A8t();
                        if (z) {
                            return;
                        }
                        LEY.A00().A0E();
                    } catch (Exception e2) {
                        Recomposer.A03(null, recomposer, e2);
                    }
                } catch (Throwable th2) {
                    try {
                        try {
                            LNU.A01(lnu);
                            throw th2;
                        } catch (Exception e3) {
                            lnu.A3c();
                            throw e3;
                        }
                    } finally {
                        l32.A02(snapshot);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                Recomposer.A04(A00);
            }
        } catch (Exception e4) {
            Recomposer.A03(mMw, recomposer, e4);
        }
    }

    public boolean A0E() {
        return this instanceof Recomposer ? AnonymousClass001.A1V(Recomposer.A0M.get()) : ((C2833Jap) this).A07.A0U.A0E();
    }
}
