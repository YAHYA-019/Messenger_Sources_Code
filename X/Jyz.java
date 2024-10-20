package X;

import com.google.common.base.Absent;
import java.lang.reflect.Method;

/* loaded from: Jyz.class */
public final class Jyz extends JzF {
    public static final long serialVersionUID = 1;

    @Override // X.JzF
    public void A04(28Q r302, C26c c26c, Object obj) {
        if (this._nullSerializer == null) {
            Method method = this.A02;
            Object invoke = method == null ? this.A01.get(obj) : method.invoke(obj, null);
            if (invoke == null || Absent.INSTANCE.equals(invoke)) {
                return;
            }
        }
        super.A04(r302, c26c, obj);
    }
}
