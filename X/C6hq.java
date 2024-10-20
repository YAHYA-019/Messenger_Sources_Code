package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6hq, reason: invalid class name */
/* loaded from: 6hq.class */
public final class C6hq implements C1yj {
    public final LinkedList A02 = new LinkedList();
    public final C00i A01 = new 1BQ(16385);
    public final C00i A00 = new 1BQ(99390);

    public static void A00(C7rY c7rY, C6hq c6hq) {
        LinkedList linkedList = c6hq.A02;
        synchronized (linkedList) {
            while (linkedList.size() >= 250) {
                linkedList.removeFirst();
            }
            linkedList.add(c7rY);
        }
    }

    public static void A01(C6hq c6hq, ThreadKey threadKey, String str, String str2) {
        0fH.A0a(str, str2, threadKey == null ? "null" : threadKey.toString(), "ReadThreadDebugEventRecorder", "set%s: %s, threadKey:%s");
        if (c6hq.A05()) {
            A00(new C7rY(threadKey, "set_tvmf_field", 0Pz.A0j(str, ": ", str2), 1BL.A08(c6hq.A00)), c6hq);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0.A02.equals(r303) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C6hq r301, com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303) {
        /*
            r0 = r301
            java.util.LinkedList r0 = r0.A02
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.lang.Object r0 = r0.peekLast()     // Catch: java.lang.Throwable -> L49
            r304 = r0
            r0 = r304
            X.7rY r0 = (X.C7rY) r0     // Catch: java.lang.Throwable -> L49
            r304 = r0
            r0 = r301
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            r0 = r304
            if (r0 == 0) goto L40
            r0 = r304
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A01
            r305 = r0
            r0 = r305
            r1 = r302
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L40
            r0 = r304
            java.lang.String r0 = r0.A02
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L46
        L40:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
        L46:
            r0 = r306
            return r0
        L49:
            r305 = move-exception
            r0 = r301
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6hq.A02(X.6hq, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String):boolean");
    }

    public void A03(ThreadKey threadKey) {
        0fH.A0g(threadKey, "ReadThreadDebugEventRecorder", "markReadCanceled[no_threadsummary_in_cache] - threadKey:%s");
        if (A05()) {
            A00(new C7rY(threadKey, "cancel_no_threadsummary_in_cache", null, 1BL.A08(this.A00)), this);
        }
    }

    public void A04(String str, Throwable th) {
        0fH.A0y("ReadThreadDebugEventRecorder", "markReadFailed - %s", th, new Object[]{str});
        if (A05()) {
            A00(new C7rY(null, "operation_failed", 0Pz.A0W("threadKeys:", str), 1BL.A08(this.A00)), this);
        }
    }

    public boolean A05() {
        return ((2yD) this.A01.get()).AZk(36326408191563345L);
    }

    @Override // X.C1yj
    public String Agd(FbUserSession fbUserSession) {
        ArrayList A17;
        LinkedList linkedList = this.A02;
        synchronized (linkedList) {
            A17 = 1BK.A17(linkedList);
        }
        Collections.reverse(A17);
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                C7rY c7rY = (C7rY) it.next();
                JSONObject A12 = AnonymousClass001.A12();
                A12.put("timestamp", c7rY.A00);
                A12.put("event", c7rY.A02);
                ThreadKey threadKey = c7rY.A01;
                if (threadKey != null) {
                    A12.put("threadKey", threadKey);
                }
                String str = c7rY.A03;
                if (str != null) {
                    A12.put("extra", str);
                }
                jSONArray.put(A12);
            }
        } catch (JSONException e) {
            0fH.A0p("ReadThreadDebugEventRecorder", 1BJ.A00(263), e);
        }
        return jSONArray.toString();
    }

    @Override // X.C1yj
    public String Age() {
        return "read_thread_debug_events.txt";
    }
}
