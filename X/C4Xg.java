package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4Xg, reason: invalid class name */
/* loaded from: 4Xg.class */
public final class C4Xg implements C15h {
    public final int A00;
    public final Object A01;

    public C4Xg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                return 1Bn.A0A(67323);
            case 1:
                return 1Bn.A0A(115470);
            case 2:
                return 1Bn.A0G(((C4Aq) this.A01).A00, 85023);
            case 3:
                return 1Bn.A0A(83433);
            case 4:
            case 33:
            default:
                return 1Fw.A00();
            case 5:
                return 1Bn.A0A(131340);
            case 6:
                return 1Bn.A0G(((C4Ba) this.A01).A00, 49472);
            case 7:
                return 1Bn.A0A(84890);
            case 8:
                return 1Bn.A0A(115467);
            case 9:
                return 1Bn.A0A(99409);
            case 10:
                return 1Bn.A0G(((4BJ) this.A01).A00, 99449);
            case 11:
                return ((FbUserSession) this.A01).A02;
            case 12:
                4BN r0 = (4BN) this.A01;
                C4Ao c4Ao = 4BN.A04;
                return 1De.A00(r0.A00, 67355);
            case 13:
                return 1Bn.A0G(((4BT) this.A01).A00, 84427);
            case 14:
                return 1Bn.A0G(((4BW) this.A01).A00, 83687);
            case 15:
                return 1Bn.A0A(84138);
            case 16:
                C4Bk c4Bk = (C4Bk) this.A01;
                C4Ao c4Ao2 = C4Bk.A03;
                return 1Bn.A0G(c4Bk.A00, 83670);
            case 17:
                C4Bj c4Bj = (C4Bj) this.A01;
                C4Ao c4Ao3 = C4Bj.A04;
                return 1Bn.A0G(c4Bj.A00, 83908);
            case 18:
            case 19:
                return 1Bn.A0A(83436);
            case 20:
                return 1Bn.A0D((Context) this.A01, 33058);
            case 21:
                return 1Bn.A0G(((4BY) this.A01).A00, 83686);
            case 22:
                return 1De.A00(((4BH) this.A01).A00, 67359);
            case 23:
                return 1Bn.A0G(((C4Bl) this.A01).A00, 99661);
            case 24:
                return 1Bn.A0A(84467);
            case 25:
                return 1Bi.A03(116072);
            case 26:
                return 1Bn.A0A(84887);
            case 27:
                return 1Bn.A0G(((C4At) this.A01).A00, 84063);
            case 28:
                return this.A01;
            case 29:
                return 1Bn.A0A(49284);
            case 30:
                return 1Bi.A03(67199);
            case 31:
                return 1Bi.A03(84870);
            case 32:
                return 1Bn.A0G(((4BB) this.A01).A00, 85025);
            case 34:
                return 1Bn.A0A(49283);
            case 35:
                return 1Bn.A0A(83671);
            case 36:
                return 1Bn.A0A(83672);
            case 37:
                return 1De.A00(((4BF) this.A01).A00, 67364);
            case 38:
                return 1De.A00(((4BG) this.A01).A00, 67364);
            case 39:
                return 1Bi.A03(16385);
            case 40:
                return 1Bn.A0A(98797);
            case 41:
                return 1Bn.A0A(49305);
            case 42:
                return 1Bn.A0A(99587);
            case 43:
                return 1Bn.A0A(49826);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 1De.A00(((C4B7) this.A01).A00, 67369);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return 1De.A00(((C4B8) this.A01).A00, 67370);
            case 46:
                C4Aw c4Aw = (C4Aw) this.A01;
                C4Ao c4Ao4 = C4Aw.A04;
                return 1Bn.A0G(c4Aw.A00, 84727);
            case ActionId.ON_START_END /* 47 */:
                return 1Bn.A0A(85024);
            case ActionId.QUEUED /* 48 */:
                return 1Bn.A0A(98486);
            case ActionId.IN_PROGRESS /* 49 */:
                return 1Bn.A0A(16965);
        }
    }
}
