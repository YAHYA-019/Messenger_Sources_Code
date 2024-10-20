package com.facebook.payments.invoice.creation.v2.ui;

import X.2XA;
import X.2Xd;
import X.3wX;
import X.DSW;
import X.FXq;
import X.JiH;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.ArrayList;

/* loaded from: ImagePreviewActivity.class */
public class ImagePreviewActivity extends FbFragmentActivity {
    public int A00;
    public ImageView A01;
    public ImageView A02;
    public RecyclerView A03;
    public 3wX A04;
    public ArrayList A05;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542143);
        this.A02 = (ImageView) A2c(2131365507);
        this.A01 = (ImageView) A2c(2131365508);
        FXq.A01(this.A02, this, 55);
        FXq.A01(this.A01, this, 56);
        RecyclerView recyclerView = (RecyclerView) A2c(2131366868);
        this.A03 = recyclerView;
        ArrayList arrayList = this.A05;
        if (arrayList != null) {
            2Xd r0 = new 2Xd();
            ((DSW) r0).A00 = arrayList;
            recyclerView.A16(r0);
        }
        RecyclerView recyclerView2 = this.A03;
        recyclerView2.A0T = true;
        JiH jiH = new JiH();
        this.A04 = jiH;
        jiH.A05(recyclerView2);
        2XA r02 = this.A03.A0F;
        if (r02 != null) {
            r02.A1L(this.A00);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A05 = getIntent().getParcelableArrayListExtra("imageList");
        this.A00 = getIntent().getIntExtra("imagePos", 0);
    }
}
