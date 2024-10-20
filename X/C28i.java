package X;

import java.io.Serializable;

/* renamed from: X.28i, reason: invalid class name */
/* loaded from: 28i.class */
public final class C28i extends C28j implements Serializable {
    public static final long serialVersionUID = 1;

    public static 24S A00(24S r301, Class cls) {
        24S A0D = r301.A0D(cls);
        if (A0D != null) {
            return A0D;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        1BL.A1C(cls, "Strange ", A0k);
        A0k.append(" sub-type, ");
        A0k.append(r301);
        throw AnonymousClass002.A0D(", can not find type parameters", A0k);
    }
}
