package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: L6o.class */
public abstract class L6o {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A00(MQo mQo, StringBuilder sb, int i) {
        boolean z;
        int A03;
        Object obj;
        Method method;
        int length;
        HashSet A0v = AnonymousClass001.A0v();
        HashMap A0u = AnonymousClass001.A0u();
        TreeMap treeMap = new TreeMap();
        for (Method method2 : mQo.getClass().getDeclaredMethods()) {
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getName().length() >= 3) {
                if (method2.getName().startsWith("set")) {
                    A0v.add(method2.getName());
                } else if (JQx.A1X(method2) && method2.getParameterTypes().length == 0) {
                    JR2.A0m(method2, A0u, treeMap);
                }
            }
        }
        Iterator A0x = AnonymousClass001.A0x(treeMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            String substring = AnonymousClass001.A0j(A0z).substring(3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                method = (Method) A0z.getValue();
                if (method != null && method.getReturnType().equals(List.class)) {
                    length = substring.length() - 4;
                    A01(KDF.A05(mQo, method, new Object[0]), substring.substring(0, length), sb, i);
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                method = (Method) A0z.getValue();
                if (method != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(Deprecated.class) && JQx.A1X(method)) {
                    length = substring.length() - 3;
                    A01(KDF.A05(mQo, method, new Object[0]), substring.substring(0, length), sb, i);
                }
            }
            if (A0v.contains(0Pz.A0W("set", substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey(0Pz.A0W("get", substring.substring(0, substring.length() - 5))))) {
                Method method3 = (Method) A0z.getValue();
                Method method4 = (Method) A0u.get(0Pz.A0W("has", substring));
                if (method3 != null) {
                    Object A05 = KDF.A05(mQo, method3, new Object[0]);
                    if (method4 == null) {
                        if (A05 instanceof Boolean) {
                            z = !AnonymousClass001.A1V(A05);
                        } else {
                            if (A05 instanceof Integer) {
                                A03 = AnonymousClass001.A03(A05);
                            } else if (A05 instanceof Float) {
                                A03 = Float.floatToRawIntBits(7zM.A00(A05));
                            } else if (A05 instanceof Double) {
                                A03 = (JR0.A0W(A05) > 0L ? 1 : (JR0.A0W(A05) == 0L ? 0 : -1));
                            } else {
                                if (A05 instanceof String) {
                                    obj = "";
                                } else if (A05 instanceof Lj4) {
                                    obj = Lj4.A00;
                                } else {
                                    if (A05 instanceof MQo) {
                                        if (A05 == Lg5.A0B((MDd) A05, 0S2.A0j)) {
                                        }
                                    } else if (A05 instanceof Enum) {
                                        A03 = ((Enum) A05).ordinal();
                                    }
                                    A01(A05, substring, sb, i);
                                }
                                z = A05.equals(obj);
                            }
                            if (A03 != 0) {
                                A01(A05, substring, sb, i);
                            }
                        }
                        if (!z) {
                            A01(A05, substring, sb, i);
                        }
                    } else if (AnonymousClass001.A1V(KDF.A05(mQo, method4, new Object[0]))) {
                        A01(A05, substring, sb, i);
                    }
                }
            }
        }
        L8w l8w = ((KDF) mQo).unknownFields;
        if (l8w != null) {
            for (int i2 = 0; i2 < l8w.A00; i2++) {
                A01(l8w.A04[i2], String.valueOf(l8w.A03[i2] >>> 3), sb, i);
            }
        }
    }

    public static void A01(Object obj, String str, StringBuilder sb, int i) {
        String A002;
        if (obj instanceof List) {
            Iterator A1G = GOn.A1G(obj);
            while (A1G.hasNext()) {
                A01(A1G.next(), str, sb, i);
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            Iterator A0y = AnonymousClass001.A0y((java.util.Map) obj);
            while (A0y.hasNext()) {
                A01(A0y.next(), str, sb, i);
            }
            return;
        }
        sb.append('\n');
        int i2 = i;
        while (true) {
            int i3 = i2;
            if (i3 <= 0) {
                break;
            }
            char[] cArr = A00;
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(cArr, 0, i4);
            i2 = i3 - i4;
        }
        if (!str.isEmpty()) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(Character.toLowerCase(JQx.A00(str)));
            int i5 = 1;
            while (true) {
                int i6 = i5;
                if (i6 >= str.length()) {
                    break;
                }
                A0k.append(Character.toLowerCase(JR1.A01(str, A0k, i6)));
                i5 = i6 + 1;
            }
            str = A0k.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            Lj4 lj4 = Lj4.A00;
            A002 = KYg.A00(new KBy(((String) obj).getBytes(KdF.A04)));
        } else {
            if (!(obj instanceof Lj4)) {
                if (obj instanceof KDF) {
                    sb.append(" {");
                    A00((Lg5) obj, sb, i + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                } else {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i7 = i + 2;
                    A01(entry.getKey(), "key", sb, i7);
                    A01(entry.getValue(), "value", sb, i7);
                }
                sb.append("\n");
                while (i > 0) {
                    char[] cArr2 = A00;
                    int i8 = 80;
                    if (i <= 80) {
                        i8 = i;
                    }
                    sb.append(cArr2, 0, i8);
                    i -= i8;
                }
                sb.append("}");
                return;
            }
            sb.append(": \"");
            A002 = KYg.A00((Lj4) obj);
        }
        sb.append(A002);
        sb.append('\"');
    }
}
