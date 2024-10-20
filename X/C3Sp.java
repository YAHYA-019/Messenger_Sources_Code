package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.papaya.hash.DefaultHasher;
import com.facebook.papaya.mldw.DataValue;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.3Sp, reason: invalid class name */
/* loaded from: 3Sp.class */
public final class C3Sp {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public C3Sp(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        1BY r0 = r303.A00;
        this.A02 = 1Lm.A03(fbUserSession, r0, 131171);
        this.A00 = 1Lm.A03(fbUserSession, r0, 131170);
        3H2 r02 = DefaultHasher.Companion;
        this.A01 = 1Bq.A00(67754);
    }

    public static final void A00(C3Sp c3Sp, String str, String str2, String str3) {
        C00i c00i = c3Sp.A01.A00;
        if (((1RL) c00i.get()).BTF()) {
            ((1RL) c00i.get()).AUJ().BZW(1L, str, str2, str3, true);
        }
    }

    public static final void A01(ImmutableMap.Builder builder, Object obj, String str, String str2) {
        long j;
        Long valueOf;
        DataValue dataValue;
        Float f;
        if (obj instanceof String) {
            dataValue = new DataValue((String) obj);
        } else {
            if (obj instanceof Double) {
                DataValue dataValue2 = DataValue.$redex_init_class;
                f = Float.valueOf((float) ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                f = (Float) obj;
            } else {
                if (obj instanceof Long) {
                    valueOf = (Long) obj;
                } else {
                    if (obj instanceof Integer) {
                        DataValue dataValue3 = DataValue.$redex_init_class;
                        j = AnonymousClass001.A03(obj);
                    } else if (!(obj instanceof Boolean)) {
                        0fH.A14("MLDWFalcoHost", "Event %s has an unsupported property %s", new Object[]{str, str2});
                        return;
                    } else {
                        DataValue dataValue4 = DataValue.$redex_init_class;
                        j = AnonymousClass001.A1V(obj) ? 1L : 0L;
                    }
                    valueOf = Long.valueOf(j);
                }
                dataValue = new DataValue(valueOf);
            }
            dataValue = new DataValue(f);
        }
        builder.put(str2, dataValue);
    }
}
