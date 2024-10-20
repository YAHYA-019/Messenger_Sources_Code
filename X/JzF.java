package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: JzF.class */
public class JzF extends Jyf implements Serializable {
    public static final Object A05 = C25d.NON_EMPTY;
    public static final long serialVersionUID = 1;
    public transient L2s A00;
    public transient Field A01;
    public transient Method A02;
    public transient HashMap A03;
    public final transient C24w A04;
    public final 24S _cfgSerializationType;
    public final 24S _declaredType;
    public final Class[] _includeInViews;
    public final AbstractC00953pX _member;
    public final 25K _name;
    public 24S _nonTrivialBaseType;
    public JsonSerializer _nullSerializer;
    public JsonSerializer _serializer;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public C4Nr _typeSerializer;
    public final C26G _wrapperName;

    public JzF() {
        super(C68N.A03);
        this._member = null;
        this.A04 = null;
        this._name = null;
        this._wrapperName = null;
        this._includeInViews = null;
        this._declaredType = null;
        this._serializer = null;
        this.A00 = null;
        this._typeSerializer = null;
        this._cfgSerializationType = null;
        this.A02 = null;
        this.A01 = null;
        this._suppressNulls = false;
        this._suppressableValue = null;
        this._nullSerializer = null;
    }

    public JzF(24S r302, 24S r303, JsonSerializer jsonSerializer, AbstractC00953pX abstractC00953pX, AnonymousClass687 anonymousClass687, C4Nr c4Nr, C24w c24w, Object obj, Class[] clsArr, boolean z) {
        super(anonymousClass687.A0C());
        this._member = abstractC00953pX;
        this.A04 = c24w;
        25M r0 = 25K.A01;
        this._name = new 25K(anonymousClass687.A0M());
        this._wrapperName = anonymousClass687.A0E();
        this._declaredType = r302;
        this._serializer = jsonSerializer;
        this.A00 = jsonSerializer == null ? JzI.A00 : null;
        this._typeSerializer = c4Nr;
        this._cfgSerializationType = r303;
        if (abstractC00953pX instanceof C67y) {
            this.A02 = null;
            this.A01 = (Field) abstractC00953pX.A0D();
        } else if (abstractC00953pX instanceof C68D) {
            this.A02 = (Method) abstractC00953pX.A0D();
            this.A01 = null;
        } else {
            this.A02 = null;
            this.A01 = null;
        }
        this._suppressNulls = z;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    public JzF(25K r302, JzF jzF) {
        super(jzF);
        this._name = r302;
        this._wrapperName = jzF._wrapperName;
        this._member = jzF._member;
        this.A04 = jzF.A04;
        this._declaredType = jzF._declaredType;
        this.A02 = jzF.A02;
        this.A01 = jzF.A01;
        this._serializer = jzF._serializer;
        this._nullSerializer = jzF._nullSerializer;
        HashMap hashMap = jzF.A03;
        if (hashMap != null) {
            this.A03 = DKC.A1C(hashMap);
        }
        this._cfgSerializationType = jzF._cfgSerializationType;
        this.A00 = jzF.A00;
        this._suppressNulls = jzF._suppressNulls;
        this._suppressableValue = jzF._suppressableValue;
        this._includeInViews = jzF._includeInViews;
        this._typeSerializer = jzF._typeSerializer;
        this._nonTrivialBaseType = jzF._nonTrivialBaseType;
    }

    public JzF(C26G c26g, JzF jzF) {
        super(jzF);
        this._name = new 25K(c26g._simpleName);
        this._wrapperName = jzF._wrapperName;
        this.A04 = jzF.A04;
        this._declaredType = jzF._declaredType;
        this._member = jzF._member;
        this.A02 = jzF.A02;
        this.A01 = jzF.A01;
        this._serializer = jzF._serializer;
        this._nullSerializer = jzF._nullSerializer;
        HashMap hashMap = jzF.A03;
        if (hashMap != null) {
            this.A03 = DKC.A1C(hashMap);
        }
        this._cfgSerializationType = jzF._cfgSerializationType;
        this.A00 = jzF.A00;
        this._suppressNulls = jzF._suppressNulls;
        this._suppressableValue = jzF._suppressableValue;
        this._includeInViews = jzF._includeInViews;
        this._typeSerializer = jzF._typeSerializer;
        this._nonTrivialBaseType = jzF._nonTrivialBaseType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        if (r0 != r304) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.JsonSerializer A00(X.C26c r301, X.JzF r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JzF.A00(X.26c, X.JzF, java.lang.Object):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public static boolean A01(JsonSerializer jsonSerializer, C26c c26c, Object obj, Object obj2) {
        return A05 == obj ? jsonSerializer.A0B(c26c, obj2) : obj.equals(obj2);
    }

    public JzF A02(L1J l1j) {
        if (this instanceof Jz3) {
            Jz3 jz3 = (Jz3) this;
            return new Jz3(new 25K(l1j.A00(jz3._name._value)), jz3, new Jzp(l1j, jz3._nameTransformer));
        }
        if (this instanceof Jz2) {
            Jz2 jz2 = (Jz2) this;
            return new Jz2(jz2._delegate.A02(l1j), jz2._view);
        }
        if (this instanceof Jz1) {
            Jz1 jz1 = (Jz1) this;
            return new Jz1(jz1._delegate.A02(l1j), jz1._views);
        }
        25K r0 = this._name;
        String A00 = l1j.A00(r0._value);
        if (DKG.A1a(r0, A00)) {
            return this;
        }
        C26G A002 = C26G.A00(A00);
        return this instanceof Jyz ? new JzF(A002, this) : new JzF(A002, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r312 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0124, code lost:
    
        if (r306 == X.C26I.A02) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        r307 = r0._nullSerializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        r0 = A00(r303, r0, r306);
        r0 = r0._suppressableValue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015e, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016f, code lost:
    
        if (A01(r0, r303, r0, r306) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0178, code lost:
    
        if (r306 != r304) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0188, code lost:
    
        if (r0.A07(r302, r0, r303) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018c, code lost:
    
        X.JQy.A1J(r302, r0, r303, r0._typeSerializer, r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        if (r306 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.28Q r302, X.C26c r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JzF.A03(X.28Q, X.26c, java.lang.Object):void");
    }

    public void A04(28Q r302, C26c c26c, Object obj) {
        Method method = this.A02;
        Object invoke = method == null ? this.A01.get(obj) : method.invoke(obj, null);
        if (invoke == null) {
            if (this._nullSerializer != null) {
                r302.A0i(this._name);
                this._nullSerializer.A0A(r302, c26c, null);
                return;
            }
            return;
        }
        JsonSerializer A00 = A00(c26c, this, invoke);
        Object obj2 = this._suppressableValue;
        if (obj2 == null || !A01(A00, c26c, obj2, invoke)) {
            if (invoke == obj && A07(r302, A00, c26c)) {
                return;
            }
            r302.A0i(this._name);
            JQy.A1J(r302, A00, c26c, this._typeSerializer, invoke);
        }
    }

    public void A05(JsonSerializer jsonSerializer) {
        JzF jzF;
        if (this instanceof Jz2) {
            jzF = ((Jz2) this)._delegate;
        } else {
            if (!(this instanceof Jz1)) {
                JsonSerializer jsonSerializer2 = this._nullSerializer;
                if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
                    throw JQy.A0k("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{27C.A07(jsonSerializer2), 27C.A07(jsonSerializer)});
                }
                this._nullSerializer = jsonSerializer;
                return;
            }
            jzF = ((Jz1) this)._delegate;
        }
        jzF.A05(jsonSerializer);
    }

    public void A06(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this._serializer;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw JQy.A0k("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{27C.A07(jsonSerializer2), 27C.A07(jsonSerializer)});
        }
        this._serializer = jsonSerializer;
    }

    public boolean A07(28Q r302, JsonSerializer jsonSerializer, C26c c26c) {
        if (jsonSerializer.A06()) {
            return false;
        }
        26D r0 = 26D.A03;
        C25p c25p = c26c._config;
        if (c25p.A0G(r0)) {
            if (!(jsonSerializer instanceof BeanSerializerBase)) {
                return false;
            }
            c26c.A0D(this._declaredType, "Direct self-reference leading to cycle");
            throw 0Q8.createAndThrow();
        }
        if (!c25p.A0G(26D.A0K)) {
            return false;
        }
        if (this._nullSerializer == null) {
            return true;
        }
        if (((3sX) r302.A0M()).A01 != 1) {
            r302.A0i(this._name);
        }
        this._nullSerializer.A0A(r302, c26c, null);
        return true;
    }

    public C26G Ang() {
        return new C26G(this._name._value, null);
    }

    public AbstractC00953pX AwU() {
        return this._member;
    }

    public 24S BHb() {
        return this._declaredType;
    }

    public String getName() {
        return this._name._value;
    }

    public Object readResolve() {
        AbstractC00953pX abstractC00953pX = this._member;
        if (abstractC00953pX instanceof C67y) {
            this.A02 = null;
            this.A01 = (Field) abstractC00953pX.A0D();
        } else if (abstractC00953pX instanceof C68D) {
            this.A02 = (Method) abstractC00953pX.A0D();
            this.A01 = null;
        }
        if (this._serializer == null) {
            this.A00 = JzI.A00;
        }
        return this;
    }

    public String toString() {
        String str;
        StringBuilder A0l = AnonymousClass001.A0l(40);
        A0l.append("property '");
        A0l.append(this._name._value);
        A0l.append("' (");
        Method method = this.A02;
        if (method != null) {
            A0l.append("via method ");
            JQz.A1I(method.getDeclaringClass(), A0l);
            A0l.append("#");
            str = this.A02.getName();
        } else {
            Field field = this.A01;
            if (field != null) {
                A0l.append("field \"");
                JQz.A1I(field.getDeclaringClass(), A0l);
                A0l.append("#");
                str = this.A01.getName();
            } else {
                str = "virtual";
            }
        }
        A0l.append(str);
        JsonSerializer jsonSerializer = this._serializer;
        return DKH.A0o(jsonSerializer == null ? ", no static serializer" : 0Pz.A0W(", static serializer of type ", AnonymousClass001.A0Y(jsonSerializer)), A0l);
    }
}
