package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: Fk4.class */
public final class Fk4 implements C5ww {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 2JX A02;
    public final /* synthetic */ C1qb A03;
    public final /* synthetic */ E1Q A04;
    public final /* synthetic */ FHk A05;
    public final /* synthetic */ GF3 A06;
    public final /* synthetic */ MigColorScheme A07;
    public final /* synthetic */ ImmutableList A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public Fk4(06Z r302, FbUserSession fbUserSession, 2JX r304, C1qb c1qb, E1Q e1q, FHk fHk, GF3 gf3, MigColorScheme migColorScheme, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0C = z;
        this.A04 = e1q;
        this.A09 = z2;
        this.A08 = immutableList;
        this.A0A = z3;
        this.A0B = z4;
        this.A07 = migColorScheme;
        this.A05 = fHk;
        this.A00 = r302;
        this.A03 = c1qb;
        this.A01 = fbUserSession;
        this.A06 = gf3;
        this.A02 = r304;
    }

    @Override // X.C5ww
    public void onClick(View view) {
        E1Q e1q;
        ImmutableList immutableList;
        String A06;
        String A07;
        if (this.A0C) {
            e1q = this.A04;
            A07 = null;
            e1q.A04 = null;
        } else {
            if (this.A09) {
                e1q = this.A04;
                ImmutableList immutableList2 = this.A08;
                A06 = Rhr.A05(immutableList2);
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du it = immutableList2.iterator();
                while (it.hasNext()) {
                    AccountProfileModel accountProfileModel = (AccountProfileModel) it.next();
                    if (!accountProfileModel.A0E) {
                        builder.m11011add((Object) accountProfileModel);
                    }
                }
                immutableList = builder.build();
            } else {
                if (!this.A0A && !this.A0B) {
                    MigColorScheme migColorScheme = this.A07;
                    LegacyMigBottomSheetDialogFragment A05 = LegacyMigBottomSheetDialogFragment.A05(migColorScheme, false);
                    FHk.A03(this.A05, "photo_picker_upsell_screen_shown", "interop_upsell", (String) null, (java.util.Map) null);
                    06Z r0 = this.A00;
                    String obj = EWX.class.toString();
                    Dsi dsi = new Dsi(this.A03, new Dxs());
                    FbUserSession fbUserSession = this.A01;
                    Dxs dxs = dsi.A01;
                    dxs.A00 = fbUserSession;
                    BitSet bitSet = dsi.A02;
                    bitSet.set(1);
                    dxs.A03 = migColorScheme;
                    bitSet.set(0);
                    dxs.A04 = this.A08;
                    bitSet.set(4);
                    dxs.A01 = this.A06;
                    bitSet.set(2);
                    dxs.A02 = A05;
                    bitSet.set(3);
                    2JX r02 = this.A02;
                    dxs.A07 = r02.A0r(-551945908);
                    dxs.A06 = r02.A0r(1436250972);
                    dxs.A05 = r02.A0r(-1496673235);
                    C1rs.A04(bitSet, dsi.A03);
                    dsi.A0J();
                    A05.A1C(r0, dxs, obj);
                    return;
                }
                e1q = this.A04;
                immutableList = this.A08;
                A06 = Rhr.A06(immutableList);
            }
            A07 = Rhr.A07(immutableList);
            e1q.A04 = A06;
        }
        e1q.A05 = A07;
        e1q.A0A = !e1q.A0A;
        e1q.A1c();
    }
}
