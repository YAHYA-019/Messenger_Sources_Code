package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.forker.Process;
import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.base.Objects;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.649, reason: invalid class name */
/* loaded from: 649.class */
public final class AnonymousClass649 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public SparseArray A03;
    public 06Z A04;
    public FbUserSession A05;
    public 2S4 A06;
    public 1LI A07;
    public 1LI A08;
    public 5zD A09;
    public C63s A0A;
    public 64W A0B;
    public 63D A0C;
    public C62q A0D;
    public AnonymousClass647 A0E;
    public 63X A0F;
    public AnonymousClass622 A0G;
    public 63V A0H;
    public 63W A0I;
    public Capabilities A0J;
    public C15h A0K;
    public C15h A0L;
    public boolean A0M;
    public boolean A0N;

    public AnonymousClass649() {
        super("MessageCachedTextComponent");
    }

    public static String A00(AnonymousClass622 anonymousClass622, Capabilities capabilities) {
        boolean A06 = anonymousClass622.A06(capabilities);
        Message message = anonymousClass622.A03;
        return (A06 ? message.A0G() : message.A0F()).A00;
    }

    public static boolean A01(1Iw r301, 64J r302, final 64K r303, AnonymousClass640 anonymousClass640, 64I r305, AnonymousClass622 anonymousClass622, Capabilities capabilities, String str, C15h c15h, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        if (r305 == null) {
            if (!anonymousClass640.A06(anonymousClass622)) {
                return false;
            }
        } else if (Objects.equal(A00(anonymousClass622, capabilities), str) && z == z7 && z2 == z8 && z3 == z9 && z4 == z10 && z6 == z11) {
            return false;
        }
        String A00 = A00(anonymousClass622, capabilities);
        synchronized (r302) {
            r302.A02 = c15h;
            r302.A01 = A00;
            r302.A05 = z;
            r302.A03 = z2;
            r302.A04 = z5;
        }
        if (TriState.YES == r303.A05.get()) {
            String concat = "Scheduling task".concat(": ");
            String str2 = r302.A08;
            if (str2 == null || r302.A09 == null) {
                str2 = "null";
            }
            0fH.A0j("MessageComponentSpannableOrchestrator", concat.concat(str2));
        }
        final C6nf c6nf = new C6nf(r302);
        ((Executor) r303.A01.get()).execute(new Runnable() { // from class: X.6ng
            public static final String __redex_internal_original_name = "MessageComponentSpannableOrchestrator$3";

            @Override // java.lang.Runnable
            public void run() {
                C15h c15h2;
                64K r0 = r303;
                C6nf c6nf2 = c6nf;
                if (C6nf.A00(c6nf2)) {
                    return;
                }
                64J r02 = c6nf2.A02;
                synchronized (r02) {
                    c15h2 = r02.A02;
                }
                c6nf2.A00 = (64I) c15h2.get();
                64K.A00(c6nf2, r0, "Finished task");
                ArrayDeque arrayDeque = r0.A03;
                synchronized (arrayDeque) {
                    arrayDeque.addLast(c6nf2);
                }
                if (r0.A04.compareAndSet(false, true)) {
                    ((1FP) r0.A00.get()).D3D(3Ds.A03, 0S2.A01, r0.A02, "MessageComponentSpannableOrchestrator.updateRunnable");
                }
            }
        });
        if (r301.A02 != null) {
            r301.A0F(new C2l4(new Object[]{Boolean.valueOf(z)}, (-1) << (-1)));
        }
        if (r301.A02 != null) {
            r301.A0F(new C2l4(new Object[]{Boolean.valueOf(z2)}, -2147483644));
        }
        if (r301.A02 != null) {
            r301.A0F(new C2l4(new Object[]{Boolean.valueOf(z3)}, Process.WAIT_RESULT_STOPPED));
        }
        String A002 = A00(anonymousClass622, capabilities);
        if (r301.A02 != null) {
            r301.A0F(new C2l4(new Object[]{A002}, -2147483642));
        }
        if (r301.A02 != null) {
            r301.A0F(new C2l4(new Object[]{Boolean.valueOf(z5)}, -2147483643));
        }
        if (r301.A02 == null) {
            return true;
        }
        r301.A0F(new C2l4(new Object[]{Boolean.valueOf(z6)}, -2147483645));
        return true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, this.A0J, this.A0I, this.A0B, this.A0C, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A05, this.A04, this.A0G, this.A0D, this.A0F, Boolean.valueOf(this.A0M), this.A03, this.A0A, this.A0K, Boolean.valueOf(this.A0N), this.A0H, 1BK.A0d(), this.A0E, this.A0L, this.A09, this.A06, this.A08};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        AnonymousClass649 anonymousClass649 = (AnonymousClass649) super.A0l();
        1LI r0 = anonymousClass649.A07;
        1LI r304 = null;
        anonymousClass649.A07 = r0 != null ? r0.A0l() : null;
        1LI r02 = anonymousClass649.A08;
        if (r02 != null) {
            r304 = r02.A0l();
        }
        anonymousClass649.A08 = r304;
        return anonymousClass649;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z;
        Integer num;
        Integer num2;
        64B A00 = r302.A06().A00();
        FbUserSession fbUserSession = this.A05;
        AnonymousClass622 anonymousClass622 = this.A0G;
        63V r0 = this.A0H;
        Capabilities capabilities = this.A0J;
        5zD r02 = this.A09;
        C62q c62q = this.A0D;
        63D r03 = this.A0C;
        C15h c15h = this.A0L;
        AnonymousClass647 anonymousClass647 = this.A0E;
        SparseArray sparseArray = this.A03;
        06Z r04 = this.A04;
        2S4 r05 = this.A06;
        64W r06 = this.A0B;
        boolean z2 = this.A0N;
        63W r07 = this.A0I;
        63X r08 = this.A0F;
        boolean z3 = this.A0M;
        C15h c15h2 = this.A0K;
        1LI r09 = this.A07;
        1LI r010 = this.A08;
        C63s c63s = this.A0A;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        String str = A00.A04;
        boolean z4 = A00.A05;
        boolean z5 = A00.A09;
        boolean z6 = A00.A06;
        boolean z7 = A00.A07;
        boolean z8 = A00.A0A;
        boolean z9 = A00.A08;
        64I r011 = A00.A03;
        64I r337 = A00.A02;
        64E r012 = A00.A00;
        64J r013 = A00.A01;
        Context context = r302.A0D;
        63K A0O = ((82O) 1Bn.A0E(context, (1BY) null, 445)).A0O(fbUserSession);
        64C r014 = (64C) 1Bi.A03(67144);
        64D r015 = (64D) 1Bi.A03(49947);
        64K r016 = (64K) 1Bi.A03(49948);
        AnonymousClass640 anonymousClass640 = (AnonymousClass640) 1Lo.A04(context, fbUserSession, (1BY) null, 65879);
        r013.A00(r302);
        boolean z10 = anonymousClass622.A0l;
        boolean A06 = anonymousClass622.A06(capabilities);
        synchronized (r014) {
            z = r014.A02;
        }
        Message message = anonymousClass622.A03;
        boolean A01 = r015.A01(message);
        boolean z11 = !message.A0v.isEmpty();
        boolean z12 = false;
        if (2oI.A06(anonymousClass622.A05) && anonymousClass622.A04.A03("public_channels_is_user_subscribed")) {
            z12 = true;
        }
        synchronized (r012) {
            num = r012.A00;
        }
        Integer num3 = 0S2.A00;
        if (num != num3 || (Objects.equal(A00(anonymousClass622, capabilities), str) && A01 == z5 && z11 == z6 && z10 == z7 && A06 == z8 && z12 == z9)) {
            synchronized (r012) {
                num2 = r012.A00;
            }
            if (num2 == 0S2.A0C) {
                A01(r302, r013, r016, anonymousClass640, r011, anonymousClass622, capabilities, str, c15h, z, A01, z11, z10, A06, z12, z4, z5, z6, z7, z9);
            }
        } else {
            r337 = c15h2 != null ? (64I) c15h2.get() : 63K.A00((Context) null, (06Z) null, A0O.A01, (5zD) null, (63D) null, c62q, A0O, anonymousClass622, (6ML) null, (AnonymousClass639) null, (C5un) null, (Capabilities) null, num3);
            if (r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{r337}, -2147483641));
            }
            String A002 = A00(anonymousClass622, capabilities);
            if (r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{A002}, -2147483642));
            }
            if (r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{Boolean.valueOf(z)}, (-1) << (-1)));
            }
            if (r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{Boolean.valueOf(A01)}, -2147483644));
            }
            if (r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{Boolean.valueOf(z11)}, Process.WAIT_RESULT_STOPPED));
            }
            if (r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{Boolean.valueOf(A06)}, -2147483643));
            }
            if (r302.A02 != null) {
                r302.A0F(new C2l4(new Object[]{Boolean.valueOf(z12)}, -2147483645));
            }
        }
        if (r011 != null) {
            r337 = r011;
        }
        AnonymousClass857 anonymousClass857 = new AnonymousClass857(r302, new 64M());
        anonymousClass857.A2Y(fbUserSession);
        anonymousClass857.A2f(anonymousClass622);
        anonymousClass857.A2g(r0);
        anonymousClass857.A2h(capabilities);
        anonymousClass857.A2e(r337);
        anonymousClass857.A2b(r02);
        anonymousClass857.A2d(c62q);
        64M r017 = anonymousClass857.A01;
        r017.A0I = r07;
        r017.A0F = r08;
        anonymousClass857.A2c(r03);
        r017.A0A = c63s;
        anonymousClass857.A2a(anonymousClass647.A00(r337));
        r017.A06 = r09 == null ? null : r09.A0l();
        r017.A08 = r010 == null ? null : r010.A0l();
        anonymousClass857.A1f(sparseArray);
        anonymousClass857.A1v(1LI.A02(r302, AnonymousClass649.class, 0S2.A01, "MessageCachedTextComponent", (Object[]) null, 1803022739));
        r017.A0K = z3;
        anonymousClass857.A2X(r04);
        anonymousClass857.A2Z(r05);
        r017.A00 = i;
        r017.A01 = i2;
        r017.A02 = i3;
        r017.A0L = z2;
        r017.A0B = r06;
        return anonymousClass857.A2V();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0132, code lost:
    
        if (r0.A04.A03("public_channels_is_user_subscribed") == false) goto L17;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass649.A15(X.1Im, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00b5, code lost:
    
        if (r0.A04.A03("public_channels_is_user_subscribed") == false) goto L9;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1N(X.1Iw r302, X.2Yv r303) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass649.A1N(X.1Iw, X.2Yv):void");
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
