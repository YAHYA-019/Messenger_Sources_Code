package com.facebook.smartcapture.view;

import X.04R;
import X.0FI;
import X.0Q8;
import X.11T;
import X.C01g;
import X.C01i;
import X.HL7;
import X.HNV;
import X.Hp9;
import X.J9o;
import X.JJ0;
import X.JLP;
import X.MQa;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.ui.DefaultIdCaptureUi;
import java.util.Map;

/* loaded from: IdCaptureBaseActivity.class */
public abstract class IdCaptureBaseActivity extends FragmentActivity implements JJ0, MQa {
    public Resources A00;
    public JLP A02;
    public IdCaptureConfig A03;
    public IdCaptureLogger A04;
    public IdCaptureStep A05;
    public Hp9 A07;
    public DefaultIdCaptureUi A08;
    public boolean A09;
    public DocumentType A01 = DocumentType.ID1;
    public IdCaptureStep A06 = IdCaptureStep.INITIAL;
    public final C01i A0A = C01g.A01(new J9o(this, 0));

    public final IdCaptureConfig A2c() {
        IdCaptureConfig idCaptureConfig = this.A03;
        if (idCaptureConfig != null) {
            return idCaptureConfig;
        }
        11T.A0L("idCaptureConfig");
        throw 0Q8.createAndThrow();
    }

    public final IdCaptureLogger A2d() {
        IdCaptureLogger idCaptureLogger = this.A04;
        if (idCaptureLogger != null) {
            return idCaptureLogger;
        }
        11T.A0L("mIdCaptureLogger");
        throw 0Q8.createAndThrow();
    }

    public abstract IdCaptureStep A2e();

    @Override // X.MFd
    public Hp9 AiP() {
        return this.A07;
    }

    @Override // X.JJ0
    public Map App() {
        return this.A08 != null ? HNV.A00 : 04R.A0G();
    }

    @Override // X.JJ0
    public HL7 BD9() {
        return (HL7) this.A0A.getValue();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.A00;
        if (resources == null) {
            resources = super.getResources();
            11T.A0A(resources);
        }
        return resources;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.A09 = false;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x02ee, code lost:
    
        if (r304 == null) goto L51;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.view.IdCaptureBaseActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1105477442);
        super.onResume();
        if (!this.A09) {
            this.A09 = true;
            IdCaptureStep idCaptureStep = this.A05;
            IdCaptureLogger A2d = A2d();
            if (idCaptureStep != null) {
                IdCaptureStep idCaptureStep2 = this.A05;
                11T.A0D(idCaptureStep2);
                A2d.logStepChange(idCaptureStep2, A2e());
                this.A05 = null;
            } else {
                A2d.logStepChange(this.A06, A2e());
            }
        }
        0FI.A07(-597636205, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("step_change_logged", this.A09);
    }
}
