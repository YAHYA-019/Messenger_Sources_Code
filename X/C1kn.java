package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1kn, reason: invalid class name */
/* loaded from: 1kn.class */
public class C1kn implements C1ko, Serializable {
    public static final long serialVersionUID = 1;
    public final 1kN localCache;

    public C1kn(1kN r302) {
        this.localCache = r302;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    @Override // X.C1ko
    public ConcurrentMap AAL() {
        return this.localCache;
    }

    @Override // X.C1ko
    public Object Apt(Object obj) {
        1kN r0 = this.localCache;
        obj.getClass();
        int A00 = 1kN.A00(r0, obj);
        return 1kN.A01(r0, A00).A0N(obj, A00);
    }

    @Override // X.C1ko
    public void BPu(Object obj) {
        obj.getClass();
        this.localCache.remove(obj);
    }

    @Override // X.C1ko
    public void BPw() {
        this.localCache.clear();
    }

    @Override // X.C1ko
    public void CZv(Object obj, Object obj2) {
        this.localCache.put(obj, obj2);
    }

    public Object writeReplace() {
        return new 3CK(this.localCache);
    }
}
