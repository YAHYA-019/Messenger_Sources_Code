package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: Fxh.class */
public final class Fxh implements GHD {
    public final GHD A00;

    public Fxh(GHD ghd) {
        this.A00 = ghd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object AQy(FHh fHh, DKc dKc, String str) {
        HashMap A0u;
        int i = 0;
        switch (str.hashCode()) {
            case -1882328740:
                if (str.equals("bk.action.f32.Sqrt")) {
                    Object A10 = DKC.A10(dKc, 0);
                    A10.getClass();
                    return FB1.A00(Math.sqrt(DKC.A00(A10)));
                }
                break;
            case -1666855539:
                if (str.equals("bk.action.string.ToUpperCase")) {
                    return DKE.A0y(dKc, 0).toUpperCase(Locale.ROOT);
                }
                break;
            case -1606945202:
                if (str.equals("bk.action.array.Reduce")) {
                    List list = dKc.A00;
                    List list2 = (List) list.get(0);
                    Object A102 = DKC.A10(dKc, 1);
                    A102.getClass();
                    FGb fGb = (FGb) A102;
                    Object obj = list.get(2);
                    if (list2 != null) {
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            DKM A03 = DKM.A03(obj);
                            A03.A0J(list2.get(i2), 1);
                            DKc A07 = DKM.A07(A03, Integer.valueOf(i2), 2);
                            try {
                                A07 = fGb.A00;
                                obj = EYt.A00(fHh, A07, A07);
                            } catch (G8M unused) {
                                throw AnonymousClass001.A0U(A07);
                            }
                        }
                        break;
                    }
                    return obj;
                }
                break;
            case -1225336055:
                if (str.equals("bk.action.string.Contains")) {
                    Object A103 = DKC.A10(dKc, 0);
                    A103.getClass();
                    String str2 = (String) A103;
                    Object A104 = DKC.A10(dKc, 1);
                    A104.getClass();
                    return Boolean.valueOf(str2.contains((String) A104));
                }
                break;
            case -965327084:
                if (str.equals("bk.action.string.Join")) {
                    List list3 = dKc.A00;
                    String A0x = DKD.A0x(list3, 0);
                    list3.get(1);
                    List list4 = (List) list3.get(1);
                    if (A0x == null) {
                        throw AnonymousClass001.A0L("delimeter must not be null");
                    }
                    StringBuilder A0k = AnonymousClass001.A0k();
                    while (i < list4.size()) {
                        String A14 = 1BK.A14(list4, i);
                        if (A14 == null) {
                            throw AnonymousClass001.A0L("element must not be null");
                        }
                        A0k.append(A14);
                        if (i < list4.size() - 1) {
                            A0k.append(A0x);
                        }
                        i++;
                    }
                    return A0k.toString();
                }
                break;
            case -240276909:
                if (str.equals("bk.action.map.Merge")) {
                    A0u = AnonymousClass001.A0u();
                    while (true) {
                        List list5 = dKc.A00;
                        if (i >= list5.size()) {
                            return A0u;
                        }
                        java.util.Map map = (java.util.Map) list5.get(i);
                        if (map != null) {
                            A0u.putAll(map);
                        }
                        i++;
                    }
                }
                break;
            case 944474301:
                if (str.equals("bk.action.map.Filter")) {
                    Object A105 = DKC.A10(dKc, 0);
                    A105.getClass();
                    java.util.Map map2 = (java.util.Map) A105;
                    Object A106 = DKC.A10(dKc, 1);
                    A106.getClass();
                    FGb fGb2 = (FGb) A106;
                    A0u = AnonymousClass001.A0u();
                    Iterator A0y = AnonymousClass001.A0y(map2);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0y);
                        DKM A00 = DKM.A00();
                        A00.A0J(A0z.getKey(), 0);
                        DKc A072 = DKM.A07(A00, A0z.getValue(), 1);
                        try {
                            A072 = fGb2.A00;
                            if (FB1.A02(EYt.A00(fHh, A072, A072))) {
                                1BL.A1O(A0u, A0z);
                            }
                        } catch (G8M unused2) {
                            throw AnonymousClass001.A0U(A072);
                        }
                    }
                    return A0u;
                }
                break;
            case 975567453:
                if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                    Object A107 = DKC.A10(dKc, 0);
                    A107.getClass();
                    long A05 = AnonymousClass001.A05(A107);
                    Object A108 = DKC.A10(dKc, 1);
                    A108.getClass();
                    long A032 = AnonymousClass001.A03(A108);
                    if (A032 < 2 || A032 > 36) {
                        throw AnonymousClass001.A0L("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                    }
                    return Long.toString(A05, (int) A032);
                }
                break;
            case 1377663097:
                if (str.equals("bk.action.map.Keys")) {
                    Object A109 = DKC.A10(dKc, 0);
                    A109.getClass();
                    return 1BK.A17(((java.util.Map) A109).keySet());
                }
                break;
            case 1395153511:
                if (str.equals("bk.action.map.Values")) {
                    Object A1010 = DKC.A10(dKc, 0);
                    A1010.getClass();
                    return 1BK.A17(((java.util.Map) A1010).values());
                }
                break;
            case 1740388232:
                if (str.equals("bk.action.f32.Log")) {
                    Object A1011 = DKC.A10(dKc, 0);
                    A1011.getClass();
                    return FB1.A00(Math.log(DKC.A00(A1011)));
                }
                break;
            case 1740392092:
                if (str.equals("bk.action.f32.Pow")) {
                    Object A1012 = DKC.A10(dKc, 0);
                    A1012.getClass();
                    double A002 = DKC.A00(A1012);
                    Object A1013 = DKC.A10(dKc, 1);
                    A1013.getClass();
                    return FB1.A00(Math.pow(A002, DKC.A00(A1013)));
                }
                break;
            case 1867263777:
                if (str.equals("bk.action.string.StartsWith")) {
                    List list6 = dKc.A00;
                    return Boolean.valueOf(DKD.A0x(list6, 0).startsWith(DKD.A0x(list6, 1)));
                }
                break;
            case 1890080876:
                if (str.equals("bk.action.string.ToLowerCase")) {
                    return DKE.A0y(dKc, 0).toLowerCase(Locale.ROOT);
                }
                break;
        }
        GHD ghd = this.A00;
        if (ghd == null) {
            throw new RuntimeException(0Pz.A0W("unknown function ", str));
        }
        A0u = ghd.AQy(fHh, dKc, str);
        return A0u;
    }
}
