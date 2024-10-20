package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: C6a.class */
public final class C6a {
    public final 1Br A00 = 7zM.A0S();

    public final void A00(Integer num, short s) {
        if (s != 2 && num != null) {
            7zP.A0e(this.A00).markerAnnotate(231287744, TraceFieldType.ErrorCode, num.intValue());
        }
        7zP.A0e(this.A00).markerEnd(231287744, s);
    }

    public final void A01(String str) {
        C00i c00i = this.A00.A00;
        1BK.A0V(c00i).markerStart(231291490);
        1BK.A0V(c00i).markerAnnotate(231291490, "target_user_id", str);
    }
}
