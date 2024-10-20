package com.facebook.redrawable;

import X.1Bi;
import X.1Hv;
import X.1Iy;
import X.2Xd;
import X.AnonymousClass001;
import X.DKC;
import X.DSa;
import X.Eja;
import X.FWn;
import X.FYT;
import X.Fcg;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import java.util.List;

/* loaded from: ReDrawableDebugActivity.class */
public class ReDrawableDebugActivity extends FbFragmentActivity {
    public LayoutInflater A00;
    public EditText A02;
    public BetterRecyclerView A03;
    public final 1Iy A05 = (1Iy) 1Bi.A03(16575);
    public final Fcg A06 = (Fcg) DKC.A0y();
    public final List A07 = AnonymousClass001.A0s();
    public final List A08 = AnonymousClass001.A0s();
    public boolean A01 = false;
    public final TextWatcher A09 = new FWn(this, 37);
    public final 2Xd A04 = new DSa(this);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = (LayoutInflater) 1Hv.A02(this, 100193);
        setContentView(2132543235);
        List list = this.A07;
        list.clear();
        int[] iArr = this.A05.A01;
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                this.A08.addAll(list);
                EditText editText = (EditText) findViewById(2131364117);
                this.A02 = editText;
                editText.addTextChangedListener(this.A09);
                BetterRecyclerView betterRecyclerView = (BetterRecyclerView) findViewById(2131366877);
                this.A03 = betterRecyclerView;
                betterRecyclerView.A1D(new GridLayoutManager(this, 3));
                this.A03.A16(this.A04);
                FYT.A00((CompoundButton) findViewById(2131368100), this, 14);
                return;
            }
            int i3 = iArr[i2];
            list.add(new Eja(i3, getResources().getResourceEntryName(i3)));
            i = i2 + 1;
        }
    }
}
