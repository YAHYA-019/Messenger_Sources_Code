package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: I9y.class */
public abstract class I9y {
    public static final Rect A00 = new Rect(-1000, -1000, 1000, 1000);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (r0 >= r304) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList A00(android.graphics.Rect r301) {
        /*
            android.graphics.Rect r0 = X.I9y.A00
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.intersect(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L62
            r0 = r302
            r1 = r301
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L62
            r0 = r301
            int r0 = r0.right
            r304 = r0
            r0 = r302
            int r0 = r0.left
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = r305
            if (r0 > r1) goto L92
            r0 = r301
            int r0 = r0.left
            r304 = r0
        L31:
            r0 = r305
            r1 = r304
            int r0 = r0 - r1
            r305 = r0
        L37:
            r0 = r301
            int r0 = r0.bottom
            r307 = r0
            r0 = r302
            int r0 = r0.top
            r304 = r0
            r0 = r307
            r1 = r304
            if (r0 > r1) goto L80
            r0 = r301
            int r0 = r0.top
            r307 = r0
        L4e:
            r0 = r304
            r1 = r307
            int r0 = r0 - r1
            r306 = r0
        L54:
            r0 = r301
            r1 = r305
            r2 = r306
            r0.offset(r1, r2)
            r0 = r301
            r1 = r302
            boolean r0 = r0.intersect(r1)
        L62:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r308 = r0
            android.hardware.Camera$Area r0 = new android.hardware.Camera$Area
            r309 = r0
            r0 = r309
            r1 = r301
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1, r2)
            r0 = r308
            r1 = r309
            boolean r0 = r0.add(r1)
            r0 = r308
            return r0
        L80:
            r0 = r301
            int r0 = r0.top
            r303 = r0
            r0 = r302
            int r0 = r0.bottom
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 < r1) goto L54
            goto L4e
        L92:
            r0 = r301
            int r0 = r0.left
            r303 = r0
            r0 = r302
            int r0 = r0.right
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 >= r1) goto L31
            r0 = 0
            r305 = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9y.A00(android.graphics.Rect):java.util.ArrayList");
    }

    public static ArrayList A01(String str) {
        ArrayList A0s;
        if (TextUtils.isEmpty(str)) {
            A0s = AnonymousClass001.A0s();
        } else {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
            simpleStringSplitter.setString(str);
            A0s = AnonymousClass001.A0s();
            Iterator<String> it = simpleStringSplitter.iterator();
            while (it.hasNext()) {
                A0s.add(it.next());
            }
        }
        return A0s;
    }

    public static ArrayList A02(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
            android.util.Log.e("ParametersHelper", 0Pz.A0W("Invalid area string=", str));
            return null;
        }
        if (str.equals("(0,0,0,0,0)") || str.equals("(0, 0, 0, 0, 0)")) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        do {
            int indexOf = str.indexOf(41, i);
            String substring = str.substring(i, indexOf + 1);
            Camera.Area area = null;
            if (substring == null || substring.isEmpty() || substring.charAt(0) != '(' || substring.charAt(substring.length() - 1) != ')') {
                android.util.Log.e("ParametersHelper", 0Pz.A0W("Invalid area string=", substring));
            } else {
                Rect A0C = DKC.A0C();
                try {
                    int indexOf2 = substring.indexOf(44);
                    A0C.left = GOq.A0F(substring, 1, indexOf2);
                    int i2 = indexOf2 + 1;
                    int indexOf3 = substring.indexOf(44, i2);
                    A0C.top = GOq.A0F(substring, i2, indexOf3);
                    int i3 = indexOf3 + 1;
                    int indexOf4 = substring.indexOf(44, i3);
                    A0C.right = GOq.A0F(substring, i3, indexOf4);
                    int i4 = indexOf4 + 1;
                    int indexOf5 = substring.indexOf(44, i4);
                    A0C.bottom = GOq.A0F(substring, i4, indexOf5);
                    int i5 = indexOf5 + 1;
                    int indexOf6 = substring.indexOf(44, i5);
                    if (indexOf6 == -1) {
                        indexOf6 = substring.indexOf(41, i5);
                    }
                    area = new Camera.Area(A0C, GOq.A0F(substring, i5, indexOf6));
                } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                    android.util.Log.e("ParametersHelper", 0Pz.A0W("Invalid area string=", substring), e);
                }
            }
            if (area != null) {
                A0s.add(area);
            }
            i = str.indexOf(40, indexOf);
        } while (i != -1);
        if (A0s.isEmpty()) {
            return null;
        }
        if (A0s.size() == 1) {
            Camera.Area area2 = (Camera.Area) A0s.get(0);
            Rect rect = area2.rect;
            rect.getClass();
            if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0 && area2.weight == 0) {
                return null;
            }
        }
        return A0s;
    }
}
