package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6o6, reason: invalid class name */
/* loaded from: 6o6.class */
public final class C6o6 {
    public ThreadKey A00;
    public final CopyOnWriteArraySet A0A = new CopyOnWriteArraySet();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final 1Br A01 = 1Bq.A00(84362);
    public final 1Br A02 = 1Bq.A00(32848);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r306 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(X.C6o6 r301, java.lang.String r302, java.lang.String r303, java.lang.String r304) {
        /*
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r301
            java.util.concurrent.ConcurrentHashMap r0 = r0.A07
            r305 = r0
            r0 = r305
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            X.82j r0 = (X.C82j) r0
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L48
        L1a:
            r0 = r301
            java.util.concurrent.ConcurrentHashMap r0 = r0.A07
            r305 = r0
            r0 = r305
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            X.82j r0 = (X.C82j) r0
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L48
            r0 = r303
            if (r0 == 0) goto L81
            X.82j r0 = new X.82j
            r306 = r0
            r0 = r306
            r1 = r303
            r0.<init>(r1)
            r0 = r305
            r1 = r303
            r2 = r306
            java.lang.Object r0 = r0.put(r1, r2)
        L48:
            r0 = r305
            r1 = r302
            r2 = r306
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r306
            java.lang.Object r0 = r0.A01
            java.util.Set r0 = (java.util.Set) r0
            r305 = r0
            r0 = r305
            r1 = r302
            boolean r0 = r0.add(r1)
            r0 = r304
            if (r0 == 0) goto L7b
            r0 = r306
            java.lang.Object r0 = r0.A02
            java.util.Set r0 = (java.util.Set) r0
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.add(r1)
        L7b:
            r0 = r306
            java.lang.String r0 = r0.A03
            r302 = r0
        L81:
            r0 = r302
            int r0 = r0.hashCode()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6o6.A00(X.6o6, java.lang.String, java.lang.String, java.lang.String):int");
    }

    private final void A01(int i) {
        ConcurrentHashMap concurrentHashMap = this.A08;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = 4YU.A0k();
            Object putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        AnonymousClass001.A1A(valueOf, concurrentHashMap, AnonymousClass001.A03(obj) + 1);
    }

    private final void A02(String str) {
        ConcurrentHashMap concurrentHashMap = this.A07;
        C82j c82j = (C82j) concurrentHashMap.remove(str);
        if (c82j != null) {
            Iterator it = ((Set) c82j.A01).iterator();
            while (it.hasNext()) {
                concurrentHashMap.remove(it.next());
            }
            concurrentHashMap.remove(c82j.A03);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0182, code lost:
    
        if (r309 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.Boolean r303, java.lang.Boolean r304, java.lang.Long r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, java.lang.String r311) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6o6.A03(com.facebook.messaging.model.threadkey.ThreadKey, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void A04(ThreadKey threadKey, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        11T.A0F(str, 0);
        if (threadKey.A0y() || z) {
            long currentMonotonicTimestamp = FH9.A00((FH9) 1Br.A0B(this.A01)).currentMonotonicTimestamp();
            C00i c00i = this.A02.A00;
            long A00 = 3zV.A00(currentMonotonicTimestamp, ((3zV) c00i.get()).A04, ((3zV) c00i.get()).A03);
            A03(threadKey, true, Boolean.valueOf(z2), A00 == ((long) (-1)) ? null : Long.valueOf(A00), str, str2, str3, str4, str5, str6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x041b, code lost:
    
        if (r303 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v179, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v215, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v248, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r308v0, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(X.1Va r302, com.google.common.collect.ImmutableList r303, java.lang.Integer r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, boolean r311, boolean r312) {
        /*
            Method dump skipped, instructions count: 1617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6o6.A05(X.1Va, com.google.common.collect.ImmutableList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
