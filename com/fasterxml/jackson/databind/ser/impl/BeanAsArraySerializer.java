package com.fasterxml.jackson.databind.ser.impl;

import X.0Q8;
import X.28Q;
import X.C26c;
import X.C2cb;
import X.C42h;
import X.C4Nr;
import X.JQx;
import X.JR0;
import X.JzF;
import X.Kl7;
import X.Kls;
import X.L1J;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Set;

/* loaded from: BeanAsArraySerializer.class */
public class BeanAsArraySerializer extends BeanSerializerBase {
    public static final long serialVersionUID = 1;
    public final BeanSerializerBase _defaultSerializer;

    public BeanAsArraySerializer(Kl7 kl7, BeanSerializerBase beanSerializerBase, Object obj) {
        super(kl7, beanSerializerBase, obj);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super((Kl7) null, beanSerializerBase, beanSerializerBase._propertyFilterId);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set set, Set set2) {
        super(beanSerializerBase, set, set2);
        this._defaultSerializer = beanSerializerBase;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, X.2cc, X.2cb] */
    private final void A03(28Q r302, C26c c26c, Object obj) {
        JzF[] jzFArr = this._filteredProps;
        if (jzFArr == null || c26c._serializationView == null) {
            jzFArr = this._props;
        }
        int i = 0;
        try {
            int length = jzFArr.length;
            while (i < length) {
                JzF jzF = jzFArr[i];
                if (jzF == null) {
                    r302.A0Z();
                } else {
                    jzF.A03(r302, c26c, obj);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.A01(c26c, obj, jzFArr[i]._name._value, e);
            throw 0Q8.createAndThrow();
        } catch (StackOverflowError e2) {
            ?? c2cb = new C2cb(r302, "Infinite recursion (StackOverflowError)", e2);
            c2cb.A08(obj, jzFArr[i]._name._value);
            throw c2cb;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer A07(L1J l1j) {
        return this._defaultSerializer.A07(l1j);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        if (this._objectIdWriter != null) {
            A0G(r302, c26c, c4Nr, obj);
            return;
        }
        Kls A0E = A0E(C42h.A05, c4Nr, obj);
        c4Nr.A01(r302, A0E);
        r302.A0O(obj);
        A03(r302, c26c, obj);
        c4Nr.A02(r302, A0E);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(28Q r302, C26c c26c, Object obj) {
        if (JR0.A1T(c26c)) {
            JzF[] jzFArr = this._filteredProps;
            if (jzFArr == null || c26c._serializationView == null) {
                jzFArr = this._props;
            }
            if (jzFArr.length == 1) {
                A03(r302, c26c, obj);
                return;
            }
        }
        r302.A0l(obj);
        A03(r302, c26c, obj);
        r302.A0X();
    }

    public String toString() {
        return JQx.A0v(this._handledType, "BeanAsArraySerializer for ");
    }
}
