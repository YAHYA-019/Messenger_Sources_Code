package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.polling.datamodels.PollingPublishedOption;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.Am1, reason: case insensitive filesystem */
/* loaded from: Am1.class */
public final class C1582Am1 extends 1pK implements DF4, DF3 {
    public static final String __redex_internal_original_name = "PollVotersLithoFragment";
    public 2O4 A00;
    public LithoView A01;
    public 6Je A02;
    public 1F9 A03;
    public ThreadKey A04;
    public PollingPublishedOption A05;
    public MigColorScheme A06 = LightColorScheme.A00();
    public String A07;

    public 1iF A1R() {
        return AbF.A0C(303710824046315L);
    }

    @Override // X.DF4
    public void CQW(ThreadViewColorScheme threadViewColorScheme) {
        MigColorScheme migColorScheme = threadViewColorScheme.A0F;
        if (Objects.equal(this.A06, migColorScheme)) {
            return;
        }
        this.A06 = migColorScheme;
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1503270945);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A01 = new LithoView(AbI.A0P(this));
        this.A07 = bundle2.getString("poll_id");
        this.A05 = (PollingPublishedOption) AbG.A07(bundle2, "poll_published_option");
        int i = Build.VERSION.SDK_INT;
        this.A03 = (1F9) (i >= 33 ? bundle2.getSerializable("folder_name", 1F9.class) : bundle2.getSerializable("folder_name"));
        this.A04 = (ThreadKey) (i >= 34 ? bundle2.getParcelable("thread_key", ThreadKey.class) : bundle2.getParcelable("thread_key"));
        LithoView lithoView = this.A01;
        0FI.A08(-1897272639, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0399 A[Catch: all -> 0x0460, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0460, blocks: (B:53:0x038d, B:56:0x0399, B:58:0x03c9, B:62:0x0423, B:72:0x03d4, B:75:0x03e0, B:77:0x03f5, B:79:0x0416), top: B:52:0x038d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03d4 A[Catch: all -> 0x0460, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0460, blocks: (B:53:0x038d, B:56:0x0399, B:58:0x03c9, B:62:0x0423, B:72:0x03d4, B:75:0x03e0, B:77:0x03f5, B:79:0x0416), top: B:52:0x038d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1582Am1.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
