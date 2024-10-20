package X;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.3Wz, reason: invalid class name */
/* loaded from: 3Wz.class */
public final class C3Wz implements C3lr {
    public final String A00;
    public final List A01;
    public final Pattern A02;
    public final String A03;

    public C3Wz(String str, String str2, List list) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = list;
        boolean z = -1;
        switch (str2.hashCode()) {
            case -567445985:
                if (str2.equals("contains")) {
                    z = false;
                    break;
                }
                break;
            case 3365:
                if (str2.equals("in")) {
                    z = true;
                    break;
                }
                break;
            case 109075:
                if (str2.equals("nin")) {
                    z = 2;
                    break;
                }
                break;
            case 108392519:
                if (str2.equals("regex")) {
                    z = 3;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                if (list == null || list.size() != 1) {
                    throw new C4EG("Mismatching number of values", str);
                }
                return;
            case true:
            case true:
                if (list == null || list.isEmpty()) {
                    throw new C4EG("Mismatching number of values", str);
                }
                return;
            case true:
                if (list == null || list.size() != 1) {
                    throw new C4EG("Mismatching number of values", str);
                }
                try {
                    this.A02 = Pattern.compile(1BK.A14(list, 0));
                    return;
                } catch (PatternSyntaxException unused) {
                    throw new C4EG("Regex syntax error", str);
                }
            default:
                throw new C4EG("Illegal string strategy", str);
        }
    }

    @Override // X.C3lr
    public boolean Bcy(2Hy r302) {
        String obj = r302.toString();
        String str = this.A00;
        switch (str.hashCode()) {
            case -567445985:
                if (str.equals("contains")) {
                    return obj.contains((CharSequence) this.A01.get(0));
                }
                return false;
            case 3365:
                if (str.equals("in")) {
                    return this.A01.contains(obj);
                }
                return false;
            case 109075:
                if (str.equals("nin")) {
                    return !this.A01.contains(obj);
                }
                return false;
            case 108392519:
                if (str.equals("regex")) {
                    return this.A02.matcher(obj).matches();
                }
                return false;
            default:
                return false;
        }
    }

    @Override // X.C3lr
    public String getName() {
        return this.A03;
    }
}
