package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.LithoView;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Det, reason: case insensitive filesystem */
/* loaded from: Det.class */
public final class C2140Det extends FFu {
    public final HashMap A00;
    public final ViewGroup A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140Det(ViewGroup viewGroup, FFu fFu, Ras ras, LithoView lithoView) {
        super(viewGroup, fFu, ras, 0S2.A01, lithoView);
        11T.A0F(lithoView, 4);
        this.A01 = viewGroup;
        this.A00 = AnonymousClass001.A0u();
        A01(lithoView);
    }

    private final FFu A00(FFu fFu, ComponentHost componentHost, C01063pm c01063pm) {
        if (c01063pm != null) {
            List list = c01063pm.A03;
            if (!list.isEmpty()) {
                HashMap hashMap = this.A00;
                FFu fFu2 = (FFu) hashMap.get(0QD.A0D(list));
                if (fFu2 == null) {
                    fFu = A00(fFu, componentHost, c01063pm.A02);
                    int A04 = AnonymousClass001.A04(list);
                    while (true) {
                        int i = A04;
                        if (-1 >= i) {
                            break;
                        }
                        1LI r0 = (1LI) list.get(i);
                        FFu fFu3 = (FFu) hashMap.get(r0);
                        if (fFu3 == null) {
                            fFu3 = new C2139Des(componentHost, fFu, ((FFu) this).A01, r0);
                            fFu.A04.add(fFu3);
                            hashMap.put(r0, fFu3);
                        }
                        fFu = fFu3;
                        A04 = i - 1;
                    }
                } else {
                    return fFu2;
                }
            }
        }
        return fFu;
    }

    private final void A01(ComponentHost componentHost) {
        FFu A01;
        11T.A0F(componentHost, 0);
        int A0Q = componentHost.A0Q();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A0Q) {
                return;
            }
            Object obj = componentHost.A0R(i2).A04;
            if (obj instanceof ComponentHost) {
                A01((ComponentHost) obj);
            } else {
                C01063pm c01063pm = C29f.A00(componentHost.A0R(i2).A01.A07).A05;
                if (c01063pm != null) {
                    FFu A00 = A00(this, componentHost, c01063pm);
                    if (obj instanceof View) {
                        A01 = ((FFu) this).A01.A02((View) obj, componentHost, A00, 0S2.A01);
                    } else if (obj instanceof Drawable) {
                        A01 = ((FFu) this).A01.A01((Drawable) obj, componentHost, A00, 0S2.A01);
                    }
                    if (A01 != null) {
                        int i3 = c01063pm.A00;
                        A01.A00 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? "BORDER" : "HOST" : "FOREGROUND" : "BACKGROUND" : "CONTENT";
                        A00.A04.add(A01);
                    }
                }
            }
            i = i2 + 1;
        }
    }

    public EN8 A03() {
        return Qza.A00(((FFu) this).A03.getClass(), (String) null);
    }
}
