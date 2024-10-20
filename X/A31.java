package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: A31.class */
public final class A31 implements AXA, AXB {
    public AbA A00;
    public volatile boolean A04 = true;
    public final C04r A03 = new 0QO(0);
    public final C04r A02 = new 0QO(0);
    public final C04r A01 = new 0QO(0);

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0QO, X.04r] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0QO, X.04r] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0QO, X.04r] */
    public A31(AbA abA) {
        this.A00 = abA;
    }

    public static final void A00(AXA axa, 8LW r302, Object obj) {
        if (axa instanceof A31) {
            throw AnonymousClass001.A0N("nested GranularSubscribers not supported");
        }
        if (axa instanceof Ab8) {
            ((Ab8) axa).BQ6(r302, obj);
        } else if (axa instanceof Ab9) {
            ((Ab9) axa).BQ7(r302, null, obj);
        } else if (axa instanceof AbA) {
            ((AbA) axa).BQ5(r302);
        }
    }

    public static void A01(A31 a31, Object obj, Object obj2, Object obj3) {
        C0B7.A04(obj2, 1);
        ((List) obj).add(obj2);
        C04r c04r = a31.A03;
        C0B7.A04(obj2, 1);
        c04r.put(obj2, obj3);
    }

    public final void A02(C9m3 c9m3) {
        11T.A0F(c9m3, 0);
        if (this.A04) {
            Iterator it = this.A01.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(it);
                Class cls = (Class) A0z.getKey();
                Object value = A0z.getValue();
                11T.A0A(value);
                for (Function1 function1 : (Iterable) value) {
                    11T.A0D(cls);
                    1BK.A1M(cls, function1);
                    if (c9m3.A04) {
                        synchronized (c9m3) {
                            C9m3.A02(this, cls, c9m3.A02, function1);
                        }
                    } else {
                        C9m3.A02(this, cls, c9m3.A02, function1);
                    }
                }
            }
            Iterator it2 = this.A02.entrySet().iterator();
            while (it2.hasNext()) {
                Object key = AnonymousClass001.A0z(it2).getKey();
                11T.A0A(key);
                Class cls2 = (Class) key;
                11T.A0F(cls2, 0);
                if (c9m3.A04) {
                    synchronized (c9m3) {
                        C9m3.A01(this, cls2, c9m3.A01);
                    }
                } else {
                    C9m3.A01(this, cls2, c9m3.A01);
                }
            }
        }
    }

    public final void A03(8LW r302) {
        11T.A0F(r302, 0);
        Iterator it = this.A02.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            Object key = A0z.getKey();
            11T.A0A(key);
            Class cls = (Class) key;
            AXA axa = (AXA) A0z.getValue();
            if (axa != null) {
                A00(axa, r302, r302.A00(cls));
            }
        }
        Iterator it2 = this.A01.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(it2);
            Object key2 = A0z2.getKey();
            11T.A0A(key2);
            Class cls2 = (Class) key2;
            List<Function1> list = (List) A0z2.getValue();
            Object A00 = r302.A00(cls2);
            11T.A0D(list);
            for (Function1 function1 : list) {
                AXA axa2 = (AXA) this.A03.get(function1);
                if (axa2 != null) {
                    A00(axa2, r302, A00 == null ? null : function1.invoke(A00));
                }
            }
        }
        AbA abA = this.A00;
        if (abA != null) {
            abA.BQ5(r302);
        }
    }
}
