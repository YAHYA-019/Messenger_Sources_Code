package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2ld, reason: invalid class name */
/* loaded from: 2ld.class */
public final class C2ld extends 2Yv {
    public static final C2le A01 = new Object();
    public final List A00;

    public C2ld(C2ld c2ld, Object obj) {
        ArrayList arrayList;
        if (c2ld != null) {
            arrayList = new ArrayList(c2ld.A00.size() + 1);
            arrayList.addAll(c2ld.A00);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(obj);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        11T.A0A(unmodifiableList);
        this.A00 = unmodifiableList;
    }

    public C2ld(C2ld c2ld, Object obj, int i) {
        ArrayList arrayList = new ArrayList(c2ld.A00);
        arrayList.set(i, obj);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        11T.A0A(unmodifiableList);
        this.A00 = unmodifiableList;
    }
}
