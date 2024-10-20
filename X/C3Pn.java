package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* renamed from: X.3Pn, reason: invalid class name */
/* loaded from: 3Pn.class */
public abstract class C3Pn {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;
    public static final java.util.Map A06;

    static {
        String A002 = A00(127880);
        String A003 = A00(127876);
        String A004 = A00(128334);
        String A005 = A00(127805);
        String A006 = A00(10084);
        ImmutableList of = ImmutableList.of(A006, new String(new int[]{10084, 65039}, 0, 2), A00(128147), A00(128149), A00(128150), A00(128151), A00(128152), A00(128153), A00(128154), A00(128155), A00(128156), A00(128157), A00(128158), "<3", "&lt;3");
        A04 = of;
        String str = new String(new int[]{10052, 65039}, 0, 2);
        ImmutableList of2 = ImmutableList.of((Object) str, (Object) A00(9924), (Object) new String(new int[]{9731, 65039}, 0, 2), (Object) "happy holidays");
        A00 = of2;
        ImmutableList of3 = ImmutableList.of((Object) A002, (Object) "congrats", (Object) "happy birthday", (Object) "happy new year");
        A01 = of3;
        ImmutableList of4 = ImmutableList.of((Object) A003, (Object) "merry christmas");
        A02 = of4;
        ImmutableList of5 = ImmutableList.of((Object) A004, (Object) "happy hanukkah");
        A03 = of5;
        ImmutableList of6 = ImmutableList.of((Object) A005, (Object) "happy kwanzaa");
        A05 = of6;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(A006, of);
        builder.put(str, of2);
        builder.put(A002, of3);
        builder.put(A003, of4);
        builder.put(A004, of5);
        builder.put(A005, of6);
        A06 = builder.build();
    }

    public static String A00(int i) {
        return new String(Character.toChars(i));
    }
}
