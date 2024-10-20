package com.fasterxml.jackson.databind.ser.std;

import X.1BL;
import X.28Q;
import X.68U;
import X.C26c;
import X.C27r;
import X.C42h;
import X.C4Nr;
import X.Kls;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;

/* loaded from: ArraySerializerBase.class */
public abstract class ArraySerializerBase extends ContainerSerializer implements C27r {
    public final 68U _property;
    public final Boolean _unwrapSingle;

    public ArraySerializerBase(68U r302, ArraySerializerBase arraySerializerBase, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = r302;
        this._unwrapSingle = bool;
    }

    public ArraySerializerBase(Class cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Kls A0Z = 1BL.A0Z(r302, C42h.A05, c4Nr, obj);
        r302.A0O(obj);
        if (this instanceof StdArraySerializers$IntArraySerializer) {
            for (int i : (int[]) obj) {
                r302.A0f(i);
            }
        } else if (this instanceof StdArraySerializers$ShortArraySerializer) {
            for (short s : (short[]) obj) {
                r302.A0f(s);
            }
        } else if (this instanceof StdArraySerializers$LongArraySerializer) {
            long[] jArr = (long[]) obj;
            int length = jArr.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                r302.A0g(jArr[i3]);
                i2 = i3 + 1;
            }
        } else if (this instanceof StdArraySerializers$FloatArraySerializer) {
            for (float f : (float[]) obj) {
                r302.A0e(f);
            }
        } else if (this instanceof StdArraySerializers$DoubleArraySerializer) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= length2) {
                    break;
                }
                r302.A0d(dArr[i5]);
                i4 = i5 + 1;
            }
        } else if (this instanceof StdArraySerializers$BooleanArraySerializer) {
            for (boolean z : (boolean[]) obj) {
                r302.A0v(z);
            }
        } else if (this instanceof ObjectArraySerializer) {
            ObjectArraySerializer.A03(r302, c26c, (ObjectArraySerializer) this, (Object[]) obj);
        } else {
            StringArraySerializer.A03(r302, c26c, (StringArraySerializer) this, (String[]) obj);
        }
        c4Nr.A02(r302, A0Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e8  */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
