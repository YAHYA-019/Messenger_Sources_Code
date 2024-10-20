package X;

import android.content.Context;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ezc.class */
public final class Ezc {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A0M;
    public final C00i A0N;
    public final C00i A0O;
    public final C00i A0P;
    public final C00i A0Q;
    public final C00i A0R;
    public final C00i A0S;
    public final C00i A0T;
    public final C00i A0U;
    public final C00i A0V;
    public final C00i A0W;
    public final C00i A0X;
    public final C00i A0Y;
    public final C00i A0Z;
    public final C00i A0a;
    public final C00i A0b;
    public final C00i A0c;
    public final C00i A0d;
    public final C00i A0e;
    public final C00i A0f;
    public final C00i A0g;
    public final C00i A0h;
    public final C00i A0i;
    public final C00i A0j;
    public final C00i A0k;
    public final C00i A0l;
    public final C00i A0m;
    public final C00i A0n;
    public final C00i A0o;
    public final C00i A0p;
    public final C00i A0q;
    public final C00i A0r = AbH.A0M();
    public final C00i A0s;
    public final C00i A0t;
    public final C00i A0u;
    public final C00i A0v;
    public final C00i A0w;
    public final C00i A0x;
    public final C00i A0y;
    public final C00i A0z;
    public final C00i A10;
    public final C00i A11;
    public final C00i A12;
    public final C00i A13;
    public final C00i A14;
    public final FbUserSession A15;
    public final 1EZ A16;

    public Ezc(1BO r302) {
        1EZ r0 = (1EZ) 1Bn.A0E((Context) null, (1BY) null, 16428);
        this.A16 = r0;
        FbUserSession A04 = 1Fw.A04(r0);
        this.A15 = A04;
        this.A02 = 1BQ.A02(100109);
        this.A03 = 1BV.A01((1BY) null, 100260);
        this.A04 = 1BQ.A02(100255);
        this.A06 = 1BQ.A02(16576);
        this.A0V = 1BQ.A02(17081);
        this.A0S = 1BQ.A02(32847);
        this.A12 = 1BQ.A02(16939);
        this.A0y = 1BQ.A02(148033);
        this.A0K = 1BQ.A02(100249);
        this.A0n = 1BQ.A02(100250);
        this.A0O = 1BV.A01((1BY) null, 147460);
        this.A01 = 1BQ.A02(147468);
        this.A0W = 1BQ.A02(16857);
        this.A0E = 1BV.A01((1BY) null, 100275);
        this.A0F = 1BQ.A02(49469);
        this.A08 = 1BQ.A02(100233);
        this.A07 = 1BQ.A02(100229);
        this.A0T = 1BQ.A02(114724);
        this.A0U = 1BQ.A02(99902);
        this.A0k = 1BV.A01((1BY) null, 84892);
        this.A0w = 1BV.A01((1BY) null, 98581);
        this.A0a = 1BQ.A02(100232);
        this.A09 = 1BV.A01((1BY) null, 83822);
        this.A0A = 1BQ.A02(68467);
        this.A0x = AbF.A0B(A04, (1BY) null, 49801);
        this.A0p = 1BV.A01((1BY) null, 85014);
        this.A11 = 1BV.A01((1BY) null, 85016);
        this.A0u = 1BV.A01((1BY) null, 100247);
        this.A0g = 1BQ.A02(67923);
        this.A0B = 1BQ.A02(82555);
        this.A0C = 1BV.A01((1BY) null, 147650);
        this.A0c = 1BQ.A02(83827);
        this.A05 = 1BQ.A02(49281);
        this.A0d = 1BQ.A02(100236);
        this.A0l = 1BQ.A02(131264);
        this.A0s = 1BV.A01((1BY) null, 84425);
        this.A0v = 1BV.A01((1BY) null, 84426);
        this.A0Y = 1BV.A01((1BY) null, 83449);
        this.A0Z = 1BQ.A02(49345);
        this.A0G = 1BQ.A02(49673);
        this.A0b = 1BQ.A02(67508);
        this.A0e = 1BQ.A02(100248);
        this.A0f = 1BV.A01((1BY) null, 100264);
        this.A0i = 1BQ.A02(100256);
        this.A0z = 1BQ.A02(100238);
        this.A10 = 1BQ.A02(16806);
        this.A0j = 1BV.A01((1BY) null, 84029);
        this.A0R = 1BV.A01((1BY) null, 98874);
        this.A0X = 1BQ.A02(131175);
        this.A0m = 1BV.A01((1BY) null, 114894);
        this.A0H = 1BQ.A02(65721);
        this.A0o = 1BQ.A02(67984);
        this.A0q = 1BQ.A02(49285);
        this.A0D = 1BQ.A02(16963);
        this.A0h = 1BQ.A02(16713);
        this.A0M = 1BQ.A02(16545);
        this.A0Q = 1BQ.A02(38);
        this.A0J = 1BQ.A02(16711);
        this.A0I = 1BQ.A02(66064);
        this.A0N = 1BV.A01((1BY) null, 100244);
        this.A0L = 1BQ.A02(65780);
        this.A0t = 1BQ.A02(49615);
        this.A14 = 1BQ.A02(49619);
        this.A0P = 1BQ.A02(16923);
        this.A13 = 1BQ.A02(100237);
        this.A00 = 7zL.A0Q(r302);
    }

    public ArrayList A00(final AuthenticationResult authenticationResult, final EnC enC) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new DW5(authenticationResult, this, enC, DKD.A0j(this.A02)));
        A0s.add(new DW6(authenticationResult, this, enC, DKD.A0j(this.A04)));
        final Class A0j = DKD.A0j(this.A06);
        A0s.add(new G6Y(A0j) { // from class: X.34k
            public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$6";

            {
                String A00 = DKB.A00(42);
            }

            public void A02() {
                1J0 r0 = (1J0) this.A06.get();
                1Sv A00 = r0.A00();
                synchronized (r0) {
                    r0.A01 = true;
                    r0.A00 = A00;
                    r0.A02.A04(A00);
                }
            }
        });
        A0s.add(new DWA(authenticationResult, this, enC, DKD.A0j(this.A0S)));
        A0s.add(new DWD(authenticationResult, this, enC, DKD.A0j(this.A12)));
        A0s.add(new C3196Jm1(authenticationResult, this, enC, DKD.A0j(this.A0W)));
        A0s.add(new DVn(authenticationResult, this, enC, DKD.A0j(this.A0F)));
        A0s.add(new DVo(authenticationResult, this, enC, DKD.A0j(this.A08)));
        A0s.add(new DWK(authenticationResult, this, enC, DKD.A0j(this.A07)));
        A0s.add(new DVp(authenticationResult, this, enC, DKD.A0j(this.A0w)));
        A0s.add(new C3194Jlz(authenticationResult, this, enC, DKD.A0j(this.A0x)));
        A0s.add(new DVq(authenticationResult, this, enC, DKD.A0j(this.A0u)));
        A0s.add(new DVr(authenticationResult, this, enC, DKD.A0j(this.A0B)));
        A0s.add(new DVs(authenticationResult, this, enC, DKD.A0j(this.A0c)));
        A0s.add(new C1519Ajg(authenticationResult, this, enC, DKD.A0j(this.A05)));
        A0s.add(new DVt(authenticationResult, this, enC, DKD.A0j(this.A0d)));
        A0s.add(new DVu(authenticationResult, this, enC, DKD.A0j(this.A0Z)));
        A0s.add(new DVv(authenticationResult, this, enC, DKD.A0j(this.A0G)));
        final Class A0j2 = DKD.A0j(this.A0b);
        A0s.add(new G6Y(A0j2) { // from class: X.34i
            public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$22";

            public void A02() {
                C3QL c3ql = (C3QL) this.A0b.get();
                AuthenticationResult authenticationResult2 = authenticationResult;
                if (authenticationResult2 == null) {
                    0fH.A0k(C3QL.A05, "authenticationResult is null");
                    return;
                }
                0fH.A0h(((AuthenticationResultImpl) authenticationResult2).A03, C3QL.A05, "onAuthComplete:Fresh login authentication bootstrap msys for userId %s");
                1PE.A00((1PE) 1Bi.A03(16627), "msys_auth_complete");
                1Eu r0 = (1Ew) 1Br.A0B(c3ql.A00);
                r0.A0G.add(new 3fY(c3ql));
            }
        });
        A0s.add(new DVw(authenticationResult, this, enC, DKD.A0j(this.A0i)));
        A0s.add(new DVx(authenticationResult, this, enC, DKD.A0j(this.A0z)));
        A0s.add(new DVy(authenticationResult, this, enC, DKD.A0j(this.A0R)));
        A0s.add(new DVz(authenticationResult, this, enC, DKD.A0j(this.A0m)));
        final Class A0j3 = DKD.A0j(this.A0H);
        A0s.add(new G6Y(A0j3) { // from class: X.34j
            public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$27";

            /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
            
                if (r0.A00 == null) goto L8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A02() {
                /*
                    r301 = this;
                    r0 = r301
                    X.Ezc r0 = r303
                    X.00i r0 = r0.A0H
                    java.lang.Object r0 = r0.get()
                    com.facebook.presence.DefaultPresenceManager r0 = (com.facebook.presence.DefaultPresenceManager) r0
                    r302 = r0
                    r0 = r301
                    com.facebook.auth.component.listener.interfaces.AuthenticationResult r0 = r302
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L31
                    r0 = r303
                    com.facebook.auth.protocol.AuthenticationResultImpl r0 = (com.facebook.auth.protocol.AuthenticationResultImpl) r0
                    com.facebook.auth.credentials.FacebookCredentials r0 = r0.A00
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L31
                    r0 = r303
                    java.lang.String r0 = r0.A00
                    r304 = r0
                    r0 = 1
                    r305 = r0
                    r0 = r304
                    if (r0 != 0) goto L36
                L31:
                    r0 = 0
                    r305 = r0
                    r0 = 0
                    r303 = r0
                L36:
                    r0 = r305
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r303 = r0
                    r0 = r302
                    r1 = r303
                    r0.A02 = r1
                    r0 = r302
                    r1 = 0
                    r0.A03 = r1
                    r0 = r302
                    X.1Br r0 = r0.A0T
                    java.lang.Object r0 = X.1Br.A0B(r0)
                    X.1X6 r0 = (X.1X6) r0
                    r304 = r0
                    r0 = r302
                    X.1HN r0 = r0.A0d
                    r303 = r0
                    r0 = r304
                    r1 = r303
                    r0.A04(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C34j.A02():void");
            }
        });
        A0s.add(new DW0(authenticationResult, this, enC, DKD.A0j(this.A0o)));
        A0s.add(new C1520Ajh(authenticationResult, this, enC, DKD.A0j(this.A0q)));
        A0s.add(new DW1(authenticationResult, this, enC, DKD.A0j(this.A0D)));
        A0s.add(new C1521Aji(authenticationResult, this, enC, DKD.A0j(this.A0h)));
        A0s.add(new C3195Jm0(authenticationResult, this, enC, DKD.A0j(this.A0M)));
        A0s.add(new DW2(authenticationResult, this, enC, DKD.A0j(this.A0Q)));
        A0s.add(new DW3(authenticationResult, this, enC, DKD.A0j(this.A0t)));
        return A0s;
    }

    public ArrayList A01(boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        Class A0j = DKD.A0j(this.A02);
        C00i c00i = this.A0r;
        A0s.add(new DVh(this, 1BK.A0V(c00i), A0j, atomicInteger, z));
        A0s.add(new DVi(this, 1BK.A0V(c00i), DKD.A0j(this.A0O), atomicInteger, z));
        A0s.add(new DVK(this, 1BK.A0V(c00i), DKD.A0j(this.A0F), atomicInteger));
        A0s.add(new DVL(this, 1BK.A0V(c00i), DKD.A0j(this.A08), atomicInteger));
        A0s.add(new C1509AjW(this, 1BK.A0V(c00i), DKD.A0j(this.A0p), atomicInteger));
        A0s.add(new C1510AjX(this, 1BK.A0V(c00i), DKD.A0j(this.A11), atomicInteger));
        A0s.add(new DVM(this, 1BK.A0V(c00i), DKD.A0j(this.A0Z), atomicInteger));
        A0s.add(new DVj(this, 1BK.A0V(c00i), DKD.A0j(this.A0e), atomicInteger, z));
        A0s.add(new DVN(this, 1BK.A0V(c00i), DKD.A0j(this.A0Q), atomicInteger));
        return A0s;
    }

    public ArrayList A02(boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        Class A0j = DKD.A0j(this.A02);
        C00i c00i = this.A0r;
        A0s.add(new DVk(this, 1BK.A0V(c00i), A0j, atomicInteger, z));
        A0s.add(new DVl(this, 1BK.A0V(c00i), DKD.A0j(this.A04), atomicInteger, z));
        final Class A0j2 = DKD.A0j(this.A06);
        final QuickPerformanceLogger A0V = 1BK.A0V(c00i);
        A0s.add(new G6Y(this, A0V, A0j2, atomicInteger) { // from class: X.34c
            public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$82";
            public final /* synthetic */ Ezc A00;

            {
                String A00 = DKB.A00(250);
                String A002 = DKB.A00(442);
                this.A00 = this;
            }

            public void A02() {
                1J0 r0 = (1J0) this.A00.A06.get();
                synchronized (r0) {
                    r0.A02.A02();
                }
            }
        });
        A0s.add(new DVO(this, 1BK.A0V(c00i), DKD.A0j(this.A0S), atomicInteger));
        A0s.add(new DVP(this, 1BK.A0V(c00i), DKD.A0j(this.A0a), atomicInteger));
        A0s.add(new DVQ(this, 1BK.A0V(c00i), DKD.A0j(this.A0u), atomicInteger));
        A0s.add(new DVR(this, 1BK.A0V(c00i), DKD.A0j(this.A0d), atomicInteger));
        A0s.add(new DVm(this, 1BK.A0V(c00i), DKD.A0j(this.A0o), atomicInteger, z));
        return A0s;
    }
}
