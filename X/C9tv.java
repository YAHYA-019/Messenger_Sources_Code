package X;

import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.9tv, reason: invalid class name */
/* loaded from: 9tv.class */
public final class C9tv implements AZF {
    public final /* synthetic */ FriendsTabFragment A00;

    public C9tv(FriendsTabFragment friendsTabFragment) {
        this.A00 = friendsTabFragment;
    }

    @Override // X.AZF
    public void C46() {
        ((Executor) this.A00.A1B.get()).execute(new Runnable() { // from class: X.ACv
            public static final String __redex_internal_original_name = "FriendsTabFragment$15$$ExternalSyntheticLambda0";

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
            @Override // java.lang.Runnable
            public final void run() {
                ?? r0 = C9tv.this.A00;
                if (r0.mDetached) {
                    return;
                }
                C9bz c9bz = (C9bz) r0.A0s.get();
                7zS.A1H(c9bz.A02);
                if ("contacts".equals(c9bz.A00)) {
                    0fH.A0j("MainSectionsPerformanceLogger", "Ending marker with FAIL action");
                    7zP.A0e(c9bz.A04).markerEnd(5505121, (short) 3);
                    ScheduledFuture scheduledFuture = c9bz.A01;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        c9bz.A01 = null;
                    }
                }
            }
        });
    }

    @Override // X.AZF
    public void CHn(final C9u3 c9u3) {
        ((Executor) this.A00.A1B.get()).execute(new Runnable() { // from class: X.AEg
            public static final String __redex_internal_original_name = "FriendsTabFragment$15$$ExternalSyntheticLambda1";

            /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
            @Override // java.lang.Runnable
            public final void run() {
                C9tv c9tv = C9tv.this;
                C9u3 c9u32 = c9u3;
                if (c9u32.AyJ() != C95a.A04) {
                    6BY AyI = c9u32.AyI();
                    if (AyI == null) {
                        AyI = 6BY.A02;
                    }
                    ImmutableList immutableList = AyI.A00.A00;
                    int size = immutableList == null ? 0 : immutableList.size();
                    int i = 0;
                    if (immutableList != null) {
                        int size2 = immutableList.size();
                        int i2 = 0;
                        while (i < size2) {
                            if (((MontageBucketPreview) immutableList.get(i)).A09) {
                                i2++;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    ((6Bf) c9tv.A00.A0C.get()).A02(size, i);
                }
                ?? r0 = c9tv.A00;
                if (r0.mDetached) {
                    return;
                }
                C9bz c9bz = (C9bz) r0.A0s.get();
                7zS.A1H(c9bz.A02);
                if ("contacts".equals(c9bz.A00)) {
                    0fH.A0j("MainSectionsPerformanceLogger", "Adding intermediate note to current marker with action DATA_LOAD_END");
                    7zP.A0e(c9bz.A04).markerPoint(5505121, 0Pz.A0W("contacts", "_data_loaded"));
                }
                r0.A0K = c9u32;
                FriendsTabFragment.A09(r0);
            }
        });
    }
}
