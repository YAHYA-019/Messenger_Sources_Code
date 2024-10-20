package X;

import com.facebook.litho.ComponentTree;

/* renamed from: X.3Ym, reason: invalid class name */
/* loaded from: 3Ym.class */
public final class C3Ym implements C2k0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3Ym(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C2k0
    public void CKx(int i, int i2, int i3, boolean z) {
        if (this.A00 != 0) {
            ComponentTree componentTree = (ComponentTree) this.A01;
            componentTree.A0S(this);
            C6vl c6vl = (C6vl) this.A02;
            synchronized (c6vl.A04) {
                c6vl.A01 = true;
                1LI r0 = c6vl.A00;
                if (r0 != null) {
                    componentTree.A0P(r0);
                    c6vl.A00 = null;
                }
            }
            return;
        }
        ComponentTree componentTree2 = (ComponentTree) this.A02;
        componentTree2.A0S(this);
        6tZ r02 = ((C6tf) this.A01).A00;
        synchronized (r02.A0K) {
            r02.A0A = true;
            1LI r03 = r02.A00;
            if (r03 != null) {
                componentTree2.A0P(r03);
                r02.A00 = null;
            }
        }
    }
}
