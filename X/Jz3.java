package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: Jz3.class */
public final class Jz3 extends JzF implements Serializable {
    public static final long serialVersionUID = 1;
    public final L1J _nameTransformer;

    public Jz3(25K r302, Jz3 jz3, L1J l1j) {
        super(r302, jz3);
        this._nameTransformer = l1j;
    }

    public Jz3(JzF jzF, L1J l1j) {
        super(jzF._name, jzF);
        this._nameTransformer = l1j;
    }

    @Override // X.JzF
    public void A04(28Q r302, C26c c26c, Object obj) {
        Method method = this.A02;
        Object invoke = method == null ? this.A01.get(obj) : method.invoke(obj, null);
        if (invoke != null) {
            JsonSerializer A00 = JzF.A00(c26c, this, invoke);
            Object obj2 = this._suppressableValue;
            if (obj2 == null || !JzF.A01(A00, c26c, obj2, invoke)) {
                if (invoke == obj && A07(r302, A00, c26c)) {
                    return;
                }
                if (!A00.A08()) {
                    r302.A0i(this._name);
                }
                JQy.A1J(r302, A00, c26c, this._typeSerializer, invoke);
            }
        }
    }

    @Override // X.JzF
    public void A06(JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            L1J l1j = this._nameTransformer;
            if (jsonSerializer.A08() && (jsonSerializer instanceof UnwrappingBeanSerializer)) {
                l1j = new Jzp(l1j, ((UnwrappingBeanSerializer) jsonSerializer)._nameTransformer);
            }
            jsonSerializer = jsonSerializer.A07(l1j);
        }
        super.A06(jsonSerializer);
    }
}
