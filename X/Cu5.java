package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Cu5.class */
public final class Cu5 implements C49B {
    public EAX A00;
    public 1BY A01;
    public final Context A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final C00i A05 = AbH.A0Q();
    public final C00i A06;
    public final C00i A07;
    public final ThreadSummary A08;
    public final 6hQ A09;
    public final CNZ A0A;
    public final 7Tx A0B;
    public final MigColorScheme A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;

    public Cu5(Context context, 06Z r303, FbUserSession fbUserSession, 1BO r305, ThreadSummary threadSummary, 6hQ r307) {
        1BV A01 = 1BV.A01(this.A01, 148156);
        this.A0D = A01;
        this.A01 = 7zL.A0Q(r305);
        this.A0E = 7zL.A0R(context, 17010);
        this.A06 = 7zL.A0R(context, 17005);
        this.A0C = AbI.A0d(context);
        this.A07 = 7zL.A0R(context, 67579);
        7Tx r0 = (7Tx) 1Bn.A0E(context, (1BY) null, 50205);
        this.A0B = r0;
        this.A08 = threadSummary;
        this.A02 = context;
        this.A04 = fbUserSession;
        this.A03 = r303;
        this.A09 = r307;
        ThreadKey threadKey = threadSummary.A0n;
        r0.A03 = threadSummary;
        r0.A05 = this;
        r0.A00 = context;
        r0.A09.get();
        r0.A01 = CJj.A01(threadSummary);
        r0.A07.get();
        r0.A08.get();
        11T.A0F(threadKey, 0);
        BNJ bnj = threadKey.A0w() ? BNJ.A0F : threadKey.A1F() ? BNJ.A08 : BNJ.A0J;
        long j = threadKey.A04;
        BOM bom = r0.A01;
        BNT bnt = BNT.A0I;
        1BL.A11(0, context, bom, bnt);
        r0.A04 = new CNg(bom, bnt, bnj, j);
        A01.get();
        this.A0A = new CNZ(context, threadSummary);
        this.A0F = 7zN.A0D(67674);
    }

    private ImmutableList A00(List list) {
        CDw cDw;
        2MQ r313;
        ThreadSummary threadSummary = this.A08;
        ThreadKey threadKey = threadSummary.A0n;
        long j = threadKey.A04;
        ImmutableList.Builder builder = ImmutableList.builder();
        CDw cDw2 = new CDw();
        CDw.A00(cDw2, this, ActionId.BEGIN_START_ACTIVITY);
        CNZ cnz = this.A0A;
        boolean z = cnz.A02;
        Context context = cnz.A00;
        int i = 2131953426;
        if (z) {
            i = 2131953434;
        }
        String string = context.getString(i);
        cDw2.A02 = string;
        AbF.A1V(string);
        cDw2.A00 = 2MQ.A23;
        builder.m11011add((Object) new C7m(cDw2));
        CDw cDw3 = new CDw();
        cDw3.A01 = new CvH(this, list, j);
        String A01 = cnz.A01(list.size());
        cDw3.A02 = A01;
        AbF.A1V(A01);
        cDw3.A00 = 2MQ.A2B;
        builder.m11011add((Object) new C7m(cDw3));
        1G1 r0 = this.A04;
        1G1 r02 = r0;
        if (!r02.A07 && !ThreadKey.A0Z(threadKey) && 5OA.A05(threadSummary, r02.A02)) {
            C00i c00i = this.A0F;
            5Hr r03 = (5Hr) c00i.get();
            Context context2 = this.A02;
            boolean z2 = true;
            if (4YU.A1Y(r03.A02(context2, r0, threadSummary, (User) null, (2Sh) null), 28)) {
                cDw = new CDw();
                CDw.A00(cDw, this, ActionId.END_START_ACTIVITY);
                int i2 = 2131953424;
                if (z) {
                    i2 = 2131953433;
                }
                String string2 = context.getString(i2);
                cDw.A02 = string2;
                AbF.A1V(string2);
                r313 = 2MQ.A1m;
            } else if (((2Ph) this.A0E.get()).A0E(threadSummary) || !4YU.A1Y(((5Hr) c00i.get()).A02(context2, r0, threadSummary, (User) null, (2Sh) null), 19)) {
                cDw = new CDw();
                CDw.A00(cDw, this, ActionId.FORMAT_ERROR);
                String string3 = context.getString(2131957322);
                cDw.A02 = string3;
                AbF.A1V(string3);
                cDw.A00 = 2MQ.A0z;
                z2 = false;
                cDw.A03 = z2;
                builder.m11011add((Object) new C7m(cDw));
            } else {
                cDw = new CDw();
                CDw.A00(cDw, this, ActionId.FILE_SYSTEM_FAIL);
                String string4 = context.getString(2131953425);
                cDw.A02 = string4;
                AbF.A1V(string4);
                r313 = 2MQ.A0S;
            }
            cDw.A00 = r313;
            cDw.A03 = z2;
            builder.m11011add((Object) new C7m(cDw));
        }
        return builder.build();
    }

    public void A01(boolean z) {
        EAX A00;
        7Tx r0 = this.A0B;
        ThreadSummary threadSummary = this.A08;
        ArrayList A002 = r0.A00(this.A04, threadSummary);
        if (ThreadKey.A0Z(threadSummary.A0n)) {
            Context context = this.A02;
            C1u2 c1u2 = (C1u2) this.A05.get();
            C1u3 c1u3 = C1u3.A3r;
            MigColorScheme migColorScheme = this.A0C;
            Drawable A0F = 7zO.A0F(c1u3, c1u2, migColorScheme);
            CNZ cnz = this.A0A;
            String A03 = cnz.A03(A002);
            String A02 = cnz.A02(A002);
            ImmutableList A003 = A00(A002);
            11T.A0F(context, 0);
            7zT.A1U(A03, A02, A003);
            A00 = BVT.A00(context, A0F, migColorScheme, A003, A03, A02, (List) null, true);
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                A0s.add(AbG.A0t(it).A0k);
            }
            Context context2 = this.A02;
            CNZ cnz2 = this.A0A;
            String A032 = cnz2.A03(A002);
            String A022 = cnz2.A02(A002);
            ImmutableList A004 = A00(A002);
            MigColorScheme migColorScheme2 = this.A0C;
            11T.A0F(context2, 0);
            7zT.A1U(A032, A022, A004);
            11T.A0F(migColorScheme2, 5);
            A00 = BVT.A00(context2, (Drawable) null, migColorScheme2, A004, A032, A022, A0s, z);
        }
        this.A00 = A00;
        A00.setOnCancelListener(new CQx(this, 8));
        EAX eax = r0.A05.A00;
        if (eax != null) {
            eax.show();
        }
        r0.A04.A03();
    }

    @Override // X.C49B
    public void dismiss() {
        EAX eax = this.A00;
        if (eax != null) {
            eax.dismiss();
        }
    }
}
