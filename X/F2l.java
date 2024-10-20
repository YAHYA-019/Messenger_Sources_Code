package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: F2l.class */
public abstract class F2l {
    public static final int A00(Integer num) {
        int intValue = num.intValue();
        int i = 4;
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        if (intValue == 3) {
            i = 3;
        }
        return i;
    }

    public static final void A01(String str, String str2, String str3, String str4, F2l f2l, int i) {
        long j = 2;
        2R2 A08 = AbF.A08(1BK.A08(1Br.A02(((GCA) f2l).A00), 1BJ.A00(1365)), ActionId.MESSENGER_THREAD_LIST_LOADED);
        if (4YU.A1X(A08)) {
            A08.A0E("event", str);
            A08.A0E("acl_error_message", str2);
            A08.A0E("caller_name", str3);
            A08.A0D("acl_version", Long.valueOf(j));
            A08.A0C("capability", Integer.valueOf(i));
            A08.A0E("caller_context", str4);
            A08.BZL();
        }
    }
}
