package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* renamed from: X.5l1, reason: invalid class name */
/* loaded from: 5l1.class */
public final class C5l1 implements C5kd {
    public static final Function1 A01;
    public static final C5l1 A00 = new Object();
    public static final C5g3 A02 = 5gF.A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5l1, java.lang.Object] */
    static {
        C5l2 c5l2 = C5l2.A00;
        11T.A0F(c5l2, 0);
        A01 = new M6y(c5l2, new Object(), 43);
    }

    @Override // X.C5kd
    public C5g3 Asj() {
        return A02;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        11T.A0F(r303, 0);
        11T.A0F(c5to, 5);
        5wU r0 = (5wU) A01.invoke(c5to);
        String string = ((1qX) r303).mResultSet.getString(i, 70);
        82X r313 = null;
        if (string != null) {
            ArrayList A002 = r0.A00(string);
            if (!A002.isEmpty()) {
                r313 = new 82X(A002, 1);
            }
        }
        return r313;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return 80;
    }
}
