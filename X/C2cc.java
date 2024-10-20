package X;

import java.util.LinkedList;

/* renamed from: X.2cc, reason: invalid class name */
/* loaded from: 2cc.class */
public abstract class C2cc extends 2LD {
    public static final long serialVersionUID = 3;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.68s, java.lang.Object] */
    public void A08(Object obj, String str) {
        C2cb c2cb = (C2cb) this;
        ?? obj2 = new Object();
        obj2._index = -1;
        obj2.A00 = obj;
        if (str == null) {
            throw AnonymousClass001.A0Q("Cannot pass null fieldName");
        }
        obj2._fieldName = str;
        LinkedList linkedList = c2cb._path;
        if (linkedList == null) {
            linkedList = new LinkedList();
            c2cb._path = linkedList;
        }
        if (linkedList.size() < 1000) {
            linkedList.addFirst(obj2);
        }
    }
}
