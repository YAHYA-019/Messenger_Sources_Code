package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.Arrays;

/* loaded from: Hqi.class */
public final class Hqi {
    public I0B A00;
    public final FbUserSession A01;
    public final Ro6 A02;
    public final IS0 A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final 1De A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public volatile Hfi A0F;
    public volatile JJo A0G;
    public volatile JJo A0H;

    public Hqi(FbUserSession fbUserSession, Hi6 hi6, RE8 re8, 1De r305) {
        11T.A0F(fbUserSession, 2);
        this.A09 = r305;
        1BY r0 = r305.A00;
        this.A0E = 1Bu.A03(r0, 115535);
        this.A0A = 1Bq.A00(115541);
        this.A0D = 1Bu.A03(r0, 115543);
        this.A0C = 1Bq.A00(115546);
        this.A0B = 1Bu.A03(r0, 115532);
        1Br A03 = 1Bu.A03(r0, 115545);
        this.A05 = A03;
        1Br A032 = 1Bu.A03(r0, 115542);
        this.A06 = A032;
        this.A07 = 1Bu.A03(r0, 82205);
        this.A08 = 1Bu.A03(r0, 115540);
        this.A04 = 1Bu.A03(r0, 115544);
        C1F6 c1f6 = (C1F6) 1Bn.A0E((Context) null, r0, 1029);
        this.A01 = fbUserSession;
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            IS0 is0 = new IS0(fbUserSession, hi6, re8);
            FbInjector.A04(A01);
            this.A03 = is0;
            IS1 is1 = (IS1) A03.get();
            synchronized (is1.A07) {
                is1.A01 = is0;
            }
            IS1 is12 = (IS1) A03.get();
            synchronized (is12.A07) {
                AbR A0V = DKC.A0V(is12.A05);
                Context A012 = FbInjector.A01();
                AbL.A0y(A0V);
                try {
                    IRv iRv = new IRv(re8, 7zQ.A0S(A0V));
                    1Bn.A0K();
                    FbInjector.A04(A012);
                    is12.A00 = iRv;
                } finally {
                    1Bn.A0K();
                    FbInjector.A04(A012);
                }
            }
            this.A02 = new Ro6((IRu) A032.get(), re8);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public final 6TJ[] A00() {
        6TJ[] r0;
        IS1 is1 = (IS1) this.A05.get();
        synchronized (is1.A07) {
            IRv iRv = is1.A00;
            iRv.getClass();
            6TJ[] r02 = iRv.A08;
            6TJ r03 = is1.A06;
            int length = r02.length;
            Object[] copyOf = Arrays.copyOf(r02, length + 1);
            copyOf[length] = r03;
            r0 = (6TJ[]) copyOf;
        }
        return r0;
    }
}
