package X;

import android.content.res.Resources;
import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.profile.bottomsheet.model.ProfileSheet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.Ay2, reason: case insensitive filesystem */
/* loaded from: Ay2.class */
public final class C1973Ay2 extends 1LH {
    public static final java.util.Map A06 = 1BK.A1D("chat-remove", C1u3.A1S);
    public final Member A00;
    public final ThreadSummary A01;
    public final ProfileSheet A02;
    public final MigColorScheme A03;
    public final String A04;
    public final String A05;

    public C1973Ay2(Member member, ThreadSummary threadSummary, ProfileSheet profileSheet, MigColorScheme migColorScheme, String str, String str2) {
        this.A05 = str;
        this.A00 = member;
        this.A02 = profileSheet;
        this.A01 = threadSummary;
        this.A03 = migColorScheme;
        this.A04 = str2;
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        String str2;
        C1u3 c1u3;
        11T.A0F(c2k5, 0);
        ImmutableList.Builder builder = ImmutableList.builder();
        ProfileSheet profileSheet = this.A02;
        B0B b0b = null;
        if (profileSheet != null) {
            str = profileSheet.A0B;
            str2 = profileSheet.A0C;
        } else {
            str = null;
            str2 = null;
        }
        1BQ A0Q = AbH.A0Q();
        if ((profileSheet != null ? profileSheet.A03 : null) != null || this.A04 != null) {
            Resources A0E = 4YU.A0E(c2k5.A05);
            if (profileSheet == null) {
                throw 1BK.A0h();
            }
            builder.m11011add((Object) new Buf(0yH.A00(A0E, new String[]{profileSheet.A05}, 2131954632), null, profileSheet.A06, 0, true));
        }
        if (str != null && 7zL.A1V(str)) {
            builder.m11011add((Object) new Buf(str, null, null, ((C1u2) A0Q.get()).A03(C1u3.A3F), false));
        }
        Member member = this.A00;
        if ((member != null ? member.A05 : null) == 5pV.A03) {
            int A03 = ((C1u2) A0Q.get()).A03(C1u3.A1Q);
            String A09 = 3yH.A09(c2k5, 2131954062);
            ThreadSummary threadSummary = this.A01;
            builder.m11011add((Object) new Buf(A09, threadSummary != null ? threadSummary.A20 : null, null, A03, false));
        }
        if (str2 != null && 7zL.A1V(str2)) {
            builder.m11011add((Object) new Buf(str2, null, null, ((C1u2) A0Q.get()).A03(C1u3.A3Y), false));
        }
        int i = 0;
        String str3 = null;
        String str4 = null;
        if (profileSheet != null) {
            String str5 = profileSheet.A0D;
            if (str5 != null && 7zL.A1V(str5)) {
                str4 = str5;
            }
            String str6 = profileSheet.A0A;
            if (str6 != null && 7zL.A1V(str6)) {
                str3 = str6;
            }
            String str7 = profileSheet.A09;
            if (str7 != null && 7zL.A1V(str7) && (c1u3 = (C1u3) A06.get(str7)) != null) {
                i = ((C1u2) A0Q.get()).A03(c1u3);
            }
            if (str5 != null && 7zL.A1V(str5)) {
                builder.m11011add((Object) new Buf(str4, str3, null, i, false));
            }
        }
        if (!builder.build().isEmpty()) {
            1Iw r0 = c2k5.A05;
            AwQ A00 = B0B.A00(r0);
            String str8 = this.A05;
            B0B b0b2 = A00.A01;
            b0b2.A03 = str8;
            A00.A02.set(2);
            C1858Auv c1858Auv = new C1858Auv(r0, new C2031Azs());
            ImmutableList build = builder.build();
            C2031Azs c2031Azs = c1858Auv.A01;
            c2031Azs.A02 = build;
            BitSet bitSet = c1858Auv.A02;
            bitSet.set(1);
            MigColorScheme migColorScheme = this.A03;
            c2031Azs.A01 = migColorScheme;
            bitSet.set(0);
            C1rs.A00(bitSet, c1858Auv.A03);
            c1858Auv.A0J();
            A00.A2X(c2031Azs);
            A00.A2Y(migColorScheme);
            b0b2.A04 = true;
            b0b = A00.A2W();
        }
        return b0b;
    }
}
