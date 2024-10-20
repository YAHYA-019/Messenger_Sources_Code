package X;

import android.os.Debug;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.14d, reason: invalid class name */
/* loaded from: 14d.class */
public final class C14d implements 0vO {
    public long A00;
    public C14f A02;
    public String A03;
    public final long A04;
    public final long A06;
    public final long A07;
    public final 0vK A08;
    public final List A09;
    public final boolean A0A;
    public final Class[] A0B;
    public final Class[] A0C;
    public final LinkedList A05 = new LinkedList();
    public long A01 = -1;

    public C14d(C0Wy c0Wy, C0v7 c0v7, List list) {
        this.A04 = c0Wy.A01();
        this.A07 = c0Wy.A02();
        boolean A0N = c0Wy.A0N();
        this.A0A = A0N;
        this.A06 = c0Wy.A00();
        List A03 = c0Wy.A03();
        this.A09 = A03;
        0Wo r0 = 0Wo.A03;
        Class<?> cls = r0.A00;
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread$H");
            } catch (Throwable unused) {
                cls = null;
            }
            r0.A00 = cls;
        }
        this.A0C = new Class[]{cls};
        this.A0B = r0.A00();
        this.A08 = A0N ? new 0vK(this, c0Wy, c0v7, list) : null;
        A03.add(new C0vP());
    }

    public C14f Afh() {
        C14f c14f;
        synchronized (this) {
            c14f = this.A02;
        }
        return c14f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0293, code lost:
    
        if (r0.A00 != 0) goto L146;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String BCE(long r302) {
        /*
            Method dump skipped, instructions count: 1801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14d.BCE(long):java.lang.String");
    }

    public void BeB(C14f c14f) {
        synchronized (this) {
            this.A02 = null;
        }
        LinkedList linkedList = this.A05;
        synchronized (linkedList) {
            if (!c14f.A05(this.A07)) {
                int i = 0;
                Class cls = this.A0C[0];
                if (cls == null || ((0Wp) c14f).A09 != cls || ((0Wp) c14f).A07 != null) {
                    Class[] clsArr = this.A0B;
                    while (true) {
                        Class cls2 = clsArr[i];
                        if (cls2 != null && ((0Wp) c14f).A07 == cls2) {
                            break;
                        }
                        i++;
                        if (i >= 4) {
                            if (c14f.A02 == 0 && c14f.A00 == 0 && ((0Wp) c14f).A02 - this.A01 < 500) {
                                c14f.A07();
                                linkedList.removeFirst();
                            }
                        }
                    }
                }
            }
            this.A01 = ((0Wp) c14f).A05;
            if (!linkedList.isEmpty()) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.A04;
                do {
                    C14f c14f2 = (C14f) linkedList.peekLast();
                    if (c14f2 != null) {
                        if (((0Wp) c14f2).A05 > uptimeMillis) {
                            break;
                        } else {
                            c14f2.A07();
                        }
                    }
                    linkedList.removeLast();
                } while (!linkedList.isEmpty());
            }
        }
    }

    public void BeE(C14f c14f) {
    }

    public void BeF(C14f c14f) {
        synchronized (this) {
            this.A02 = c14f;
        }
        LinkedList linkedList = this.A05;
        synchronized (linkedList) {
            c14f.A01++;
            linkedList.addFirst(c14f);
        }
    }

    public void BjY(String str) {
        this.A03 = str;
        0vK r0 = this.A08;
        if (r0 != null && !Debug.isDebuggerConnected()) {
            r0.A00(0L, false);
        }
        this.A00 = SystemClock.uptimeMillis();
    }

    public String getName() {
        return "anr_looper_history";
    }
}
