package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.inboxsubtabs.plugins.subtabs.itemviewbinder.InboxSubtabsItemViewBinderImplementation;
import com.facebook.messaging.media.resharehub.ui.ReshareHubMediaPreviewFragment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.nativepagereply.plugins.filters.filtersegmentedcontrolitemsupplier.FilterSegmentedControlItemSupplierImplementation;
import com.facebook.messaging.nativepagereply.plugins.filters.inboxlifecycle.InboxFilterStatusBroadcastListenerImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* loaded from: A38.class */
public final class A38 implements C02l {
    public final int A00;
    public final Object A01;

    public A38(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.C02l
    public void CFb(Context context, Intent intent, C01q c01q) {
        int A00;
        int i;
        String str;
        int A002;
        int i2;
        switch (this.A00) {
            case 0:
                A00 = C09o.A00(-644369526);
                6PX.A02((6PX) this.A01, 0S2.A00);
                i = 1014879778;
                C09o.A01(i, A00);
                return;
            case 1:
                A00 = C09o.A00(97075907);
                InboxSubtabsItemViewBinderImplementation inboxSubtabsItemViewBinderImplementation = (InboxSubtabsItemViewBinderImplementation) this.A01;
                if (inboxSubtabsItemViewBinderImplementation.A01 != null) {
                    int indexOf = InboxSubtabsItemViewBinderImplementation.A00(inboxSubtabsItemViewBinderImplementation).indexOf(1Hb.A02);
                    if (indexOf == -1) {
                        indexOf = 0;
                    }
                    3wK.A01(inboxSubtabsItemViewBinderImplementation.A0F, indexOf);
                    3wJ r0 = inboxSubtabsItemViewBinderImplementation.A01;
                    if (r0 == null) {
                        str = "tabSelectedListener";
                        11T.A0L(str);
                        throw 0Q8.createAndThrow();
                    }
                    r0.CPj(indexOf);
                }
                i = -1291905632;
                C09o.A01(i, A00);
                return;
            case 2:
                A002 = C09o.A00(-1812358993);
                11T.A0F(intent, 1);
                Parcelable parcelableExtra = intent.getParcelableExtra("reshare_hub_preview_model");
                8H8 r02 = (8H8) this.A01;
                if (parcelableExtra == null) {
                    IllegalStateException A0h = 1BK.A0h();
                    C09o.A01(-1441956665, A002);
                    throw A0h;
                }
                MigColorScheme migColorScheme = r02.A03;
                ThreadKey threadKey = r02.A02;
                11T.A0F(migColorScheme, 1);
                2Ov reshareHubMediaPreviewFragment = new ReshareHubMediaPreviewFragment();
                Bundle A05 = 1BK.A05();
                A05.putParcelable("media_preview_model", parcelableExtra);
                A05.putParcelable("color_scheme", migColorScheme);
                A05.putParcelable("thread_key", threadKey);
                reshareHubMediaPreviewFragment.setArguments(A05);
                1Br.A0C(r02.A0A);
                reshareHubMediaPreviewFragment.A0m(7zN.A08(r02), "resahre_hub_media_preview_fragment");
                i2 = -1378148146;
                C09o.A01(i2, A002);
                return;
            case 3:
                A00 = 1BL.A04(intent, 2111620405);
                Message message = (Message) intent.getParcelableExtra("reshare_hub_preview_sent_message");
                8H8 r03 = (8H8) this.A01;
                6Je r04 = r03.A00;
                if (r04 != null) {
                    if (message == null) {
                        IllegalStateException A0h2 = 1BK.A0h();
                        C09o.A01(-2112386580, A00);
                        throw A0h2;
                    }
                    5Pz r05 = 5Pz.A14;
                    Integer num = 0S2.A01;
                    Integer num2 = r03.A04;
                    if (num2 == null) {
                        str = "entryPoint";
                        11T.A0L(str);
                        throw 0Q8.createAndThrow();
                    }
                    r04.Ckq(r05, message, AnonymousClass001.A1W(num, num2));
                }
                6Je r06 = r03.A00;
                if (r06 != null) {
                    r06.ANa((AXn) null, 0S2.A0G);
                }
                i = 242199338;
                C09o.A01(i, A00);
                return;
            case 4:
                A002 = C09o.A00(2025793362);
                ((C8vB) this.A01).A1e(true);
                i2 = 139583898;
                C09o.A01(i2, A002);
                return;
            case 5:
                A00 = C09o.A00(-1852224181);
                FilterSegmentedControlItemSupplierImplementation filterSegmentedControlItemSupplierImplementation = (FilterSegmentedControlItemSupplierImplementation) this.A01;
                if (!1BK.A1T(1Br.A09(((C3Nq) 1Br.A0B(filterSegmentedControlItemSupplierImplementation.A04)).A00), C2bv.A0S) || ((2Ra) 1Br.A0B(filterSegmentedControlItemSupplierImplementation.A02)).A05()) {
                    filterSegmentedControlItemSupplierImplementation.A05.A00(1BJ.A00(265), "Rerender Segmented Control for Follow Up Filter QP.");
                }
                i = -924857547;
                C09o.A01(i, A00);
                return;
            case 6:
                A002 = C09o.A00(-1783364200);
                InboxFilterStatusBroadcastListenerImplementation inboxFilterStatusBroadcastListenerImplementation = (InboxFilterStatusBroadcastListenerImplementation) this.A01;
                inboxFilterStatusBroadcastListenerImplementation.A02.AEZ(((2SG) 1Br.A0B(inboxFilterStatusBroadcastListenerImplementation.A01)).A00);
                i2 = 2071786513;
                C09o.A01(i2, A002);
                return;
            case 7:
                A002 = C09o.A00(-1277957251);
                8GW r07 = (8GW) this.A01;
                r07.A05 = true;
                8GW.A03(r07);
                i2 = -257496928;
                C09o.A01(i2, A002);
                return;
            case 8:
                A002 = 1BL.A04(intent, -1728041038);
                Serializable serializableExtra = intent.getSerializableExtra(1BJ.A00(1270));
                11T.A0I(serializableExtra, "null cannot be cast to non-null type com.facebook.messaging.intents.MessagesBroadcastIntents.BulkActionButtonType");
                7zL.A1T(this.A01, serializableExtra);
                i2 = -577933005;
                C09o.A01(i2, A002);
                return;
            default:
                A002 = 1BL.A04(intent, 460074889);
                7zN.A1a((Function1) this.A01, intent.getBooleanExtra("multi_select_toggle_state", false));
                i2 = 1103932548;
                C09o.A01(i2, A002);
                return;
        }
    }
}
