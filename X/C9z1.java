package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.facebook.messaging.livelocation.static_map.LocationMapCardDialogFragment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.9z1, reason: invalid class name */
/* loaded from: 9z1.class */
public final class C9z1 implements 6MZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9z1(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v127, types: [com.facebook.messaging.fullscreendialog.FullScreenDialogFragment, com.facebook.messaging.livelocation.static_map.LocationMapCardDialogFragment, androidx.fragment.app.Fragment] */
    public /* bridge */ /* synthetic */ boolean CX9(View view, C7sh c7sh, Object obj) {
        switch (this.A00) {
            case 0:
                ((C9mX) ((C00i) this.A02).get()).A04(6Pq.A0I, (Message) obj);
                6MW r0 = ((6MV) this.A01).A03;
                if (r0 == null) {
                    return true;
                }
                6F2 r02 = r0.A00;
                ImmutableSet immutableSet = 6F2.A4P;
                6QS r03 = r02.A0b;
                6Sp r04 = (6Sp) r03.A04.get();
                6fA r05 = r03.A0H;
                r04.A02(r03.mFragmentManager, r03.A1R, r05 != null ? r05.A02 : null, "xma", "location_interstitial");
                r03.A0X = 0S2.A01;
                return true;
            case 1:
                String string = c7sh.A00.getString("extra_mdotme_userid", null);
                11T.A0A(string);
                ((6HS) ((6MV) this.A01).A0E.get()).A05(7zU.A0S(1BK.A0X(string), this.A02), (MessageDeepLinkInfo) null, 5SW.A1M, "from_mdotme_xma");
                return true;
            case 2:
                Bundle bundle = c7sh.A00;
                String string2 = bundle.getString("extra_userid", null);
                11T.A0A(string2);
                ThreadKey A0S = 7zU.A0S(1BK.A0X(string2), this.A02);
                5SW serializable = bundle.getSerializable("extra_source");
                String string3 = bundle.getString("extra_analytics_reason", null);
                11T.A0A(string3);
                6HS r06 = (6HS) ((6MV) this.A01).A0E.get();
                if (serializable == null) {
                    serializable = 5SW.A1M;
                }
                r06.A05(A0S, (MessageDeepLinkInfo) null, serializable, string3);
                return true;
            default:
                11T.A0F(c7sh, 1);
                Bundle bundle2 = (Bundle) c7sh.A00.getParcelable("extra_multiple_location_map_details");
                if (bundle2 == null) {
                    return true;
                }
                6MX r07 = (6MX) this.A02;
                Fragment fragment = (Fragment) this.A01;
                String string4 = bundle2.getString("title");
                String string5 = bundle2.getString("description");
                String A00 = GOm.A00(83);
                String string6 = bundle2.getString(A00);
                ArrayList<? extends Parcelable> parcelableArrayList = bundle2.getParcelableArrayList("coordinates");
                Serializable serializable2 = HB5.A04;
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("places");
                ?? locationMapCardDialogFragment = new LocationMapCardDialogFragment();
                Bundle A05 = 1BK.A05();
                if (string4 == null) {
                    string4 = "";
                }
                A05.putString("title", string4);
                A05.putString("description", string5);
                A05.putString(A00, string6);
                if (parcelableArrayList == null) {
                    parcelableArrayList = AnonymousClass001.A0s();
                }
                A05.putParcelableArrayList("coordinates", parcelableArrayList);
                if (stringArrayList == null) {
                    A05.putStringArrayList("places", AnonymousClass001.A0s());
                } else {
                    A05.putStringArrayList("places", stringArrayList);
                }
                A05.putSerializable(GOm.A00(9), serializable2);
                locationMapCardDialogFragment.setArguments(A05);
                6MX.A00(fragment, (FullScreenDialogFragment) locationMapCardDialogFragment, r07);
                return true;
        }
    }
}
