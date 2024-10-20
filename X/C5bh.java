package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.5bh, reason: invalid class name */
/* loaded from: 5bh.class */
public final class C5bh implements InterfaceC06154g3 {
    public final InterfaceC06154g3[] A00;

    public C5bh(InterfaceC06154g3... interfaceC06154g3Arr) {
        this.A00 = interfaceC06154g3Arr;
    }

    @Override // X.InterfaceC06154g3
    public void Bxm(Drawable drawable, Throwable th, long j) {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        int i = 0;
        do {
            InterfaceC06154g3 interfaceC06154g3 = interfaceC06154g3Arr[i];
            if (interfaceC06154g3 != null) {
                interfaceC06154g3.Bxm(drawable, th, j);
            }
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC06154g3
    public void Byb(Drawable drawable, 2Ec r303, int i, long j) {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        int i2 = 0;
        do {
            InterfaceC06154g3 interfaceC06154g3 = interfaceC06154g3Arr[i2];
            if (interfaceC06154g3 != null) {
                interfaceC06154g3.Byb(drawable, r303, i, j);
            }
            i2++;
        } while (i2 < 2);
    }

    @Override // X.InterfaceC06154g3
    public void C2B(long j, Throwable th) {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        int i = 0;
        do {
            InterfaceC06154g3 interfaceC06154g3 = interfaceC06154g3Arr[i];
            if (interfaceC06154g3 != null) {
                interfaceC06154g3.C2B(j, th);
            }
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC06154g3
    public void C2F(2Ec r302, long j) {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        int i = 0;
        do {
            InterfaceC06154g3 interfaceC06154g3 = interfaceC06154g3Arr[i];
            if (interfaceC06154g3 != null) {
                interfaceC06154g3.C2F(r302, j);
            }
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC06154g3
    public void CBu(Drawable drawable, long j) {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        int i = 0;
        do {
            InterfaceC06154g3 interfaceC06154g3 = interfaceC06154g3Arr[i];
            if (interfaceC06154g3 != null) {
                interfaceC06154g3.CBu(drawable, j);
            }
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC06154g3
    public void CG3(long j) {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        int i = 0;
        do {
            InterfaceC06154g3 interfaceC06154g3 = interfaceC06154g3Arr[i];
            if (interfaceC06154g3 != null) {
                interfaceC06154g3.CG3(j);
            }
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC06154g3
    public void COB(long j, Object obj) {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        int i = 0;
        do {
            InterfaceC06154g3 interfaceC06154g3 = interfaceC06154g3Arr[i];
            if (interfaceC06154g3 != null) {
                interfaceC06154g3.COB(j, obj);
            }
            i++;
        } while (i < 2);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C5bh)) {
                return false;
            }
            InterfaceC06154g3[] interfaceC06154g3Arr = ((C5bh) obj).A00;
            InterfaceC06154g3[] interfaceC06154g3Arr2 = this.A00;
            int i = 0;
            while (11T.A0O(interfaceC06154g3Arr2[i], interfaceC06154g3Arr[i])) {
                i++;
                if (i < 2) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        InterfaceC06154g3[] interfaceC06154g3Arr = this.A00;
        return (AnonymousClass002.A04(interfaceC06154g3Arr[0]) * 31) + AnonymousClass002.A04(interfaceC06154g3Arr[1]);
    }
}
