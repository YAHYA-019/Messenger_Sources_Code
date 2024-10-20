package X;

import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.9h9, reason: invalid class name */
/* loaded from: 9h9.class */
public final class C9h9 {
    public final 1Br A00;
    public final 1De A01;
    public final 7SN A02;

    public C9h9(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A00 = 7zL.A0S(fbUserSession, r303, 65962);
        this.A02 = new A4O(this);
    }

    public static final int A00(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public final AnonymousClass690 A01(4lA r302, int i) {
        String str;
        7EG r0 = new 7EG();
        r0.A07 = this.A02;
        r0.A0M = 7zP.A0r(r302, i);
        r0.A08 = new A4R(r302, this, i);
        r0.A06 = ((1qX) r302).mResultSet.getInteger(i, 3);
        r0.A01(7zP.A0n(r302, i));
        Long nullableLong = ((1qX) r302).mResultSet.getNullableLong(i, 41);
        if (nullableLong == null) {
            nullableLong = 0L;
        }
        r0.A0W = AnonymousClass001.A1P((nullableLong.longValue() > 0L ? 1 : (nullableLong.longValue() == 0L ? 0 : -1)));
        String A0s = 7zP.A0s(r302, i);
        String A0t = 7zP.A0t(r302, i);
        r0.A09 = (A0s == null || A0t == null) ? null : new 8NW(C7m0.A00(A0t), A0s);
        r0.A0R = 7zP.A0m(r302, i);
        int A02 = 7zP.A02(r302, 0);
        int i2 = 0;
        if (A02 != 15) {
            switch (A02) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 9;
                    break;
                case 10:
                    i2 = 10;
                    break;
                case 11:
                    i2 = 11;
                    break;
            }
        } else {
            i2 = 15;
        }
        r0.A01 = i2;
        r0.A0C = ((1qX) r302).mResultSet.getNullableLong(i, 29);
        String string = ((1qX) r302).mResultSet.getString(i, 30);
        str = "";
        if (string == null) {
            string = str;
        }
        r0.A02(string);
        r0.A02 = A00(((1qX) r302).mResultSet.getInteger(i, 32));
        String string2 = ((1qX) r302).mResultSet.getString(i, 31);
        if (string2 == null) {
            string2 = str;
        }
        r0.A03(string2);
        r0.A0D = ((1qX) r302).mResultSet.getNullableLong(i, 33);
        String string3 = ((1qX) r302).mResultSet.getString(i, 34);
        if (string3 == null) {
            string3 = str;
        }
        r0.A04(string3);
        r0.A03 = A00(((1qX) r302).mResultSet.getInteger(i, 36));
        String string4 = ((1qX) r302).mResultSet.getString(i, 35);
        if (string4 == null) {
            string4 = str;
        }
        r0.A0J = string4;
        C1pq.A08("cta2Type", string4);
        r0.A0E = ((1qX) r302).mResultSet.getNullableLong(i, 37);
        String string5 = ((1qX) r302).mResultSet.getString(i, 38);
        if (string5 == null) {
            string5 = str;
        }
        r0.A0K = string5;
        C1pq.A08("cta3Title", string5);
        r0.A04 = A00(((1qX) r302).mResultSet.getInteger(i, 40));
        String string6 = ((1qX) r302).mResultSet.getString(i, 39);
        r0.A0L = string6 != null ? string6 : "";
        r0.A0N = ((1qX) r302).mResultSet.getString(i, 19);
        r0.A0O = ((1qX) r302).mResultSet.getString(i, 21);
        r0.A0P = ((1qX) r302).mResultSet.getString(i, 22);
        r0.A0Q = ((1qX) r302).mResultSet.getString(i, 24);
        r0.A0S = ((1qX) r302).mResultSet.getString(i, 47);
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        AnonymousClass207 anonymousClass207 = 8NR.A02;
        8NR r02 = new 8NR(((1qX) r302).mResultSet.getLong(i, 0), ((1qX) r302).mResultSet.getNullableLong(i, 41));
        11T.A0F(anonymousClass207, 0);
        AnonymousClass201 A00 = C1zz.A00();
        A00.A01(anonymousClass207, r02);
        r0.A00(A00.A00());
        int integer = ((1qX) r302).mResultSet.getInteger(i, 2);
        int i3 = 0;
        if (integer != 0) {
            if (integer == 1) {
                i3 = 1;
            } else if (integer == 2) {
                i3 = 2;
            } else if (integer == 3) {
                i3 = 3;
            }
        }
        r0.A00 = i3;
        return new AnonymousClass690(r0);
    }
}
