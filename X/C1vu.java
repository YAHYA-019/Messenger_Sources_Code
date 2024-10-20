package X;

import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1vu, reason: invalid class name */
/* loaded from: 1vu.class */
public final class C1vu extends C1vp {
    public final AtomicBoolean A00;

    public C1vu() {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.A00 = atomicBoolean;
        atomicBoolean.set(((1Ex) 1Bi.A03(83426)).BTw());
    }

    @Override // X.C1vp
    public boolean A00(C1wd c1wd) {
        Object obj;
        1wM r0 = c1wd.A01;
        EnumSet enumSet = ((1wN) r0).A04;
        if (enumSet.contains(C1w2.A0S)) {
            if (!this.A00.get()) {
                obj = "Job cancelled because user is not logged in.";
                0fH.A0a(Integer.valueOf(((1wN) r0).A00), obj, enumSet, "LoginStatusJobConstraint", "reviewJob CANCEL jobId[%s] - %s. jobHints[%s]");
                c1wd.A00.cancel(false);
                return false;
            }
            return true;
        }
        if (enumSet.contains(C1w2.A0T) && this.A00.get()) {
            obj = "Job cancelled because user is logged in.";
            0fH.A0a(Integer.valueOf(((1wN) r0).A00), obj, enumSet, "LoginStatusJobConstraint", "reviewJob CANCEL jobId[%s] - %s. jobHints[%s]");
            c1wd.A00.cancel(false);
            return false;
        }
        return true;
    }
}
