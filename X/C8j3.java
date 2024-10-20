package X;

import java.util.List;

/* renamed from: X.8j3, reason: invalid class name */
/* loaded from: 8j3.class */
public final class C8j3 extends C1rj {
    public 55S A00;

    public C8j3() {
        super("MigMultiLineTextInputListItemLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        55S r0 = this.A00;
        boolean A1X = 1BL.A1X(r302, r0);
        8TI A00 = 8oZ.A00(r302);
        A00.A2Z(r0.A04);
        String str = r0.A06;
        8oZ r02 = A00.A01;
        r02.A0J = str;
        r02.A0I = r0.A05;
        r02.A0M = A1X;
        r02.A0N = r0.A09;
        r02.A0O = A1X;
        r02.A02 = r0.A02;
        r02.A04 = 3;
        r02.A03 = r0.A03;
        r02.A01 = r0.A01;
        r02.A00 = 0;
        List list = r0.A07;
        if (list != null) {
            if (r02.A0K.isEmpty()) {
                r02.A0K = list;
            } else {
                r02.A0K.addAll(list);
            }
        }
        List list2 = r0.A08;
        if (list2 != null) {
            if (r02.A0L.isEmpty()) {
                r02.A0L = list2;
            } else {
                r02.A0L.addAll(list2);
            }
        }
        A00.A16(r0.A00);
        A00.A0R();
        return A00.A2W();
    }
}
