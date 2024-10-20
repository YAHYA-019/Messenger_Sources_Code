package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cn.class */
public final class C05034cn {
    public static C05034cn A06;
    public static C05034cn A07;
    public static C05034cn A08;
    public static C05034cn A09;
    public static final Executor A0A;
    public static final Executor A0B;
    public static final ExecutorService A0C;
    public Exception A00;
    public boolean A02;
    public Object A03;
    public boolean A04;
    public final Object A05 = new Object();
    public List A01 = new ArrayList();

    static {
        C05064cq c05064cq = C05064cq.A03;
        A0C = c05064cq.A01;
        A0A = c05064cq.A00;
        A0B = C05074cr.A03.A00;
        A08 = new C05034cn((Object) null);
        A09 = new C05034cn((Object) true);
        A07 = new C05034cn((Object) false);
        A06 = new C05034cn(true);
    }

    public C05034cn() {
    }

    public C05034cn(Object obj) {
        A0C(obj);
    }

    public C05034cn(boolean z) {
        A0B();
    }

    public static C05034cn A00(HlR hlR, C4cw c4cw, C05034cn c05034cn, Executor executor) {
        boolean z;
        C05104cu c05104cu = new C05104cu();
        synchronized (c05034cn.A05) {
            z = c05034cn.A02;
            if (!z) {
                c05034cn.A01.add(new ILv(hlR, c4cw, c05034cn, c05104cu, executor));
            }
        }
        if (z) {
            A03(hlR, c4cw, c05034cn, c05104cu, executor);
        }
        return c05104cu.A00;
    }

    public static C05034cn A01(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? A09 : A07;
        }
        C05104cu c05104cu = new C05104cu();
        c05104cu.A02(obj);
        return c05104cu.A00;
    }

    public static C05034cn A02(final Callable callable, Executor executor) {
        final C05104cu c05104cu = new C05104cu();
        try {
            executor.execute(new Runnable() { // from class: X.4cv
                public static final String __redex_internal_original_name = "Task$4";

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C05104cu.this.A02(callable.call());
                    } catch (CancellationException unused) {
                        C05104cu.this.A00();
                    } catch (Exception e) {
                        C05104cu.this.A01(e);
                    }
                }
            });
        } catch (Exception e) {
            c05104cu.A01(new RuntimeException("An exception was thrown by an Executor", e));
        }
        return c05104cu.A00;
    }

    public static void A03(HlR hlR, C4cw c4cw, C05034cn c05034cn, C05104cu c05104cu, Executor executor) {
        try {
            executor.execute(new J1k(hlR, c4cw, c05034cn, c05104cu));
        } catch (Exception e) {
            c05104cu.A01(new RuntimeException("An exception was thrown by an Executor", e));
        }
    }

    public static void A04(final C4cw c4cw, final C05034cn c05034cn, final C05104cu c05104cu, Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: X.4dS
                public static final String __redex_internal_original_name = "Task$14";

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        c05104cu.A02(c4cw.D4C(c05034cn));
                    } catch (CancellationException unused) {
                        c05104cu.A00();
                    } catch (Exception e) {
                        c05104cu.A01(e);
                    }
                }
            });
        } catch (Exception e) {
            c05104cu.A01(new RuntimeException("An exception was thrown by an Executor", e));
        }
    }

    public static void A05(C05034cn c05034cn) {
        synchronized (c05034cn.A05) {
            Iterator it = c05034cn.A01.iterator();
            while (it.hasNext()) {
                try {
                    ((C4cw) it.next()).D4C(c05034cn);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw AnonymousClass001.A0U(e2);
                }
            }
            c05034cn.A01 = null;
        }
    }

    public C05034cn A06(final C4cw c4cw) {
        boolean z;
        final Executor executor = A0A;
        final C05104cu c05104cu = new C05104cu();
        synchronized (this.A05) {
            z = this.A02;
            if (!z) {
                final int i = 0;
                this.A01.add(new C4cw(i, c4cw, this, c05104cu, executor) { // from class: X.3Um
                    public final int A00;
                    public final Object A01;
                    public final Object A02;
                    public final Object A03;
                    public final Object A04;

                    {
                        this.A00 = i;
                        this.A01 = this;
                        this.A03 = c05104cu;
                        this.A02 = c4cw;
                        this.A04 = executor;
                    }

                    @Override // X.C4cw
                    public /* bridge */ /* synthetic */ Object D4C(C05034cn c05034cn) {
                        if (this.A00 == 0) {
                            C05034cn.A04((C4cw) this.A02, c05034cn, (C05104cu) this.A03, (Executor) this.A04);
                            return null;
                        }
                        if (c05034cn.A09() || (c05034cn.A0A() && (c05034cn.A07() instanceof CancellationException))) {
                            ((2IU) this.A03).CE6((InterfaceC04374as) this.A04, "DiskCacheProducer", (java.util.Map) null);
                            ((InterfaceC04444az) this.A02).Bn2();
                            return null;
                        }
                        if (c05034cn.A0A()) {
                            2IU r0 = (2IU) this.A03;
                            InterfaceC04374as interfaceC04374as = (InterfaceC04374as) this.A04;
                            r0.CE8(interfaceC04374as, "DiskCacheProducer", c05034cn.A07(), (java.util.Map) null);
                            ((4aV) this.A01).A00.CZW((InterfaceC04444az) this.A02, interfaceC04374as);
                            return null;
                        }
                        2Ds r02 = (2Ds) c05034cn.A08();
                        2IU r03 = (2IU) this.A03;
                        if (r02 == null) {
                            InterfaceC04374as interfaceC04374as2 = (InterfaceC04374as) this.A04;
                            r03.CEA(interfaceC04374as2, "DiskCacheProducer", !r03.ChL(interfaceC04374as2, "DiskCacheProducer") ? null : C05004ck.A00("cached_value_found", String.valueOf(false)));
                            ((4aV) this.A01).A00.CZW((InterfaceC04444az) this.A02, interfaceC04374as2);
                            return null;
                        }
                        InterfaceC04374as interfaceC04374as3 = (InterfaceC04374as) this.A04;
                        r03.CEA(interfaceC04374as3, "DiskCacheProducer", !r03.ChL(interfaceC04374as3, "DiskCacheProducer") ? null : C05004ck.A01("cached_value_found", String.valueOf(true), "encodedImageSize", String.valueOf(r02.A05())));
                        r03.CS8(interfaceC04374as3, "DiskCacheProducer", true);
                        ((C04364ar) interfaceC04374as3).CaJ("disk", "default");
                        InterfaceC04444az interfaceC04444az = (InterfaceC04444az) this.A02;
                        interfaceC04444az.CEP(1.0f);
                        interfaceC04444az.C9C(r02, 1);
                        r02.close();
                        return null;
                    }
                });
            }
        }
        if (z) {
            A04(c4cw, this, c05104cu, executor);
        }
        return c05104cu.A00;
    }

    public Exception A07() {
        Exception exc;
        synchronized (this.A05) {
            exc = this.A00;
        }
        return exc;
    }

    public Object A08() {
        Object obj;
        synchronized (this.A05) {
            obj = this.A03;
        }
        return obj;
    }

    public boolean A09() {
        boolean z;
        synchronized (this.A05) {
            z = this.A04;
        }
        return z;
    }

    public boolean A0A() {
        boolean z;
        synchronized (this.A05) {
            z = false;
            if (A07() != null) {
                z = true;
            }
        }
        return z;
    }

    public boolean A0B() {
        boolean z;
        Object obj = this.A05;
        synchronized (obj) {
            z = false;
            if (!this.A02) {
                z = true;
                this.A02 = true;
                this.A04 = true;
                obj.notifyAll();
                A05(this);
            }
        }
        return z;
    }

    public boolean A0C(Object obj) {
        boolean z;
        Object obj2 = this.A05;
        synchronized (obj2) {
            z = false;
            if (!this.A02) {
                z = true;
                this.A02 = true;
                this.A03 = obj;
                obj2.notifyAll();
                A05(this);
            }
        }
        return z;
    }
}
