package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersivefeatures.storiestray.plugins.tray.contentview.HTImmersiveStoriesTrayViewImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function2;

/* loaded from: AVi.class */
public final class AVi extends C00q implements Function2 {
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ C0dr $monotonicClock;
    public final /* synthetic */ C2lh $montageListItem;
    public final /* synthetic */ ImmutableList $montageViewModelList;
    public final /* synthetic */ int $numOfCols;
    public final /* synthetic */ C9tz $trayLoader;
    public final /* synthetic */ C8u5 this$0;
    public final /* synthetic */ HTImmersiveStoriesTrayViewImplementation this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVi(FbUserSession fbUserSession, C0dr c0dr, C2lh c2lh, HTImmersiveStoriesTrayViewImplementation hTImmersiveStoriesTrayViewImplementation, C9tz c9tz, C8u5 c8u5, ImmutableList immutableList, int i) {
        super(2);
        this.this$0 = c8u5;
        this.$numOfCols = i;
        this.this$1 = hTImmersiveStoriesTrayViewImplementation;
        this.$montageViewModelList = immutableList;
        this.$fbUserSession = fbUserSession;
        this.$monotonicClock = c0dr;
        this.$trayLoader = c9tz;
        this.$montageListItem = c2lh;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C9sl c9sl = (C9sl) obj;
        C9ci c9ci = (C9ci) obj2;
        11T.A0F(c9sl, 0);
        MigColorScheme migColorScheme = (MigColorScheme) ((9X8) this.this$0).A00.getValue();
        11T.A0D(c9ci);
        int i = this.$numOfCols;
        HTImmersiveStoriesTrayViewImplementation hTImmersiveStoriesTrayViewImplementation = this.this$1;
        C9tz c9tz = this.$trayLoader;
        9wN r0 = new 9wN(this.$fbUserSession, this.$montageListItem, c9sl, hTImmersiveStoriesTrayViewImplementation, c9tz);
        long j = HTImmersiveStoriesTrayViewImplementation.A0A;
        AZg aZg = hTImmersiveStoriesTrayViewImplementation.A05;
        int indexOf = this.$montageViewModelList.indexOf(c9ci);
        return new 8eQ(this.$fbUserSession, this.$monotonicClock, c9ci, r0, migColorScheme, aZg, AnonymousClass001.A0u(), i, indexOf);
    }
}
