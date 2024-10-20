package X;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;

/* loaded from: Faz.class */
public final class Faz implements GE8 {
    public final /* synthetic */ I4p A00;
    public final /* synthetic */ HxC A01;

    public Faz(I4p i4p, HxC hxC) {
        this.A00 = i4p;
        this.A01 = hxC;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001e. Please report as an issue. */
    @Override // X.GE8
    public final void C8S(String str, Bundle bundle) {
        EPG epg;
        G2N g2o;
        EPG epg2;
        I4p i4p = this.A00;
        HxC hxC = this.A01;
        Handler handler = (Handler) 1Bn.A0A(16430);
        switch (str.hashCode()) {
            case -971191021:
                if (str.equals("bk.action.navigation.ResumeStoryViewer")) {
                    epg = EPG.A04;
                    g2o = new G2O(epg, i4p);
                    handler.post(g2o);
                    return;
                }
                return;
            case 361006941:
                if (str.equals("bk.action.navigation.CloseScreen")) {
                    MontageViewerFragment montageViewerFragment = hxC.A00;
                    HGG hgg = montageViewerFragment.A0L;
                    if (hgg != null) {
                        hgg.A09();
                    }
                    MontageViewerFragment.A0X(montageViewerFragment, true);
                    return;
                }
                return;
            case 1246727742:
                if (str.equals("bk.action.bloks.DismissBottomSheet")) {
                    epg = EPG.A03;
                    g2o = new G2O(epg, i4p);
                    handler.post(g2o);
                    return;
                }
                return;
            case 1457845398:
                if (str.equals("bk.action.bloks.OpenBottomSheet")) {
                    epg2 = EPG.A03;
                    g2o = new G2N(epg2, i4p);
                    handler.post(g2o);
                    return;
                }
                return;
            case 1587159128:
                if (str.equals("bk.action.navigation.PauseStoryViewer")) {
                    epg2 = EPG.A04;
                    g2o = new G2N(epg2, i4p);
                    handler.post(g2o);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
