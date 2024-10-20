package X;

import android.content.Intent;
import com.facebook.messaging.business.bmcconversionfoundations.pdp.params.PdpInitParams;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.mdotme.model.PlatformRefParams;
import com.facebook.messaging.communitymessaging.adminonboarding.hintcard.HintCardParams;
import com.facebook.messaging.composer.params.ComposerInitParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.GroupThreadAssociatedFbGroup;
import com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams;

/* renamed from: X.Abh, reason: case insensitive filesystem */
/* loaded from: Abh.class */
public final class C1239Abh {
    public Intent A00;
    public PdpInitParams A01;
    public CallToActionContextParams A02;
    public CallToAction A03;
    public PlatformRefParams A04;
    public HintCardParams A05;
    public ComposerInitParams A06;
    public ThreadKey A07;
    public GroupThreadAssociatedFbGroup A08;
    public BLU A09;
    public C5ap A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public ThreadViewMessagesInitParams A00() {
        if (this.A0B != null) {
            boolean z = true;
            02W.A05(AnonymousClass001.A1U(this.A06));
            02W.A05(AnonymousClass001.A1U(this.A0G));
            02W.A05(AnonymousClass001.A1U(this.A00));
            02W.A05(AnonymousClass001.A1U(this.A09));
            02W.A05(AnonymousClass001.A1U(this.A04));
            02W.A05(AnonymousClass001.A1U(this.A03));
            02W.A05(AnonymousClass001.A1U(this.A02));
            02W.A05(AnonymousClass001.A1U(this.A0E));
            02W.A05(AnonymousClass001.A1U(this.A0F));
            if (this.A07 != null) {
                z = false;
            }
            02W.A05(z);
        }
        return new ThreadViewMessagesInitParams(this);
    }

    public void A01(Integer num) {
        this.A0B = num;
    }
}
