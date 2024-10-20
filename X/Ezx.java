package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.fbavatar.FbAvatarEditorBaseActivity;
import com.facebook.fbavatar.navigation.NavigationParams;
import com.google.common.collect.ImmutableList;

/* loaded from: Ezx.class */
public final class Ezx {
    public F4p A00;

    public final void A00() {
        F4p f4p = this.A00;
        if (f4p == null) {
            11T.A0L("delegate");
            throw 0Q8.createAndThrow();
        }
        Context context = ((Eze) 1Br.A0B(f4p.A00.A07)).A00;
        11T.A0I(context, "null cannot be cast to non-null type com.facebook.fbavatar.FbAvatarEditorBaseActivity");
        ((FbAvatarEditorBaseActivity) context).A3C();
    }

    public final void A01() {
        F4p f4p = this.A00;
        if (f4p == null) {
            11T.A0L("delegate");
            throw 0Q8.createAndThrow();
        }
        FAN fan = f4p.A01;
        RZK rzk = new RZK(fan.A01);
        rzk.A05 = false;
        NavigationParams navigationParams = new NavigationParams(rzk);
        fan.A01 = navigationParams;
        String str = navigationParams.A03;
        11T.A0A(str);
        F4p.A00(f4p, str, fan.A01.A04);
    }

    public final void A02() {
        F4p f4p = this.A00;
        if (f4p == null) {
            11T.A0L("delegate");
            throw 0Q8.createAndThrow();
        }
        FAN fan = f4p.A01;
        RZK rzk = new RZK(fan.A01);
        String A01 = ((EwC) 1Br.A0B(fan.A04)).A01("OUTFIT");
        rzk.A00 = A01;
        C1pq.A08("initialCategoryId", A01);
        NavigationParams navigationParams = new NavigationParams(rzk);
        fan.A01 = navigationParams;
        String str = navigationParams.A03;
        11T.A0A(str);
        F4p.A00(f4p, str, fan.A01.A04);
    }

    public final void A03() {
        F4p f4p = this.A00;
        if (f4p == null) {
            11T.A0L("delegate");
            throw 0Q8.createAndThrow();
        }
        FAN fan = f4p.A01;
        1Br.A0C(fan.A08);
        ((Eze) 1Br.A0B(fan.A07)).A01(EVJ.A00("default", 1), "profile_picture_flow", 3, true);
    }

    public final void A04() {
        F4p f4p = this.A00;
        if (f4p == null) {
            11T.A0L("delegate");
            throw 0Q8.createAndThrow();
        }
        FAN fan = f4p.A01;
        1Br.A0C(fan.A0A);
        ((Eze) 1Br.A0B(fan.A07)).A01(EVJ.A00("default", 2), "share_to_feed", 3, true);
    }

    public final void A05() {
        if (this.A00 == null) {
            11T.A0L("delegate");
            throw 0Q8.createAndThrow();
        }
    }

    public final void A06(ImmutableList immutableList) {
        F4p f4p = this.A00;
        if (f4p == null) {
            11T.A0L("delegate");
            throw 0Q8.createAndThrow();
        }
        Eze eze = (Eze) 1Br.A0B(f4p.A01.A07);
        DZB dzb = new DZB();
        Bundle A05 = 1BK.A05();
        A05.putInt("source_location", 1);
        A05.putStringArrayList("new_stickers_template_ids", 1BK.A17(immutableList));
        A05.putBoolean("show_exit_button", false);
        dzb.setArguments(A05);
        eze.A01(dzb, null, 1, true);
    }
}
