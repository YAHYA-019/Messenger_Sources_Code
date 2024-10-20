package X;

import android.os.Bundle;

/* renamed from: X.0tz, reason: invalid class name */
/* loaded from: 0tz.class */
public final class C0tz extends C0Mg {
    public final int A00;

    public C0tz(int i) {
        this.A00 = i;
    }

    @Override // X.C0Mg
    public Class A00() {
        Class cls;
        switch (this.A00) {
            case 0:
                cls = String.class;
                break;
            case 1:
                cls = Integer.class;
                break;
            case 2:
                cls = Boolean.class;
                break;
            case 3:
                cls = Long.class;
                break;
            default:
                cls = null;
                break;
        }
        return cls;
    }

    @Override // X.C0Mg
    public /* bridge */ /* synthetic */ void A02(Bundle bundle, Object obj, String str) {
        switch (this.A00) {
            case 0:
                bundle.putString(str, (String) obj);
                return;
            case 1:
                bundle.putInt(str, AnonymousClass001.A03(obj));
                return;
            case 2:
                bundle.putBoolean(str, AnonymousClass001.A1V(obj));
                return;
            case 3:
                bundle.putLong(str, AnonymousClass001.A05(obj));
                return;
            default:
                return;
        }
    }

    @Override // X.C0Mg
    public /* bridge */ /* synthetic */ void A03(0Mi r302, Object obj, String str) {
        switch (this.A00) {
            case 0:
                r302.CaM(str, (String) obj);
                return;
            case 1:
                r302.CaF(str, AnonymousClass001.A03(obj));
                return;
            case 2:
                r302.Ca3(str, AnonymousClass001.A1V(obj));
                return;
            case 3:
                r302.CaI(str, AnonymousClass001.A05(obj));
                return;
            default:
                return;
        }
    }

    @Override // X.C0Mg
    public /* bridge */ /* synthetic */ void A04(16W r302, C09D c09d, Object obj, String str) {
        Object valueOf;
        switch (this.A00) {
            case 0:
                String str2 = (String) obj;
                11T.A0H(str, str2);
                valueOf = ((09C) c09d).getString(str, str2);
                break;
            case 1:
                Number number = (Number) obj;
                int intValue = number == null ? 0 : number.intValue();
                11T.A0F(str, 0);
                valueOf = Integer.valueOf(((09C) c09d).getInt(str, intValue));
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool == null ? false : bool.booleanValue();
                11T.A0F(str, 0);
                valueOf = Boolean.valueOf(((09C) c09d).getBoolean(str, booleanValue));
                break;
            case 3:
                Number number2 = (Number) obj;
                long longValue = number2 == null ? Long.MAX_VALUE : number2.longValue();
                11T.A0F(str, 0);
                valueOf = Long.valueOf(((09C) c09d).getLong(str, longValue));
                break;
            default:
                return;
        }
        r302.onResult(valueOf);
    }
}
