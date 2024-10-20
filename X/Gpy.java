package X;

import android.content.res.Resources;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.room.RoomImplementation;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Gpy.class */
public final class Gpy extends 1qP {
    public final int A00;
    public final Object A01;

    public Gpy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01() {
        if (11 - this.A00 != 0) {
            super.A01();
        } else {
            ((GS4) this.A01).A0d();
        }
    }

    public void A02() {
        if (13 - this.A00 != 0) {
            super.A02();
            return;
        }
        RtcScrollableGridView rtcScrollableGridView = (RtcScrollableGridView) this.A01;
        DqJ dqJ = RtcScrollableGridView.A0X;
        C15h c15h = rtcScrollableGridView.A0E;
        if (c15h == null) {
            throw 1BK.A0h();
        }
        if (((2Qb) c15h.get()).A0I()) {
            RtcScrollableGridView.A0E(rtcScrollableGridView, true, false);
        }
    }

    public void A03() {
        switch (this.A00) {
            case 0:
                GrV.A0L((GrV) this.A01);
                return;
            case 8:
                GrR.A02((GrR) this.A01);
                return;
            default:
                super.A03();
                return;
        }
    }

    public void A04() {
        switch (this.A00) {
            case 1:
                GrN.A02(this.A01);
                return;
            case 2:
                GpY gpY = (GpY) this.A01;
                if (GS2.A07(gpY)) {
                    ListenableFuture A02 = GpY.A02(gpY);
                    1Br.A0D(gpY.A0M, Ini.A01(gpY, 38), A02);
                    return;
                }
                return;
            default:
                super.A04();
                return;
        }
    }

    public void A05() {
        switch (this.A00) {
            case 1:
                GrN.A02(this.A01);
                return;
            case 2:
                GpY gpY = (GpY) this.A01;
                if (GS2.A07(gpY)) {
                    ListenableFuture A02 = GpY.A02(gpY);
                    1Br.A0D(gpY.A0M, Ini.A01(gpY, 38), A02);
                    return;
                }
                return;
            default:
                super.A05();
                return;
        }
    }

    public void A09() {
        if (2 - this.A00 != 0) {
            super.A09();
            return;
        }
        GpY gpY = (GpY) this.A01;
        ListenableFuture A02 = GpY.A02(gpY);
        1Br.A0D(gpY.A0M, Ini.A01(gpY, 37), A02);
    }

    public void A0B() {
        8LW A0v;
        CallModel callModel;
        switch (this.A00) {
            case 2:
                GpY.A08((GpY) this.A01);
                return;
            case 10:
                RoomImplementation roomImplementation = (RoomImplementation) this.A01;
                5Vt r0 = roomImplementation.A04.A01;
                int i = (r0 == null || (A0v = GOn.A0v(r0)) == null || (callModel = (CallModel) A0v.A00(CallModel.class)) == null) ? 0 : callModel.inCallState;
                C00i c00i = roomImplementation.A02.A00;
                if (AbG.A0m(c00i).A0N() || AbG.A0m(c00i).A04 != null) {
                    return;
                }
                if (AbG.A0m(c00i).A0O()) {
                    I5k A0X = GOp.A0X(roomImplementation.A01);
                    if (A0X.A0A && 1Br.A01(A0X.A0B) - A0X.A05 < 3000) {
                        return;
                    }
                }
                if (i != 6) {
                    boolean A0O = AbG.A0m(c00i).A0O();
                    Resources resources = roomImplementation.A00.getResources();
                    int i2 = 2131965053;
                    if (A0O) {
                        i2 = 2131965052;
                    }
                    String string = resources.getString(i2);
                    11T.A0D(string);
                    I8a i8a = ((HEt) roomImplementation).A00;
                    if (i8a != null) {
                        DKI.A0d(i8a, HBr.A11, string);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.A0B();
                return;
        }
    }

    public void A0E() {
        switch (this.A00) {
            case 5:
                Gpk.A00((Gpk) this.A01);
                return;
            case 6:
                Gqa.A01((Gqa) this.A01);
                return;
            case 7:
                C2476GeX c2476GeX = (C2476GeX) this.A01;
                C2476GeX.A01(c2476GeX, c2476GeX.A02);
                return;
            case 12:
                IAA.A01((IAA) this.A01);
                return;
            default:
                super.A0E();
                return;
        }
    }

    public void A0F() {
        if (2 - this.A00 != 0) {
            super.A0F();
            return;
        }
        GpY gpY = (GpY) this.A01;
        ListenableFuture A02 = GpY.A02(gpY);
        1Br.A0D(gpY.A0M, Ini.A01(gpY, 39), A02);
    }

    public void A0H() {
        switch (this.A00) {
            case 1:
                GrN.A02(this.A01);
                return;
            case 2:
                GpY gpY = (GpY) this.A01;
                GpY.A03(gpY);
                ListenableFuture A02 = GpY.A02(gpY);
                1Br.A0D(gpY.A0M, Ini.A01(gpY, 37), A02);
                return;
            case 3:
                Gr9 gr9 = (Gr9) this.A01;
                I0Q A00 = Gr9.A00(gr9);
                AbJ.A0X(gr9.A0K);
                A00.A09 = false;
                Gr9.A01(gr9, A00);
                return;
            case 4:
                GrQ.A03(this.A01);
                return;
            case 5:
                Gpk.A00((Gpk) this.A01);
                return;
            case 6:
            case 7:
            case 8:
            default:
                super.A0H();
                return;
            case 9:
                GrU.A0J((GrU) this.A01);
                return;
        }
    }
}
