package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function1;

/* loaded from: Gr3.class */
public final class Gr3 extends GS2 {
    public C00m A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final Ht3 A07;
    public final 2Qn A08;
    public final 54D A09;
    public final 3Fu A0A;
    public final 2Qe A0B;
    public final 2QY A0C;
    public final C15h A0D;
    public final Function1 A0E;
    public final FbUserSession A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr3(FbUserSession fbUserSession, Context context) {
        super("DominantSpeakerParticipantsPresenter");
        1BL.A1F(fbUserSession, context);
        this.A0F = fbUserSession;
        this.A01 = context;
        this.A0D = J5u.A03(this, 49);
        this.A03 = GOn.A0e(context, fbUserSession);
        this.A05 = GOn.A0b(context, fbUserSession);
        this.A02 = GOn.A0a(context, fbUserSession);
        this.A06 = GOn.A0Z(context, fbUserSession);
        this.A04 = GOn.A0V(context, fbUserSession);
        this.A09 = new 54D(fbUserSession, context);
        this.A0E = new J9x(this, 25);
        this.A07 = new Gq8(this, 4);
        this.A0C = Gys.A00(this, 14);
        this.A0A = Gyu.A00(this, 13);
        this.A0B = new Gyx(this, 5);
        this.A08 = IYv.A00(this, 20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (X.GOq.A0b(r301.A03).A02 != 2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Gr3 r301) {
        /*
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r0 = r301
            X.1Br r0 = r0.A06
            r302 = r0
            r0 = r302
            boolean r0 = X.GOq.A1T(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L87
            r0 = r301
            X.54D r0 = r0.A09
            X.8LW r0 = r0.A01()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L27
            r0 = r302
            boolean r0 = X.GOo.A1X(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L87
        L27:
            r0 = 1
            r304 = r0
        L29:
            r0 = r301
            X.1Br r0 = r0.A04
            r302 = r0
            r0 = r302
            boolean r0 = X.GOq.A1S(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L50
            r0 = r301
            X.1Br r0 = r0.A03
            X.IYp r0 = X.GOq.A0b(r0)
            r302 = r0
            r0 = r302
            int r0 = r0.A02
            r305 = r0
            r0 = 2
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L53
        L50:
            r0 = 0
            r306 = r0
        L53:
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            r307 = r0
            r0 = r301
            X.1Br r0 = r0.A05
            X.2QU r0 = X.GOp.A0t(r0)
            com.google.common.collect.ImmutableList r0 = r0.B6o()
            r302 = r0
            r0 = r302
            X.1Du r0 = r0.iterator()
            r308 = r0
        L6b:
            r0 = r308
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8c
            r0 = r308
            java.lang.String r0 = X.I9O.A01(r0)
            r302 = r0
            r0 = r307
            r1 = r302
            com.google.common.collect.ImmutableList$Builder r0 = r0.m11011add(r1)
            goto L6b
        L87:
            r0 = 0
            r304 = r0
            goto L29
        L8c:
            r0 = r307
            com.google.common.collect.ImmutableList r0 = X.1Fj.A01(r0)
            r308 = r0
            X.IZc r0 = new X.IZc
            r302 = r0
            r0 = r302
            r1 = r308
            r2 = r304
            r3 = r306
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r302
            r0.A0Z(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gr3.A00(X.Gr3):void");
    }
}
