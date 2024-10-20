package X;

import java.util.List;

/* renamed from: X.5v7, reason: invalid class name */
/* loaded from: 5v7.class */
public abstract /* synthetic */ class C5v7 {
    public static 5vH A00(5jE r301, List list, int i) {
        if (i < list.size()) {
            return r301.AoM((C5fv) 0QD.A0J(list, i + 1), (C5fv) list.get(i), (C5fv) 0QD.A0J(list, i - 1));
        }
        throw AnonymousClass001.A0L("Failed requirement.");
    }
}
