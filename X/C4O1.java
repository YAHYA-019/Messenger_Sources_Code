package X;

import android.content.Context;
import com.facebook.messaging.encryptedbackups.plugins.inboxrestorebanner.InboxRestoreBanner;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4O1, reason: invalid class name */
/* loaded from: 4O1.class */
public final class C4O1 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4O1(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object c4q1;
        switch (this.A00) {
            case 0:
                List list = (List) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("Updating live data for new community list result received of size: ");
                Integer num = null;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                }
                sb.append(num);
                0fH.A0j("ObserverBasedCommunityListResource", sb.toString());
                C4Mx c4Mx = (C4Mx) this.A01;
                AtomicReference atomicReference = c4Mx.A05;
                if (list == null) {
                    c4q1 = new C4Pz((List) atomicReference.get());
                } else {
                    atomicReference.set(list);
                    c4q1 = new C4Q1(AbU.A05, list);
                }
                ((C1x1) c4Mx.A02.A00.get()).A00(c4Mx, c4q1);
                break;
            case 1:
                ImmutableList immutableList = (ImmutableList) obj;
                11T.A0F(immutableList, 0);
                Object obj2 = new Object();
                AnonymousClass479 anonymousClass479 = (AnonymousClass479) this.A01;
                ((C2eo) 1Lm.A07(anonymousClass479.A00, anonymousClass479.A01.A00, 17061)).A07(new Cmj(obj2, 1), immutableList);
                return obj2;
            case 2:
                ImmutableList immutableList2 = (ImmutableList) obj;
                11T.A0F(immutableList2, 0);
                AnonymousClass479 anonymousClass4792 = (AnonymousClass479) this.A01;
                C2eo c2eo = (C2eo) 1Lm.A07(anonymousClass4792.A00, anonymousClass4792.A01.A00, 17061);
                return C2eo.A02(c2eo, (C1qy) c2eo.A08.get(), immutableList2, LocationComponentOptions.STALE_STATE_DELAY_MS);
            case 3:
                InboxRestoreBanner inboxRestoreBanner = ((C48u) this.A01).A02.A00;
                inboxRestoreBanner.A03.A00.get();
                CAV.A00(inboxRestoreBanner.A00, "fb-messenger-secure://encrypted_backup/restore?source=INBOX_BANNER");
                break;
            case 4:
                ((Number) obj).floatValue();
                ((4NJ) this.A01).A01.A01.A1X().Bgo();
                break;
            case 5:
                1VJ r0 = (1VJ) obj;
                11T.A0F(r0, 0);
                Context context = ((C4Lr) this.A01).A05;
                r0.A00(new C4Lt(context), C4Lu.A00);
                r0.A00(new C4Lt(context), C4Lw.A00);
                break;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C4Fl c4Fl = (C4Fl) this.A01;
                FolderNameDrawerFolderKey folderNameDrawerFolderKey = C4Fm.A0U;
                c4Fl.A03 = booleanValue;
                break;
            default:
                0DR r02 = (0DR) this.A01;
                04S r03 = 04S.A00;
                r02.resumeWith(r03);
                return r03;
        }
        return 04S.A00;
    }
}
