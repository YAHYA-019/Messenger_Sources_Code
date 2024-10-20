package X;

import android.content.res.Resources;
import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.5u5, reason: invalid class name */
/* loaded from: 5u5.class */
public abstract class C5u5 {
    public static final C5w7 A00(C5pu c5pu, C03853z9 c03853z9, boolean z) {
        Integer num;
        11T.A0F(c03853z9, 1);
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() == 0) {
            return null;
        }
        int AXc = c5pu.AXc(0);
        if (AXc == 1) {
            num = 0S2.A0C;
        } else {
            if (AXc != 15) {
                return null;
            }
            num = 0S2.A01;
        }
        String string = r0.mResultSet.getString(0, 20);
        if (string == null) {
            string = "not available";
        }
        int i = 120;
        if (z) {
            i = 180;
        }
        Resources system = Resources.getSystem();
        11T.A0A(system);
        int A03 = C0A8.A03(system, i);
        long j = r0.mResultSet.getLong(0, ActionId.ASYNC_ACTION_SUCCESS);
        String string2 = r0.mResultSet.getString(0, ActionId.ASYNC_ACTION_FAIL);
        if (string2 == null) {
            string2 = r0.mResultSet.getString(0, ActionId.CONNECTIVITY_CHANGED);
        }
        11T.A0D(string2);
        String obj = c03853z9.A01(string2, j).toString();
        11T.A0A(obj);
        String string3 = r0.mResultSet.getString(0, ActionId.VIDEO_DISPLAYED);
        11T.A0A(string3);
        return A01(num, string3, string, obj, A03);
    }

    public static final C5w7 A01(Integer num, String str, String str2, String str3, int i) {
        C5w7 c5w7 = new C5w7();
        5wW r0 = new 5wW();
        r0.A01(str);
        r0.A0H = false;
        r0.A0A = num;
        r0.A02(str2);
        r0.A01 = i;
        r0.A00 = i;
        r0.A03(str3);
        r0.A03 = i;
        r0.A02 = i;
        r0.A04(str3);
        r0.A0G = true;
        c5w7.A00 = new Photo(r0);
        return c5w7;
    }
}
