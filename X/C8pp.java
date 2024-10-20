package X;

import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8pp, reason: invalid class name */
/* loaded from: 8pp.class */
public final class C8pp extends 2Yv {
    public int A00;
    public 5Pm A01;
    public ImmutableList A02;
    public boolean A03;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        switch (c2l4.A00) {
            case Integer.MIN_VALUE:
                this.A03 = 7zO.A1Z(objArr, 0);
                return;
            case Process.WAIT_RESULT_STOPPED /* -2147483647 */:
                this.A00 = 7zO.A08(objArr, 0);
                return;
            case Process.WAIT_RESULT_RUNNING /* -2147483646 */:
                this.A02 = (ImmutableList) objArr[0];
                return;
            case -2147483645:
                this.A01 = (5Pm) objArr[0];
                return;
            default:
                return;
        }
    }
}
