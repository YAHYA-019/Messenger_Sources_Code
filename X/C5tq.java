package X;

import com.facebook.user.model.User;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.5tq, reason: invalid class name */
/* loaded from: 5tq.class */
public final class C5tq {
    public static final C5fr A07 = new C5fr(null, null, null, null, null, null, null, ConstantsKt.CAMERA_ID_FRONT, "", null, "", null, new HashSet(), 0, 0, 0);
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;

    public C5tq(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 66013);
        this.A05 = 1Bu.A03(r0, 67013);
        this.A03 = 1Bu.A03(r0, 67566);
        this.A01 = 1Bq.A00(46);
        this.A02 = 1Bu.A03(r0, 81988);
        this.A06 = 1Bu.A03(r0, 16428);
    }

    public static final int A00(C4l9 c4l9, String str) {
        Object obj;
        11T.A0F(str, 1);
        1qX r0 = (1qX) c4l9;
        Iterator it = 07C.A07(0, r0.mResultSet.getCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (str.equals(r0.mResultSet.getString(((Number) obj).intValue(), 0))) {
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public static final int A01(InterfaceC07894l7 interfaceC07894l7, String str) {
        Object obj;
        11T.A0F(str, 1);
        1qX r0 = (1qX) interfaceC07894l7;
        Iterator it = 07C.A07(0, r0.mResultSet.getCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (str.equals(r0.mResultSet.getString(((Number) obj).intValue(), 0))) {
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    private final User A02(InterfaceC07894l7 interfaceC07894l7, String str, int i, int i2) {
        return A05(interfaceC07894l7, this, i, i2) ? (User) ((C5ts) this.A03.A00.get()).A01.get() : ((C5u0) this.A02.A00.get()).A00(C5tv.A00(str, i2), i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        if (r310.length() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (r302 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A03(X.InterfaceC07894l7 r301, com.facebook.user.model.User r302, X.C5tq r303, int r304, int r305) {
        /*
            java.lang.String r0 = ""
            r306 = r0
            r0 = -1
            r307 = r0
            r0 = r304
            r1 = r307
            if (r0 == r1) goto L5e
            r0 = r301
            r308 = r0
            r0 = r301
            X.1qX r0 = (X.1qX) r0
            r308 = r0
            r0 = r308
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            r309 = r0
            r0 = 3
            r307 = r0
            r0 = r309
            r1 = r304
            r2 = r307
            java.lang.String r0 = r0.getString(r1, r2)
            r310 = r0
            r0 = r310
            if (r0 != 0) goto Ld6
            r0 = r302
            if (r0 != 0) goto L61
            r0 = r308
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            r309 = r0
            r0 = 0
            r307 = r0
            r0 = r309
            r1 = r304
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r310 = r0
            r0 = r310
            X.11T.A0A(r0)
            r0 = r303
            r1 = r301
            r2 = r310
            r3 = r304
            r4 = r305
            com.facebook.user.model.User r0 = r0.A02(r1, r2, r3, r4)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L61
        L5e:
            r0 = r306
            return r0
        L61:
            r0 = r303
            X.1Br r0 = r0.A05
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r0 = r302
            com.facebook.user.model.Name r0 = r0.A0X
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L91
            r0 = r310
            java.lang.String r0 = r0.displayName
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L91
            r0 = r310
            int r0 = r0.length()
            r311 = r0
            r0 = r311
            if (r0 != 0) goto Lc6
        L91:
            r0 = r303
            X.1Br r0 = r0.A04
            r310 = r0
            r0 = r310
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.5u1 r0 = (X.C5u1) r0
            r309 = r0
            r0 = 10
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 == r1) goto Lcf
            r0 = 11
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 == r1) goto Lcf
            r0 = r309
            X.01i r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r310 = r0
        Lc6:
            r0 = r310
            if (r0 != 0) goto Ld6
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        Lcf:
            r0 = r306
            r310 = r0
            goto Lc6
        Ld6:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5tq.A03(X.4l7, com.facebook.user.model.User, X.5tq, int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r302.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A04(X.C5tq r301, java.lang.String r302) {
        /*
            r0 = r301
            X.1Br r0 = r0.A05
            r303 = r0
            r0 = r303
            X.00i r0 = r0.A00
            r301 = r0
            r0 = r301
            java.lang.Object r0 = r0.get()
            r0 = r302
            if (r0 == 0) goto L23
            r0 = r302
            int r0 = r0.length()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L23:
            r0 = 1
            r305 = r0
        L26:
            r0 = r305
            if (r0 != 0) goto L55
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI
            java.lang.String r0 = r0.toString()
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L55
            r0 = r301
            java.lang.Object r0 = r0.get()
            r0 = r302
            return r0
        L55:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5tq.A04(X.5tq, java.lang.String):java.lang.String");
    }

    public static final boolean A05(InterfaceC07894l7 interfaceC07894l7, C5tq c5tq, int i, int i2) {
        boolean z = false;
        if (i != -1) {
            if (7 == i2 || 8 == i2) {
                return 11T.A0O(4YU.A11((1qX) interfaceC07894l7, i, 0), 1De.A00(c5tq.A00, 83433));
            }
            if (((1EZ) c5tq.A06.A00.get()).B0v() == null) {
                return ((1qX) interfaceC07894l7).mResultSet.getBoolean(i, 26);
            }
            BjT bjT = (BjT) 1De.A00(c5tq.A00, 82270);
            1qX r0 = (1qX) interfaceC07894l7;
            String A11 = 4YU.A11(r0, i, 0);
            11T.A0A(r0.mResultSet.getString(i, 1));
            z = 11T.A0O(A11, 1De.A00(bjT.A00, 83433));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0565  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C5fr A06(X.InterfaceC07894l7 r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 2082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5tq.A06(X.4l7, int, int):X.5fr");
    }

    public final ImmutableList A07(InterfaceC07894l7 interfaceC07894l7, int i) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int count = ((1qX) interfaceC07894l7).mResultSet.getCount();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= count) {
                ImmutableList build = builder.build();
                11T.A0A(build);
                return build;
            }
            if (!A05(interfaceC07894l7, this, i3, i)) {
                builder.m11011add((Object) A06(interfaceC07894l7, i3, i));
            }
            i2 = i3 + 1;
        }
    }

    public final boolean A08(C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, int i, int i2, int i3) {
        boolean z;
        if (i != -1) {
            z = A05(interfaceC07894l7, this, i, i3);
        } else {
            z = false;
            if (i2 != -1) {
                return ((1qX) c4l9).mResultSet.getBoolean(i2, 4);
            }
        }
        return z;
    }
}
