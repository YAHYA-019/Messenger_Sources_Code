package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B28.class */
public final class B28 extends 2Yf {
    public 5zD A00;
    public 9ZS A01;
    public 63E A02;
    public 6kI A03;
    public MigColorScheme A04;

    public B28() {
        super("ReviewSelectedMessagesListSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        9ZS r0 = this.A01;
        MigColorScheme migColorScheme = this.A04;
        boolean A1W = 1BL.A1W(c1qb, r0);
        int size = r0.A01.A01.size();
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        AwS A00 = B0H.A00(c1qb);
        B0H b0h = A00.A01;
        b0h.A06 = 7zL.A12(A00, 2131965653);
        A00.A02.set(A1W ? 1 : 0);
        Context context = ((1Iw) c1qb).A0D;
        Resources resources = context.getResources();
        Integer valueOf = Integer.valueOf(size);
        b0h.A05 = resources.getQuantityString(2131820793, size, valueOf);
        A00.A2X(migColorScheme);
        A0I.A05(A00.A2W());
        A0l.A00(A0I);
        2hP A0I2 = 2hO.A0I(c1qb);
        8TR A002 = C5z5.A00(c1qb);
        A002.A2a(7zN.A0u(c1qb, valueOf, 2131965652));
        A002.A2Z(migColorScheme);
        A0I2.A05(A002.A2W());
        A0l.A00(A0I2);
        C2hf A0I3 = C2he.A0I(c1qb);
        A0I3.A06(r0.A00(context));
        A0I3.A04(2Yg.A04(c1qb, B2D.class, "SelectMessagesMessageListSection"));
        A0I3.A05(2Yg.A03(c1qb, B2D.class, "SelectMessagesMessageListSection"));
        A0l.A00(A0I3);
        2Ys r02 = A0l.A00;
        11T.A0A(r02);
        return r02;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [X.2hj, java.lang.Object] */
    public Object A0e(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -785606093) {
            C2hu c2hu = (C2hu) obj;
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) c2hu.A01;
            AnonymousClass624 anonymousClass6242 = (AnonymousClass624) c2hu.A00;
            1BL.A1F(anonymousClass624, anonymousClass6242);
            return Boolean.valueOf(C7l3.A00(anonymousClass624, anonymousClass6242));
        }
        if (i != 1601376001) {
            return null;
        }
        B28 b28 = r302.A00.A01;
        AnonymousClass624 anonymousClass6243 = (AnonymousClass624) ((C2i6) obj).A01;
        B28 b282 = b28;
        63E r0 = b282.A02;
        6kI r02 = b282.A03;
        5zD r03 = b282.A00;
        7zT.A1W(r0, r02, r03, anonymousClass6243);
        return 7zM.A0t(new AxR(r03, r0, r02, anonymousClass6243), (C2hj) new Object());
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B28 b28 = (B28) r302;
            MigColorScheme migColorScheme = this.A04;
            MigColorScheme migColorScheme2 = b28.A04;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            63E r0 = this.A02;
            63E r02 = b28.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            6kI r03 = this.A03;
            6kI r04 = b28.A03;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            9ZS r05 = this.A01;
            9ZS r06 = b28.A01;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            5zD r07 = this.A00;
            5zD r08 = b28.A00;
            if (r07 != null) {
                if (!r07.equals(r08)) {
                    return false;
                }
            } else if (r08 != null) {
                return false;
            }
        }
        return true;
    }
}
