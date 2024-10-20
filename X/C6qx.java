package X;

import android.content.Context;

/* renamed from: X.6qx, reason: invalid class name */
/* loaded from: 6qx.class */
public class C6qx implements C6qy {
    @Override // X.C6qy
    public boolean AbN() {
        return true;
    }

    @Override // X.C6qy
    public Integer Atc() {
        return null;
    }

    @Override // X.C6qy
    public /* synthetic */ int BBR(Context context, 6yO r303, C5fv c5fv) {
        11T.A0F(context, 1);
        11T.A0F(r303, 3);
        return r303.BBU(context);
    }

    @Override // X.C6qy
    public CharSequence BBT(5vW r302) {
        11T.A0F(r302, 0);
        C5fr c5fr = ((C5fu) ((5vV) r302).A00).A05;
        String str = c5fr.A08;
        String str2 = c5fr.A0A;
        if (str != null && !0CU.A0O(str)) {
            return str;
        }
        if (str2 != null && !0CU.A0O(str2)) {
            return str2;
        }
        String str3 = c5fr.A07;
        11T.A0A(str3);
        return str3;
    }

    @Override // X.C6qy
    public boolean BQh(5vW r302) {
        11T.A0F(r302, 0);
        5vV r0 = (5vV) r302;
        C5fv c5fv = r0.A00;
        if (((C5fu) c5fv).A0H || (c5fv instanceof 5gP)) {
            return false;
        }
        c5fv.AxW(5vC.A00);
        5vH r02 = r0.A01.A02;
        return (r02 == 5vH.A02 || r02 == 5vH.A05) && (0CU.A0O(BBT(r302)) ^ true);
    }
}
