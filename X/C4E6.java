package X;

import com.facebook.acra.util.JavaProcFileReader;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.TypeVariable;

/* renamed from: X.4E6, reason: invalid class name */
/* loaded from: 4E6.class */
public final class C4E6 extends C4E7 {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.4E6, X.4E7] */
    public static C4E6 A00(24S r301, 24S r302) {
        TypeVariable[] typeParameters = ImmutableMap.class.getTypeParameters();
        return new C4E7(ImmutableMap.class.getSuperclass() == null ? null : 24R.A03, r301, r302, (typeParameters == null || typeParameters.length != 2) ? 24W.A00 : 24W.A00(r301, r302, ImmutableMap.class), ImmutableMap.class, null, null, null, false);
    }

    @Override // X.C4E7
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[map type; class ");
        sb.append(((24S) this)._class.getName());
        sb.append(", ");
        sb.append(this._keyType);
        sb.append(JavaProcFileReader.LS_SYMLINK_ARROW);
        sb.append(this._valueType);
        sb.append("]");
        return sb.toString();
    }
}
