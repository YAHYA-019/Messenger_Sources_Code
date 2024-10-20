package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* loaded from: Jz2.class */
public final class Jz2 extends JzF implements Serializable {
    public static final long serialVersionUID = 1;
    public final JzF _delegate;
    public final Class _view;

    public Jz2(JzF jzF, Class cls) {
        super(jzF._name, jzF);
        this._delegate = jzF;
        this._view = cls;
    }

    @Override // X.JzF
    public void A04(28Q r302, C26c c26c, Object obj) {
        Class<?> cls = c26c._serializationView;
        if (cls == null || this._view.isAssignableFrom(cls)) {
            this._delegate.A04(r302, c26c, obj);
        } else {
            C27Z c27z = 28Q.A01;
        }
    }

    @Override // X.JzF
    public void A06(JsonSerializer jsonSerializer) {
        this._delegate.A06(jsonSerializer);
    }
}
