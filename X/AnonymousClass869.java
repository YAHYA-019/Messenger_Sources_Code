package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;

/* renamed from: X.869, reason: invalid class name */
/* loaded from: 869.class */
public final class AnonymousClass869 implements InterfaceC07434jv {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final FbUserSession A04;
    public final 1De A05;

    public AnonymousClass869(FbUserSession fbUserSession, 1De r303, ThreadKey threadKey) {
        this.A05 = r303;
        this.A03 = threadKey;
        this.A04 = fbUserSession;
        1BY r0 = r303.A00;
        this.A01 = 1Bu.A03(r0, 16979);
        this.A00 = 1Lm.A03(fbUserSession, r0, 67870);
        this.A02 = 1Bu.A03(r0, 17010);
    }

    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        4kN r0 = (4kN) obj;
        11T.A0F(r0, 0);
        C07674kd c07674kd = (C07674kd) r0.A00.A03;
        C6rt c6rt = null;
        if (c07674kd != null) {
            1qX r02 = c07674kd.A09;
            if (1qX.A00(r02) > 0) {
                C00i c00i = this.A02.A00;
                2Ph r03 = (2Ph) c00i.get();
                ThreadKey threadKey = this.A03;
                1G2 r04 = 1NK.A05;
                if (!1BK.A0R(r03.A03).BNM(AbstractC03303xn.A06(threadKey)) && r02.mResultSet.getBoolean(0, ActionId.VIDEO_SET_RENDERER_CONTEXT)) {
                    2Ph r05 = (2Ph) c00i.get();
                    long j = r02.mResultSet.getLong(0, ActionId.HEADER_DATA_LOADED);
                    1G2 A06 = AbstractC03303xn.A06(threadKey);
                    1Ql A0V = 1BL.A0V(r05.A03);
                    A0V.CaH(A06, j);
                    A0V.commit();
                }
                ArrayList A10 = r02.mResultSet.getInteger(0, 1) != 15 ? C0s8.A10(5, 6) : AnonymousClass001.A0s();
                4lA r06 = c07674kd.A05;
                if (r06 != null && 1qX.A00(r06) > 0 && ((((1qX) r06).mResultSet.getInteger(0, 2) == 0 || ((1qX) r06).mResultSet.getInteger(0, 2) == 2) && !A10.contains(Integer.valueOf(((1qX) r06).mResultSet.getInteger(0, 1))) && ((1qX) r06).mResultSet.getInteger(0, 4) == 0)) {
                    c6rt = new C6rt(7zQ.A0m(this.A01), ((C9h9) 1Br.A0B(this.A00)).A01(r06, 0));
                }
            }
        }
        return c6rt;
    }
}
