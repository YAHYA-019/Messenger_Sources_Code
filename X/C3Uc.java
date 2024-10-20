package X;

import androidx.lifecycle.Observer;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;

/* renamed from: X.3Uc, reason: invalid class name */
/* loaded from: 3Uc.class */
public final class C3Uc implements Observer {
    public final int A00;
    public final Object A01;

    public C3Uc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C00i c00i, 6F2 r302, Integer num) {
        C08804o3 A02 = MessagingPerformanceLogger.A02((MessagingPerformanceLogger) c00i.get());
        for (String str : A02.A08) {
            A02.A03.A00.get();
            int hashCode = str.hashCode();
            java.util.Map map = C08814o4.A00;
            11T.A0F(map, 2);
            A02.A04(str, 0Pz.A0W(60J.A00("render_message_list", map, hashCode), "_end"));
        }
        if (r302.A0h != null) {
            ((4eA) r302.A3P.get()).A06(num, r302.A0h.A0u().hashCode());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ee, code lost:
    
        if ((!com.google.common.base.Objects.equal(((com.facebook.messaging.model.messages.Message) r0.get(0)).A1g, ((com.facebook.messaging.model.messages.Message) r0.get(0)).A1g)) == false) goto L99;
     */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onChanged(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Uc.onChanged(java.lang.Object):void");
    }
}
