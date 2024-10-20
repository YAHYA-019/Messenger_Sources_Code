package X;

import android.os.HandlerThread;
import android.os.Process;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5sg, reason: invalid class name */
/* loaded from: 5sg.class */
public final class C5sg implements Runnable {
    public static final Comparator A03 = new G6b(0);
    public static final Comparator A04 = new G6b(1);
    public static final String __redex_internal_original_name = "LogThreadNames";
    public final C00i A00 = new 1BQ(16465);
    public final C00i A02 = new 1BQ(16634);
    public final C00i A01 = new 1BQ(16616);

    @Override // java.lang.Runnable
    public void run() {
        HashMap A00;
        int i;
        Thread thread;
        int compareTo;
        1UG A002 = 1UD.A00((04J) this.A02.get(), 1ZG.A01, 1BJ.A00(958));
        if (!A002.isSampled() || (A00 = 0Lq.A00()) == null) {
            return;
        }
        Thread[] threadArr = new Thread[Thread.activeCount() + 20];
        int enumerate = Thread.enumerate(threadArr);
        ArrayList A0t = AnonymousClass001.A0t(enumerate);
        for (int i2 = 0; i2 < enumerate; i2++) {
            A0t.add(threadArr[i2]);
        }
        ArrayList A17 = 1BK.A17(A00.values());
        Collections.sort(A0t, A03);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            int size = A0t.size() - 1;
            int i3 = 0;
            while (true) {
                if (i3 > size) {
                    i = -(i3 + 1);
                    break;
                }
                i = (i3 + size) >>> 1;
                String name = ((Thread) A0t.get(i)).getName();
                if (name.length() < 15 || A0i.length() < 15) {
                    compareTo = name.compareTo(A0i);
                } else {
                    int i4 = 0;
                    while (name.charAt(i4) == A0i.charAt(i4)) {
                        i4++;
                        if (i4 >= 15) {
                            break;
                        }
                    }
                    compareTo = name.charAt(i4) - A0i.charAt(i4);
                }
                if (compareTo < 0) {
                    i3 = i + 1;
                } else if (compareTo <= 0) {
                    break;
                } else {
                    size = i - 1;
                }
            }
            if (i >= 0) {
                thread = (Thread) A0t.get(i);
                A0t.remove(i);
                if (thread != null) {
                    A0i = thread.getName();
                }
            } else {
                thread = null;
            }
            2DM A0f = 4YU.A0f();
            A0f.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0i);
            A0f.A0o("thread_type", thread == null ? "native" : thread instanceof HandlerThread ? "looper" : "unknown");
            A0s.add(Pair.create(A0i, A0f.toString()));
        }
        Collections.sort(A0s, A04);
        ArrayList A10 = 1BL.A10(A0s);
        ArrayList A102 = 1BL.A10(A0s);
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            A10.add(pair.first);
            A102.add(pair.second);
        }
        Pair create = Pair.create(A10, A102);
        if (create != null) {
            A002.A5H("is_background", Boolean.valueOf(((1Od) this.A01.get()).A0E()));
            A002.A5q("java_thread_count", Integer.valueOf(Thread.activeCount()));
            A002.A7h("threads", (List) create.first);
            A002.A5q("total_thread_count", Integer.valueOf(((List) create.first).size()));
            A002.A5q("uptime_s", Integer.valueOf((int) 4YU.A06(Process.getElapsedCpuTime())));
            A002.A7h("thread_datas", (List) create.second);
            A002.BZL();
        }
    }
}
