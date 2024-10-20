package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.83L, reason: invalid class name */
/* loaded from: 83L.class */
public final class C83L extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83L(String str, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C5xx c5xx = (C5xx) this.A01;
                ((UserFlowLogger) c5xx.A03.A00.get()).flowEndCancel(c5xx.A00, this.A02);
                c5xx.A00 = 0L;
                c5xx.A01 = null;
                break;
            case 1:
                String str = this.A02;
                C5xy c5xy = (C5xy) this.A01;
                if (!11T.A0O(str, c5xy.A00)) {
                    DCw dCw = new DCw(c5xy, 9);
                    if (!11T.A0O(c5xy.A00, "")) {
                        dCw.invoke();
                    }
                }
                if (!c5xy.A02) {
                    BSI.A00(C5xy.A00(c5xy), "thread_opened", "not_applicable", "not_applicable", Long.parseLong(str));
                    c5xy.A00 = str;
                    c5xy.A02 = true;
                    break;
                }
                break;
            default:
                C6ns c6ns = (C6ns) this.A01;
                c6ns.A01.flowEndCancel(c6ns.A00, this.A02);
                c6ns.A00 = 0L;
                break;
        }
        return 04S.A00;
    }
}
