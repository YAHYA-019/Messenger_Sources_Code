package X;

import android.util.LruCache;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.9lx, reason: invalid class name */
/* loaded from: 9lx.class */
public final class C9lx {
    public 8Ky A00;
    public 8Lm A01;
    public boolean A02;
    public 8LK A03;
    public final LruCache A04;
    public final AaF A05;
    public final Set A06;
    public final Timer A07;
    public final ConcurrentLinkedQueue A08;

    public C9lx(AaF aaF) {
        this.A05 = aaF;
        ((A3W) aaF).A00 = this;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        11T.A0A(newSetFromMap);
        this.A06 = newSetFromMap;
        this.A08 = new ConcurrentLinkedQueue();
        this.A07 = new Timer();
        8Lm r0 = new 8Lm((Integer) null, (Integer) null, (Integer) null, (Integer) null, 63);
        this.A01 = r0;
        this.A03 = C9mF.A00(r0, null, null, 0L);
        this.A04 = new LruCache(20);
    }

    public static final 8Ls A00(C9lx c9lx, 8Lm r302) {
        Long l;
        8LY r308;
        String str;
        DqL dqL;
        Object next;
        C2634Gjm c2634Gjm;
        8Ky r0 = c9lx.A00;
        if (r0 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = r0.A02;
        Object obj = r302.A04;
        8LY r02 = (8LY) linkedHashMap.get(obj);
        if (r02 == null) {
            c9lx.A02(AnonymousClass001.A0Z(obj, "State data doesn't exist for ", AnonymousClass001.A0k()));
            return null;
        }
        Object obj2 = r302.A01;
        if (obj2 != null) {
            AbstractMap abstractMap = (AbstractMap) r02.A01;
            r308 = (8LY) abstractMap.get(obj2);
            if (r308 == null) {
                Collection values = abstractMap.values();
                11T.A0A(values);
                r308 = (8LY) 0QD.A08(values);
            }
            l = null;
            str = null;
        } else {
            l = 28003L;
            Collection values2 = ((AbstractMap) r02.A01).values();
            11T.A0A(values2);
            r308 = (8LY) 0QD.A08(values2);
            str = "triggering_action_not_present";
        }
        if (r308 == null) {
            c9lx.A02(AnonymousClass001.A0Z(obj2, "Action data doesn't exist for ", AnonymousClass001.A0k()));
            return null;
        }
        AbstractMap abstractMap2 = (AbstractMap) r308.A02;
        Object obj3 = r302.A03;
        if (abstractMap2.get(obj3) != null) {
            dqL = (DqL) abstractMap2.get(obj3);
        } else {
            if (str == null) {
                str = "sentiment_not_present";
            }
            if (l == null) {
                l = 28004L;
            }
            Integer num = r0.A01;
            if (abstractMap2.get(num) != null) {
                dqL = (DqL) abstractMap2.get(num);
            } else {
                l = 28006L;
                Collection values3 = abstractMap2.values();
                11T.A0A(values3);
                dqL = (DqL) 0QD.A08(values3);
                if (dqL == null) {
                    dqL = (DqL) r308.A01;
                }
                str = "sentiment_global_not_present";
            }
        }
        if (dqL == null) {
            c9lx.A02(AnonymousClass001.A0Z(obj3, "Sentiment data doesn't exist for ", AnonymousClass001.A0k()));
            return null;
        }
        AbstractMap abstractMap3 = (AbstractMap) dqL.A01;
        Number number = (Number) r302.A02;
        if (abstractMap3.get(number) != null) {
            c2634Gjm = (C2634Gjm) abstractMap3.get(number);
        } else {
            if (str == null) {
                str = "intensity_not_carried";
            }
            if (l == null) {
                l = 28005L;
            }
            int A05 = 7zR.A05(number);
            Collection values4 = abstractMap3.values();
            11T.A0A(values4);
            Iterator it = AHX.A00(values4, 0).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int abs = Math.abs(A05 - ((C2634Gjm) next).A00);
                    do {
                        Object next2 = it.next();
                        int abs2 = Math.abs(A05 - ((C2634Gjm) next2).A00);
                        if (abs > abs2) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            c2634Gjm = (C2634Gjm) next;
        }
        if (c2634Gjm == null) {
            c9lx.A02(AnonymousClass001.A0Z(number, "Intensity data doesn't exist for ", AnonymousClass001.A0k()));
            return null;
        }
        if (l != null) {
            long longValue = l.longValue();
            Iterator it2 = c9lx.A06.iterator();
            while (it2.hasNext()) {
                9W2 r03 = ((C9K0) it2.next()).A00;
                C9ah c9ah = (C9ah) 1Br.A0B(r03.A09);
                ThreadKey threadKey = r03.A01;
                String valueOf = String.valueOf(threadKey != null ? 7zO.A0k(threadKey) : null);
                11T.A0F(valueOf, 0);
                1UG A08 = 1BK.A08(1Br.A02(c9ah.A00), 1BJ.A00(931));
                if (A08.isSampled()) {
                    A08.A7R("thread_session_id", AnonymousClass001.A0b(valueOf, c9ah.A01));
                    7zL.A1F(A08, valueOf);
                    A08.A6H(TraceFieldType.ErrorCode, Long.valueOf(longValue));
                    A08.BZL();
                }
            }
        }
        List list = (List) c2634Gjm.A02;
        C07z c07z = C07y.A00;
        11T.A0H(list, c07z);
        Object A0B = list.isEmpty() ? null : 0QD.A0B(list, c07z.A05(list.size()));
        if (c9lx.A02) {
            if (c2634Gjm.A01 >= list.size()) {
                c2634Gjm.A01 = 0;
            }
            A0B = 0QD.A0J(list, c2634Gjm.A01);
            c2634Gjm.A01++;
        }
        return new 8Ls(str, A0B, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r301 == X.C96k.A04) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C96k r301, X.C9lx r302, java.lang.Integer r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9lx.A01(X.96k, X.9lx, java.lang.Integer, int, int):void");
    }

    private final void A02(String str) {
        0fH.A0n("ClientOrchestrator", str);
        for (C9K0 c9k0 : this.A06) {
            11T.A0F(str, 0);
            7Ri r0 = c9k0.A00.A0B;
            if (r0 != null) {
                7Ri.A01(r0, str);
            }
        }
    }

    public final void A03(C96k c96k) {
        8Lm r0 = this.A01;
        Number number = (Number) r0.A03;
        Number number2 = (Number) r0.A02;
        if (number != null && number2 != null) {
            A01(c96k, this, null, number.intValue(), number2.intValue());
        } else {
            0fH.A0j("ClientOrchestrator", "Previous Sentiment and Intensity can't be null");
            A02(0Pz.A0W("Sentiment and Intensity are null for ", c96k.name()));
        }
    }
}
