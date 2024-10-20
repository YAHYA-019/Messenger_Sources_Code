package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: JA1.class */
public final class JA1 extends C00q implements Function1 {
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $isCardExternal = false;
    public final /* synthetic */ boolean $isEffectAttributionAvailable;
    public final /* synthetic */ boolean $isEffectRemovable;
    public final /* synthetic */ C2lh $isShowingLicenseInfo;
    public final /* synthetic */ C2k6 $this_createMoreButton;
    public final /* synthetic */ 8hD this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JA1(FbUserSession fbUserSession, 8hD r303, C2k6 c2k6, C2lh c2lh, boolean z, boolean z2) {
        super(1);
        this.this$0 = r303;
        this.$this_createMoreButton = c2k6;
        this.$fbUserSession = fbUserSession;
        this.$isEffectAttributionAvailable = z;
        this.$isEffectRemovable = z2;
        this.$isShowingLicenseInfo = c2lh;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C2k6 c2k6 = this.$this_createMoreButton;
        FbUserSession fbUserSession = this.$fbUserSession;
        boolean z = this.$isEffectAttributionAvailable;
        boolean z2 = this.$isCardExternal;
        boolean z3 = this.$isEffectRemovable;
        C2lh c2lh = this.$isShowingLicenseInfo;
        I0U i0u = (I0U) 1Bu.A06(3vP.A00(c2k6), 114916);
        Context A00 = 3vP.A00(c2k6);
        IpP ipP = new IpP(c2lh);
        11T.A0F(fbUserSession, 0);
        Resources resources = A00.getResources();
        ArrayList A0y = 7zO.A0y(resources);
        EffectItem effectItem = ((Hpl) 4YU.A0o(fbUserSession, i0u.A03, 114977)).A00;
        if (AbL.A1H(i0u.A0B) && effectItem != null) {
            A0y.add(0Pz.A0W("[FB-only] effect_id: ", ((BaseItem) effectItem).A09));
            A0y.add("[FB-only] Report Bug");
        }
        A0y.add(4YU.A0t(resources, 2131956306));
        if (!z2 && z3) {
            A0y.add(4YU.A0t(resources, 2131956305));
        }
        if (z) {
            A0y.add(4YU.A0t(resources, 2131956301));
        }
        i0u.A01 = (String[]) A0y.toArray(new String[0]);
        1Br.A0C(i0u.A0C);
        DR6 A0K = AbL.A0K(A00, i0u.A0D);
        A0K.A00(2131956303);
        A0K.A01(new IGL(0, A00, fbUserSession, i0u, ipP), i0u.A01);
        A0K.A0H(new LFZ(fbUserSession, i0u, 1));
        A0K.A07(new LFF(i0u, fbUserSession, 1));
        JZj A04 = A0K.A04();
        A04.show();
        i0u.A00 = A04;
        ((2Qa) 1Lo.A04(A00, fbUserSession, (1BY) null, 33089)).A02(i0u.A0F);
        return 04S.A00;
    }
}
