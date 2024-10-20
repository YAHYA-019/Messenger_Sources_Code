package com.facebook.messaging.sharing.broadcastflow;

import X.06Z;
import X.0LS;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1Hv;
import X.1pH;
import X.3QF;
import X.4YT;
import X.53D;
import X.7zM;
import X.7zP;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.C09p;
import X.C1567Alm;
import X.C1lM;
import X.CZl;
import X.Ct6;
import X.DHW;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.HashMap;
import java.util.Map;

/* loaded from: BroadcastFlowActivity.class */
public class BroadcastFlowActivity extends FbFragmentActivity implements C1lM {
    public View A00;
    public C1567Alm A01;
    public 1pH A02;
    public 3QF A03;
    public final C00i A05 = 1BQ.A02(84039);
    public final DHW A06 = new Ct6(this);
    public final C09p A04 = new CZl(this, 3);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        if (fragment instanceof C1567Alm) {
            ((C1567Alm) fragment).A0I = this.A06;
        }
        super.A2b(fragment);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        this.A01.A0I = null;
        C00i c00i = this.A05;
        if (c00i.get() != null) {
            53D r0 = (53D) c00i.get();
            int hashCode = hashCode();
            0fH.A0g(Integer.valueOf(hashCode), 4YT.A00(ActionId.LEGACY_MARKER), 1BJ.A00(1241));
            if (r0.A00 == hashCode) {
                r0.A02 = false;
            }
        }
        this.A02.A06();
        06Z BDe = BDe();
        BDe.A0A.remove(this.A04);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        finish();
        Intent intent2 = new Intent(intent);
        intent2.setComponent(new ComponentName(this, (Class<?>) BroadcastFlowActivity.class));
        intent2.setSelector(null);
        0LS.A0A(this, intent2);
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [X.Alm, androidx.fragment.app.Fragment] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A03 = (3QF) 1Hv.A02(this, 84139);
        setContentView(2132541613);
        MigColorScheme.A00(A2c(2131362631), AbI.A0d(this));
        View findViewById = findViewById(2131362631);
        findViewById.getClass();
        this.A00 = findViewById;
        View A0F = 7zM.A0F(this);
        A0F.getClass();
        this.A02 = AbL.A0B(this, A0F);
        BDe().A1L(this.A04);
        7zP.A0e(this.A03.A02).markerStart(21430273);
        53D r0 = (53D) this.A05.get();
        Intent intent = getIntent();
        r0.A01(intent.getStringExtra("extra_tracking_codes"), hashCode());
        C1567Alm c1567Alm = (C1567Alm) BDe().A0b(C1567Alm.__redex_internal_original_name);
        this.A01 = c1567Alm;
        if (c1567Alm == null) {
            Intent intent2 = getIntent();
            ?? c1567Alm2 = new C1567Alm();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("fragment_host_intent", intent2);
            c1567Alm2.setArguments(A05);
            this.A01 = c1567Alm2;
            this.A02.Czy((Fragment) c1567Alm2, C1567Alm.__redex_internal_original_name);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // X.C1lM
    public Map AWe() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("is_meetup", Boolean.valueOf(getIntent().getParcelableExtra("extra_share_model") instanceof SpeakeasyRoomShareIntentModel));
        return A0u;
    }

    public String AWg() {
        return "messenger_broadcast_flow";
    }

    public Long Am7() {
        return 1231747217564692L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            finish();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.A02.A07()) {
            return;
        }
        super.onBackPressed();
    }
}
