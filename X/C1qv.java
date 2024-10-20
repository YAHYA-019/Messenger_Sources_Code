package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentHost;

/* renamed from: X.1qv, reason: invalid class name */
/* loaded from: 1qv.class */
public abstract class C1qv extends ViewGroup {
    public int A0Q() {
        return ((ComponentHost) this).A0M.A00();
    }

    public 2JG A0R(int i) {
        return (2JG) ((ComponentHost) this).A0M.A05(i);
    }

    public void A0S(2JG r302) {
        int A02;
        ComponentHost componentHost = (ComponentHost) this;
        0AE r0 = componentHost.A0M;
        int A03 = r0.A03(r302);
        if (A03 == -1) {
            0AE r307 = componentHost.A04;
            if (r307 == null) {
                r307 = new 0AE(4);
                componentHost.A04 = r307;
            }
            A02 = r307.A02(r307.A03(r302));
        } else {
            A02 = r0.A02(A03);
        }
        Object obj = r302.A04;
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            1sP.A00();
            drawable.setCallback(null);
            componentHost.invalidate(drawable.getBounds());
            ComponentHost.A0N(componentHost);
            AbstractC03443y2.A00(componentHost.A0L, componentHost.A03, A02);
        } else if (obj instanceof View) {
            ComponentHost.A0K((View) obj, componentHost);
            AbstractC03443y2.A00(componentHost.A0N, componentHost.A05, A02);
            componentHost.A0H = true;
            ComponentHost.A0P(componentHost, r302, A02);
        }
        AbstractC03443y2.A00(r0, componentHost.A04, A02);
        ComponentHost.A0N(componentHost);
        ComponentHost.A0O(componentHost, 2JK.A00(r302.A01));
        r302.A00 = null;
    }

    public void A0T(2JG r302, int i, int i2) {
        0AE r0;
        ComponentHost componentHost = (ComponentHost) this;
        0AE r02 = componentHost.A0M;
        if (!r302.equals(C0Ak.A00(r02, i)) && ((r0 = componentHost.A04) == null || !r302.equals(C0Ak.A00(r0, i)))) {
            String A00 = r302.A01.A00(null);
            2JG r03 = (2JG) C0Ak.A00(r02, i);
            String A002 = r03 != null ? r03.A01.A00(null) : "null";
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Attempting to move MountItem from index: ");
            A0k.append(i);
            A0k.append(" to index: ");
            A0k.append(i2);
            A0k.append(", but given MountItem does not exist at provided old index.\nGiven MountItem: ");
            A0k.append(A00);
            A0k.append("\nExisting MountItem at old index: ");
            throw AnonymousClass002.A0F(A002, A0k);
        }
        Rect rect = C29f.A00(r302.A01.A07).A04;
        C02423v5 c02423v5 = componentHost.A0B;
        if (rect != null && c02423v5 != null) {
            0AE r04 = c02423v5.A01;
            if (C0Ak.A00(r04, i2) != null) {
                0AE r309 = c02423v5.A00;
                if (r309 == null) {
                    r309 = new 0AE(4);
                    c02423v5.A00 = r309;
                }
                ComponentHost.A0L(r04, r309, i2);
            }
            ComponentHost.A0M(r04, c02423v5.A00, i, i2);
            0AE r05 = c02423v5.A00;
            if (r05 != null && r05.A00() == 0) {
                c02423v5.A00 = null;
            }
        }
        Object obj = r302.A04;
        if (obj instanceof Drawable) {
            1sP.A00();
            0AE r06 = componentHost.A0L;
            if (C0Ak.A00(r06, i2) != null) {
                0AE r3092 = componentHost.A03;
                if (r3092 == null) {
                    r3092 = new 0AE(4);
                    componentHost.A03 = r3092;
                }
                ComponentHost.A0L(r06, r3092, i2);
            }
            ComponentHost.A0M(r06, componentHost.A03, i, i2);
            componentHost.invalidate();
            ComponentHost.A0N(componentHost);
        } else if (obj instanceof View) {
            componentHost.A0H = true;
            0AE r07 = componentHost.A0N;
            if (C0Ak.A00(r07, i2) != null) {
                0AE r3093 = componentHost.A05;
                if (r3093 == null) {
                    r3093 = new 0AE(4);
                    componentHost.A05 = r3093;
                }
                ComponentHost.A0L(r07, r3093, i2);
            }
            ComponentHost.A0M(r07, componentHost.A05, i, i2);
        }
        if (C0Ak.A00(r02, i2) != null) {
            0AE r3094 = componentHost.A04;
            if (r3094 == null) {
                r3094 = new 0AE(4);
                componentHost.A04 = r3094;
            }
            ComponentHost.A0L(r02, r3094, i2);
        }
        ComponentHost.A0M(r02, componentHost.A04, i, i2);
        ComponentHost.A0N(componentHost);
    }

    public String A0U() {
        return null;
    }

    public abstract void A0V();

    public abstract void A0W();

    public abstract void A0X(2JG r1, int i);
}
