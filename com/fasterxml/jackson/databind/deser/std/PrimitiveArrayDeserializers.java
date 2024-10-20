package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.2Go;
import X.2LE;
import X.4EJ;
import X.4WN;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C24e;
import X.C25h;
import X.C26G;
import X.C26O;
import X.C27T;
import X.C28h;
import X.C2cb;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C68h;
import X.C68k;
import X.Jzq;
import X.Jzr;
import X.Jzs;
import X.Jzt;
import X.Jzu;
import X.Jzv;
import X.Jzw;
import X.KuC;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Arrays;

/* loaded from: PrimitiveArrayDeserializers.class */
public abstract class PrimitiveArrayDeserializers extends StdDeserializer implements AnonymousClass437 {
    public transient Object A00;
    public final C42o _nuller;
    public final Boolean _unwrapSingle;

    /* loaded from: PrimitiveArrayDeserializers$BooleanDeser.class */
    public final class BooleanDeser extends PrimitiveArrayDeserializers {
        public static final long serialVersionUID = 1;

        public BooleanDeser() {
            super(boolean[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r306v2, types: [X.Jzq, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public boolean[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Object A02;
            boolean z;
            int i;
            if (abstractC01033pi.A1p()) {
                C28h A0S = c27t.A0S();
                Jzq jzq = A0S.A00;
                Jzq jzq2 = jzq;
                if (jzq == null) {
                    ?? obj = new Object();
                    A0S.A00 = obj;
                    jzq2 = obj;
                }
                boolean[] zArr = (boolean[]) jzq2.A00();
                int i2 = 0;
                while (true) {
                    try {
                        C42h A1K = abstractC01033pi.A1K();
                        if (A1K == C42h.A01) {
                            break;
                        }
                        try {
                            if (A1K == C42h.A0D) {
                                z = true;
                            } else {
                                if (A1K != C42h.A08) {
                                    if (A1K == C42h.A09) {
                                        C42o c42o = this._nuller;
                                        if (c42o != null) {
                                            c42o.Azd(c27t);
                                        } else {
                                            A0y(c27t);
                                        }
                                    } else {
                                        z = A10(abstractC01033pi, c27t);
                                    }
                                }
                                z = false;
                            }
                            zArr[i2] = z;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C2cb.A03(zArr, e, ((KuC) jzq2).A00 + i2);
                        }
                        if (i2 >= zArr.length) {
                            zArr = (boolean[]) jzq2.A03(zArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                A02 = jzq2.A02(zArr, i2);
            } else {
                A02 = A15(abstractC01033pi, c27t);
            }
            return (boolean[]) A02;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
            return new PrimitiveArrayDeserializers(c42o, this, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A13() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return new boolean[]{A10(abstractC01033pi, c27t)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A16(Object obj, Object obj2) {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    /* loaded from: PrimitiveArrayDeserializers$ByteDeser.class */
    public final class ByteDeser extends PrimitiveArrayDeserializers {
        public static final long serialVersionUID = 1;

        public ByteDeser() {
            super(byte[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v24, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r306v3, types: [X.Jzr, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public byte[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Object A02;
            byte A0z;
            int i;
            C42h A1I = abstractC01033pi.A1I();
            2LE r0 = A1I;
            if (r0 == C42h.A0C) {
                try {
                    r0 = abstractC01033pi.A1w(c27t._config._base._defaultBase64);
                    return r0;
                } catch (4EJ unused) {
                    String A06 = r0.A06();
                    if (A06.contains("base64")) {
                        c27t.A0l(byte[].class, abstractC01033pi.A1Z(), A06, new Object[0]);
                        throw 0Q8.createAndThrow();
                    }
                }
            }
            if (A1I == C42h.A07) {
                Object A1R = abstractC01033pi.A1R();
                if (A1R == null) {
                    return null;
                }
                if (A1R instanceof byte[]) {
                    A02 = (byte[]) A1R;
                    return (byte[]) A02;
                }
            }
            if (abstractC01033pi.A1p()) {
                C28h A0S = c27t.A0S();
                Jzr jzr = A0S.A01;
                Jzr jzr2 = jzr;
                if (jzr == null) {
                    ?? obj = new Object();
                    A0S.A01 = obj;
                    jzr2 = obj;
                }
                byte[] bArr = (byte[]) jzr2.A00();
                int i2 = 0;
                while (true) {
                    try {
                        C42h A1K = abstractC01033pi.A1K();
                        if (A1K == C42h.A01) {
                            break;
                        }
                        try {
                            if (A1K == C42h.A0B) {
                                A0z = abstractC01033pi.A0z();
                            } else if (A1K == C42h.A09) {
                                C42o c42o = this._nuller;
                                if (c42o != null) {
                                    c42o.Azd(c27t);
                                } else {
                                    A0y(c27t);
                                    A0z = 0;
                                }
                            } else {
                                A0z = A0X(abstractC01033pi, c27t);
                            }
                            bArr[i2] = A0z;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C2cb.A03(bArr, e, ((KuC) jzr2).A00 + i2);
                        }
                        if (i2 >= bArr.length) {
                            bArr = (byte[]) jzr2.A03(bArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                A02 = jzr2.A02(bArr, i2);
            } else {
                A02 = A15(abstractC01033pi, c27t);
            }
            return (byte[]) A02;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public C42x A0Q() {
            return C42x.Binary;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
            return new PrimitiveArrayDeserializers(c42o, this, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A13() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
            C42h A1I = abstractC01033pi.A1I();
            if (A1I == C42h.A0B) {
                return new byte[]{abstractC01033pi.A0z()};
            }
            if (A1I != C42h.A09) {
                c27t.A0Y(abstractC01033pi, this._valueClass.getComponentType());
                throw 0Q8.createAndThrow();
            }
            C42o c42o = this._nuller;
            if (c42o != null) {
                c42o.Azd(c27t);
                return A0U(c27t);
            }
            A0y(c27t);
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A16(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    /* loaded from: PrimitiveArrayDeserializers$CharDeser.class */
    public final class CharDeser extends PrimitiveArrayDeserializers {
        public static final long serialVersionUID = 1;

        public CharDeser() {
            super(char[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public char[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Class cls;
            String A06;
            String A1Z;
            C42h c42h = C42h.A0C;
            if (abstractC01033pi.A1u(c42h)) {
                char[] A1x = abstractC01033pi.A1x();
                int A17 = abstractC01033pi.A17();
                int A16 = abstractC01033pi.A16();
                char[] cArr = new char[A16];
                System.arraycopy(A1x, A17, cArr, 0, A16);
                return cArr;
            }
            if (abstractC01033pi.A1p()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    C42h A1K = abstractC01033pi.A1K();
                    if (A1K == C42h.A01) {
                        A06 = sb.toString();
                        break;
                    }
                    if (A1K != c42h) {
                        if (A1K != C42h.A09) {
                            cls = Character.TYPE;
                            break;
                        }
                        C42o c42o = this._nuller;
                        if (c42o != null) {
                            c42o.Azd(c27t);
                        } else {
                            A0y(c27t);
                            A1Z = "��";
                        }
                    } else {
                        A1Z = abstractC01033pi.A1Z();
                    }
                    int length = A1Z.length();
                    if (length != 1) {
                        c27t.A0e(this, "Cannot convert a JSON String of length %d into a char element of char array", AnonymousClass001.A1a(length));
                        break;
                    }
                    sb.append(A1Z.charAt(0));
                }
            } else {
                if (abstractC01033pi.A1u(C42h.A07)) {
                    Object A1R = abstractC01033pi.A1R();
                    if (A1R == null) {
                        return null;
                    }
                    if (A1R instanceof char[]) {
                        return (char[]) A1R;
                    }
                    if (A1R instanceof String) {
                        A06 = (String) A1R;
                    } else if (A1R instanceof byte[]) {
                        A06 = C24e.A01.A06((byte[]) A1R);
                    }
                    return A06.toCharArray();
                }
                cls = this._valueClass;
                c27t.A0Y(abstractC01033pi, cls);
            }
            throw 0Q8.createAndThrow();
        }
    }

    /* loaded from: PrimitiveArrayDeserializers$DoubleDeser.class */
    public final class DoubleDeser extends PrimitiveArrayDeserializers {
        public static final long serialVersionUID = 1;

        public DoubleDeser() {
            super(double[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r306v2, types: [X.Jzs, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public double[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Object A02;
            double A0Y;
            int i;
            if (abstractC01033pi.A1p()) {
                C28h A0S = c27t.A0S();
                Jzs jzs = A0S.A02;
                Jzs jzs2 = jzs;
                if (jzs == null) {
                    ?? obj = new Object();
                    A0S.A02 = obj;
                    jzs2 = obj;
                }
                double[] dArr = (double[]) jzs2.A00();
                int i2 = 0;
                while (true) {
                    try {
                        C42h A1K = abstractC01033pi.A1K();
                        if (A1K == C42h.A01) {
                            break;
                        }
                        try {
                            if (A1K == C42h.A09) {
                                C42o c42o = this._nuller;
                                if (c42o != null) {
                                    c42o.Azd(c27t);
                                }
                            }
                            dArr[i2] = A0Y;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C2cb.A03(dArr, e, ((KuC) jzs2).A00 + i2);
                        }
                        A0Y = A0Y(abstractC01033pi, c27t);
                        if (i2 >= dArr.length) {
                            dArr = (double[]) jzs2.A03(dArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                A02 = jzs2.A02(dArr, i2);
            } else {
                A02 = A15(abstractC01033pi, c27t);
            }
            return (double[]) A02;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
            return new PrimitiveArrayDeserializers(c42o, this, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A13() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return new double[]{A0Y(abstractC01033pi, c27t)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A16(Object obj, Object obj2) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    /* loaded from: PrimitiveArrayDeserializers$FloatDeser.class */
    public final class FloatDeser extends PrimitiveArrayDeserializers {
        public static final long serialVersionUID = 1;

        public FloatDeser() {
            super(float[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r306v2, types: [X.Jzt, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public float[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Object A02;
            float A0Z;
            int i;
            if (abstractC01033pi.A1p()) {
                C28h A0S = c27t.A0S();
                Jzt jzt = A0S.A03;
                Jzt jzt2 = jzt;
                if (jzt == null) {
                    ?? obj = new Object();
                    A0S.A03 = obj;
                    jzt2 = obj;
                }
                float[] fArr = (float[]) jzt2.A00();
                int i2 = 0;
                while (true) {
                    try {
                        C42h A1K = abstractC01033pi.A1K();
                        if (A1K == C42h.A01) {
                            break;
                        }
                        try {
                            if (A1K == C42h.A09) {
                                C42o c42o = this._nuller;
                                if (c42o != null) {
                                    c42o.Azd(c27t);
                                }
                            }
                            fArr[i2] = A0Z;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C2cb.A03(fArr, e, ((KuC) jzt2).A00 + i2);
                        }
                        A0Z = A0Z(abstractC01033pi, c27t);
                        if (i2 >= fArr.length) {
                            fArr = (float[]) jzt2.A03(fArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                A02 = jzt2.A02(fArr, i2);
            } else {
                A02 = A15(abstractC01033pi, c27t);
            }
            return (float[]) A02;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
            return new PrimitiveArrayDeserializers(c42o, this, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A13() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return new float[]{A0Z(abstractC01033pi, c27t)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A16(Object obj, Object obj2) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    /* loaded from: PrimitiveArrayDeserializers$IntDeser.class */
    public final class IntDeser extends PrimitiveArrayDeserializers {
        public static final IntDeser A00 = new IntDeser();
        public static final long serialVersionUID = 1;

        public IntDeser() {
            super(int[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r306v2, types: [X.Jzu, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public int[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Object A02;
            int A15;
            int i;
            if (abstractC01033pi.A1p()) {
                C28h A0S = c27t.A0S();
                Jzu jzu = A0S.A04;
                Jzu jzu2 = jzu;
                if (jzu == null) {
                    ?? obj = new Object();
                    A0S.A04 = obj;
                    jzu2 = obj;
                }
                int[] iArr = (int[]) jzu2.A00();
                int i2 = 0;
                while (true) {
                    try {
                        C42h A1K = abstractC01033pi.A1K();
                        if (A1K == C42h.A01) {
                            break;
                        }
                        try {
                            if (A1K == C42h.A0B) {
                                A15 = abstractC01033pi.A15();
                            } else if (A1K == C42h.A09) {
                                C42o c42o = this._nuller;
                                if (c42o != null) {
                                    c42o.Azd(c27t);
                                } else {
                                    A0y(c27t);
                                    A15 = 0;
                                }
                            } else {
                                A15 = A0a(abstractC01033pi, c27t);
                            }
                            iArr[i2] = A15;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C2cb.A03(iArr, e, ((KuC) jzu2).A00 + i2);
                        }
                        if (i2 >= iArr.length) {
                            iArr = (int[]) jzu2.A03(iArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                A02 = jzu2.A02(iArr, i2);
            } else {
                A02 = A15(abstractC01033pi, c27t);
            }
            return (int[]) A02;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
            return new PrimitiveArrayDeserializers(c42o, this, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A13() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return new int[]{A0a(abstractC01033pi, c27t)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A16(Object obj, Object obj2) {
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    /* loaded from: PrimitiveArrayDeserializers$LongDeser.class */
    public final class LongDeser extends PrimitiveArrayDeserializers {
        public static final LongDeser A00 = new LongDeser();
        public static final long serialVersionUID = 1;

        public LongDeser() {
            super(long[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r306v2, types: [java.lang.Object, X.Jzv] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public long[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Object A02;
            long A1A;
            int i;
            if (abstractC01033pi.A1p()) {
                C28h A0S = c27t.A0S();
                Jzv jzv = A0S.A05;
                Jzv jzv2 = jzv;
                if (jzv == null) {
                    ?? obj = new Object();
                    A0S.A05 = obj;
                    jzv2 = obj;
                }
                long[] jArr = (long[]) jzv2.A00();
                int i2 = 0;
                while (true) {
                    try {
                        C42h A1K = abstractC01033pi.A1K();
                        if (A1K == C42h.A01) {
                            break;
                        }
                        try {
                            if (A1K == C42h.A0B) {
                                A1A = abstractC01033pi.A1A();
                            } else if (A1K == C42h.A09) {
                                C42o c42o = this._nuller;
                                if (c42o != null) {
                                    c42o.Azd(c27t);
                                } else {
                                    A0y(c27t);
                                    A1A = 0;
                                }
                            } else {
                                A1A = A0b(abstractC01033pi, c27t);
                            }
                            jArr[i2] = A1A;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C2cb.A03(jArr, e, ((KuC) jzv2).A00 + i2);
                        }
                        if (i2 >= jArr.length) {
                            jArr = (long[]) jzv2.A03(jArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                A02 = jzv2.A02(jArr, i2);
            } else {
                A02 = A15(abstractC01033pi, c27t);
            }
            return (long[]) A02;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
            return new PrimitiveArrayDeserializers(c42o, this, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A13() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return new long[]{A0b(abstractC01033pi, c27t)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A16(Object obj, Object obj2) {
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    /* loaded from: PrimitiveArrayDeserializers$ShortDeser.class */
    public final class ShortDeser extends PrimitiveArrayDeserializers {
        public static final long serialVersionUID = 1;

        public ShortDeser() {
            super(short[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r306v2, types: [java.lang.Object, X.Jzw] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public short[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Object A02;
            short A0v;
            int i;
            if (abstractC01033pi.A1p()) {
                C28h A0S = c27t.A0S();
                Jzw jzw = A0S.A06;
                Jzw jzw2 = jzw;
                if (jzw == null) {
                    ?? obj = new Object();
                    A0S.A06 = obj;
                    jzw2 = obj;
                }
                short[] sArr = (short[]) jzw2.A00();
                int i2 = 0;
                while (true) {
                    try {
                        C42h A1K = abstractC01033pi.A1K();
                        if (A1K == C42h.A01) {
                            break;
                        }
                        try {
                            if (A1K == C42h.A09) {
                                C42o c42o = this._nuller;
                                if (c42o != null) {
                                    c42o.Azd(c27t);
                                } else {
                                    A0y(c27t);
                                    A0v = 0;
                                }
                            } else {
                                A0v = A0v(abstractC01033pi, c27t);
                            }
                            sArr[i2] = A0v;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C2cb.A03(sArr, e, ((KuC) jzw2).A00 + i2);
                        }
                        if (i2 >= sArr.length) {
                            sArr = (short[]) jzw2.A03(sArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                A02 = jzw2.A02(sArr, i2);
            } else {
                A02 = A15(abstractC01033pi, c27t);
            }
            return (short[]) A02;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
            return new PrimitiveArrayDeserializers(c42o, this, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A13() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return new short[]{A0v(abstractC01033pi, c27t)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public /* bridge */ /* synthetic */ Object A16(Object obj, Object obj2) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = (short[]) obj2;
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }
    }

    public PrimitiveArrayDeserializers(C42o c42o, PrimitiveArrayDeserializers primitiveArrayDeserializers, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = c42o;
    }

    public PrimitiveArrayDeserializers(Class cls) {
        super(cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public PrimitiveArrayDeserializers A12(C42o c42o, Boolean bool) {
        return this;
    }

    public Object A13() {
        return new char[0];
    }

    public Object A14(AbstractC01033pi abstractC01033pi, C27T c27t) {
        c27t.A0Y(abstractC01033pi, this._valueClass);
        throw 0Q8.createAndThrow();
    }

    public Object A15(AbstractC01033pi abstractC01033pi, C27T c27t) {
        if (abstractC01033pi.A1u(C42h.A0C)) {
            return A0q(abstractC01033pi, c27t);
        }
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && c27t.A0p(C26O.A04))) {
            return A14(abstractC01033pi, c27t);
        }
        c27t.A0Y(abstractC01033pi, this._valueClass);
        throw 0Q8.createAndThrow();
    }

    public Object A16(Object obj, Object obj2) {
        char[] cArr = (char[]) obj;
        char[] cArr2 = (char[]) obj2;
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        4WN r307;
        24S A05;
        C26G Ang;
        Boolean A0j = A0j(C68k.A01, r302, c27t, this._valueClass);
        C25h c25h = r302 != null ? r302.AxX()._contentNulls : c27t._config._configOverrides._defaultSetterInfo._contentNulls;
        if (c25h == C25h.SKIP) {
            r307 = C68h.A01;
        } else if (c25h == C25h.FAIL) {
            if (r302 == null) {
                A05 = c27t.A0F(this._valueClass.getComponentType());
                Ang = null;
            } else {
                A05 = r302.BHb().A05();
                Ang = r302.Ang();
            }
            r307 = new 4WN(A05, Ang);
        } else {
            r307 = null;
        }
        return (2Go.A00(A0j, this._unwrapSingle) && r307 == this._nuller) ? this : A12(r307, A0j);
    }
}
