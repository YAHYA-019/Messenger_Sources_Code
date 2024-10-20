package com.google.gson.reflect;

import X.0Pz;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKC;
import X.JQz;
import X.LDK;
import X.Lrm;
import X.Lrq;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/* loaded from: TypeToken.class */
public class TypeToken {
    public final int hashCode;
    public final Class rawType;
    public final Type type;

    public TypeToken() {
        Type typeTokenTypeArgument = getTypeTokenTypeArgument();
        this.type = typeTokenTypeArgument;
        this.rawType = LDK.A00(typeTokenTypeArgument);
        this.hashCode = typeTokenTypeArgument.hashCode();
    }

    public TypeToken(Type type) {
        type.getClass();
        Type A04 = LDK.A04(type);
        this.type = A04;
        this.rawType = LDK.A00(A04);
        this.hashCode = A04.hashCode();
    }

    public static AssertionError buildUnexpectedTypeError(Type type, Class... clsArr) {
        StringBuilder A0o = AnonymousClass001.A0o("Unexpected type. Expected one of: ");
        int length = clsArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A0o.append("but got: ");
                A0o.append(AnonymousClass001.A0Y(type));
                A0o.append(", for type token: ");
                1BK.A1R(A0o, type);
                return AnonymousClass001.A0J(AnonymousClass001.A0g(A0o, '.'));
            }
            JQz.A1I(clsArr[i2], A0o);
            AnonymousClass001.A1H(A0o);
            i = i2 + 1;
        }
    }

    public static TypeToken get(Class cls) {
        return new TypeToken(cls);
    }

    public static TypeToken get(Type type) {
        return new TypeToken(type);
    }

    public static TypeToken getArray(Type type) {
        return new TypeToken(new Lrm(type));
    }

    public static TypeToken getParameterized(Type type, Type... typeArr) {
        type.getClass();
        typeArr.getClass();
        if (!(type instanceof Class)) {
            throw AnonymousClass002.A0C(type, "rawType must be of type Class, but was ", AnonymousClass001.A0k());
        }
        Class cls = (Class) type;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw AnonymousClass001.A0L(0Pz.A0p(cls.getName(), " requires ", " type arguments, but got ", length, length2));
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return new TypeToken(new Lrq(null, type, typeArr));
            }
            Type type2 = typeArr[i2];
            Class<?> A00 = LDK.A00(type2);
            TypeVariable typeVariable = typeParameters[i2];
            for (Type type3 : typeVariable.getBounds()) {
                if (!LDK.A00(type3).isAssignableFrom(A00)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Type argument ");
                    A0k.append(type2);
                    A0k.append(" does not satisfy bounds for type variable ");
                    A0k.append(typeVariable);
                    throw AnonymousClass002.A0C(type, " declared by ", A0k);
                }
            }
            i = i2 + 1;
        }
    }

    private Type getTypeTokenTypeArgument() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                return LDK.A04(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw AnonymousClass001.A0N("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw AnonymousClass001.A0N("Must only create direct subclasses of TypeToken");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r301v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r301v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r301v2 */
    /* JADX WARN: Type inference failed for: r301v3 */
    public static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            Class<?> cls = (Class) type;
            while (true) {
                type = cls;
                if (!type.isArray()) {
                    break;
                }
                cls = type.getComponentType();
            }
        }
        return isAssignableFrom(type, (ParameterizedType) genericComponentType, AnonymousClass001.A0u());
    }

    public static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map map) {
        ParameterizedType parameterizedType2;
        if (type == null) {
            return false;
        }
        if (!parameterizedType.equals(type)) {
            Class A00 = LDK.A00(type);
            if ((type instanceof ParameterizedType) && (parameterizedType2 = (ParameterizedType) type) != null) {
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                TypeVariable[] typeParameters = A00.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    Type type2 = actualTypeArguments[i];
                    TypeVariable typeVariable = typeParameters[i];
                    while (type2 instanceof TypeVariable) {
                        type2 = (Type) map.get(((TypeVariable) type2).getName());
                    }
                    map.put(typeVariable.getName(), type2);
                }
                if (typeEquals(parameterizedType2, parameterizedType, map)) {
                    return true;
                }
            }
            for (Type type3 : A00.getGenericInterfaces()) {
                if (!isAssignableFrom(type3, parameterizedType, DKC.A1C(map))) {
                }
            }
            return isAssignableFrom(A00.getGenericSuperclass(), parameterizedType, DKC.A1C(map));
        }
        return true;
    }

    public static boolean matches(Type type, Type type2, Map map) {
        if (type2.equals(type)) {
            return true;
        }
        return (type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()));
    }

    public static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map map) {
        boolean z = false;
        if (parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= actualTypeArguments.length) {
                    z = true;
                    break;
                }
                if (!matches(actualTypeArguments[i2], actualTypeArguments2[i2], map)) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (X.LDK.A06(r301.type, ((com.google.gson.reflect.TypeToken) r302).type) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.google.gson.reflect.TypeToken
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r301
            java.lang.reflect.Type r0 = r0.type
            r304 = r0
            r0 = r302
            com.google.gson.reflect.TypeToken r0 = (com.google.gson.reflect.TypeToken) r0
            r302 = r0
            r0 = r302
            java.lang.reflect.Type r0 = r0.type
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.LDK.A06(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L2d
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L2d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.reflect.TypeToken.equals(java.lang.Object):boolean");
    }

    public final Class getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public boolean isAssignableFrom(TypeToken typeToken) {
        return isAssignableFrom(typeToken.type);
    }

    public boolean isAssignableFrom(Class cls) {
        return isAssignableFrom((Type) cls);
    }

    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        boolean z = true;
        if (!this.type.equals(type)) {
            Type type2 = this.type;
            if (!(type2 instanceof Class)) {
                if (type2 instanceof ParameterizedType) {
                    return isAssignableFrom(type, (ParameterizedType) type2, AnonymousClass001.A0u());
                }
                if (type2 instanceof GenericArrayType) {
                    return this.rawType.isAssignableFrom(LDK.A00(type)) && isAssignableFrom(type, (GenericArrayType) this.type);
                }
                throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
            }
            z = this.rawType.isAssignableFrom(LDK.A00(type));
        }
        return z;
    }

    public final String toString() {
        return LDK.A01(this.type);
    }
}
