package X;

import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0qn, reason: invalid class name */
/* loaded from: 0qn.class */
public final class C0qn implements 0Oc {
    public long A00;
    public long A01;
    public boolean A02 = false;
    public boolean A03;
    public final Choreographer A04;
    public final 0fL A05;
    public final Runnable A06;
    public final Method A07;
    public final Method A08;
    public final Method A09;

    public C0qn(Choreographer choreographer, 0fL r303) {
        Method method;
        Method method2;
        Method method3;
        long j = -1;
        this.A00 = j;
        this.A01 = j;
        this.A05 = r303;
        this.A04 = choreographer;
        try {
            method = Choreographer.class.getDeclaredMethod("postCallback", Integer.TYPE, Runnable.class, Object.class);
        } catch (NoSuchMethodException e) {
            A00(this, e);
            method = null;
        }
        this.A08 = method;
        try {
            method2 = Choreographer.class.getDeclaredMethod("removeCallbacks", Integer.TYPE, Runnable.class, Object.class);
        } catch (NoSuchMethodException e2) {
            A00(this, e2);
            method2 = null;
        }
        this.A09 = method2;
        try {
            method3 = Choreographer.class.getDeclaredMethod("getFrameTimeNanos", new Class[0]);
        } catch (NoSuchMethodException e3) {
            A00(this, e3);
            method3 = null;
        }
        this.A07 = method3;
        this.A06 = new 0fM(this);
    }

    public static void A00(C0qn c0qn, Exception exc) {
        android.util.Log.e(AnonymousClass001.A0X(c0qn), "Choreographer reflection failed.", exc);
        c0qn.A03 = true;
    }

    public static void A01(C0qn c0qn, Runnable runnable) {
        if (c0qn.A03) {
            return;
        }
        try {
            Method method = c0qn.A08;
            if (method != null) {
                method.invoke(c0qn.A04, 0, runnable, null);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            A00(c0qn, e);
        }
    }

    public void disable() {
        this.A02 = false;
        Runnable runnable = this.A06;
        Method method = this.A09;
        if (method != null) {
            try {
                method.invoke(this.A04, 0, runnable, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                A00(this, e);
            }
        }
    }

    public void enable() {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        A01(this, this.A06);
    }
}
