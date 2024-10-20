package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.69b, reason: invalid class name */
/* loaded from: 69b.class */
public final class C69b implements CallerContextable {
    public static final String __redex_internal_original_name = "MontageTileController";
    public int A00;
    public int A01;
    public Message A02;
    public MontageCard A03;
    public 69V A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public 1BY A09;
    public Integer A0A;
    public final int A0B;
    public final Context A0C;
    public final C69a A0H;
    public final CallerContext A0I = CallerContext.A08(C69b.class, "messenger_montage_thumbnail");
    public final C12114ys A0E = (C12114ys) 1Bi.A03(49420);
    public final C00i A0J = new 1BQ(50150);
    public final C00653oY A0F = (C00653oY) 1Bi.A03(32769);
    public final C2fx A0G = (C2fx) 1Bi.A03(67920);
    public final C69c A0M = (C69c) 1Bn.A0E((Context) null, (1BY) null, 49972);
    public final C00i A0D = new 1BV((1BY) null, 67968);
    public final C00i A0K = new 1BV((1BY) null, 50201);
    public final C00i A0L = new 1BQ(16432);

    public C69b(1BO r302, C69a c69a) {
        this.A09 = new 1BY(r302);
        this.A0H = c69a;
        Context context = c69a.getContext();
        this.A0C = context;
        this.A0B = context.getColor(2132214413);
        this.A08 = 1;
    }

    private C69s A00() {
        C69s c69s = (C69s) 1Bn.A0E((Context) null, this.A09, 49976);
        ((C69o) c69s).A02 = this.A0I;
        return c69s;
    }

    private 5bO A01(final String str) {
        int i;
        boolean z;
        final C69c c69c = this.A0M;
        int i2 = this.A08;
        boolean z2 = this.A05;
        if (i2 != 0) {
            GiY giY = null;
            if (i2 != 2) {
                if (i2 == 3) {
                    giY = new GiY();
                }
            } else if (z2) {
                i = 1;
            }
            return giY;
        }
        i = 0;
        if (!z2) {
            i = 2;
            z = false;
            final int i3 = i;
            final boolean z3 = z;
            return new 5bO(str, i3, z3) { // from class: X.5q7
                public final int A00;
                public final int A01 = -16777216;
                public final String A02;
                public final boolean A03;

                {
                    this.A02 = str;
                    this.A03 = z3;
                    this.A00 = i3;
                }
            };
        }
        z = true;
        final int i32 = i;
        final boolean z32 = z;
        return new 5bO(str, i32, z32) { // from class: X.5q7
            public final int A00;
            public final int A01 = -16777216;
            public final String A02;
            public final boolean A03;

            {
                this.A02 = str;
                this.A03 = z32;
                this.A00 = i32;
            }
        };
    }

    private 2Dp A02(Uri uri) {
        int i;
        2IA A01 = 2IA.A01(uri);
        A01.A0C = A01(uri.toString());
        5Q7 r0 = new 5Q7();
        ((2rA) r0).A08 = true;
        ((2rA) r0).A0A = true;
        A01.A04 = new C06804hy(r0);
        int i2 = this.A01;
        if (i2 > 0 && (i = this.A00) > 0) {
            A01.A06 = new C02353ux(i2, i);
        }
        return A01.A04();
    }

    private void A03() {
        C69a c69a = this.A0H;
        C69f Ap5 = c69a.BN3() ? c69a.Ap5() : new C69e(this.A0C.getResources()).A01();
        5C0 r0 = Ap5.A03;
        if (r0.A01 == 0) {
            r0.A08(500);
        }
        if (Ap5.A00 == null) {
            float dimensionPixelSize = this.A0C.getResources().getDimensionPixelSize(R.dimen.mapbox_four_dp);
            5SA r02 = new 5SA();
            r02.A02(dimensionPixelSize);
            Ap5.A0A(r02);
        }
        if (r0.A01(1) == null) {
            C69f.A02(new ColorDrawable(this.A0B), Ap5, 1);
        }
        c69a.CpU(Ap5);
    }

    private void A04(int i) {
        Integer num = this.A0A;
        if (num == null || num.intValue() != i) {
            C69a c69a = this.A0H;
            C69f Ap5 = c69a.Ap5();
            C69f.A02(new ColorDrawable(i), Ap5, 1);
            c69a.CpU(Ap5);
            this.A0A = Integer.valueOf(i);
        }
    }

    private void A05(FbUserSession fbUserSession, String str) {
        this.A0H.Ap5().A09(InterfaceC07034in.A01);
        Sticker A02 = ((69H) 1Lo.A04((Context) null, fbUserSession, this.A09, 49969)).A02(str);
        if (A02 != null) {
            A08(this, A02);
            return;
        }
        1FV A01 = ((C6pf) this.A0J.get()).A01(str);
        1Kd.A0D(this.A0L, new Fvr(this, 0), A01);
    }

    private void A06(VideoAttachmentData videoAttachmentData) {
        Uri uri;
        C69a c69a = this.A0H;
        c69a.Ap5().A09(InterfaceC07034in.A01);
        if (videoAttachmentData == null || (uri = videoAttachmentData.A0F) == null) {
            c69a.ChV();
            return;
        }
        C69s A00 = A00();
        ((C69o) A00).A03 = A02(uri);
        6A2 A08 = A00.A08();
        if (A08 instanceof 6A2) {
            6A2.A01(A08, 0S2.A1G);
        }
        c69a.CnT((C69w) A08);
    }

    private void A07(MontageMetadata montageMetadata, String str) {
        if (1JF.A0A(str) || this.A01 <= 0 || this.A00 <= 0) {
            this.A0H.ChV();
            return;
        }
        if (montageMetadata != null) {
            C4Ed.A00(montageMetadata.A01);
        }
        C69s A00 = A00();
        2IA A002 = 2IA.A00(2132346775);
        C69c c69c = this.A0M;
        C69a c69a = this.A0H;
        A002.A0C = new 6A5(c69a.getContext(), c69c, str, this.A01, this.A00, this.A05);
        ((C69o) A00).A03 = A002.A04();
        c69a.CnT(A00.A08());
    }

    public static void A08(C69b c69b, Sticker sticker) {
        2Dp[] A07 = ((7Qb) c69b.A0K.get()).A07(sticker);
        if (A07 != null) {
            if (c69b.A01 > 0 && c69b.A00 > 0) {
                int length = A07.length;
                2Dp[] r0 = new 2Dp[length];
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    2Dp r02 = A07[i2];
                    2IA A02 = 2IA.A02(r02);
                    A02.A06 = new C02353ux(c69b.A01, c69b.A00);
                    Uri uri = r02.A05;
                    A02.A0C = c69b.A01(uri == null ? null : uri.toString());
                    r0[i2] = A02.A04();
                    i = i2 + 1;
                }
                A07 = r0;
            }
            if (A07.length != 0) {
                C69s A00 = c69b.A00();
                A00.A07(A07);
                c69b.A0H.CnT(A00.A08());
                return;
            }
        }
        0fH.A0S(C69b.class, "There is no uri associate with sticker %s.", new Object[]{sticker.A0F});
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c0, code lost:
    
        if (r305 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(com.google.common.collect.ImmutableList r302) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69b.A09(com.google.common.collect.ImmutableList):void");
    }

    private void A0A(ImmutableMap immutableMap, String str) {
        if (!1JF.A0A(str) && this.A01 > 0 && this.A00 > 0) {
            String str2 = (String) immutableMap.get(AbE.A00(617));
            if (!1JF.A0B(str2)) {
                C69a c69a = this.A0H;
                C69s A00 = A00();
                A00.A0C(str2);
                c69a.CnT(A00.A08());
                return;
            }
        }
        this.A0H.ChV();
    }

    public void A0B(5SA r302) {
        A03();
        C69f Ap5 = this.A0H.Ap5();
        if (r302 == null) {
            float dimensionPixelSize = this.A0C.getResources().getDimensionPixelSize(R.dimen.mapbox_four_dp);
            r302 = new 5SA();
            r302.A02(dimensionPixelSize);
        }
        Ap5.A0A(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r0 != r301.A08) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.A06 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0C(com.facebook.messaging.model.messages.Message r302) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69b.A0C(com.facebook.messaging.model.messages.Message):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r0 != r301.A08) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r0.A06 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0D(com.facebook.messaging.montage.model.MontageCard r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69b.A0D(com.facebook.messaging.montage.model.MontageCard, boolean, boolean):void");
    }
}
