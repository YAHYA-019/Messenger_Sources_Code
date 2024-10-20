package com.facebook.reportingcoordinator;

import X.1BY;
import X.1Bn;
import X.1iF;
import X.7zO;
import X.AbL;
import X.C2221Dhd;
import X.ExF;
import X.FJ8;
import X.GIc;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.flatbuffers.Flattenable;
import com.facebook.rapidreporting.model.DialogConfig;
import com.facebook.rapidreporting.model.DialogStateData;
import java.util.List;

/* loaded from: RapidReportingHostActivity.class */
public class RapidReportingHostActivity extends FbFragmentActivity implements GIc {
    public ExF A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = (ExF) 1Bn.A0E(this, (1BY) null, 98802);
        DialogConfig dialogConfig = new DialogConfig(this, null, getIntent().getStringExtra("location"), getIntent().getStringExtra("object_id"));
        if (7zO.A0H(this).getParcelable("extra_report_prompt") == null) {
            ExF exF = this.A00;
            exF.getClass();
            exF.A00(this, dialogConfig);
        } else {
            C2221Dhd c2221Dhd = (C2221Dhd) ((Flattenable) FJ8.A03(7zO.A0H(this), "extra_report_prompt"));
            DialogStateData dialogStateData = new DialogStateData(dialogConfig);
            dialogStateData.A02(c2221Dhd);
            ExF exF2 = this.A00;
            exF2.getClass();
            exF2.A01(this, dialogStateData);
        }
    }

    @Override // X.GIc
    public void COt(List list) {
        finish();
    }

    @Override // X.GIc
    public void onCancel() {
        finish();
    }
}
