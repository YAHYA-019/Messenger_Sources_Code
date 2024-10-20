package X;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Functions$FunctionForMapNoDefault;
import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.CompoundOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.NaturalOrdering;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.7sq, reason: invalid class name */
/* loaded from: 7sq.class */
public abstract class C7sq {
    public static ImmutableList A00(List list) {
        Collections.sort(list, new J4h(1));
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!list.isEmpty()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(it);
                Object key = A0z.getKey();
                long A08 = C3o5.A08(A0z);
                if (!(key instanceof FutureTask) || !((FutureTask) key).isDone()) {
                    builder.m11011add((Object) 0Pz.A0t("", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, key == null ? "null task" : 0Pz.A0j(0FQ.A01(key), " - ", AnonymousClass001.A0Y(key)), uptimeMillis - A08));
                }
            }
        }
        return builder.build();
    }

    public static RejectedExecutionException A01(String str, Collection collection, List list, List list2, int i) {
        Integer valueOf = Integer.valueOf(collection.size());
        Integer valueOf2 = Integer.valueOf(i);
        ImmutableList A00 = A00(list);
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String A0j = next == null ? "null task" : 0Pz.A0j(0FQ.A01(next), " - ", AnonymousClass001.A0Y(next));
            Number number = (Number) A0u.get(A0j);
            int i2 = 1;
            if (number != null) {
                i2 = number.intValue() + 1;
            }
            AnonymousClass001.A1A(A0j, A0u, i2);
        }
        NaturalOrdering naturalOrdering = NaturalOrdering.A02;
        C1zA A03 = new ByFunctionOrdering(new Functions$FunctionForMapNoDefault(A0u), naturalOrdering).A03();
        naturalOrdering.getClass();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s queue is full, size=%d, max_tasks=%d, running tasks=%s, queued tasks=%s", str, valueOf, valueOf2, A00, ImmutableSortedMap.A04(new CompoundOrdering(A03, naturalOrdering), A0u));
        if (list2 != null) {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s, other running tasks=%s", formatStrLocaleSafe, A00(list2));
        }
        RejectedExecutionException rejectedExecutionException = new RejectedExecutionException(formatStrLocaleSafe);
        java.util.Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        ArrayList A0s = AnonymousClass001.A0s();
        Thread thread = Looper.getMainLooper().getThread();
        allStackTraces.put(thread, thread.getStackTrace());
        for (StackTraceElement stackTraceElement : rejectedExecutionException.getStackTrace()) {
            A0s.add(stackTraceElement);
        }
        Iterator A0y = AnonymousClass001.A0y(allStackTraces);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Thread thread2 = (Thread) A0z.getKey();
            A0s.add(new StackTraceElement("--- RejectedExecutionException stack trace --- thread --> ", thread2.getName(), thread2.getState().toString(), 1));
            for (StackTraceElement stackTraceElement2 : (StackTraceElement[]) A0z.getValue()) {
                A0s.add(stackTraceElement2);
            }
        }
        rejectedExecutionException.setStackTrace((StackTraceElement[]) A0s.toArray(new StackTraceElement[A0s.size()]));
        return rejectedExecutionException;
    }
}
