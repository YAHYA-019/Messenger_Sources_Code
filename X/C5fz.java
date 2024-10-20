package X;

import com.facebook.graphql.enums.EnumHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5fz, reason: invalid class name */
/* loaded from: 5fz.class */
public final class C5fz implements C5g0 {
    @Override // X.C5g0
    public List AmB(C5fv c5fv) {
        String str;
        C6ne c6ne;
        int ordinal;
        ArrayList arrayList = new ArrayList();
        List A00 = C5g1.A00(c5fv);
        if (A00 == null || (str = (String) 0QD.A0E(A00)) == null || (c6ne = (C6ne) EnumHelper.A00(C6ne.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, str)) == null || !((ordinal = c6ne.ordinal()) == 1 || ordinal == 2)) {
            return arrayList;
        }
        arrayList.add(HCE.A0I);
        return arrayList;
    }
}
