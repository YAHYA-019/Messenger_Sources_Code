package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.EnumMap;

/* renamed from: X.6w5, reason: invalid class name */
/* loaded from: 6w5.class */
public final class C6w5 {
    public final C6qj A00;
    public final 1Br A01;
    public final PrivacyContext A02;
    public final FbUserSession A03;

    public C6w5(FbUserSession fbUserSession) {
        this.A03 = fbUserSession;
        this.A00 = (C6qj) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67463);
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", "195771409088126");
        11T.A0A(newPrivacyContextNative);
        this.A02 = newPrivacyContextNative;
        this.A01 = 1Bq.A00(46);
    }

    public static final void A00(N9f n9f, C6w5 c6w5, SettableFuture settableFuture, long j) {
        C95t c95t;
        C95t c95t2;
        String A03;
        1qX r0 = (1qX) n9f;
        int A00 = 1qX.A00(r0);
        if (A00 > 0) {
            int i = A00 - 1;
            int integer = r0.mResultSet.getInteger(i, 1);
            if (integer == 4) {
                c95t = C95t.A04;
            } else if (integer == 5) {
                c95t = C95t.A02;
            } else if (integer != 7) {
                return;
            } else {
                c95t = C95t.A03;
            }
            String string = r0.mResultSet.getString(i, 0);
            11T.A0A(string);
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            EnumMap enumMap = new EnumMap(C95t.class);
            while (-1 < i) {
                int integer2 = r0.mResultSet.getInteger(i, 1);
                if (integer2 == 4) {
                    c95t2 = C95t.A04;
                } else if (integer2 == 5) {
                    c95t2 = C95t.A02;
                } else if (integer2 == 7) {
                    c95t2 = C95t.A03;
                } else {
                    i--;
                }
                Number number = (Number) enumMap.get(c95t2);
                if (number == null) {
                    number = 4YU.A0k();
                }
                AnonymousClass001.A1A(c95t2, enumMap, number.intValue() + 1);
                long j2 = r0.mResultSet.getLong(i, 2);
                String string2 = r0.mResultSet.getString(i, 3);
                String string3 = r0.mResultSet.getString(i, 4);
                Long nullableLong = r0.mResultSet.getNullableLong(i, 5);
                if (A0s.size() < 3) {
                    Long valueOf = Long.valueOf(j2);
                    if (!A0s.contains(valueOf) && (A03 = ((0AC) 1Br.A0B(c6w5.A01)).A03(nullableLong, string2, string3)) != null) {
                        A0s2.add(A03);
                        A0s.add(valueOf);
                    }
                }
                i--;
            }
            settableFuture.set(enumMap.isEmpty() ^ true ? new C6va(new 8Lu(c95t, enumMap), string, A0s2, 0, j, true) : null);
        }
    }

    public static final void A01(N9g n9g, C6w5 c6w5, SettableFuture settableFuture, long j) {
        String A03;
        1qX r0 = (1qX) n9g;
        int A00 = 1qX.A00(r0);
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int i = A00 - 1;
        int i2 = i;
        while (true) {
            int i3 = i2;
            if (-1 >= i3) {
                break;
            }
            long j2 = r0.mResultSet.getLong(i3, 1);
            String string = r0.mResultSet.getString(i3, 2);
            String string2 = r0.mResultSet.getString(i3, 3);
            Long nullableLong = r0.mResultSet.getNullableLong(i3, 4);
            if (A0s.size() < 3) {
                Long valueOf = Long.valueOf(j2);
                if (!A0s.contains(valueOf) && (A03 = ((0AC) 1Br.A0B(c6w5.A01)).A03(nullableLong, string, string2)) != null) {
                    A0s2.add(A03);
                    A0s.add(valueOf);
                }
            }
            if (A0s.size() >= 3) {
                break;
            } else {
                i2 = i3 - 1;
            }
        }
        settableFuture.set(A00 > 0 ? new C6va(null, r0.mResultSet.getString(i, 0), A0s2, A00, j, true) : null);
    }
}
