package com.fasterxml.jackson.databind.deser.std;

import X.0Pz;
import X.0Q8;
import X.0S2;
import X.AbstractC01033pi;
import X.C25m;
import X.C27T;
import X.C42x;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: NumberDeserializers$CharacterDeserializer.class */
public class NumberDeserializers$CharacterDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$CharacterDeserializer A00;
    public static final NumberDeserializers$CharacterDeserializer A01;
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer] */
    static {
        Class cls = Character.TYPE;
        C42x c42x = C42x.Integer;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, cls, (char) 0, (char) 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, Character.class, null, (char) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Character A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0p;
        char charAt;
        int A14 = abstractC01033pi.A14();
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 == 6) {
                        String A1Z = abstractC01033pi.A1Z();
                        if (A1Z.length() == 1) {
                            charAt = A1Z.charAt(0);
                            return Character.valueOf(charAt);
                        }
                        C25m A0g = A0g(c27t, A1Z);
                        if (A0g != C25m.AsNull) {
                            if (A0g != C25m.AsEmpty) {
                                String trim = A1Z.trim();
                                if (!A11(c27t, trim)) {
                                    c27t.A0l(A0S(), trim, "Expected either Integer value code or 1-character String", new Object[0]);
                                }
                            }
                            A0p = this._emptyValue;
                        }
                    } else if (A14 != 7) {
                        JsonDeserializer.A05(abstractC01033pi, c27t, this);
                    } else {
                        C25m A0O = c27t.A0O(this._logicalType, this._valueClass, 0S2.A0C);
                        int ordinal = A0O.ordinal();
                        if (ordinal == 0) {
                            A0z(c27t, A0O, this._valueClass, abstractC01033pi.A1P(), 0Pz.A0j("Integer value (", abstractC01033pi.A1Z(), ")"));
                        } else if (ordinal != 2) {
                            if (ordinal != 3) {
                                int A15 = abstractC01033pi.A15();
                                if (A15 >= 0 && A15 <= ((char) (-1))) {
                                    charAt = (char) A15;
                                    return Character.valueOf(charAt);
                                }
                                c27t.A0j(A0S(), Integer.valueOf(A15), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                            }
                            A0p = this._emptyValue;
                        }
                    }
                } else if (this._primitive) {
                    A0y(c27t);
                }
                A0p = Azd(c27t);
            } else {
                A0p = A0p(abstractC01033pi, c27t);
            }
            return (Character) A0p;
        }
        c27t.A0Y(abstractC01033pi, this._valueClass);
        throw 0Q8.createAndThrow();
    }
}
