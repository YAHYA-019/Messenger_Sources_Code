package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.65t, reason: invalid class name */
/* loaded from: 65t.class */
public abstract class C65t {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C65t[] A01;
    public static final C65t A02;
    public static final C65t A03;
    public static final C65t A04;
    public static final C65t A05;
    public static final C65t A06;
    public static final C65t A07;
    public static final C65t A08;

    static {
        C65t c65t = new C65t() { // from class: X.65u
        };
        A07 = c65t;
        C65t c65t2 = new C65t() { // from class: X.65v
        };
        A06 = c65t2;
        C65t c65t3 = new C65t() { // from class: X.65w
        };
        A03 = c65t3;
        C65t c65t4 = new C65t() { // from class: X.65x
        };
        A05 = c65t4;
        C65t c65t5 = new C65t() { // from class: X.65y
        };
        A08 = c65t5;
        C65t c65t6 = new C65t() { // from class: X.65z
        };
        A02 = c65t6;
        C65t c65t7 = new C65t() { // from class: X.660
        };
        A04 = c65t7;
        C65t[] c65tArr = {c65t, c65t2, c65t3, c65t4, c65t5, c65t6, c65t7};
        A01 = c65tArr;
        A00 = C00t.A00(c65tArr);
    }

    public C65t(String str, int i) {
    }

    public int A00(Integer num) {
        int intValue;
        if (this instanceof C65z) {
            return 2131952649;
        }
        if (this instanceof C65y) {
            return 2131965742;
        }
        if (this instanceof C65u) {
            return 2131962943;
        }
        if (this instanceof C65v) {
            return 2131960360;
        }
        if (this instanceof C65x) {
            return 2131956718;
        }
        if (this instanceof AnonymousClass660) {
            return 2131956715;
        }
        if (num == null || (intValue = num.intValue()) == -1) {
            return 2131952771;
        }
        if (intValue == 0) {
            return 2131952772;
        }
        if (intValue == 1) {
            return 2131952773;
        }
        throw 1BK.A1F();
    }

    public Integer A01() {
        if (!(this instanceof C65z)) {
            if (!(this instanceof C65y)) {
                if (!(this instanceof C65u) && !(this instanceof C65v) && !(this instanceof C65x)) {
                    if (this instanceof AnonymousClass660) {
                        return null;
                    }
                }
            }
            return 0S2.A05;
        }
        return 0S2.A0G;
    }

    public Integer A02() {
        if (!(this instanceof C65y)) {
            if ((this instanceof C65u) || (this instanceof C65v)) {
                return null;
            }
            if (!(this instanceof C65x) && ((this instanceof AnonymousClass660) || !(this instanceof C65w))) {
                return null;
            }
        }
        return 2131968020;
    }
}
