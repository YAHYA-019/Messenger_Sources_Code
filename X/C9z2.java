package X;

import android.view.View;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.9z2, reason: invalid class name */
/* loaded from: 9z2.class */
public final class C9z2 implements 7Wh {
    public final Message A00;
    public final java.util.Map A01;

    public C9z2(Message message, java.util.Map map) {
        11T.A0F(map, 2);
        this.A00 = message;
        this.A01 = map;
    }

    public void CVg(View view, 2Ov r303) {
        throw new UnsupportedOperationException("openDialogFragmentFromXMA not yet supported");
    }

    public boolean CXA(View view, C7sh c7sh) {
        6MZ r0 = (6MZ) this.A01.get(c7sh.A02);
        return r0 != null && r0.CX9(view, c7sh, this.A00);
    }
}
