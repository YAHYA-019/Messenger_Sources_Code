package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.5t8, reason: invalid class name */
/* loaded from: 5t8.class */
public final class C5t8 implements C5lk {
    public static final C5t8 A00 = new Object();

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        11T.A0F(r303, 0);
        11T.A0F(c5to, 3);
        Photo photo = null;
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() == 0) {
            return null;
        }
        int AXc = c5pu.AXc(0);
        Integer nullableInteger = r0.mResultSet.getNullableInteger(0, 38);
        if (AXc != 7 || nullableInteger == null) {
            return null;
        }
        int intValue = nullableInteger.intValue();
        if (intValue != 2001 && intValue != 2006 && intValue != 2003 && intValue != 2002) {
            return null;
        }
        String string = r0.mResultSet.getString(0, 28);
        Boolean nullableBoolean = r0.mResultSet.getNullableBoolean(0, 180);
        C7Ze c7Ze = new C7Ze();
        Long nullableLong = r0.mResultSet.getNullableLong(0, ActionId.SERVICE_ON_START_COMMAND);
        String valueOf = nullableLong != null ? String.valueOf(nullableLong) : null;
        if (valueOf == null) {
            valueOf = "";
        }
        c7Ze.A08 = valueOf;
        c7Ze.A0A = false;
        c7Ze.A04 = r0.mResultSet.getString(0, 97);
        String string2 = r0.mResultSet.getString(0, 182);
        if (!11T.A0O(nullableBoolean, true)) {
            string2 = null;
        }
        c7Ze.A05 = string2;
        String string3 = r0.mResultSet.getString(0, 181);
        if (!11T.A0O(nullableBoolean, true)) {
            string3 = null;
        }
        c7Ze.A06 = string3;
        c7Ze.A02 = 0S2.A0C;
        Long nullableLong2 = r0.mResultSet.getNullableLong(0, 27);
        if (nullableLong2 == null) {
            nullableLong2 = 0L;
        }
        c7Ze.A00 = nullableLong2.longValue();
        5wW A002 = C5u9.A00(c5pu, new 5uA((C5to) null), null, 0, false);
        if (A002 != null) {
            A002.A02(string == null ? "image/*" : string);
            A002.A0H = 11T.A0O(string, "image/gif");
            photo = new Photo(A002);
        }
        c7Ze.A01 = photo;
        c7Ze.A07 = "";
        return c7Ze;
    }
}
