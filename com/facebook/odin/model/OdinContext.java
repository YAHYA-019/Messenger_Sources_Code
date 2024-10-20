package com.facebook.odin.model;

import X.11T;
import X.1BK;
import X.5Yu;
import X.5ZL;
import X.5ZP;
import X.5ZR;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.JR0;
import X.Lv6;
import X.LvM;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: OdinContext.class */
public final class OdinContext extends C04v {
    public static final 5Yu[] A05;
    public static final OdinContext A06;
    public static final Companion Companion = new Object();
    public final Type A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    /* loaded from: OdinContext$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return OdinContext$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.odin.model.OdinContext$Companion, java.lang.Object] */
    static {
        5Yu A00 = LvM.A00("com.facebook.odin.model.Type", Type.values());
        5ZL r0 = 5ZL.A01;
        A05 = new 5Yu[]{null, A00, new 5ZR(r0, 5ZP.A00), new 5ZR(r0, Lv6.A00), new 5ZR(r0, r0)};
        A06 = new OdinContext("identity", 30);
    }

    public OdinContext() {
        this(null, 31);
    }

    public /* synthetic */ OdinContext(Type type, String str, Map map, Map map2, Map map3, int i) {
        this.A01 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A00 = Type.A0C;
        } else {
            this.A00 = type;
        }
        if ((i & 4) == 0) {
            this.A03 = 1BK.A1C();
        } else {
            this.A03 = map;
        }
        if ((i & 8) == 0) {
            this.A02 = 1BK.A1C();
        } else {
            this.A02 = map2;
        }
        if ((i & 16) == 0) {
            this.A04 = 1BK.A1C();
        } else {
            this.A04 = map3;
        }
    }

    public /* synthetic */ OdinContext(String str, int i) {
        Type type = null;
        LinkedHashMap linkedHashMap = null;
        LinkedHashMap linkedHashMap2 = null;
        LinkedHashMap linkedHashMap3 = null;
        str = (i & 1) != 0 ? "" : str;
        type = (i & 2) != 0 ? Type.A0C : type;
        linkedHashMap = (i & 4) != 0 ? 1BK.A1C() : linkedHashMap;
        linkedHashMap2 = (i & 8) != 0 ? 1BK.A1C() : linkedHashMap2;
        linkedHashMap3 = (i & 16) != 0 ? 1BK.A1C() : linkedHashMap3;
        7zT.A1W(str, type, linkedHashMap, linkedHashMap2);
        11T.A0F(linkedHashMap3, 5);
        this.A01 = str;
        this.A00 = type;
        this.A03 = linkedHashMap;
        this.A02 = linkedHashMap2;
        this.A04 = linkedHashMap3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!11T.A0O(JR0.A0m(obj), getClass())) {
            return false;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.odin.model.OdinContext");
        return 11T.A0O(this.A01, ((OdinContext) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OdinContext(id=");
        A0k.append(this.A01);
        A0k.append(", type=");
        A0k.append(this.A00);
        A0k.append(", longMap=");
        A0k.append(this.A03);
        A0k.append(", doubleMap=");
        A0k.append(this.A02);
        A0k.append(", stringMap=");
        return AnonymousClass002.A0K(this.A04, A0k);
    }
}
