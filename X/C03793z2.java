package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.3z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3z2.class */
public final class C03793z2 extends HashSet {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashSet, X.3z2] */
    public static C03793z2 A00(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Collections.addAll(hashSet, objArr);
        return new HashSet(hashSet);
    }
}
