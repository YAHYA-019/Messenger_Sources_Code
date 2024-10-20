package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.5u7, reason: invalid class name */
/* loaded from: 5u7.class */
public final class C5u7 implements C5u8 {
    public static final C5u7 A00 = new Object();
    public static final 5HP A01 = 5HP.A06;

    @Override // X.C5u8
    public Uri BFf(C5pu c5pu, int i) {
        C03853z9 c03853z9 = (C03853z9) 1Bi.A03(67389);
        1qX r0 = (1qX) c5pu;
        long j = r0.mResultSet.getLong(0, ActionId.ASYNC_ACTION_SUCCESS);
        String string = r0.mResultSet.getString(0, ActionId.CONNECTIVITY_CHANGED);
        11T.A0A(string);
        return c03853z9.A02(string, null, j);
    }

    @Override // X.C5u8
    public 5HP BJp() {
        return A01;
    }

    @Override // X.C5u8
    public Uri BJs(C5pu c5pu, int i) {
        1qX r0 = (1qX) c5pu;
        String string = r0.mResultSet.getString(0, ActionId.ASYNC_ACTION_FAIL);
        if (string != null) {
            return ((C03853z9) 1Bi.A03(67389)).A02(string, null, r0.mResultSet.getLong(0, ActionId.ASYNC_ACTION_SUCCESS));
        }
        return null;
    }
}
