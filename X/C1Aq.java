package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: X.1Aq, reason: invalid class name */
/* loaded from: 1Aq.class */
public final class C1Aq extends C17v {
    public C1Aq() {
        super("lc");
    }

    @Override // X.C17v
    public JSONObject A02(boolean z, boolean z2) {
        JSONObject A12;
        synchronized (this) {
            A12 = AnonymousClass001.A12();
            Iterator A0x = AnonymousClass001.A0x(this.A01);
            long j = 0;
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                switch (((16D) A0z.getKey()).ordinal()) {
                    case 0:
                    case 1:
                        j += ((AtomicLong) A0z.getValue()).longValue();
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        if (z) {
                            A12.putOpt(((C16z) A0z.getKey()).Asm(), Long.valueOf(((AtomicLong) A0z.getValue()).getAndSet(0L)));
                            break;
                        } else {
                            A12.putOpt(((C16z) A0z.getKey()).Asm(), A0z.getValue());
                            continue;
                        }
                }
                A12.putOpt(((C16z) A0z.getKey()).Asm(), A0z.getValue());
            }
            A12.putOpt(16D.A0A.mJsonKey, Long.valueOf(j));
        }
        return A12;
    }
}
