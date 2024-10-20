package X;

import com.facebook.fbservice.service.BlueServiceLogic;

/* renamed from: X.31c, reason: invalid class name */
/* loaded from: 31c.class */
public final class C31c {
    public final BlueServiceLogic A00 = (BlueServiceLogic) 1Bi.A03(16567);

    public int A00(Class cls) {
        int i;
        int i2;
        BlueServiceLogic blueServiceLogic = this.A00;
        int A03 = 0FI.A03(-1874442374);
        synchronized (blueServiceLogic.A0A) {
            try {
                1Id r0 = (1Id) blueServiceLogic.A0B.get(cls);
                if (r0 != null) {
                    synchronized (r0) {
                        i = r0.A0K.size();
                    }
                    i2 = 2120233255;
                } else {
                    i = -1;
                    i2 = 634447244;
                }
            } catch (Throwable th) {
                0FI.A09(1832667477, A03);
                throw th;
            }
        }
        0FI.A09(i2, A03);
        return i;
    }
}
