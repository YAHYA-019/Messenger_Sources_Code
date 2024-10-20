package com.facebook.messaging.threadview.iconpicker;

import X.1BK;
import X.1FX;
import X.1JF;
import X.1Kd;
import X.1Lo;
import X.1lN;
import X.2Jy;
import X.4YU;
import X.5HP;
import X.7zL;
import X.9Z2;
import X.ABp;
import X.AZG;
import X.AbF;
import X.AbH;
import X.AbL;
import X.AgH;
import X.C00i;
import X.C1kw;
import X.C2J3;
import X.CHy;
import X.CfG;
import X.CjO;
import X.Cm3;
import X.H9H;
import X.JJz;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment;
import com.facebook.messaging.media.mediapicker.dialog.params.CropImageParams;
import com.facebook.messaging.media.mediapicker.dialog.params.PickMediaDialogParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.ModifyThreadParams;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.SingletonImmutableSet;

/* loaded from: ThreadIconPickerActivity.class */
public class ThreadIconPickerActivity extends FbFragmentActivity implements 1lN {
    public C00i A00;
    public C00i A01;
    public String A02;
    public ThreadKey A04;
    public final C00i A07 = AbH.A0P();
    public final C00i A06 = 7zL.A0R(this, 82650);
    public JJz A03 = new Cm3(this, 4);
    public final AZG A05 = new CjO(this);

    public static void A12(ThreadIconPickerActivity threadIconPickerActivity, MediaResource mediaResource) {
        ModifyThreadParams modifyThreadParams = new ModifyThreadParams(threadIconPickerActivity.A04, null, null, null, mediaResource, null, null, false, false, false, false, false, true);
        CfG A01 = ((CHy) threadIconPickerActivity.A06.get()).A01(threadIconPickerActivity, 2131966953);
        threadIconPickerActivity.A02 = 1BK.A0t();
        ((9Z2) threadIconPickerActivity.A01.get()).A00(A01, threadIconPickerActivity.A05, modifyThreadParams, threadIconPickerActivity.A02);
        C1kw A06 = 1BK.A06(threadIconPickerActivity.A07);
        if (AgH.A00 == null) {
            synchronized (AgH.class) {
                if (AgH.A00 == null) {
                    AgH.A00 = new C2J3(A06);
                }
            }
        }
        AgH agH = AgH.A00;
        2Jy A0H = 4YU.A0H("set");
        A0H.A0D("pigeon_reserved_keyword_module", "thread_icon");
        A0H.A09(threadIconPickerActivity.A04, "thread_key");
        A0H.A0D("pigeon_reserved_keyword_obj_type", "thread_image");
        agH.A03(A0H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof PickMediaDialogFragment) {
            ((PickMediaDialogFragment) fragment).A07 = this.A03;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = AbF.A0Q(this, 50020);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("threadKey");
        parcelableExtra.getClass();
        this.A04 = (ThreadKey) parcelableExtra;
        this.A01 = 1Lo.A00(this, AbL.A08(this), 68443);
        if (bundle != null) {
            this.A02 = bundle.getString("operation_id");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    public String AWg() {
        return "thread_icon";
    }

    public Long Am7() {
        return null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent.getBooleanExtra("remove", false)) {
                A12(this, (MediaResource) null);
                return;
            }
            H9H serializableExtra = intent.getSerializableExtra("mediaSource");
            CropImageParams cropImageParams = new CropImageParams(1, 1, getResources().getDimensionPixelSize(2132279532), getResources().getDimensionPixelSize(2132279532));
            5HP r0 = 5HP.A0F;
            new SingletonImmutableSet(r0);
            PickMediaDialogFragment A05 = PickMediaDialogFragment.A05(new PickMediaDialogParams(cropImageParams, serializableExtra, null, AbF.A11(r0)));
            A05.A07 = this.A03;
            A05.A0m(BDe(), "pick_media_dialog");
            return;
        }
        if (1JF.A0B(this.A02)) {
            return;
        }
        9Z2 r02 = (9Z2) this.A01.get();
        String str = this.A02;
        AZG azg = this.A05;
        Pair pair = r02.A00;
        if (pair == null || !((String) pair.first).equals(str)) {
            return;
        }
        1FX r03 = (1FX) pair.second;
        1Kd.A0D(r02.A03, new ABp(azg, r02, 2), r03);
        r02.A00 = null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("operation_id", this.A02);
    }
}
