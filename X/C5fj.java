package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.common.memory.leaklistener.core.KeyedWeakReference;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.5fj, reason: invalid class name */
/* loaded from: 5fj.class */
public final class C5fj implements C1q2 {
    public static final Random A02 = new Random();
    public int A00;
    public String A01;

    public static void A00(C5fj c5fj, String str, String str2, java.util.Map map, boolean z) {
        9HF r0;
        String str3;
        if (C01083pw.A0a != null) {
            C01083pw A00 = C01083pw.A00();
            synchronized (A00) {
                C15h c15h = A00.A0L;
                if (A00.A04 == null) {
                    0T9.A02("MemoryManager.getMemoryInstanceEventFactory", 1469400571);
                    A00.A04 = (9HF) c15h.get();
                    0T9.A00(239582583);
                }
                r0 = A00.A04;
            }
            if (r0 != null) {
                1UD r02 = (04J) r0.A00.get();
                String str4 = map.get(ErrorReportingConstants.ENDPOINT) != null ? (String) map.get(ErrorReportingConstants.ENDPOINT) : "";
                String str5 = c5fj.A01;
                Boolean valueOf = Boolean.valueOf(z);
                1UG A002 = 1UD.A00(r02, 1ZG.A01, 1BJ.A00(950));
                if (A002.isSampled()) {
                    str3 = "";
                    if (str == null) {
                        str = str3;
                    }
                    A002.A7R(DKB.A00(9), str);
                    if (str2 == null) {
                        str2 = str3;
                    }
                    A002.A7R(1BJ.A00(560), str2);
                    if (str5 == null) {
                        str5 = str3;
                    }
                    A002.A7R("asl_session_id", str5);
                    A002.A7R(ErrorReportingConstants.ENDPOINT, str4 != null ? str4 : "");
                    A002.A5H("is_leak", valueOf);
                    A002.BZL();
                }
            }
        }
    }

    @Override // X.C1q2
    public void C3Q(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj != null) {
                if (A02.nextInt(this.A00) == 0) {
                    java.util.Map emptyMap = Collections.emptyMap();
                    String A0Y = AnonymousClass001.A0Y(obj);
                    if (reference instanceof KeyedWeakReference) {
                        emptyMap = Collections.unmodifiableMap(((KeyedWeakReference) reference).mMetadata);
                    }
                    A00(this, A0Y, null, emptyMap, true);
                }
            }
        }
    }

    @Override // X.C1q2
    public boolean isEnabled() {
        C01083pw.A00().A07();
        return false;
    }
}
