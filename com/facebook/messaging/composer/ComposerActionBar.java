package com.facebook.messaging.composer;

import X.0QO;
import X.1BQ;
import X.1BV;
import X.C00i;
import X.C1234Abc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.Map;

/* loaded from: ComposerActionBar.class */
public class ComposerActionBar extends CustomLinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public C00i A03;
    public C1234Abc A04;
    public ImmutableList A05;
    public String A06;
    public ViewStub[] A07;
    public ComposerActionButton[] A08;
    public C00i A09;
    public final Map A0A;

    public ComposerActionBar(Context context) {
        super(context);
        this.A05 = ImmutableList.of();
        this.A0A = new 0QO(0);
        this.A06 = "text";
        A00();
    }

    public ComposerActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = ImmutableList.of();
        this.A0A = new 0QO(0);
        this.A06 = "text";
        A00();
    }

    public ComposerActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = ImmutableList.of();
        this.A0A = new 0QO(0);
        this.A06 = "text";
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        this.A03 = new 1BQ(16839);
        this.A09 = new 1BV(50088);
        new 1BV(66907).get();
        this.A00 = 4;
        this.A07 = new ViewStub[4];
        this.A08 = new ComposerActionButton[4];
        A0D(2132542886);
        this.A07[0] = findViewById(2131363230);
        this.A07[1] = findViewById(2131363231);
        this.A07[2] = findViewById(2131363232);
        this.A07[3] = findViewById(2131363233);
    }

    public static void A01(ComposerActionBar composerActionBar) {
        C00i c00i = composerActionBar.A09;
        c00i.getClass();
        c00i.get();
        int i = "text".equals(composerActionBar.A06) ? composerActionBar.A01 : composerActionBar.A02;
        for (Map.Entry entry : composerActionBar.A0A.entrySet()) {
            ComposerActionButton composerActionButton = (ComposerActionButton) entry.getValue();
            composerActionButton.A00(i, composerActionBar.A01);
            composerActionButton.setSelected(((String) entry.getKey()).equals(composerActionBar.A06));
        }
    }
}
