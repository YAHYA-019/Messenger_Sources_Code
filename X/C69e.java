package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.69e, reason: invalid class name */
/* loaded from: 69e.class */
public final class C69e {
    public float A00;
    public int A01;
    public Resources A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public InterfaceC07034in A09;
    public InterfaceC07034in A0A;
    public InterfaceC07034in A0B;
    public InterfaceC07034in A0C;
    public InterfaceC07034in A0D;
    public 5SA A0E;
    public List A0F;
    public static final InterfaceC07034in A0H = InterfaceC07034in.A02;
    public static final InterfaceC07034in A0G = InterfaceC07034in.A01;

    public C69e(Resources resources) {
        this.A02 = resources;
        A00(this);
    }

    public static void A00(C69e c69e) {
        c69e.A01 = 300;
        c69e.A00 = 0.0f;
        c69e.A05 = null;
        InterfaceC07034in interfaceC07034in = A0H;
        c69e.A0B = interfaceC07034in;
        c69e.A08 = null;
        c69e.A0D = interfaceC07034in;
        c69e.A04 = null;
        c69e.A0A = interfaceC07034in;
        c69e.A07 = null;
        c69e.A0C = interfaceC07034in;
        c69e.A09 = A0G;
        c69e.A03 = null;
        c69e.A0F = null;
        c69e.A06 = null;
        c69e.A0E = null;
    }

    public C69f A01() {
        List list = this.A0F;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        return new C69f(this);
    }

    public void A02(InterfaceC07034in interfaceC07034in) {
        this.A09 = interfaceC07034in;
    }
}
