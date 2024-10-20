package X;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.82j, reason: invalid class name */
/* loaded from: 82j.class */
public final class C82j extends C04v {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82j(24X r302) {
        this(r302, (String) null, (byte[]) null);
        this.A00 = 1;
    }

    public C82j(24X r302, String str, byte[] bArr) {
        this.A00 = 1;
        this.A02 = r302;
        this.A01 = bArr;
        this.A03 = str;
    }

    public C82j(C5vw c5vw, Integer num, String str) {
        this.A00 = 4;
        this.A03 = str;
        this.A01 = c5vw;
        this.A02 = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82j(C5vw c5vw, String str) {
        this(c5vw, (Integer) null, str);
        this.A00 = 4;
    }

    public C82j(CharSequence charSequence, Integer num, String str) {
        this.A00 = 0;
        this.A02 = charSequence;
        this.A03 = str;
        this.A01 = num;
    }

    public C82j(String str) {
        this.A00 = 3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.A00 = 3;
        this.A03 = str;
        this.A01 = linkedHashSet;
        this.A02 = linkedHashSet2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82j(String str, CharSequence charSequence) {
        this(charSequence, (Integer) null, str);
        this.A00 = 0;
    }

    public C82j(List list, Function1 function1) {
        this.A00 = 2;
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        this.A00 = 2;
        this.A01 = list;
        this.A02 = function1;
        this.A03 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int hashCode;
        switch (this.A00) {
            case 0:
                Object obj = this.A02;
                i = 0;
                hashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + 1BL.A05(this.A03)) * 31;
                Integer num = (Integer) this.A01;
                if (num != null) {
                    i = 7mL.A00(num);
                    break;
                }
                break;
            case 1:
                int hashCode2 = this.A02.hashCode() * 31;
                byte[] bArr = (byte[]) this.A01;
                hashCode = (hashCode2 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
                i = 7zN.A05(this.A03);
                break;
            case 2:
                i = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
                hashCode = this.A03.hashCode();
                break;
            case 3:
                i = ((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31;
                hashCode = this.A02.hashCode();
                break;
            default:
                i = ((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31;
                Integer num2 = (Integer) this.A02;
                if (num2 != null) {
                    hashCode = C3P6.A00(num2);
                    break;
                } else {
                    hashCode = 0;
                    break;
                }
        }
        return hashCode + i;
    }

    public String toString() {
        if (4 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmaCta(title=");
        sb.append(this.A03);
        sb.append(", callToAction=");
        sb.append(this.A01);
        sb.append(", icon=");
        Integer num = (Integer) this.A02;
        sb.append(num != null ? C3P6.A01(num) : "null");
        return 4YV.A0x(sb);
    }
}
