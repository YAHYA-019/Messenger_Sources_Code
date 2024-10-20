package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9m3, reason: invalid class name */
/* loaded from: 9m3.class */
public final class C9m3 {
    public final 9PW A00;
    public final java.util.Map A01;
    public final java.util.Map A02;
    public final Executor A03;
    public final boolean A04;

    public C9m3(9PW r302, Executor executor, boolean z) {
        11T.A0F(executor, 1);
        this.A03 = executor;
        this.A04 = z;
        this.A00 = r302;
        this.A02 = 1BK.A1C();
        this.A01 = 1BK.A1C();
    }

    public static final Object A00(2JQ r301, 8LW r302, Class cls) {
        Object A02;
        C00j.A05("SubscriptionManager.getRsysOrSharedModel", -329391408);
        try {
            if (r301 == null) {
                A02 = r302.A00(cls);
            } else {
                2JS r0 = r302.A00;
                A02 = r0 != null ? r0.A02(r301) : null;
            }
            C00j.A01(1234572049);
            return A02;
        } catch (Throwable th) {
            C00j.A01(-2009592058);
            throw th;
        }
    }

    public static final void A01(AXB axb, Class cls, java.util.Map map) {
        C00j.A05("SubscriptionManager.registerClassLevelSubscription", -1604034839);
        try {
            List list = (List) map.get(cls);
            if (list == null) {
                map.put(cls, C0s8.A11(axb));
            } else {
                list.add(axb);
            }
            C00j.A01(-1434394430);
        } catch (Throwable th) {
            C00j.A01(-196452869);
            throw th;
        }
    }

    public static final void A02(AXB axb, Class cls, java.util.Map map, Function1 function1) {
        C00j.A05("SubscriptionManager.registerSelectorToOnChangeMapping", -2143326195);
        try {
            java.util.Map map2 = (java.util.Map) map.get(cls);
            if (map2 == null) {
                C0B7.A04(function1, 1);
                map.put(cls, 04R.A0A(7zQ.A1b(function1, C0s8.A11(axb))));
            } else {
                C0B7.A04(function1, 1);
                List list = (List) map2.get(function1);
                if (list == null) {
                    map2.put(function1, C0s8.A11(axb));
                } else {
                    list.add(axb);
                }
            }
            C00j.A01(-1216360642);
        } catch (Throwable th) {
            C00j.A01(1288317286);
            throw th;
        }
    }

    public final void A03() {
        C00j.A05("SubscriptionManager.unregisterAll", 246121334);
        try {
            if (this.A04) {
                synchronized (this) {
                    java.util.Map map = this.A02;
                    Iterator A1A = 1BK.A1A(map);
                    while (A1A.hasNext()) {
                        Iterator A1A2 = 1BK.A1A((java.util.Map) A1A.next());
                        while (A1A2.hasNext()) {
                            ((List) A1A2.next()).clear();
                        }
                    }
                    map.clear();
                    java.util.Map map2 = this.A01;
                    Iterator A1A3 = 1BK.A1A(map2);
                    while (A1A3.hasNext()) {
                        ((List) A1A3.next()).clear();
                    }
                    map2.clear();
                }
            } else {
                java.util.Map map3 = this.A02;
                Iterator A1A4 = 1BK.A1A(map3);
                while (A1A4.hasNext()) {
                    Iterator A1A5 = 1BK.A1A((java.util.Map) A1A4.next());
                    while (A1A5.hasNext()) {
                        ((List) A1A5.next()).clear();
                    }
                }
                map3.clear();
                java.util.Map map4 = this.A01;
                Iterator A1A6 = 1BK.A1A(map4);
                while (A1A6.hasNext()) {
                    ((List) A1A6.next()).clear();
                }
                map4.clear();
            }
            C00j.A01(782988214);
        } catch (Throwable th) {
            C00j.A01(-445849381);
            throw th;
        }
    }

    public final void A04(AXB axb) {
        11T.A0F(axb, 0);
        C00j.A05("SubscriptionManager.unregister", -558242170);
        try {
            if (this.A04) {
                synchronized (this) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator A1A = 1BK.A1A(this.A02);
                    while (A1A.hasNext()) {
                        java.util.Map map = (java.util.Map) A1A.next();
                        Iterator A0y = AnonymousClass001.A0y(map);
                        while (A0y.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0y);
                            ((List) A0z.getValue()).remove(axb);
                            if (((List) A0z.getValue()).isEmpty()) {
                                A0s.add(A0z.getKey());
                            }
                        }
                        Iterator it = A0s.iterator();
                        while (it.hasNext()) {
                            C0B7.A02(map).remove((Function1) it.next());
                        }
                    }
                    Iterator A1A2 = 1BK.A1A(this.A01);
                    while (A1A2.hasNext()) {
                        ((List) A1A2.next()).remove(axb);
                    }
                }
            } else {
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator A1A3 = 1BK.A1A(this.A02);
                while (A1A3.hasNext()) {
                    java.util.Map map2 = (java.util.Map) A1A3.next();
                    Iterator A0y2 = AnonymousClass001.A0y(map2);
                    while (A0y2.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                        ((List) A0z2.getValue()).remove(axb);
                        if (((List) A0z2.getValue()).isEmpty()) {
                            A0s2.add(A0z2.getKey());
                        }
                    }
                    Iterator it2 = A0s2.iterator();
                    while (it2.hasNext()) {
                        C0B7.A02(map2).remove((Function1) it2.next());
                    }
                }
                Iterator A1A4 = 1BK.A1A(this.A01);
                while (A1A4.hasNext()) {
                    ((List) A1A4.next()).remove(axb);
                }
            }
            C00j.A01(1194054851);
        } catch (Throwable th) {
            C00j.A01(300048866);
            throw th;
        }
    }
}
