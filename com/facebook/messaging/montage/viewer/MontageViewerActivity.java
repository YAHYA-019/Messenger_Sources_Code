package com.facebook.messaging.montage.viewer;

import X.09K;
import X.1BK;
import X.1BQ;
import X.1Fv;
import X.6uV;
import X.7Mg;
import X.7zK;
import X.7zL;
import X.AbF;
import X.AnonymousClass001;
import X.C00i;
import X.C01s;
import X.C2801Goe;
import X.C3o5;
import X.IAa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: MontageViewerActivity.class */
public class MontageViewerActivity extends FbFragmentActivity {
    public final C00i A00 = 1BQ.A02(66459);
    public final C00i A03 = 1BQ.A01();
    public final C00i A01 = AbF.A0Q(this, 67720);
    public final C00i A02 = AbF.A0Q(this, 50024);
    public final C00i A05 = 7zL.A0R(this, 50185);
    public final C00i A04 = 1BQ.A02(66351);

    public static Intent A12(Context context, Message message, MontageBucketPreview montageBucketPreview, 7Mg r304, String str) {
        return C3o5.A0D(context, MontageViewerActivity.class).putExtra("montage_thread_info", montageBucketPreview).putExtra("launch_source", (Serializable) r304).putExtra(7zK.A00(ActionId.RTMP_PACKET_RECEIVED), false).putExtra("montage_message", message).putExtra("open_seen_by_list_on_load", false).putExtra("montage_reaction", str);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        IAa A02;
        super.A2y(bundle);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(4);
        }
        Intent intent = getIntent();
        7Mg serializableExtra = intent.getSerializableExtra("launch_source");
        Message message = (Message) intent.getParcelableExtra("montage_message");
        FbUserSession A05 = ((1Fv) this.A04.get()).A05(this);
        boolean booleanExtra = intent.getBooleanExtra("open_seen_by_list_on_load", false);
        String stringExtra = intent.getStringExtra("montage_reaction");
        C2801Goe c2801Goe = new C2801Goe(intent, this);
        if (message == null) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("bucket_ids");
            if (09K.A01(stringArrayListExtra)) {
                C01s A09 = 1BK.A09(this.A03);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("No bucket ids passed to montage viewer activity. Intent = ");
                A09.D11("MontageViewerActivity", AnonymousClass001.A0a(getIntent(), A0k));
                finish();
                return;
            }
            6uV r0 = (6uV) this.A05.get();
            if (serializableExtra == null) {
                serializableExtra = 7Mg.A0R;
            }
            A02 = r0.A02(A05, serializableExtra);
            stringArrayListExtra.getClass();
            A02.A0F = stringArrayListExtra;
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("montage_thread_info");
            if (parcelableExtra == null) {
                return;
            }
            6uV r02 = (6uV) this.A05.get();
            if (serializableExtra == null) {
                serializableExtra = 7Mg.A0R;
            }
            A02 = r02.A02(A05, serializableExtra);
            A02.A0G = ImmutableList.of((Object) parcelableExtra);
            A02.A0E = message.A1V;
            A02.A0A = message.A1g;
        }
        A02.A0I = booleanExtra;
        if (stringExtra == null) {
            stringExtra = "";
        }
        A02.A07 = stringExtra;
        A02.A05 = c2801Goe;
        IAa.A02((Context) null, BDe(), A02, "montage_viewer");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }
}
