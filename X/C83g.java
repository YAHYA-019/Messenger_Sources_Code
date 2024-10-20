package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.83g, reason: invalid class name */
/* loaded from: 83g.class */
public final class C83g extends C1rs {
    public 1Iw A00;
    public C02413v4 A01;
    public final BitSet A02;
    public final String[] A03;

    public C83g(1Iw r302, C02413v4 c02413v4) {
        super(c02413v4, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "iconName", "iconSize"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c02413v4;
        this.A00 = r302;
        A18.clear();
    }

    public static void A06(C2sn c2sn, C83g c83g, Function1 function1) {
        c83g.A2b(new 3vS(function1, (Object[]) null, -1));
        c2sn.A00(c83g.A2V());
    }

    public static void A07(C83g c83g, String str) {
        c83g.A01.A04 = new C4Ux(str);
    }

    public static void A08(C83g c83g, Function1 function1) {
        c83g.A2b(new 3vS(function1, (Object[]) null, -1));
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2T(1Im r302) {
        A2b(r302);
        return this;
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2U(boolean z) {
        A2g(z);
        return this;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C02413v4 A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public final void A2X() {
        A2a(2Re.A02);
    }

    public final void A2Y() {
        A2a(2Re.A03);
    }

    public void A2Z(2MQ r302) {
        this.A01.A00 = r302;
        this.A02.set(1);
    }

    public void A2a(2Re r302) {
        this.A01.A01 = r302;
        this.A02.set(2);
    }

    public void A2b(1Im r302) {
        super.A2T(r302);
        this.A01.A02 = r302;
    }

    public void A2c(C83o c83o) {
        this.A01.A03 = c83o;
    }

    public void A2d(C1p8 c1p8) {
        this.A01.A06 = c1p8;
    }

    public void A2e(MigColorScheme migColorScheme) {
        this.A01.A0B = migColorScheme;
        this.A02.set(0);
    }

    public void A2f(String str) {
        this.A01.A0C = str;
    }

    public void A2g(boolean z) {
        super.A2U(z);
        this.A01.A0D = z;
    }
}
