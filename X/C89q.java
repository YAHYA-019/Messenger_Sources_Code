package X;

import android.net.Uri;
import com.facebook.common.util.TriState;
import com.facebook.forker.Process;

/* renamed from: X.89q, reason: invalid class name */
/* loaded from: 89q.class */
public final class C89q extends 2Yv {
    public Uri A00;
    public TriState A01;
    public 89S A02;
    public 6cL A03;
    public Boolean A04;
    public Boolean A05;
    public boolean A06;

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0018. Please report as an issue. */
    public void A02(C2l4 c2l4) {
        Object obj;
        Object obj2;
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i != 0) {
            if (i != 1) {
                switch (i) {
                    case Integer.MIN_VALUE:
                        this.A04 = (Boolean) objArr[0];
                        return;
                    case Process.WAIT_RESULT_STOPPED /* -2147483647 */:
                        this.A00 = (Uri) objArr[0];
                        return;
                    case Process.WAIT_RESULT_RUNNING /* -2147483646 */:
                        obj2 = objArr[0];
                        break;
                    case -2147483645:
                        obj = objArr[0];
                        break;
                    case -2147483644:
                        this.A05 = (Boolean) objArr[0];
                        return;
                    default:
                        return;
                }
            } else {
                obj2 = (Boolean) objArr[0];
            }
            this.A06 = AnonymousClass001.A1V(obj2);
            return;
        }
        obj = (TriState) objArr[0];
        this.A01 = (TriState) obj;
    }
}
