package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;
import java.lang.reflect.Field;

/* renamed from: X.0ti, reason: invalid class name */
/* loaded from: 0ti.class */
public abstract class C0ti implements IVerboseDebuggable {
    public static final 0KO A09 = new 0KO("ActivityLifecycleCode");
    public int A01;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public int A00 = -19842;
    public boolean A03 = false;
    public boolean A02 = false;

    public C0ti(String str, int i, String str2, String str3, boolean z) {
        this.A07 = str;
        this.A04 = i;
        this.A06 = str2;
        this.A08 = z;
        this.A05 = str3;
        this.A01 = i;
    }

    public static String A00(C0ti c0ti) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o("Lifecycle ");
        A0o.append(C0db.A00(c0ti.A07));
        A0o.append(" Code: ");
        if (c0ti.A04()) {
            A0o.append(c0ti.A01());
            A0o.append(" ");
            if (!c0ti.A03 || c0ti.A00 == -19842) {
                if (c0ti.A02) {
                    str = c0ti.A01 != -19842 ? "sketchy" : "guessed";
                }
                A0o.append("<Needs Processing>");
            } else {
                str = "certain";
            }
            A0o.append(str);
        } else {
            if (c0ti.A02) {
                str = "Unknown";
                A0o.append(str);
            }
            A0o.append("<Needs Processing>");
        }
        return A0o.toString();
    }

    public final int A01() {
        int i = this.A00;
        if (i == -19842) {
            i = this.A01;
            if (i == -19842) {
                i = this.A04;
            }
        }
        return i;
    }

    public abstract Class A02(0Yr r1, C0cZ c0cZ);

    public abstract Field A03(C0cZ c0cZ, Class cls, String str);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r301.A04 != (-19842)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A04() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A01
            r302 = r0
            r0 = -19842(0xffffffffffffb27e, float:NaN)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L21
            r0 = r301
            boolean r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L25
            r0 = r301
            int r0 = r0.A00
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L25
        L21:
            r0 = 1
            r304 = r0
        L23:
            r0 = r304
            return r0
        L25:
            r0 = r301
            int r0 = r0.A04
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L23
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ti.A04():boolean");
    }

    public String toString() {
        return A00(this);
    }
}
