package com.facebook.fbavatar.artifacto.datasource;

import X.07C;
import X.07E;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1Lm;
import X.1Uj;
import X.1qX;
import X.4YU;
import X.4YV;
import X.7zL;
import X.7zP;
import X.7zQ;
import X.8KT;
import X.9Gu;
import X.AnonymousClass046;
import X.C1A3;
import X.C1qL;
import X.C6ku;
import X.C8z8;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: AvatarArtifactMsys.class */
public final class AvatarArtifactMsys {
    public final long A00;
    public final C6ku A01;
    public final 1Br A02;
    public final 1Br A03;
    public final AnonymousClass046 A04;
    public final FbUserSession A05;
    public final 1De A06;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.6ku, com.facebook.msys.mca.MailboxFeature] */
    public AvatarArtifactMsys(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        this.A05 = fbUserSession;
        1BY r0 = r303.A00;
        1Br A03 = 1Lm.A03(fbUserSession, r0, 16686);
        this.A03 = A03;
        C1qL c1qL = C6ku.A00;
        this.A01 = new MailboxFeature((1Uj) 1Br.A0B(A03));
        this.A02 = 1Bu.A03(r0, 68907);
        this.A04 = (AnonymousClass046) 1Bn.A0E((Context) null, r0, 16669);
        this.A00 = TimeUnit.SECONDS.toMillis(1Br.A07(((9Gu) 1Br.A0B(this.A02)).A00).Auy(72621347150692687L));
    }

    public static final List A00(C8z8 c8z8) {
        07E A07 = 07C.A07(0, 1qX.A00(c8z8));
        ArrayList A1E = C1A3.A1E(A07);
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            int A06 = 7zL.A06(it);
            String A11 = 4YU.A11(c8z8, A06, 0);
            11T.A0A(A11);
            String A0i = 7zP.A0i(c8z8, A06);
            11T.A0A(A0i);
            int A0F = (int) 7zQ.A0F(c8z8, A06);
            int A0G = (int) 7zQ.A0G(c8z8, A06);
            String A0o = 7zP.A0o(c8z8, A06);
            String A0k = 7zP.A0k(c8z8, A06);
            String A0l = 7zP.A0l(c8z8, A06);
            Long nullableLong = ((1qX) c8z8).mResultSet.getNullableLong(A06, 6);
            String A0n = 7zP.A0n(c8z8, A06);
            String A0p = 7zP.A0p(c8z8, A06);
            11T.A0A(A0p);
            String A112 = 4YU.A11(c8z8, A06, 10);
            11T.A0A(A112);
            String A0r = 7zP.A0r(c8z8, A06);
            Long nullableLong2 = ((1qX) c8z8).mResultSet.getNullableLong(A06, 12);
            Long nullableLong3 = ((1qX) c8z8).mResultSet.getNullableLong(A06, 13);
            Integer num = null;
            Integer valueOf = nullableLong3 != null ? Integer.valueOf((int) nullableLong3.longValue()) : null;
            Long nullableLong4 = ((1qX) c8z8).mResultSet.getNullableLong(A06, 14);
            Integer valueOf2 = nullableLong4 != null ? Integer.valueOf((int) nullableLong4.longValue()) : null;
            String A0u = 7zP.A0u(c8z8, A06);
            11T.A0A(A0u);
            String A0v = 7zP.A0v(c8z8, A06);
            11T.A0A(A0v);
            String A0q = 4YV.A0q(c8z8, A06);
            Long nullableLong5 = ((1qX) c8z8).mResultSet.getNullableLong(A06, 18);
            Long nullableLong6 = ((1qX) c8z8).mResultSet.getNullableLong(A06, 19);
            Integer valueOf3 = nullableLong6 != null ? Integer.valueOf((int) nullableLong6.longValue()) : null;
            Long nullableLong7 = ((1qX) c8z8).mResultSet.getNullableLong(A06, 20);
            if (nullableLong7 != null) {
                num = Integer.valueOf((int) nullableLong7.longValue());
            }
            String string = ((1qX) c8z8).mResultSet.getString(A06, 21);
            11T.A0A(string);
            A1E.add(new 8KT(valueOf, valueOf2, valueOf3, num, nullableLong, nullableLong2, nullableLong5, ((1qX) c8z8).mResultSet.getNullableLong(A06, 22), A11, A0i, A0o, A0k, A0l, A0n, A0p, A112, A0r, A0u, A0v, A0q, string, 7zP.A0w(c8z8, A06), A0F, A0G));
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        if (r310 != null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(java.lang.String r302, java.lang.String r303, java.util.List r304, X.0DR r305, int r306) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.artifacto.datasource.AvatarArtifactMsys.A01(java.lang.String, java.lang.String, java.util.List, X.0DR, int):java.lang.Object");
    }
}
