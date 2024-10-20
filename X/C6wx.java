package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6wx, reason: invalid class name */
/* loaded from: 6wx.class */
public final class C6wx {
    public final Fragment A00;
    public final GP7 A01;
    public final 6RU A02;

    public C6wx(Fragment fragment, GP7 gp7, 6RU r304) {
        11T.A0F(gp7, 3);
        this.A00 = fragment;
        this.A02 = r304;
        this.A01 = gp7;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.6yW, java.lang.Object] */
    public void A00(ThreadKey threadKey, Integer num) {
        11T.A0F(threadKey, 0);
        String A0t = 1BK.A0t();
        11T.A0A(A0t);
        MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
        int intValue = num.intValue();
        builder.A0D = intValue != 1 ? intValue != 2 ? C6r6.A0p : C6r6.A0q : C6r6.A0r;
        builder.A0C = C6x5.A02;
        builder.A04 = threadKey;
        builder.A02(null);
        C6x1 c6x1 = C6x1.A04;
        ImmutableList of = ImmutableList.of((Object) c6x1);
        11T.A0A(of);
        builder.A0R = of;
        builder.A09 = c6x1;
        builder.A0O = A0t;
        builder.A0X = false;
        builder.A0Z = false;
        6zX r0 = new 6zX();
        r0.A07 = false;
        r0.A09 = false;
        r0.A0K = true;
        r0.A0B = false;
        r0.A0G = false;
        r0.A0D = true;
        r0.A0J = true;
        r0.A00 = threadKey;
        r0.A0N = false;
        r0.A0M = false;
        builder.A01 = new MediaPickerEnvironment(r0);
        MontageComposerFragmentParams A00 = builder.A00();
        6RU r02 = this.A02;
        Intent A12 = MontageComposerActivity.A12(r02.A00, A00, NavigationTrigger.A03("messenger_montage_media_picker"));
        ?? obj = new Object();
        Bundle extras = A12.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        11T.A0D(extras);
        obj.A01(extras);
        obj.A02(this.A00);
        ((6yW) obj).A00 = 7378;
        ((6yW) obj).A04 = MontageComposerActivity.class;
        C6yf A002 = obj.A00();
        GP7 gp7 = this.A01;
        Integer num2 = 0S2.A01;
        C1yg c1yg = threadKey.A06;
        11T.A09(c1yg);
        gp7.A01(c1yg, num2, null, num, A0t);
        A002.BXy(r02);
    }
}
