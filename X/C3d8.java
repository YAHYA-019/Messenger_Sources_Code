package X;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.3d8, reason: invalid class name */
/* loaded from: 3d8.class */
public final class C3d8 implements C27P, Serializable {
    public static final long serialVersionUID = 1;
    public HashMap _classMappings = null;

    @Override // X.C27P
    public KnN ASm(C26L c26l, 24S r303, AnonymousClass251 anonymousClass251) {
        HashMap hashMap = this._classMappings;
        if (hashMap == null) {
            return null;
        }
        return (KnN) hashMap.get(new Liw(r303._class));
    }
}
