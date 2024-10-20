package X;

import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.1ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1ao.class */
public final class C00291ao implements InterfaceC00301ap {
    public final AnonymousClass042 A00;

    public C00291ao(AnonymousClass042 anonymousClass042) {
        this.A00 = anonymousClass042;
    }

    public static void A00(ObjectOutputStream objectOutputStream, LinkedHashMap linkedHashMap) {
        if (linkedHashMap == null) {
            objectOutputStream.writeShort(0);
            return;
        }
        objectOutputStream.writeShort(linkedHashMap.size());
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeUTF((String) it.next());
        }
    }

    @Override // X.InterfaceC00301ap
    public int ASf(int i, String str) {
        int i2;
        Number number;
        C00221ag c00221ag = (C00221ag) this.A00.get(i);
        if (c00221ag == null) {
            i2 = -1;
        } else {
            LinkedHashMap linkedHashMap = c00221ag.A00;
            i2 = -1;
            if (linkedHashMap != null && (number = (Number) linkedHashMap.get(str)) != null) {
                return number.intValue();
            }
        }
        return i2;
    }

    @Override // X.InterfaceC00301ap
    public boolean BU7(int i) {
        boolean z = false;
        if (this.A00.get(i) != null) {
            z = true;
        }
        return z;
    }
}
