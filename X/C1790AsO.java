package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.user.model.UserKey;
import java.util.List;

/* renamed from: X.AsO, reason: case insensitive filesystem */
/* loaded from: AsO.class */
public final class C1790AsO extends C04v {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C1790AsO(2SI r302, String str, String str2) {
        this.A03 = 3;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r302;
    }

    public C1790AsO(C87v c87v, String str, String str2) {
        this.A03 = 10;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = c87v;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1790AsO(8Jr r302, String str) {
        this(r302, str, (String) null);
        this.A03 = 7;
    }

    public C1790AsO(8Jr r302, String str, String str2) {
        this.A03 = 7;
        1BL.A1F(r302, str);
        this.A00 = r302;
        this.A02 = str;
        this.A01 = str2;
    }

    public C1790AsO(Bitmap bitmap, String str, String str2, int i) {
        this.A03 = i;
        11T.A0F(str2, 3);
        this.A00 = bitmap;
        this.A02 = str;
        this.A01 = str2;
    }

    public C1790AsO(Drawable drawable, String str, String str2) {
        this.A03 = 8;
        11T.A0F(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = drawable;
    }

    public C1790AsO(IconCompat iconCompat, String str, String str2) {
        this.A03 = 6;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = iconCompat;
    }

    public C1790AsO(UserKey userKey, String str, String str2) {
        this.A03 = 2;
        this.A00 = userKey;
        this.A02 = str;
        this.A01 = str2;
    }

    public C1790AsO(Integer num, String str, String str2, int i) {
        this.A03 = i;
        if (i != 0) {
            this.A02 = str;
            this.A01 = str2;
        } else {
            this.A01 = str;
            this.A02 = str2;
        }
        this.A00 = num;
    }

    public C1790AsO(Object obj, String str, String str2) {
        this.A03 = 11;
        this.A01 = str;
        this.A00 = obj;
        this.A02 = str2;
    }

    public C1790AsO(String str, Integer num, String str2) {
        this.A03 = 12;
        1BL.A1H(str, num, str2);
        this.A02 = str;
        this.A00 = num;
        this.A01 = str2;
    }

    public C1790AsO(String str, String str2, List list) {
        this.A03 = 9;
        this.A01 = str;
        this.A00 = list;
        this.A02 = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1790AsO(String str, List list) {
        this(str, "", list);
        this.A03 = 9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.C1790AsO) r302).A03 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.C1790AsO
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AsO r0 = (X.C1790AsO) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A03
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r301
            if (r0 == r1) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1790AsO.A00(int, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1790AsO.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int hashCode() {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1790AsO.hashCode():int");
    }

    public String toString() {
        if (10 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GraphQLProductInfo(productId=");
        A0k.append(this.A02);
        A0k.append(", externalProductId=");
        A0k.append(this.A01);
        A0k.append(", offers=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
