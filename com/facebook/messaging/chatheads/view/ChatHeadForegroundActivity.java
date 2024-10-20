package com.facebook.messaging.chatheads.view;

import X.0FI;
import X.0fH;
import X.1Bi;
import X.1Hv;
import X.1I7;
import X.1P9;
import X.1PA;
import X.AnonymousClass025;
import X.AnonymousClass074;
import X.C00i;
import X.C01s;
import X.CZL;
import X.D0U;
import X.Kok;
import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/* loaded from: ChatHeadForegroundActivity.class */
public class ChatHeadForegroundActivity extends Activity implements AnonymousClass025 {
    public View A00;
    public 1PA A01;
    public 1I7 A02;
    public C00i A03;
    public final Kok A06 = (Kok) 1Bi.A03(131295);
    public final C01s A04 = (C01s) 1Bi.A03(16511);
    public final AnonymousClass074 A05 = new Object();

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        return this.A05.A00(obj);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        this.A05.A01(obj, obj2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(-1284667164);
        super.onCreate(bundle);
        0fH.A0j("ChatHeadForegroundActivity", "onCreate.");
        this.A02 = (1I7) 1Hv.A02(this, 65728);
        this.A03 = 1Bi.A00(99952);
        if (!this.A06.A00()) {
            0fH.A0j("ChatHeadForegroundActivity", "Finish ChatHeadForegroundActivity because chat head is collapsed.");
            finish();
            overridePendingTransition(0, 0);
        }
        setContentView(2132542724);
        View findViewById = findViewById(R.id.content);
        this.A00 = findViewById;
        findViewById.setOnTouchListener(new CZL(this, 0));
        1P9 Bgy = this.A02.Bgy();
        Bgy.A05(new D0U(this, 6), "chat_head_collapsed");
        1PA A02 = Bgy.A02();
        this.A01 = A02;
        A02.A00();
        0FI.A07(629625398, A00);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(1956022034);
        super.onDestroy();
        0fH.A0j("ChatHeadForegroundActivity", "ChatHeadForegroundActivity is destroyed.");
        1PA r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        0FI.A07(-701366389, A00);
    }
}
