package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: M9p.class */
public abstract class M9p extends MAG implements 5Z8 {
    public final String A00;
    public final 5Yj A01;
    public final 5Yl A02;
    public final JsonElement A03;

    public M9p(String str, 5Yj r303, JsonElement jsonElement) {
        this.A01 = r303;
        this.A03 = jsonElement;
        this.A00 = str;
        this.A02 = r303.A00;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.7xp, java.lang.IllegalArgumentException] */
    public static final C7xp A05(Number number, String str, String str2) {
        StringBuilder A0x = 7zO.A0x(str2, 2);
        A0x.append(4YT.A00(794));
        A0x.append(number);
        A0x.append(" with key ");
        A0x.append(str);
        A0x.append(4YT.A00(494));
        String A0a = AnonymousClass001.A0a(C7uj.A00(-1, str2), A0x);
        11T.A0F(A0a, 1);
        return new IllegalArgumentException(A0a);
    }

    public static final void A06(String str, String str2, JsonPrimitive jsonPrimitive, M9p m9p) {
        boolean A0b = 0CV.A0b(str, "i", false);
        String A0u = 1BL.A0u(A0b ? "an " : "a ", str, AnonymousClass001.A0k());
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Failed to parse literal '");
        A0k.append(jsonPrimitive);
        A0k.append("' as ");
        A0k.append(A0u);
        A0k.append(" value at element: ");
        throw C7uj.A01(m9p.A0K().toString(), AnonymousClass001.A0d(0Pz.A0Y(m9p.A0H(), str2, '.'), A0k), -1);
    }

    public JsonElement A0J() {
        if (this instanceof MAN) {
            return ((MAN) this).A01;
        }
        if (!(this instanceof MAP)) {
            return ((MAM) this).A00;
        }
        MAP map = (MAP) this;
        return map instanceof MAO ? ((MAO) map).A03 : map.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r302 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.serialization.json.JsonElement A0K() {
        /*
            r301 = this;
            r0 = r301
            java.util.ArrayList r0 = r0.A01
            java.lang.Object r0 = X.0QD.A0G(r0)
            java.lang.String r0 = (java.lang.String) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r301
            r1 = r302
            kotlinx.serialization.json.JsonElement r0 = r0.A0L(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1e
        L19:
            r0 = r301
            kotlinx.serialization.json.JsonElement r0 = r0.A0J()
            r302 = r0
        L1e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9p.A0K():kotlinx.serialization.json.JsonElement");
    }

    public JsonElement A0L(String str) {
        JsonObject jsonObject;
        Object A03;
        if (this instanceof MAN) {
            JsonArray jsonArray = ((MAN) this).A01;
            A03 = jsonArray.A00.get(Integer.parseInt(str));
        } else {
            if (!(this instanceof MAP)) {
                MAM mam = (MAM) this;
                if (str == "primitive") {
                    return mam.A00;
                }
                throw AnonymousClass001.A0L("This input can only handle primitives with 'primitive' tag");
            }
            MAP map = (MAP) this;
            if (map instanceof MAO) {
                MAO mao = (MAO) map;
                if (mao.A00 % 2 == 0) {
                    SerialDescriptor serialDescriptor = LDm.A00;
                    A03 = new JsonLiteral(str, true);
                } else {
                    jsonObject = mao.A03;
                }
            } else {
                jsonObject = map.A02;
            }
            A03 = 02K.A03(str, jsonObject);
        }
        return (JsonElement) A03;
    }

    public 5Z6 ABn(SerialDescriptor serialDescriptor) {
        String BA2;
        StringBuilder A0n;
        Class cls;
        11T.A0F(serialDescriptor, 0);
        JsonElement A0K = A0K();
        5ZD Asv = serialDescriptor.Asv();
        if (!11T.A0O(Asv, 5ZF.A00) && !(Asv instanceof 5ZE)) {
            boolean A0O = 11T.A0O(Asv, 5ZG.A00);
            5Yj r0 = this.A01;
            if (A0O) {
                SerialDescriptor A00 = 5ZA.A00(serialDescriptor.Aj5(0), r0.A02);
                5ZD Asv2 = A00.Asv();
                if ((Asv2 instanceof 5ZN) || 11T.A0O(Asv2, M9e.A00)) {
                    BA2 = serialDescriptor.BA2();
                    if (A0K instanceof JsonObject) {
                        return new MAO(r0, (JsonObject) A0K);
                    }
                } else if (!r0.A00.A05) {
                    throw C7uj.A02(A00);
                }
            } else {
                BA2 = serialDescriptor.BA2();
                if (A0K instanceof JsonObject) {
                    return new MAP(this.A00, (SerialDescriptor) null, r0, (JsonObject) A0K);
                }
            }
            A0n = AnonymousClass001.A0n("Expected ");
            cls = JsonObject.class;
            java.util.Map map = 0BY.A03;
            A0n.append(C0Bx.A01(cls));
            A0n.append(", but had ");
            Class<?> cls2 = A0K.getClass();
            11T.A0F(cls2, 1);
            AnonymousClass001.A1D(C0Bx.A01(cls2), " as the serialized body of ", BA2, A0n);
            A0n.append(" at element: ");
            throw C7uj.A01(A0K.toString(), AnonymousClass001.A0d(A0H(), A0n), -1);
        }
        5Yj r02 = this.A01;
        BA2 = serialDescriptor.BA2();
        if (A0K instanceof JsonArray) {
            return new MAN(r02, (JsonArray) A0K);
        }
        A0n = AnonymousClass001.A0n("Expected ");
        cls = JsonArray.class;
        java.util.Map map2 = 0BY.A03;
        A0n.append(C0Bx.A01(cls));
        A0n.append(", but had ");
        Class<?> cls22 = A0K.getClass();
        11T.A0F(cls22, 1);
        AnonymousClass001.A1D(C0Bx.A01(cls22), " as the serialized body of ", BA2, A0n);
        A0n.append(" at element: ");
        throw C7uj.A01(A0K.toString(), AnonymousClass001.A0d(A0H(), A0n), -1);
    }

    public JsonElement AM5() {
        return A0K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if ((!(r0.A0K() instanceof kotlinx.serialization.json.JsonNull)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AM8() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.MAP
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L33
            r0 = r301
            r303 = r0
            r0 = r301
            X.MAP r0 = (X.MAP) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2d
            r0 = r303
            kotlinx.serialization.json.JsonElement r0 = r0.A0K()
            r304 = r0
            r0 = r304
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = 1
            r302 = r0
            r0 = r305
            if (r0 != 0) goto L31
        L2d:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L31:
            r0 = r302
            return r0
        L33:
            r0 = r301
            kotlinx.serialization.json.JsonElement r0 = r0.A0K()
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9p.AM8():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
    
        if (r306 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AQH(kotlinx.serialization.descriptors.SerialDescriptor r302) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9p.AQH(kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public 5Yn BA6() {
        return this.A01.A02;
    }
}
