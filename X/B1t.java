package X;

import android.content.Context;
import android.text.SpannableString;
import java.util.List;

/* loaded from: B1t.class */
public final class B1t extends 2Yv {
    public SpannableString A00;
    public String A01;
    public List A02;
    public boolean A03;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 == 0) {
            Context context = (Context) objArr[0];
            C1706Aqc c1706Aqc = (C1706Aqc) objArr[1];
            List list = (List) objArr[2];
            String str = (String) objArr[3];
            boolean A1Z = 7zO.A1Z(objArr, 4);
            11T.A0F(context, 4);
            1BL.A1G(c1706Aqc, list);
            11T.A0F(str, 7);
            this.A00 = CAN.A00(context, c1706Aqc, str, list, A1Z);
            this.A03 = A1Z;
            this.A02 = list;
            this.A01 = str;
        }
    }
}
