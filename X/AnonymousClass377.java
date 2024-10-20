package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.377, reason: invalid class name */
/* loaded from: 377.class */
public final class AnonymousClass377 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public AnonymousClass377() {
        super("FBMigProfilePictureComponent");
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int length;
        Uri A09;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        2Iq r0 = (2Iq) 1Bi.A03(16960);
        FbUserSession A00 = C54z.A00(r302);
        Context context = r302.A0D;
        2fE r02 = (2fE) 1Lo.A04(context, A00, (1BY) null, 17064);
        2fZ r03 = (2fZ) 1Lo.A04(context, C54z.A00(r302), (1BY) null, 17067);
        MigColorScheme A002 = EWg.A00(fyG);
        String string = gl7.getString(58);
        C2q1 c2q1 = new C2q1(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (int) gl7.Amm(54, 0.0f), 0, 0, 0);
        String string2 = gl7.getString(59);
        try {
            length = string2.length();
        } catch (Exception e) {
            0fH.A0G(R2H.class, 0Pz.A0W("Could not get value for: ", string2), e);
        }
        if (length == 6) {
            2zT A003 = C2q7.A00(r302);
            A003.A2Z(1BK.A0X(string));
            A003.A2Y(A002);
            A003.A2X(c2q1);
            A003.A2Y(A002);
            return A003.A2W();
        }
        if (length == 8) {
            ThreadKey A08 = ThreadKey.A08(Long.parseLong(string));
            ThreadSummary A06 = r02.A06(A08);
            if (A06 != null) {
                if (A06.A1L.size() > 2 && r03.A09(A06) != null) {
                    A09 = r03.A09(A06);
                }
                31C r04 = new 31C(r302, new C6c0());
                C6c0 c6c0 = r04.A01;
                c6c0.A01 = A002;
                BitSet bitSet = r04.A02;
                bitSet.set(0);
                c6c0.A00 = c2q1;
                bitSet.set(1);
                C1rs.A00(bitSet, r04.A03);
                r04.A0J();
                return r04.A01;
            }
            Uri.Builder A01 = ((C4yt) r03.A02.get()).A01(null);
            A01.appendQueryParameter("tid", AnonymousClass001.A0h(AnonymousClass001.A0n("t_"), A08.A0r()));
            A09 = A01.build();
            if (A09 != null) {
                C2sS A004 = C2rr.A00(r302);
                A004.A2X(A09);
                A004.A2Z(A002);
                A004.A2Y(c2q1);
                return A004.A2W();
            }
            31C r042 = new 31C(r302, new C6c0());
            C6c0 c6c02 = r042.A01;
            c6c02.A01 = A002;
            BitSet bitSet2 = r042.A02;
            bitSet2.set(0);
            c6c02.A00 = c2q1;
            bitSet2.set(1);
            C1rs.A00(bitSet2, r042.A03);
            r042.A0J();
            return r042.A01;
        }
        r0.A01(0Pz.A0W("unexpected_mig_profile_picture_id_type_", string2));
        31C r0422 = new 31C(r302, new C6c0());
        C6c0 c6c022 = r0422.A01;
        c6c022.A01 = A002;
        BitSet bitSet22 = r0422.A02;
        bitSet22.set(0);
        c6c022.A00 = c2q1;
        bitSet22.set(1);
        C1rs.A00(bitSet22, r0422.A03);
        r0422.A0J();
        return r0422.A01;
    }
}
