package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.messengerkids.plugins.core.mesettings.MessengerKidsProfileSetting;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Anx, reason: case insensitive filesystem */
/* loaded from: Anx.class */
public final class C1619Anx extends 2UY {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C1619Anx(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        switch (this.A00) {
            case 1:
                Throwable th = (Throwable) obj2;
                Cbm cbm = (Cbm) this.A01;
                CallerContext callerContext = Cbm.A0A;
                1BK.A09(cbm.A07).softReport(0Pz.A0W(Cbm.__redex_internal_original_name, " failure"), "", th);
                cbm.A01.getClass();
                cbm.A01.C47(this.A03, th);
                return;
            case 2:
                0fH.A14("ThreadKeyUtil", "Failed to load group thread: %s", new Object[]{obj2});
                AbM.A1R(this.A02);
                return;
            default:
                super.C47(obj, obj2);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        Integer num;
        if (1 - this.A00 != 0) {
            super.C4X(obj, obj2);
            return;
        }
        Cbm cbm = (Cbm) this.A01;
        ImmutableList immutableList = ((2TS) obj2).A04;
        CallerContext callerContext = Cbm.A0A;
        ImmutableList.Builder A0h = 4YU.A0h();
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                User A0t = AbG.A0t(it);
                Integer num2 = A0t.A0x;
                Integer num3 = 0S2.A01;
                if (num2 == num3 || (num = A0t.A0y) == num3 || num == 0S2.A0N) {
                    if (A0t.A0U != 1Kq.A08) {
                        A0h.m11011add((Object) A0t);
                    }
                }
            }
        }
        ImmutableList build = A0h.build();
        Bwo bwo = (Bwo) this.A03;
        ImmutableList immutableList2 = bwo.A03;
        boolean z = bwo.A06;
        ListenableFuture D3C = ((1ED) cbm.A06.get()).D3C(new DB8(bwo.A01, (FbUserSession) this.A02, bwo.A02, cbm, build, immutableList2, z));
        C1614Amv c1614Amv = new C1614Amv(bwo, cbm, 15);
        1Kd.A0D(cbm.A09, c1614Amv, D3C);
        cbm.A00 = new 2eS(c1614Amv, D3C);
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
        if (1 - this.A00 != 0) {
            super.C4n(listenableFuture, obj);
            return;
        }
        Cbm cbm = (Cbm) this.A01;
        CallerContext callerContext = Cbm.A0A;
        cbm.A01.getClass();
        cbm.A01.C4n(listenableFuture, this.A03);
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                2JX r0 = (2JX) obj2;
                11T.A0F(r0, 1);
                Bvx bvx = (Bvx) 1Lm.A06(((MessengerKidsProfileSetting) this.A03).A02, 83730);
                2JX r02 = bvx.A01;
                bvx.A02 = r02;
                bvx.A01 = r0;
                if (r02 != null) {
                    11T.A0D(r0);
                    ArrayList A00 = CHc.A00(r02);
                    if (CHc.A00(r0).size() != A00.size() || (!AbF.A1E(A00).equals(AbF.A1E(r0)))) {
                        bvx.A03 = CHc.A00(r0);
                        ((DFp) this.A02).D7z();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ThreadKey A002 = ((C0j) obj2).A00();
                0fH.A0g(A002, "ThreadKeyUtil", "Successfully loaded thread key: %s");
                if (A002 != null) {
                    AbF.A1W(this.A02, A002);
                    return;
                }
                1FX r03 = (1FX) this.A02;
                CbW cbW = (CbW) this.A01;
                ImmutableList immutableList = (ImmutableList) this.A03;
                53F A0a = AbJ.A0a();
                HashSet A0v = AnonymousClass001.A0v();
                r03.setFuture(AbJ.A0t(cbW.A08, new D2l(cbW, 5), ((CIz) cbW.A05.get()).A02(cbW.A02, new CreateCustomizableGroupParams(null, null, null, null, null, null, null, null, null, immutableList, null, null, null, null, null, null, null, C1pq.A07(immutableList, "participants", A0v, A0v), A0a.A01(), false, false, false, false), false)));
                return;
            default:
                super.C9D(obj, obj2);
                return;
        }
    }
}
