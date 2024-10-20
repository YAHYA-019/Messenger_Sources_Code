package X;

import com.facebook.user.model.User;
import com.facebook.user.model.UserEmailAddress;
import com.facebook.user.model.UserIdentifier;
import com.facebook.user.model.UserPhoneNumber;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: Czw.class */
public final class Czw implements DGM {
    public C15h A00 = new DBO(23);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r302v2 */
    /* JADX WARN: Type inference failed for: r302v3 */
    /* JADX WARN: Type inference failed for: r302v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r314v0 */
    /* JADX WARN: Type inference failed for: r314v1 */
    /* JADX WARN: Type inference failed for: r314v2, types: [java.util.AbstractCollection] */
    public Function1 CZh() {
        Object obj;
        Object obj2;
        String id;
        ARW arw = DDh.A00;
        User A0x = AbF.A0x(this.A00);
        if (A0x != null) {
            String str = A0x.A13;
            C04t c04t = (str == null || str.length() < 5) ? null : new C04t(0Pz.A0j("(^|[^0-9])", str, "($|[^0-9])"));
            UserIdentifier userIdentifier = A0x.A0i;
            C04t c04t2 = (userIdentifier == null || (id = userIdentifier.getId()) == null || id.length() < 5) ? null : new C04t(0Pz.A0j("(^|[^0-9])", id, "($|[^0-9])"));
            String str2 = A0x.A1N;
            C04t c04t3 = (str2 == null || str2.length() < 4) ? null : new C04t(0Pz.A0j("(^|[^\\w])", str2, "($|[^\\w])"));
            ImmutableList immutableList = A0x.A0r;
            if (7zM.A1b(immutableList)) {
                obj = C1A3.A1E(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    String str3 = ((UserEmailAddress) it.next()).A00;
                    11T.A0A(str3);
                    obj.add(str3);
                }
            } else {
                obj = C0ty.A00;
            }
            11T.A0F(obj, 0);
            C04t c04t4 = 1BK.A1Y(obj) ? new C04t(0Pz.A0j("(^|[^\\w])(", 4YV.A0t("|", obj, (Function1) null), ")($|[^\\w])")) : null;
            A0x.A05();
            if (A0x.A05().isEmpty()) {
                obj2 = C0ty.A00;
            } else {
                ImmutableList A05 = A0x.A05();
                obj2 = C1A3.A1E(A05);
                Iterator it2 = A05.iterator();
                while (it2.hasNext()) {
                    obj2.add(((UserPhoneNumber) it2.next()).A04);
                }
            }
            arw = new ARW(14, c04t2, c04t4, c04t, obj2, c04t3);
        }
        return arw;
    }
}
