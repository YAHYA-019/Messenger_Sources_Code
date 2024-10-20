package X;

import android.content.Context;
import android.graphics.Path;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.profilepic.PicSquare;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2q3, reason: invalid class name */
/* loaded from: 2q3.class */
public final class C2q3 extends C1rj {
    public static final CallerContext A0H = CallerContext.A0B("MigProfileImageSpec");
    public static final C2q1 A0I = C2q0.A08;
    public static final C2py A0J;
    public static final C2py A0K;
    public static final C2q2 A0L;
    public static final C2q2 A0M;
    public static final ImmutableList A0N;
    public int A00;
    public FbUserSession A01;
    public C1rn A02;
    public 1Im A03;
    public 3xV A04;
    public C2q1 A05;
    public C2py A06;
    public C2py A07;
    public C2q2 A08;
    public C2q2 A09;
    public MigColorScheme A0A;
    public PicSquare A0B;
    public 3xU A0C;
    public ImmutableList A0D;
    public ImmutableList A0E;
    public String A0F;
    public boolean A0G;

    static {
        C2q2 c2q2 = C2q2.A0G;
        A0L = c2q2;
        A0M = c2q2;
        A0N = ImmutableList.of();
        C2py c2py = C2py.CIRCULAR;
        A0K = c2py;
        A0J = c2py;
    }

    public C2q3() {
        super("MigProfileImage");
        this.A08 = A0L;
        this.A0D = A0N;
        this.A05 = A0I;
        this.A06 = A0J;
        this.A00 = 0;
        this.A09 = A0M;
        this.A07 = A0K;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2qQ, java.lang.Object] */
    public static int A00(C2q1 c2q1, MigColorScheme migColorScheme) {
        int i;
        boolean equals = c2q1.equals(C2q0.A05);
        ?? obj = new Object();
        if (equals) {
            ((2qQ) obj).A00 = 2132346819;
            i = 2132346818;
        } else {
            ((2qQ) obj).A00 = 2132346823;
            i = 2132346822;
        }
        ((2qQ) obj).A01 = Integer.valueOf(i);
        return ((Number) migColorScheme.Ci4(obj.A00())).intValue();
    }

    public static C2q4 A01(1Iw r301) {
        return new C2q4(r301, new C2q3());
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI A2W;
        FbUserSession fbUserSession = this.A01;
        ImmutableList immutableList = this.A0E;
        MigColorScheme migColorScheme = this.A0A;
        ImmutableList immutableList2 = this.A0D;
        C2q1 c2q1 = this.A05;
        C2q2 c2q2 = this.A08;
        int i = this.A00;
        3xV r0 = this.A04;
        String str = this.A0F;
        3xU r02 = this.A0C;
        PicSquare picSquare = this.A0B;
        1Im r03 = this.A03;
        C1rn c1rn = this.A02;
        C2py c2py = this.A07;
        C2py c2py2 = this.A06;
        C2q2 c2q22 = this.A09;
        boolean z = this.A0G;
        Context context = r302.A0D;
        2cL r303 = null;
        C2q5 c2q5 = (C2q5) 1Bn.A0E(context, (1BY) null, 33247);
        int size = immutableList.size();
        if (size != 0) {
            if (size == 1) {
                2zT A00 = C2q7.A00(r302);
                A00.A2Z((UserKey) immutableList.get(0));
                String str2 = (String) 2Ri.A0C(immutableList2, 0);
                C2q7 c2q7 = A00.A01;
                c2q7.A0E = str2;
                A00.A2X(c2q1);
                c2q7.A06 = c2q2;
                c2q7.A01 = c1rn;
                c2q7.A00 = i;
                A00.A2Y(migColorScheme);
                c2q7.A03 = r0;
                c2q7.A0D = str;
                c2q7.A07 = c2q22;
                c2q7.A0C = r02;
                c2q7.A05 = c2py2;
                c2q7.A02 = r03;
                c2q7.A0B = picSquare;
                c2q7.A0F = true;
                return A00.A2W();
            }
            UserKey userKey = (UserKey) immutableList.get(0);
            String str3 = (String) 2Ri.A0C(immutableList2, 0);
            UserKey userKey2 = (UserKey) immutableList.get(1);
            String str4 = (String) 2Ri.A0C(immutableList2, 1);
            2cM A01 = 2cK.A01(r302, (String) null, 0);
            int i2 = c2q1.A06;
            float f = i2;
            A01.A0z(f);
            A01.A0l(f);
            2qP A002 = 2qK.A00(r302, 0);
            A002.A2X(2qT.A00(userKey2, (PicSquare) null, r02, str4, A00(c2q1, migColorScheme)));
            Path A003 = 2qC.A00(context, c2q1, c2py);
            2qK r04 = A002.A01;
            r04.A07 = A003;
            r04.A0E = str;
            float f2 = c2q1.A09;
            r04.A05 = C0A8.A00(context, f2);
            C2qa c2qa = C2qa.TWO_LETTER;
            r04.A0D = c2qa;
            r04.A06 = migColorScheme.BEj();
            float f3 = c2q1.A07;
            r04.A01 = C0A8.A00(context, f3);
            2KQ r05 = 2KQ.A02;
            r04.A08 = r05.A00(context);
            A002.A0c();
            A002.A27(C26z.END, 0.0f);
            A002.A1F(0.0f);
            CallerContext callerContext = A0H;
            r04.A0A = callerContext;
            if (User.A01(userKey2.type)) {
                r04.A04 = C2qb.A00(migColorScheme, migColorScheme.AmV());
            }
            A01.A2e(A002.A2W());
            2qP A004 = 2qK.A00(r302, 0);
            A004.A2X(2qT.A00(userKey, (PicSquare) null, r02, str3, A00(c2q1, migColorScheme)));
            2qK r06 = A004.A01;
            r06.A0E = str;
            r06.A0F = true;
            r06.A05 = C0A8.A00(context, f2);
            r06.A0D = c2qa;
            r06.A06 = migColorScheme.BEj();
            r06.A01 = C0A8.A00(context, f3);
            r06.A08 = r05.A00(context);
            A004.A0c();
            A004.A27(C26z.START, 0.0f);
            A004.A1E(0.0f);
            r06.A0A = callerContext;
            if (User.A01(userKey.type)) {
                r06.A04 = C2qb.A00(migColorScheme, migColorScheme.AmV());
            }
            A01.A2e(A004.A2W());
            if (c2q2 == C2q2.A0G) {
                A2W = null;
            } else {
                C31f A005 = 5Ot.A00(r302);
                A005.A2Z(i2);
                A005.A2Y(c2q1.A05);
                A005.A2X(c2q1.A00);
                A005.A2a(c2q2);
                A005.A2b(migColorScheme);
                A005.A01.A06 = c2q5.A01(fbUserSession, immutableList);
                A2W = A005.A2W();
            }
            A01.A2e(A2W);
            A01.A2T(r03);
            if (z) {
                A01.A1N(1);
                ImmutableList.Builder builder = ImmutableList.builder();
                if (!TextUtils.isEmpty(str3)) {
                    builder.m11011add((Object) str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    builder.m11011add((Object) str4);
                }
                A01.A2S(C2qc.A00(context, c2q2, builder.build()));
                A01.A0F("android.widget.ImageView");
            }
            r303 = A01.A00;
        }
        return r303;
    }
}
