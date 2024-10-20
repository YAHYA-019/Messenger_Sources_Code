package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: Gl8.class */
public final class Gl8 extends C1rj {
    public HVP A00;
    public 6TI A01;
    public boolean A02;

    public Gl8() {
        super("MediaSyncCowatchGrootComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A02), this.A00, null, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = this.A02;
        6TI r0 = this.A01;
        4YV.A1N(r302, r0);
        GRD grd = new GRD((I3f) null);
        grd.A0a = true;
        GR6 A00 = GR5.A00(r302);
        Context context = r302.A0D;
        11T.A0A(context);
        List A14 = C0s8.A14(new IhZ(context, z), (6cX) 1Bn.A0E(context, (1BY) null, 68237));
        GR5 gr5 = A00.A01;
        gr5.A0J = A14;
        A00.A2a(new GR2());
        A00.A2Y(6TN.A09);
        A00.A2Z(I9A.A0F);
        A00.A2b(r0);
        gr5.A0D = null;
        A00.A2X((float) r0.A00);
        gr5.A06 = 6TM.A04;
        gr5.A0S = true;
        gr5.A0R = true;
        A00.A1v(1LI.A05(r302, Gl8.class, "MediaSyncCowatchGrootComponent"));
        gr5.A09 = grd;
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        HVP hvp;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1803022739 || (hvp = ((Gl8) r302.A00.A01).A00) == null) {
            return null;
        }
        I9A i9a = hvp.A00;
        Iterator it = i9a.A0B.iterator();
        while (it.hasNext()) {
            67N r0 = (67N) it.next();
            6U2 A01 = i9a.A01();
            if (A01 != null) {
                A01.A05(r0);
                it.remove();
            } else {
                4zI.A03.A06("MediaSyncVideoPlayer", "Player not ready", AnonymousClass001.A1Z());
            }
        }
        i9a.A01 = true;
        List list = i9a.A0A;
        synchronized (list) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            list.clear();
        }
        return null;
    }
}
