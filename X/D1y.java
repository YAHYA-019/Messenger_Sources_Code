package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: D1y.class */
public final class D1y implements InterfaceC07434jv {
    public final By6 A00;
    public final String A01;

    public D1y(By6 by6, String str) {
        this.A00 = by6;
        this.A01 = str;
    }

    public List A00(C1787AsL c1787AsL) {
        11T.A0F(c1787AsL, 0);
        String str = this.A01;
        By6 by6 = this.A00;
        BiB biB = new BiB((BbB) C1Y6.A00(by6.A00, "com_facebook_messaging_threadsettings_plugins_interfaces_menuitem_MenuItemInterfaceSpec", str, new Object[]{by6.A07.A01, c1787AsL.A01, c1787AsL.A00, c1787AsL.A04, c1787AsL.A02, by6.A03, by6.A01, by6.A04, by6.A06, by6.A05, by6.A02}));
        DHv dHv = biB.A00.A00;
        int[] Ayq = dHv.Ayq();
        11T.A0A(Ayq);
        int length = Ayq.length;
        ArrayList A0t = AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return 0QD.A0S(A0t);
            }
            int i3 = Ayq[i2];
            C7I Awe = dHv.Awe(i3);
            A0t.add(Awe == null ? null : new Bx0(null, new CuY(biB, i3), i3, Awe.A00, 0, 0, false));
            i = i2 + 1;
        }
    }

    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        return A00((C1787AsL) obj);
    }
}
