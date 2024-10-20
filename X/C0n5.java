package X;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import java.util.ArrayList;

/* renamed from: X.0n5, reason: invalid class name */
/* loaded from: 0n5.class */
public final class C0n5 implements C07r {
    public final int A00;
    public final Object A01;

    public C0n5(06Z r302, int i) {
        this.A00 = i;
        this.A01 = r302;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C07r
    public /* bridge */ /* synthetic */ void Bho(Object obj) {
        String str;
        String str2;
        StringBuilder A0k;
        String str3;
        String str4;
        ActivityResult activityResult;
        int i;
        Fragment A04;
        switch (this.A00) {
            case 0:
                java.util.Map map = (java.util.Map) obj;
                map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                arrayList.size();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2);
                }
                06Z r0 = (06Z) this.A01;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) r0.A08.pollFirst();
                str = "FragmentManager";
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    A0k = AnonymousClass001.A0k();
                    str4 = "No permissions were requested for ";
                    A0k.append(str4);
                    A0k.append(this);
                    android.util.Log.w(str, A0k.toString());
                    return;
                }
                str2 = fragmentManager$LaunchedFragmentInfo.A01;
                if (r0.A0T.A04(str2) == null) {
                    A0k = AnonymousClass001.A0k();
                    str3 = "Permission request result delivered for unknown Fragment ";
                    A0k.append(str3);
                    A0k.append(str2);
                    android.util.Log.w(str, A0k.toString());
                    return;
                }
                return;
            case 1:
                activityResult = (ActivityResult) obj;
                06Z r02 = (06Z) this.A01;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) r02.A08.pollLast();
                str = "FragmentManager";
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    A0k = AnonymousClass001.A0k();
                    str4 = "No Activities were started for result for ";
                    A0k.append(str4);
                    A0k.append(this);
                    android.util.Log.w(str, A0k.toString());
                    return;
                }
                str2 = fragmentManager$LaunchedFragmentInfo2.A01;
                i = fragmentManager$LaunchedFragmentInfo2.A00;
                A04 = r02.A0T.A04(str2);
                if (A04 == null) {
                    A0k = AnonymousClass001.A0k();
                    str3 = "Activity result delivered for unknown Fragment ";
                    A0k.append(str3);
                    A0k.append(str2);
                    android.util.Log.w(str, A0k.toString());
                    return;
                }
                A04.onActivityResult(i, activityResult.A00, activityResult.A01);
                return;
            default:
                activityResult = (ActivityResult) obj;
                06Z r03 = (06Z) this.A01;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) r03.A08.pollFirst();
                str = "FragmentManager";
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    A0k = AnonymousClass001.A0k();
                    str4 = "No IntentSenders were started for ";
                    A0k.append(str4);
                    A0k.append(this);
                    android.util.Log.w(str, A0k.toString());
                    return;
                }
                str2 = fragmentManager$LaunchedFragmentInfo3.A01;
                i = fragmentManager$LaunchedFragmentInfo3.A00;
                A04 = r03.A0T.A04(str2);
                if (A04 == null) {
                    A0k = AnonymousClass001.A0k();
                    str3 = "Intent Sender result delivered for unknown Fragment ";
                    A0k.append(str3);
                    A0k.append(str2);
                    android.util.Log.w(str, A0k.toString());
                    return;
                }
                A04.onActivityResult(i, activityResult.A00, activityResult.A01);
                return;
        }
    }
}
