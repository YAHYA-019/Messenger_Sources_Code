package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.4xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xp.class */
public abstract class AbstractC11854xp {
    public C11834xn A00;
    public 1G2 A01;
    public Class A02 = null;
    public java.util.Map A03 = null;
    public final C1kw A04;
    public final C0dp A05;
    public final FbSharedPreferences A06;
    public final AnonymousClass244 A07;

    public AbstractC11854xp() {
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        C1kw c1kw = (C1kw) 1Bi.A03(16772);
        this.A05 = c0dp;
        this.A06 = fbSharedPreferences;
        this.A04 = c1kw;
        this.A07 = new AnonymousClass244();
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.Comparator] */
    private void A00() {
        synchronized (this) {
            if (A01(this)) {
                try {
                    int i = this.A00.A00;
                    java.util.Map map = this.A03;
                    if (map == null || map.size() > i) {
                        int i2 = this.A00.A01;
                        C0dp c0dp = this.A05;
                        long now = (c0dp == null ? Long.MAX_VALUE : c0dp.now()) - (i2 * 3600000);
                        PriorityQueue priorityQueue = new PriorityQueue(i, new Object());
                        Iterator A0y = AnonymousClass001.A0y(this.A03);
                        while (A0y.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0y);
                            if (((C11884xs) A0z.getValue()).A07 >= now) {
                                priorityQueue.offer(A0z);
                                if (priorityQueue.size() > i) {
                                    priorityQueue.poll();
                                }
                            }
                        }
                        this.A03.clear();
                        Iterator it = priorityQueue.iterator();
                        while (it.hasNext()) {
                            4YV.A1R(AnonymousClass001.A0z(it), this.A03);
                        }
                    }
                    HashMap A0u = AnonymousClass001.A0u();
                    Iterator A0y2 = AnonymousClass001.A0y(this.A03);
                    while (A0y2.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                        try {
                            A0u.put(AnonymousClass001.A0j(A0z2), this.A07.A0W(A0z2.getValue()));
                        } catch (Throwable th) {
                            2Jy A0H = 4YU.A0H("default_waterfall_logger");
                            A0H.A0D("exception", th.toString());
                            A0H.A0D("serialized_key", AnonymousClass001.A0j(A0z2));
                            C1kw c1kw = this.A04;
                            if (c1kw != null) {
                                8EY.A00(c1kw).A03(A0H);
                            }
                        }
                    }
                    String A0W = this.A07.A0W(A0u);
                    1Ql edit = this.A06.edit();
                    edit.CaL(this.A01, A0W);
                    edit.commit();
                } catch (Throwable th2) {
                    2Jy A0H2 = 4YU.A0H(this.A00.A02);
                    A0H2.A09(th2, "exception");
                    C1kw c1kw2 = this.A04;
                    if (c1kw2 != null) {
                        8EY.A00(c1kw2).A03(A0H2);
                    }
                    1Ql edit2 = this.A06.edit();
                    edit2.Cdj(this.A01);
                    edit2.commit();
                }
            }
        }
    }

    public static boolean A01(AbstractC11854xp abstractC11854xp) {
        FbSharedPreferences fbSharedPreferences;
        HashMap A0u;
        boolean z = false;
        if (abstractC11854xp.A00.A03 && (fbSharedPreferences = abstractC11854xp.A06) != null) {
            if (abstractC11854xp.A03 == null) {
                synchronized (abstractC11854xp) {
                    String BD0 = fbSharedPreferences.BD0(abstractC11854xp.A01);
                    if (BD0 == null || BD0.equals("{}")) {
                        A0u = AnonymousClass001.A0u();
                    } else {
                        try {
                            AnonymousClass244 anonymousClass244 = abstractC11854xp.A07;
                            java.util.Map map = (java.util.Map) anonymousClass244.A0Q(new BJW(abstractC11854xp), BD0);
                            A0u = AnonymousClass001.A0u();
                            Iterator A0y = AnonymousClass001.A0y(map);
                            while (A0y.hasNext()) {
                                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                                A0u.put(AnonymousClass001.A0j(A0z), (C11884xs) anonymousClass244.A0V(1BK.A16(A0z), abstractC11854xp.A02));
                            }
                        } catch (IOException | ClassCastException e) {
                            2Jy A0H = 4YU.A0H(abstractC11854xp.A00.A02);
                            A0H.A09(e, "exception");
                            C1kw c1kw = abstractC11854xp.A04;
                            if (c1kw != null) {
                                8EY.A00(c1kw).A03(A0H);
                            }
                            1Ql edit = fbSharedPreferences.edit();
                            edit.Cdj(abstractC11854xp.A01);
                            edit.commit();
                            A0u = AnonymousClass001.A0u();
                        }
                    }
                }
                abstractC11854xp.A03 = A0u;
            }
            z = true;
        }
        return z;
    }

    public C11884xs A02(String str) {
        if (!A01(this)) {
            return null;
        }
        C11884xs c11884xs = (C11884xs) this.A03.remove(str);
        A00();
        return c11884xs;
    }

    public C11884xs A03(String str, String str2, int i, long j, boolean z) {
        C11884xs c11884xs;
        if (!A01(this) || (c11884xs = (C11884xs) this.A03.get(str)) == null) {
            return null;
        }
        c11884xs.A06 = j;
        c11884xs.A00 = i;
        c11884xs.A08 = str2;
        if (z) {
            c11884xs.A03++;
        } else {
            c11884xs.A01++;
        }
        if (A06()) {
            c11884xs.A04++;
        } else {
            c11884xs.A05++;
        }
        A00();
        return c11884xs;
    }

    public void A04(2Jy r302, C11884xs c11884xs, String str) {
        if (this.A00.A03) {
            if (c11884xs != null) {
                r302.A0D("otd", c11884xs.A0A);
                r302.A0C("start_ts", c11884xs.A07);
                r302.A0B("is_failed", 0);
                r302.A0B("last_error_code", c11884xs.A00);
                r302.A0D("last_error_message", c11884xs.A08);
                r302.A0C("last_attempt_id", c11884xs.A06);
                r302.A0B("network_error_count", c11884xs.A04);
                r302.A0B("non_network_error_count", c11884xs.A05);
                r302.A0B("mqtt_attempts", c11884xs.A03);
                r302.A0B("graph_attempts", c11884xs.A01);
            }
            0fH.A0g(2Jy.A01(r302), str, "LogEvent. event: %s");
            C1kw c1kw = this.A04;
            if (c1kw != null) {
                8EY.A00(c1kw).A03(r302);
            }
        }
    }

    public void A05(C11884xs c11884xs, String str) {
        if (!A01(this) || this.A03.containsKey(str)) {
            return;
        }
        c11884xs.A0A = str;
        C0dp c0dp = this.A05;
        if (c0dp != null) {
            c11884xs.A07 = c0dp.now();
        }
        this.A03.put(str, c11884xs);
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r0.equals(new java.util.concurrent.TimeoutException().toString()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06() {
        /*
            r301 = this;
            java.lang.String r0 = X.C11824xm.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r303
            java.lang.String r0 = r0.toString()
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L27
        L22:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC11854xp.A06():boolean");
    }
}
