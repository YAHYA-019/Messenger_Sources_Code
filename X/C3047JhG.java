package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.JhG, reason: case insensitive filesystem */
/* loaded from: JhG.class */
public final class C3047JhG extends L94 implements Iterable, AnonymousClass116 {
    public int A00;
    public String A01;
    public final 0AE A02;

    public C3047JhG(KTb kTb) {
        super(kTb);
        this.A02 = new 0AE();
    }

    @Override // X.L94
    public Lio A03(Kpg kpg) {
        Lio A03 = super.A03(kpg);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = iterator();
        while (it.hasNext()) {
            Lio A032 = ((L94) it.next()).A03(kpg);
            if (A032 != null) {
                A0s.add(A032);
            }
        }
        return (Lio) 0QD.A04(C0s8.A15(A03, (Lio) 0QD.A04(A0s)));
    }

    @Override // X.L94
    public void A04(Context context, AttributeSet attributeSet) {
        super.A04(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, Kcz.A03);
        11T.A0A(obtainAttributes);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId == super.A00) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Start destination ");
            A0k.append(resourceId);
            throw AnonymousClass002.A0C(this, " cannot use the same id as the graph ", A0k);
        }
        this.A00 = resourceId;
        this.A01 = null;
        this.A01 = KVL.A00(context, resourceId);
        obtainAttributes.recycle();
    }

    public final L94 A06(int i, boolean z) {
        C3047JhG c3047JhG;
        L94 l94 = (L94) C0Ak.A00(this.A02, i);
        if (l94 == null) {
            if (!z || (c3047JhG = super.A01) == null) {
                return null;
            }
            l94 = c3047JhG.A06(i, true);
        }
        return l94;
    }

    public final void A07(L94 l94) {
        int i = l94.A00;
        String str = l94.A03;
        if (i == 0 && str == null) {
            throw AnonymousClass001.A0L("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.A03;
        if (str2 != null && !7zL.A1X(str, str2)) {
            throw AnonymousClass002.A0C(this, " cannot have the same route as graph ", AnonymousClass001.A0m(l94, "Destination "));
        }
        if (i == super.A00) {
            throw AnonymousClass002.A0C(this, " cannot have the same id as graph ", AnonymousClass001.A0m(l94, "Destination "));
        }
        0AE r0 = this.A02;
        L94 l942 = (L94) C0Ak.A00(r0, i);
        if (l942 != l94) {
            if (l94.A01 != null) {
                throw AnonymousClass001.A0N("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            if (l942 != null) {
                l942.A01 = null;
            }
            l94.A01 = this;
            r0.A09(l94.A00, l94);
        }
    }

    @Override // X.L94
    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null && (obj instanceof C3047JhG)) {
                if (super.equals(obj)) {
                    0AE r0 = this.A02;
                    int A00 = r0.A00();
                    C3047JhG c3047JhG = (C3047JhG) obj;
                    0AE r02 = c3047JhG.A02;
                    if (A00 == r02.A00() && this.A00 == c3047JhG.A00) {
                        Iterator it = 0AK.A09(new C0nh(r0)).iterator();
                        while (it.hasNext()) {
                            L94 l94 = (L94) it.next();
                            if (!l94.equals(C0Ak.A00(r02, l94.A00))) {
                            }
                        }
                    }
                }
                z = false;
                break;
            }
            return false;
        }
        return z;
    }

    @Override // X.L94
    public int hashCode() {
        int i = this.A00;
        0AE r0 = this.A02;
        int A00 = r0.A00();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= A00) {
                return i;
            }
            i = 1BK.A03(r0.A05(i3), ((i * 31) + r0.A02(i3)) * 31);
            i2 = i3 + 1;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Lso(this);
    }

    @Override // X.L94
    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(super.toString());
        L94 A06 = A06(this.A00, true);
        A0k.append(" startDestination=");
        if (A06 == null) {
            str = this.A01;
            if (str == null) {
                str = 0Pz.A0W("0x", Integer.toHexString(this.A00));
            }
        } else {
            A0k.append("{");
            1BK.A1R(A0k, A06);
            str = "}";
        }
        String A0d = AnonymousClass001.A0d(str, A0k);
        11T.A0A(A0d);
        return A0d;
    }
}
