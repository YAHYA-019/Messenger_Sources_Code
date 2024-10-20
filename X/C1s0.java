package X;

import android.content.Context;
import com.facebook.litho.ComponentTree;

/* renamed from: X.1s0, reason: invalid class name */
/* loaded from: 1s0.class */
public final class C1s0 {
    public Context A00;
    public 1LI A01;
    public C2k0 A02;
    public InterfaceC00713oe A03;
    public C1s8 A05;
    public C02A A06;
    public 1cU A07;
    public final C1qp A09;
    public final C1qp A0A;
    public Boolean A08 = null;
    public C1ru A04 = null;

    public C1s0(1Iw r302) {
        this.A06 = r302.A03.A01;
        this.A0A = r302.A08;
        this.A09 = r302.A07;
        this.A00 = r302.A0D;
    }

    public ComponentTree A00() {
        if (this.A01 == null) {
            this.A01 = new 1LI();
        }
        Boolean bool = this.A08;
        boolean booleanValue = bool != null ? bool.booleanValue() : this.A06.A0N;
        C02A c02a = this.A06;
        String str = c02a.A08;
        0AS A00 = 02B.A00(c02a);
        if (str == null) {
            str = this.A01.A0a();
        }
        A00.A06 = str;
        boolean z = false;
        if (booleanValue) {
            z = true;
        }
        A00.A0K = z;
        this.A06 = A00.A00();
        return new ComponentTree(this);
    }

    public void A01(boolean z) {
        this.A08 = Boolean.valueOf(z);
    }
}
