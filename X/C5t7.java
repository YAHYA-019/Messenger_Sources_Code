package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.5t7, reason: invalid class name */
/* loaded from: 5t7.class */
public final class C5t7 implements C5lk {
    public static final C5t7 A00 = new Object();

    /* JADX WARN: Type inference failed for: r307v4, types: [X.5fq, X.948] */
    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        C5fq c5fq = null;
        C5fq c5fq2 = c5fq;
        if (c5pu != null) {
            1qX r0 = (1qX) c5pu;
            c5fq2 = c5fq;
            if (r0.mResultSet.getCount() == 1) {
                int AXc = c5pu.AXc(0);
                Integer nullableInteger = r0.mResultSet.getNullableInteger(0, 38);
                c5fq2 = c5fq;
                if (nullableInteger != null) {
                    c5fq2 = c5fq;
                    if (nullableInteger.intValue() == 3013) {
                        c5fq2 = c5fq;
                        if (AXc == 7) {
                            Long nullableLong = r0.mResultSet.getNullableLong(0, ActionId.SERVICE_ON_START_COMMAND);
                            c5fq2 = c5fq;
                            if (nullableLong != null) {
                                String valueOf = String.valueOf(nullableLong);
                                c5fq2 = c5fq;
                                if (valueOf != null) {
                                    String string = r0.mResultSet.getString(0, 28);
                                    5wW A002 = C5u9.A00(c5pu, new 5uA((C5to) null), null, 0, false);
                                    c5fq2 = c5fq;
                                    if (A002 != null) {
                                        A002.A02(string == null ? "image/*" : string);
                                        A002.A0H = 11T.A0O(string, "image/gif");
                                        Photo photo = new Photo(A002);
                                        ?? c5fq3 = new C5fq();
                                        c5fq3.A01 = valueOf;
                                        c5fq3.A00 = photo;
                                        c5fq2 = c5fq3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return c5fq2;
    }
}
