package X;

import java.lang.reflect.Method;

/* loaded from: JxX.class */
public final class JxX extends JxY {
    public static final long serialVersionUID = 1;
    public final JzF _property;

    public JxX(JzF jzF, Class cls) {
        super(cls);
        this._property = jzF;
    }

    public 3eQ A00(Class cls) {
        return cls == this._scope ? this : new JxX(this._property, cls);
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x004e: THROW (r0 I:java.lang.Throwable), block:B:14:0x004e */
    public Object A01(Object obj) {
        Throwable th;
        try {
            JzF jzF = this._property;
            Method method = jzF.A02;
            return method == null ? jzF.A01.get(obj) : method.invoke(obj, null);
        } catch (RuntimeException unused) {
            throw th;
        } catch (Exception e) {
            throw new IllegalStateException(0Pz.A0v("Problem accessing property '", this._property._name._value, "': ", e.getMessage()), e);
        }
    }
}
