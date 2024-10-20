package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.user.model.UserKey;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: Dza.class */
public final class Dza extends C1rj {
    public static final CallerContext A05 = CallerContext.A0B("ThreadTileDrawableComponentSpec");
    public int A00;
    public int A01;
    public C2fr A02;
    public boolean A03;
    public boolean A04;

    public Dza() {
        super("ThreadTileDrawableComponent");
        this.A03 = false;
        this.A00 = 255;
        this.A01 = 0;
    }

    public static DuP A00(1Iw r301) {
        return new DuP(r301, new Dza());
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        5YF r0 = new 5YF(context, (AttributeSet) null, 0);
        Preconditions.checkState(AnonymousClass001.A1O(r0.A02));
        r0.A01 = 2;
        r0.A00 = 0.5f;
        return r0;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        Dza dza = (Dza) r302;
        Dza dza2 = (Dza) r303;
        Integer num = null;
        C2fr c2fr = dza == null ? null : dza.A02;
        C2fr c2fr2 = dza2 == null ? null : dza2.A02;
        Boolean valueOf = dza == null ? null : Boolean.valueOf(dza.A03);
        Boolean valueOf2 = dza2 == null ? null : Boolean.valueOf(dza2.A03);
        Boolean A0d = dza == null ? null : 1BK.A0d();
        Boolean A0d2 = dza2 == null ? null : 1BK.A0d();
        Integer valueOf3 = dza == null ? null : Integer.valueOf(dza.A01);
        if (dza2 != null) {
            num = Integer.valueOf(dza2.A01);
        }
        boolean z = true;
        if (valueOf3.equals(num) && valueOf.equals(valueOf2) && A0d.equals(A0d2)) {
            z = !c2fr.equals(c2fr2);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.274, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ AnonymousClass274 A10() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        Integer valueOf = Integer.valueOf(c27g.A00());
        Fih fih = (Fih) anonymousClass274;
        fih.A01 = Integer.valueOf(c27g.A05());
        fih.A00 = valueOf;
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ListenableFuture ASL;
        5YF r0 = (5YF) obj;
        C2fr c2fr = this.A02;
        boolean z = this.A04;
        int i = this.A01;
        Fih fih = (Fih) anonymousClass274;
        Integer num = fih.A01;
        Integer num2 = fih.A00;
        1Bi.A03(83603);
        Executor executor = (Executor) 1Bi.A03(16472);
        Object A03 = 1Bi.A03(66123);
        c2fr.getClass();
        int Azi = c2fr.Azi();
        r0.A04(Azi);
        if (i != 0) {
            r0.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        r0.A06 = false;
        r0.A07 = z;
        2rB r02 = 2rB.A03;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= Azi) {
                return;
            }
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            Uri Alb = c2fr.Alb(i3, intValue, intValue2);
            ImmutableList BIe = c2fr.BIe();
            UserKey userKey = (BIe == null || BIe.size() <= i3) ? null : (UserKey) BIe.get(i3);
            3xU B56 = c2fr.B56();
            if (B56 == null) {
                ASL = 1Kd.A0A(c2fr.BIP(intValue, intValue2).get(i3));
            } else if (userKey != null) {
                ASL = B56.ASL(userKey.id);
            } else {
                i2 = i3 + 1;
            }
            1Kd.A0F(new D4d(Alb, r02, A03, userKey, r0, i3, 1), ASL, executor);
            i2 = i3 + 1;
        }
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        5YF r0 = (5YF) obj;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= r0.A02) {
                r0.setColorFilter(null);
                r0.setAlpha(255);
                return;
            } else {
                r0.A03(i2);
                i = i2 + 1;
            }
        }
    }

    @Override // X.C1rj
    public void A1O(AnonymousClass274 anonymousClass274, AnonymousClass274 anonymousClass2742) {
        Fih fih = (Fih) anonymousClass274;
        Fih fih2 = (Fih) anonymousClass2742;
        fih.A00 = fih2.A00;
        fih.A01 = fih2.A01;
    }

    @Override // X.C1rj
    public boolean A1X() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Dza dza = (Dza) r302;
            if (this.A03 != dza.A03 || this.A04 != dza.A04 || this.A00 != dza.A00) {
                return false;
            }
            C2fr c2fr = this.A02;
            C2fr c2fr2 = dza.A02;
            if (c2fr != null) {
                if (!c2fr.equals(c2fr2)) {
                    return false;
                }
            } else if (c2fr2 != null) {
                return false;
            }
            if (this.A01 != dza.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1rj, X.C1rk
    public boolean ADe() {
        return true;
    }

    @Override // X.C1rj, X.C1rk
    public int CXj() {
        return 6;
    }
}
