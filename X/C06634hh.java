package X;

import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hh.class */
public final class C06634hh implements InterfaceC06564ha, CallerContextable {
    public static final String __redex_internal_original_name = "PaymentsSyncInitializationHandler";
    public final BlueServiceOperationFactory A00;
    public final C06594hd A01;
    public final C15h A02;
    public final C15h A03;

    public C06634hh() {
        DBP dbp = new DBP(this, 60);
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0A(33031);
        DBP dbp2 = new DBP(this, 61);
        C06594hd c06594hd = (C06594hd) 1Bi.A03(49208);
        this.A02 = dbp;
        this.A00 = blueServiceOperationFactory;
        this.A01 = c06594hd;
        this.A03 = dbp2;
    }

    @Override // X.InterfaceC06564ha
    public void AQb(EnumC06914ib enumC06914ib, String str) {
        1Ho newInstance_DEPRECATED = this.A00.newInstance_DEPRECATED(1BJ.A00(175), new Bundle(), CallerContext.A06(getClass()));
        newInstance_DEPRECATED.A0A = true;
        1Ho.A00(newInstance_DEPRECATED, true);
    }

    @Override // X.InterfaceC06564ha
    public void AQc(EnumC06914ib enumC06914ib, String str) {
        if (this.A01.A03(CIY.A00(BLy.A03, ((ViewerContext) this.A03.get()).mUserId))) {
            return;
        }
        AQb(enumC06914ib, "enter_app");
    }

    @Override // X.InterfaceC06564ha
    public String B6W() {
        return null;
    }

    @Override // X.InterfaceC06564ha
    public ImmutableList BE3() {
        return ImmutableList.of((Object) 82);
    }

    @Override // X.InterfaceC06564ha
    public void Cbv(String str) {
    }

    @Override // X.InterfaceC06564ha
    public boolean isEnabled() {
        return ((Boolean) this.A02.get()).booleanValue();
    }
}
