package X;

import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.2sf, reason: invalid class name */
/* loaded from: 2sf.class */
public final class C2sf implements Function {
    public final /* synthetic */ 2sZ A00;
    public final /* synthetic */ C2sb A01;
    public final /* synthetic */ ImmutableList A02;

    public C2sf(2sZ r302, C2sb c2sb, ImmutableList immutableList) {
        this.A01 = c2sb;
        this.A00 = r302;
        this.A02 = immutableList;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        ImmutableList immutableList = (ImmutableList) obj;
        ImmutableList immutableList2 = this.A02;
        11T.A0D(immutableList2);
        if (immutableList != null) {
            if (!immutableList2.isEmpty()) {
                int A00 = 02J.A00(C1A3.A1D(immutableList, 10));
                if (A00 < 16) {
                    A00 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A00);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((User) next).A13, next);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = immutableList2.iterator();
                while (it2.hasNext()) {
                    Object obj2 = linkedHashMap.get(((UserKey) it2.next()).id);
                    if (obj2 != null) {
                        arrayList.add(obj2);
                    }
                }
                immutableList = ImmutableList.copyOf((Collection) arrayList);
            }
            return new C2sg(immutableList);
        }
        immutableList = ImmutableList.of();
        11T.A0A(immutableList);
        return new C2sg(immutableList);
    }
}
