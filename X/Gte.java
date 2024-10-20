package X;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: Gte.class */
public final class Gte extends GuG implements ComponentCallbacks2, JPn {
    public static final int[] A04;
    public JQ9 A00;
    public final HWn A01;
    public final JQ8 A02;
    public final LinkedList A03;

    static {
        int[] A1b = GOn.A1b();
        A1b[0] = 80;
        A1b[1] = 15;
        A04 = A1b;
    }

    public Gte(JOW jow) {
        super(jow);
        this.A03 = AbF.A1F();
        JOW jow2 = ((GuG) this).A00;
        ActivityManager A0J = GOq.A0J(jow2.getContext());
        this.A02 = (JQ8) jow2.AdD(JQ8.A00);
        this.A01 = new HWn(A0J);
    }

    private final void A00() {
        LinkedList linkedList = this.A03;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onLowMemory");
            }
        }
    }

    public void A0A() {
        this.A00 = (JQ9) ((GuG) this).A00.AdD(JQ9.A00);
    }

    @Override // X.JQC
    public GuJ Ase() {
        return JPn.A00;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        A00();
        JQ9 jq9 = this.A00;
        if (jq9 != null) {
            jq9.B0E().onEvent(15, null, true);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        int[] iArr = A04;
        int i2 = 0;
        while (i != iArr[i2]) {
            i2++;
            if (i2 >= 2) {
                return;
            }
        }
        A00();
        JQ9 jq9 = this.A00;
        if (jq9 != null) {
            jq9.B0E().onEvent(15, null, true);
        }
    }
}
