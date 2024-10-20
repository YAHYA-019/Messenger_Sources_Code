package X;

import android.os.Handler;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Future;

/* renamed from: X.4k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4k2.class */
public abstract class AbstractC07504k2 implements InterfaceC07514k3 {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public void A04() {
        Object obj;
        InterfaceC07514k3 interfaceC07514k3;
        4kV r303;
        if (this instanceof 4kU) {
            4kU r0 = (4kU) this;
            interfaceC07514k3 = r0.A05;
            r303 = r0.A04;
        } else {
            if (!(this instanceof C07734kj)) {
                if (this instanceof 7UK) {
                    7UK r306 = (7UK) this;
                    synchronized (r306) {
                        boolean z = r306.A00;
                        obj = r306;
                        if (z) {
                            9gT r02 = (9gT) r306.A02.A00.get();
                            ConcurrentHashMap concurrentHashMap = r02.A05;
                            concurrentHashMap.remove(0);
                            synchronized (r02) {
                                if (concurrentHashMap.isEmpty()) {
                                    r02.A00 = null;
                                    C21S.A01(r02.A04, (1Uj) r02.A02.A00.get());
                                    r02.A07.set(false);
                                    concurrentHashMap.clear();
                                    r02.A06.clear();
                                }
                            }
                            r306.A00 = false;
                            obj = r306;
                        }
                    }
                } else {
                    if (!(this instanceof 7Hz)) {
                        return;
                    }
                    7Hz r03 = (7Hz) this;
                    Object obj2 = r03.A04;
                    synchronized (obj2) {
                        obj = obj2;
                        if (r03.A00) {
                            r03.A00 = false;
                            6wY r04 = r03.A03;
                            4WK r05 = r03.A02;
                            11T.A0F(r05, 0);
                            r04.A04.remove(r05);
                            r04.A01.A01();
                            obj = obj2;
                        }
                    }
                }
                return;
            }
            C07734kj c07734kj = (C07734kj) this;
            c07734kj.A07.Cei(c07734kj.A05);
            interfaceC07514k3 = c07734kj.A06;
            r303 = c07734kj.A04;
        }
        interfaceC07514k3.Cei(r303);
    }

    public final void A05(Object obj) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((4kV) it.next()).C9B(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:360:0x0900, code lost:
    
        if (X.1Ux.A00((X.1Ux) r0.get()).AZk(36323607871703855L) != false) goto L355;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06() {
        /*
            Method dump skipped, instructions count: 2959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC07504k2.A06():void");
    }

    public void A07() {
        boolean z;
        if (this instanceof 4kZ) {
            ((4kZ) this).A03.set(null);
            return;
        }
        if (this instanceof C07724ki) {
            C07724ki c07724ki = (C07724ki) this;
            synchronized (this) {
                if (c07724ki.A00) {
                    c07724ki.A00 = false;
                    c07724ki.A01 = false;
                    Iterator it = c07724ki.A02.iterator();
                    while (it.hasNext()) {
                        C5jr c5jr = (C5jr) it.next();
                        if (c5jr.A02.getAndSet(false)) {
                            c5jr.A00.Cei(c5jr);
                        }
                    }
                }
            }
        } else {
            if (this instanceof C07714kh) {
                C07714kh c07714kh = (C07714kh) this;
                6uC.A00();
                c07714kh.A02.Cei(c07714kh.A03);
                C07714kh.A00(c07714kh, C0ty.A00);
                return;
            }
            if (!(this instanceof C07654kb)) {
                if (this instanceof C07644ka) {
                    C07644ka c07644ka = (C07644ka) this;
                    synchronized (this) {
                        z = c07644ka.A00;
                    }
                    if (z) {
                        c07644ka.A00 = false;
                        ((FbSharedPreferences) c07644ka.A02.A00.get()).D64(c07644ka.A07, ImmutableSet.A02(c07644ka.A09, c07644ka.A08));
                        return;
                    }
                    return;
                }
                if (this instanceof C07694kf) {
                    C07694kf c07694kf = (C07694kf) this;
                    synchronized (this) {
                        if (c07694kf.A03) {
                            c07694kf.A03 = false;
                            1PA r0 = c07694kf.A01;
                            1PA r02 = c07694kf.A00;
                            c07694kf.A01 = null;
                            c07694kf.A00 = null;
                            c07694kf.A02 = 0S2.A00;
                            if (r0 != null) {
                                r0.A01();
                            }
                            if (r02 != null) {
                                r02.A01();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (this instanceof C5jd) {
                    Iterator it2 = ((C5jd) this).A05.values().iterator();
                    while (it2.hasNext()) {
                        7sX r03 = ((5vL) it2.next()).A01;
                        r03.A00();
                        r03.A01 = null;
                    }
                    return;
                }
                if (this instanceof C07484k0) {
                    C07484k0 c07484k0 = (C07484k0) this;
                    c07484k0.A0C.set(false);
                    C07484k0.A00(c07484k0);
                    return;
                }
                if (this instanceof 7UJ) {
                    7UJ r04 = (7UJ) this;
                    synchronized (this) {
                        if (r04.A00) {
                            r04.A00 = false;
                        }
                    }
                    7OD r05 = (7OD) r04.A03.A00.get();
                    ThreadKey threadKey = r04.A04;
                    1HO r06 = r04.A05;
                    if (threadKey != null) {
                        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) r05.A00.A00.get();
                        1G2 r07 = 1NK.A05;
                        1G2 A00 = 7OD.A00(threadKey);
                        11T.A0D(r06);
                        fbSharedPreferences.D63(r06, A00);
                        return;
                    }
                    return;
                }
                if (this instanceof C07704kg) {
                    C07704kg c07704kg = (C07704kg) this;
                    synchronized (this) {
                        if (c07704kg.A03) {
                            6QI r08 = (6QI) c07704kg.A0C.A00.get();
                            String str = c07704kg.A04.A02;
                            String A0u = c07704kg.A0E.A0u();
                            11T.A0A(A0u);
                            1HO r09 = c07704kg.A0F;
                            11T.A0F(r09, 2);
                            ((FbSharedPreferences) r08.A01.A00.get()).D63(r09, 6QJ.A00(str, A0u, 0));
                        }
                    }
                    c07704kg.A03 = false;
                    C07704kg.A00(c07704kg);
                    6mL r010 = c07704kg.A01;
                    if (r010 != null) {
                        r010.A03();
                    }
                    c07704kg.A01 = null;
                    6mO r011 = c07704kg.A00;
                    if (r011 != null) {
                        r011.A05(c07704kg.A0G);
                    }
                    c07704kg.A00 = null;
                    c07704kg.A02 = false;
                    return;
                }
                if (!(this instanceof 7UI)) {
                    if (this instanceof 5SE) {
                        5SE r012 = (5SE) this;
                        C7li.A00();
                        r012.A02.Cei(r012.A03);
                        5SE.A00(r012, C0ty.A00);
                        return;
                    }
                    return;
                }
                7UI r013 = (7UI) this;
                Handler handler = r013.A00;
                if (handler != null) {
                    handler.removeCallbacks(r013.A0B);
                }
                7VV r014 = r013.A02;
                if (r014 != null) {
                    r014.A05((7VY) r013.A0E.getValue());
                }
                7V9 r015 = r013.A03;
                if (r015 != null) {
                    r015.A05((7Ve) r013.A0D.getValue());
                }
                r013.A02 = null;
                Future future = r013.A05;
                if (future != null) {
                    future.cancel(true);
                    return;
                }
                return;
            }
            C07654kb c07654kb = (C07654kb) this;
            ThreadKey threadKey2 = c07654kb.A03;
            if (threadKey2.A1F() && !c07654kb.A05) {
                return;
            }
            java.util.Map map = c07654kb.A04;
            synchronized (map) {
                map.clear();
            }
            synchronized (this) {
                if (c07654kb.A00 != null) {
                    if (threadKey2.A1K() || threadKey2.A19() || threadKey2.A0y()) {
                        UserKey A002 = UserKey.A00(Long.valueOf(threadKey2.A0r()));
                        C00i c00i = c07654kb.A02.A00;
                        ((1XZ) c00i.get()).Cel(c07654kb.A00, A002);
                        if (((1CO) c07654kb.A01.A00.get()).Av9(1GD.A07, 36604271099124272L) == 3 && C07654kb.A00(c07654kb).length() != 0) {
                            ((1XZ) c00i.get()).Cel(c07654kb.A00, new UserKey(1Js.A03, C07654kb.A00(c07654kb)));
                        }
                    } else {
                        ((1XZ) c07654kb.A02.A00.get()).Cek(threadKey2, c07654kb.A00);
                    }
                    c07654kb.A00 = null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    @Override // X.InterfaceC07514k3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A6a(X.4kV r302) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC07504k2.A6a(X.4kV):void");
    }

    @Override // X.InterfaceC07514k3
    public void Cei(4kV r302) {
        11T.A0F(r302, 0);
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (copyOnWriteArraySet.remove(r302) && copyOnWriteArraySet.isEmpty()) {
            A04();
            A07();
        }
    }
}
