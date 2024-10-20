package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.2u6, reason: invalid class name */
/* loaded from: 2u6.class */
public abstract class C2u6 {
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c3, code lost:
    
        if (r307 != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2vI A06(final X.3QA r302) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2u6.A06(X.3QA):X.2vI");
    }

    public void AMV(3QA r302) {
        if (this instanceof C2uw) {
            ((C2uw) this).A0G.AMW(new ArrayList(r302.A02));
        } else {
            if ((this instanceof C2u5) || (this instanceof 3AK)) {
                return;
            }
            C2uy.A00((C2uy) this, r302.A02).AMV(r302);
        }
    }

    public boolean BVR(2vI r302) {
        boolean z;
        int i;
        if (this instanceof C2uw) {
            3F8 A03 = r302.A03();
            z = true;
            if (!(A03 instanceof KQ2) && (!(A03 instanceof K2D) || (i = A03.mStatus.A00) == -5 || i == -2 || i == 0)) {
                return false;
            }
        } else {
            if (!(this instanceof C2u5)) {
                return false;
            }
            z = true;
            if (r302.A04() != null) {
                int i2 = ((C3O1) r302.A04()).A00;
                return (i2 == 3 || i2 == 4) ? false : true;
            }
        }
        return z;
    }

    public final 2vI D1c(3QA r302) {
        return A06(r302);
    }

    public 2vI D2J(2vH r302, 3QA r303) {
        if (this instanceof C2uw) {
            C2uw c2uw = (C2uw) this;
            2uE r0 = c2uw.A0D;
            if (r0 != null) {
                r0.A0I(r303.A02);
            }
            C4Ez AMX = c2uw.A0G.AMX(1BK.A17(r303.A02));
            Executor executor = c2uw.A0K;
            AMX.A03(new 3dO(r302, c2uw), executor);
            AMX.A0A(new 3dN(r302, c2uw), executor);
        } else if (this instanceof C2uy) {
            for (C2u6 c2u6 : ((C2uy) this).A05) {
                c2u6.D2J(r302, r303);
            }
        } else {
            r302.A01(1);
        }
        return r302.A00;
    }

    public String getName() {
        if (this instanceof C2u5) {
            return "Facebook";
        }
        if (this instanceof C2uw) {
            return "GooglePlay";
        }
        if (!(this instanceof C2uy)) {
            return "Noop";
        }
        StringBuilder sb = new StringBuilder("Failover");
        C2u6[] c2u6Arr = ((C2uy) this).A05;
        int length = c2u6Arr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                sb.append(":config(");
                sb.append(2);
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                sb.append(false);
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                sb.append(false);
                sb.append(")");
                return sb.toString();
            }
            C2u6 c2u6 = c2u6Arr[i2];
            sb.append(":");
            sb.append(c2u6.getName());
            i = i2 + 1;
        }
    }
}
