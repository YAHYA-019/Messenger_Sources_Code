package X;

import com.facebook.messaging.cowatch.launcher.parameters.CoWatchLauncherParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.messaging.threadview.params.ThreadAndMaybeMessage;
import com.facebook.messaging.threadview.params.ThreadPreviewParams;
import com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import java.util.List;

/* renamed from: X.6el, reason: invalid class name */
/* loaded from: 6el.class */
public final class C6el {
    public int A00;
    public int A01;
    public long A03;
    public CoWatchLauncherParams A04;
    public ThreadKey A05;
    public NavigationTrigger A06;
    public MessageDeepLinkInfo A07;
    public ThreadAndMaybeMessage A08;
    public ThreadPreviewParams A09;
    public ThreadViewMessagesInitParams A0A;
    public C6en A0B;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public List A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public 5SW A0C = 5SW.A1M;
    public boolean A0X = false;
    public long A02 = 0;
    public boolean A0R = false;
    public boolean A0Q = false;
    public boolean A0S = false;
    public boolean A0T = false;

    public void A00(ThreadKey threadKey) {
        threadKey.getClass();
        this.A05 = threadKey;
    }

    public void A01(ThreadViewParams threadViewParams) {
        this.A05 = threadViewParams.A05;
        this.A0C = threadViewParams.A0C;
        this.A0A = threadViewParams.A0A;
        this.A06 = threadViewParams.A06;
        this.A07 = threadViewParams.A07;
        this.A04 = threadViewParams.A04;
        this.A01 = threadViewParams.A02;
        this.A0X = threadViewParams.A0X;
        this.A02 = threadViewParams.A03;
        this.A0R = threadViewParams.A0R;
        this.A0Q = threadViewParams.A0Q;
        this.A0S = threadViewParams.A0S;
        this.A0T = threadViewParams.A0T;
        this.A0B = threadViewParams.A0B;
        this.A0P = threadViewParams.A0P;
        this.A0D = threadViewParams.A0D;
        this.A09 = threadViewParams.A09;
        this.A08 = threadViewParams.A08;
        this.A0V = threadViewParams.A0V;
        this.A0L = threadViewParams.A0L;
        this.A0M = threadViewParams.A0M;
        this.A03 = threadViewParams.A00;
        this.A0U = threadViewParams.A0U;
        this.A00 = threadViewParams.A01;
        this.A0E = threadViewParams.A0E;
        this.A0F = threadViewParams.A0F;
        this.A0G = threadViewParams.A0G;
        this.A0I = threadViewParams.A0I;
        this.A0H = threadViewParams.A0H;
        this.A0J = threadViewParams.A0J;
        this.A0K = threadViewParams.A0K;
        this.A0O = threadViewParams.A0O;
        this.A0N = threadViewParams.A0N;
    }

    public void A02(5SW r302) {
        r302.getClass();
        this.A0C = r302;
    }
}
