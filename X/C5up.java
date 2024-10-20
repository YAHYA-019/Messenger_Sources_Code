package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5up, reason: invalid class name */
/* loaded from: 5up.class */
public abstract class C5up {
    public static final List A00 = Arrays.asList((char) 8234, (char) 8235, (char) 8236, (char) 8237, (char) 8238, (char) 8294, (char) 8295, (char) 8296, (char) 8297, (char) 8233);

    /* JADX WARN: Type inference failed for: r0v65, types: [X.5v3, java.lang.Object] */
    public static 0Mu A00(String str, List list) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new AHV(4));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                if (i2 < str.length()) {
                    sb.append(str.substring(i2));
                }
                return new 0Mu(sb.toString(), arrayList);
            }
            C5v3 c5v3 = (C5v3) it.next();
            int i3 = c5v3.A01;
            if (i3 < 0) {
                break;
            }
            int i4 = c5v3.A00;
            if (i4 < 0 || i3 > i4) {
                break;
            }
            if (i2 > i3) {
                throw AnonymousClass001.A0L("Overlap locations found");
            }
            sb.append(str.substring(i2, i3));
            int length = sb.length();
            String substring = str.substring(i3, i4);
            StringBuilder sb2 = new StringBuilder();
            char[] charArray = substring.toCharArray();
            int length2 = charArray.length;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < length2) {
                    char c = charArray[i6];
                    if (!A00.contains(Character.valueOf(c))) {
                        sb2.append(c);
                    }
                    i5 = i6 + 1;
                }
            }
            sb.append(sb2.toString());
            int length3 = sb.length();
            ?? obj = new Object();
            obj.A01 = length;
            obj.A00 = length3;
            arrayList.add(obj);
            i = i4;
        }
        throw AnonymousClass001.A0L("Location invalid");
    }
}
