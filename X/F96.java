package X;

import android.R;
import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Files;
import java.util.Collections;
import java.util.Locale;

/* loaded from: F96.class */
public final class F96 {
    public static final ImmutableSet A05 = ImmutableSet.A06("avi", "flv", "mkv", "mov", "mpg", "webm", "wmv");
    public static final ImmutableSet A06 = ImmutableSet.A06("avi", "flv", "mkv", "mpg", "webm", "wmv", new String[0]);
    public 1BY A00;
    public final Context A01 = 7zP.A0J();
    public final C1is A02 = (C1is) 1Bi.A03(16766);
    public final 2Kv A03 = (2Kv) 1Bi.A03(16973);
    public final C00i A04 = 1BQ.A02(100209);

    public F96(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public boolean A00(Uri uri) {
        ImmutableSet immutableSet = A05;
        if (1Br.A07(((Ee2) this.A04.get()).A00).AZk(72340129871563812L)) {
            immutableSet = A06;
        }
        return !immutableSet.contains(Files.A02(uri.getPath()).toLowerCase(Locale.US));
    }

    public boolean A01(Uri uri, String str) {
        FJp fJp = new FJp(1);
        if (A00(uri)) {
            return true;
        }
        C2121Dea A03 = C2121Dea.A03(this.A01);
        A03.A06(2131967868);
        A03.A05(2131967867);
        A03.A0E(fJp, R.string.ok);
        A03.A0C(false);
        A03.A04();
        this.A02.A0I("messenger_video_format_not_supported_dialog", Collections.singletonMap("fromModule", str), true);
        2Kv r0 = this.A03;
        r0.A08("fromModule", str);
        r0.A06((Object) null, "messenger_video_format_not_supported_dialog", 1BJ.A00(ActionId.DATA_LOAD_START));
        return false;
    }
}
